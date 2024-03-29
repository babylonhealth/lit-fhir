package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.CONSENT_PROVISION_TYPE;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Consent_ProvisionBuilder {
  public Consent.Provision build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements Consent_ProvisionBuilder {
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
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Consent_ProvisionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param _type */
    public Consent_ProvisionBuilder.Impl withType(@NonNull CONSENT_PROVISION_TYPE _type) {
      this._type = Optional.of(_type);
      return this;
    }
    /** @param code */
    public Consent_ProvisionBuilder.Impl withCode(@NonNull CodeableConcept... code) {
      this.code = Arrays.asList(code);
      return this;
    }
    /** @param code */
    public Consent_ProvisionBuilder.Impl withCode(@NonNull Collection<CodeableConcept> code) {
      this.code = Collections.unmodifiableCollection(code);
      return this;
    }

    public Consent_ProvisionBuilder.Impl withCode(@NonNull CodeableConceptBuilder... code) {
      this.code = Arrays.stream(code).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param _class */
    public Consent_ProvisionBuilder.Impl withClass(@NonNull Coding... _class) {
      this._class = Arrays.asList(_class);
      return this;
    }
    /** @param _class */
    public Consent_ProvisionBuilder.Impl withClass(@NonNull Collection<Coding> _class) {
      this._class = Collections.unmodifiableCollection(_class);
      return this;
    }

    public Consent_ProvisionBuilder.Impl withClass(@NonNull CodingBuilder... _class) {
      this._class = Arrays.stream(_class).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param period */
    public Consent_ProvisionBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public Consent_ProvisionBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /** @param action */
    public Consent_ProvisionBuilder.Impl withAction(@NonNull CodeableConcept... action) {
      this.action = Arrays.asList(action);
      return this;
    }
    /** @param action */
    public Consent_ProvisionBuilder.Impl withAction(@NonNull Collection<CodeableConcept> action) {
      this.action = Collections.unmodifiableCollection(action);
      return this;
    }

    public Consent_ProvisionBuilder.Impl withAction(@NonNull CodeableConceptBuilder... action) {
      this.action = Arrays.stream(action).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param purpose */
    public Consent_ProvisionBuilder.Impl withPurpose(@NonNull Coding... purpose) {
      this.purpose = Arrays.asList(purpose);
      return this;
    }
    /** @param purpose */
    public Consent_ProvisionBuilder.Impl withPurpose(@NonNull Collection<Coding> purpose) {
      this.purpose = Collections.unmodifiableCollection(purpose);
      return this;
    }

    public Consent_ProvisionBuilder.Impl withPurpose(@NonNull CodingBuilder... purpose) {
      this.purpose = Arrays.stream(purpose).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Consent_ProvisionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Consent_ProvisionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Consent_ProvisionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param provision - An exception to the base policy of this consent. An exception can be an
     *     addition or removal of access permissions.
     */
    public Consent_ProvisionBuilder.Impl withProvision(@NonNull Consent.Provision... provision) {
      this.provision = Arrays.asList(provision);
      return this;
    }
    /**
     * @param provision - An exception to the base policy of this consent. An exception can be an
     *     addition or removal of access permissions.
     */
    public Consent_ProvisionBuilder.Impl withProvision(
        @NonNull Collection<Consent.Provision> provision) {
      this.provision = Collections.unmodifiableCollection(provision);
      return this;
    }

    public Consent_ProvisionBuilder.Impl withProvision(
        @NonNull Consent_ProvisionBuilder... provision) {
      this.provision = Arrays.stream(provision).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param dataPeriod */
    public Consent_ProvisionBuilder.Impl withDataPeriod(@NonNull Period dataPeriod) {
      this.dataPeriod = Optional.of(dataPeriod);
      return this;
    }

    public Consent_ProvisionBuilder.Impl withDataPeriod(@NonNull PeriodBuilder dataPeriod) {
      this.dataPeriod = Optional.of(dataPeriod.build());
      return this;
    }
    /** @param securityLabel */
    public Consent_ProvisionBuilder.Impl withSecurityLabel(@NonNull Coding... securityLabel) {
      this.securityLabel = Arrays.asList(securityLabel);
      return this;
    }
    /** @param securityLabel */
    public Consent_ProvisionBuilder.Impl withSecurityLabel(
        @NonNull Collection<Coding> securityLabel) {
      this.securityLabel = Collections.unmodifiableCollection(securityLabel);
      return this;
    }

    public Consent_ProvisionBuilder.Impl withSecurityLabel(
        @NonNull CodingBuilder... securityLabel) {
      this.securityLabel = Arrays.stream(securityLabel).map(e -> e.build()).collect(toList());
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
    public Consent_ProvisionBuilder.Impl withModifierExtension(
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
    public Consent_ProvisionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Consent_ProvisionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param data */
    public Consent_ProvisionBuilder.Impl withData(@NonNull Consent$Provision$Data... data) {
      this.data = Arrays.asList(data);
      return this;
    }
    /** @param data */
    public Consent_ProvisionBuilder.Impl withData(
        @NonNull Collection<Consent$Provision$Data> data) {
      this.data = Collections.unmodifiableCollection(data);
      return this;
    }

    public Consent_ProvisionBuilder.Impl withData(@NonNull Consent_Provision_DataBuilder... data) {
      this.data = Arrays.stream(data).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param actor */
    public Consent_ProvisionBuilder.Impl withActor(@NonNull Consent$Provision$Actor... actor) {
      this.actor = Arrays.asList(actor);
      return this;
    }
    /** @param actor */
    public Consent_ProvisionBuilder.Impl withActor(
        @NonNull Collection<Consent$Provision$Actor> actor) {
      this.actor = Collections.unmodifiableCollection(actor);
      return this;
    }

    public Consent_ProvisionBuilder.Impl withActor(
        @NonNull Consent_Provision_ActorBuilder... actor) {
      this.actor = Arrays.stream(actor).map(e -> e.build()).collect(toList());
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
}
