package com.babylonhealth.lit.languages

import scala.collection.immutable.ListMap
import scala.util.Try

import com.babylonhealth.lit._
import com.babylonhealth.lit.Cardinality._
import com.babylonhealth.lit.CardinalityImplicits._
import com.babylonhealth.lit.common.CodegenUtils
import com.babylonhealth.lit.hl7.BINDING_STRENGTH
import com.babylonhealth.lit.fhirpath.genScala.ExactlyOne

trait BaseFieldImplicits {
  implicit class RichTopLevelClass(topLevelClass: TopLevelClass) {
    def modifiedFields: Seq[BaseField] = {
      topLevelClass.fields
        .filter(f =>
          f.cardinality != Zero && !(topLevelClass.parentClass.exists(
            _.className == "Extension") && f.scalaName == "url"))
        .map { bf =>
          val default: Option[String] = // TODO Should this list include parents? Should it have a priority ordering?
            if (bf.scalaName == "meta" && bf.types == Seq("Meta") && topLevelClass.isProfile)
              Some(bf.cardinality.wrapValue(s"""new Meta(profile = LitSeq("${topLevelClass.url}"))"""))
            else bf.cardinality.defaultValue
          bf.copy(default = default)
        }
    }
  }
  implicit class RichBaseField(baseField: BaseField) {
    def scalaName: String = CodegenUtils.fieldScalaName(baseField.noParensName)

    def choiceAlias: Option[String] = {
      val baseString = ElementTreee.getUnionAlias(baseField.pkg, baseField.types)
      if (baseString.matches("Union.+")) {
        Some(s"${baseField.capitalName}Choice")
      } else None
    }

    private def wrapInit(s: Seq[String], clashingClasses: Set[String], wrapInRef: Boolean = true): String = {
      val declaringClass = baseField.firstBase.getOrElse(baseField).scalaClassName
      val baseString     = ElementTreee.getUnionAlias(baseField.pkg, s)
      val inRef =
        if (baseString.matches("Union.+") && wrapInRef) s"${baseField.scalaClassName}.${choiceAlias.get}"
        else if (baseString.matches("Union.+")) baseString
        else if (baseField.isGenerated) s"$declaringClass.$baseString"
        else if (baseField.types.head == "Code") {
          if (baseField.valueEnumeration.isDefined)
            EnumerationUtils.valueSetToEnumName(baseField.valueEnumeration.get.valueSet)
          else {
            baseField.latestBaseWith(_.valueEnumeration.isDefined) match {
              case Some(base) => EnumerationUtils.valueSetToEnumName(base.valueEnumeration.get.valueSet)
              case None =>
                if (!baseField.isGenerated && clashingClasses("Code")) "com.babylonhealth.lit.core.Code" else "Code"
            }
          }
        } else if (!baseField.isGenerated && clashingClasses(baseString)) baseString match {
          case "UnsignedInt" | "PositiveInt" | "Base64Binary" | "Canonical" | "Code" | "Id" | "Markdown" | "OID" |
              "UriStr" | "UrlStr" | "XHTML" =>
            s"com.babylonhealth.lit.core.$baseString"
          case x => s"core.model.$x" // TODO: This isn't sound
        }
        else baseString
      inRef
    }

    private def wrap(s: Seq[String], clashingClasses: Set[String]): String = {
      val init = wrapInit(s, clashingClasses)
      baseField.cardinality.wrapType(init)
    }

    def typeForClass(clashingClasses: Set[String] = Set.empty) =
      wrap(baseField.types, clashingClasses)

    def `type`: String = typeForClass()

    def baseCardinality: Cardinality = baseField.firstBase.map(_.cardinality) getOrElse baseField.cardinality

    def fieldMeta(clashingClasses: Set[String] = Set.empty): String = {
      val unwrappedType     = wrapInit(baseField.types, clashingClasses, wrapInRef = false)
      val disambiguatedType = typeForClass(clashingClasses)
      val isRef             = baseField.firstBase.exists(_.types.size > 1) || baseField.types.size > 1
      s"""val ${baseField.scalaName}: FHIRComponentFieldMeta[${disambiguatedType}] =
         | FHIRComponentFieldMeta("${baseField.noParensName}", lTagOf[${disambiguatedType}], $isRef, lTagOf[${unwrappedType}])""".stripMargin
    }

    def refineField(clashingClasses: Set[String], obj: String = "t"): String = {
      val tpe                 = wrapInit(baseField.types, clashingClasses)
      val convertedFromParent = baseCardinality.convertTo(baseField.cardinality)(s"$obj.${baseField.scalaName}")
      baseField.cardinality.applyFunction(convertedFromParent) { arg =>
        if (baseField.firstBase.forall(_.types.sizeCompare(baseField.types) == 0)) {
          arg
        } else if (baseField.types.size == 1) {
          if (baseField.types.head == "Code" && baseField.valueEnumeration.isDefined)
            s"$tpe.withName($arg.toSubRefNonUnion[Code])"
          else s"$arg.toSubRefNonUnion[$tpe]"
        } else {
          s"$arg.toSubRef"
        }
      }
    }

    def getField(clashingClasses: Set[String]): String = {
      val refinedField = refineField(clashingClasses)
      s"def extract${baseField.capitalName}(t: ${baseField.scalaClassName}): ${typeForClass(clashingClasses)} = $refinedField"
    }

    def field(clashingClasses: Set[String] = Set.empty): String = {
      val refinedField      = refineField(clashingClasses)
      val disambiguatedType = typeForClass(clashingClasses)
      val companionFieldName =
        baseField.declaringClasses match { // Unused, but convenient to demo disambiguation strategy
          case _ if !clashingClasses(baseField.scalaClassName) => s"${baseField.scalaClassName}.${baseField.scalaName}"
          case s if s.size < 2                                 => s"core.model.${baseField.scalaClassName}.${baseField.scalaName}"
          case s                                               => s"${s.takeRight(2).mkString(".")}.${baseField.scalaName}"
        }
      s"""FHIRComponentField[${disambiguatedType}](${baseField.scalaName}, $refinedField)"""
    }
  }
}

