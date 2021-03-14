package com.babylonhealth.lit.hl7.model

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
import com.babylonhealth.lit.hl7.ACCOUNT_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Account extends CompanionFor[Account] {
  override val baseType: CompanionFor[Account] = Account
  object Guarantor extends CompanionFor[Guarantor] {
    def apply(
        id: Option[String] = None,
        party: Reference,
        onHold: Option[Boolean] = None,
        period: Option[Period] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Guarantor = new Guarantor(
      id,
      party,
      onHold,
      period,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Guarantor): Option[(Option[String], Reference, Option[Boolean], Option[Period], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.party, o.onHold, o.period, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val party: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("party", lTagOf[Reference], false, lTagOf[Reference])
    val onHold: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("onHold", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val period: FHIRComponentFieldMeta[Option[Period]] =
      FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, party, onHold, period, extension, modifierExtension)
    override def fields(t: Guarantor): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Reference](party, t.party),
      FHIRComponentField[Option[Boolean]](onHold, t.onHold),
      FHIRComponentField[Option[Period]](period, t.period),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Guarantor] = this
    val thisName: String                  = "Guarantor"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Guarantor] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Guarantor(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Reference]("party", None),
            cursor.decodeAs[Option[Boolean]]("onHold", Some(None)),
            cursor.decodeAs[Option[Period]]("period", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Guarantor(
      override val id: Option[String] = None,
      val party: Reference,
      val onHold: Option[Boolean] = None,
      val period: Option[Period] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Coverage extends CompanionFor[Coverage] {
    def apply(
        id: Option[String] = None,
        coverage: Reference,
        priority: Option[PositiveInt] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Coverage = new Coverage(
      id,
      coverage,
      priority,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Coverage): Option[(Option[String], Reference, Option[PositiveInt], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.coverage, o.priority, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val coverage: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("coverage", lTagOf[Reference], false, lTagOf[Reference])
    val priority: FHIRComponentFieldMeta[Option[PositiveInt]] =
      FHIRComponentFieldMeta("priority", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, coverage, priority, extension, modifierExtension)
    override def fields(t: Coverage): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Reference](coverage, t.coverage),
      FHIRComponentField[Option[PositiveInt]](priority, t.priority),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Coverage] = this
    val thisName: String                 = "Coverage"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Coverage] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Coverage(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Reference]("coverage", None),
            cursor.decodeAs[Option[PositiveInt]]("priority", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Coverage(
      override val id: Option[String] = None,
      val coverage: Reference,
      val priority: Option[PositiveInt] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Option[CodeableConcept] = None,
      name: Option[String] = None,
      owner: Option[Reference] = None,
      status: ACCOUNT_STATUS,
      partOf: Option[Reference] = None,
      subject: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      description: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      servicePeriod: Option[Period] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      coverage: LitSeq[Account.Coverage] = LitSeq.empty,
      guarantor: LitSeq[Account.Guarantor] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Account = new Account(
    id,
    meta,
    text,
    `type`,
    name,
    owner,
    status,
    partOf,
    subject,
    language,
    contained,
    extension,
    identifier,
    description,
    implicitRules,
    servicePeriod,
    modifierExtension,
    coverage,
    guarantor,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val owner: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("owner", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[ACCOUNT_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[ACCOUNT_STATUS], false, lTagOf[ACCOUNT_STATUS])
  val partOf: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val servicePeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("servicePeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val coverage: FHIRComponentFieldMeta[LitSeq[Account.Coverage]] =
    FHIRComponentFieldMeta("coverage", lTagOf[LitSeq[Account.Coverage]], false, lTagOf[Account.Coverage])
  val guarantor: FHIRComponentFieldMeta[LitSeq[Account.Guarantor]] =
    FHIRComponentFieldMeta("guarantor", lTagOf[LitSeq[Account.Guarantor]], false, lTagOf[Account.Guarantor])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    name,
    owner,
    status,
    partOf,
    subject,
    language,
    contained,
    extension,
    identifier,
    description,
    implicitRules,
    servicePeriod,
    modifierExtension,
    coverage,
    guarantor
  )
  override def fields(t: Account): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[Reference]](owner, t.owner),
    FHIRComponentField[ACCOUNT_STATUS](status, t.status),
    FHIRComponentField[Option[Reference]](partOf, t.partOf),
    FHIRComponentField[LitSeq[Reference]](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[String]](description, t.description),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Period]](servicePeriod, t.servicePeriod),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Account.Coverage]](coverage, t.coverage),
    FHIRComponentField[LitSeq[Account.Guarantor]](guarantor, t.guarantor)
  )
  def extractId(t: Account): Option[String]                   = t.id
  def extractMeta(t: Account): Option[Meta]                   = t.meta
  def extractText(t: Account): Option[Narrative]              = t.text
  def extractType(t: Account): Option[CodeableConcept]        = t.`type`
  def extractName(t: Account): Option[String]                 = t.name
  def extractOwner(t: Account): Option[Reference]             = t.owner
  def extractStatus(t: Account): ACCOUNT_STATUS               = t.status
  def extractPartOf(t: Account): Option[Reference]            = t.partOf
  def extractSubject(t: Account): LitSeq[Reference]           = t.subject
  def extractLanguage(t: Account): Option[LANGUAGES]          = t.language
  def extractContained(t: Account): LitSeq[Resource]          = t.contained
  def extractExtension(t: Account): LitSeq[Extension]         = t.extension
  def extractIdentifier(t: Account): LitSeq[Identifier]       = t.identifier
  def extractDescription(t: Account): Option[String]          = t.description
  def extractImplicitRules(t: Account): Option[UriStr]        = t.implicitRules
  def extractServicePeriod(t: Account): Option[Period]        = t.servicePeriod
  def extractModifierExtension(t: Account): LitSeq[Extension] = t.modifierExtension
  def extractCoverage(t: Account): LitSeq[Account.Coverage]   = t.coverage
  def extractGuarantor(t: Account): LitSeq[Account.Guarantor] = t.guarantor
  override val thisName: String                               = "Account"
  override val searchParams: Map[String, Account => Seq[Any]] = Map(
    "name"       -> (obj => obj.name.toSeq),
    "subject"    -> (obj => obj.subject.toSeq),
    "identifier" -> (obj => obj.identifier.toSeq),
    "status"     -> (obj => Seq(obj.status)),
    "owner"      -> (obj => obj.owner.toSeq),
    "type"       -> (obj => obj.`type`.toSeq),
    "period"     -> (obj => obj.servicePeriod.toSeq),
    "patient"    -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq)
  )
  def unapply(
      o: Account): Option[(Option[String], Option[Meta], Option[Narrative], Option[CodeableConcept], Option[String], Option[Reference], ACCOUNT_STATUS, Option[Reference], LitSeq[Reference], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], Option[String], Option[UriStr], Option[Period], LitSeq[Extension], LitSeq[Account.Coverage], LitSeq[Account.Guarantor])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`type`,
        o.name,
        o.owner,
        o.status,
        o.partOf,
        o.subject,
        o.language,
        o.contained,
        o.extension,
        o.identifier,
        o.description,
        o.implicitRules,
        o.servicePeriod,
        o.modifierExtension,
        o.coverage,
        o.guarantor))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Account] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Account(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Option[Reference]]("owner", Some(None)),
          cursor.decodeAs[ACCOUNT_STATUS]("status", None),
          cursor.decodeAs[Option[Reference]]("partOf", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("subject", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Period]]("servicePeriod", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Account.Coverage]]("coverage", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Account.Guarantor]]("guarantor", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields `type`, name, owner, status, partOf, subject, identifier, description, servicePeriod, coverage, guarantor.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param `type` - Categorizes the account for reporting and searching purposes.
  * @param name - Name used for the account when displaying it to humans in reports, etc.
  * @param owner - Indicates the service area, hospital, department, etc. with responsibility for managing the Account.
  * @param status - Indicates whether the account is presently used/usable or not.
  * @param partOf - Reference to a parent Account.
  * @param subject - Identifies the entity which incurs the expenses. While the immediate recipients of services or goods might be entities related to the subject, the expenses were ultimately incurred by the subject of the Account.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param identifier - Unique identifier used to reference the account.  Might or might not be intended for human use (e.g. credit card number).
  * @param description - Provides additional information about what the account tracks and how it is used.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param servicePeriod - The date range of services associated with this account.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param coverage - The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account.
  * @param guarantor - The parties responsible for balancing the account if other payment options fall short.
  */
@POJOBoilerplate
class Account(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Option[CodeableConcept] = None,
    val name: Option[String] = None,
    val owner: Option[Reference] = None,
    val status: ACCOUNT_STATUS,
    val partOf: Option[Reference] = None,
    val subject: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val description: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    val servicePeriod: Option[Period] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val coverage: LitSeq[Account.Coverage] = LitSeq.empty,
    val guarantor: LitSeq[Account.Guarantor] = LitSeq.empty,
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
  override val thisTypeName: String = "Account"
}
