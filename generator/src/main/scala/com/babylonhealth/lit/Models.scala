package com.babylonhealth.lit

import java.io.File

import com.babylonhealth.lit.common.CodegenUtils
import com.babylonhealth.lit.core.{ NonEmptyLitSeq, UriStr }
import com.babylonhealth.lit.hl7.BINDING_STRENGTH
import com.babylonhealth.lit.hl7.model.{ ElementDefinition, StructureDefinition }

case class TargetContents(filepath: String, contents: String)

case class DAG[T](parent: T, children: Vector[DAG[T]]) {
  def flattenParentsFirst: Vector[T] = Option(parent).toVector ++ children.flatMap(_.flattenParentsFirst)
}
object DAG {
  def fromList[T](els: Vector[T], isParent: (T, T) => Boolean, parent: Option[T] = None): DAG[T] = {
    def recursiveAddElements(acc: DAG[T], nextElems: Vector[T]): DAG[T] =
      if (nextElems.isEmpty) acc
      else {
        val next +: rest = nextElems
        // TODO: Slices are different, right?
        acc.children.find(c => isParent(c.parent, next)) match {
          case None if acc.parent == null =>
            recursiveAddElements(acc.copy(children = acc.children :+ DAG(next, Vector.empty)), rest)
          case None if isParent(acc.parent, next) =>
            recursiveAddElements(acc.copy(children = acc.children :+ DAG(next, Vector.empty)), rest)
          case None if isParent(next, acc.parent) =>
            recursiveAddElements(DAG(next, Vector(acc)), rest)
          case None => ???
          //              throw UnprocessableEntityException(s"I don't know how this happened! Couldn't add ${next} to ${acc.parent}")
          case Some(v) =>
            val otherChildren = acc.children.filterNot(_ eq v)
            recursiveAddElements(acc.copy(children = otherChildren :+ recursiveAddElements(v, Vector(next))), rest)
        }
      }

    recursiveAddElements(DAG[T](parent.getOrElse(null.asInstanceOf[T]), Vector.empty), els.filterNot(_ == null))
  }
}

case class CodeEnum(stringValue: String, name: Option[String], system: Option[UriStr]) {
  val legitNameReg = s"^[a-zA-Z][a-zA-Z0-9_]*$$".r
  def shoutyCamelName: Option[String] =
    name.map(_.map(_.toUpper).trim.replaceAll("[\\s.-]+", "_").replaceAll("'", "")).filter(legitNameReg.matches)
  def getName: String =
    if (legitNameReg.matches(stringValue)) stringValue.toUpperCase
    else {
      val candidate = shoutyCamelName getOrElse stringValue.toUpperCase
        .replaceAll("-", "_")
        .replaceAll("[^A-Z0-9_]", "")
      if (!legitNameReg.matches(candidate)) s"`$stringValue`"
      else candidate
    }
}

case class CodeValueSet(
    valueSet: String,
    url: Option[UriStr],
    version: Option[String],
    binding: BINDING_STRENGTH,
    codes: NonEmptyLitSeq[CodeEnum],
    systemIncludes: Seq[UriStr],
    systemExcludes: Seq[UriStr]
)

case class BaseField(
    name: String,
    types: Seq[String],
    default: Option[String],
    cardinality: Cardinality,
    isGenerated: Boolean,
    className: String,
    parent: Option[BaseField],
    childFields: Seq[BaseField],
    declaringClasses: Seq[String],
    valueEnumeration: Option[CodeValueSet],
    el: ElementDefinition,
    pkg: String,
    // should be one of BackboneElement, Element, but can't build the bookkeeping that way because of the mutual recursion
    base: Option[TopLevelClass] = None
) {
  def sameType(that: BaseField): Boolean = that.types == types && that.cardinality == cardinality
  def latestBaseWith(prop: BaseField => Boolean): Option[BaseField] =
    if (prop(this)) Some(this) else parent.flatMap(_.latestBaseWith(prop))
  def firstBase: Option[BaseField] = parent.map(p => p.firstBase getOrElse p)
  val squareReg                    = "(.+)\\[x\\]".r
  def noParensName = name match {
    case squareReg(n) => n
    case n            => n
  }
  def capitalName   = noParensName.capitalize
  val backtickRegex = """`(.+)`""".r
  def javaName: String = CodegenUtils.fieldJavaName(noParensName)
  def scalaClassName: String = CodegenUtils.profileScalaName(className)
  def getAllEnumerations: Map[String, CodeValueSet] =
    valueEnumeration.map(x => x.valueSet -> x).toMap ++ childFields.flatMap(_.getAllEnumerations)

}

object EnumerationUtils {
  val valueSetReg = """^https?://.+/ValueSet/([a-zA-Z0-9-]*)(?:\|.*$|$)""".r
  def valueSetToEnumName(vs: String): String = vs match {
    case valueSetReg(x) => x.replaceAll("-", "_").toUpperCase
  }
}
case class TopLevelClasses(
    classes: Map[String, Map[String, TopLevelClass]]
) {
  def get(className: String, pkg: Option[String] = None): TopLevelClass = getI(className, pkg) getOrElse sys.exit(1)
  def getI(className: String, pkg: Option[String] = None): Option[TopLevelClass] = classes(className) match {
    case empty if empty.isEmpty            => println(s"can't find any ${className}"); None
    case one if one.size == 1              => Some(one.head._2)
    case many if pkg.exists(many.contains) => many.get(pkg.get)
    case many                              => println(s"Found too many ${className} in packages ${many.map(_._1).mkString(" &")}"); None
  }
}
case class TopLevelClass(
    fields: Seq[BaseField],
    url: String,
    parentClass: Option[TopLevelClass],
    className: String,
    typeName: String,
    rawStructureDefinition: StructureDefinition,
    valueSets: Map[String, CodeValueSet],
    targetDir: String
) {
  def isProfile: Boolean = typeName != className

  def scalaClassName: String     = CodegenUtils.profileScalaName(className)
  def scalaBaseClassName: String = CodegenUtils.profileScalaName(typeName)
}

