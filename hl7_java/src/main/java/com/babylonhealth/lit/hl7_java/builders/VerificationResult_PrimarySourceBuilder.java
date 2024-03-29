package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface VerificationResult_PrimarySourceBuilder {
  public VerificationResult.PrimarySource build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements VerificationResult_PrimarySourceBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Reference> who = Optional.empty();
    private Collection<CodeableConcept> _type = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<FHIRDateTime> validationDate = Optional.empty();
    private Optional<CodeableConcept> canPushUpdates = Optional.empty();
    private Optional<CodeableConcept> validationStatus = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<CodeableConcept> pushTypeAvailable = Collections.emptyList();
    private Collection<CodeableConcept> communicationMethod = Collections.emptyList();

    /** Required fields for {@link VerificationResult.PrimarySource} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public VerificationResult_PrimarySourceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param who */
    public VerificationResult_PrimarySourceBuilder.Impl withWho(@NonNull Reference who) {
      this.who = Optional.of(who);
      return this;
    }

    public VerificationResult_PrimarySourceBuilder.Impl withWho(@NonNull ReferenceBuilder who) {
      this.who = Optional.of(who.build());
      return this;
    }
    /** @param _type */
    public VerificationResult_PrimarySourceBuilder.Impl withType(
        @NonNull CodeableConcept... _type) {
      this._type = Arrays.asList(_type);
      return this;
    }
    /** @param _type */
    public VerificationResult_PrimarySourceBuilder.Impl withType(
        @NonNull Collection<CodeableConcept> _type) {
      this._type = Collections.unmodifiableCollection(_type);
      return this;
    }

    public VerificationResult_PrimarySourceBuilder.Impl withType(
        @NonNull CodeableConceptBuilder... _type) {
      this._type = Arrays.stream(_type).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public VerificationResult_PrimarySourceBuilder.Impl withExtension(
        @NonNull Extension... extension) {
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
    public VerificationResult_PrimarySourceBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public VerificationResult_PrimarySourceBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param validationDate */
    public VerificationResult_PrimarySourceBuilder.Impl withValidationDate(
        @NonNull FHIRDateTime validationDate) {
      this.validationDate = Optional.of(validationDate);
      return this;
    }
    /** @param canPushUpdates */
    public VerificationResult_PrimarySourceBuilder.Impl withCanPushUpdates(
        @NonNull CodeableConcept canPushUpdates) {
      this.canPushUpdates = Optional.of(canPushUpdates);
      return this;
    }

    public VerificationResult_PrimarySourceBuilder.Impl withCanPushUpdates(
        @NonNull CodeableConceptBuilder canPushUpdates) {
      this.canPushUpdates = Optional.of(canPushUpdates.build());
      return this;
    }
    /** @param validationStatus */
    public VerificationResult_PrimarySourceBuilder.Impl withValidationStatus(
        @NonNull CodeableConcept validationStatus) {
      this.validationStatus = Optional.of(validationStatus);
      return this;
    }

    public VerificationResult_PrimarySourceBuilder.Impl withValidationStatus(
        @NonNull CodeableConceptBuilder validationStatus) {
      this.validationStatus = Optional.of(validationStatus.build());
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
    public VerificationResult_PrimarySourceBuilder.Impl withModifierExtension(
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
    public VerificationResult_PrimarySourceBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public VerificationResult_PrimarySourceBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param pushTypeAvailable */
    public VerificationResult_PrimarySourceBuilder.Impl withPushTypeAvailable(
        @NonNull CodeableConcept... pushTypeAvailable) {
      this.pushTypeAvailable = Arrays.asList(pushTypeAvailable);
      return this;
    }
    /** @param pushTypeAvailable */
    public VerificationResult_PrimarySourceBuilder.Impl withPushTypeAvailable(
        @NonNull Collection<CodeableConcept> pushTypeAvailable) {
      this.pushTypeAvailable = Collections.unmodifiableCollection(pushTypeAvailable);
      return this;
    }

    public VerificationResult_PrimarySourceBuilder.Impl withPushTypeAvailable(
        @NonNull CodeableConceptBuilder... pushTypeAvailable) {
      this.pushTypeAvailable =
          Arrays.stream(pushTypeAvailable).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param communicationMethod */
    public VerificationResult_PrimarySourceBuilder.Impl withCommunicationMethod(
        @NonNull CodeableConcept... communicationMethod) {
      this.communicationMethod = Arrays.asList(communicationMethod);
      return this;
    }
    /** @param communicationMethod */
    public VerificationResult_PrimarySourceBuilder.Impl withCommunicationMethod(
        @NonNull Collection<CodeableConcept> communicationMethod) {
      this.communicationMethod = Collections.unmodifiableCollection(communicationMethod);
      return this;
    }

    public VerificationResult_PrimarySourceBuilder.Impl withCommunicationMethod(
        @NonNull CodeableConceptBuilder... communicationMethod) {
      this.communicationMethod =
          Arrays.stream(communicationMethod).map(e -> e.build()).collect(toList());
      return this;
    }

    public VerificationResult.PrimarySource build() {
      return new VerificationResult.PrimarySource(
          OptionConverters.toScala(id),
          OptionConverters.toScala(who),
          _type.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(validationDate),
          OptionConverters.toScala(canPushUpdates),
          OptionConverters.toScala(validationStatus),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          pushTypeAvailable.stream().collect(new LitSeqJCollector<>()),
          communicationMethod.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
