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
import com.babylonhealth.lit.hl7.{ PUBLICATION_STATUS, CODESYSTEM_HIERARCHY_MEANING, CODESYSTEM_CONTENT_MODE }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Shareablecodesystem extends CompanionFor[Shareablecodesystem] {
  implicit def summonObjectAndCompanionShareablecodesystem_2012707104(
      o: Shareablecodesystem): ObjectAndCompanion[Shareablecodesystem, Shareablecodesystem.type] = ObjectAndCompanion(o, this)
  override type ResourceType = CodeSystem
  override type ParentType   = CodeSystem
  override val baseType: CompanionFor[ResourceType] = CodeSystem
  override val parentType: CompanionFor[ParentType] = CodeSystem
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/shareablecodesystem")
  def apply(
      id: Option[String] = None,
      url: UriStr,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/shareablecodesystem"))),
      text: Option[Narrative] = None,
      name: String,
      date: Option[FHIRDateTime] = None,
      title: Option[String] = None,
      count: Option[UnsignedInt] = None,
      status: PUBLICATION_STATUS,
      version: String,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      content: CODESYSTEM_CONTENT_MODE,
      language: Option[LANGUAGES] = None,
      valueSet: Option[Canonical] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: String,
      copyright: Option[Markdown] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Markdown,
      supplements: Option[Canonical] = None,
      experimental: Boolean,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      caseSensitive: Option[Boolean] = None,
      compositional: Option[Boolean] = None,
      versionNeeded: Option[Boolean] = None,
      hierarchyMeaning: Option[CODESYSTEM_HIERARCHY_MEANING] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      filter: LitSeq[CodeSystem.Filter] = LitSeq.empty,
      property: LitSeq[CodeSystem.Property] = LitSeq.empty,
      concept: NonEmptyLitSeq[CodeSystem.Concept],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Shareablecodesystem = new Shareablecodesystem(
    id,
    url,
    meta,
    text,
    name,
    date,
    title,
    count,
    status,
    version,
    contact,
    purpose,
    content,
    language,
    valueSet,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    useContext,
    description,
    supplements,
    experimental,
    jurisdiction,
    implicitRules,
    caseSensitive,
    compositional,
    versionNeeded,
    hierarchyMeaning,
    modifierExtension,
    filter,
    property,
    concept,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[UriStr] =
    FHIRComponentFieldMeta("url", lTagOf[UriStr], false, lTagOf[UriStr])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val name: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val count: FHIRComponentFieldMeta[Option[UnsignedInt]] =
    FHIRComponentFieldMeta("count", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val version: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("version", lTagOf[String], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val content: FHIRComponentFieldMeta[CODESYSTEM_CONTENT_MODE] =
    FHIRComponentFieldMeta("content", lTagOf[CODESYSTEM_CONTENT_MODE], false, lTagOf[CODESYSTEM_CONTENT_MODE])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val valueSet: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("valueSet", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val publisher: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("publisher", lTagOf[String], false, lTagOf[String])
  val copyright: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("copyright", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val description: FHIRComponentFieldMeta[Markdown] =
    FHIRComponentFieldMeta("description", lTagOf[Markdown], false, lTagOf[Markdown])
  val supplements: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("supplements", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val experimental: FHIRComponentFieldMeta[Boolean] =
    FHIRComponentFieldMeta("experimental", lTagOf[Boolean], false, lTagOf[Boolean])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val caseSensitive: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("caseSensitive", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val compositional: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("compositional", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val versionNeeded: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("versionNeeded", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val hierarchyMeaning: FHIRComponentFieldMeta[Option[CODESYSTEM_HIERARCHY_MEANING]] =
    FHIRComponentFieldMeta(
      "hierarchyMeaning",
      lTagOf[Option[CODESYSTEM_HIERARCHY_MEANING]],
      false,
      lTagOf[CODESYSTEM_HIERARCHY_MEANING])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val filter: FHIRComponentFieldMeta[LitSeq[CodeSystem.Filter]] =
    FHIRComponentFieldMeta("filter", lTagOf[LitSeq[CodeSystem.Filter]], false, lTagOf[CodeSystem.Filter])
  val property: FHIRComponentFieldMeta[LitSeq[CodeSystem.Property]] =
    FHIRComponentFieldMeta("property", lTagOf[LitSeq[CodeSystem.Property]], false, lTagOf[CodeSystem.Property])
  val concept: FHIRComponentFieldMeta[NonEmptyLitSeq[CodeSystem.Concept]] =
    FHIRComponentFieldMeta("concept", lTagOf[NonEmptyLitSeq[CodeSystem.Concept]], false, lTagOf[CodeSystem.Concept])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    title,
    count,
    status,
    version,
    contact,
    purpose,
    content,
    language,
    valueSet,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    useContext,
    description,
    supplements,
    experimental,
    jurisdiction,
    implicitRules,
    caseSensitive,
    compositional,
    versionNeeded,
    hierarchyMeaning,
    modifierExtension,
    filter,
    property,
    concept
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[UriStr](url, t.url.get),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[String](name, t.name.get),
      FHIRComponentField[Option[FHIRDateTime]](date, t.date),
      FHIRComponentField[Option[String]](title, t.title),
      FHIRComponentField[Option[UnsignedInt]](count, t.count),
      FHIRComponentField[PUBLICATION_STATUS](status, t.status),
      FHIRComponentField[String](version, t.version.get),
      FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
      FHIRComponentField[Option[Markdown]](purpose, t.purpose),
      FHIRComponentField[CODESYSTEM_CONTENT_MODE](content, t.content),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[Option[Canonical]](valueSet, t.valueSet),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[String](publisher, t.publisher.get),
      FHIRComponentField[Option[Markdown]](copyright, t.copyright),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
      FHIRComponentField[Markdown](description, t.description.get),
      FHIRComponentField[Option[Canonical]](supplements, t.supplements),
      FHIRComponentField[Boolean](experimental, t.experimental.get),
      FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[Option[Boolean]](caseSensitive, t.caseSensitive),
      FHIRComponentField[Option[Boolean]](compositional, t.compositional),
      FHIRComponentField[Option[Boolean]](versionNeeded, t.versionNeeded),
      FHIRComponentField[Option[CODESYSTEM_HIERARCHY_MEANING]](hierarchyMeaning, t.hierarchyMeaning),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[CodeSystem.Filter]](filter, t.filter),
      FHIRComponentField[LitSeq[CodeSystem.Property]](property, t.property),
      FHIRComponentField[NonEmptyLitSeq[CodeSystem.Concept]](concept, t.concept.asNonEmpty)
    ))
  override def fields(t: Shareablecodesystem): Seq[FHIRComponentField[_]]                   = fieldsFromParent(t).get
  def extractId(t: Shareablecodesystem): Option[String]                                     = t.id
  def extractUrl(t: Shareablecodesystem): UriStr                                            = t.url.get
  def extractMeta(t: Shareablecodesystem): Option[Meta]                                     = t.meta
  def extractText(t: Shareablecodesystem): Option[Narrative]                                = t.text
  def extractName(t: Shareablecodesystem): String                                           = t.name.get
  def extractDate(t: Shareablecodesystem): Option[FHIRDateTime]                             = t.date
  def extractTitle(t: Shareablecodesystem): Option[String]                                  = t.title
  def extractCount(t: Shareablecodesystem): Option[UnsignedInt]                             = t.count
  def extractStatus(t: Shareablecodesystem): PUBLICATION_STATUS                             = t.status
  def extractVersion(t: Shareablecodesystem): String                                        = t.version.get
  def extractContact(t: Shareablecodesystem): LitSeq[ContactDetail]                         = t.contact
  def extractPurpose(t: Shareablecodesystem): Option[Markdown]                              = t.purpose
  def extractContent(t: Shareablecodesystem): CODESYSTEM_CONTENT_MODE                       = t.content
  def extractLanguage(t: Shareablecodesystem): Option[LANGUAGES]                            = t.language
  def extractValueSet(t: Shareablecodesystem): Option[Canonical]                            = t.valueSet
  def extractContained(t: Shareablecodesystem): LitSeq[Resource]                            = t.contained
  def extractExtension(t: Shareablecodesystem): LitSeq[Extension]                           = t.extension
  def extractPublisher(t: Shareablecodesystem): String                                      = t.publisher.get
  def extractCopyright(t: Shareablecodesystem): Option[Markdown]                            = t.copyright
  def extractIdentifier(t: Shareablecodesystem): LitSeq[Identifier]                         = t.identifier
  def extractUseContext(t: Shareablecodesystem): LitSeq[UsageContext]                       = t.useContext
  def extractDescription(t: Shareablecodesystem): Markdown                                  = t.description.get
  def extractSupplements(t: Shareablecodesystem): Option[Canonical]                         = t.supplements
  def extractExperimental(t: Shareablecodesystem): Boolean                                  = t.experimental.get
  def extractJurisdiction(t: Shareablecodesystem): LitSeq[CodeableConcept]                  = t.jurisdiction
  def extractImplicitRules(t: Shareablecodesystem): Option[UriStr]                          = t.implicitRules
  def extractCaseSensitive(t: Shareablecodesystem): Option[Boolean]                         = t.caseSensitive
  def extractCompositional(t: Shareablecodesystem): Option[Boolean]                         = t.compositional
  def extractVersionNeeded(t: Shareablecodesystem): Option[Boolean]                         = t.versionNeeded
  def extractHierarchyMeaning(t: Shareablecodesystem): Option[CODESYSTEM_HIERARCHY_MEANING] = t.hierarchyMeaning
  def extractModifierExtension(t: Shareablecodesystem): LitSeq[Extension]                   = t.modifierExtension
  def extractFilter(t: Shareablecodesystem): LitSeq[CodeSystem.Filter]                      = t.filter
  def extractProperty(t: Shareablecodesystem): LitSeq[CodeSystem.Property]                  = t.property
  def extractConcept(t: Shareablecodesystem): NonEmptyLitSeq[CodeSystem.Concept]            = t.concept.asNonEmpty
  override val thisName: String                                                             = "Shareablecodesystem"
  override val searchParams: Map[String, Shareablecodesystem => Seq[Any]]                   = CodeSystem.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Shareablecodesystem] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Shareablecodesystem(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[UriStr]("url", None),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[String]("name", None),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[Option[UnsignedInt]]("count", Some(None)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[String]("version", None),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeAs[CODESYSTEM_CONTENT_MODE]("content", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[Canonical]]("valueSet", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[String]("publisher", None),
          cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Markdown]("description", None),
          cursor.decodeAs[Option[Canonical]]("supplements", Some(None)),
          cursor.decodeAs[Boolean]("experimental", None),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Boolean]]("caseSensitive", Some(None)),
          cursor.decodeAs[Option[Boolean]]("compositional", Some(None)),
          cursor.decodeAs[Option[Boolean]]("versionNeeded", Some(None)),
          cursor.decodeAs[Option[CODESYSTEM_HIERARCHY_MEANING]]("hierarchyMeaning", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeSystem.Filter]]("filter", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeSystem.Property]]("property", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[CodeSystem.Concept]]("concept", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Enforces the minimum information set for the value set metadata required by HL7 and other organizations that share and publish
  * value sets
  *
  * Subclass of [[hl7.model.CodeSystem]] (The CodeSystem resource is used to declare the existence of and describe a code system
  * or code system supplement and its key properties, and optionally define a part or all of its content.)
  *
  * @constructor
  *   Inherits all params from parent. Requires the following fields which were optional in the parent: url, name, version,
  *   publisher, description, experimental, concept.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this code system when it is referenced in a specification, model, design or an
  *   instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
  *   which an authoritative instance of this code system is (or will be) published. This URL can be the target of a canonical
  *   reference. It SHALL remain the same when the code system is stored on different servers. This is used in
  *   [Coding](datatypes.html#Coding).system.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the code system. This name should be usable as an identifier for the module by machine
  *   processing applications such as code generation.
  * @param date
  *   - The date (and optionally time) when the code system was published. The date must change when the business version changes
  *   and it must change if the status code changes. In addition, it should change when the substantive content of the code system
  *   changes.
  * @param title
  *   - A short, descriptive, user-friendly title for the code system.
  * @param count
  *   - The total number of concepts defined by the code system. Where the code system has a compositional grammar, the basis of
  *   this count is defined by the system steward.
  * @param status
  *   - The date (and optionally time) when the code system resource was created or revised.
  * @param version
  *   - The identifier that is used to identify this version of the code system when it is referenced in a specification, model,
  *   design or instance. This is an arbitrary value managed by the code system author and is not expected to be globally unique.
  *   For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation
  *   that versions can be placed in a lexicographical sequence. This is used in [Coding](datatypes.html#Coding).version.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose
  *   - Explanation of why this code system is needed and why it has been designed as it has.
  * @param content
  *   - The extent of the content of the code system (the concepts and codes it defines) are represented in this resource
  *   instance.
  * @param language
  *   - The base language in which the resource is written.
  * @param valueSet
  *   - Canonical reference to the value set that contains the entire code system.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param publisher
  *   - The name of the organization or individual that published the code system.
  * @param copyright
  *   - A copyright statement relating to the code system and/or its contents. Copyright statements are generally legal
  *   restrictions on the use and publishing of the code system.
  * @param identifier
  *   - A formal identifier that is used to identify this code system when it is represented in other formats, or referenced in a
  *   specification, model, design or an instance.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *   general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *   used to assist with indexing and searching for appropriate code system instances.
  * @param description
  *   - A free text natural language description of the code system from a consumer's perspective.
  * @param supplements
  *   - The canonical URL of the code system that this code system supplement is adding designations and properties to.
  * @param experimental
  *   - A Boolean value to indicate that this code system is authored for testing purposes (or education/evaluation/marketing) and
  *   is not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A legal or geographic region in which the code system is intended to be used.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param caseSensitive
  *   - If code comparison is case sensitive when codes within this system are compared to each other.
  * @param compositional
  *   - The code system defines a compositional (post-coordination) grammar.
  * @param versionNeeded
  *   - This flag is used to signify that the code system does not commit to concept permanence across versions. If true, a
  *   version must be specified when referencing this code system.
  * @param hierarchyMeaning
  *   - The meaning of the hierarchy of concepts as represented in this resource.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param filter
  *   - A filter that can be used in a value set compose statement when selecting concepts using a filter.
  * @param property
  *   - A property defines an additional slot through which additional information can be provided about a concept.
  * @param concept
  *   - Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be
  *   consulted to determine what the meanings of the hierarchical relationships are.
  */
@POJOBoilerplate
class Shareablecodesystem(
    override val id: Option[String] = None,
    url: UriStr,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/shareablecodesystem"))),
    override val text: Option[Narrative] = None,
    name: String,
    override val date: Option[FHIRDateTime] = None,
    override val title: Option[String] = None,
    override val count: Option[UnsignedInt] = None,
    override val status: PUBLICATION_STATUS,
    version: String,
    override val contact: LitSeq[ContactDetail] = LitSeq.empty,
    override val purpose: Option[Markdown] = None,
    override val content: CODESYSTEM_CONTENT_MODE,
    override val language: Option[LANGUAGES] = None,
    override val valueSet: Option[Canonical] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    publisher: String,
    override val copyright: Option[Markdown] = None,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val useContext: LitSeq[UsageContext] = LitSeq.empty,
    description: Markdown,
    override val supplements: Option[Canonical] = None,
    experimental: Boolean,
    override val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val caseSensitive: Option[Boolean] = None,
    override val compositional: Option[Boolean] = None,
    override val versionNeeded: Option[Boolean] = None,
    override val hierarchyMeaning: Option[CODESYSTEM_HIERARCHY_MEANING] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val filter: LitSeq[CodeSystem.Filter] = LitSeq.empty,
    override val property: LitSeq[CodeSystem.Property] = LitSeq.empty,
    concept: NonEmptyLitSeq[CodeSystem.Concept],
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends CodeSystem(
      id = id,
      url = Some(url),
      meta = meta,
      text = text,
      name = Some(name),
      date = date,
      title = title,
      count = count,
      status = status,
      version = Some(version),
      contact = contact,
      purpose = purpose,
      content = content,
      language = language,
      valueSet = valueSet,
      contained = contained,
      extension = extension,
      publisher = Some(publisher),
      copyright = copyright,
      identifier = identifier,
      useContext = useContext,
      description = Some(description),
      supplements = supplements,
      experimental = Some(experimental),
      jurisdiction = jurisdiction,
      implicitRules = implicitRules,
      caseSensitive = caseSensitive,
      compositional = compositional,
      versionNeeded = versionNeeded,
      hierarchyMeaning = hierarchyMeaning,
      modifierExtension = modifierExtension,
      filter = filter,
      property = property,
      concept = concept.refine,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "CodeSystem"
}