sealed trait Cardinality {
  def min: Int
  def max: Int
}

object Cardinality {

  def apply(min: Int, maxString: String): Option[Cardinality] =
    for {
      max: Int <- maxString match {
        case "*" => Some(Int.MaxValue)
        case x   => x.toIntOption
      }
      if min <= max
    } yield Cardinality(min, max)

  def apply(min: Int, max: Int): Cardinality =
    (min, max) match {
      case (0, 0)          => Zero
      case (0, 1)          => Optional
      case (1, 1)          => One
      case (x, _) if x > 0 => AtLeastOne
      case (_, _)          => Many
    }

  // TODO: Zero is usually represented as Seq[T] right now, can change later
  /** Represents 0..0 cardinality, should be omitted * */
  case object Zero extends Cardinality {
    def min: Int = 0
    def max: Int = 0
  }

  /** Represents 0..1 cardinality, should be some optional/nullable type * */
  case object Optional extends Cardinality {
    def min: Int = 0
    def max: Int = 1
  }

  /** Represents 1..1 cardinality, should be just the value alone * */
  case object One extends Cardinality {
    def min: Int = 1
    def max: Int = 1
  }

  /** Represents x..y cardinality where x > 0, should be some non-empty list type * */
  case object AtLeastOne extends Cardinality {
    def min: Int = 1
    def max: Int = Int.MaxValue
  }

  /** Represents 0..y cardinality where y > 1, should be some list type * */
  case object Many extends Cardinality {
    def min: Int = 0
    def max: Int = Int.MaxValue
  }
}

case class ClassGenInfo(fileContents: String, fileName: String, pkg: String)

case class JavaClassGenInfo(builders: Seq[ClassGenInfo], codes: Seq[ClassGenInfo])

case class AllGeneratedFiles(
    scalaClassGenInfo: Seq[ClassGenInfo],
    javaClassGenInfo: JavaClassGenInfo,
    typescriptClassGenInfo: Option[Seq[ClassGenInfo]])

case class ElementWithSlices(
    el: ElementDefinition,
    slices: Seq[DAG[ElementWithSlices]]
)

case class SourceFile(targetModule: String, file: File)

case class ModuleDependencies(decls: Seq[(String, String)]) {
  // TODO this is a really scrappy impl...
  def expand(decls: Seq[(String, String)], agg: Seq[(String, String)] = Nil): Seq[(String, String)] =
    if (decls.isEmpty) agg
    else {
      val (nextP, nextC) +: rest = decls
      val (parentChains, rest1)  = agg.partition(_._2 == nextP)
      val (childChains, rest2)   = rest1.partition(_._1 == nextC)
      val newChains1 = parentChains.flatMap { case (l, `nextP`) =>
        (childChains.map(_._2) :+ nextC :+ nextP).map(l -> _)
      }
      val newChains2 = childChains.flatMap { case (`nextC`, r) => Seq(nextC -> r, nextP -> r) }
      expand(rest, (newChains1 ++ newChains2 ++ rest2 :+ (nextP -> nextC)).distinct)
    }
  val expanded: Set[(String, String)] = expand(decls).toSet
  def isChild(child: String, parent: String): Boolean = (child, parent) match {
    case (_, "core")               => true
    case (x, "hl7") if x != "core" => true
    case (c, p)                    => expanded(p, c)
  }
  def getParents(s: String): Set[String] = s match {
    case "core" => Set("core")
    case "hl7"  => Set("core", "hl7")
    case x      => Set("core", "hl7") ++ expanded.filter(_._2 == x).map(_._1)
  }

  def leastCommon(m: Set[String]): String = {
    if (m.size == 1) m.head
    else if (m.contains("core")) "core"
    else if (m.contains("hl7")) "hl7"
    else if (m.size == 2) {
      val Seq(l, r) = m.toSeq
      if (isChild(l, r)) r
      else if (isChild(r, l)) l
      else "hl7"
    } else "hl7"
  }
}

case class ValueSetDecls(flat: Seq[(String, String, CodeValueSet)]) {
  val byPackage: Map[String, Seq[(String, CodeValueSet)]] =
    flat.groupBy(_._1).view.mapValues { vs => vs.map { case (_, n, vs) => n -> vs } }.toMap
  val byName: Map[String, Seq[(String, CodeValueSet)]] =
    flat.groupBy(_._2).view.mapValues { vs => vs.map { case (p, _, vs) => p -> vs } }.toMap
  val byEnum: Map[String, Seq[(String, CodeValueSet)]] =
    flat
      .groupBy(t => EnumerationUtils.valueSetToEnumName(t._2))
      .view
      .mapValues { vs => vs.map { case (p, _, vs) => p -> vs } }
      .toMap

  def earliestDeclarations(moduleDependencies: ModuleDependencies): ValueSetDecls =
    ValueSetDecls(byName.map { case (name, m) =>
      (moduleDependencies.leastCommon(m.map(_._1).toSet), name, m.head._2)
    }.toSeq)
  def stripVersions: ValueSetDecls = ValueSetDecls(flat.map { case (p, n, vs) => (p, n.split('|').head, vs) })
}
