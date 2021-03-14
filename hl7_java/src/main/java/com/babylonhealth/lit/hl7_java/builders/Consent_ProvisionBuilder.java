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
import com.babylonhealth.lit.hl7.CONSENT_PROVISION_TYPE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class Consent_ProvisionBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<CONSENT_PROVISION_TYPE> _type = Optional.empty();
  private Collection<CodeableConcept> code = Collections.emptyList();
  private Collection<Coding> _class = Collections.emptyList();
  private Optional<Period> period = Optional.empty();
  private Collection<CodeableConcept> action = Collections.emptyList();
  private Collection<Coding> purpose = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Consent.Provision> provision = Collections.emptyList();
  private Optional<Period> dataPeriod = Optional.empty();
  private Collection<Coding> securityLabel = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Consent$Provision$Data> data = Collections.emptyList();
  private Collection<Consent$Provision$Actor> actor = Collections.emptyList();

  /** Required fields for {@link Consent.Provision} */
  public Consent_ProvisionBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Consent_ProvisionBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param _type */
  public Consent_ProvisionBuilder withType(@NonNull CONSENT_PROVISION_TYPE _type) {
    this._type = Optional.of(_type);
    return this;
  }
  /** @param code */
  public Consent_ProvisionBuilder withCode(@NonNull CodeableConcept... code) {
    this.code = Arrays.asList(code);
    return this;
  }
  /** @param code */
  public Consent_ProvisionBuilder withCode(@NonNull Collection<CodeableConcept> code) {
    this.code = Collections.unmodifiableCollection(code);
    return this;
  }
  /** @param _class */
  public Consent_ProvisionBuilder withClass(@NonNull Coding... _class) {
    this._class = Arrays.asList(_class);
    return this;
  }
  /** @param _class */
  public Consent_ProvisionBuilder withClass(@NonNull Collection<Coding> _class) {
    this._class = Collections.unmodifiableCollection(_class);
    return this;
  }
  /** @param period */
  public Consent_ProvisionBuilder withPeriod(@NonNull Period period) {
    this.period = Optional.of(period);
    return this;
  }
  /** @param action */
  public Consent_ProvisionBuilder withAction(@NonNull CodeableConcept... action) {
    this.action = Arrays.asList(action);
    return this;
  }
  /** @param action */
  public Consent_ProvisionBuilder withAction(@NonNull Collection<CodeableConcept> action) {
    this.action = Collections.unmodifiableCollection(action);
    return this;
  }
  /** @param purpose */
  public Consent_ProvisionBuilder withPurpose(@NonNull Coding... purpose) {
    this.purpose = Arrays.asList(purpose);
    return this;
  }
  /** @param purpose */
  public Consent_ProvisionBuilder withPurpose(@NonNull Collection<Coding> purpose) {
    this.purpose = Collections.unmodifiableCollection(purpose);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Consent_ProvisionBuilder withExtension(@NonNull Extension... extension) {
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
  public Consent_ProvisionBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param provision - An exception to the base policy of this consent. An exception can be an
   *     addition or removal of access permissions.
   */
  public Consent_ProvisionBuilder withProvision(@NonNull Consent.Provision... provision) {
    this.provision = Arrays.asList(provision);
    return this;
  }
  /**
   * @param provision - An exception to the base policy of this consent. An exception can be an
   *     addition or removal of access permissions.
   */
  public Consent_ProvisionBuilder withProvision(@NonNull Collection<Consent.Provision> provision) {
    this.provision = Collections.unmodifiableCollection(provision);
    return this;
  }
  /** @param dataPeriod */
  public Consent_ProvisionBuilder withDataPeriod(@NonNull Period dataPeriod) {
    this.dataPeriod = Optional.of(dataPeriod);
    return this;
  }
  /** @param securityLabel */
  public Consent_ProvisionBuilder withSecurityLabel(@NonNull Coding... securityLabel) {
    this.securityLabel = Arrays.asList(securityLabel);
    return this;
  }
  /** @param securityLabel */
  public Consent_ProvisionBuilder withSecurityLabel(@NonNull Collection<Coding> securityLabel) {
    this.securityLabel = Collections.unmodifiableCollection(securityLabel);
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
  public Consent_ProvisionBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public Consent_ProvisionBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param data */
  public Consent_ProvisionBuilder withData(@NonNull Consent$Provision$Data... data) {
    this.data = Arrays.asList(data);
    return this;
  }
  /** @param data */
  public Consent_ProvisionBuilder withData(@NonNull Collection<Consent$Provision$Data> data) {
    this.data = Collections.unmodifiableCollection(data);
    return this;
  }
  /** @param actor */
  public Consent_ProvisionBuilder withActor(@NonNull Consent$Provision$Actor... actor) {
    this.actor = Arrays.asList(actor);
    return this;
  }
  /** @param actor */
  public Consent_ProvisionBuilder withActor(@NonNull Collection<Consent$Provision$Actor> actor) {
    this.actor = Collections.unmodifiableCollection(actor);
    return this;
  }

  public Consent.Provision build() {
    return new Consent.Provision(
        OptionConverters.toScala(id),
        OptionConverters.toScala(_type),
        code.stream().collect(new LitSeqJCollector<>()),
        _class.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(period),
        action.stream().collect(new LitSeqJCollector<>()),
        purpose.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        provision.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(dataPeriod),
        securityLabel.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        data.stream().collect(new LitSeqJCollector<>()),
        actor.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
