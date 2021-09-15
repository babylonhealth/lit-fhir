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

public interface ConceptMapBuilder extends DomainResourceBuilder {
  public ConceptMap build();

  public static Impl init(PUBLICATION_STATUS status) {
    return new Impl(status);
  }

  public static Impl builder(PUBLICATION_STATUS status) {
    return new Impl(status);
  }

  public static ChoiceCanonicalOrUri sourceCanonical(String s) {
    return ChoiceCanonicalOrUri.ChoiceCanonicalOrUriCanonical(s);
  }

  public static ChoiceCanonicalOrUri sourceUri(String s) {
    return ChoiceCanonicalOrUri.ChoiceCanonicalOrUriUriStr(s);
  }

  public static ChoiceCanonicalOrUri targetCanonical(String s) {
    return ChoiceCanonicalOrUri.ChoiceCanonicalOrUriCanonical(s);
  }

  public static ChoiceCanonicalOrUri targetUri(String s) {
    return ChoiceCanonicalOrUri.ChoiceCanonicalOrUriUriStr(s);
  }

  public class Impl implements ConceptMapBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> url = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<FHIRDateTime> date = Optional.empty();
    private Optional<String> title = Optional.empty();
    private PUBLICATION_STATUS status;
    private Optional<String> version = Optional.empty();
    private Collection<ContactDetail> contact = Collections.emptyList();
    private Optional<String> purpose = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> publisher = Optional.empty();
    private Optional<String> copyright = Optional.empty();
    private Optional<ChoiceCanonicalOrUri> source = Optional.empty();
    private Optional<ChoiceCanonicalOrUri> target = Optional.empty();
    private Optional<Identifier> identifier = Optional.empty();
    private Collection<UsageContext> useContext = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<Boolean> experimental = Optional.empty();
    private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<ConceptMap.Group> group = Collections.emptyList();

