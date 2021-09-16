package com.babylonhealth.lit.languages

import com.babylonhealth.lit.Cardinality._
import com.babylonhealth.lit.CardinalityImplicits._
import com.babylonhealth.lit.common.CodegenUtils
import com.babylonhealth.lit.core.NonEmptyLitSeq
import com.babylonhealth.lit.{
  BaseField,
  Cardinality,
  ClassGenInfo,
  CodeEnum,
  CodeValueSet,
  Commonish,
  ElementTreee,
  EnumerationUtils,
  ModuleDependencies,
  TopLevelClass,
  ValueSetDecls
}

trait JavaGenerator extends Commonish {
  def choiceClassName(f: BaseField): String = "Choice" + ElementTreee.hashForUnion(f.types, "!!!ERROR!!!", "!!!ERROR!!!")

  def generatedClassNameToScala(s: String): String = s match {
    case "Option" => "FHIROption"
    case x        => x
  }

  def genTheJavaForClass(
      topLevelClass: TopLevelClass,
      packageStr: String,
      pkg: String,
      valueSets: ValueSetDecls,
      moduleDependencies: ModuleDependencies,
      javaSuffix: String,
      unionTypes: Map[Seq[String], String]): Seq[ClassGenInfo] = {
    val modules: Seq[String] = (moduleDependencies.getParents(pkg) + pkg).toSeq
    val lookupPkg            = valueSets.byEnum.map(s => s._1 -> moduleDependencies.leastCommon(s._2.map(_._1).toSet))
    val fields =
      topLevelClass.fields
        .filter(f =>
          f.cardinality != Zero && !(topLevelClass.parentClass.exists(_.className == "Extension") && f.javaName == "url"))
        .map { bf =>
          val default: Option[String] = // TODO Should this list include parents? Should it have a priority ordering?
            if (bf.javaName == "meta" && bf.types.head == "Meta" && topLevelClass.isProfile)
              Some(s"""Optional.of(MetaBuilder.init().withProfile("${topLevelClass.url}").build())""")
            else bf.cardinality.defaultValue
          val nearestValueSet = bf.nearestValueSet
          bf.copy(default = default, valueEnumeration = nearestValueSet)
        }
    def eraseSubtypes(t: String, f: BaseField, builder: Boolean = false): String = t match {
      case "Code" if f.valueEnumeration.isDefined =>
        EnumerationUtils.valueSetToEnumName(f.valueEnumeration.get.valueSet)
      case "Canonical" | "Code" | "Id" | "Markdown" | "OID" | "UriStr" | "UrlStr" | "XHTML" if !f.isGenerated =>
        "String"
      case "Base64Binary"                                                 => "byte[]"
      case "PositiveInt" | "UnsignedInt" | "Int" if !f.isGenerated        => "Integer"
      case x if !f.isGenerated && isPrimitiveSuffix(inverseTypeLookup(x)) => x
      case x if f.isGenerated && f.declaringClasses.size > 1 =>
        if (builder) f.declaringClasses.mkString("_") + "_" + x + "Builder"
        else f.declaringClasses.map(generatedClassNameToScala).mkString("$") + "$" + generatedClassNameToScala(x)
      case x if f.isGenerated =>
        val progenitorClass = f.firstBase.map(_.scalaClassName) getOrElse topLevelClass.scalaClassName
        if (builder) s"${progenitorClass}_${x}Builder" else s"$progenitorClass.$x"
      case x if x.count(_ == '.') > 1 =>
        if (builder) x.split("\\.").mkString("_") + "Builder"
        else x.split("\\.").map(generatedClassNameToScala).mkString("$")
      case x if x.contains('"') => "Choice"
      case x if builder         => x.replace('.', '_') + "Builder"
      case x                    => x
    }
    def eraseUninferrableChoices(f: BaseField, builder: Boolean = false) = {
      f.types match {
        case x if x.size == 1 => eraseSubtypes(x.head, f, builder)
        case _                => choiceClassName(f)
      }
    }
    def toJavaType(f: BaseField, builder: Boolean = false): String = {
      f.cardinality.wrapJavaType(eraseUninferrableChoices(f, builder = builder))
    }
    def toBuilderMutatorType(
        f: BaseField,
        builder: Boolean,
        wrapInOptional: Boolean = true,
        asCollection: Boolean = false): String = {
      if (asCollection) {
        f.cardinality.collectionJavaType(eraseUninferrableChoices(f, builder = builder))
      } else {
        f.cardinality.varArgJavaType(eraseUninferrableChoices(f, builder = builder))
      }
    }

    def genPrivateFields(fs: Seq[BaseField]): String =
      fs.map(f => s"""private ${toJavaType(f)} ${f.javaName}${default(f)};""").mkString("\n")

    def genInitialParam(f: BaseField, builder: Boolean): String = {
      if (f.types.size == 1) s"${toJavaType(f, builder = builder)} ${f.javaName}"
      else s"@NonNull ${choiceClassName(f)} ${f.javaName}"
    }
    def genInitialParams(fs: Seq[BaseField], builder: Boolean = false): String =
      fs.map(genInitialParam(_, builder = builder)).mkString(", ")

    def genFieldAssignment(f: BaseField, targetClassName: String): String =
      s"this.${f.javaName} = ${f.javaName};"
    def genFieldAssignments(fs: Seq[BaseField], targetClassName: String): String =
      fs.map(genFieldAssignment(_, targetClassName)).mkString("\n")

    def default(f: BaseField): String =
      if (f.javaName == "meta" && topLevelClass.isProfile)
        s""" = Optional.of(MetaBuilder.init().withProfile("${topLevelClass.url}").build())"""
      else f.cardinality.defaultJavaValue.filter(_ => !f.cardinality.required).map(x => s" = $x") getOrElse ""

    def descFromTLC(f: BaseField, t: TopLevelClass): Option[String] =
      t.rawStructureDefinition.snapshot
        .flatMap(_.element.find(_.id.exists(_.matches(s"[^.]+\\.${f.noParensName}(\\[x\\])?"))))
        .flatMap(_.definition)
        .map(" - " + _.replaceAll("<", "&lt;").replaceAll(">", "&gt;"))
    def getNearestDescription(f: BaseField, t: TopLevelClass): Option[String] =
      descFromTLC(f, t).orElse(t.parentClass.flatMap(p => getNearestDescription(f, p)))

    def choiceConstructorMethods(f: BaseField): String = if (f.types.size == 1) ""
    else {
      val choiceName                     = unionTypes(f.types)
      val typesWithErasure               = f.types.map(t => t -> eraseSubtypes(t, f))
      val (overloadedTypes, uniqueTypes) = typesWithErasure.partition { case (_, e) => typesWithErasure.count(_._2 == e) > 1 }
      val utStr: String = uniqueTypes
        .map { case (_, e) =>
          val variable: String = e.head.toLower +: ""
          s"""  public static $choiceName ${f.javaName}($e $variable) {
             |    return new $choiceName($variable);
             |  }""".stripMargin
        }
        .mkString("\n")
      val otStr: String = overloadedTypes
        .map { case (t, e) =>
          val variable: String = e.head.toLower +: ""
          s"""  public static $choiceName ${f.javaName}${typeLookdown(t)}($e $variable) {
             |    return $choiceName.$choiceName$t($variable);
             |  }""".stripMargin
        }
        .mkString("\n")
      utStr ++ otStr
    }
    def paramStr(f: BaseField, isRequired: Boolean, builderName: String): String =
      s"@param ${f.javaName}${getNearestDescription(f, topLevelClass) getOrElse ""}${if (f.types.size > 1) {
        val value = f.types.map(t => t -> eraseSubtypes(t, f))
        s"\n  * Field is a 'choice' field. Type should be one of ${value.map(_._2).distinct.mkString(", ")}. To pass the" +
        s" value in, wrap with one of the $builderName.${f.javaName} static methods"
      } else ""}"
    val builderName                         = s"${topLevelClass.scalaClassName}Builder"
    val privateFields                       = genPrivateFields(fields)
    val (nonOptionalFields, optionalFields) = fields.partition(_.cardinality.required)
    val initialParams                       = genInitialParams(nonOptionalFields)
    val builderParams                       = genInitialParams(nonOptionalFields, builder = true)
    val fieldAssignments                    = genFieldAssignments(nonOptionalFields, topLevelClass.scalaClassName)
    def convertToScala(f: BaseField) = {
      val isErasedRef =
        (f.types.size > 1 && (
          f.types.map(eraseSubtypes(_, f)).exists(Set("Boolean", "Integer")) ||
            f.cardinality == Cardinality.Optional
        )) ||
          f.types.forall(_ startsWith "Choice[\"") // last case is for the Choice["literallyTheClassName"] hack

      val possiblyObjectCast = f.cardinality.applyJavaFunction(f.javaName) { value =>
        if (f.cardinality != Cardinality.One && f.types.size == 1 && Set("Integer", "Boolean", "Long").contains(
            eraseSubtypes(f.types.head, f)))
          s"(Object) $value"
        else value
      }

      val cast = if (isErasedRef) f.cardinality.castUnchecked("Choice") else ""
      cast + f.cardinality.convertJavaToScala(possiblyObjectCast, eraseUninferrableChoices(f))
    }
    def genOptionalFieldAppenders(optionalFields: Seq[BaseField], builderName: String, targetClassName: String): String =
      optionalFields
        .map { f =>
          val javaDoc: String =
            s"""  /**
               |  * ${paramStr(f, isRequired = false, builderName)}
               |  */
               |""".stripMargin
          s"""${javaDoc}public $builderName.Impl with${f.capitalName}(@NonNull ${toBuilderMutatorType(
            f,
            builder = false,
            wrapInOptional = false)} ${f.javaName}) {
             |  this.${f.javaName} = ${f.cardinality.wrapJavaValue(f.javaName)};
             |  return this;
             |}""".stripMargin +
          // For list types, include a second with method which takes a Collection
          (if (f.cardinality.max > 1) {
             s"""\n${javaDoc}public $builderName.Impl with${f.capitalName}(@NonNull ${toBuilderMutatorType(
               f,
               builder = false,
               wrapInOptional = false,
               asCollection = true)} ${f.javaName}) {
                |  this.${f.javaName} = Collections.unmodifiableCollection(${f.javaName});
                |  return this;
                |}""".stripMargin
           } else {
             ""
           }) +
          // For non-primitive types, include another method which takes a Builder (or builder varargs if applicable)
          (if (f.isBuildableFHIRType) {
             s"""public $builderName.Impl with${f.capitalName}(@NonNull ${toBuilderMutatorType(
               f,
               builder = true,
               wrapInOptional = false)} ${f.javaName}) {
                |  this.${f.javaName} = ${f.cardinality.wrapJavaValue(f.javaName, build = true)};
                |  return this;
                |}""".stripMargin
           } else "")
        }
        .mkString("\n")

    def imports(isTop: Boolean, valueSets: Seq[String]) =
      s"""package $packageStr.builders;
         |
         |import java.time.LocalDate;
         |import java.time.LocalTime;
         |import java.time.ZonedDateTime;
         |import java.util.Arrays;
         |import java.util.Collection;
         |import java.util.Collections;
         |import java.util.Optional;
         |import java.util.UUID;
         |import java.util.stream.Stream;
         |import java.util.stream.Collectors;
         |
         |import scala.math.BigDecimal;
         |import scala.Option;
         |import scala.collection.immutable.Seq;
         |import scala.jdk.javaapi.CollectionConverters;
         |import scala.jdk.javaapi.OptionConverters;
         |
         |import lombok.NonNull;
         |
         |import com.babylonhealth.lit.core.FHIRComponentFieldMeta;
         |import com.babylonhealth.lit.core.FHIRDateTime;
         |import com.babylonhealth.lit.core.FHIRDate;
         |import com.babylonhealth.lit.core.LitSeqJCollector;
         |import com.babylonhealth.lit.core.LitSeq;
         |import com.babylonhealth.lit.core.LitSeq$$;
         |import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
         |import com.babylonhealth.lit.core.Choice;
         |import com.babylonhealth.lit.core.Choice$$;
         |${modules.map(m => s"import com.babylonhealth.lit.$m.model.*;").mkString("\n")}
         |${modules.map(m => s"import com.babylonhealth.lit.$m$javaSuffix.builders.*;").mkString("\n")}
         |${modules.map(m => s"import com.babylonhealth.lit.$m$javaSuffix.model.Unions.*;").mkString("\n")}
         |${valueSets
        .map(EnumerationUtils.valueSetToEnumName)
        .map(e => e -> lookupPkg(e))
        .map { case (n, p) => s"import com.babylonhealth.lit.$p.$n;" }
        .mkString("\n")}
         |import com.babylonhealth.lit.core.$$bslash$$div;
         |import com.babylonhealth.lit.core_java.LitUtils;
         |
         |import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
         |import static com.babylonhealth.lit.core_java.LitUtils.guard;
         |import static java.util.stream.Collectors.toList;"""

    def genBuilder(f: BaseField, nestingPrefix: String): ClassGenInfo = {
      val mungedClassName = s"$nestingPrefix${f.capitalName}".replaceAll("\\.", "_")
      val builderName     = s"${mungedClassName}Builder"
      val targetClassName =
        if (mungedClassName.count(_ == '_') == 1) mungedClassName.replace('_', '.')
        else mungedClassName.replace('_', '$').replaceAll("\\$Option($|\\$)", "\\$FHIROption$1")
      val privateFields                       = genPrivateFields(f.childFields)
      val (nonOptionalFields, optionalFields) = f.childFields.partition(_.cardinality.required)
      val initialParams                       = genInitialParams(nonOptionalFields)
      val builderParams                       = genInitialParams(nonOptionalFields, builder = true)
      val fieldAssignments                    = genFieldAssignments(nonOptionalFields, targetClassName)
      val optionalFieldAppenders              = genOptionalFieldAppenders(optionalFields, builderName, targetClassName)
      val choiceConstructorAliases            = f.childFields.map(choiceConstructorMethods).mkString("\n")
      val paramStrs = nonOptionalFields.map(paramStr(_, isRequired = true, builderName)).mkString("\n  * ")
      val javaDoc =
        s""" /** Required fields for {@link $targetClassName}
           |  *
           |  * $paramStrs
           |  */""".stripMargin
      val implementationExtension = if (f.parent.isDefined) s" extends ${f.parent.get.capitalName}Builder" else ""
      val comma                   = if (f.childFields.nonEmpty) "," else ""
      val fileContents =
        s"""${imports(isTop = false, f.childFields.flatMap(_.nearestValueSet.map(_.valueSet)))}
           |public interface $builderName$implementationExtension {
           |  public $targetClassName build();
           |
           |  public static Impl init($initialParams) {
           |    return new Impl(${nonOptionalFields.map(_.javaName).mkString(", ")});
           |  }
           |
           |  public static Impl builder($builderParams) {
           |    return new Impl(${nonOptionalFields.map(_.javaBuildName((t, f) => eraseSubtypes(t, f, true))).mkString(", ")});
           |  }
           |
           |  $choiceConstructorAliases
           |
           |  public class Impl implements $builderName {
           |    $privateFields
           |
           |    $javaDoc
           |    public Impl($initialParams) {
           |      $fieldAssignments
           |    }
           |
           |    $optionalFieldAppenders
           |
           |    public $targetClassName build() {
           |      return new $targetClassName(${f.childFields
          .map(convertToScala)
          .mkString(", ")}$comma LitUtils.emptyMetaElMap());
           |    }
           |  }
           |}""".stripMargin
      ClassGenInfo(fileContents, builderName, pkg)
    }

    def childBuildersAndSelf(f: BaseField, nestingPrefix: String): Seq[(BaseField, String)] =
      (f, nestingPrefix) +: f.childFields
        .filter(f => f.isGenerated && f.parent.isEmpty)
        .flatMap(f => childBuildersAndSelf(f, nestingPrefix + f.scalaClassName + "_"))
    val generatedBuilders: Seq[ClassGenInfo] =
      fields
        .filter(f => f.isGenerated && f.parent.isEmpty)
        .flatMap(f => childBuildersAndSelf(f, topLevelClass.scalaClassName + "_"))
        .map { case (f, p) =>
          genBuilder(f, p)
        }

    val choiceConstructorAliases = topLevelClass.fields.map(choiceConstructorMethods).mkString("\n")

    val optionalFieldAppenders = genOptionalFieldAppenders(optionalFields, builderName, topLevelClass.scalaClassName)
    val withoutMeta =
      if (fields.exists(_.javaName == "meta"))
        s"""public $builderName.Impl withoutMeta() {
           |  this.meta = Optional.empty();
           |  return this;
           |}""".stripMargin
      else ""
    val paramStrs = nonOptionalFields.map(paramStr(_, isRequired = true, builderName)).mkString("\n  * ")
    val javaDoc =
      s""" /** Required fields for {@link ${topLevelClass.scalaClassName}}
         |  *
         |  * $paramStrs
         |  */""".stripMargin
    val implementationExtension =
      if (topLevelClass.parentClass.isDefined) s" extends ${topLevelClass.parentClass.get.scalaClassName}Builder" else ""
    val comma = if (fields.nonEmpty) "," else ""
    val file =
      s"""${imports(isTop = true, topLevelClass.fields.flatMap(_.nearestValueSet.map(_.valueSet)))}
         |
         |public interface $builderName$implementationExtension {
         |  public ${topLevelClass.scalaClassName} build();
         |
         |  public static Impl init($initialParams) {
         |    return new Impl(${nonOptionalFields.map(_.javaName).mkString(", ")});
         |  }
         |
         |  public static Impl builder($builderParams) {
         |    return new Impl(${nonOptionalFields.map(_.javaBuildName((t, f) => eraseSubtypes(t, f, true))).mkString(", ")});
         |  }
         |
         |  $choiceConstructorAliases
         |
         |  public class Impl implements $builderName {
         |    $privateFields
         |
         |    $javaDoc
         |    public Impl($initialParams) {
         |      $fieldAssignments
         |    }
         |
         |    $optionalFieldAppenders
         |
         |    $withoutMeta
         |
         |    public ${topLevelClass.scalaClassName} build() {
         |      return new ${topLevelClass.scalaClassName}(${fields
        .map(convertToScala)
        .mkString(", ")}$comma LitUtils.emptyMetaElMap());
         |    }
         |  }
         |}""".stripMargin
    ClassGenInfo(file, builderName, pkg) +: generatedBuilders
  }

  def shoutySnakeToPascalCase(s: String): String = s.split("_").map(_.toLowerCase.capitalize).mkString("")
  def scalaEnum(enumName: String, s: String): String =
    if (s.contains("`")) s"""($enumName) $enumName.withName("${s.filterNot(_ == '`')}")"""
    else s"$enumName.$s$$.MODULE$$"
  def javaEnum(e: String): String = if (e.contains("`")) '_' +: e.filterNot(_ == '`').replaceAll("\\.", "_") else e
  def genereteCodeAlias(pkg: String, javaSuffix: String, name: String, values: NonEmptyLitSeq[CodeEnum]): ClassGenInfo = {
    val enumName = EnumerationUtils.valueSetToEnumName(name)
    val decls = values
      .map { e =>
        s"public static final $enumName ${javaEnum(e.getName)} = ${scalaEnum(enumName, e.getName)};"
      }
      .sorted
      .mkString("\n  ")
    val fileBody =
      s"""package com.babylonhealth.lit.$pkg$javaSuffix.codes;
         |
         |import com.babylonhealth.lit.$pkg.$enumName;
         |
         |public interface ${shoutySnakeToPascalCase(enumName)} {
         |  $decls
         |}
         |""".stripMargin
    ClassGenInfo(fileBody, shoutySnakeToPascalCase(enumName), pkg)
  }
  def generateCodeAliases(pkg: String, javaSuffix: String, valueSets: Map[String, CodeValueSet]): Seq[ClassGenInfo] = {
    valueSets.map { case (k, v) => genereteCodeAlias(pkg, javaSuffix, k, v.codes) }.toSeq
  }

  def generateModelFile(pkg: String, javaSuffix: String, unionTypes: Map[String, Seq[String]]): ClassGenInfo = {

    def eraseSubtypes(t: String): String = t match {
      case "Canonical" | "Code" | "Id" | "Markdown" | "OID" | "UriStr" | "UrlStr" | "XHTML" =>
        "String"
      case "Base64Binary"                        => "byte[]"
      case "PositiveInt" | "UnsignedInt" | "Int" => "Integer"
      case x if x.count(_ == '.') > 1            => x.split("\\.").mkString("$")
      case x                                     => x
    }
    def genChoiceClass(choiceType: String, choiceOptions: Seq[String]): String = {
      val choiceClassName         = choiceType.replaceFirst("Union", "Choice")
      val optionswithSubtypes     = choiceOptions.map(o => o -> eraseSubtypes(o))
      val verboseTypeName: String = optionswithSubtypes.map(_._2).reduceLeft { (a, b) => s"$$bslash$$div<$a, $b>" }
      val (overloadedConstructors, normalConstructors) = optionswithSubtypes.partition { case (_, s) =>
        optionswithSubtypes.count(_._2 == s) > 1
      }
      val c0 = normalConstructors
        .map { case (o, s) =>
          val variableName = "arg"
          s"""    public $choiceClassName($s $variableName) {
             |      super("${typeLookdown(o)}", $variableName, (LTag) UnionAliases.${choiceType}Tag());
             |    }""".stripMargin
        }
        .mkString("\n")

      val c1 = overloadedConstructors
        .map(_._2)
        .distinct
        .map { erased =>
          val variableName = "arg"
          s"""    private $choiceClassName(String subtype, $erased $variableName) {
             |      super(subtype, $variableName, (LTag) UnionAliases.${choiceType}Tag());
             |    }""".stripMargin
        }
        .mkString("\n")

      val c2 = overloadedConstructors
        .map { case (o, s) =>
          val variableName = "arg"
          s"""    public static $choiceClassName $choiceClassName$o($s $variableName) {
             |      return new $choiceClassName("${typeLookdown(o)}", $variableName);
             |    }""".stripMargin
        }
        .mkString("\n")
      s"""  public static class $choiceClassName extends Choice<$verboseTypeName> {
         |    $c0
         |
         |    $c1
         |
         |    $c2
         |  }""".stripMargin
    }
    val body = s"""package com.babylonhealth.lit.$pkg$javaSuffix.model;
                  |
                  |import java.time.LocalDate;
                  |import java.time.LocalTime;
                  |import java.time.ZonedDateTime;
                  |import java.util.UUID;
                  |
                  |import scala.math.BigDecimal;
                  |
                  |import izumi.reflect.macrortti.LTag;
                  |
                  |import com.babylonhealth.lit.core.$$bslash$$div;
                  |import com.babylonhealth.lit.core.Choice;
                  |import com.babylonhealth.lit.core.*;
                  |import com.babylonhealth.lit.core.model.*;
                  |${if (unionTypes.nonEmpty) s"import com.babylonhealth.lit.$pkg.UnionAliases;" else ""}
                  |import com.babylonhealth.lit.${pkg}${javaSuffix}.model.Unions.*;
                  |
                  |public class Unions {
                  |  ${unionTypes.map { case (k, vs) => genChoiceClass(k, vs) }.mkString("\n\n")}
                  |}
                  |""".stripMargin
    ClassGenInfo(body, "Unions", pkg)
  }
}