object ScalaCodegen extends BaseFieldImplicits with Commonish {
  def genComment(topLevelClass: TopLevelClass): String =
    s""""""
  def fieldDecoder(field: BaseField, allClashingTypes: Set[String]): String = {
    if (field.types.sizeCompare(1) > 0) {
      val tpe = ElementTreee.getUnionAlias(field.pkg, field.types)
      def wrap(s: String): String =
        s"""${field.cardinality.cursorDecodeRef}[$tpe]("$s")"""
      wrap(field.scalaName)
    } else {
      val suffix = if (field.firstBase.exists(_.types.sizeCompare(1) > 0)) {
        ElementTreee.lookupSuffixByType(field.types.head)
      } else {
        ""
      }

      // Choose the decoding method, based on both the cardinality and the base cardinality. This is because the json
      // serialization format is determined by the cardinality of the base class (e.g. a Cholesterol referenceRange only
      // has one referenceRange, but an Observation, which it is derived from, can have many, so the json repr will use an array)
      val decodingMethod =
        if (field.baseCardinality.max > 1 && field.cardinality.max <= 1) "decodeFromListAs" else "decodeAs"

      val default = field.cardinality.defaultValue

      s"""cursor.$decodingMethod[${field.typeForClass(allClashingTypes)}]("${field.noParensName}$suffix", $default)"""
    }
  }

  def commonScalaHead(
      packagesWithNewTypes: Set[String],
      moduleDependencies: ModuleDependencies,
      packageStr: String,
      valueSetLookups: Seq[(String, String)]): String = {
    val parentPackages: Seq[String] = moduleDependencies.getParents(packageStr).toSeq
    val vs = valueSetLookups.groupBy(_._1).map { case (pkg, enum) =>
      if (enum.size == 1) s"import com.babylonhealth.lit.$pkg.${enum.head._2}"
      else s"import com.babylonhealth.lit.$pkg.{ ${enum.map(_._2).mkString(", ")} }"
    }
    val parentsAndSelf = (parentPackages :+ packageStr).distinct
    s"""package com.babylonhealth.lit.$packageStr.model
       |
       |import java.time.{ LocalDate, LocalTime, ZonedDateTime }
       |import java.util.UUID
       |
       |import scala.collection.immutable.TreeMap
       |import scala.util.{ Success, Try }
       |
       |import io.circe.{ Decoder, HCursor }
       |
       |import com.babylonhealth.lit.core._
       |import com.babylonhealth.lit.core.BaseFieldDecoders._
       |import com.babylonhealth.lit.core.UnionAliases._
       |import com.babylonhealth.lit.core.ChoiceImplicits._
       |import com.babylonhealth.lit.core.TagSummoners.lTagOf
       |import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
       |${parentPackages.map(p => s"import com.babylonhealth.lit.$p.model._").mkString("\n")}
       |${parentsAndSelf
      .filter(packagesWithNewTypes)
      .map(p => s"import com.babylonhealth.lit.$p.UnionAliases._")
      .mkString("\n")}
       |${vs.mkString("\n")}
       |import com.babylonhealth.lit.{ ${parentsAndSelf.mkString(", ")} }
       |import com.babylonhealth.lit.macros.POJOBoilerplate
       |
       |""".stripMargin
  }

  def enumDeclaration(forceDisplayName: Boolean = false)(valueSet: String, codes: CodeValueSet): String = {
    val enumName = EnumerationUtils.valueSetToEnumName(valueSet)
    val isExtensible: Boolean = codes.binding match {
      case BINDING_STRENGTH.EXAMPLE =>
        println(s"Shouldn't even be generating enums for an example binding, but tried to for $valueSet")
        sys.exit(1)
        ???
      case BINDING_STRENGTH.REQUIRED => false
      case _                         => true
    }
    def enumVal(v: CodeEnum) =
      s"""  case object ${if (forceDisplayName) v.shoutyCamelName.getOrElse(v.getName) else v.getName} extends $enumName("${v.stringValue}") {
      |   def display: Option[String] = ${v.name
        .map("Some(\"" + _.replaceAll("\\s*[\n\r]\\s*", " ").replaceAllLiterally("\"", "\\\"") + "\")")
        .getOrElse("None")}
      |   def system: Option[String] = ${v.system.map(s => s"""Some("$s")""") getOrElse "None"}
      |}"""
    val extraCase =
      if (!isExtensible) ""
      else
        s"""  case class Other_(s: String) extends $enumName(s) {
           |    def display: Option[String] = Some(s"Runtime value set extension ($$s)")
           |    def system: Option[String] = None
           |  }
           |  override def fallback = Other_.apply
           |""".stripMargin
    val decoderTrait = if (isExtensible) s"EnumWithFallback[$enumName]" else s"FhirCirceEnum[$enumName]"

    val reference = (codes.url, codes.version) match {
      case (Some(url), Some(version)) if Config.useVersionedReferencesForEnums => s"$url|$version"
      case (Some(url), _)                                                      => url
      case _                                                                   => valueSet
    }

    s"""
       |sealed abstract class $enumName(override val entryName: String) extends EnumEntry with Product with java.io.Serializable {
       |  def display: Option[String]
       |  def system: Option[String]
       |  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
       |}
       |object $enumName extends FhirEnum[$enumName] with $decoderTrait {
       |  val reference = "$reference"
       |  val values = findValues
       |${codes.codes.map(enumVal).sorted.mkString("\n")}
       |$extraCase}
       |""".stripMargin
  }

