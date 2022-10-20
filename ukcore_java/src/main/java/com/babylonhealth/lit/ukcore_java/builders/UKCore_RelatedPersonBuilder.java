package com.babylonhealth.lit.ukcore_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDate;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.ADMINISTRATIVE_GENDER;
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

public interface UKCore_RelatedPersonBuilder extends RelatedPersonBuilder {
  public UKCore_RelatedPerson build();

  public static Impl init(Reference patient) {
    return new Impl(patient);
  }

  public static Impl builder(ReferenceBuilder patient) {
    return new Impl(patient.build());
  }

  public class Impl implements UKCore_RelatedPersonBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("https://fhir.hl7.org.uk/StructureDefinition/UKCore-RelatedPerson")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private Collection<HumanName> name = Collections.emptyList();
    private Collection<Attachment> photo = Collections.emptyList();
    private Optional<Boolean> active = Optional.empty();
    private Optional<ADMINISTRATIVE_GENDER> gender = Optional.empty();
    private Optional<Period> period = Optional.empty();
    private Reference patient;
    private Collection<ContactPoint> telecom = Collections.emptyList();
    private Collection<Address> address = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<FHIRDate> birthDate = Optional.empty();
    private Collection<CodeableConcept> relationship = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<RelatedPerson.Communication> communication = Collections.emptyList();

