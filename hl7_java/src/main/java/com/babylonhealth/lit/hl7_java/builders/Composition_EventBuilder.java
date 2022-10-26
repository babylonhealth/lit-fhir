package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

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

public interface Composition_EventBuilder {
  public Composition.Event build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements Composition_EventBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<CodeableConcept> code = Collections.emptyList();
    private Optional<Period> period = Optional.empty();
    private Collection<Reference> detail = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link Composition.Event} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Composition_EventBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param code */
    public Composition_EventBuilder.Impl withCode(@NonNull CodeableConcept... code) {
      this.code = Arrays.asList(code);
      return this;
    }
    /** @param code */
    public Composition_EventBuilder.Impl withCode(@NonNull Collection<CodeableConcept> code) {
      this.code = Collections.unmodifiableCollection(code);
      return this;
    }

    public Composition_EventBuilder.Impl withCode(@NonNull CodeableConceptBuilder... code) {
      this.code = Arrays.stream(code).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param period */
    public Composition_EventBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public Composition_EventBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /** @param detail */
    public Composition_EventBuilder.Impl withDetail(@NonNull Reference... detail) {
      this.detail = Arrays.asList(detail);
      return this;
    }
    /** @param detail */
    public Composition_EventBuilder.Impl withDetail(@NonNull Collection<Reference> detail) {
      this.detail = Collections.unmodifiableCollection(detail);
      return this;
    }

    public Composition_EventBuilder.Impl withDetail(@NonNull ReferenceBuilder... detail) {
      this.detail = Arrays.stream(detail).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Composition_EventBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Composition_EventBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Composition_EventBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
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
    public Composition_EventBuilder.Impl withModifierExtension(
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
    public Composition_EventBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Composition_EventBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Composition.Event build() {
      return new Composition.Event(
          OptionConverters.toScala(id),
          code.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(period),
          detail.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
