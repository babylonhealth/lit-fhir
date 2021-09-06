package com.babylonhealth.lit.hl7_java.builders;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import scala.math.BigDecimal;
import scala.Option;
import scala.collection.immutable.Seq;
import scala.jdk.javaapi.CollectionConverters;
import scala.jdk.javaapi.OptionConverters;

import lombok.NonNull;

import com.babylonhealth.lit.core.FHIRComponentFieldMeta;
import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.FHIRDate;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeq$;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.Choice$;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface ShareablevaluesetBuilder extends ValueSetBuilder {
  public Shareablevalueset build();

  public static Impl init(
      String url,
      String name,
      PUBLICATION_STATUS status,
      String version,
      String publisher,
      String description,
      Boolean experimental) {
    return new Impl(url, name, status, version, publisher, description, experimental);
  }

  public class Impl implements ShareablevaluesetBuilder {
    private Optional<String> id = Optional.empty();
    private String url;
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("http://hl7.org/fhir/StructureDefinition/shareablevalueset")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private String name;
    private Optional<FHIRDateTime> date = Optional.empty();
    private Optional<String> title = Optional.empty();
    private PUBLICATION_STATUS status;
    private String version;
    private Collection<ContactDetail> contact = Collections.emptyList();
    private Optional<String> purpose = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private String publisher;
    private Optional<Boolean> immutable = Optional.empty();
    private Optional<String> copyright = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<UsageContext> useContext = Collections.emptyList();
    private String description;
    private Boolean experimental;
    private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<ValueSet.Expansion> expansion = Optional.empty();
    private Optional<ValueSet.Compose> compose = Optional.empty();

    /**
     * Required fields for {@link Shareablevalueset}
     *
     * @param url - An absolute URI that is used to identify this value set when it is referenced in
     *     a specification, model, design or an instance; also called its canonical identifier. This
     *     SHOULD be globally unique and SHOULD be a literal address at which at which an
     *     authoritative instance of this value set is (or will be) published. This URL can be the
     *     target of a canonical reference. It SHALL remain the same when the value set is stored on
     *     different servers.
     * @param name - A natural language name identifying the value set. This name should be usable
     *     as an identifier for the module by machine processing applications such as code
     *     generation.
     * @param status - The status of this value set. Enables tracking the life-cycle of the content.
     *     The status of the value set applies to the value set definition (ValueSet.compose) and
     *     the associated ValueSet metadata. Expansions do not have a state.
     * @param version - The identifier that is used to identify this version of the value set when
     *     it is referenced in a specification, model, design or instance. This is an arbitrary
     *     value managed by the value set author and is not expected to be globally unique. For
     *     example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available.
     *     There is also no expectation that versions can be placed in a lexicographical sequence.
     * @param publisher - The name of the organization or individual that published the value set.
     * @param description - A free text natural language description of the value set from a
     *     consumer's perspective. The textual description specifies the span of meanings for
     *     concepts to be included within the Value Set Expansion, and also may specify the intended
     *     use and limitations of the Value Set.
     * @param experimental - A Boolean value to indicate that this value set is authored for testing
     *     purposes (or education/evaluation/marketing) and is not intended to be used for genuine
     *     usage.
     */
    public Impl(
        String url,
        String name,
        PUBLICATION_STATUS status,
        String version,
        String publisher,
        String description,
        Boolean experimental) {
      this.url = url;
      this.name = name;
      this.status = status;
      this.version = version;
      this.publisher = publisher;
      this.description = description;
      this.experimental = experimental;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ShareablevaluesetBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public ShareablevaluesetBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public ShareablevaluesetBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }
    /**
     * @param date - The date (and optionally time) when the value set was created or revised (e.g.
     *     the 'content logical definition').
     */
    public ShareablevaluesetBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /** @param title - A short, descriptive, user-friendly title for the value set. */
    public ShareablevaluesetBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public ShareablevaluesetBuilder.Impl withContact(@NonNull ContactDetail... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public ShareablevaluesetBuilder.Impl withContact(@NonNull Collection<ContactDetail> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }
    /**
     * @param purpose - Explanation of why this value set is needed and why it has been designed as
     *     it has.
     */
    public ShareablevaluesetBuilder.Impl withPurpose(@NonNull String purpose) {
      this.purpose = Optional.of(purpose);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public ShareablevaluesetBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ShareablevaluesetBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ShareablevaluesetBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ShareablevaluesetBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ShareablevaluesetBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /**
     * @param immutable - If this is set to 'true', then no new versions of the content logical
     *     definition can be created. Note: Other metadata might still change.
     */
    public ShareablevaluesetBuilder.Impl withImmutable(@NonNull Boolean immutable) {
      this.immutable = Optional.of(immutable);
      return this;
    }
    /**
     * @param copyright - A copyright statement relating to the value set and/or its contents.
     *     Copyright statements are generally legal restrictions on the use and publishing of the
     *     value set.
     */
    public ShareablevaluesetBuilder.Impl withCopyright(@NonNull String copyright) {
      this.copyright = Optional.of(copyright);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this value set when it is
     *     represented in other formats, or referenced in a specification, model, design or an
     *     instance.
     */
    public ShareablevaluesetBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this value set when it is
     *     represented in other formats, or referenced in a specification, model, design or an
     *     instance.
     */
    public ShareablevaluesetBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate value set instances.
     */
    public ShareablevaluesetBuilder.Impl withUseContext(@NonNull UsageContext... useContext) {
      this.useContext = Arrays.asList(useContext);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate value set instances.
     */
    public ShareablevaluesetBuilder.Impl withUseContext(
        @NonNull Collection<UsageContext> useContext) {
      this.useContext = Collections.unmodifiableCollection(useContext);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the value set is intended to be
     *     used.
     */
    public ShareablevaluesetBuilder.Impl withJurisdiction(
        @NonNull CodeableConcept... jurisdiction) {
      this.jurisdiction = Arrays.asList(jurisdiction);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the value set is intended to be
     *     used.
     */
    public ShareablevaluesetBuilder.Impl withJurisdiction(
        @NonNull Collection<CodeableConcept> jurisdiction) {
      this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public ShareablevaluesetBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public ShareablevaluesetBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public ShareablevaluesetBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /**
     * @param expansion - A value set can also be "expanded", where the value set is turned into a
     *     simple collection of enumerated codes. This element holds the expansion, if it has been
     *     performed.
     */
    public ShareablevaluesetBuilder.Impl withExpansion(@NonNull ValueSet.Expansion expansion) {
      this.expansion = Optional.of(expansion);
      return this;
    }
    /**
     * @param compose - A set of criteria that define the contents of the value set by including or
     *     excluding codes selected from the specified code system(s) that the value set draws from.
     *     This is also known as the Content Logical Definition (CLD).
     */
    public ShareablevaluesetBuilder.Impl withCompose(@NonNull ValueSet.Compose compose) {
      this.compose = Optional.of(compose);
      return this;
    }

    public ShareablevaluesetBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Shareablevalueset build() {
      return new Shareablevalueset(
          OptionConverters.toScala(id),
          url,
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          name,
          OptionConverters.toScala(date),
          OptionConverters.toScala(title),
          status,
          version,
          contact.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(purpose),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          publisher,
          OptionConverters.toScala(immutable.map(x -> (Object) x)),
          OptionConverters.toScala(copyright),
          identifier.stream().collect(new LitSeqJCollector<>()),
          useContext.stream().collect(new LitSeqJCollector<>()),
          description,
          experimental,
          jurisdiction.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(expansion),
          OptionConverters.toScala(compose),
          LitUtils.emptyMetaElMap());
    }
  }
}