  def scalaStrForField(_field: BaseField, element: TopLevelClass, backboneElement: TopLevelClass): Option[String] =
    if (_field.isGenerated) {
      val baseTopClass: TopLevelClass = _field.el.`type`.map(_.code).head match {
        case "Element"         => element
        case "BackboneElement" => backboneElement
      }
      val field                    = _field.copy(base = Some(baseTopClass))
      val className: String        = field.capitalName
      val fields                   = field.childFields
      val recursiveClassDefs       = fields.map(scalaStrForField(_, element, backboneElement)).collect { case Some(d) => d }
      val recursiveClassDefsString = recursiveClassDefs.mkString("\n\n")
      val allClashingTypes = fields
        .filter(_.isGenerated)
        .map(_.scalaClassName)
        .toSet ++ field.declaringClasses + className
      def orideValPrefix(field: BaseField): String =
        baseTopClass.fields.find(_.name == field.name) match {
          case None                                                                    => "val "
          case Some(x) if x.types == field.types && x.cardinality == field.cardinality => "override val "
          case Some(_)                                                                 => ""
        }
      val fieldsString: String =
        fields
          .map { bf =>
            val oridePrefix = orideValPrefix(bf)
            val default     = bf.cardinality.defaultValue.map(v => s" = $v").getOrElse("")
            val locType     = bf.typeForClass(allClashingTypes)
            s"$oridePrefix${bf.scalaName}: $locType$default"
          }
          .mkString(
            "",
            ", ",
            ", override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts")
      val applyArgsStr: String =
        fields
          .map { bf =>
            val default = bf.cardinality.defaultValue.map(v => s" = $v").getOrElse("")
            val locType = bf.typeForClass(allClashingTypes)
            s"${bf.scalaName}: $locType$default"
          }
          .mkString(
            "",
            ",\n    ",
            ",\n    primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts")
      val applyImpl =
        s"""  def apply(
           |    $applyArgsStr
           |  ): $className = new $className(
           |    ${fields.map(_.scalaName).mkString(",\n    ")},
           |    primitiveAttributes = primitiveAttributes
           |  )""".stripMargin
      val eachFieldsMetaImpl =
        fields.filter(_.cardinality != Zero).map(_.fieldMeta(allClashingTypes)).mkString("\n    ")
      val fieldsMetaImpl =
        fields.map(_.scalaName).mkString("val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(", ", ", ")")
      val getFieldsImpl =
        s"""override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
           |override def fields(t: $className): Seq[FHIRComponentField[_]] = Seq(
           |  ${fields.map(_.field(allClashingTypes)).mkString(",\n  ")}
           |)""".stripMargin
      val choiceAliases = fields
        .filter(_.choiceAlias.isDefined)
        .map { f =>
          val choiceType = s"Choice[${ElementTreee.getUnionAlias(f.pkg, f.types)}]"
          s"type ${f.choiceAlias.get} = $choiceType"
        }
        .mkString("\n  ")
      def unapplyField(f: BaseField): String = f.refineField(allClashingTypes, "o")
      val unapplyImpl =
        if (fields.size <= 22) s"""def unapply(o: $className): Option[(${fields
          .map(f => f.typeForClass(allClashingTypes))
          .mkString(", ")})] = Some((${fields.map(unapplyField).mkString(", ")}))"""
        else ""

      val companionDef =
        s"""object $className extends CompanionFor[$className] {
           |  override type ResourceType = $className
           |  $recursiveClassDefsString
           |  $choiceAliases
           |  $applyImpl
           |  $unapplyImpl
           |  $eachFieldsMetaImpl
           |  $fieldsMetaImpl
           |  $getFieldsImpl
           |  val baseType: CompanionFor[$className] = this
           |  val thisName: String = "$className"
           |  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[$className] =
           |    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ => Try(
           |      new $className(
           |        ${fields.map(fieldDecoder(_, allClashingTypes)).mkString(",\n        ")},
           |        decodeAttributes(cursor)
           |      )
           |    ))
           |}""".stripMargin
      val baseName = field.el.`type`.map(_.code).head
      case class Foo(name: String, wrap: BaseField => String) {
        def wrapEquals(bf: BaseField) = s"${wrap(bf)} = ${wrap(bf)}"
      }
      val optWrap: BaseField => String = {
        case f: BaseField if f.cardinality == Zero     => "None"
        case f: BaseField if f.cardinality == One      => s"Some(${f.scalaName})"
        case f: BaseField if f.cardinality == Optional => f.scalaName
      }
      val seqWrap: BaseField => String = {
        case f: BaseField if f.cardinality == Zero       => "LitSeq()"
        case f: BaseField if f.cardinality == Optional   => s"${f.scalaName}.to(LitSeq)"
        case f: BaseField if f.cardinality == One        => s"LitSeq(${f.scalaName})"
        case f: BaseField if f.cardinality == AtLeastOne => f.scalaName
        case f: BaseField if f.cardinality == Many       => f.scalaName
      }
      val parentFields: ListMap[String, Foo] = baseName match {
        case "Element" => ListMap("id" -> Foo("id", optWrap), "extension" -> Foo("extension", seqWrap))
        case "BackboneElement" =>
          ListMap(
            "id"                -> Foo("id", optWrap),
            "extension"         -> Foo("extension", seqWrap),
            "modifierExtension" -> Foo("modifierExtension", seqWrap))
      }
      val extension =
        s"""extends $baseName(${parentFields.values
          .map(f => f.wrapEquals(fields.find(_.scalaName == f.name).get))
          .mkString(", ")})"""
      val classDef =
        s"""$companionDef
           |
           |@POJOBoilerplate
           |class $className($fieldsString) $extension""".stripMargin
      Some(classDef)
    } else None

