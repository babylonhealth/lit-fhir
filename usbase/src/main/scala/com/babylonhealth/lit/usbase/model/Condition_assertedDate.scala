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

object Condition_assertedDate extends CompanionFor[Condition_assertedDate] {
  implicit def summonObjectAndCompanionCondition_assertedDate1802912007(
      o: Condition_assertedDate): ObjectAndCompanion[Condition_assertedDate, Condition_assertedDate.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/condition-assertedDate")
  def apply(
      id: Option[String] = None,
      value: FHIRDateTime,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Condition_assertedDate = new Condition_assertedDate(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("value", lTagOf[FHIRDateTime], true, lTagOf[FHIRDateTime])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[FHIRDateTime](value, t.value.get.toSubRefNonUnion[FHIRDateTime])
    ))
  override def fields(t: Condition_assertedDate): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Condition_assertedDate): Option[String]                   = t.id
  def extractValue(t: Condition_assertedDate): FHIRDateTime = t.value.get.toSubRefNonUnion[FHIRDateTime]
  override val thisName: String                             = "Condition_assertedDate"
  override val searchParams: Map[String, Condition_assertedDate => Seq[Any]] = Extension.searchParams
  def unapply(o: Condition_assertedDate): Option[(Option[String], FHIRDateTime)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[FHIRDateTime]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Condition_assertedDate] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Condition_assertedDate(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[FHIRDateTime]("valueDateTime", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The date on which the existence of the Condition was first asserted or acknowledged.
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element -
  * found in all resources.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: value. Requires the following fields which were optional in
  *   the parent: value. Forbids the use of the following fields which were optional in the parent: extension. Hardcodes
  *   the value of the following fields: url.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does
  *   not contain spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see
  *   [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Condition_assertedDate(
    override val id: Option[String] = None,
    value: FHIRDateTime,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/condition-assertedDate",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
