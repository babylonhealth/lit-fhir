package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDate;
import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.ADMINISTRATIVE_GENDER;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface PatientBuilder extends DomainResourceBuilder {
  public Patient build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceBooleanOrDateTime deceased(Boolean b) {
    return new ChoiceBooleanOrDateTime(b);
  }

  public static ChoiceBooleanOrDateTime deceased(FHIRDateTime f) {
    return new ChoiceBooleanOrDateTime(f);
  }

  public static ChoiceBooleanOrInteger multipleBirth(Boolean b) {
    return new ChoiceBooleanOrInteger(b);
  }

  public static ChoiceBooleanOrInteger multipleBirth(Integer i) {
    return new ChoiceBooleanOrInteger(i);
  }

  public class Impl implements PatientBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Collection<HumanName> name = Collections.emptyList();
    private Collection<Attachment> photo = Collections.emptyList();
    private Optional<Boolean> active = Optional.empty();
    private Optional<ADMINISTRATIVE_GENDER> gender = Optional.empty();
    private Collection<ContactPoint> telecom = Collections.emptyList();
    private Collection<Address> address = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<FHIRDate> birthDate = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<ChoiceBooleanOrDateTime> deceased = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<CodeableConcept> maritalStatus = Optional.empty();
    private Optional<ChoiceBooleanOrInteger> multipleBirth = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Reference> generalPractitioner = Collections.emptyList();
    private Optional<Reference> managingOrganization = Optional.empty();
    private Collection<Patient.Link> link = Collections.emptyList();
    private Collection<Patient.Contact> contact = Collections.emptyList();
    private Collection<Patient.Communication> communication = Collections.emptyList();

    /** Required fields for {@link Patient} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public PatientBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public PatientBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public PatientBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public PatientBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public PatientBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param name - A name associated with the individual. */
    public PatientBuilder.Impl withName(@NonNull HumanName... name) {
      this.name = Arrays.asList(name);
      return this;
    }
    /** @param name - A name associated with the individual. */
    public PatientBuilder.Impl withName(@NonNull Collection<HumanName> name) {
      this.name = Collections.unmodifiableCollection(name);
      return this;
    }

    public PatientBuilder.Impl withName(@NonNull HumanNameBuilder... name) {
      this.name = Arrays.stream(name).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param photo - Image of the patient. */
    public PatientBuilder.Impl withPhoto(@NonNull Attachment... photo) {
      this.photo = Arrays.asList(photo);
      return this;
    }
    /** @param photo - Image of the patient. */
    public PatientBuilder.Impl withPhoto(@NonNull Collection<Attachment> photo) {
      this.photo = Collections.unmodifiableCollection(photo);
      return this;
    }

    public PatientBuilder.Impl withPhoto(@NonNull AttachmentBuilder... photo) {
      this.photo = Arrays.stream(photo).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param active - Whether this patient record is in active use. Many systems use this property
     *     to mark as non-current patients, such as those that have not been seen for a period of
     *     time based on an organization's business rules.
     *     <p>It is often used to filter patient lists to exclude inactive patients
     *     <p>Deceased patients may also be marked as inactive for the same reasons, but may be
     *     active for some time after death.
     */
    public PatientBuilder.Impl withActive(@NonNull Boolean active) {
      this.active = Optional.of(active);
      return this;
    }
    /**
     * @param gender - Administrative Gender - the gender that the patient is considered to have for
     *     administration and record keeping purposes.
     */
    public PatientBuilder.Impl withGender(@NonNull ADMINISTRATIVE_GENDER gender) {
      this.gender = Optional.of(gender);
      return this;
    }
    /**
     * @param telecom - A contact detail (e.g. a telephone number or an email address) by which the
     *     individual may be contacted.
     */
    public PatientBuilder.Impl withTelecom(@NonNull ContactPoint... telecom) {
      this.telecom = Arrays.asList(telecom);
      return this;
    }
    /**
     * @param telecom - A contact detail (e.g. a telephone number or an email address) by which the
     *     individual may be contacted.
     */
    public PatientBuilder.Impl withTelecom(@NonNull Collection<ContactPoint> telecom) {
      this.telecom = Collections.unmodifiableCollection(telecom);
      return this;
    }

    public PatientBuilder.Impl withTelecom(@NonNull ContactPointBuilder... telecom) {
      this.telecom = Arrays.stream(telecom).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param address - An address for the individual. */
    public PatientBuilder.Impl withAddress(@NonNull Address... address) {
      this.address = Arrays.asList(address);
      return this;
    }
    /** @param address - An address for the individual. */
    public PatientBuilder.Impl withAddress(@NonNull Collection<Address> address) {
      this.address = Collections.unmodifiableCollection(address);
      return this;
    }

    public PatientBuilder.Impl withAddress(@NonNull AddressBuilder... address) {
      this.address = Arrays.stream(address).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public PatientBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public PatientBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public PatientBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public PatientBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public PatientBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public PatientBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public PatientBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param birthDate - The date of birth for the individual. */
    public PatientBuilder.Impl withBirthDate(@NonNull FHIRDate birthDate) {
      this.birthDate = Optional.of(birthDate);
      return this;
    }
    /** @param identifier - An identifier for this patient. */
    public PatientBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - An identifier for this patient. */
    public PatientBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public PatientBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param deceased - Indicates if the individual is deceased or not. Field is a 'choice' field.
     *     Type should be one of Boolean, FHIRDateTime. To pass the value in, wrap with one of the
     *     PatientBuilder.deceased static methods
     */
    public PatientBuilder.Impl withDeceased(@NonNull ChoiceBooleanOrDateTime deceased) {
      this.deceased = Optional.of(deceased);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public PatientBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param maritalStatus - This field contains a patient's most recent marital (civil) status.
     */
    public PatientBuilder.Impl withMaritalStatus(@NonNull CodeableConcept maritalStatus) {
      this.maritalStatus = Optional.of(maritalStatus);
      return this;
    }

    public PatientBuilder.Impl withMaritalStatus(@NonNull CodeableConceptBuilder maritalStatus) {
      this.maritalStatus = Optional.of(maritalStatus.build());
      return this;
    }
    /**
     * @param multipleBirth - Indicates whether the patient is part of a multiple (boolean) or
     *     indicates the actual birth order (integer). Field is a 'choice' field. Type should be one
     *     of Boolean, Integer. To pass the value in, wrap with one of the
     *     PatientBuilder.multipleBirth static methods
     */
    public PatientBuilder.Impl withMultipleBirth(@NonNull ChoiceBooleanOrInteger multipleBirth) {
      this.multipleBirth = Optional.of(multipleBirth);
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
    public PatientBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public PatientBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public PatientBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param generalPractitioner - Patient's nominated care provider. */
    public PatientBuilder.Impl withGeneralPractitioner(@NonNull Reference... generalPractitioner) {
      this.generalPractitioner = Arrays.asList(generalPractitioner);
      return this;
    }
    /** @param generalPractitioner - Patient's nominated care provider. */
    public PatientBuilder.Impl withGeneralPractitioner(
        @NonNull Collection<Reference> generalPractitioner) {
      this.generalPractitioner = Collections.unmodifiableCollection(generalPractitioner);
      return this;
    }

    public PatientBuilder.Impl withGeneralPractitioner(
        @NonNull ReferenceBuilder... generalPractitioner) {
      this.generalPractitioner =
          Arrays.stream(generalPractitioner).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param managingOrganization - Organization that is the custodian of the patient record. */
    public PatientBuilder.Impl withManagingOrganization(@NonNull Reference managingOrganization) {
      this.managingOrganization = Optional.of(managingOrganization);
      return this;
    }

    public PatientBuilder.Impl withManagingOrganization(
        @NonNull ReferenceBuilder managingOrganization) {
      this.managingOrganization = Optional.of(managingOrganization.build());
      return this;
    }
    /** @param link - Link to another patient resource that concerns the same actual patient. */
    public PatientBuilder.Impl withLink(@NonNull Patient.Link... link) {
      this.link = Arrays.asList(link);
      return this;
    }
    /** @param link - Link to another patient resource that concerns the same actual patient. */
    public PatientBuilder.Impl withLink(@NonNull Collection<Patient.Link> link) {
      this.link = Collections.unmodifiableCollection(link);
      return this;
    }

    public PatientBuilder.Impl withLink(@NonNull Patient_LinkBuilder... link) {
      this.link = Arrays.stream(link).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param contact - A contact party (e.g. guardian, partner, friend) for the patient. */
    public PatientBuilder.Impl withContact(@NonNull Patient.Contact... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /** @param contact - A contact party (e.g. guardian, partner, friend) for the patient. */
    public PatientBuilder.Impl withContact(@NonNull Collection<Patient.Contact> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public PatientBuilder.Impl withContact(@NonNull Patient_ContactBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param communication - A language which may be used to communicate with the patient about his
     *     or her health.
     */
    public PatientBuilder.Impl withCommunication(@NonNull Patient.Communication... communication) {
      this.communication = Arrays.asList(communication);
      return this;
    }
    /**
     * @param communication - A language which may be used to communicate with the patient about his
     *     or her health.
     */
    public PatientBuilder.Impl withCommunication(
        @NonNull Collection<Patient.Communication> communication) {
      this.communication = Collections.unmodifiableCollection(communication);
      return this;
    }

    public PatientBuilder.Impl withCommunication(
        @NonNull Patient_CommunicationBuilder... communication) {
      this.communication = Arrays.stream(communication).map(e -> e.build()).collect(toList());
      return this;
    }

    public PatientBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Patient build() {
      return new Patient(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          name.stream().collect(new LitSeqJCollector<>()),
          photo.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(active.map(x -> (Object) x)),
          OptionConverters.toScala(gender),
          telecom.stream().collect(new LitSeqJCollector<>()),
          address.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(birthDate),
          identifier.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(deceased),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(maritalStatus),
          (Option) OptionConverters.toScala(multipleBirth),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          generalPractitioner.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(managingOrganization),
          link.stream().collect(new LitSeqJCollector<>()),
          contact.stream().collect(new LitSeqJCollector<>()),
          communication.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
