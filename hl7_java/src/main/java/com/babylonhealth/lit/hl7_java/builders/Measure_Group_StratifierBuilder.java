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

public interface Measure_Group_StratifierBuilder {
  public Measure$Group$Stratifier build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements Measure_Group_StratifierBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> code = Optional.empty();
    private Optional<Expression> criteria = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Measure$Group$Stratifier$Component> component = Collections.emptyList();

    /** Required fields for {@link Measure$Group$Stratifier} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Measure_Group_StratifierBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param code */
    public Measure_Group_StratifierBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public Measure_Group_StratifierBuilder.Impl withCode(@NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /** @param criteria */
    public Measure_Group_StratifierBuilder.Impl withCriteria(@NonNull Expression criteria) {
      this.criteria = Optional.of(criteria);
      return this;
    }

    public Measure_Group_StratifierBuilder.Impl withCriteria(@NonNull ExpressionBuilder criteria) {
      this.criteria = Optional.of(criteria.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Measure_Group_StratifierBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Measure_Group_StratifierBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Measure_Group_StratifierBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param description - A free text natural language description of the measure from a
     *     consumer's perspective.
     */
    public Measure_Group_StratifierBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
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
    public Measure_Group_StratifierBuilder.Impl withModifierExtension(
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
    public Measure_Group_StratifierBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Measure_Group_StratifierBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param component */
    public Measure_Group_StratifierBuilder.Impl withComponent(
        @NonNull Measure$Group$Stratifier$Component... component) {
      this.component = Arrays.asList(component);
      return this;
    }
    /** @param component */
    public Measure_Group_StratifierBuilder.Impl withComponent(
        @NonNull Collection<Measure$Group$Stratifier$Component> component) {
      this.component = Collections.unmodifiableCollection(component);
      return this;
    }

    public Measure_Group_StratifierBuilder.Impl withComponent(
        @NonNull Measure_Group_Stratifier_ComponentBuilder... component) {
      this.component = Arrays.stream(component).map(e -> e.build()).collect(toList());
      return this;
    }

    public Measure$Group$Stratifier build() {
      return new Measure$Group$Stratifier(
          OptionConverters.toScala(id),
          OptionConverters.toScala(code),
          OptionConverters.toScala(criteria),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          component.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
