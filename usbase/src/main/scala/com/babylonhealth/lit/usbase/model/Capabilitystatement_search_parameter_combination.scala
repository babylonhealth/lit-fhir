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

object Capabilitystatement_search_parameter_combination extends CompanionFor[Capabilitystatement_search_parameter_combination] {
  implicit def summonObjectAndCompanionCapabilitystatement_search_parameter_combination_1498247983(
      o: Capabilitystatement_search_parameter_combination): ObjectAndCompanion[Capabilitystatement_search_parameter_combination, Capabilitystatement_search_parameter_combination.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/capabilitystatement-search-parameter-combination")
  def apply(
      id: Option[String] = None,
      extension: NonEmptyLitSeq[Extension],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Capabilitystatement_search_parameter_combination = new Capabilitystatement_search_parameter_combination(
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
  override def fields(t: Capabilitystatement_search_parameter_combination): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Capabilitystatement_search_parameter_combination): Option[String]                   = t.id
  def extractExtension(t: Capabilitystatement_search_parameter_combination): NonEmptyLitSeq[Extension] = t.extension.asNonEmpty
  override val thisName: String = "Capabilitystatement_search_parameter_combination"
  override val searchParams: Map[String, Capabilitystatement_search_parameter_combination => Seq[Any]] = Extension.searchParams
  def unapply(o: Capabilitystatement_search_parameter_combination): Option[(Option[String], NonEmptyLitSeq[Extension])] = Some(
    (o.id, o.extension.asNonEmpty))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Capabilitystatement_search_parameter_combination] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Capabilitystatement_search_parameter_combination(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[Extension]]("extension", None),
          decodeAttributes(cursor)
        )
      ))
}

/** This extension defines a possible search parameter combination, by listing a set of search parameters and indicating whether
  * they are required or optional. If a search combination is specified, clients should expect that they must submit a search that
  * meets one of the required combinations or the search will be unsuccessful. If multiple search parameter combinations are
  * specified, a client may pick between them, and supply the minimal required parameters for any of the combinations.
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all
  * resources.)
  *
  * @constructor
  *   Inherits all params from parent. Requires the following fields which were optional in the parent: extension. Forbids the use
  *   of the following fields which were optional in the parent: value. Hardcodes the value of the following fields: url.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *     spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  */
@POJOBoilerplate
class Capabilitystatement_search_parameter_combination(
    override val id: Option[String] = None,
    extension: NonEmptyLitSeq[Extension],
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      extension = extension.refine,
      url = "http://hl7.org/fhir/StructureDefinition/capabilitystatement-search-parameter-combination",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
