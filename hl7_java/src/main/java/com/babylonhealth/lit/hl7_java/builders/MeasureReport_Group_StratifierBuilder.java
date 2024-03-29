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

public interface MeasureReport_Group_StratifierBuilder {
  public MeasureReport$Group$Stratifier build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements MeasureReport_Group_StratifierBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<CodeableConcept> code = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<MeasureReport$Group$Stratifier$Stratum> stratum = Collections.emptyList();

    /** Required fields for {@link MeasureReport$Group$Stratifier} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MeasureReport_Group_StratifierBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param code */
    public MeasureReport_Group_StratifierBuilder.Impl withCode(@NonNull CodeableConcept... code) {
      this.code = Arrays.asList(code);
      return this;
    }
    /** @param code */
    public MeasureReport_Group_StratifierBuilder.Impl withCode(
        @NonNull Collection<CodeableConcept> code) {
      this.code = Collections.unmodifiableCollection(code);
      return this;
    }

    public MeasureReport_Group_StratifierBuilder.Impl withCode(
        @NonNull CodeableConceptBuilder... code) {
      this.code = Arrays.stream(code).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public MeasureReport_Group_StratifierBuilder.Impl withExtension(
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
    public MeasureReport_Group_StratifierBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MeasureReport_Group_StratifierBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
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
    public MeasureReport_Group_StratifierBuilder.Impl withModifierExtension(
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
    public MeasureReport_Group_StratifierBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MeasureReport_Group_StratifierBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param stratum */
    public MeasureReport_Group_StratifierBuilder.Impl withStratum(
        @NonNull MeasureReport$Group$Stratifier$Stratum... stratum) {
      this.stratum = Arrays.asList(stratum);
      return this;
    }
    /** @param stratum */
    public MeasureReport_Group_StratifierBuilder.Impl withStratum(
        @NonNull Collection<MeasureReport$Group$Stratifier$Stratum> stratum) {
      this.stratum = Collections.unmodifiableCollection(stratum);
      return this;
    }

    public MeasureReport_Group_StratifierBuilder.Impl withStratum(
        @NonNull MeasureReport_Group_Stratifier_StratumBuilder... stratum) {
      this.stratum = Arrays.stream(stratum).map(e -> e.build()).collect(toList());
      return this;
    }

    public MeasureReport$Group$Stratifier build() {
      return new MeasureReport$Group$Stratifier(
          OptionConverters.toScala(id),
          code.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          stratum.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
