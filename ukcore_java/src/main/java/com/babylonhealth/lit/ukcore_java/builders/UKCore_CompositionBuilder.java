package com.babylonhealth.lit.ukcore_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.COMPOSITION_STATUS;
import com.babylonhealth.lit.hl7.V3_CONFIDENTIALITYCLASSIFICATION;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.ukcore.model.*;
import com.babylonhealth.lit.ukcore_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface UKCore_CompositionBuilder extends CompositionBuilder {
  public UKCore_Composition build();

  public static Impl init(
      CodeableConcept _type,
      FHIRDateTime date,
      String title,
      COMPOSITION_STATUS status,
      Collection<Reference> author) {
    return new Impl(_type, date, title, status, author);
  }

  public static Impl builder(
      CodeableConceptBuilder _type,
      FHIRDateTime date,
      String title,
      COMPOSITION_STATUS status,
      Collection<ReferenceBuilder> author) {
    return new Impl(
        _type.build(), date, title, status, new LitSeq<>(author).map(ReferenceBuilder::build));
  }

  public class Impl implements UKCore_CompositionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Composition")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private CodeableConcept _type;
    private FHIRDateTime date;
    private String title;
    private COMPOSITION_STATUS status;
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<CodeableConcept> category = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<V3_CONFIDENTIALITYCLASSIFICATION> confidentiality = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Identifier> identifier = Optional.empty();
    private Collection<Reference> author;
    private Collection<Composition.RelatesTo> relatesTo = Collections.emptyList();
    private Optional<Reference> subject = Optional.empty();
    private Optional<Reference> encounter = Optional.empty();
    private Optional<Reference> custodian = Optional.empty();
    private Collection<Composition.Event> event = Collections.emptyList();
    private Collection<Composition.Attester> attester = Collections.emptyList();
    private Collection<Composition.Section> section = Collections.emptyList();

    /**
     * Required fields for {@link UKCore_Composition}
     *
     * @param _type - Specifies the particular kind of composition (e.g. History and Physical,
     *     Discharge Summary, Progress Note). This usually equates to the purpose of making the
     *     composition.
     * @param date - The composition editing time, when the composition was last logically changed
     *     by the author.
     * @param title - Official human-readable label for the composition.
     * @param status - The workflow/clinical status of this composition. The status is a marker for
     *     the clinical standing of the document.
     * @param author - Identifies who is responsible for the information in the composition, not
     *     necessarily who typed it in.
     */
    public Impl(
        CodeableConcept _type,
        FHIRDateTime date,
        String title,
        COMPOSITION_STATUS status,
        Collection<Reference> author) {
      this._type = _type;
      this.date = date;
      this.title = title;
      this.status = status;
      this.author = author;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public UKCore_CompositionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public UKCore_CompositionBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public UKCore_CompositionBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public UKCore_CompositionBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public UKCore_CompositionBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public UKCore_CompositionBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param category - A categorization for the type of the composition - helps for indexing and
     *     searching. This may be implied by or derived from the code specified in the Composition
     *     Type. Further investgation is required about the usage of this element for UK Core.
     */
    public UKCore_CompositionBuilder.Impl withCategory(@NonNull CodeableConcept... category) {
      this.category = Arrays.asList(category);
      return this;
    }
    /**
     * @param category - A categorization for the type of the composition - helps for indexing and
     *     searching. This may be implied by or derived from the code specified in the Composition
     *     Type. Further investgation is required about the usage of this element for UK Core.
     */
    public UKCore_CompositionBuilder.Impl withCategory(
        @NonNull Collection<CodeableConcept> category) {
      this.category = Collections.unmodifiableCollection(category);
      return this;
    }

    public UKCore_CompositionBuilder.Impl withCategory(
        @NonNull CodeableConceptBuilder... category) {
      this.category = Arrays.stream(category).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public UKCore_CompositionBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public UKCore_CompositionBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public UKCore_CompositionBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public UKCore_CompositionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public UKCore_CompositionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public UKCore_CompositionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public UKCore_CompositionBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param confidentiality - The code specifying the level of confidentiality of the Composition.
     */
    public UKCore_CompositionBuilder.Impl withConfidentiality(
        @NonNull V3_CONFIDENTIALITYCLASSIFICATION confidentiality) {
      this.confidentiality = Optional.of(confidentiality);
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
    public UKCore_CompositionBuilder.Impl withModifierExtension(
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
    public UKCore_CompositionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public UKCore_CompositionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - A version-independent identifier for the Composition. This identifier
     *     stays constant as the composition is changed over time.
     */
    public UKCore_CompositionBuilder.Impl withIdentifier(@NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public UKCore_CompositionBuilder.Impl withIdentifier(@NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
      return this;
    }
    /**
     * @param relatesTo - Relationships that this composition has with other compositions or
     *     documents that already exist.
     */
    public UKCore_CompositionBuilder.Impl withRelatesTo(
        @NonNull Composition.RelatesTo... relatesTo) {
      this.relatesTo = Arrays.asList(relatesTo);
      return this;
    }
    /**
     * @param relatesTo - Relationships that this composition has with other compositions or
     *     documents that already exist.
     */
    public UKCore_CompositionBuilder.Impl withRelatesTo(
        @NonNull Collection<Composition.RelatesTo> relatesTo) {
      this.relatesTo = Collections.unmodifiableCollection(relatesTo);
      return this;
    }

    public UKCore_CompositionBuilder.Impl withRelatesTo(
        @NonNull Composition_RelatesToBuilder... relatesTo) {
      this.relatesTo = Arrays.stream(relatesTo).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param subject - Who or what the composition is about. The composition can be about a person,
     *     (patient or healthcare practitioner), a device (e.g. a machine) or even a group of
     *     subjects (such as a document about a herd of livestock, or a set of patients that share a
     *     common exposure).
     */
    public UKCore_CompositionBuilder.Impl withSubject(@NonNull Reference subject) {
      this.subject = Optional.of(subject);
      return this;
    }

    public UKCore_CompositionBuilder.Impl withSubject(@NonNull ReferenceBuilder subject) {
      this.subject = Optional.of(subject.build());
      return this;
    }
    /**
     * @param encounter - Describes the clinical encounter or type of care this documentation is
     *     associated with.
     */
    public UKCore_CompositionBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public UKCore_CompositionBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /**
     * @param custodian - Identifies the organization or group who is responsible for ongoing
     *     maintenance of and access to the composition/document information.
     */
    public UKCore_CompositionBuilder.Impl withCustodian(@NonNull Reference custodian) {
      this.custodian = Optional.of(custodian);
      return this;
    }

    public UKCore_CompositionBuilder.Impl withCustodian(@NonNull ReferenceBuilder custodian) {
      this.custodian = Optional.of(custodian.build());
      return this;
    }
    /**
     * @param event - The clinical service, such as a colonoscopy or an appendectomy, being
     *     documented.
     */
    public UKCore_CompositionBuilder.Impl withEvent(@NonNull Composition.Event... event) {
      this.event = Arrays.asList(event);
      return this;
    }
    /**
     * @param event - The clinical service, such as a colonoscopy or an appendectomy, being
     *     documented.
     */
    public UKCore_CompositionBuilder.Impl withEvent(@NonNull Collection<Composition.Event> event) {
      this.event = Collections.unmodifiableCollection(event);
      return this;
    }

    public UKCore_CompositionBuilder.Impl withEvent(@NonNull Composition_EventBuilder... event) {
      this.event = Arrays.stream(event).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param attester - A participant who has attested to the accuracy of the composition/document.
     */
    public UKCore_CompositionBuilder.Impl withAttester(@NonNull Composition.Attester... attester) {
      this.attester = Arrays.asList(attester);
      return this;
    }
    /**
     * @param attester - A participant who has attested to the accuracy of the composition/document.
     */
    public UKCore_CompositionBuilder.Impl withAttester(
        @NonNull Collection<Composition.Attester> attester) {
      this.attester = Collections.unmodifiableCollection(attester);
      return this;
    }

    public UKCore_CompositionBuilder.Impl withAttester(
        @NonNull Composition_AttesterBuilder... attester) {
      this.attester = Arrays.stream(attester).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param section - The root of the sections that make up the composition. */
    public UKCore_CompositionBuilder.Impl withSection(@NonNull Composition.Section... section) {
      this.section = Arrays.asList(section);
      return this;
    }
    /** @param section - The root of the sections that make up the composition. */
    public UKCore_CompositionBuilder.Impl withSection(
        @NonNull Collection<Composition.Section> section) {
      this.section = Collections.unmodifiableCollection(section);
      return this;
    }

    public UKCore_CompositionBuilder.Impl withSection(
        @NonNull Composition_SectionBuilder... section) {
      this.section = Arrays.stream(section).map(e -> e.build()).collect(toList());
      return this;
    }

    public UKCore_CompositionBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public UKCore_Composition build() {
      return new UKCore_Composition(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          _type,
          date,
          title,
          status,
          OptionConverters.toScala(language),
          category.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(confidentiality),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(identifier),
          author.stream().collect(new NonEmptyLitSeqJCollector<>()),
          relatesTo.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(subject),
          OptionConverters.toScala(encounter),
          OptionConverters.toScala(custodian),
          event.stream().collect(new LitSeqJCollector<>()),
          attester.stream().collect(new LitSeqJCollector<>()),
          section.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
