package com.babylonhealth.lit.usbase.model

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
import com.babylonhealth.lit.hl7.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.hl7.UnionAliases._
import com.babylonhealth.lit.usbase.UnionAliases._

import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Valueset_expression extends CompanionFor[Valueset_expression] {
  implicit def summonObjectAndCompanionValueset_expression_1699394913(
      o: Valueset_expression): ObjectAndCompanion[Valueset_expression, Valueset_expression.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/valueset-expression")
  def apply(
      id: Option[String] = None,
      value: Expression,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Valueset_expression = new Valueset_expression(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Expression] =
    FHIRComponentFieldMeta("value", lTagOf[Expression], true, lTagOf[Expression])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Expression](value, t.value.get.toSubRefNonUnion[Expression])
    ))
  override def fields(t: Valueset_expression): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Valueset_expression): Option[String]                   = t.id
  def extractValue(t: Valueset_expression): Expression                    = t.value.get.toSubRefNonUnion[Expression]
  override val thisName: String                                           = "Valueset_expression"
  override val searchParams: Map[String, Valueset_expression => Seq[Any]] = Extension.searchParams
  def unapply(o: Valueset_expression): Option[(Option[String], Expression)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[Expression]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Valueset_expression] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Valueset_expression(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Expression]("valueExpression", None),
          decodeAttributes(cursor)
        )
      ))
}

/** An expression that provides an alternative definition of the content of the value set. There are two different ways to use
  * this expression extension: If both an expression and a compose element is present, the compose is understood the make the same
  * statement as the expression. If there is no compose, the expression is the only definition of the value set, and the value set
  * can only be processed by a server that understands the expression syntax, it that is computable.
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all
  * resources.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: value. Requires the following fields which were optional in the
  *   parent: value. Forbids the use of the following fields which were optional in the parent: extension. Hardcodes the value of
  *   the following fields: url.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *     spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see
  *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Valueset_expression(
    override val id: Option[String] = None,
    value: Expression,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/valueset-expression",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