    /**
     * Required fields for {@link UKCore_RelatedPerson}
     *
     * @param patient - The patient this person is related to.
     */
    public Impl(Reference patient) {
      this.patient = patient;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public UKCore_RelatedPersonBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public UKCore_RelatedPersonBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public UKCore_RelatedPersonBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public UKCore_RelatedPersonBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public UKCore_RelatedPersonBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param name - A name associated with the person. */
    public UKCore_RelatedPersonBuilder.Impl withName(@NonNull HumanName... name) {
      this.name = Arrays.asList(name);
      return this;
    }
    /** @param name - A name associated with the person. */
    public UKCore_RelatedPersonBuilder.Impl withName(@NonNull Collection<HumanName> name) {
      this.name = Collections.unmodifiableCollection(name);
      return this;
    }

    public UKCore_RelatedPersonBuilder.Impl withName(@NonNull HumanNameBuilder... name) {
      this.name = Arrays.stream(name).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param photo - Image of the person. */
    public UKCore_RelatedPersonBuilder.Impl withPhoto(@NonNull Attachment... photo) {
      this.photo = Arrays.asList(photo);
      return this;
    }
    /** @param photo - Image of the person. */
    public UKCore_RelatedPersonBuilder.Impl withPhoto(@NonNull Collection<Attachment> photo) {
      this.photo = Collections.unmodifiableCollection(photo);
      return this;
    }

    public UKCore_RelatedPersonBuilder.Impl withPhoto(@NonNull AttachmentBuilder... photo) {
      this.photo = Arrays.stream(photo).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param active - Whether this related person record is in active use. */
    public UKCore_RelatedPersonBuilder.Impl withActive(@NonNull Boolean active) {
      this.active = Optional.of(active);
      return this;
    }
    /**
     * @param gender - Administrative Gender - the gender that the person is considered to have for
     *     administration and record keeping purposes.
     */
    public UKCore_RelatedPersonBuilder.Impl withGender(@NonNull ADMINISTRATIVE_GENDER gender) {
      this.gender = Optional.of(gender);
      return this;
    }
    /**
     * @param period - The period of time during which this relationship is or was active. If there
     *     are no dates defined, then the interval is unknown.
     */
    public UKCore_RelatedPersonBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public UKCore_RelatedPersonBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /**
     * @param telecom - A contact detail for the person, e.g. a telephone number or an email
     *     address.
     */
    public UKCore_RelatedPersonBuilder.Impl withTelecom(@NonNull ContactPoint... telecom) {
      this.telecom = Arrays.asList(telecom);
      return this;
    }
    /**
     * @param telecom - A contact detail for the person, e.g. a telephone number or an email
     *     address.
     */
    public UKCore_RelatedPersonBuilder.Impl withTelecom(@NonNull Collection<ContactPoint> telecom) {
      this.telecom = Collections.unmodifiableCollection(telecom);
      return this;
    }

    public UKCore_RelatedPersonBuilder.Impl withTelecom(@NonNull ContactPointBuilder... telecom) {
      this.telecom = Arrays.stream(telecom).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param address - Address where the related person can be contacted or visited. */
    public UKCore_RelatedPersonBuilder.Impl withAddress(@NonNull Address... address) {
      this.address = Arrays.asList(address);
      return this;
    }
    /** @param address - Address where the related person can be contacted or visited. */
    public UKCore_RelatedPersonBuilder.Impl withAddress(@NonNull Collection<Address> address) {
      this.address = Collections.unmodifiableCollection(address);
      return this;
    }

    public UKCore_RelatedPersonBuilder.Impl withAddress(@NonNull AddressBuilder... address) {
      this.address = Arrays.stream(address).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public UKCore_RelatedPersonBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public UKCore_RelatedPersonBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public UKCore_RelatedPersonBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public UKCore_RelatedPersonBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public UKCore_RelatedPersonBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public UKCore_RelatedPersonBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public UKCore_RelatedPersonBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param birthDate - The date on which the related person was born. */
    public UKCore_RelatedPersonBuilder.Impl withBirthDate(@NonNull FHIRDate birthDate) {
      this.birthDate = Optional.of(birthDate);
      return this;
    }
    /**
     * @param relationship - The nature of the relationship between a patient and the related
     *     person.
     */
    public UKCore_RelatedPersonBuilder.Impl withRelationship(
        @NonNull CodeableConcept... relationship) {
      this.relationship = Arrays.asList(relationship);
      return this;
    }
    /**
     * @param relationship - The nature of the relationship between a patient and the related
     *     person.
     */
    public UKCore_RelatedPersonBuilder.Impl withRelationship(
        @NonNull Collection<CodeableConcept> relationship) {
      this.relationship = Collections.unmodifiableCollection(relationship);
      return this;
    }

    public UKCore_RelatedPersonBuilder.Impl withRelationship(
        @NonNull CodeableConceptBuilder... relationship) {
      this.relationship = Arrays.stream(relationship).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public UKCore_RelatedPersonBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
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
    public UKCore_RelatedPersonBuilder.Impl withModifierExtension(
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
    public UKCore_RelatedPersonBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public UKCore_RelatedPersonBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - Identifier for a person within a particular scope. */
    public UKCore_RelatedPersonBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - Identifier for a person within a particular scope. */
    public UKCore_RelatedPersonBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public UKCore_RelatedPersonBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param communication - A language which may be used to communicate with about the patient's
     *     health.
     */
    public UKCore_RelatedPersonBuilder.Impl withCommunication(
        @NonNull RelatedPerson.Communication... communication) {
      this.communication = Arrays.asList(communication);
      return this;
    }
    /**
     * @param communication - A language which may be used to communicate with about the patient's
     *     health.
     */
    public UKCore_RelatedPersonBuilder.Impl withCommunication(
        @NonNull Collection<RelatedPerson.Communication> communication) {
      this.communication = Collections.unmodifiableCollection(communication);
      return this;
    }

    public UKCore_RelatedPersonBuilder.Impl withCommunication(
        @NonNull RelatedPerson_CommunicationBuilder... communication) {
      this.communication = Arrays.stream(communication).map(e -> e.build()).collect(toList());
      return this;
    }

    public UKCore_RelatedPersonBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public UKCore_RelatedPerson build() {
      return new UKCore_RelatedPerson(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          name.stream().collect(new LitSeqJCollector<>()),
          photo.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(active.map(x -> (Object) x)),
          OptionConverters.toScala(gender),
          OptionConverters.toScala(period),
          patient,
          telecom.stream().collect(new LitSeqJCollector<>()),
          address.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(birthDate),
          relationship.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          communication.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
