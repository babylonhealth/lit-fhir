package com.babylonhealth.lit.hl7.model

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
import com.babylonhealth.lit.hl7.{ PUBLICATION_STATUS, FILTER_OPERATOR }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ValueSet extends CompanionFor[ValueSet] {
  override type ResourceType = ValueSet
  override type ParentType   = ValueSet
  override val baseType: CompanionFor[ResourceType] = ValueSet
  override val parentType: CompanionFor[ParentType] = ValueSet
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ValueSet")
  object Compose extends CompanionFor[Compose] {
    override type ResourceType = Compose
    override type ParentType   = Compose
    override val parentType: CompanionFor[ResourceType] = Compose
    object Include extends CompanionFor[Include] {
      override type ResourceType = Include
      override type ParentType   = Include
      override val parentType: CompanionFor[ResourceType] = Include
      object Filter extends CompanionFor[Filter] {
        override type ResourceType = Filter
        override type ParentType   = Filter
        override val parentType: CompanionFor[ResourceType] = Filter
        def apply(
            id: Option[String] = None,
            op: FILTER_OPERATOR,
            value: String,
            property: Code,
            extension: LitSeq[Extension] = LitSeq.empty,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Filter = new Filter(
          id,
          op,
          value,
          property,
          extension,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Filter): Option[(Option[String], FILTER_OPERATOR, String, Code, LitSeq[Extension], LitSeq[Extension])] =
          Some((o.id, o.op, o.value, o.property, o.extension, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val op: FHIRComponentFieldMeta[FILTER_OPERATOR] =
          FHIRComponentFieldMeta("op", lTagOf[FILTER_OPERATOR], false, lTagOf[FILTER_OPERATOR])
        val value: FHIRComponentFieldMeta[String] =
          FHIRComponentFieldMeta("value", lTagOf[String], false, lTagOf[String])
        val property: FHIRComponentFieldMeta[Code] =
          FHIRComponentFieldMeta("property", lTagOf[Code], false, lTagOf[Code])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, op, value, property, extension, modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Filter): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[FILTER_OPERATOR](op, t.op),
          FHIRComponentField[String](value, t.value),
          FHIRComponentField[Code](property, t.property),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Filter] = this
        val thisName: String               = "Filter"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Filter] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Filter(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[FILTER_OPERATOR]("op", None),
                cursor.decodeAs[String]("value", None),
                cursor.decodeAs[Code]("property", None),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Filter(
          override val id: Option[String] = None,
          val op: FILTER_OPERATOR,
          val value: String,
          val property: Code,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      object Concept extends CompanionFor[Concept] {
        override type ResourceType = Concept
        override type ParentType   = Concept
        override val parentType: CompanionFor[ResourceType] = Concept
        object Designation extends CompanionFor[Designation] {
          override type ResourceType = Designation
          override type ParentType   = Designation
          override val parentType: CompanionFor[ResourceType] = Designation
          def apply(
              id: Option[String] = None,
              use: Option[Coding] = None,
              value: String,
              language: Option[LANGUAGES] = None,
              extension: LitSeq[Extension] = LitSeq.empty,
              modifierExtension: LitSeq[Extension] = LitSeq.empty,
              primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
          ): Designation = new Designation(
            id,
            use,
            value,
            language,
            extension,
            modifierExtension,
            primitiveAttributes = primitiveAttributes
          )
          def unapply(
              o: Designation): Option[(Option[String], Option[Coding], String, Option[LANGUAGES], LitSeq[Extension], LitSeq[Extension])] =
            Some((o.id, o.use, o.value, o.language, o.extension, o.modifierExtension))
          val id: FHIRComponentFieldMeta[Option[String]] =
            FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
          val use: FHIRComponentFieldMeta[Option[Coding]] =
            FHIRComponentFieldMeta("use", lTagOf[Option[Coding]], false, lTagOf[Coding])
          val value: FHIRComponentFieldMeta[String] =
            FHIRComponentFieldMeta("value", lTagOf[String], false, lTagOf[String])
          val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
            FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
          val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
            FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
          val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
            FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
          val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, use, value, language, extension, modifierExtension)
          override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
          override def fields(t: Designation): Seq[FHIRComponentField[_]] = Seq(
            FHIRComponentField[Option[String]](id, t.id),
            FHIRComponentField[Option[Coding]](use, t.use),
            FHIRComponentField[String](value, t.value),
            FHIRComponentField[Option[LANGUAGES]](language, t.language),
            FHIRComponentField[LitSeq[Extension]](extension, t.extension),
            FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
          )
          val baseType: CompanionFor[Designation] = this
          val thisName: String                    = "Designation"
          def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Designation] =
            checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
              Try(
                new Designation(
                  cursor.decodeAs[Option[String]]("id", Some(None)),
                  cursor.decodeAs[Option[Coding]]("use", Some(None)),
                  cursor.decodeAs[String]("value", None),
                  cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
                  cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                  cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                  decodeAttributes(cursor)
                )
              ))
        }
        @POJOBoilerplate
        class Designation(
            override val id: Option[String] = None,
            val use: Option[Coding] = None,
            val value: String,
            val language: Option[LANGUAGES] = None,
            override val extension: LitSeq[Extension] = LitSeq.empty,
            override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
            override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
              FHIRObject.emptyAtts)
            extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
        def apply(
            id: Option[String] = None,
            code: Code,
            display: Option[String] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            designation: LitSeq[Concept.Designation] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Concept = new Concept(
          id,
          code,
          display,
          extension,
          modifierExtension,
          designation,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Concept): Option[(Option[String], Code, Option[String], LitSeq[Extension], LitSeq[Extension], LitSeq[Concept.Designation])] =
          Some((o.id, o.code, o.display, o.extension, o.modifierExtension, o.designation))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val code: FHIRComponentFieldMeta[Code] =
          FHIRComponentFieldMeta("code", lTagOf[Code], false, lTagOf[Code])
        val display: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("display", lTagOf[Option[String]], false, lTagOf[String])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val designation: FHIRComponentFieldMeta[LitSeq[Concept.Designation]] =
          FHIRComponentFieldMeta("designation", lTagOf[LitSeq[Concept.Designation]], false, lTagOf[Concept.Designation])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
          Seq(id, code, display, extension, modifierExtension, designation)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Concept): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Code](code, t.code),
          FHIRComponentField[Option[String]](display, t.display),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
          FHIRComponentField[LitSeq[Concept.Designation]](designation, t.designation)
        )
        val baseType: CompanionFor[Concept] = this
        val thisName: String                = "Concept"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Concept] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Concept(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Code]("code", None),
                cursor.decodeAs[Option[String]]("display", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Concept.Designation]]("designation", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Concept(
          override val id: Option[String] = None,
          val code: Code,
          val display: Option[String] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          val designation: LitSeq[Concept.Designation] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          system: Option[UriStr] = None,
          version: Option[String] = None,
          valueSet: LitSeq[Canonical] = LitSeq.empty,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          filter: LitSeq[Include.Filter] = LitSeq.empty,
          concept: LitSeq[Include.Concept] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Include = new Include(
        id,
        system,
        version,
        valueSet,
        extension,
        modifierExtension,
        filter,
        concept,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Include): Option[(Option[String], Option[UriStr], Option[String], LitSeq[Canonical], LitSeq[Extension], LitSeq[Extension], LitSeq[Include.Filter], LitSeq[Include.Concept])] =
        Some((o.id, o.system, o.version, o.valueSet, o.extension, o.modifierExtension, o.filter, o.concept))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val system: FHIRComponentFieldMeta[Option[UriStr]] =
        FHIRComponentFieldMeta("system", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
      val version: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
      val valueSet: FHIRComponentFieldMeta[LitSeq[Canonical]] =
        FHIRComponentFieldMeta("valueSet", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val filter: FHIRComponentFieldMeta[LitSeq[Include.Filter]] =
        FHIRComponentFieldMeta("filter", lTagOf[LitSeq[Include.Filter]], false, lTagOf[Include.Filter])
      val concept: FHIRComponentFieldMeta[LitSeq[Include.Concept]] =
        FHIRComponentFieldMeta("concept", lTagOf[LitSeq[Include.Concept]], false, lTagOf[Include.Concept])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, system, version, valueSet, extension, modifierExtension, filter, concept)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Include): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[UriStr]](system, t.system),
        FHIRComponentField[Option[String]](version, t.version),
        FHIRComponentField[LitSeq[Canonical]](valueSet, t.valueSet),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[LitSeq[Include.Filter]](filter, t.filter),
        FHIRComponentField[LitSeq[Include.Concept]](concept, t.concept)
      )
      val baseType: CompanionFor[Include] = this
      val thisName: String                = "Include"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Include] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Include(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[UriStr]]("system", Some(None)),
              cursor.decodeAs[Option[String]]("version", Some(None)),
              cursor.decodeAs[LitSeq[Canonical]]("valueSet", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Include.Filter]]("filter", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Include.Concept]]("concept", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Include(
        override val id: Option[String] = None,
        val system: Option[UriStr] = None,
        val version: Option[String] = None,
        val valueSet: LitSeq[Canonical] = LitSeq.empty,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val filter: LitSeq[Include.Filter] = LitSeq.empty,
        val concept: LitSeq[Include.Concept] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        exclude: LitSeq[ValueSet.Compose.Include] = LitSeq.empty,
        inactive: Option[Boolean] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        lockedDate: Option[FHIRDate] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        include: NonEmptyLitSeq[Compose.Include],
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Compose = new Compose(
      id,
      exclude,
      inactive,
      extension,
      lockedDate,
      modifierExtension,
      include,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Compose): Option[(Option[String], LitSeq[ValueSet.Compose.Include], Option[Boolean], LitSeq[Extension], Option[FHIRDate], LitSeq[Extension], NonEmptyLitSeq[Compose.Include])] =
      Some((o.id, o.exclude, o.inactive, o.extension, o.lockedDate, o.modifierExtension, o.include))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val exclude: FHIRComponentFieldMeta[LitSeq[ValueSet.Compose.Include]] =
      FHIRComponentFieldMeta(
        "exclude",
        lTagOf[LitSeq[ValueSet.Compose.Include]],
        false,
        lTagOf[ValueSet.Compose.Include])
    val inactive: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("inactive", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val lockedDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
      FHIRComponentFieldMeta("lockedDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val include: FHIRComponentFieldMeta[NonEmptyLitSeq[Compose.Include]] =
      FHIRComponentFieldMeta("include", lTagOf[NonEmptyLitSeq[Compose.Include]], false, lTagOf[Compose.Include])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, exclude, inactive, extension, lockedDate, modifierExtension, include)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Compose): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[ValueSet.Compose.Include]](exclude, t.exclude),
      FHIRComponentField[Option[Boolean]](inactive, t.inactive),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[FHIRDate]](lockedDate, t.lockedDate),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[NonEmptyLitSeq[Compose.Include]](include, t.include)
    )
    val baseType: CompanionFor[Compose] = this
    val thisName: String                = "Compose"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Compose] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Compose(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[ValueSet.Compose.Include]]("exclude", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Boolean]]("inactive", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[FHIRDate]]("lockedDate", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[NonEmptyLitSeq[Compose.Include]]("include", None),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Compose(
      override val id: Option[String] = None,
      val exclude: LitSeq[ValueSet.Compose.Include] = LitSeq.empty,
      val inactive: Option[Boolean] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val lockedDate: Option[FHIRDate] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val include: NonEmptyLitSeq[Compose.Include],
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Expansion extends CompanionFor[Expansion] {
    override type ResourceType = Expansion
    override type ParentType   = Expansion
    override val parentType: CompanionFor[ResourceType] = Expansion
    object Contains extends CompanionFor[Contains] {
      override type ResourceType = Contains
      override type ParentType   = Contains
      override val parentType: CompanionFor[ResourceType] = Contains
      def apply(
          id: Option[String] = None,
          code: Option[Code] = None,
          system: Option[UriStr] = None,
          version: Option[String] = None,
          display: Option[String] = None,
          `abstract`: Option[Boolean] = None,
          inactive: Option[Boolean] = None,
          contains: LitSeq[ValueSet.Expansion.Contains] = LitSeq.empty,
          extension: LitSeq[Extension] = LitSeq.empty,
          designation: LitSeq[ValueSet.Compose.Include.Concept.Designation] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Contains = new Contains(
        id,
        code,
        system,
        version,
        display,
        `abstract`,
        inactive,
        contains,
        extension,
        designation,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Contains): Option[(Option[String], Option[Code], Option[UriStr], Option[String], Option[String], Option[Boolean], Option[Boolean], LitSeq[ValueSet.Expansion.Contains], LitSeq[Extension], LitSeq[ValueSet.Compose.Include.Concept.Designation], LitSeq[Extension])] =
        Some(
          (
            o.id,
            o.code,
            o.system,
            o.version,
            o.display,
            o.`abstract`,
            o.inactive,
            o.contains,
            o.extension,
            o.designation,
            o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val code: FHIRComponentFieldMeta[Option[Code]] =
        FHIRComponentFieldMeta("code", lTagOf[Option[Code]], false, lTagOf[Code])
      val system: FHIRComponentFieldMeta[Option[UriStr]] =
        FHIRComponentFieldMeta("system", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
      val version: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
      val display: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("display", lTagOf[Option[String]], false, lTagOf[String])
      val `abstract`: FHIRComponentFieldMeta[Option[Boolean]] =
        FHIRComponentFieldMeta("abstract", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
      val inactive: FHIRComponentFieldMeta[Option[Boolean]] =
        FHIRComponentFieldMeta("inactive", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
      val contains: FHIRComponentFieldMeta[LitSeq[ValueSet.Expansion.Contains]] =
        FHIRComponentFieldMeta(
          "contains",
          lTagOf[LitSeq[ValueSet.Expansion.Contains]],
          false,
          lTagOf[ValueSet.Expansion.Contains])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val designation: FHIRComponentFieldMeta[LitSeq[ValueSet.Compose.Include.Concept.Designation]] =
        FHIRComponentFieldMeta(
          "designation",
          lTagOf[LitSeq[ValueSet.Compose.Include.Concept.Designation]],
          false,
          lTagOf[ValueSet.Compose.Include.Concept.Designation])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
        id,
        code,
        system,
        version,
        display,
        `abstract`,
        inactive,
        contains,
        extension,
        designation,
        modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Contains): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Code]](code, t.code),
        FHIRComponentField[Option[UriStr]](system, t.system),
        FHIRComponentField[Option[String]](version, t.version),
        FHIRComponentField[Option[String]](display, t.display),
        FHIRComponentField[Option[Boolean]](`abstract`, t.`abstract`),
        FHIRComponentField[Option[Boolean]](inactive, t.inactive),
        FHIRComponentField[LitSeq[ValueSet.Expansion.Contains]](contains, t.contains),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[ValueSet.Compose.Include.Concept.Designation]](designation, t.designation),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Contains] = this
      val thisName: String                 = "Contains"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Contains] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Contains(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[Code]]("code", Some(None)),
              cursor.decodeAs[Option[UriStr]]("system", Some(None)),
              cursor.decodeAs[Option[String]]("version", Some(None)),
              cursor.decodeAs[Option[String]]("display", Some(None)),
              cursor.decodeAs[Option[Boolean]]("abstract", Some(None)),
              cursor.decodeAs[Option[Boolean]]("inactive", Some(None)),
              cursor.decodeAs[LitSeq[ValueSet.Expansion.Contains]]("contains", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[ValueSet.Compose.Include.Concept.Designation]]("designation", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Contains(
        override val id: Option[String] = None,
        val code: Option[Code] = None,
        val system: Option[UriStr] = None,
        val version: Option[String] = None,
        val display: Option[String] = None,
        val `abstract`: Option[Boolean] = None,
        val inactive: Option[Boolean] = None,
        val contains: LitSeq[ValueSet.Expansion.Contains] = LitSeq.empty,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val designation: LitSeq[ValueSet.Compose.Include.Concept.Designation] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Parameter extends CompanionFor[Parameter] {
      override type ResourceType = Parameter
      override type ParentType   = Parameter
      override val parentType: CompanionFor[ResourceType] = Parameter
      type ValueChoice = Choice[Union_1427970408]
      def apply(
          id: Option[String] = None,
          name: String,
          value: Option[Parameter.ValueChoice] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Parameter = new Parameter(
        id,
        name,
        value,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Parameter): Option[(Option[String], String, Option[Parameter.ValueChoice], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.name, o.value, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val name: FHIRComponentFieldMeta[String] =
        FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
      val value: FHIRComponentFieldMeta[Option[Parameter.ValueChoice]] =
        FHIRComponentFieldMeta("value", lTagOf[Option[Parameter.ValueChoice]], true, lTagOf[Union_1427970408])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, name, value, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Parameter): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[String](name, t.name),
        FHIRComponentField[Option[Parameter.ValueChoice]](value, t.value),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Parameter] = this
      val thisName: String                  = "Parameter"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Parameter] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Parameter(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[String]("name", None),
              cursor.decodeOptRef[Union_1427970408]("value"),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Parameter(
        override val id: Option[String] = None,
        val name: String,
        val value: Option[Parameter.ValueChoice] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        total: Option[Int] = None,
        offset: Option[Int] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        timestamp: FHIRDateTime,
        identifier: Option[UriStr] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        contains: LitSeq[Expansion.Contains] = LitSeq.empty,
        parameter: LitSeq[Expansion.Parameter] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Expansion = new Expansion(
      id,
      total,
      offset,
      extension,
      timestamp,
      identifier,
      modifierExtension,
      contains,
      parameter,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Expansion): Option[(Option[String], Option[Int], Option[Int], LitSeq[Extension], FHIRDateTime, Option[UriStr], LitSeq[Extension], LitSeq[Expansion.Contains], LitSeq[Expansion.Parameter])] =
      Some(
        (o.id, o.total, o.offset, o.extension, o.timestamp, o.identifier, o.modifierExtension, o.contains, o.parameter))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val total: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("total", lTagOf[Option[Int]], false, lTagOf[Int])
    val offset: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("offset", lTagOf[Option[Int]], false, lTagOf[Int])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val timestamp: FHIRComponentFieldMeta[FHIRDateTime] =
      FHIRComponentFieldMeta("timestamp", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
    val identifier: FHIRComponentFieldMeta[Option[UriStr]] =
      FHIRComponentFieldMeta("identifier", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val contains: FHIRComponentFieldMeta[LitSeq[Expansion.Contains]] =
      FHIRComponentFieldMeta("contains", lTagOf[LitSeq[Expansion.Contains]], false, lTagOf[Expansion.Contains])
    val parameter: FHIRComponentFieldMeta[LitSeq[Expansion.Parameter]] =
      FHIRComponentFieldMeta("parameter", lTagOf[LitSeq[Expansion.Parameter]], false, lTagOf[Expansion.Parameter])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, total, offset, extension, timestamp, identifier, modifierExtension, contains, parameter)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Expansion): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Int]](total, t.total),
      FHIRComponentField[Option[Int]](offset, t.offset),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[FHIRDateTime](timestamp, t.timestamp),
      FHIRComponentField[Option[UriStr]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Expansion.Contains]](contains, t.contains),
      FHIRComponentField[LitSeq[Expansion.Parameter]](parameter, t.parameter)
    )
    val baseType: CompanionFor[Expansion] = this
    val thisName: String                  = "Expansion"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Expansion] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Expansion(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Int]]("total", Some(None)),
            cursor.decodeAs[Option[Int]]("offset", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[FHIRDateTime]("timestamp", None),
            cursor.decodeAs[Option[UriStr]]("identifier", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Expansion.Contains]]("contains", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Expansion.Parameter]]("parameter", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Expansion(
      override val id: Option[String] = None,
      val total: Option[Int] = None,
      val offset: Option[Int] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val timestamp: FHIRDateTime,
      val identifier: Option[UriStr] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val contains: LitSeq[Expansion.Contains] = LitSeq.empty,
      val parameter: LitSeq[Expansion.Parameter] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
      date: Option[FHIRDateTime] = None,
      title: Option[String] = None,
      status: PUBLICATION_STATUS,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      immutable: Option[Boolean] = None,
      copyright: Option[Markdown] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Option[Markdown] = None,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      expansion: Option[ValueSet.Expansion] = None,
      compose: Option[ValueSet.Compose] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ValueSet = new ValueSet(
    id,
    url,
    meta,
    text,
    name,
    date,
    title,
    status,
    version,
    contact,
    purpose,
    language,
    contained,
    extension,
    publisher,
    immutable,
    copyright,
    identifier,
    useContext,
    description,
    experimental,
    jurisdiction,
    implicitRules,
    modifierExtension,
    expansion,
    compose,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("url", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val publisher: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("publisher", lTagOf[Option[String]], false, lTagOf[String])
  val immutable: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("immutable", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val copyright: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("copyright", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val experimental: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("experimental", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val expansion: FHIRComponentFieldMeta[Option[ValueSet.Expansion]] =
    FHIRComponentFieldMeta("expansion", lTagOf[Option[ValueSet.Expansion]], false, lTagOf[ValueSet.Expansion])
  val compose: FHIRComponentFieldMeta[Option[ValueSet.Compose]] =
    FHIRComponentFieldMeta("compose", lTagOf[Option[ValueSet.Compose]], false, lTagOf[ValueSet.Compose])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    title,
    status,
    version,
    contact,
    purpose,
    language,
    contained,
    extension,
    publisher,
    immutable,
    copyright,
    identifier,
    useContext,
    description,
    experimental,
    jurisdiction,
    implicitRules,
    modifierExtension,
    expansion,
    compose
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ValueSet): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Boolean]](immutable, t.immutable),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[ValueSet.Expansion]](expansion, t.expansion),
    FHIRComponentField[Option[ValueSet.Compose]](compose, t.compose)
  )
  def extractId(t: ValueSet): Option[String]                    = t.id
  def extractUrl(t: ValueSet): Option[UriStr]                   = t.url
  def extractMeta(t: ValueSet): Option[Meta]                    = t.meta
  def extractText(t: ValueSet): Option[Narrative]               = t.text
  def extractName(t: ValueSet): Option[String]                  = t.name
  def extractDate(t: ValueSet): Option[FHIRDateTime]            = t.date
  def extractTitle(t: ValueSet): Option[String]                 = t.title
  def extractStatus(t: ValueSet): PUBLICATION_STATUS            = t.status
  def extractVersion(t: ValueSet): Option[String]               = t.version
  def extractContact(t: ValueSet): LitSeq[ContactDetail]        = t.contact
  def extractPurpose(t: ValueSet): Option[Markdown]             = t.purpose
  def extractLanguage(t: ValueSet): Option[LANGUAGES]           = t.language
  def extractContained(t: ValueSet): LitSeq[Resource]           = t.contained
  def extractExtension(t: ValueSet): LitSeq[Extension]          = t.extension
  def extractPublisher(t: ValueSet): Option[String]             = t.publisher
  def extractImmutable(t: ValueSet): Option[Boolean]            = t.immutable
  def extractCopyright(t: ValueSet): Option[Markdown]           = t.copyright
  def extractIdentifier(t: ValueSet): LitSeq[Identifier]        = t.identifier
  def extractUseContext(t: ValueSet): LitSeq[UsageContext]      = t.useContext
  def extractDescription(t: ValueSet): Option[Markdown]         = t.description
  def extractExperimental(t: ValueSet): Option[Boolean]         = t.experimental
  def extractJurisdiction(t: ValueSet): LitSeq[CodeableConcept] = t.jurisdiction
  def extractImplicitRules(t: ValueSet): Option[UriStr]         = t.implicitRules
  def extractModifierExtension(t: ValueSet): LitSeq[Extension]  = t.modifierExtension
  def extractExpansion(t: ValueSet): Option[ValueSet.Expansion] = t.expansion
  def extractCompose(t: ValueSet): Option[ValueSet.Compose]     = t.compose
  override val thisName: String                                 = "ValueSet"
  override val searchParams: Map[String, ValueSet => Seq[Any]] = Map(
    "name"                  -> (obj => obj.name.toSeq),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "description"           -> (obj => obj.description.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "expansion"             -> (obj => obj.expansion.flatMap(_.identifier).toSeq),
    "code" -> (obj =>
      obj.expansion.toSeq.flatMap(_.contains).flatMap(_.code).toSeq ++
        obj.compose.toSeq.flatMap(_.include).flatMap(_.concept).map(_.code).toSeq),
    "date"               -> (obj => obj.date.toSeq),
    "context-type"       -> (obj => obj.useContext.map(_.code).toSeq),
    "reference"          -> (obj => obj.compose.toSeq.flatMap(_.include).flatMap(_.system).toSeq),
    "jurisdiction"       -> (obj => obj.jurisdiction.toSeq),
    "identifier"         -> (obj => obj.identifier.toSeq),
    "url"                -> (obj => obj.url.toSeq),
    "context-type-value" -> (obj => obj.useContext.toSeq),
    "version"            -> (obj => obj.version.toSeq),
    "status"             -> (obj => Seq(obj.status)),
    "publisher"          -> (obj => obj.publisher.toSeq),
    "title"              -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ValueSet] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ValueSet(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[Option[Boolean]]("immutable", Some(None)),
          cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[ValueSet.Expansion]]("expansion", Some(None)),
          cursor.decodeAs[Option[ValueSet.Compose]]("compose", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields url, name, date, title, status, version, contact, purpose, publisher, immutable, copyright, identifier, useContext, description, experimental, jurisdiction, expansion, compose.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url - An absolute URI that is used to identify this value set when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this value set is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the value set is stored on different servers.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param name - A natural language name identifying the value set. This name should be usable as an identifier for the module by machine processing applications such as code generation.
  * @param date - The date (and optionally time) when the value set was created or revised (e.g. the 'content logical definition').
  * @param title - A short, descriptive, user-friendly title for the value set.
  * @param status - The status of this value set. Enables tracking the life-cycle of the content. The status of the value set applies to the value set definition (ValueSet.compose) and the associated ValueSet metadata. Expansions do not have a state.
  * @param version - The identifier that is used to identify this version of the value set when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the value set author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
  * @param contact - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose - Explanation of why this value set is needed and why it has been designed as it has.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param publisher - The name of the organization or individual that published the value set.
  * @param immutable - If this is set to 'true', then no new versions of the content logical definition can be created.  Note: Other metadata might still change.
  * @param copyright - A copyright statement relating to the value set and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the value set.
  * @param identifier - A formal identifier that is used to identify this value set when it is represented in other formats, or referenced in a specification, model, design or an instance.
  * @param useContext - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate value set instances.
  * @param description - A free text natural language description of the value set from a consumer's perspective. The textual description specifies the span of meanings for concepts to be included within the Value Set Expansion, and also may specify the intended use and limitations of the Value Set.
  * @param experimental - A Boolean value to indicate that this value set is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction - A legal or geographic region in which the value set is intended to be used.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param expansion - A value set can also be "expanded", where the value set is turned into a simple collection of enumerated codes. This element holds the expansion, if it has been performed.
  * @param compose - A set of criteria that define the contents of the value set by including or excluding codes selected from the specified code system(s) that the value set draws from. This is also known as the Content Logical Definition (CLD).
  */
@POJOBoilerplate
class ValueSet(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val date: Option[FHIRDateTime] = None,
    val title: Option[String] = None,
    val status: PUBLICATION_STATUS,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val immutable: Option[Boolean] = None,
    val copyright: Option[Markdown] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val expansion: Option[ValueSet.Expansion] = None,
    val compose: Option[ValueSet.Compose] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends DomainResource(
      id = id,
      meta = meta,
      text = text,
      language = language,
      contained = contained,
      extension = extension,
      implicitRules = implicitRules,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "ValueSet"
}