  def genTheScalaForClass(
      topLevelClass: TopLevelClass,
      packageStr: String,
      element: TopLevelClass,
      backboneElement: TopLevelClass,
      allTopLevelElements: TopLevelClasses,
      moduleDependencies: ModuleDependencies,
      valueSetEarliestDeclarations: Seq[(String, String)],
      packagesWithNewTypes: Set[String]): ClassGenInfo = {
    val className: String = topLevelClass.scalaClassName
    val fields            = topLevelClass.modifiedFields
    val otherClassDefs = fields.foldLeft("") { case (acc, next) =>
      val nextStr =
        if (next.parent.isEmpty) scalaStrForField(next, element, backboneElement).map(_ + "\n") getOrElse "" else ""
      s"$nextStr$acc"
    }
    def wrapIfParentIsOptional(f: BaseField): String = {
      val parentWasRefButThisAint = f.parent.map(_.types.size).exists(_ > 1) && f.types.size == 1
      val parentWasMoreReffy      = f.parent.map(_.types.size) exists (_ != f.types.size)

      val parentCard = f.parent.map(_.cardinality).getOrElse(f.cardinality)

      val reffedValue = f.cardinality.applyFunction(f.scalaName) { x =>
        if (parentWasRefButThisAint) {
          s"choice($x)"
        } else if (parentWasMoreReffy) {
          s"$x.toSuperRef"
        } else {
          x
        }
      }

      f.cardinality.convertTo(parentCard)(reffedValue)
    }
    val extension = topLevelClass.parentClass match {
      case None =>
        println(s"--> $className is a base class")
        " extends FHIRObject(primitiveAttributes = primitiveAttributes)"
      case Some(bd) =>
        val urlField =
          if (topLevelClass.parentClass.exists(_.className == "Extension")) Seq(s"""url = "${topLevelClass.url}"""")
          else Nil
        (bd.fields
          .flatMap(f => fields.find(_.scalaName == f.scalaName))
          .filter(f => f.parent.map(_.cardinality).getOrElse(f.cardinality) != Cardinality.Zero)
          .map { f =>
            val foo =
              if (f.parent.exists(_.cardinality != Zero) && f.cardinality == Zero) f.cardinality.defaultValue.get
              else wrapIfParentIsOptional(f)
            s"${f.scalaName} = $foo"
          } ++ urlField)
          .mkString(s" extends ${bd.scalaClassName}(", ", ", ", primitiveAttributes = primitiveAttributes)")
    }
    val allClashingTypes   = fields.filter(_.isGenerated).map(_.capitalName).toSet
    val eachFieldsMetaImpl = fields.map(f => f.fieldMeta(allClashingTypes)).mkString("\n    ")
    val fieldsMetaImpl =
      fields.map(_.scalaName).mkString("val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(", ", ", ")")
    val getFieldsImpl = if (topLevelClass.typeName == topLevelClass.className)
      s"""override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
         |override def fields(t: $className): Seq[FHIRComponentField[_]] = Seq(
         |  ${fields.map(f => f.field(allClashingTypes)).mkString(",\n    ")}
         |)""".stripMargin
    else
    s"""override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(Seq(
       |  ${fields.map(f => f.field(allClashingTypes)).mkString(",\n    ")}
       |))
       |override def fields(t: $className): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get""".stripMargin

    def extractFieldsImpl                  = fields.map(f => f.getField(allClashingTypes)).mkString("\n    ")
    def unapplyField(f: BaseField): String = f.refineField(allClashingTypes, "o")
    val unapplyImpl =
      if (fields.size <= 22) s"""def unapply(o: $className): Option[(${fields
        .map(f => f.typeForClass(allClashingTypes))
        .mkString(", ")})] = Some((${fields.map(unapplyField).mkString(", ")}))"""
      else ""

    // scalafmt can't format the produced code for about 4-5 files
    val excludeFromScalafmt: Boolean = (fields.size > 45 || className == "MedicationKnowledge")
    val decodeImpl =
      s"""${if (excludeFromScalafmt) "// format: off" else ""}
         |  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[$className] =
         |    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ => Try(
         |      new $className(
         |        ${fields.map(fieldDecoder(_, allClashingTypes)).mkString(",\n        ")},
         |        decodeAttributes(cursor)
         |      )
         |    ))
         |  ${if (excludeFromScalafmt) "// format: on" else ""}""".stripMargin

    def orideValPrefix(field: BaseField): String =
      field.firstBase match {
        case None                                                                    => "val "
        case Some(x) if x.types == field.types && x.cardinality == field.cardinality => "override val "
        case Some(_)                                                                 => ""
      }
    val classFields: String = fields
      .map(f => s"${orideValPrefix(f)}${f.scalaName}: ${f.typeForClass()}${f.default.map(" = " + _).getOrElse("")}")
      .mkString(
        "",
        ",\n  ",
        ",\n  override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts")
    val applyArgsStr: String = fields
      .map(f => s"${f.scalaName}: ${f.typeForClass(allClashingTypes)}${f.default.map(" = " + _).getOrElse("")}")
      .mkString(
        "",
        ",\n    ",
        ",\n    primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts")
    val applyImpl =
      s"""  def apply(
         |    $applyArgsStr
         |  ): $className = new $className(
         |    ${fields.map(_.scalaName).mkString(",\n    ")},
         |    primitiveAttributes = primitiveAttributes
         |  )""".stripMargin
    val choiceAliases = fields
      .filter(_.choiceAlias.isDefined)
      .map { f =>
        val choiceType = s"Choice[${ElementTreee.getUnionAlias(f.pkg, f.types)}]"
        s"type ${f.choiceAlias.get} = $choiceType"
      }
      .mkString("\n  ")

    val parser = Try(new SimpleFHIRPathParser(topLevelClass, allTopLevelElements))
    parser.failed.foreach { t =>
      println("BAD STUFF::", t.getMessage)
      t.printStackTrace
    }
    val searchParameters: String = {
      val params: Iterable[String] = parser
        .flatMap { p =>
          val res = Try(p.bar)
          res.failed.foreach(t => println(s"""OTHER BAD STUFF::
              ${t.getClass}
              ${t.getMessage}
              ${t.getLocalizedMessage}
              ${t.getCause}
              ${t.getStackTrace.mkString("Array(", ", ", ")")}"""))
          res
        }
        .getOrElse(Map.empty)
        .flatMap { case (k, vs) =>
          val ok = vs
            .map { case ("obj", _) => ""; case (s, ExactlyOne) => s"Seq($s)"; case (s, _) => s"$s.toSeq" }
            .filter(_.nonEmpty)
          val v = ok.distinct.mkString(" ++\n ") // \n gives better resolution after autoformatting
          if (v.forall(_.isWhitespace)) Nil
          else
            Seq(s""" "$k" -> (obj => $v)""")
        }
      if (fields.forall(_.parent.isDefined))
        s"override val searchParams: Map[String, ${topLevelClass.scalaClassName} => Seq[Any]] = ${topLevelClass.parentClass.get.scalaClassName}.searchParams"
      // .asInstanceOf[Map[String, ${topLevelClass.scalaClassName} => Seq[Any]]
      else {
        if (params.isEmpty) ""
        else
          params.mkString(
            s"override val searchParams: Map[String, ${topLevelClass.scalaClassName} => Seq[Any]] = Map(\n",
            ",\n",
            "\n)")
      }
    }
    // comments
    val classDescription =
      topLevelClass.rawStructureDefinition.description
        .orElse(topLevelClass.parentClass.map(p =>
          s"Subtype of ${p.className}${p.rawStructureDefinition.description.map(d => s" (${d.head.toLower +: d.tail})")}"))
        .getOrElse(s"${className} has no description in its Structure Definition...")
    val subtypeOf = topLevelClass.parentClass.map(p =>
      s"\n  *  Subclass of [[${p.targetDir}.model.${p.scalaClassName}]]${p.rawStructureDefinition.description
        .map(d => s" ($d)")
        .getOrElse("")}\n  *  ") getOrElse ""
    val constructorComments = {
      val (oldFields, newFields) =
        topLevelClass.fields.partition(f => topLevelClass.parentClass.exists(_.fields.exists(_.name == f.name)))
      val oldFieldsWithParent = oldFields.map(f => f -> topLevelClass.parentClass.get.fields.find(_.name == f.name).get)
      val refinedTypes        = oldFieldsWithParent.filter { case (n, o) => n.types.size != o.types.size }
      val newlyRequired = oldFieldsWithParent.filter { case (n, o) =>
        Set[Cardinality](AtLeastOne, One)(n.cardinality) && Set[Cardinality](Optional, Many)(o.cardinality)
      }
      val forbidden = oldFieldsWithParent.filter { case (n, o) => n.cardinality == Zero && o.cardinality != Zero }
      val hardCoded =
        if (topLevelClass.parentClass.exists(_.className == "Extension"))
          oldFieldsWithParent.find(_._1.name == "url").toSeq
        else Nil
      s"@constructor ${if (newFields.isEmpty) s"Inherits all params from parent. "
      else s"Introduces the fields ${newFields.map(_.scalaName).mkString(", ")}. "}${if (refinedTypes.nonEmpty)
        s"\n  *              Refines the types of: ${refinedTypes.map(_._2.scalaName).mkString(", ")}. "
      else ""}${if (newlyRequired.nonEmpty)
        s"\n  *              Requires the following fields which were optional in the parent: ${newlyRequired.map(_._2.scalaName).mkString(", ")}. "
      else ""}${if (forbidden.nonEmpty) s"\n  *              Forbids the use of the following fields which were optional in the parent: ${forbidden.map(_._2.scalaName).mkString(", ")}. "
      else ""}${if (hardCoded.nonEmpty)
        s"\n  *              Hardcodes the value of the following fields: ${hardCoded.map(_._2.scalaName).mkString(", ")}. "
      else ""}"
    }
    def descFromTLC(f: BaseField, t: TopLevelClass): Option[String] =
      t.rawStructureDefinition.snapshot
        .flatMap(_.element.find(_.id.exists(_.matches(s"[^.]+\\.${f.noParensName}(\\[x\\])?"))))
        .flatMap(_.definition)
        .map(" - " + _)
    def getNearestDescription(f: BaseField, t: TopLevelClass): Option[String] =
      descFromTLC(f, t).orElse(t.parentClass.flatMap(p => getNearestDescription(f, p)))
    val paramsComments = topLevelClass.fields
      .filter(_.cardinality != Zero)
      .map { f =>
        val description = getNearestDescription(f, topLevelClass) getOrElse ""
        s"@param ${f.scalaName}$description"
      }
      .mkString("\n  * ")
    def clean(s: String): String = s.replaceAllLiterally("/*", "/\\*")
    val classComment: String =
      s"""
         |/** ${clean(classDescription)}
         |  * ${clean(subtypeOf)}
         |  * ${clean(constructorComments)}
         |  * ${clean(paramsComments)}
         |  */"""
    // build finally
    val fileStr =
      s"""object $className extends CompanionFor[$className] {
         |  override type ResourceType = ${topLevelClass.scalaBaseClassName}
         |  override val baseType: CompanionFor[ResourceType] = ${topLevelClass.scalaBaseClassName}
         |  override val profileUrl: Option[String] = Some("${topLevelClass.url}")
         |  $otherClassDefs
         |  $choiceAliases
         |  $applyImpl
         |  $eachFieldsMetaImpl
         |  $fieldsMetaImpl
         |  $getFieldsImpl
         |  $extractFieldsImpl
         |
         |  override val thisName: String = "$className"
         |  $searchParameters
         |
         |  $unapplyImpl
         |  $decodeImpl
         |}
         |$classComment
         |@POJOBoilerplate
         |class $className(
         |  $classFields
         |)$extension {
         |  override val thisTypeName: String = "${topLevelClass.typeName}"
         |}""".stripMargin.replaceAll("\\n(\\s*\\n)+", "\n")

    // TODO: _not_ my finest work.. would be better to do a proper structural check
    val valueSet: Seq[(String, String)] = valueSetEarliestDeclarations
      .filter(fileStr contains _._2)
      .groupBy(_._2)
      .toSeq
      .map {
        case (_, s) if s.size == 1 => s.head
        // TODO: Currently we don't handle shadowing of valuesets...
        case (x, s) => (moduleDependencies.leastCommon(s.map(_._1).toSet), x)
      }
    ClassGenInfo(
      commonScalaHead(packagesWithNewTypes, moduleDependencies, packageStr, valueSet) + fileStr,
      className,
      packageStr)
  }

