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
import com.babylonhealth.lit.hl7.{ CONTRACT_STATUS, CONTRACT_PUBLICATIONSTATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Contract extends CompanionFor[Contract] {
  implicit def summonObjectAndCompanionContract743230471(o: Contract): ObjectAndCompanion[Contract, Contract.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Contract
  override type ParentType   = Contract
  override val baseType: CompanionFor[ResourceType] = Contract
  override val parentType: CompanionFor[ParentType] = Contract
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Contract")
  object Term extends CompanionFor[Term] {
    implicit def summonObjectAndCompanionTerm_1004606876(o: Term): ObjectAndCompanion[Term, Term.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Term
    override type ParentType   = Term
    override val parentType: CompanionFor[ResourceType] = Term
    object Offer extends CompanionFor[Offer] {
      implicit def summonObjectAndCompanionOffer_497097142(o: Offer): ObjectAndCompanion[Offer, Offer.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Offer
      override type ParentType   = Offer
      override val parentType: CompanionFor[ResourceType] = Offer
      object Party extends CompanionFor[Party] {
        implicit def summonObjectAndCompanionParty_347504074(o: Party): ObjectAndCompanion[Party, Party.type] =
          ObjectAndCompanion(o, this)
        override type ResourceType = Party
        override type ParentType   = Party
        override val parentType: CompanionFor[ResourceType] = Party
        def apply(
            id: Option[String] = None,
            role: CodeableConcept,
            extension: LitSeq[Extension] = LitSeq.empty,
            reference: NonEmptyLitSeq[Reference],
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Party = new Party(
          id,
          role,
          extension,
          reference,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Party): Option[(Option[String], CodeableConcept, LitSeq[Extension], NonEmptyLitSeq[Reference], LitSeq[Extension])] =
          Some((o.id, o.role, o.extension, o.reference, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val role: FHIRComponentFieldMeta[CodeableConcept] =
          FHIRComponentFieldMeta("role", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val reference: FHIRComponentFieldMeta[NonEmptyLitSeq[Reference]] =
          FHIRComponentFieldMeta("reference", lTagOf[NonEmptyLitSeq[Reference]], false, lTagOf[Reference])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, role, extension, reference, modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Party): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[CodeableConcept](role, t.role),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[NonEmptyLitSeq[Reference]](reference, t.reference),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Party] = this
        val thisName: String              = "Party"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Party] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Party(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[CodeableConcept]("role", None),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[NonEmptyLitSeq[Reference]]("reference", None),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Party(
          override val id: Option[String] = None,
          val role: CodeableConcept,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val reference: NonEmptyLitSeq[Reference],
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      object Answer extends CompanionFor[Answer] {
        implicit def summonObjectAndCompanionAnswer_347504074(o: Answer): ObjectAndCompanion[Answer, Answer.type] =
          ObjectAndCompanion(o, this)
        override type ResourceType = Answer
        override type ParentType   = Answer
        override val parentType: CompanionFor[ResourceType] = Answer
        type ValueChoice = Choice[Union02135982830]
        def apply(
            id: Option[String] = None,
            value: Answer.ValueChoice,
            extension: LitSeq[Extension] = LitSeq.empty,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Answer = new Answer(
          id,
          value,
          extension,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(o: Answer): Option[(Option[String], Answer.ValueChoice, LitSeq[Extension], LitSeq[Extension])] = Some(
          (o.id, o.value, o.extension, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val value: FHIRComponentFieldMeta[Answer.ValueChoice] =
          FHIRComponentFieldMeta("value", lTagOf[Answer.ValueChoice], true, lTagOf[Union02135982830])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value, extension, modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Answer): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Answer.ValueChoice](value, t.value),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Answer] = this
        val thisName: String               = "Answer"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Answer] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Answer(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeRef[Union02135982830]("value"),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Answer(
          override val id: Option[String] = None,
          val value: Answer.ValueChoice,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          `type`: Option[CodeableConcept] = None,
          text: Option[String] = None,
          topic: Option[Reference] = None,
          linkId: LitSeq[String] = LitSeq.empty,
          decision: Option[CodeableConcept] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          identifier: LitSeq[Identifier] = LitSeq.empty,
          decisionMode: LitSeq[CodeableConcept] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          securityLabelNumber: LitSeq[UnsignedInt] = LitSeq.empty,
          party: LitSeq[Offer.Party] = LitSeq.empty,
          answer: LitSeq[Offer.Answer] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Offer = new Offer(
        id,
        `type`,
        text,
        topic,
        linkId,
        decision,
        extension,
        identifier,
        decisionMode,
        modifierExtension,
        securityLabelNumber,
        party,
        answer,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Offer): Option[(Option[String], Option[CodeableConcept], Option[String], Option[Reference], LitSeq[String], Option[CodeableConcept], LitSeq[Extension], LitSeq[Identifier], LitSeq[CodeableConcept], LitSeq[Extension], LitSeq[UnsignedInt], LitSeq[Offer.Party], LitSeq[Offer.Answer])] =
        Some(
          (
            o.id,
            o.`type`,
            o.text,
            o.topic,
            o.linkId,
            o.decision,
            o.extension,
            o.identifier,
            o.decisionMode,
            o.modifierExtension,
            o.securityLabelNumber,
            o.party,
            o.answer))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val text: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("text", lTagOf[Option[String]], false, lTagOf[String])
      val topic: FHIRComponentFieldMeta[Option[Reference]] =
        FHIRComponentFieldMeta("topic", lTagOf[Option[Reference]], false, lTagOf[Reference])
      val linkId: FHIRComponentFieldMeta[LitSeq[String]] =
        FHIRComponentFieldMeta("linkId", lTagOf[LitSeq[String]], false, lTagOf[String])
      val decision: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("decision", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
        FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
      val decisionMode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
        FHIRComponentFieldMeta("decisionMode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val securityLabelNumber: FHIRComponentFieldMeta[LitSeq[UnsignedInt]] =
        FHIRComponentFieldMeta("securityLabelNumber", lTagOf[LitSeq[UnsignedInt]], false, lTagOf[UnsignedInt])
      val party: FHIRComponentFieldMeta[LitSeq[Offer.Party]] =
        FHIRComponentFieldMeta("party", lTagOf[LitSeq[Offer.Party]], false, lTagOf[Offer.Party])
      val answer: FHIRComponentFieldMeta[LitSeq[Offer.Answer]] =
        FHIRComponentFieldMeta("answer", lTagOf[LitSeq[Offer.Answer]], false, lTagOf[Offer.Answer])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
        id,
        `type`,
        text,
        topic,
        linkId,
        decision,
        extension,
        identifier,
        decisionMode,
        modifierExtension,
        securityLabelNumber,
        party,
        answer)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Offer): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
        FHIRComponentField[Option[String]](text, t.text),
        FHIRComponentField[Option[Reference]](topic, t.topic),
        FHIRComponentField[LitSeq[String]](linkId, t.linkId),
        FHIRComponentField[Option[CodeableConcept]](decision, t.decision),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
        FHIRComponentField[LitSeq[CodeableConcept]](decisionMode, t.decisionMode),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[LitSeq[UnsignedInt]](securityLabelNumber, t.securityLabelNumber),
        FHIRComponentField[LitSeq[Offer.Party]](party, t.party),
        FHIRComponentField[LitSeq[Offer.Answer]](answer, t.answer)
      )
      val baseType: CompanionFor[Offer] = this
      val thisName: String              = "Offer"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Offer] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Offer(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
              cursor.decodeAs[Option[String]]("text", Some(None)),
              cursor.decodeAs[Option[Reference]]("topic", Some(None)),
              cursor.decodeAs[LitSeq[String]]("linkId", Some(LitSeq.empty)),
              cursor.decodeAs[Option[CodeableConcept]]("decision", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[CodeableConcept]]("decisionMode", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[UnsignedInt]]("securityLabelNumber", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Offer.Party]]("party", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Offer.Answer]]("answer", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Offer(
        override val id: Option[String] = None,
        val `type`: Option[CodeableConcept] = None,
        val text: Option[String] = None,
        val topic: Option[Reference] = None,
        val linkId: LitSeq[String] = LitSeq.empty,
        val decision: Option[CodeableConcept] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val identifier: LitSeq[Identifier] = LitSeq.empty,
        val decisionMode: LitSeq[CodeableConcept] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val securityLabelNumber: LitSeq[UnsignedInt] = LitSeq.empty,
        val party: LitSeq[Offer.Party] = LitSeq.empty,
        val answer: LitSeq[Offer.Answer] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object SecurityLabel extends CompanionFor[SecurityLabel] {
      implicit def summonObjectAndCompanionSecurityLabel_497097142(
          o: SecurityLabel): ObjectAndCompanion[SecurityLabel, SecurityLabel.type] = ObjectAndCompanion(o, this)
      override type ResourceType = SecurityLabel
      override type ParentType   = SecurityLabel
      override val parentType: CompanionFor[ResourceType] = SecurityLabel
      def apply(
          id: Option[String] = None,
          number: LitSeq[UnsignedInt] = LitSeq.empty,
          control: LitSeq[Coding] = LitSeq.empty,
          category: LitSeq[Coding] = LitSeq.empty,
          extension: LitSeq[Extension] = LitSeq.empty,
          classification: Coding,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): SecurityLabel = new SecurityLabel(
        id,
        number,
        control,
        category,
        extension,
        classification,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: SecurityLabel): Option[(Option[String], LitSeq[UnsignedInt], LitSeq[Coding], LitSeq[Coding], LitSeq[Extension], Coding, LitSeq[Extension])] =
        Some((o.id, o.number, o.control, o.category, o.extension, o.classification, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val number: FHIRComponentFieldMeta[LitSeq[UnsignedInt]] =
        FHIRComponentFieldMeta("number", lTagOf[LitSeq[UnsignedInt]], false, lTagOf[UnsignedInt])
      val control: FHIRComponentFieldMeta[LitSeq[Coding]] =
        FHIRComponentFieldMeta("control", lTagOf[LitSeq[Coding]], false, lTagOf[Coding])
      val category: FHIRComponentFieldMeta[LitSeq[Coding]] =
        FHIRComponentFieldMeta("category", lTagOf[LitSeq[Coding]], false, lTagOf[Coding])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val classification: FHIRComponentFieldMeta[Coding] =
        FHIRComponentFieldMeta("classification", lTagOf[Coding], false, lTagOf[Coding])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, number, control, category, extension, classification, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: SecurityLabel): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[UnsignedInt]](number, t.number),
        FHIRComponentField[LitSeq[Coding]](control, t.control),
        FHIRComponentField[LitSeq[Coding]](category, t.category),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Coding](classification, t.classification),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[SecurityLabel] = this
      val thisName: String                      = "SecurityLabel"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SecurityLabel] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new SecurityLabel(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[UnsignedInt]]("number", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Coding]]("control", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Coding]]("category", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Coding]("classification", None),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class SecurityLabel(
        override val id: Option[String] = None,
        val number: LitSeq[UnsignedInt] = LitSeq.empty,
        val control: LitSeq[Coding] = LitSeq.empty,
        val category: LitSeq[Coding] = LitSeq.empty,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val classification: Coding,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Action extends CompanionFor[Action] {
      implicit def summonObjectAndCompanionAction_497097142(o: Action): ObjectAndCompanion[Action, Action.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Action
      override type ParentType   = Action
      override val parentType: CompanionFor[ResourceType] = Action
      object Subject extends CompanionFor[Subject] {
        implicit def summonObjectAndCompanionSubject_882900374(o: Subject): ObjectAndCompanion[Subject, Subject.type] =
          ObjectAndCompanion(o, this)
        override type ResourceType = Subject
        override type ParentType   = Subject
        override val parentType: CompanionFor[ResourceType] = Subject
        def apply(
            id: Option[String] = None,
            role: Option[CodeableConcept] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            reference: NonEmptyLitSeq[Reference],
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Subject = new Subject(
          id,
          role,
          extension,
          reference,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Subject): Option[(Option[String], Option[CodeableConcept], LitSeq[Extension], NonEmptyLitSeq[Reference], LitSeq[Extension])] =
          Some((o.id, o.role, o.extension, o.reference, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val role: FHIRComponentFieldMeta[Option[CodeableConcept]] =
          FHIRComponentFieldMeta("role", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val reference: FHIRComponentFieldMeta[NonEmptyLitSeq[Reference]] =
          FHIRComponentFieldMeta("reference", lTagOf[NonEmptyLitSeq[Reference]], false, lTagOf[Reference])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, role, extension, reference, modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Subject): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Option[CodeableConcept]](role, t.role),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[NonEmptyLitSeq[Reference]](reference, t.reference),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Subject] = this
        val thisName: String                = "Subject"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Subject] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Subject(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Option[CodeableConcept]]("role", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[NonEmptyLitSeq[Reference]]("reference", None),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Subject(
          override val id: Option[String] = None,
          val role: Option[CodeableConcept] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val reference: NonEmptyLitSeq[Reference],
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      type OccurrenceChoice = Choice[UnionDateTimeOrPeriodOrTiming]
      def apply(
          id: Option[String] = None,
          `type`: CodeableConcept,
          note: LitSeq[Annotation] = LitSeq.empty,
          intent: CodeableConcept,
          linkId: LitSeq[String] = LitSeq.empty,
          status: CodeableConcept,
          reason: LitSeq[String] = LitSeq.empty,
          context: Option[Reference] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          requester: LitSeq[Reference] = LitSeq.empty,
          performer: Option[Reference] = None,
          reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
          doNotPerform: Option[Boolean] = None,
          reasonLinkId: LitSeq[String] = LitSeq.empty,
          contextLinkId: LitSeq[String] = LitSeq.empty,
          occurrence: Option[Action.OccurrenceChoice] = None,
          performerType: LitSeq[CodeableConcept] = LitSeq.empty,
          performerRole: Option[CodeableConcept] = None,
          requesterLinkId: LitSeq[String] = LitSeq.empty,
          performerLinkId: LitSeq[String] = LitSeq.empty,
          reasonReference: LitSeq[Reference] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          securityLabelNumber: LitSeq[UnsignedInt] = LitSeq.empty,
          subject: LitSeq[Action.Subject] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Action = new Action(
        id,
        `type`,
        note,
        intent,
        linkId,
        status,
        reason,
        context,
        extension,
        requester,
        performer,
        reasonCode,
        doNotPerform,
        reasonLinkId,
        contextLinkId,
        occurrence,
        performerType,
        performerRole,
        requesterLinkId,
        performerLinkId,
        reasonReference,
        modifierExtension,
        securityLabelNumber,
        subject,
        primitiveAttributes = primitiveAttributes
      )
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
        FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
      val intent: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("intent", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val linkId: FHIRComponentFieldMeta[LitSeq[String]] =
        FHIRComponentFieldMeta("linkId", lTagOf[LitSeq[String]], false, lTagOf[String])
      val status: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("status", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val reason: FHIRComponentFieldMeta[LitSeq[String]] =
        FHIRComponentFieldMeta("reason", lTagOf[LitSeq[String]], false, lTagOf[String])
      val context: FHIRComponentFieldMeta[Option[Reference]] =
        FHIRComponentFieldMeta("context", lTagOf[Option[Reference]], false, lTagOf[Reference])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val requester: FHIRComponentFieldMeta[LitSeq[Reference]] =
        FHIRComponentFieldMeta("requester", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
      val performer: FHIRComponentFieldMeta[Option[Reference]] =
        FHIRComponentFieldMeta("performer", lTagOf[Option[Reference]], false, lTagOf[Reference])
      val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
        FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
      val doNotPerform: FHIRComponentFieldMeta[Option[Boolean]] =
        FHIRComponentFieldMeta("doNotPerform", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
      val reasonLinkId: FHIRComponentFieldMeta[LitSeq[String]] =
        FHIRComponentFieldMeta("reasonLinkId", lTagOf[LitSeq[String]], false, lTagOf[String])
      val contextLinkId: FHIRComponentFieldMeta[LitSeq[String]] =
        FHIRComponentFieldMeta("contextLinkId", lTagOf[LitSeq[String]], false, lTagOf[String])
      val occurrence: FHIRComponentFieldMeta[Option[Action.OccurrenceChoice]] =
        FHIRComponentFieldMeta("occurrence", lTagOf[Option[Action.OccurrenceChoice]], true, lTagOf[UnionDateTimeOrPeriodOrTiming])
      val performerType: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
        FHIRComponentFieldMeta("performerType", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
      val performerRole: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("performerRole", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val requesterLinkId: FHIRComponentFieldMeta[LitSeq[String]] =
        FHIRComponentFieldMeta("requesterLinkId", lTagOf[LitSeq[String]], false, lTagOf[String])
      val performerLinkId: FHIRComponentFieldMeta[LitSeq[String]] =
        FHIRComponentFieldMeta("performerLinkId", lTagOf[LitSeq[String]], false, lTagOf[String])
      val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
        FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val securityLabelNumber: FHIRComponentFieldMeta[LitSeq[UnsignedInt]] =
        FHIRComponentFieldMeta("securityLabelNumber", lTagOf[LitSeq[UnsignedInt]], false, lTagOf[UnsignedInt])
      val subject: FHIRComponentFieldMeta[LitSeq[Action.Subject]] =
        FHIRComponentFieldMeta("subject", lTagOf[LitSeq[Action.Subject]], false, lTagOf[Action.Subject])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
        id,
        `type`,
        note,
        intent,
        linkId,
        status,
        reason,
        context,
        extension,
        requester,
        performer,
        reasonCode,
        doNotPerform,
        reasonLinkId,
        contextLinkId,
        occurrence,
        performerType,
        performerRole,
        requesterLinkId,
        performerLinkId,
        reasonReference,
        modifierExtension,
        securityLabelNumber,
        subject
      )
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Action): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[CodeableConcept](`type`, t.`type`),
        FHIRComponentField[LitSeq[Annotation]](note, t.note),
        FHIRComponentField[CodeableConcept](intent, t.intent),
        FHIRComponentField[LitSeq[String]](linkId, t.linkId),
        FHIRComponentField[CodeableConcept](status, t.status),
        FHIRComponentField[LitSeq[String]](reason, t.reason),
        FHIRComponentField[Option[Reference]](context, t.context),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Reference]](requester, t.requester),
        FHIRComponentField[Option[Reference]](performer, t.performer),
        FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
        FHIRComponentField[Option[Boolean]](doNotPerform, t.doNotPerform),
        FHIRComponentField[LitSeq[String]](reasonLinkId, t.reasonLinkId),
        FHIRComponentField[LitSeq[String]](contextLinkId, t.contextLinkId),
        FHIRComponentField[Option[Action.OccurrenceChoice]](occurrence, t.occurrence),
        FHIRComponentField[LitSeq[CodeableConcept]](performerType, t.performerType),
        FHIRComponentField[Option[CodeableConcept]](performerRole, t.performerRole),
        FHIRComponentField[LitSeq[String]](requesterLinkId, t.requesterLinkId),
        FHIRComponentField[LitSeq[String]](performerLinkId, t.performerLinkId),
        FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[LitSeq[UnsignedInt]](securityLabelNumber, t.securityLabelNumber),
        FHIRComponentField[LitSeq[Action.Subject]](subject, t.subject)
      )
      val baseType: CompanionFor[Action] = this
      val thisName: String               = "Action"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Action] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Action(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[CodeableConcept]("type", None),
              cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
              cursor.decodeAs[CodeableConcept]("intent", None),
              cursor.decodeAs[LitSeq[String]]("linkId", Some(LitSeq.empty)),
              cursor.decodeAs[CodeableConcept]("status", None),
              cursor.decodeAs[LitSeq[String]]("reason", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Reference]]("context", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Reference]]("requester", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Reference]]("performer", Some(None)),
              cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Boolean]]("doNotPerform", Some(None)),
              cursor.decodeAs[LitSeq[String]]("reasonLinkId", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[String]]("contextLinkId", Some(LitSeq.empty)),
              cursor.decodeOptRef[UnionDateTimeOrPeriodOrTiming]("occurrence"),
              cursor.decodeAs[LitSeq[CodeableConcept]]("performerType", Some(LitSeq.empty)),
              cursor.decodeAs[Option[CodeableConcept]]("performerRole", Some(None)),
              cursor.decodeAs[LitSeq[String]]("requesterLinkId", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[String]]("performerLinkId", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[UnsignedInt]]("securityLabelNumber", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Action.Subject]]("subject", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Action(
        override val id: Option[String] = None,
        val `type`: CodeableConcept,
        val note: LitSeq[Annotation] = LitSeq.empty,
        val intent: CodeableConcept,
        val linkId: LitSeq[String] = LitSeq.empty,
        val status: CodeableConcept,
        val reason: LitSeq[String] = LitSeq.empty,
        val context: Option[Reference] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val requester: LitSeq[Reference] = LitSeq.empty,
        val performer: Option[Reference] = None,
        val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
        val doNotPerform: Option[Boolean] = None,
        val reasonLinkId: LitSeq[String] = LitSeq.empty,
        val contextLinkId: LitSeq[String] = LitSeq.empty,
        val occurrence: Option[Action.OccurrenceChoice] = None,
        val performerType: LitSeq[CodeableConcept] = LitSeq.empty,
        val performerRole: Option[CodeableConcept] = None,
        val requesterLinkId: LitSeq[String] = LitSeq.empty,
        val performerLinkId: LitSeq[String] = LitSeq.empty,
        val reasonReference: LitSeq[Reference] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val securityLabelNumber: LitSeq[UnsignedInt] = LitSeq.empty,
        val subject: LitSeq[Action.Subject] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Asset extends CompanionFor[Asset] {
      implicit def summonObjectAndCompanionAsset_497097142(o: Asset): ObjectAndCompanion[Asset, Asset.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Asset
      override type ParentType   = Asset
      override val parentType: CompanionFor[ResourceType] = Asset
      object Context extends CompanionFor[Context] {
        implicit def summonObjectAndCompanionContext_372563106(o: Context): ObjectAndCompanion[Context, Context.type] =
          ObjectAndCompanion(o, this)
        override type ResourceType = Context
        override type ParentType   = Context
        override val parentType: CompanionFor[ResourceType] = Context
        def apply(
            id: Option[String] = None,
            code: LitSeq[CodeableConcept] = LitSeq.empty,
            text: Option[String] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            reference: Option[Reference] = None,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Context = new Context(
          id,
          code,
          text,
          extension,
          reference,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Context): Option[(Option[String], LitSeq[CodeableConcept], Option[String], LitSeq[Extension], Option[Reference], LitSeq[Extension])] =
          Some((o.id, o.code, o.text, o.extension, o.reference, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val code: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
          FHIRComponentFieldMeta("code", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
        val text: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("text", lTagOf[Option[String]], false, lTagOf[String])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val reference: FHIRComponentFieldMeta[Option[Reference]] =
          FHIRComponentFieldMeta("reference", lTagOf[Option[Reference]], false, lTagOf[Reference])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, text, extension, reference, modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Context): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[LitSeq[CodeableConcept]](code, t.code),
          FHIRComponentField[Option[String]](text, t.text),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[Reference]](reference, t.reference),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Context] = this
        val thisName: String                = "Context"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Context] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Context(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[LitSeq[CodeableConcept]]("code", Some(LitSeq.empty)),
                cursor.decodeAs[Option[String]]("text", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[Option[Reference]]("reference", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Context(
          override val id: Option[String] = None,
          val code: LitSeq[CodeableConcept] = LitSeq.empty,
          val text: Option[String] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val reference: Option[Reference] = None,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      object ValuedItem extends CompanionFor[ValuedItem] {
        implicit def summonObjectAndCompanionValuedItem_372563106(
            o: ValuedItem): ObjectAndCompanion[ValuedItem, ValuedItem.type] = ObjectAndCompanion(o, this)
        override type ResourceType = ValuedItem
        override type ParentType   = ValuedItem
        override val parentType: CompanionFor[ResourceType] = ValuedItem
        type EntityChoice = Choice[UnionCodeableConceptOrReference]
        def apply(
            id: Option[String] = None,
            net: Option[Money] = None,
            factor: Option[BigDecimal] = None,
            points: Option[BigDecimal] = None,
            linkId: LitSeq[String] = LitSeq.empty,
            payment: Option[String] = None,
            quantity: Option[Quantity] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            entity: Option[ValuedItem.EntityChoice] = None,
            unitPrice: Option[Money] = None,
            recipient: Option[Reference] = None,
            identifier: Option[Identifier] = None,
            paymentDate: Option[FHIRDateTime] = None,
            responsible: Option[Reference] = None,
            effectiveTime: Option[FHIRDateTime] = None,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            securityLabelNumber: LitSeq[UnsignedInt] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): ValuedItem = new ValuedItem(
          id,
          net,
          factor,
          points,
          linkId,
          payment,
          quantity,
          extension,
          entity,
          unitPrice,
          recipient,
          identifier,
          paymentDate,
          responsible,
          effectiveTime,
          modifierExtension,
          securityLabelNumber,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: ValuedItem): Option[(Option[String], Option[Money], Option[BigDecimal], Option[BigDecimal], LitSeq[String], Option[String], Option[Quantity], LitSeq[Extension], Option[ValuedItem.EntityChoice], Option[Money], Option[Reference], Option[Identifier], Option[FHIRDateTime], Option[Reference], Option[FHIRDateTime], LitSeq[Extension], LitSeq[UnsignedInt])] =
          Some(
            (
              o.id,
              o.net,
              o.factor,
              o.points,
              o.linkId,
              o.payment,
              o.quantity,
              o.extension,
              o.entity,
              o.unitPrice,
              o.recipient,
              o.identifier,
              o.paymentDate,
              o.responsible,
              o.effectiveTime,
              o.modifierExtension,
              o.securityLabelNumber))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val net: FHIRComponentFieldMeta[Option[Money]] =
          FHIRComponentFieldMeta("net", lTagOf[Option[Money]], false, lTagOf[Money])
        val factor: FHIRComponentFieldMeta[Option[BigDecimal]] =
          FHIRComponentFieldMeta("factor", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
        val points: FHIRComponentFieldMeta[Option[BigDecimal]] =
          FHIRComponentFieldMeta("points", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
        val linkId: FHIRComponentFieldMeta[LitSeq[String]] =
          FHIRComponentFieldMeta("linkId", lTagOf[LitSeq[String]], false, lTagOf[String])
        val payment: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("payment", lTagOf[Option[String]], false, lTagOf[String])
        val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
          FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val entity: FHIRComponentFieldMeta[Option[ValuedItem.EntityChoice]] =
          FHIRComponentFieldMeta("entity", lTagOf[Option[ValuedItem.EntityChoice]], true, lTagOf[UnionCodeableConceptOrReference])
        val unitPrice: FHIRComponentFieldMeta[Option[Money]] =
          FHIRComponentFieldMeta("unitPrice", lTagOf[Option[Money]], false, lTagOf[Money])
        val recipient: FHIRComponentFieldMeta[Option[Reference]] =
          FHIRComponentFieldMeta("recipient", lTagOf[Option[Reference]], false, lTagOf[Reference])
        val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
          FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
        val paymentDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
          FHIRComponentFieldMeta("paymentDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
        val responsible: FHIRComponentFieldMeta[Option[Reference]] =
          FHIRComponentFieldMeta("responsible", lTagOf[Option[Reference]], false, lTagOf[Reference])
        val effectiveTime: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
          FHIRComponentFieldMeta("effectiveTime", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val securityLabelNumber: FHIRComponentFieldMeta[LitSeq[UnsignedInt]] =
          FHIRComponentFieldMeta("securityLabelNumber", lTagOf[LitSeq[UnsignedInt]], false, lTagOf[UnsignedInt])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
          id,
          net,
          factor,
          points,
          linkId,
          payment,
          quantity,
          extension,
          entity,
          unitPrice,
          recipient,
          identifier,
          paymentDate,
          responsible,
          effectiveTime,
          modifierExtension,
          securityLabelNumber
        )
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: ValuedItem): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Option[Money]](net, t.net),
          FHIRComponentField[Option[BigDecimal]](factor, t.factor),
          FHIRComponentField[Option[BigDecimal]](points, t.points),
          FHIRComponentField[LitSeq[String]](linkId, t.linkId),
          FHIRComponentField[Option[String]](payment, t.payment),
          FHIRComponentField[Option[Quantity]](quantity, t.quantity),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[ValuedItem.EntityChoice]](entity, t.entity),
          FHIRComponentField[Option[Money]](unitPrice, t.unitPrice),
          FHIRComponentField[Option[Reference]](recipient, t.recipient),
          FHIRComponentField[Option[Identifier]](identifier, t.identifier),
          FHIRComponentField[Option[FHIRDateTime]](paymentDate, t.paymentDate),
          FHIRComponentField[Option[Reference]](responsible, t.responsible),
          FHIRComponentField[Option[FHIRDateTime]](effectiveTime, t.effectiveTime),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
          FHIRComponentField[LitSeq[UnsignedInt]](securityLabelNumber, t.securityLabelNumber)
        )
        val baseType: CompanionFor[ValuedItem] = this
        val thisName: String                   = "ValuedItem"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ValuedItem] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new ValuedItem(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Option[Money]]("net", Some(None)),
                cursor.decodeAs[Option[BigDecimal]]("factor", Some(None)),
                cursor.decodeAs[Option[BigDecimal]]("points", Some(None)),
                cursor.decodeAs[LitSeq[String]]("linkId", Some(LitSeq.empty)),
                cursor.decodeAs[Option[String]]("payment", Some(None)),
                cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeOptRef[UnionCodeableConceptOrReference]("entity"),
                cursor.decodeAs[Option[Money]]("unitPrice", Some(None)),
                cursor.decodeAs[Option[Reference]]("recipient", Some(None)),
                cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
                cursor.decodeAs[Option[FHIRDateTime]]("paymentDate", Some(None)),
                cursor.decodeAs[Option[Reference]]("responsible", Some(None)),
                cursor.decodeAs[Option[FHIRDateTime]]("effectiveTime", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[UnsignedInt]]("securityLabelNumber", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class ValuedItem(
          override val id: Option[String] = None,
          val net: Option[Money] = None,
          val factor: Option[BigDecimal] = None,
          val points: Option[BigDecimal] = None,
          val linkId: LitSeq[String] = LitSeq.empty,
          val payment: Option[String] = None,
          val quantity: Option[Quantity] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val entity: Option[ValuedItem.EntityChoice] = None,
          val unitPrice: Option[Money] = None,
          val recipient: Option[Reference] = None,
          val identifier: Option[Identifier] = None,
          val paymentDate: Option[FHIRDateTime] = None,
          val responsible: Option[Reference] = None,
          val effectiveTime: Option[FHIRDateTime] = None,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          val securityLabelNumber: LitSeq[UnsignedInt] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          `type`: LitSeq[CodeableConcept] = LitSeq.empty,
          text: Option[String] = None,
          scope: Option[CodeableConcept] = None,
          period: LitSeq[Period] = LitSeq.empty,
          linkId: LitSeq[String] = LitSeq.empty,
          answer: LitSeq[Contract.Term.Offer.Answer] = LitSeq.empty,
          subtype: LitSeq[CodeableConcept] = LitSeq.empty,
          extension: LitSeq[Extension] = LitSeq.empty,
          condition: Option[String] = None,
          usePeriod: LitSeq[Period] = LitSeq.empty,
          periodType: LitSeq[CodeableConcept] = LitSeq.empty,
          relationship: Option[Coding] = None,
          typeReference: LitSeq[Reference] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          securityLabelNumber: LitSeq[UnsignedInt] = LitSeq.empty,
          context: LitSeq[Asset.Context] = LitSeq.empty,
          valuedItem: LitSeq[Asset.ValuedItem] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Asset = new Asset(
        id,
        `type`,
        text,
        scope,
        period,
        linkId,
        answer,
        subtype,
        extension,
        condition,
        usePeriod,
        periodType,
        relationship,
        typeReference,
        modifierExtension,
        securityLabelNumber,
        context,
        valuedItem,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Asset): Option[(Option[String], LitSeq[CodeableConcept], Option[String], Option[CodeableConcept], LitSeq[Period], LitSeq[String], LitSeq[Contract.Term.Offer.Answer], LitSeq[CodeableConcept], LitSeq[Extension], Option[String], LitSeq[Period], LitSeq[CodeableConcept], Option[Coding], LitSeq[Reference], LitSeq[Extension], LitSeq[UnsignedInt], LitSeq[Asset.Context], LitSeq[Asset.ValuedItem])] =
        Some(
          (
            o.id,
            o.`type`,
            o.text,
            o.scope,
            o.period,
            o.linkId,
            o.answer,
            o.subtype,
            o.extension,
            o.condition,
            o.usePeriod,
            o.periodType,
            o.relationship,
            o.typeReference,
            o.modifierExtension,
            o.securityLabelNumber,
            o.context,
            o.valuedItem))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
        FHIRComponentFieldMeta("type", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
      val text: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("text", lTagOf[Option[String]], false, lTagOf[String])
      val scope: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("scope", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val period: FHIRComponentFieldMeta[LitSeq[Period]] =
        FHIRComponentFieldMeta("period", lTagOf[LitSeq[Period]], false, lTagOf[Period])
      val linkId: FHIRComponentFieldMeta[LitSeq[String]] =
        FHIRComponentFieldMeta("linkId", lTagOf[LitSeq[String]], false, lTagOf[String])
      val answer: FHIRComponentFieldMeta[LitSeq[Contract.Term.Offer.Answer]] =
        FHIRComponentFieldMeta("answer", lTagOf[LitSeq[Contract.Term.Offer.Answer]], false, lTagOf[Contract.Term.Offer.Answer])
      val subtype: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
        FHIRComponentFieldMeta("subtype", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val condition: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("condition", lTagOf[Option[String]], false, lTagOf[String])
      val usePeriod: FHIRComponentFieldMeta[LitSeq[Period]] =
        FHIRComponentFieldMeta("usePeriod", lTagOf[LitSeq[Period]], false, lTagOf[Period])
      val periodType: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
        FHIRComponentFieldMeta("periodType", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
      val relationship: FHIRComponentFieldMeta[Option[Coding]] =
        FHIRComponentFieldMeta("relationship", lTagOf[Option[Coding]], false, lTagOf[Coding])
      val typeReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
        FHIRComponentFieldMeta("typeReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val securityLabelNumber: FHIRComponentFieldMeta[LitSeq[UnsignedInt]] =
        FHIRComponentFieldMeta("securityLabelNumber", lTagOf[LitSeq[UnsignedInt]], false, lTagOf[UnsignedInt])
      val context: FHIRComponentFieldMeta[LitSeq[Asset.Context]] =
        FHIRComponentFieldMeta("context", lTagOf[LitSeq[Asset.Context]], false, lTagOf[Asset.Context])
      val valuedItem: FHIRComponentFieldMeta[LitSeq[Asset.ValuedItem]] =
        FHIRComponentFieldMeta("valuedItem", lTagOf[LitSeq[Asset.ValuedItem]], false, lTagOf[Asset.ValuedItem])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
        id,
        `type`,
        text,
        scope,
        period,
        linkId,
        answer,
        subtype,
        extension,
        condition,
        usePeriod,
        periodType,
        relationship,
        typeReference,
        modifierExtension,
        securityLabelNumber,
        context,
        valuedItem
      )
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Asset): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
        FHIRComponentField[Option[String]](text, t.text),
        FHIRComponentField[Option[CodeableConcept]](scope, t.scope),
        FHIRComponentField[LitSeq[Period]](period, t.period),
        FHIRComponentField[LitSeq[String]](linkId, t.linkId),
        FHIRComponentField[LitSeq[Contract.Term.Offer.Answer]](answer, t.answer),
        FHIRComponentField[LitSeq[CodeableConcept]](subtype, t.subtype),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[String]](condition, t.condition),
        FHIRComponentField[LitSeq[Period]](usePeriod, t.usePeriod),
        FHIRComponentField[LitSeq[CodeableConcept]](periodType, t.periodType),
        FHIRComponentField[Option[Coding]](relationship, t.relationship),
        FHIRComponentField[LitSeq[Reference]](typeReference, t.typeReference),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[LitSeq[UnsignedInt]](securityLabelNumber, t.securityLabelNumber),
        FHIRComponentField[LitSeq[Asset.Context]](context, t.context),
        FHIRComponentField[LitSeq[Asset.ValuedItem]](valuedItem, t.valuedItem)
      )
      val baseType: CompanionFor[Asset] = this
      val thisName: String              = "Asset"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Asset] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Asset(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("text", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("scope", Some(None)),
              cursor.decodeAs[LitSeq[Period]]("period", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[String]]("linkId", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Contract.Term.Offer.Answer]]("answer", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[CodeableConcept]]("subtype", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("condition", Some(None)),
              cursor.decodeAs[LitSeq[Period]]("usePeriod", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[CodeableConcept]]("periodType", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Coding]]("relationship", Some(None)),
              cursor.decodeAs[LitSeq[Reference]]("typeReference", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[UnsignedInt]]("securityLabelNumber", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Asset.Context]]("context", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Asset.ValuedItem]]("valuedItem", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Asset(
        override val id: Option[String] = None,
        val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
        val text: Option[String] = None,
        val scope: Option[CodeableConcept] = None,
        val period: LitSeq[Period] = LitSeq.empty,
        val linkId: LitSeq[String] = LitSeq.empty,
        val answer: LitSeq[Contract.Term.Offer.Answer] = LitSeq.empty,
        val subtype: LitSeq[CodeableConcept] = LitSeq.empty,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val condition: Option[String] = None,
        val usePeriod: LitSeq[Period] = LitSeq.empty,
        val periodType: LitSeq[CodeableConcept] = LitSeq.empty,
        val relationship: Option[Coding] = None,
        val typeReference: LitSeq[Reference] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val securityLabelNumber: LitSeq[UnsignedInt] = LitSeq.empty,
        val context: LitSeq[Asset.Context] = LitSeq.empty,
        val valuedItem: LitSeq[Asset.ValuedItem] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    type TopicChoice = Choice[UnionCodeableConceptOrReference]
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        text: Option[String] = None,
        group: LitSeq[Contract.Term] = LitSeq.empty,
        issued: Option[FHIRDateTime] = None,
        applies: Option[Period] = None,
        subType: Option[CodeableConcept] = None,
        topic: Option[Term.TopicChoice] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        identifier: Option[Identifier] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        offer: Term.Offer,
        securityLabel: LitSeq[Term.SecurityLabel] = LitSeq.empty,
        action: LitSeq[Term.Action] = LitSeq.empty,
        asset: LitSeq[Term.Asset] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Term = new Term(
      id,
      `type`,
      text,
      group,
      issued,
      applies,
      subType,
      topic,
      extension,
      identifier,
      modifierExtension,
      offer,
      securityLabel,
      action,
      asset,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Term): Option[(Option[String], Option[CodeableConcept], Option[String], LitSeq[Contract.Term], Option[FHIRDateTime], Option[Period], Option[CodeableConcept], Option[Term.TopicChoice], LitSeq[Extension], Option[Identifier], LitSeq[Extension], Term.Offer, LitSeq[Term.SecurityLabel], LitSeq[Term.Action], LitSeq[Term.Asset])] =
      Some(
        (
          o.id,
          o.`type`,
          o.text,
          o.group,
          o.issued,
          o.applies,
          o.subType,
          o.topic,
          o.extension,
          o.identifier,
          o.modifierExtension,
          o.offer,
          o.securityLabel,
          o.action,
          o.asset))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val text: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("text", lTagOf[Option[String]], false, lTagOf[String])
    val group: FHIRComponentFieldMeta[LitSeq[Contract.Term]] =
      FHIRComponentFieldMeta("group", lTagOf[LitSeq[Contract.Term]], false, lTagOf[Contract.Term])
    val issued: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("issued", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val applies: FHIRComponentFieldMeta[Option[Period]] =
      FHIRComponentFieldMeta("applies", lTagOf[Option[Period]], false, lTagOf[Period])
    val subType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("subType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val topic: FHIRComponentFieldMeta[Option[Term.TopicChoice]] =
      FHIRComponentFieldMeta("topic", lTagOf[Option[Term.TopicChoice]], true, lTagOf[UnionCodeableConceptOrReference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val offer: FHIRComponentFieldMeta[Term.Offer] =
      FHIRComponentFieldMeta("offer", lTagOf[Term.Offer], false, lTagOf[Term.Offer])
    val securityLabel: FHIRComponentFieldMeta[LitSeq[Term.SecurityLabel]] =
      FHIRComponentFieldMeta("securityLabel", lTagOf[LitSeq[Term.SecurityLabel]], false, lTagOf[Term.SecurityLabel])
    val action: FHIRComponentFieldMeta[LitSeq[Term.Action]] =
      FHIRComponentFieldMeta("action", lTagOf[LitSeq[Term.Action]], false, lTagOf[Term.Action])
    val asset: FHIRComponentFieldMeta[LitSeq[Term.Asset]] =
      FHIRComponentFieldMeta("asset", lTagOf[LitSeq[Term.Asset]], false, lTagOf[Term.Asset])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      `type`,
      text,
      group,
      issued,
      applies,
      subType,
      topic,
      extension,
      identifier,
      modifierExtension,
      offer,
      securityLabel,
      action,
      asset)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Term): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[String]](text, t.text),
      FHIRComponentField[LitSeq[Contract.Term]](group, t.group),
      FHIRComponentField[Option[FHIRDateTime]](issued, t.issued),
      FHIRComponentField[Option[Period]](applies, t.applies),
      FHIRComponentField[Option[CodeableConcept]](subType, t.subType),
      FHIRComponentField[Option[Term.TopicChoice]](topic, t.topic),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Term.Offer](offer, t.offer),
      FHIRComponentField[LitSeq[Term.SecurityLabel]](securityLabel, t.securityLabel),
      FHIRComponentField[LitSeq[Term.Action]](action, t.action),
      FHIRComponentField[LitSeq[Term.Asset]](asset, t.asset)
    )
    val baseType: CompanionFor[Term] = this
    val thisName: String             = "Term"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Term] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Term(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[String]]("text", Some(None)),
            cursor.decodeAs[LitSeq[Contract.Term]]("group", Some(LitSeq.empty)),
            cursor.decodeAs[Option[FHIRDateTime]]("issued", Some(None)),
            cursor.decodeAs[Option[Period]]("applies", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("subType", Some(None)),
            cursor.decodeOptRef[UnionCodeableConceptOrReference]("topic"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Term.Offer]("offer", None),
            cursor.decodeAs[LitSeq[Term.SecurityLabel]]("securityLabel", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Term.Action]]("action", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Term.Asset]]("asset", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Term(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val text: Option[String] = None,
      val group: LitSeq[Contract.Term] = LitSeq.empty,
      val issued: Option[FHIRDateTime] = None,
      val applies: Option[Period] = None,
      val subType: Option[CodeableConcept] = None,
      val topic: Option[Term.TopicChoice] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val identifier: Option[Identifier] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val offer: Term.Offer,
      val securityLabel: LitSeq[Term.SecurityLabel] = LitSeq.empty,
      val action: LitSeq[Term.Action] = LitSeq.empty,
      val asset: LitSeq[Term.Asset] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object ContentDefinition extends CompanionFor[ContentDefinition] {
    implicit def summonObjectAndCompanionContentDefinition_1004606876(
        o: ContentDefinition): ObjectAndCompanion[ContentDefinition, ContentDefinition.type] = ObjectAndCompanion(o, this)
    override type ResourceType = ContentDefinition
    override type ParentType   = ContentDefinition
    override val parentType: CompanionFor[ResourceType] = ContentDefinition
    def apply(
        id: Option[String] = None,
        `type`: CodeableConcept,
        subType: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        publisher: Option[Reference] = None,
        copyright: Option[Markdown] = None,
        publicationDate: Option[FHIRDateTime] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        publicationStatus: CONTRACT_PUBLICATIONSTATUS,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): ContentDefinition = new ContentDefinition(
      id,
      `type`,
      subType,
      extension,
      publisher,
      copyright,
      publicationDate,
      modifierExtension,
      publicationStatus,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: ContentDefinition): Option[(Option[String], CodeableConcept, Option[CodeableConcept], LitSeq[Extension], Option[Reference], Option[Markdown], Option[FHIRDateTime], LitSeq[Extension], CONTRACT_PUBLICATIONSTATUS)] =
      Some(
        (
          o.id,
          o.`type`,
          o.subType,
          o.extension,
          o.publisher,
          o.copyright,
          o.publicationDate,
          o.modifierExtension,
          o.publicationStatus))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val subType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("subType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val publisher: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("publisher", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val copyright: FHIRComponentFieldMeta[Option[Markdown]] =
      FHIRComponentFieldMeta("copyright", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
    val publicationDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("publicationDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val publicationStatus: FHIRComponentFieldMeta[CONTRACT_PUBLICATIONSTATUS] =
      FHIRComponentFieldMeta("publicationStatus", lTagOf[CONTRACT_PUBLICATIONSTATUS], false, lTagOf[CONTRACT_PUBLICATIONSTATUS])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, `type`, subType, extension, publisher, copyright, publicationDate, modifierExtension, publicationStatus)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: ContentDefinition): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
      FHIRComponentField[Option[CodeableConcept]](subType, t.subType),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](publisher, t.publisher),
      FHIRComponentField[Option[Markdown]](copyright, t.copyright),
      FHIRComponentField[Option[FHIRDateTime]](publicationDate, t.publicationDate),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[CONTRACT_PUBLICATIONSTATUS](publicationStatus, t.publicationStatus)
    )
    val baseType: CompanionFor[ContentDefinition] = this
    val thisName: String                          = "ContentDefinition"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ContentDefinition] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new ContentDefinition(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("type", None),
            cursor.decodeAs[Option[CodeableConcept]]("subType", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("publisher", Some(None)),
            cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
            cursor.decodeAs[Option[FHIRDateTime]]("publicationDate", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[CONTRACT_PUBLICATIONSTATUS]("publicationStatus", None),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class ContentDefinition(
      override val id: Option[String] = None,
      val `type`: CodeableConcept,
      val subType: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val publisher: Option[Reference] = None,
      val copyright: Option[Markdown] = None,
      val publicationDate: Option[FHIRDateTime] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val publicationStatus: CONTRACT_PUBLICATIONSTATUS,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Friendly extends CompanionFor[Friendly] {
    implicit def summonObjectAndCompanionFriendly_1004606876(o: Friendly): ObjectAndCompanion[Friendly, Friendly.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Friendly
    override type ParentType   = Friendly
    override val parentType: CompanionFor[ResourceType] = Friendly
    type ContentChoice = Choice[UnionAttachmentOrReference]
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        content: Friendly.ContentChoice,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Friendly = new Friendly(
      id,
      extension,
      content,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Friendly): Option[(Option[String], LitSeq[Extension], Friendly.ContentChoice, LitSeq[Extension])] = Some(
      (o.id, o.extension, o.content, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val content: FHIRComponentFieldMeta[Friendly.ContentChoice] =
      FHIRComponentFieldMeta("content", lTagOf[Friendly.ContentChoice], true, lTagOf[UnionAttachmentOrReference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, content, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Friendly): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Friendly.ContentChoice](content, t.content),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Friendly] = this
    val thisName: String                 = "Friendly"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Friendly] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Friendly(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeRef[UnionAttachmentOrReference]("content"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Friendly(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val content: Friendly.ContentChoice,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Signer extends CompanionFor[Signer] {
    implicit def summonObjectAndCompanionSigner_1004606876(o: Signer): ObjectAndCompanion[Signer, Signer.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Signer
    override type ParentType   = Signer
    override val parentType: CompanionFor[ResourceType] = Signer
    def apply(
        id: Option[String] = None,
        `type`: Coding,
        party: Reference,
        extension: LitSeq[Extension] = LitSeq.empty,
        signature: NonEmptyLitSeq[Signature],
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Signer = new Signer(
      id,
      `type`,
      party,
      extension,
      signature,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Signer): Option[(Option[String], Coding, Reference, LitSeq[Extension], NonEmptyLitSeq[Signature], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.party, o.extension, o.signature, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Coding] =
      FHIRComponentFieldMeta("type", lTagOf[Coding], false, lTagOf[Coding])
    val party: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("party", lTagOf[Reference], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val signature: FHIRComponentFieldMeta[NonEmptyLitSeq[Signature]] =
      FHIRComponentFieldMeta("signature", lTagOf[NonEmptyLitSeq[Signature]], false, lTagOf[Signature])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, party, extension, signature, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Signer): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Coding](`type`, t.`type`),
      FHIRComponentField[Reference](party, t.party),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[NonEmptyLitSeq[Signature]](signature, t.signature),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Signer] = this
    val thisName: String               = "Signer"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Signer] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Signer(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Coding]("type", None),
            cursor.decodeAs[Reference]("party", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[NonEmptyLitSeq[Signature]]("signature", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Signer(
      override val id: Option[String] = None,
      val `type`: Coding,
      val party: Reference,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val signature: NonEmptyLitSeq[Signature],
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Legal extends CompanionFor[Legal] {
    implicit def summonObjectAndCompanionLegal_1004606876(o: Legal): ObjectAndCompanion[Legal, Legal.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Legal
    override type ParentType   = Legal
    override val parentType: CompanionFor[ResourceType] = Legal
    type ContentChoice = Choice[UnionAttachmentOrReference]
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        content: Legal.ContentChoice,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Legal = new Legal(
      id,
      extension,
      content,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Legal): Option[(Option[String], LitSeq[Extension], Legal.ContentChoice, LitSeq[Extension])] = Some(
      (o.id, o.extension, o.content, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val content: FHIRComponentFieldMeta[Legal.ContentChoice] =
      FHIRComponentFieldMeta("content", lTagOf[Legal.ContentChoice], true, lTagOf[UnionAttachmentOrReference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, content, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Legal): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Legal.ContentChoice](content, t.content),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Legal] = this
    val thisName: String              = "Legal"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Legal] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Legal(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeRef[UnionAttachmentOrReference]("content"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Legal(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val content: Legal.ContentChoice,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Rule extends CompanionFor[Rule] {
    implicit def summonObjectAndCompanionRule_1004606876(o: Rule): ObjectAndCompanion[Rule, Rule.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Rule
    override type ParentType   = Rule
    override val parentType: CompanionFor[ResourceType] = Rule
    type ContentChoice = Choice[UnionAttachmentOrReference]
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        content: Rule.ContentChoice,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Rule = new Rule(
      id,
      extension,
      content,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Rule): Option[(Option[String], LitSeq[Extension], Rule.ContentChoice, LitSeq[Extension])] = Some(
      (o.id, o.extension, o.content, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val content: FHIRComponentFieldMeta[Rule.ContentChoice] =
      FHIRComponentFieldMeta("content", lTagOf[Rule.ContentChoice], true, lTagOf[UnionAttachmentOrReference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, content, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Rule): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Rule.ContentChoice](content, t.content),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Rule] = this
    val thisName: String             = "Rule"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Rule] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Rule(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeRef[UnionAttachmentOrReference]("content"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Rule(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val content: Rule.ContentChoice,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type TopicChoice          = Choice[UnionCodeableConceptOrReference]
  type LegallyBindingChoice = Choice[UnionAttachmentOrReference]
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      site: LitSeq[Reference] = LitSeq.empty,
      name: Option[String] = None,
      `type`: Option[CodeableConcept] = None,
      title: Option[String] = None,
      alias: LitSeq[String] = LitSeq.empty,
      scope: Option[CodeableConcept] = None,
      status: Option[CONTRACT_STATUS] = None,
      issued: Option[FHIRDateTime] = None,
      domain: LitSeq[Reference] = LitSeq.empty,
      author: Option[Reference] = None,
      version: Option[String] = None,
      applies: Option[Period] = None,
      subject: LitSeq[Reference] = LitSeq.empty,
      subType: LitSeq[CodeableConcept] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      subtitle: Option[String] = None,
      topic: Option[Contract.TopicChoice] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      authority: LitSeq[Reference] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      legalState: Option[CodeableConcept] = None,
      implicitRules: Option[UriStr] = None,
      expirationType: Option[CodeableConcept] = None,
      supportingInfo: LitSeq[Reference] = LitSeq.empty,
      instantiatesUri: Option[UriStr] = None,
      relevantHistory: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      contentDerivative: Option[CodeableConcept] = None,
      legallyBinding: Option[Contract.LegallyBindingChoice] = None,
      instantiatesCanonical: Option[Reference] = None,
      rule: LitSeq[Contract.Rule] = LitSeq.empty,
      legal: LitSeq[Contract.Legal] = LitSeq.empty,
      signer: LitSeq[Contract.Signer] = LitSeq.empty,
      friendly: LitSeq[Contract.Friendly] = LitSeq.empty,
      contentDefinition: Option[Contract.ContentDefinition] = None,
      term: LitSeq[Contract.Term] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Contract = new Contract(
    id,
    url,
    meta,
    text,
    site,
    name,
    `type`,
    title,
    alias,
    scope,
    status,
    issued,
    domain,
    author,
    version,
    applies,
    subject,
    subType,
    language,
    subtitle,
    topic,
    contained,
    extension,
    authority,
    identifier,
    legalState,
    implicitRules,
    expirationType,
    supportingInfo,
    instantiatesUri,
    relevantHistory,
    modifierExtension,
    contentDerivative,
    legallyBinding,
    instantiatesCanonical,
    rule,
    legal,
    signer,
    friendly,
    contentDefinition,
    term,
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
  val site: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("site", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val alias: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("alias", lTagOf[LitSeq[String]], false, lTagOf[String])
  val scope: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("scope", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[Option[CONTRACT_STATUS]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[CONTRACT_STATUS]], false, lTagOf[CONTRACT_STATUS])
  val issued: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("issued", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val domain: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("domain", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val author: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val applies: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("applies", lTagOf[Option[Period]], false, lTagOf[Period])
  val subject: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subType: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("subType", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val subtitle: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("subtitle", lTagOf[Option[String]], false, lTagOf[String])
  val topic: FHIRComponentFieldMeta[Option[Contract.TopicChoice]] =
    FHIRComponentFieldMeta("topic", lTagOf[Option[Contract.TopicChoice]], true, lTagOf[UnionCodeableConceptOrReference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val authority: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("authority", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val legalState: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("legalState", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val expirationType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("expirationType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val supportingInfo: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("supportingInfo", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val instantiatesUri: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("instantiatesUri", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val relevantHistory: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("relevantHistory", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val contentDerivative: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("contentDerivative", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val legallyBinding: FHIRComponentFieldMeta[Option[Contract.LegallyBindingChoice]] =
    FHIRComponentFieldMeta(
      "legallyBinding",
      lTagOf[Option[Contract.LegallyBindingChoice]],
      true,
      lTagOf[UnionAttachmentOrReference])
  val instantiatesCanonical: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("instantiatesCanonical", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val rule: FHIRComponentFieldMeta[LitSeq[Contract.Rule]] =
    FHIRComponentFieldMeta("rule", lTagOf[LitSeq[Contract.Rule]], false, lTagOf[Contract.Rule])
  val legal: FHIRComponentFieldMeta[LitSeq[Contract.Legal]] =
    FHIRComponentFieldMeta("legal", lTagOf[LitSeq[Contract.Legal]], false, lTagOf[Contract.Legal])
  val signer: FHIRComponentFieldMeta[LitSeq[Contract.Signer]] =
    FHIRComponentFieldMeta("signer", lTagOf[LitSeq[Contract.Signer]], false, lTagOf[Contract.Signer])
  val friendly: FHIRComponentFieldMeta[LitSeq[Contract.Friendly]] =
    FHIRComponentFieldMeta("friendly", lTagOf[LitSeq[Contract.Friendly]], false, lTagOf[Contract.Friendly])
  val contentDefinition: FHIRComponentFieldMeta[Option[Contract.ContentDefinition]] =
    FHIRComponentFieldMeta(
      "contentDefinition",
      lTagOf[Option[Contract.ContentDefinition]],
      false,
      lTagOf[Contract.ContentDefinition])
  val term: FHIRComponentFieldMeta[LitSeq[Contract.Term]] =
    FHIRComponentFieldMeta("term", lTagOf[LitSeq[Contract.Term]], false, lTagOf[Contract.Term])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    site,
    name,
    `type`,
    title,
    alias,
    scope,
    status,
    issued,
    domain,
    author,
    version,
    applies,
    subject,
    subType,
    language,
    subtitle,
    topic,
    contained,
    extension,
    authority,
    identifier,
    legalState,
    implicitRules,
    expirationType,
    supportingInfo,
    instantiatesUri,
    relevantHistory,
    modifierExtension,
    contentDerivative,
    legallyBinding,
    instantiatesCanonical,
    rule,
    legal,
    signer,
    friendly,
    contentDefinition,
    term
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Contract): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Reference]](site, t.site),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[LitSeq[String]](alias, t.alias),
    FHIRComponentField[Option[CodeableConcept]](scope, t.scope),
    FHIRComponentField[Option[CONTRACT_STATUS]](status, t.status),
    FHIRComponentField[Option[FHIRDateTime]](issued, t.issued),
    FHIRComponentField[LitSeq[Reference]](domain, t.domain),
    FHIRComponentField[Option[Reference]](author, t.author),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[Option[Period]](applies, t.applies),
    FHIRComponentField[LitSeq[Reference]](subject, t.subject),
    FHIRComponentField[LitSeq[CodeableConcept]](subType, t.subType),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[String]](subtitle, t.subtitle),
    FHIRComponentField[Option[Contract.TopicChoice]](topic, t.topic),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Reference]](authority, t.authority),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[CodeableConcept]](legalState, t.legalState),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[CodeableConcept]](expirationType, t.expirationType),
    FHIRComponentField[LitSeq[Reference]](supportingInfo, t.supportingInfo),
    FHIRComponentField[Option[UriStr]](instantiatesUri, t.instantiatesUri),
    FHIRComponentField[LitSeq[Reference]](relevantHistory, t.relevantHistory),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[CodeableConcept]](contentDerivative, t.contentDerivative),
    FHIRComponentField[Option[Contract.LegallyBindingChoice]](legallyBinding, t.legallyBinding),
    FHIRComponentField[Option[Reference]](instantiatesCanonical, t.instantiatesCanonical),
    FHIRComponentField[LitSeq[Contract.Rule]](rule, t.rule),
    FHIRComponentField[LitSeq[Contract.Legal]](legal, t.legal),
    FHIRComponentField[LitSeq[Contract.Signer]](signer, t.signer),
    FHIRComponentField[LitSeq[Contract.Friendly]](friendly, t.friendly),
    FHIRComponentField[Option[Contract.ContentDefinition]](contentDefinition, t.contentDefinition),
    FHIRComponentField[LitSeq[Contract.Term]](term, t.term)
  )
  def extractId(t: Contract): Option[String]                                    = t.id
  def extractUrl(t: Contract): Option[UriStr]                                   = t.url
  def extractMeta(t: Contract): Option[Meta]                                    = t.meta
  def extractText(t: Contract): Option[Narrative]                               = t.text
  def extractSite(t: Contract): LitSeq[Reference]                               = t.site
  def extractName(t: Contract): Option[String]                                  = t.name
  def extractType(t: Contract): Option[CodeableConcept]                         = t.`type`
  def extractTitle(t: Contract): Option[String]                                 = t.title
  def extractAlias(t: Contract): LitSeq[String]                                 = t.alias
  def extractScope(t: Contract): Option[CodeableConcept]                        = t.scope
  def extractStatus(t: Contract): Option[CONTRACT_STATUS]                       = t.status
  def extractIssued(t: Contract): Option[FHIRDateTime]                          = t.issued
  def extractDomain(t: Contract): LitSeq[Reference]                             = t.domain
  def extractAuthor(t: Contract): Option[Reference]                             = t.author
  def extractVersion(t: Contract): Option[String]                               = t.version
  def extractApplies(t: Contract): Option[Period]                               = t.applies
  def extractSubject(t: Contract): LitSeq[Reference]                            = t.subject
  def extractSubType(t: Contract): LitSeq[CodeableConcept]                      = t.subType
  def extractLanguage(t: Contract): Option[LANGUAGES]                           = t.language
  def extractSubtitle(t: Contract): Option[String]                              = t.subtitle
  def extractTopic(t: Contract): Option[Contract.TopicChoice]                   = t.topic
  def extractContained(t: Contract): LitSeq[Resource]                           = t.contained
  def extractExtension(t: Contract): LitSeq[Extension]                          = t.extension
  def extractAuthority(t: Contract): LitSeq[Reference]                          = t.authority
  def extractIdentifier(t: Contract): LitSeq[Identifier]                        = t.identifier
  def extractLegalState(t: Contract): Option[CodeableConcept]                   = t.legalState
  def extractImplicitRules(t: Contract): Option[UriStr]                         = t.implicitRules
  def extractExpirationType(t: Contract): Option[CodeableConcept]               = t.expirationType
  def extractSupportingInfo(t: Contract): LitSeq[Reference]                     = t.supportingInfo
  def extractInstantiatesUri(t: Contract): Option[UriStr]                       = t.instantiatesUri
  def extractRelevantHistory(t: Contract): LitSeq[Reference]                    = t.relevantHistory
  def extractModifierExtension(t: Contract): LitSeq[Extension]                  = t.modifierExtension
  def extractContentDerivative(t: Contract): Option[CodeableConcept]            = t.contentDerivative
  def extractLegallyBinding(t: Contract): Option[Contract.LegallyBindingChoice] = t.legallyBinding
  def extractInstantiatesCanonical(t: Contract): Option[Reference]              = t.instantiatesCanonical
  def extractRule(t: Contract): LitSeq[Contract.Rule]                           = t.rule
  def extractLegal(t: Contract): LitSeq[Contract.Legal]                         = t.legal
  def extractSigner(t: Contract): LitSeq[Contract.Signer]                       = t.signer
  def extractFriendly(t: Contract): LitSeq[Contract.Friendly]                   = t.friendly
  def extractContentDefinition(t: Contract): Option[Contract.ContentDefinition] = t.contentDefinition
  def extractTerm(t: Contract): LitSeq[Contract.Term]                           = t.term
  override val thisName: String                                                 = "Contract"
  override val searchParams: Map[String, Contract => Seq[Any]] = Map(
    "subject"      -> (obj => obj.subject.toSeq),
    "domain"       -> (obj => obj.domain.toSeq),
    "issued"       -> (obj => obj.issued.toSeq),
    "instantiates" -> (obj => obj.instantiatesUri.toSeq),
    "status"       -> (obj => obj.status.toSeq),
    "signer"       -> (obj => obj.signer.map(_.party).toSeq),
    "identifier"   -> (obj => obj.identifier.toSeq),
    "url"          -> (obj => obj.url.toSeq),
    "authority"    -> (obj => obj.authority.toSeq),
    "patient"      -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Contract] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Contract(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("site", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[LitSeq[String]]("alias", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("scope", Some(None)),
          cursor.decodeAs[Option[CONTRACT_STATUS]]("status", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("issued", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("domain", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("author", Some(None)),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[Option[Period]]("applies", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("subject", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("subType", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[String]]("subtitle", Some(None)),
          cursor.decodeOptRef[UnionCodeableConceptOrReference]("topic"),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("authority", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("legalState", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("expirationType", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("supportingInfo", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("instantiatesUri", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("relevantHistory", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("contentDerivative", Some(None)),
          cursor.decodeOptRef[UnionAttachmentOrReference]("legallyBinding"),
          cursor.decodeAs[Option[Reference]]("instantiatesCanonical", Some(None)),
          cursor.decodeAs[LitSeq[Contract.Rule]]("rule", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Contract.Legal]]("legal", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Contract.Signer]]("signer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Contract.Friendly]]("friendly", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Contract.ContentDefinition]]("contentDefinition", Some(None)),
          cursor.decodeAs[LitSeq[Contract.Term]]("term", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, site, name, `type`, title, alias, scope, status, issued, domain, author, version, applies,
  *   subject, subType, subtitle, topic, authority, identifier, legalState, expirationType, supportingInfo, instantiatesUri,
  *   relevantHistory, contentDerivative, legallyBinding, instantiatesCanonical, rule, legal, signer, friendly, contentDefinition,
  *   term.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - Canonical identifier for this contract, represented as a URI (globally unique).
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param site
  *   - Sites in which the contract is complied with, exercised, or in force.
  * @param name
  *   - A natural language name identifying this Contract definition, derivative, or instance in any legal state. Provides
  *   additional information about its content. This name should be usable as an identifier for the module by machine processing
  *   applications such as code generation.
  * @param `type`
  *   - A high-level category for the legal instrument, whether constructed as a Contract definition, derivative, or instance in
  *   any legal state. Provides additional information about its content within the context of the Contract's scope to distinguish
  *   the kinds of systems that would be interested in the contract.
  * @param title
  *   - A short, descriptive, user-friendly title for this Contract definition, derivative, or instance in any legal state.t
  *   giving additional information about its content.
  * @param alias
  *   - Alternative representation of the title for this Contract definition, derivative, or instance in any legal state., e.g., a
  *   domain specific contract number related to legislation.
  * @param scope
  *   - A selector of legal concerns for this Contract definition, derivative, or instance in any legal state.
  * @param status
  *   - The status of the resource instance.
  * @param issued
  *   - When this Contract was issued.
  * @param domain
  *   - Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles,
  *   policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.
  * @param author
  *   - The individual or organization that authored the Contract definition, derivative, or instance in any legal state.
  * @param version
  *   - An edition identifier used for business purposes to label business significant variants.
  * @param applies
  *   - Relevant time or time-period when this Contract is applicable.
  * @param subject
  *   - The target entity impacted by or of interest to parties to the agreement.
  * @param subType
  *   - Sub-category for the Contract that distinguishes the kinds of systems that would be interested in the Contract within the
  *   context of the Contract's scope.
  * @param language
  *   - The base language in which the resource is written.
  * @param subtitle
  *   - An explanatory or alternate user-friendly title for this Contract definition, derivative, or instance in any legal state.t
  *   giving additional information about its content.
  * @param topic
  *   - Narrows the range of legal concerns to focus on the achievement of specific contractual objectives.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param authority
  *   - A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose
  *   of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and
  *   policies.
  * @param identifier
  *   - Unique identifier for this Contract or a derivative that references a Source Contract.
  * @param legalState
  *   - Legal states of the formation of a legal instrument, which is a formally executed written document that can be formally
  *   attributed to its author, records and formally expresses a legally enforceable act, process, or contractual duty,
  *   obligation, or right, and therefore evidences that act, process, or agreement.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param expirationType
  *   - Event resulting in discontinuation or termination of this Contract instance by one or more parties to the contract.
  * @param supportingInfo
  *   - Information that may be needed by/relevant to the performer in their execution of this term action.
  * @param instantiatesUri
  *   - The URL pointing to an externally maintained definition that is adhered to in whole or in part by this Contract.
  * @param relevantHistory
  *   - Links to Provenance records for past versions of this Contract definition, derivative, or instance, which identify key
  *   state transitions or updates that are likely to be relevant to a user looking at the current version of the Contract. The
  *   Provence.entity indicates the target that was changed in the update.
  *   http://build.fhir.org/provenance-definitions.html#Provenance.entity.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param contentDerivative
  *   - The minimal content derived from the basal information source at a specific stage in its lifecycle.
  * @param legallyBinding
  *   - Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered
  *   the "source of truth" and which would be the basis for legal action related to enforcement of this Contract.
  * @param instantiatesCanonical
  *   - The URL pointing to a FHIR-defined Contract Definition that is adhered to in whole or part by this Contract.
  * @param rule
  *   - List of Computable Policy Rule Language Representations of this Contract.
  * @param legal
  *   - List of Legal expressions or representations of this Contract.
  * @param signer
  *   - Parties with legal standing in the Contract, including the principal parties, the grantor(s) and grantee(s), which are any
  *   person or organization bound by the contract, and any ancillary parties, which facilitate the execution of the contract such
  *   as a notary or witness.
  * @param friendly
  *   - The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly language" means the
  *   representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a
  *   layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the
  *   Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
  * @param contentDefinition
  *   - Precusory content developed with a focus and intent of supporting the formation a Contract instance, which may be
  *   associated with and transformable into a Contract.
  * @param term
  *   - One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
  */
@POJOBoilerplate
class Contract(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val site: LitSeq[Reference] = LitSeq.empty,
    val name: Option[String] = None,
    val `type`: Option[CodeableConcept] = None,
    val title: Option[String] = None,
    val alias: LitSeq[String] = LitSeq.empty,
    val scope: Option[CodeableConcept] = None,
    val status: Option[CONTRACT_STATUS] = None,
    val issued: Option[FHIRDateTime] = None,
    val domain: LitSeq[Reference] = LitSeq.empty,
    val author: Option[Reference] = None,
    val version: Option[String] = None,
    val applies: Option[Period] = None,
    val subject: LitSeq[Reference] = LitSeq.empty,
    val subType: LitSeq[CodeableConcept] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val subtitle: Option[String] = None,
    val topic: Option[Contract.TopicChoice] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val authority: LitSeq[Reference] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val legalState: Option[CodeableConcept] = None,
    override val implicitRules: Option[UriStr] = None,
    val expirationType: Option[CodeableConcept] = None,
    val supportingInfo: LitSeq[Reference] = LitSeq.empty,
    val instantiatesUri: Option[UriStr] = None,
    val relevantHistory: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val contentDerivative: Option[CodeableConcept] = None,
    val legallyBinding: Option[Contract.LegallyBindingChoice] = None,
    val instantiatesCanonical: Option[Reference] = None,
    val rule: LitSeq[Contract.Rule] = LitSeq.empty,
    val legal: LitSeq[Contract.Legal] = LitSeq.empty,
    val signer: LitSeq[Contract.Signer] = LitSeq.empty,
    val friendly: LitSeq[Contract.Friendly] = LitSeq.empty,
    val contentDefinition: Option[Contract.ContentDefinition] = None,
    val term: LitSeq[Contract.Term] = LitSeq.empty,
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
  override val thisTypeName: String = "Contract"
}
