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
import com.babylonhealth.lit.core.{ ALL_TYPES, SORT_DIRECTION }
import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

object DataRequirement extends CompanionFor[DataRequirement] {
  implicit def summonObjectAndCompanionDataRequirement1813028335(
      o: DataRequirement): ObjectAndCompanion[DataRequirement, DataRequirement.type] = ObjectAndCompanion(o, this)
  override type ResourceType = DataRequirement
  override type ParentType   = DataRequirement
  override val baseType: CompanionFor[ResourceType] = DataRequirement
  override val parentType: CompanionFor[ParentType] = DataRequirement
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/DataRequirement")
  object DateFilter extends CompanionFor[DateFilter] {
    implicit def summonObjectAndCompanionDateFilter167096238(
        o: DateFilter): ObjectAndCompanion[DateFilter, DateFilter.type] = ObjectAndCompanion(o, this)
    override type ResourceType = DateFilter
    override type ParentType   = DateFilter
    override val parentType: CompanionFor[ResourceType] = DateFilter
    type ValueChoice = Choice[Union_1947777294]
    def apply(
        id: Option[String] = None,
        path: Option[String] = None,
        value: Option[DateFilter.ValueChoice] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        searchParam: Option[String] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): DateFilter = new DateFilter(
      id,
      path,
      value,
      extension,
      searchParam,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: DateFilter): Option[(Option[String], Option[String], Option[DateFilter.ValueChoice], LitSeq[Extension], Option[String])] =
      Some((o.id, o.path, o.value, o.extension, o.searchParam))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val path: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("path", lTagOf[Option[String]], false, lTagOf[String])
    val value: FHIRComponentFieldMeta[Option[DateFilter.ValueChoice]] =
      FHIRComponentFieldMeta("value", lTagOf[Option[DateFilter.ValueChoice]], true, lTagOf[Union_1947777294])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val searchParam: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("searchParam", lTagOf[Option[String]], false, lTagOf[String])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, path, value, extension, searchParam)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: DateFilter): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](path, t.path),
      FHIRComponentField[Option[DateFilter.ValueChoice]](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](searchParam, t.searchParam)
    )
    val baseType: CompanionFor[DateFilter] = this
    val thisName: String                   = "DateFilter"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DateFilter] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new DateFilter(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("path", Some(None)),
            cursor.decodeOptRef[Union_1947777294]("value"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("searchParam", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class DateFilter(
      override val id: Option[String] = None,
      val path: Option[String] = None,
      val value: Option[DateFilter.ValueChoice] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val searchParam: Option[String] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends Element(id = id, extension = extension)
  object CodeFilter extends CompanionFor[CodeFilter] {
    implicit def summonObjectAndCompanionCodeFilter540025153(
        o: CodeFilter): ObjectAndCompanion[CodeFilter, CodeFilter.type] = ObjectAndCompanion(o, this)
    override type ResourceType = CodeFilter
    override type ParentType   = CodeFilter
    override val parentType: CompanionFor[ResourceType] = CodeFilter
    def apply(
        id: Option[String] = None,
        path: Option[String] = None,
        code: LitSeq[Coding] = LitSeq.empty,
        valueSet: Option[Canonical] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        searchParam: Option[String] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): CodeFilter = new CodeFilter(
      id,
      path,
      code,
      valueSet,
      extension,
      searchParam,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: CodeFilter): Option[(Option[String], Option[String], LitSeq[Coding], Option[Canonical], LitSeq[Extension], Option[String])] =
      Some((o.id, o.path, o.code, o.valueSet, o.extension, o.searchParam))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val path: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("path", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[LitSeq[Coding]] =
      FHIRComponentFieldMeta("code", lTagOf[LitSeq[Coding]], false, lTagOf[Coding])
    val valueSet: FHIRComponentFieldMeta[Option[Canonical]] =
      FHIRComponentFieldMeta("valueSet", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val searchParam: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("searchParam", lTagOf[Option[String]], false, lTagOf[String])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, path, code, valueSet, extension, searchParam)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: CodeFilter): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](path, t.path),
      FHIRComponentField[LitSeq[Coding]](code, t.code),
      FHIRComponentField[Option[Canonical]](valueSet, t.valueSet),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](searchParam, t.searchParam)
    )
    val baseType: CompanionFor[CodeFilter] = this
    val thisName: String                   = "CodeFilter"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CodeFilter] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new CodeFilter(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("path", Some(None)),
            cursor.decodeAs[LitSeq[Coding]]("code", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Canonical]]("valueSet", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("searchParam", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class CodeFilter(
      override val id: Option[String] = None,
      val path: Option[String] = None,
      val code: LitSeq[Coding] = LitSeq.empty,
      val valueSet: Option[Canonical] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val searchParam: Option[String] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends Element(id = id, extension = extension)
  object Sort extends CompanionFor[Sort] {
    implicit def summonObjectAndCompanionSort725645701(o: Sort): ObjectAndCompanion[Sort, Sort.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Sort
    override type ParentType   = Sort
    override val parentType: CompanionFor[ResourceType] = Sort
    def apply(
        id: Option[String] = None,
        path: String,
        extension: LitSeq[Extension] = LitSeq.empty,
        direction: SORT_DIRECTION,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Sort = new Sort(
      id,
      path,
      extension,
      direction,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Sort): Option[(Option[String], String, LitSeq[Extension], SORT_DIRECTION)] = Some(
      (o.id, o.path, o.extension, o.direction))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val path: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("path", lTagOf[String], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val direction: FHIRComponentFieldMeta[SORT_DIRECTION] =
      FHIRComponentFieldMeta("direction", lTagOf[SORT_DIRECTION], false, lTagOf[SORT_DIRECTION])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, path, extension, direction)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Sort): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[String](path, t.path),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[SORT_DIRECTION](direction, t.direction)
    )
    val baseType: CompanionFor[Sort] = this
    val thisName: String             = "Sort"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Sort] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Sort(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[String]("path", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[SORT_DIRECTION]("direction", None),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Sort(
      override val id: Option[String] = None,
      val path: String,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val direction: SORT_DIRECTION,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends Element(id = id, extension = extension)
  type SubjectChoice = Choice[Union01025009075]
  def apply(
      id: Option[String] = None,
      `type`: ALL_TYPES,
      limit: Option[PositiveInt] = None,
      profile: LitSeq[Canonical] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      subject: Option[DataRequirement.SubjectChoice] = None,
      mustSupport: LitSeq[String] = LitSeq.empty,
      sort: LitSeq[DataRequirement.Sort] = LitSeq.empty,
      codeFilter: LitSeq[DataRequirement.CodeFilter] = LitSeq.empty,
      dateFilter: LitSeq[DataRequirement.DateFilter] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): DataRequirement = new DataRequirement(
    id,
    `type`,
    limit,
    profile,
    extension,
    subject,
    mustSupport,
    sort,
    codeFilter,
    dateFilter,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val `type`: FHIRComponentFieldMeta[ALL_TYPES] =
    FHIRComponentFieldMeta("type", lTagOf[ALL_TYPES], false, lTagOf[ALL_TYPES])
  val limit: FHIRComponentFieldMeta[Option[PositiveInt]] =
    FHIRComponentFieldMeta("limit", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
  val profile: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("profile", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val subject: FHIRComponentFieldMeta[Option[DataRequirement.SubjectChoice]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[DataRequirement.SubjectChoice]], true, lTagOf[Union01025009075])
  val mustSupport: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("mustSupport", lTagOf[LitSeq[String]], false, lTagOf[String])
  val sort: FHIRComponentFieldMeta[LitSeq[DataRequirement.Sort]] =
    FHIRComponentFieldMeta("sort", lTagOf[LitSeq[DataRequirement.Sort]], false, lTagOf[DataRequirement.Sort])
  val codeFilter: FHIRComponentFieldMeta[LitSeq[DataRequirement.CodeFilter]] =
    FHIRComponentFieldMeta(
      "codeFilter",
      lTagOf[LitSeq[DataRequirement.CodeFilter]],
      false,
      lTagOf[DataRequirement.CodeFilter])
  val dateFilter: FHIRComponentFieldMeta[LitSeq[DataRequirement.DateFilter]] =
    FHIRComponentFieldMeta(
      "dateFilter",
      lTagOf[LitSeq[DataRequirement.DateFilter]],
      false,
      lTagOf[DataRequirement.DateFilter])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, `type`, limit, profile, extension, subject, mustSupport, sort, codeFilter, dateFilter)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: DataRequirement): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[ALL_TYPES](`type`, t.`type`),
    FHIRComponentField[Option[PositiveInt]](limit, t.limit),
    FHIRComponentField[LitSeq[Canonical]](profile, t.profile),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[DataRequirement.SubjectChoice]](subject, t.subject),
    FHIRComponentField[LitSeq[String]](mustSupport, t.mustSupport),
    FHIRComponentField[LitSeq[DataRequirement.Sort]](sort, t.sort),
    FHIRComponentField[LitSeq[DataRequirement.CodeFilter]](codeFilter, t.codeFilter),
    FHIRComponentField[LitSeq[DataRequirement.DateFilter]](dateFilter, t.dateFilter)
  )
  def extractId(t: DataRequirement): Option[String]                             = t.id
  def extractType(t: DataRequirement): ALL_TYPES                                = t.`type`
  def extractLimit(t: DataRequirement): Option[PositiveInt]                     = t.limit
  def extractProfile(t: DataRequirement): LitSeq[Canonical]                     = t.profile
  def extractExtension(t: DataRequirement): LitSeq[Extension]                   = t.extension
  def extractSubject(t: DataRequirement): Option[DataRequirement.SubjectChoice] = t.subject
  def extractMustSupport(t: DataRequirement): LitSeq[String]                    = t.mustSupport
  def extractSort(t: DataRequirement): LitSeq[DataRequirement.Sort]             = t.sort
  def extractCodeFilter(t: DataRequirement): LitSeq[DataRequirement.CodeFilter] = t.codeFilter
  def extractDateFilter(t: DataRequirement): LitSeq[DataRequirement.DateFilter] = t.dateFilter
  override val thisName: String                                                 = "DataRequirement"
  def unapply(
      o: DataRequirement): Option[(Option[String], ALL_TYPES, Option[PositiveInt], LitSeq[Canonical], LitSeq[Extension], Option[DataRequirement.SubjectChoice], LitSeq[String], LitSeq[DataRequirement.Sort], LitSeq[DataRequirement.CodeFilter], LitSeq[DataRequirement.DateFilter])] =
    Some(
      (o.id, o.`type`, o.limit, o.profile, o.extension, o.subject, o.mustSupport, o.sort, o.codeFilter, o.dateFilter))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DataRequirement] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new DataRequirement(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[ALL_TYPES]("type", None),
          cursor.decodeAs[Option[PositiveInt]]("limit", Some(None)),
          cursor.decodeAs[LitSeq[Canonical]]("profile", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union01025009075]("subject"),
          cursor.decodeAs[LitSeq[String]]("mustSupport", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DataRequirement.Sort]]("sort", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DataRequirement.CodeFilter]]("codeFilter", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DataRequirement.DateFilter]]("dateFilter", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for DataRequirement Type: Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
  *
  *  Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a resource.)
  *
  * @constructor Introduces the fields `type`, limit, profile, subject, mustSupport, sort, codeFilter, dateFilter.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param `type` - The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.
  * @param limit - Specifies a maximum number of results that are required (uses the _count search parameter).
  * @param profile - The profile of the required data, specified as the uri of the profile definition.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param subject - The intended subjects of the data requirement. If this element is not provided, a Patient subject is assumed.
  * @param mustSupport - Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available.
  * The value of mustSupport SHALL be a FHIRPath resolveable on the type of the DataRequirement. The path SHALL consist only of identifiers, constant indexers, and .resolve() (see the [Simple FHIRPath Profile](fhirpath.html#simple) for full details).
  * @param sort - Specifies the order of the results to be returned.
  * @param codeFilter - Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data. Each code filter defines an additional constraint on the data, i.e. code filters are AND'ed, not OR'ed.
  * @param dateFilter - Date filters specify additional constraints on the data in terms of the applicable date range for specific elements. Each date filter specifies an additional constraint on the data, i.e. date filters are AND'ed, not OR'ed.
  */
@POJOBoilerplate
class DataRequirement(
    override val id: Option[String] = None,
    val `type`: ALL_TYPES,
    val limit: Option[PositiveInt] = None,
    val profile: LitSeq[Canonical] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val subject: Option[DataRequirement.SubjectChoice] = None,
    val mustSupport: LitSeq[String] = LitSeq.empty,
    val sort: LitSeq[DataRequirement.Sort] = LitSeq.empty,
    val codeFilter: LitSeq[DataRequirement.CodeFilter] = LitSeq.empty,
    val dateFilter: LitSeq[DataRequirement.DateFilter] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "DataRequirement"
}
