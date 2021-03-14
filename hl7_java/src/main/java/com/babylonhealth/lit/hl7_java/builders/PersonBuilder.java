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
import com.babylonhealth.lit.hl7.ADMINISTRATIVE_GENDER;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class PersonBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Collection<HumanName> name = Collections.emptyList();
  private Optional<Attachment> photo = Optional.empty();
  private Optional<ADMINISTRATIVE_GENDER> gender = Optional.empty();
  private Optional<Boolean> active = Optional.empty();
  private Collection<ContactPoint> telecom = Collections.emptyList();
  private Collection<Address> address = Collections.emptyList();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<FHIRDate> birthDate = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Reference> managingOrganization = Optional.empty();
  private Collection<Person.Link> link = Collections.emptyList();

  /** Required fields for {@link Person} */
  public PersonBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public PersonBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public PersonBuilder withMeta(@NonNull Meta meta) {
    this.meta = Optional.of(meta);
    return this;
  }
  /**
   * @param text - A human-readable narrative that contains a summary of the resource and can be
   *     used to represent the content of the resource to a human. The narrative need not encode all
   *     the structured data, but is required to contain sufficient detail to make it "clinically
   *     safe" for a human to just read the narrative. Resource definitions may define what content
   *     should be represented in the narrative to ensure clinical safety.
   */
  public PersonBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param name - A name associated with the person. */
  public PersonBuilder withName(@NonNull HumanName... name) {
    this.name = Arrays.asList(name);
    return this;
  }
  /** @param name - A name associated with the person. */
  public PersonBuilder withName(@NonNull Collection<HumanName> name) {
    this.name = Collections.unmodifiableCollection(name);
    return this;
  }
  /**
   * @param photo - An image that can be displayed as a thumbnail of the person to enhance the
   *     identification of the individual.
   */
  public PersonBuilder withPhoto(@NonNull Attachment photo) {
    this.photo = Optional.of(photo);
    return this;
  }
  /** @param gender - Administrative Gender. */
  public PersonBuilder withGender(@NonNull ADMINISTRATIVE_GENDER gender) {
    this.gender = Optional.of(gender);
    return this;
  }
  /** @param active - Whether this person's record is in active use. */
  public PersonBuilder withActive(@NonNull Boolean active) {
    this.active = Optional.of(active);
    return this;
  }
  /**
   * @param telecom - A contact detail for the person, e.g. a telephone number or an email address.
   */
  public PersonBuilder withTelecom(@NonNull ContactPoint... telecom) {
    this.telecom = Arrays.asList(telecom);
    return this;
  }
  /**
   * @param telecom - A contact detail for the person, e.g. a telephone number or an email address.
   */
  public PersonBuilder withTelecom(@NonNull Collection<ContactPoint> telecom) {
    this.telecom = Collections.unmodifiableCollection(telecom);
    return this;
  }
  /** @param address - One or more addresses for the person. */
  public PersonBuilder withAddress(@NonNull Address... address) {
    this.address = Arrays.asList(address);
    return this;
  }
  /** @param address - One or more addresses for the person. */
  public PersonBuilder withAddress(@NonNull Collection<Address> address) {
    this.address = Collections.unmodifiableCollection(address);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public PersonBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public PersonBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public PersonBuilder withContained(@NonNull Collection<Resource> contained) {
    this.contained = Collections.unmodifiableCollection(contained);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public PersonBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public PersonBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param birthDate - The birth date for the person. */
  public PersonBuilder withBirthDate(@NonNull FHIRDate birthDate) {
    this.birthDate = Optional.of(birthDate);
    return this;
  }
  /** @param identifier - Identifier for a person within a particular scope. */
  public PersonBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - Identifier for a person within a particular scope. */
  public PersonBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public PersonBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public PersonBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public PersonBuilder withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param managingOrganization - The organization that is the custodian of the person record. */
  public PersonBuilder withManagingOrganization(@NonNull Reference managingOrganization) {
    this.managingOrganization = Optional.of(managingOrganization);
    return this;
  }
  /** @param link - Link to a resource that concerns the same actual person. */
  public PersonBuilder withLink(@NonNull Person.Link... link) {
    this.link = Arrays.asList(link);
    return this;
  }
  /** @param link - Link to a resource that concerns the same actual person. */
  public PersonBuilder withLink(@NonNull Collection<Person.Link> link) {
    this.link = Collections.unmodifiableCollection(link);
    return this;
  }

  public PersonBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Person build() {
    return new Person(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        name.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(photo),
        OptionConverters.toScala(gender),
        OptionConverters.toScala(active.map(x -> (Object) x)),
        telecom.stream().collect(new LitSeqJCollector<>()),
        address.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(language),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(birthDate),
        identifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(managingOrganization),
        link.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}