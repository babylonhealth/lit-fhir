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
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class Us_core_organizationBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta =
      Optional.of(
          new MetaBuilder()
              .withProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-organization")
              .build());
  private Optional<Narrative> text = Optional.empty();
  private Collection<CodeableConcept> _type = Collections.emptyList();
  private String name;
  private Collection<String> alias = Collections.emptyList();
  private Boolean active;
  private Optional<Reference> partOf = Optional.empty();
  private Collection<ContactPoint> telecom = Collections.emptyList();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Reference> endpoint = Collections.emptyList();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Address> address = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Collection<Organization.Contact> contact = Collections.emptyList();

  /**
   * Required fields for {@link Us_core_organization}
   *
   * @param name - A name associated with the organization.
   * @param active - Whether the organization's record is still in active use.
   */
  public Us_core_organizationBuilder(String name, Boolean active) {
    this.name = name;
    this.active = active;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Us_core_organizationBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public Us_core_organizationBuilder withMeta(@NonNull Meta meta) {
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
  public Us_core_organizationBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param _type - The kind(s) of organization that this is. */
  public Us_core_organizationBuilder withType(@NonNull CodeableConcept... _type) {
    this._type = Arrays.asList(_type);
    return this;
  }
  /** @param _type - The kind(s) of organization that this is. */
  public Us_core_organizationBuilder withType(@NonNull Collection<CodeableConcept> _type) {
    this._type = Collections.unmodifiableCollection(_type);
    return this;
  }
  /**
   * @param alias - A list of alternate names that the organization is known as, or was known as in
   *     the past.
   */
  public Us_core_organizationBuilder withAlias(@NonNull String... alias) {
    this.alias = Arrays.asList(alias);
    return this;
  }
  /**
   * @param alias - A list of alternate names that the organization is known as, or was known as in
   *     the past.
   */
  public Us_core_organizationBuilder withAlias(@NonNull Collection<String> alias) {
    this.alias = Collections.unmodifiableCollection(alias);
    return this;
  }
  /** @param partOf - The organization of which this organization forms a part. */
  public Us_core_organizationBuilder withPartOf(@NonNull Reference partOf) {
    this.partOf = Optional.of(partOf);
    return this;
  }
  /** @param telecom - A contact detail for the organization. */
  public Us_core_organizationBuilder withTelecom(@NonNull ContactPoint... telecom) {
    this.telecom = Arrays.asList(telecom);
    return this;
  }
  /** @param telecom - A contact detail for the organization. */
  public Us_core_organizationBuilder withTelecom(@NonNull Collection<ContactPoint> telecom) {
    this.telecom = Collections.unmodifiableCollection(telecom);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public Us_core_organizationBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param endpoint - Technical endpoints providing access to services operated for the
   *     organization.
   */
  public Us_core_organizationBuilder withEndpoint(@NonNull Reference... endpoint) {
    this.endpoint = Arrays.asList(endpoint);
    return this;
  }
  /**
   * @param endpoint - Technical endpoints providing access to services operated for the
   *     organization.
   */
  public Us_core_organizationBuilder withEndpoint(@NonNull Collection<Reference> endpoint) {
    this.endpoint = Collections.unmodifiableCollection(endpoint);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public Us_core_organizationBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public Us_core_organizationBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public Us_core_organizationBuilder withExtension(@NonNull Extension... extension) {
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
  public Us_core_organizationBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public Us_core_organizationBuilder withImplicitRules(@NonNull String implicitRules) {
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
  public Us_core_organizationBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
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
  public Us_core_organizationBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param address - An address for the organization. */
  public Us_core_organizationBuilder withAddress(@NonNull Address... address) {
    this.address = Arrays.asList(address);
    return this;
  }
  /** @param address - An address for the organization. */
  public Us_core_organizationBuilder withAddress(@NonNull Collection<Address> address) {
    this.address = Collections.unmodifiableCollection(address);
    return this;
  }
  /**
   * @param identifier - Identifier for the organization that is used to identify the organization
   *     across multiple disparate systems.
   */
  public Us_core_organizationBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - Identifier for the organization that is used to identify the organization
   *     across multiple disparate systems.
   */
  public Us_core_organizationBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /** @param contact - Contact for the organization for a certain purpose. */
  public Us_core_organizationBuilder withContact(@NonNull Organization.Contact... contact) {
    this.contact = Arrays.asList(contact);
    return this;
  }
  /** @param contact - Contact for the organization for a certain purpose. */
  public Us_core_organizationBuilder withContact(
      @NonNull Collection<Organization.Contact> contact) {
    this.contact = Collections.unmodifiableCollection(contact);
    return this;
  }

  public Us_core_organizationBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Us_core_organization build() {
    return new Us_core_organization(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        _type.stream().collect(new LitSeqJCollector<>()),
        name,
        alias.stream().collect(new LitSeqJCollector<>()),
        active,
        OptionConverters.toScala(partOf),
        telecom.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(language),
        endpoint.stream().collect(new LitSeqJCollector<>()),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        address.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        contact.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
