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
import com.babylonhealth.lit.usbase.MATCH_GRADE
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Match_grade extends CompanionFor[Match_grade] {
  override type ResourceType = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/match-grade")
  def apply(
      id: Option[String] = None,
      value: MATCH_GRADE,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Match_grade = new Match_grade(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[MATCH_GRADE] =
    FHIRComponentFieldMeta("value", lTagOf[MATCH_GRADE], true, lTagOf[MATCH_GRADE])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[MATCH_GRADE](value, MATCH_GRADE.withName(t.value.get.value.asInstanceOf[Code]))
    ))
  override def fields(t: Match_grade): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Match_grade): Option[String]                   = t.id
  def extractValue(t: Match_grade): MATCH_GRADE                   = MATCH_GRADE.withName(t.value.get.value.asInstanceOf[Code])
  override val thisName: String                                   = "Match_grade"
  override val searchParams: Map[String, Match_grade => Seq[Any]] = Extension.searchParams
  def unapply(o: Match_grade): Option[(Option[String], MATCH_GRADE)] = Some(
    (o.id, MATCH_GRADE.withName(o.value.get.value.asInstanceOf[Code])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Match_grade] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Match_grade(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[MATCH_GRADE]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Assessment of resource match outcome - how likely this resource is to be a match.
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
class Match_grade(
    override val id: Option[String] = None,
    value: MATCH_GRADE,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/match-grade",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
