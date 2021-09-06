package com.babylonhealth.lit.uscore_java.builders;

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
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.uscore.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.uscore_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.uscore_java.model.Unions.*;
import com.babylonhealth.lit.hl7.ADMINISTRATIVE_GENDER;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface Us_core_patientBuilder extends PatientBuilder {
  public Us_core_patient build();

  public static Impl init(
      ADMINISTRATIVE_GENDER gender, Collection<HumanName> name, Collection<Identifier> identifier) {
    return new Impl(gender, name, identifier);
  }

  public static Impl builder(
      ADMINISTRATIVE_GENDER gender,
      Collection<HumanNameBuilder> name,
      Collection<IdentifierBuilder> identifier) {
    return new Impl(
        gender,
        new LitSeq<>(name).map(HumanNameBuilder::build),
        new LitSeq<>(identifier).map(IdentifierBuilder::build));
  }

  public static Choice_2131715935 deceased(Boolean b) {
    return new Choice_2131715935(b);
  }

  public static Choice_2131715935 deceased(FHIRDateTime f) {
    return new Choice_2131715935(f);
  }

  public static Choice02065782851 multipleBirth(Boolean b) {
    return new Choice02065782851(b);
  }

  public static Choice02065782851 multipleBirth(Integer i) {
    return new Choice02065782851(i);
  }

  public class Impl implements Us_core_patientBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-patient")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private Collection<Attachment> photo = Collections.emptyList();
    private Optional<Boolean> active = Optional.empty();
    private ADMINISTRATIVE_GENDER gender;
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<FHIRDate> birthDate = Optional.empty();
    private Optional<Choice_2131715935> deceased = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<CodeableConcept> maritalStatus = Optional.empty();
    private Collection<HumanName> name;
    private Optional<Choice02065782851> multipleBirth = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<ContactPoint> telecom = Collections.emptyList();
    private Collection<Address> address = Collections.emptyList();
    private Collection<Reference> generalPractitioner = Collections.emptyList();
    private Collection<Identifier> identifier;
    private Optional<Reference> managingOrganization = Optional.empty();
    private Collection<Patient.Link> link = Collections.emptyList();
    private Collection<Patient.Contact> contact = Collections.emptyList();
    private Collection<Patient.Communication> communication = Collections.emptyList();

    /**
     * Required fields for {@link Us_core_patient}
     *
     * @param gender - Administrative Gender - the gender that the patient is considered to have for
     *     administration and record keeping purposes.
     * @param name - A name associated with the individual.
     * @param identifier - An identifier for this patient.
     */
    public Impl(
        ADMINISTRATIVE_GENDER gender,
        Collection<HumanName> name,
        Collection<Identifier> identifier) {
      this.gender = gender;
      this.name = name;
      this.identifier = identifier;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Us_core_patientBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public Us_core_patientBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public Us_core_patientBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public Us_core_patientBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public Us_core_patientBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param photo - Image of the patient. */
    public Us_core_patientBuilder.Impl withPhoto(@NonNull Attachment... photo) {
      this.photo = Arrays.asList(photo);
      return this;
    }
    /** @param photo - Image of the patient. */
    public Us_core_patientBuilder.Impl withPhoto(@NonNull Collection<Attachment> photo) {
      this.photo = Collections.unmodifiableCollection(photo);
      return this;
    }

    public Us_core_patientBuilder.Impl withPhoto(@NonNull AttachmentBuilder... photo) {
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
    public Us_core_patientBuilder.Impl withActive(@NonNull Boolean active) {
      this.active = Optional.of(active);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public Us_core_patientBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Us_core_patientBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Us_core_patientBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public Us_core_patientBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
      this.contained = Arrays.stream(contained).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param extension - An Extension */
    public Us_core_patientBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /** @param extension - An Extension */
    public Us_core_patientBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Us_core_patientBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param birthDate - The date of birth for the individual. */
    public Us_core_patientBuilder.Impl withBirthDate(@NonNull FHIRDate birthDate) {
      this.birthDate = Optional.of(birthDate);
      return this;
    }
    /**
     * @param deceased - Indicates if the individual is deceased or not. Field is a 'choice' field.
     *     Type should be one of Boolean, FHIRDateTime. To pass the value in, wrap with one of the
     *     Us_core_patientBuilder.deceased static methods
     */
    public Us_core_patientBuilder.Impl withDeceased(@NonNull Choice_2131715935 deceased) {
      this.deceased = Optional.of(deceased);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public Us_core_patientBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param maritalStatus - This field contains a patient's most recent marital (civil) status.
     */
    public Us_core_patientBuilder.Impl withMaritalStatus(@NonNull CodeableConcept maritalStatus) {
      this.maritalStatus = Optional.of(maritalStatus);
      return this;
    }

    public Us_core_patientBuilder.Impl withMaritalStatus(
        @NonNull CodeableConceptBuilder maritalStatus) {
      this.maritalStatus = Optional.of(maritalStatus.build());
      return this;
    }
    /**
     * @param multipleBirth - Indicates whether the patient is part of a multiple (boolean) or
     *     indicates the actual birth order (integer). Field is a 'choice' field. Type should be one
     *     of Boolean, Integer. To pass the value in, wrap with one of the
     *     Us_core_patientBuilder.multipleBirth static methods
     */
    public Us_core_patientBuilder.Impl withMultipleBirth(@NonNull Choice02065782851 multipleBirth) {
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
    public Us_core_patientBuilder.Impl withModifierExtension(
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
    public Us_core_patientBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Us_core_patientBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param telecom - A contact detail (e.g. a telephone number or an email address) by which the
     *     individual may be contacted.
     */
    public Us_core_patientBuilder.Impl withTelecom(@NonNull ContactPoint... telecom) {
      this.telecom = Arrays.asList(telecom);
      return this;
    }
    /**
     * @param telecom - A contact detail (e.g. a telephone number or an email address) by which the
     *     individual may be contacted.
     */
    public Us_core_patientBuilder.Impl withTelecom(@NonNull Collection<ContactPoint> telecom) {
      this.telecom = Collections.unmodifiableCollection(telecom);
      return this;
    }

    public Us_core_patientBuilder.Impl withTelecom(@NonNull ContactPointBuilder... telecom) {
      this.telecom = Arrays.stream(telecom).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param address - An address for the individual. */
    public Us_core_patientBuilder.Impl withAddress(@NonNull Address... address) {
      this.address = Arrays.asList(address);
      return this;
    }
    /** @param address - An address for the individual. */
    public Us_core_patientBuilder.Impl withAddress(@NonNull Collection<Address> address) {
      this.address = Collections.unmodifiableCollection(address);
      return this;
    }

    public Us_core_patientBuilder.Impl withAddress(@NonNull AddressBuilder... address) {
      this.address = Arrays.stream(address).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param generalPractitioner - Patient's nominated care provider. */
    public Us_core_patientBuilder.Impl withGeneralPractitioner(
        @NonNull Reference... generalPractitioner) {
      this.generalPractitioner = Arrays.asList(generalPractitioner);
      return this;
    }
    /** @param generalPractitioner - Patient's nominated care provider. */
    public Us_core_patientBuilder.Impl withGeneralPractitioner(
        @NonNull Collection<Reference> generalPractitioner) {
      this.generalPractitioner = Collections.unmodifiableCollection(generalPractitioner);
      return this;
    }

    public Us_core_patientBuilder.Impl withGeneralPractitioner(
        @NonNull ReferenceBuilder... generalPractitioner) {
      this.generalPractitioner =
          Arrays.stream(generalPractitioner).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param managingOrganization - Organization that is the custodian of the patient record. */
    public Us_core_patientBuilder.Impl withManagingOrganization(
        @NonNull Reference managingOrganization) {
      this.managingOrganization = Optional.of(managingOrganization);
      return this;
    }

    public Us_core_patientBuilder.Impl withManagingOrganization(
        @NonNull ReferenceBuilder managingOrganization) {
      this.managingOrganization = Optional.of(managingOrganization.build());
      return this;
    }
    /** @param link - Link to another patient resource that concerns the same actual patient. */
    public Us_core_patientBuilder.Impl withLink(@NonNull Patient.Link... link) {
      this.link = Arrays.asList(link);
      return this;
    }
    /** @param link - Link to another patient resource that concerns the same actual patient. */
    public Us_core_patientBuilder.Impl withLink(@NonNull Collection<Patient.Link> link) {
      this.link = Collections.unmodifiableCollection(link);
      return this;
    }

    public Us_core_patientBuilder.Impl withLink(@NonNull Patient_LinkBuilder... link) {
      this.link = Arrays.stream(link).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param contact - A contact party (e.g. guardian, partner, friend) for the patient. */
    public Us_core_patientBuilder.Impl withContact(@NonNull Patient.Contact... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /** @param contact - A contact party (e.g. guardian, partner, friend) for the patient. */
    public Us_core_patientBuilder.Impl withContact(@NonNull Collection<Patient.Contact> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public Us_core_patientBuilder.Impl withContact(@NonNull Patient_ContactBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param communication - A language which may be used to communicate with the patient about his
     *     or her health.
     */
    public Us_core_patientBuilder.Impl withCommunication(
        @NonNull Patient.Communication... communication) {
      this.communication = Arrays.asList(communication);
      return this;
    }
    /**
     * @param communication - A language which may be used to communicate with the patient about his
     *     or her health.
     */
    public Us_core_patientBuilder.Impl withCommunication(
        @NonNull Collection<Patient.Communication> communication) {
      this.communication = Collections.unmodifiableCollection(communication);
      return this;
    }

    public Us_core_patientBuilder.Impl withCommunication(
        @NonNull Patient_CommunicationBuilder... communication) {
      this.communication = Arrays.stream(communication).map(e -> e.build()).collect(toList());
      return this;
    }

    public Us_core_patientBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Us_core_patient build() {
      return new Us_core_patient(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          photo.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(active.map(x -> (Object) x)),
          gender,
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(birthDate),
          (Option) OptionConverters.toScala(deceased),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(maritalStatus),
          name.stream().collect(new NonEmptyLitSeqJCollector<>()),
          (Option) OptionConverters.toScala(multipleBirth),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          telecom.stream().collect(new LitSeqJCollector<>()),
          address.stream().collect(new LitSeqJCollector<>()),
          generalPractitioner.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new NonEmptyLitSeqJCollector<>()),
          OptionConverters.toScala(managingOrganization),
          link.stream().collect(new LitSeqJCollector<>()),
          contact.stream().collect(new LitSeqJCollector<>()),
          communication.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