  def getDecoderFn(s: String): String =
    s.toLowerCase() match {
      case "base64binary" | "canonical" | "code" | "id" | "markdown" | "oid" | "positiveint" | "unsignedint" | "uri" |
          "url" | "xhtml" =>
        val camelSuffix: String = s.head.toLower +: s.tail
        s"_ => ${camelSuffix}Decoder"
      case "boolean"  => "_ => Decoder.decodeBoolean"
      case "date"     => "_ => decodeFHIRDate"
      case "datetime" => "_ => decodeFHIRDateTime"
      case "decimal"  => "_ => Decoder.decodeBigDecimal"
      case "instant"  => "_ => decodeZonedDateTime"
      case "integer"  => "_ => Decoder.decodeInt"
      case "string"   => "_ => Decoder.decodeString"
      case "time"     => "_ => Decoder.decodeLocalTime"
      case "uuid"     => "_ => Decoder.decodeUUID"
      case _          => s"$s.decoder(_)"
    }
  def genValueSetFile(pkg: String, valueSets: Map[String, CodeValueSet]): ClassGenInfo = {
    println(
      s">> GENNING VALUE SETS FOR ${pkg}:\n${valueSets.size} valueSets, including: ${valueSets.keys.take(10).mkString(", ")}")
    ClassGenInfo(genEnums(pkg, valueSets), "valueset_enums", pkg)
  }
  def genPackageObjectFiles(
      moduleDependencies: ModuleDependencies,
      _unionAliases: Map[String, (Seq[String], Seq[String])]): Seq[ClassGenInfo] =
    _unionAliases
      .map { case (unionName, (pkgs, unionTypes)) =>
        (moduleDependencies.leastCommon(pkgs.toSet), unionName, unionTypes)
      }
      .groupBy(_._1)
      .map { case (pkg, unions) =>
        ClassGenInfo(genPackageObject(pkg, unions.map { case (_, b, c) => b -> c }.toMap), "package", pkg)
      }
      .toSeq

