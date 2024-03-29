package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.Choice;
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
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface Immunization_ProtocolAppliedBuilder {
  public Immunization.ProtocolApplied build();

  public static Impl init(@NonNull ChoicePositiveIntOrString doseNumber) {
    return new Impl(doseNumber);
  }

  public static Impl builder(@NonNull ChoicePositiveIntOrString doseNumber) {
    return new Impl(doseNumber);
  }

  public static ChoicePositiveIntOrString doseNumber(Integer i) {
    return new ChoicePositiveIntOrString(i);
  }

  public static ChoicePositiveIntOrString doseNumber(String s) {
    return new ChoicePositiveIntOrString(s);
  }

  public static ChoicePositiveIntOrString seriesDoses(Integer i) {
    return new ChoicePositiveIntOrString(i);
  }

  public static ChoicePositiveIntOrString seriesDoses(String s) {
    return new ChoicePositiveIntOrString(s);
  }

  public class Impl implements Immunization_ProtocolAppliedBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> series = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> authority = Optional.empty();
    private Collection<CodeableConcept> targetDisease = Collections.emptyList();
    private ChoicePositiveIntOrString doseNumber;
    private Optional<ChoicePositiveIntOrString> seriesDoses = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link Immunization.ProtocolApplied}
     *
     * @param doseNumber Field is a 'choice' field. Type should be one of Integer, String. To pass
     *     the value in, wrap with one of the Immunization_ProtocolAppliedBuilder.doseNumber static
     *     methods
     */
    public Impl(@NonNull ChoicePositiveIntOrString doseNumber) {
      this.doseNumber = doseNumber;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Immunization_ProtocolAppliedBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param series */
    public Immunization_ProtocolAppliedBuilder.Impl withSeries(@NonNull String series) {
      this.series = Optional.of(series);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Immunization_ProtocolAppliedBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Immunization_ProtocolAppliedBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Immunization_ProtocolAppliedBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param authority */
    public Immunization_ProtocolAppliedBuilder.Impl withAuthority(@NonNull Reference authority) {
      this.authority = Optional.of(authority);
      return this;
    }

    public Immunization_ProtocolAppliedBuilder.Impl withAuthority(
        @NonNull ReferenceBuilder authority) {
      this.authority = Optional.of(authority.build());
      return this;
    }
    /** @param targetDisease */
    public Immunization_ProtocolAppliedBuilder.Impl withTargetDisease(
        @NonNull CodeableConcept... targetDisease) {
      this.targetDisease = Arrays.asList(targetDisease);
      return this;
    }
    /** @param targetDisease */
    public Immunization_ProtocolAppliedBuilder.Impl withTargetDisease(
        @NonNull Collection<CodeableConcept> targetDisease) {
      this.targetDisease = Collections.unmodifiableCollection(targetDisease);
      return this;
    }

    public Immunization_ProtocolAppliedBuilder.Impl withTargetDisease(
        @NonNull CodeableConceptBuilder... targetDisease) {
      this.targetDisease = Arrays.stream(targetDisease).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param seriesDoses Field is a 'choice' field. Type should be one of Integer, String. To pass
     *     the value in, wrap with one of the Immunization_ProtocolAppliedBuilder.seriesDoses static
     *     methods
     */
    public Immunization_ProtocolAppliedBuilder.Impl withSeriesDoses(
        @NonNull ChoicePositiveIntOrString seriesDoses) {
      this.seriesDoses = Optional.of(seriesDoses);
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
    public Immunization_ProtocolAppliedBuilder.Impl withModifierExtension(
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
    public Immunization_ProtocolAppliedBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Immunization_ProtocolAppliedBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Immunization.ProtocolApplied build() {
      return new Immunization.ProtocolApplied(
          OptionConverters.toScala(id),
          OptionConverters.toScala(series),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(authority),
          targetDisease.stream().collect(new LitSeqJCollector<>()),
          (Choice) doseNumber,
          (Option) OptionConverters.toScala(seriesDoses),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
