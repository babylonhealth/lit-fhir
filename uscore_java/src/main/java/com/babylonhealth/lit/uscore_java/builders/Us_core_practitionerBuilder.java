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

public interface Us_core_practitionerBuilder extends PractitionerBuilder {
  public Us_core_practitioner build();

  public static Impl init(Collection<HumanName> name, Collection<Identifier> identifier) {
    return new Impl(name, identifier);
  }

  public static Impl builder(
      Collection<HumanNameBuilder> name, Collection<IdentifierBuilder> identifier) {
    return new Impl(
        new LitSeq<>(name).map(HumanNameBuilder::build),
        new LitSeq<>(identifier).map(IdentifierBuilder::build));
  }

  public class Impl implements Us_core_practitionerBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-practitioner")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private Collection<Attachment> photo = Collections.emptyList();
    private Optional<Boolean> active = Optional.empty();
    private Optional<ADMINISTRATIVE_GENDER> gender = Optional.empty();
    private Collection<ContactPoint> telecom = Collections.emptyList();
    private Collection<Address> address = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<FHIRDate> birthDate = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<CodeableConcept> communication = Collections.emptyList();
    private Collection<HumanName> name;
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Identifier> identifier;
    private Collection<Practitioner.Qualification> qualification = Collections.emptyList();

    /**
     * Required fields for {@link Us_core_practitioner}
     *
     * @param name - The name(s) associated with the practitioner.
     * @param identifier - An identifier that applies to this person in this role.
     */
    public Impl(Collection<HumanName> name, Collection<Identifier> identifier) {
      this.name = name;
      this.identifier = identifier;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Us_core_practitionerBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public Us_core_practitionerBuilder.Impl withMeta(@NonNull Meta meta) {
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
    public Us_core_practitionerBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }
    /** @param photo - Image of the person. */
    public Us_core_practitionerBuilder.Impl withPhoto(@NonNull Attachment... photo) {
      this.photo = Arrays.asList(photo);
      return this;
    }
    /** @param photo - Image of the person. */
    public Us_core_practitionerBuilder.Impl withPhoto(@NonNull Collection<Attachment> photo) {
      this.photo = Collections.unmodifiableCollection(photo);
      return this;
    }
    /** @param active - Whether this practitioner's record is in active use. */
    public Us_core_practitionerBuilder.Impl withActive(@NonNull Boolean active) {
      this.active = Optional.of(active);
      return this;
    }
    /**
     * @param gender - Administrative Gender - the gender that the person is considered to have for
     *     administration and record keeping purposes.
     */
    public Us_core_practitionerBuilder.Impl withGender(@NonNull ADMINISTRATIVE_GENDER gender) {
      this.gender = Optional.of(gender);
      return this;
    }
    /**
     * @param telecom - A contact detail for the practitioner, e.g. a telephone number or an email
     *     address.
     */
    public Us_core_practitionerBuilder.Impl withTelecom(@NonNull ContactPoint... telecom) {
      this.telecom = Arrays.asList(telecom);
      return this;
    }
    /**
     * @param telecom - A contact detail for the practitioner, e.g. a telephone number or an email
     *     address.
     */
    public Us_core_practitionerBuilder.Impl withTelecom(@NonNull Collection<ContactPoint> telecom) {
      this.telecom = Collections.unmodifiableCollection(telecom);
      return this;
    }
    /**
     * @param address - Address(es) of the practitioner that are not role specific (typically home
     *     address). Work addresses are not typically entered in this property as they are usually
     *     role dependent.
     */
    public Us_core_practitionerBuilder.Impl withAddress(@NonNull Address... address) {
      this.address = Arrays.asList(address);
      return this;
    }
    /**
     * @param address - Address(es) of the practitioner that are not role specific (typically home
     *     address). Work addresses are not typically entered in this property as they are usually
     *     role dependent.
     */
    public Us_core_practitionerBuilder.Impl withAddress(@NonNull Collection<Address> address) {
      this.address = Collections.unmodifiableCollection(address);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public Us_core_practitionerBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Us_core_practitionerBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Us_core_practitionerBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
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
    public Us_core_practitionerBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Us_core_practitionerBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /** @param birthDate - The date of birth for the practitioner. */
    public Us_core_practitionerBuilder.Impl withBirthDate(@NonNull FHIRDate birthDate) {
      this.birthDate = Optional.of(birthDate);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public Us_core_practitionerBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param communication - A language the practitioner can use in patient communication. */
    public Us_core_practitionerBuilder.Impl withCommunication(
        @NonNull CodeableConcept... communication) {
      this.communication = Arrays.asList(communication);
      return this;
    }
    /** @param communication - A language the practitioner can use in patient communication. */
    public Us_core_practitionerBuilder.Impl withCommunication(
        @NonNull Collection<CodeableConcept> communication) {
      this.communication = Collections.unmodifiableCollection(communication);
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
    public Us_core_practitionerBuilder.Impl withModifierExtension(
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
    public Us_core_practitionerBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /**
     * @param qualification - The official certifications, training, and licenses that authorize or
     *     otherwise pertain to the provision of care by the practitioner. For example, a medical
     *     license issued by a medical board authorizing the practitioner to practice medicine
     *     within a certian locality.
     */
    public Us_core_practitionerBuilder.Impl withQualification(
        @NonNull Practitioner.Qualification... qualification) {
      this.qualification = Arrays.asList(qualification);
      return this;
    }
    /**
     * @param qualification - The official certifications, training, and licenses that authorize or
     *     otherwise pertain to the provision of care by the practitioner. For example, a medical
     *     license issued by a medical board authorizing the practitioner to practice medicine
     *     within a certian locality.
     */
    public Us_core_practitionerBuilder.Impl withQualification(
        @NonNull Collection<Practitioner.Qualification> qualification) {
      this.qualification = Collections.unmodifiableCollection(qualification);
      return this;
    }

    public Us_core_practitionerBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Us_core_practitioner build() {
      return new Us_core_practitioner(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          photo.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(active.map(x -> (Object) x)),
          OptionConverters.toScala(gender),
          telecom.stream().collect(new LitSeqJCollector<>()),
          address.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(birthDate),
          OptionConverters.toScala(implicitRules),
          communication.stream().collect(new LitSeqJCollector<>()),
          name.stream().collect(new NonEmptyLitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new NonEmptyLitSeqJCollector<>()),
          qualification.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