  def genPackageCore: String =
    """package com.babylonhealth.lit.core
      |
      |import java.time.{ LocalDate, LocalTime, ZonedDateTime }
      |import java.util.UUID
      |
      |import scala.collection.mutable.ArrayBuffer
      |import scala.concurrent.duration.Duration.Inf
      |import scala.concurrent.{ Await, Future, blocking }
      |import scala.jdk.CollectionConverters._
      |import scala.reflect.runtime.universe.ModuleSymbol
      |import scala.util.Try
      |import scala.collection.parallel.CollectionConverters._
      |
      |import enumeratum.{ CirceEnum, Enum, EnumEntry }
      |import io.circe.{ Decoder, Encoder }
      |import io.github.classgraph.{ ClassGraph, ClassInfo, ScanResult }
      |import izumi.reflect.macrortti.{ LTag, LightTypeTag }
      |import org.slf4j.{ Logger, LoggerFactory }
      |
      |import com.babylonhealth.lit.core.BaseFieldDecoders._
      |import com.babylonhealth.lit.core.TagSummoners.{ lTagOf, lTypeOf }
      |import com.babylonhealth.lit.core.serdes.objectDecoder
      |import com.babylonhealth.lit.core.model._
      |
      |
      |case class DecoderAndTag[T](decoder: DecoderParams => Decoder[T], typeTag: LTag[T]) {
      |  type Type = T
      |}
      |
      |import BaseFieldDecoders._
      |
      |package object model {
      |  def extractCompanionsFromPath(classPathResults: Seq[ClassInfo]): Seq[CompanionFor[_ <: FHIRObject]] = {
      |    import scala.concurrent.ExecutionContext.Implicits.global
      |    Await
      |      .result(
      |        Future.traverse(classPathResults) { c =>
      |          Future successful {
      |            val companionObj: CompanionFor[_ <: FHIRObject] = {
      |              val klass = Class.forName(c.getName)
      |              val module = Utils.mirror.classSymbol(klass).companion.asInstanceOf[ModuleSymbol]
      |              val instance = Utils.mirror.reflectModule(module).instance.asInstanceOf[CompanionFor[_ <: FHIRObject]]
      |              instance
      |            }
      |            companionObj
      |          }
      |        },
      |        Inf
      |      )
      |  }
      |  lazy val companionLookup: Map[String, CompanionFor[_]] = blocking {
      |    println("Initialising lookups")
      |    val startTime                             = System.currentTimeMillis
      |    var scanResult: ScanResult                = null
      |    var lookups: Map[String, CompanionFor[_]] = null
      |    try {
      |      scanResult = new ClassGraph().whitelistPackages(Config.generatedNamespaces: _*).scan()
      |      /// For some reason, the classloader gets stuck unless these objects are explicitly instantiated outside of the reflection...
      |      def classloaderBypass = Seq(Age, Coding, Count, Distance, Duration, Expression, Quantity, Reference, Resource)
      |      val classPathResults = scanResult
      |        .getSubclasses("com.babylonhealth.lit.core.FHIRObject")
      |        .filter(!_.getSimpleName.contains('$'))
      |        .asScala
      |      val companions = extractCompanionsFromPath(classPathResults.toSeq).toList
      |
      |      lookups = companions.flatMap {
      |        case x if x.profileUrl.isEmpty => println(s"FATAL ERROR: Some resource companions are missing the profileUrl field (${x.thisName})"); sys.exit(5)
      |        case x if x eq x.baseType      => Seq(x.thisName -> x) ++ x.profileUrl.toSeq.map(_ -> x)
      |        case x                         => x.profileUrl.toSeq.map(_ -> x)
      |      }.toMap
      |    } finally if (scanResult != null) scanResult.close()
      |    if (lookups == null || lookups.size < 35) { // 35 classes inherit from FHIRObject just in core alone...
      |      println("FATAL ERROR: Unable to instantiate companionLookup map")
      |      sys.exit(5)
      |    }
      |    println(s"Successfully created ${lookups.size} lookup mappings in ${System.currentTimeMillis - startTime}ms")
      |    lookups
      |  }
      |
      |  val suffixDecoderTypeTagMap: Map[String, DecoderAndTag[_]] = Map(
      |    "Dosage"          -> DecoderAndTag[Dosage](Dosage.decoder(_), lTagOf[Dosage]),
      |    "Id"              -> DecoderAndTag[Id](_ => idDecoder, lTagOf[Id]),
      |    "Period"          -> DecoderAndTag[Period](Period.decoder(_), lTagOf[Period]),
      |    "Time"            -> DecoderAndTag[LocalTime](_ => Decoder.decodeLocalTime, lTagOf[LocalTime]),
      |    "Meta"            -> DecoderAndTag[Meta](Meta.decoder(_), lTagOf[Meta]),
      |    "Markdown"        -> DecoderAndTag[Markdown](_ => markdownDecoder, lTagOf[Markdown]),
      |    "Distance"        -> DecoderAndTag[Distance](Distance.decoder(_), lTagOf[Distance]),
      |    "RelatedArtifact" -> DecoderAndTag[RelatedArtifact](RelatedArtifact.decoder(_), lTagOf[RelatedArtifact]),
      |    "Code"            -> DecoderAndTag[Code](_ => codeDecoder, lTagOf[Code]),
      |    "SampledData"     -> DecoderAndTag[SampledData](SampledData.decoder(_), lTagOf[SampledData]),
      |    "Timing"          -> DecoderAndTag[Timing](Timing.decoder(_), lTagOf[Timing]),
      |    "Range"           -> DecoderAndTag[Range](Range.decoder(_), lTagOf[Range]),
      |    "ParameterDefinition" -> DecoderAndTag[ParameterDefinition](
      |      ParameterDefinition.decoder(_),
      |      lTagOf[ParameterDefinition]),
      |    "HumanName"         -> DecoderAndTag[HumanName](HumanName.decoder(_), lTagOf[HumanName]),
      |    "Instant"           -> DecoderAndTag[ZonedDateTime](_ => decodeZonedDateTime, lTagOf[ZonedDateTime]),
      |    "Age"               -> DecoderAndTag[Age](Age.decoder(_), lTagOf[Age]),
      |    "Base64Binary"      -> DecoderAndTag[Base64Binary](_ => base64BinaryDecoder, lTagOf[Base64Binary]),
      |    "Oid"               -> DecoderAndTag[OID](_ => oidDecoder, lTagOf[OID]),
      |    "PositiveInt"       -> DecoderAndTag[PositiveInt](_ => positiveIntDecoder, lTagOf[PositiveInt]),
      |    "Canonical"         -> DecoderAndTag[Canonical](_ => canonicalDecoder, lTagOf[Canonical]),
      |    "Contributor"       -> DecoderAndTag[Contributor](Contributor.decoder(_), lTagOf[Contributor]),
      |    "UnsignedInt"       -> DecoderAndTag[UnsignedInt](_ => unsignedIntDecoder, lTagOf[UnsignedInt]),
      |    "Money"             -> DecoderAndTag[Money](Money.decoder(_), lTagOf[Money]),
      |    "Boolean"           -> DecoderAndTag[Boolean](_ => Decoder.decodeBoolean, lTagOf[Boolean]),
      |    "UsageContext"      -> DecoderAndTag[UsageContext](UsageContext.decoder(_), lTagOf[UsageContext]),
      |    "Uuid"              -> DecoderAndTag[UUID](_ => Decoder.decodeUUID, lTagOf[UUID]),
      |    "Expression"        -> DecoderAndTag[Expression](Expression.decoder(_), lTagOf[Expression]),
      |    "ContactPoint"      -> DecoderAndTag[ContactPoint](ContactPoint.decoder(_), lTagOf[ContactPoint]),
      |    "Attachment"        -> DecoderAndTag[Attachment](Attachment.decoder(_), lTagOf[Attachment]),
      |    "Duration"          -> DecoderAndTag[Duration](Duration.decoder(_), lTagOf[Duration]),
      |    "CodeableConcept"   -> DecoderAndTag[CodeableConcept](CodeableConcept.decoder(_), lTagOf[CodeableConcept]),
      |    "Address"           -> DecoderAndTag[Address](Address.decoder(_), lTagOf[Address]),
      |    "String"            -> DecoderAndTag[String](_ => Decoder.decodeString, lTagOf[String]),
      |    "Count"             -> DecoderAndTag[Count](Count.decoder(_), lTagOf[Count]),
      |    "Coding"            -> DecoderAndTag[Coding](Coding.decoder(_), lTagOf[Coding]),
      |    "Ratio"             -> DecoderAndTag[Ratio](Ratio.decoder(_), lTagOf[Ratio]),
      |    "Identifier"        -> DecoderAndTag[Identifier](Identifier.decoder(_), lTagOf[Identifier]),
      |    "Url"               -> DecoderAndTag[UrlStr](_ => urlDecoder, lTagOf[UrlStr]),
      |    "DateTime"          -> DecoderAndTag[FHIRDateTime](_ => decodeFHIRDateTime, lTagOf[FHIRDateTime]),
      |    "Uri"               -> DecoderAndTag[UriStr](_ => uriDecoder, lTagOf[UriStr]),
      |    "DataRequirement"   -> DecoderAndTag[DataRequirement](DataRequirement.decoder(_), lTagOf[DataRequirement]),
      |    "Quantity"          -> DecoderAndTag[Quantity](Quantity.decoder(_), lTagOf[Quantity]),
      |    "TriggerDefinition" -> DecoderAndTag[TriggerDefinition](TriggerDefinition.decoder(_), lTagOf[TriggerDefinition]),
      |    "Signature"         -> DecoderAndTag[Signature](Signature.decoder(_), lTagOf[Signature]),
      |    "Annotation"        -> DecoderAndTag[Annotation](Annotation.decoder(_), lTagOf[Annotation]),
      |    "Integer"           -> DecoderAndTag[Int](_ => Decoder.decodeInt, lTagOf[Int]),
      |    "Reference"         -> DecoderAndTag[Reference](Reference.decoder(_), lTagOf[Reference]),
      |    "ContactDetail"     -> DecoderAndTag[ContactDetail](ContactDetail.decoder(_), lTagOf[ContactDetail]),
      |    "Date"              -> DecoderAndTag[FHIRDate](_ => decodeFHIRDate, lTagOf[FHIRDate]),
      |    "Decimal"           -> DecoderAndTag[BigDecimal](_ => Decoder.decodeBigDecimal, lTagOf[BigDecimal])
      |  )
      |
      |
      |  val suffixTypeMap: Map[String, LightTypeTag] =
      |    suffixDecoderTypeTagMap.map { case (k, v) =>
      |      k -> v.typeTag.tag
      |    } + ("" -> implicitly[LTag["Any"]].tag) // TODO: does this entry still make sense?
      |
      |  @deprecated("Use companionLookup or something...")
      |  val localClasses: Seq[LightTypeTag] = companionLookup.toSeq.sortBy(_._1).map(_._2.thisTypeTag.tag)
      |
      |  val intSubSuffixes: Set[String]    = Set("Integer", "PositiveInt", "UnsignedInt")
      |  val stringSubSuffixes: Set[String] = Set("String", "Canonical", "Code", "Id", "Markdown", "Oid", "Uri", "Url")
      |  // cannot actually be a map because Type equality doesn't work 'right' -- need to do the .find(_ =:= ...) pattern...
      |  // TODO: Is this true? Can we make this more efficient plz?
      |  @deprecated("REALLY SLOW")
      |  val typeSuffixMap: LightTypeTag => Option[String] = {
      |    new {
      |      private val log: Logger = LoggerFactory.getLogger(getClass)
      |      def doLog = {
      |        val suffixes         = suffixTypeMap.values.toSeq
      |        val distinctSuffixes = suffixes.distinct
      |        if (distinctSuffixes.sizeCompare(suffixes) != 0) {
      |          val dups = ArrayBuffer(suffixes: _*)
      |          for (v <- distinctSuffixes) dups.remove(dups.indexOf(v))
      |          log.info(
      |            s"-->>> BAD INIT -- values for suffixTypeMap must be unique. Some clashes are: [${dups.take(5).mkString(", ")}]")
      |        } else log.info("-->>> GOOD INIT -- values for suffixTypeMap are unique ")
      |      }
      |    }.doLog
      |    // 'assert' does not work in package objects WTF
      |    //    assert(
      |    //      suffixTypeMap.values.toSeq.distinct.sizeCompare(suffixTypeMap.values) == 0,
      |    //      "values for suffixTypeMap must be unique")
      |    val seq           = suffixTypeMap.toSeq.map { case (s, t) => t -> s }
      |    val optionErasure = lTypeOf[Option[_]].withoutArgs
      |    t => {
      |      val unwrapped = if (t.withoutArgs =:= optionErasure) t.typeArgs.head else t
      |      seq.find(_._1 =:= unwrapped).map(_._2)
      |    }
      |  }
      |}""".stripMargin
  def genPackageObject(pkg: String, _unionAliases: Map[String, Seq[String]]): String = {
    val head =
      if (pkg == "core") genPackageCore
      else
        s"""package com.babylonhealth.lit.$pkg
           |
           |import java.time.{ LocalDate, LocalTime, ZonedDateTime }
           |import java.util.UUID
           |
           |import com.babylonhealth.lit.core._
           |import com.babylonhealth.lit.core.model._
           |""".stripMargin
    val unionAliases =
      _unionAliases.toSeq
        .map { case (a, t) => s"type $a = ${t.mkString("\\/")}" }
        .sorted
        .mkString("\n  ")
    s"""$head
       |
       |object UnionAliases {
       |  $unionAliases
       |}
       |
       |""".stripMargin
  }
  def genEnums(pkg: String, valueSets: Map[String, CodeValueSet]): String = {
    val enumDecl =
      valueSets.toSeq.distinctBy(_._1.split('|').head).map((enumDeclaration() _).tupled).sorted.mkString("\n\n")
    s"""package com.babylonhealth.lit.$pkg
       |
       |import enumeratum.{ CirceEnum, Enum, EnumEntry }
       |
       |import com.babylonhealth.lit.core.model.Coding
       |import com.babylonhealth.lit.core.{ FhirEnum, FhirCirceEnum, EnumWithFallback }
       |
       |$enumDecl
       |""".stripMargin
  }
}
