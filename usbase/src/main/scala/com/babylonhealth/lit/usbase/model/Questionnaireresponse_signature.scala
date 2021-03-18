package com.babylonhealth.lit.usbase.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.Try

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

object Questionnaireresponse_signature extends CompanionFor[Questionnaireresponse_signature] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/questionnaireresponse-signature")
  def apply(
      id: Option[String] = None,
      value: Signature,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Questionnaireresponse_signature = new Questionnaireresponse_signature(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Signature] =
    FHIRComponentFieldMeta("value", lTagOf[Signature], true, lTagOf[Signature])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fields(t: Questionnaireresponse_signature): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Signature](value, t.value.get.toSubRefNonUnion[Signature])
  )
  def extractId(t: Questionnaireresponse_signature): Option[String]                   = t.id
  def extractValue(t: Questionnaireresponse_signature): Signature                     = t.value.get.toSubRefNonUnion[Signature]
  override val thisName: String                                                       = "Questionnaireresponse_signature"
  override val searchParams: Map[String, Questionnaireresponse_signature => Seq[Any]] = Extension.searchParams
  def unapply(o: Questionnaireresponse_signature): Option[(Option[String], Signature)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[Signature]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Questionnaireresponse_signature] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Questionnaireresponse_signature(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Signature]("valueSignature", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Represents a wet or electronic signature for either the form overall or for the question or item it's associated with.
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
class Questionnaireresponse_signature(
    override val id: Option[String] = None,
    value: Signature,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/questionnaireresponse-signature",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
