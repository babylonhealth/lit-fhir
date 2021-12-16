package com.babylonhealth.lit.uscore.model

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
import com.babylonhealth.lit.usbase.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.hl7.UnionAliases._
import com.babylonhealth.lit.usbase.UnionAliases._

import com.babylonhealth.lit.{ core, hl7, usbase, uscore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Us_core_race extends CompanionFor[Us_core_race] {
  implicit def summonObjectAndCompanionUs_core_race400036324(
      o: Us_core_race): ObjectAndCompanion[Us_core_race, Us_core_race.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/us/core/StructureDefinition/us-core-race")
  def apply(
      id: Option[String] = None,
      extension: NonEmptyLitSeq[Extension],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Us_core_race = new Us_core_race(
    id,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val extension: FHIRComponentFieldMeta[NonEmptyLitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[NonEmptyLitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[NonEmptyLitSeq[Extension]](extension, t.extension.asNonEmpty)
    ))
  override def fields(t: Us_core_race): Seq[FHIRComponentField[_]]                  = fieldsFromParent(t).get
  def extractId(t: Us_core_race): Option[String]                                    = t.id
  def extractExtension(t: Us_core_race): NonEmptyLitSeq[Extension]                  = t.extension.asNonEmpty
  override val thisName: String                                                     = "Us_core_race"
  override val searchParams: Map[String, Us_core_race => Seq[Any]]                  = Extension.searchParams
  def unapply(o: Us_core_race): Option[(Option[String], NonEmptyLitSeq[Extension])] = Some((o.id, o.extension.asNonEmpty))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Us_core_race] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Us_core_race(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[Extension]]("extension", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Concepts classifying the person into a named category of humans sharing common history, traits, geographical origin or
  * nationality. The race codes used to represent these concepts are based upon the [CDC Race and Ethnicity Code Set Version
  * 1.0](http://www.cdc.gov/phin/resources/vocabulary/index.html) which includes over 900 concepts for representing race and
  * ethnicity of which 921 reference race. The race concepts are grouped by and pre-mapped to the 5 OMB race categories:
  * - American Indian or Alaska Native
  * - Asian
  * - Black or African American
  * - Native Hawaiian or Other Pacific Islander
  * - White.
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all
  * resources.)
  *
  * @constructor
  *   Inherits all params from parent. Requires the following fields which were optional in the parent: extension. Forbids the use
  *   of the following fields which were optional in the parent: value. Hardcodes the value of the following fields: url.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  */
@POJOBoilerplate
class Us_core_race(
    override val id: Option[String] = None,
    extension: NonEmptyLitSeq[Extension],
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      extension = extension.refine,
      url = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-race",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
