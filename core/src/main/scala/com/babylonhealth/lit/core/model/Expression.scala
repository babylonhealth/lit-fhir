package com.babylonhealth.lit.core.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.{ Success, Try }

import io.circe.{ Decoder, HCursor }

import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.BaseFieldDecoders._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.TagSummoners.lTagOf
import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.core.EXPRESSION_LANGUAGE
import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Expression extends CompanionFor[Expression] {
  implicit def summonObjectAndCompanionExpression127883092(
      o: Expression): ObjectAndCompanion[Expression, Expression.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Expression
  override type ParentType   = Expression
  override val baseType: CompanionFor[ResourceType] = Expression
  override val parentType: CompanionFor[ParentType] = Expression
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Expression")
  def apply(
      id: Option[String] = None,
      name: Option[Id] = None,
      language: EXPRESSION_LANGUAGE,
      extension: LitSeq[Extension] = LitSeq.empty,
      reference: Option[UriStr] = None,
      expression: Option[String] = None,
      description: Option[String] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Expression = new Expression(
    id,
    name,
    language,
    extension,
    reference,
    expression,
    description,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val name: FHIRComponentFieldMeta[Option[Id]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[Id]], false, lTagOf[Id])
  val language: FHIRComponentFieldMeta[EXPRESSION_LANGUAGE] =
    FHIRComponentFieldMeta("language", lTagOf[EXPRESSION_LANGUAGE], false, lTagOf[EXPRESSION_LANGUAGE])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val reference: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("reference", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val expression: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("expression", lTagOf[Option[String]], false, lTagOf[String])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, name, language, extension, reference, expression, description)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Expression): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Id]](name, t.name),
    FHIRComponentField[EXPRESSION_LANGUAGE](language, t.language),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[UriStr]](reference, t.reference),
    FHIRComponentField[Option[String]](expression, t.expression),
    FHIRComponentField[Option[String]](description, t.description)
  )
  def extractId(t: Expression): Option[String]            = t.id
  def extractName(t: Expression): Option[Id]              = t.name
  def extractLanguage(t: Expression): EXPRESSION_LANGUAGE = t.language
  def extractExtension(t: Expression): LitSeq[Extension]  = t.extension
  def extractReference(t: Expression): Option[UriStr]     = t.reference
  def extractExpression(t: Expression): Option[String]    = t.expression
  def extractDescription(t: Expression): Option[String]   = t.description
  override val thisName: String                           = "Expression"
  def unapply(
      o: Expression): Option[(Option[String], Option[Id], EXPRESSION_LANGUAGE, LitSeq[Extension], Option[UriStr], Option[String], Option[String])] =
    Some((o.id, o.name, o.language, o.extension, o.reference, o.expression, o.description))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Expression] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Expression(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Id]]("name", Some(None)),
          cursor.decodeAs[EXPRESSION_LANGUAGE]("language", None),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("reference", Some(None)),
          cursor.decodeAs[Option[String]]("expression", Some(None)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Expression Type: A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
  *
  *  Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a resource.)
  *
  * @constructor Introduces the fields name, language, reference, expression, description.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param name - A short name assigned to the expression to allow for multiple reuse of the expression in the context where it is defined.
  * @param language - The media type of the language for the expression.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param reference - A URI that defines where the expression is found.
  * @param expression - An expression in the specified language that returns a value.
  * @param description - A brief, natural language description of the condition that effectively communicates the intended semantics.
  */
@POJOBoilerplate
class Expression(
    override val id: Option[String] = None,
    val name: Option[Id] = None,
    val language: EXPRESSION_LANGUAGE,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val reference: Option[UriStr] = None,
    val expression: Option[String] = None,
    val description: Option[String] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Expression"
}
