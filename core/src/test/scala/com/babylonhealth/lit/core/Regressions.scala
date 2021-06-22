package com.babylonhealth.lit.core

import scala.collection.immutable.TreeMap
import scala.util.Try

import io.circe.HCursor
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core
import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.TagSummoners.lTagOf
import com.babylonhealth.lit.core.model.Extension
import com.babylonhealth.lit.macros.POJOBoilerplate

object Data_absent_reason extends CompanionFor[Data_absent_reason] {
  implicit def summonObjectAndCompanionData_absent_reason_1845545037(
      o: Data_absent_reason): ObjectAndCompanion[Data_absent_reason, Data_absent_reason.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/data-absent-reason")
  def apply(
      id: Option[String] = None,
      value: ADDRESS_TYPE,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Data_absent_reason = new Data_absent_reason(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[ADDRESS_TYPE] =
    FHIRComponentFieldMeta("value", lTagOf[ADDRESS_TYPE], true, lTagOf[ADDRESS_TYPE])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[ADDRESS_TYPE](value, ADDRESS_TYPE.withName(t.value.get.toSubRefNonUnion[Code]))
    ))
  override def fields(t: Data_absent_reason): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Data_absent_reason): Option[String]                   = t.id
  def extractValue(t: Data_absent_reason): ADDRESS_TYPE =
    ADDRESS_TYPE.withName(t.value.get.toSubRefNonUnion[Code])
  override val thisName: String                                          = "Data_absent_reason"
  override val searchParams: Map[String, Data_absent_reason => Seq[Any]] = Extension.searchParams
  def unapply(o: Data_absent_reason): Option[(Option[String], ADDRESS_TYPE)] = Some(
    (o.id, ADDRESS_TYPE.withName(o.value.get.toSubRefNonUnion[Code])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Data_absent_reason] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Data_absent_reason(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[ADDRESS_TYPE]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Provides a reason why the expected value or elements in the element that is extended are missing.
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
  *   spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see
  *   [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
class Data_absent_reason(
    override val id: Option[String] = None,
    value: ADDRESS_TYPE,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choiceFromEnum(value)),
      url = "http://hl7.org/fhir/StructureDefinition/data-absent-reason",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}

class Regressions extends AnyFreeSpec with Matchers {
  "can use enummy choice thingy" in {
    val _ = Data_absent_reason
  }
}
