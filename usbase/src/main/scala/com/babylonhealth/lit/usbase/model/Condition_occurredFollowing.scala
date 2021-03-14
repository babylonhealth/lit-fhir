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

object Condition_occurredFollowing extends CompanionFor[Condition_occurredFollowing] {
  override val baseType: CompanionFor[Extension] = Extension
  type ValueChoice = Choice[Union01025009075]
  def apply(
      id: Option[String] = None,
      url: String,
      value: Condition_occurredFollowing.ValueChoice,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Condition_occurredFollowing = new Condition_occurredFollowing(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Condition_occurredFollowing.ValueChoice] =
    FHIRComponentFieldMeta("value", lTagOf[Condition_occurredFollowing.ValueChoice], true, lTagOf[Union01025009075])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Condition_occurredFollowing): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[Condition_occurredFollowing.ValueChoice](value, t.value.get.toSubRef)
  )
  def extractId(t: Condition_occurredFollowing): Option[String]                             = t.id
  def extractUrl(t: Condition_occurredFollowing): String                                    = t.url
  def extractValue(t: Condition_occurredFollowing): Condition_occurredFollowing.ValueChoice = t.value.get.toSubRef
  override val thisName: String                                                             = "Condition_occurredFollowing"
  override val searchParams: Map[String, Condition_occurredFollowing => Seq[Any]]           = Extension.searchParams
  def unapply(
      o: Condition_occurredFollowing): Option[(Option[String], String, Condition_occurredFollowing.ValueChoice)] = Some(
    (o.id, o.url, o.value.get.toSubRef))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Condition_occurredFollowing] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Condition_occurredFollowing(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeRef[Union01025009075]("value"),
          decodeAttributes(cursor)
        )
      ))
}

/** Further conditions, problems, diagnoses, procedures or events or the substance that preceded this Condition.
  *
  *  Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all resources.)
  *
  * @constructor Inherits all params from parent.
  *              Refines the types of: value.
  *              Requires the following fields which were optional in the parent: value.
  *              Forbids the use of the following fields which were optional in the parent: extension.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - Source of the definition for the extension code - a logical name or a URL.
  * @param value - Value of extension - must be one of a constrained set of the data types (see [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Condition_occurredFollowing(
    override val id: Option[String] = None,
    override val url: String,
    value: Condition_occurredFollowing.ValueChoice,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(value.toSuperRef), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}