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

object Elementdefinition_bestpractice extends CompanionFor[Elementdefinition_bestpractice] {
  implicit def summonObjectAndCompanionElementdefinition_bestpractice1416089088(
      o: Elementdefinition_bestpractice): ObjectAndCompanion[Elementdefinition_bestpractice, Elementdefinition_bestpractice.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/elementdefinition-bestpractice")
  type ValueChoice = Choice[Union_1768247138]
  def apply(
      id: Option[String] = None,
      value: Elementdefinition_bestpractice.ValueChoice,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Elementdefinition_bestpractice = new Elementdefinition_bestpractice(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Elementdefinition_bestpractice.ValueChoice] =
    FHIRComponentFieldMeta("value", lTagOf[Elementdefinition_bestpractice.ValueChoice], true, lTagOf[Union_1768247138])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Elementdefinition_bestpractice.ValueChoice](value, t.value.get.toSubRef)
    ))
  override def fields(t: Elementdefinition_bestpractice): Seq[FHIRComponentField[_]]              = fieldsFromParent(t).get
  def extractId(t: Elementdefinition_bestpractice): Option[String]                                = t.id
  def extractValue(t: Elementdefinition_bestpractice): Elementdefinition_bestpractice.ValueChoice = t.value.get.toSubRef
  override val thisName: String                                                                   = "Elementdefinition_bestpractice"
  override val searchParams: Map[String, Elementdefinition_bestpractice => Seq[Any]]              = Extension.searchParams
  def unapply(o: Elementdefinition_bestpractice): Option[(Option[String], Elementdefinition_bestpractice.ValueChoice)] =
    Some((o.id, o.value.get.toSubRef))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Elementdefinition_bestpractice] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Elementdefinition_bestpractice(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeRef[Union_1768247138]("value"),
          decodeAttributes(cursor)
        )
      ))
}

/** Mark that an invariant represents 'best practice' rule - a rule that implementers may choose to enforce at error level in some or all circumstances.
  *
  *  Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all resources.)
  *
  * @constructor Inherits all params from parent.
  *              Refines the types of: value.
  *              Requires the following fields which were optional in the parent: value.
  *              Forbids the use of the following fields which were optional in the parent: extension.
  *              Hardcodes the value of the following fields: url.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - Source of the definition for the extension code - a logical name or a URL.
  * @param value - Value of extension - must be one of a constrained set of the data types (see [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Elementdefinition_bestpractice(
    override val id: Option[String] = None,
    value: Elementdefinition_bestpractice.ValueChoice,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(value.toSuperRef),
      url = "http://hl7.org/fhir/StructureDefinition/elementdefinition-bestpractice",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
