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
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface PlanDefinition_Goal_TargetBuilder {
  public PlanDefinition$Goal$Target build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceCodeableConceptOrQuantityOrRange detail(CodeableConcept c) {
    return new ChoiceCodeableConceptOrQuantityOrRange(c);
  }

  public static ChoiceCodeableConceptOrQuantityOrRange detail(Quantity q) {
    return new ChoiceCodeableConceptOrQuantityOrRange(q);
  }

  public static ChoiceCodeableConceptOrQuantityOrRange detail(Range r) {
    return new ChoiceCodeableConceptOrQuantityOrRange(r);
  }

  public class Impl implements PlanDefinition_Goal_TargetBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Duration> due = Optional.empty();
    private Optional<CodeableConcept> measure = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ChoiceCodeableConceptOrQuantityOrRange> detail = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link PlanDefinition$Goal$Target} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public PlanDefinition_Goal_TargetBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param due */
    public PlanDefinition_Goal_TargetBuilder.Impl withDue(@NonNull Duration due) {
      this.due = Optional.of(due);
      return this;
    }

    public PlanDefinition_Goal_TargetBuilder.Impl withDue(@NonNull DurationBuilder due) {
      this.due = Optional.of(due.build());
      return this;
    }
    /** @param measure */
    public PlanDefinition_Goal_TargetBuilder.Impl withMeasure(@NonNull CodeableConcept measure) {
      this.measure = Optional.of(measure);
      return this;
    }

    public PlanDefinition_Goal_TargetBuilder.Impl withMeasure(
        @NonNull CodeableConceptBuilder measure) {
      this.measure = Optional.of(measure.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public PlanDefinition_Goal_TargetBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public PlanDefinition_Goal_TargetBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public PlanDefinition_Goal_TargetBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param detail Field is a 'choice' field. Type should be one of CodeableConcept, Quantity,
     *     Range. To pass the value in, wrap with one of the
     *     PlanDefinition_Goal_TargetBuilder.detail static methods
     */
    public PlanDefinition_Goal_TargetBuilder.Impl withDetail(
        @NonNull ChoiceCodeableConceptOrQuantityOrRange detail) {
      this.detail = Optional.of(detail);
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
    public PlanDefinition_Goal_TargetBuilder.Impl withModifierExtension(
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
    public PlanDefinition_Goal_TargetBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public PlanDefinition_Goal_TargetBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public PlanDefinition$Goal$Target build() {
      return new PlanDefinition$Goal$Target(
          OptionConverters.toScala(id),
          OptionConverters.toScala(due),
          OptionConverters.toScala(measure),
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(detail),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