    /**
     * Required fields for {@link ConceptMap}
     *
     * @param status - The status of this concept map. Enables tracking the life-cycle of the
     *     content.
     */
    public Impl(PUBLICATION_STATUS status) {
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ConceptMapBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param url - An absolute URI that is used to identify this concept map when it is referenced
     *     in a specification, model, design or an instance; also called its canonical identifier.
     *     This SHOULD be globally unique and SHOULD be a literal address at which at which an
     *     authoritative instance of this concept map is (or will be) published. This URL can be the
     *     target of a canonical reference. It SHALL remain the same when the concept map is stored
     *     on different servers.
     */
    public ConceptMapBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public ConceptMapBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public ConceptMapBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
      this.meta = Optional.of(meta.build());
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public ConceptMapBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public ConceptMapBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param name - A natural language name identifying the concept map. This name should be usable
     *     as an identifier for the module by machine processing applications such as code
     *     generation.
     */
    public ConceptMapBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param date - The date (and optionally time) when the concept map was published. The date
     *     must change when the business version changes and it must change if the status code
     *     changes. In addition, it should change when the substantive content of the concept map
     *     changes.
     */
    public ConceptMapBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /** @param title - A short, descriptive, user-friendly title for the concept map. */
    public ConceptMapBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the concept map when
     *     it is referenced in a specification, model, design or instance. This is an arbitrary
     *     value managed by the concept map author and is not expected to be globally unique. For
     *     example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available.
     *     There is also no expectation that versions can be placed in a lexicographical sequence.
     */
    public ConceptMapBuilder.Impl withVersion(@NonNull String version) {
      this.version = Optional.of(version);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public ConceptMapBuilder.Impl withContact(@NonNull ContactDetail... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public ConceptMapBuilder.Impl withContact(@NonNull Collection<ContactDetail> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public ConceptMapBuilder.Impl withContact(@NonNull ContactDetailBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param purpose - Explanation of why this concept map is needed and why it has been designed
     *     as it has.
     */
    public ConceptMapBuilder.Impl withPurpose(@NonNull String purpose) {
      this.purpose = Optional.of(purpose);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public ConceptMapBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ConceptMapBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ConceptMapBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public ConceptMapBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
      this.contained = Arrays.stream(contained).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ConceptMapBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ConceptMapBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ConceptMapBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param publisher - The name of the organization or individual that published the concept map.
     */
    public ConceptMapBuilder.Impl withPublisher(@NonNull String publisher) {
      this.publisher = Optional.of(publisher);
      return this;
    }
    /**
     * @param copyright - A copyright statement relating to the concept map and/or its contents.
     *     Copyright statements are generally legal restrictions on the use and publishing of the
     *     concept map.
     */
    public ConceptMapBuilder.Impl withCopyright(@NonNull String copyright) {
      this.copyright = Optional.of(copyright);
      return this;
    }
    /**
     * @param source - Identifier for the source value set that contains the concepts that are being
     *     mapped and provides context for the mappings. Field is a 'choice' field. Type should be
     *     one of String. To pass the value in, wrap with one of the ConceptMapBuilder.source static
     *     methods
     */
    public ConceptMapBuilder.Impl withSource(@NonNull ChoiceCanonicalOrUri source) {
      this.source = Optional.of(source);
      return this;
    }
    /**
     * @param target - The target value set provides context for the mappings. Note that the mapping
     *     is made between concepts, not between value sets, but the value set provides important
     *     context about how the concept mapping choices are made. Field is a 'choice' field. Type
     *     should be one of String. To pass the value in, wrap with one of the
     *     ConceptMapBuilder.target static methods
     */
    public ConceptMapBuilder.Impl withTarget(@NonNull ChoiceCanonicalOrUri target) {
      this.target = Optional.of(target);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this concept map when it is
     *     represented in other formats, or referenced in a specification, model, design or an
     *     instance.
     */
    public ConceptMapBuilder.Impl withIdentifier(@NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public ConceptMapBuilder.Impl withIdentifier(@NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate concept map instances.
     */
    public ConceptMapBuilder.Impl withUseContext(@NonNull UsageContext... useContext) {
      this.useContext = Arrays.asList(useContext);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate concept map instances.
     */
    public ConceptMapBuilder.Impl withUseContext(@NonNull Collection<UsageContext> useContext) {
      this.useContext = Collections.unmodifiableCollection(useContext);
      return this;
    }

    public ConceptMapBuilder.Impl withUseContext(@NonNull UsageContextBuilder... useContext) {
      this.useContext = Arrays.stream(useContext).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param description - A free text natural language description of the concept map from a
     *     consumer's perspective.
     */
    public ConceptMapBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param experimental - A Boolean value to indicate that this concept map is authored for
     *     testing purposes (or education/evaluation/marketing) and is not intended to be used for
     *     genuine usage.
     */
    public ConceptMapBuilder.Impl withExperimental(@NonNull Boolean experimental) {
      this.experimental = Optional.of(experimental);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the concept map is intended to be
     *     used.
     */
    public ConceptMapBuilder.Impl withJurisdiction(@NonNull CodeableConcept... jurisdiction) {
      this.jurisdiction = Arrays.asList(jurisdiction);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the concept map is intended to be
     *     used.
     */
    public ConceptMapBuilder.Impl withJurisdiction(
        @NonNull Collection<CodeableConcept> jurisdiction) {
      this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
      return this;
    }

    public ConceptMapBuilder.Impl withJurisdiction(
        @NonNull CodeableConceptBuilder... jurisdiction) {
      this.jurisdiction = Arrays.stream(jurisdiction).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public ConceptMapBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
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
    public ConceptMapBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public ConceptMapBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ConceptMapBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param group - A group of mappings that all have the same source and target system. */
    public ConceptMapBuilder.Impl withGroup(@NonNull ConceptMap.Group... group) {
      this.group = Arrays.asList(group);
      return this;
    }
    /** @param group - A group of mappings that all have the same source and target system. */
    public ConceptMapBuilder.Impl withGroup(@NonNull Collection<ConceptMap.Group> group) {
      this.group = Collections.unmodifiableCollection(group);
      return this;
    }

    public ConceptMapBuilder.Impl withGroup(@NonNull ConceptMap_GroupBuilder... group) {
      this.group = Arrays.stream(group).map(e -> e.build()).collect(toList());
      return this;
    }

    public ConceptMapBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public ConceptMap build() {
      return new ConceptMap(
          OptionConverters.toScala(id),
          OptionConverters.toScala(url),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(name),
          OptionConverters.toScala(date),
          OptionConverters.toScala(title),
          status,
          OptionConverters.toScala(version),
          contact.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(purpose),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(publisher),
          OptionConverters.toScala(copyright),
          (Option) OptionConverters.toScala(source),
          (Option) OptionConverters.toScala(target),
          OptionConverters.toScala(identifier),
          useContext.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(experimental.map(x -> (Object) x)),
          jurisdiction.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          group.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
