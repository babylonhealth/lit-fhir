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

public interface CarePlan_ActivityBuilder {
  public CarePlan.Activity build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements CarePlan_ActivityBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Annotation> progress = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> reference = Optional.empty();
    private Collection<Reference> outcomeReference = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<CodeableConcept> outcomeCodeableConcept = Collections.emptyList();
    private Optional<CarePlan$Activity$Detail> detail = Optional.empty();

    /** Required fields for {@link CarePlan.Activity} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public CarePlan_ActivityBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param progress */
    public CarePlan_ActivityBuilder.Impl withProgress(@NonNull Annotation... progress) {
      this.progress = Arrays.asList(progress);
      return this;
    }
    /** @param progress */
    public CarePlan_ActivityBuilder.Impl withProgress(@NonNull Collection<Annotation> progress) {
      this.progress = Collections.unmodifiableCollection(progress);
      return this;
    }

    public CarePlan_ActivityBuilder.Impl withProgress(@NonNull AnnotationBuilder... progress) {
      this.progress = Arrays.stream(progress).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public CarePlan_ActivityBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public CarePlan_ActivityBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public CarePlan_ActivityBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param reference */
    public CarePlan_ActivityBuilder.Impl withReference(@NonNull Reference reference) {
      this.reference = Optional.of(reference);
      return this;
    }

    public CarePlan_ActivityBuilder.Impl withReference(@NonNull ReferenceBuilder reference) {
      this.reference = Optional.of(reference.build());
      return this;
    }
    /** @param outcomeReference */
    public CarePlan_ActivityBuilder.Impl withOutcomeReference(
        @NonNull Reference... outcomeReference) {
      this.outcomeReference = Arrays.asList(outcomeReference);
      return this;
    }
    /** @param outcomeReference */
    public CarePlan_ActivityBuilder.Impl withOutcomeReference(
        @NonNull Collection<Reference> outcomeReference) {
      this.outcomeReference = Collections.unmodifiableCollection(outcomeReference);
      return this;
    }

    public CarePlan_ActivityBuilder.Impl withOutcomeReference(
        @NonNull ReferenceBuilder... outcomeReference) {
      this.outcomeReference = Arrays.stream(outcomeReference).map(e -> e.build()).collect(toList());
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
    public CarePlan_ActivityBuilder.Impl withModifierExtension(
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
    public CarePlan_ActivityBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public CarePlan_ActivityBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param outcomeCodeableConcept */
    public CarePlan_ActivityBuilder.Impl withOutcomeCodeableConcept(
        @NonNull CodeableConcept... outcomeCodeableConcept) {
      this.outcomeCodeableConcept = Arrays.asList(outcomeCodeableConcept);
      return this;
    }
    /** @param outcomeCodeableConcept */
    public CarePlan_ActivityBuilder.Impl withOutcomeCodeableConcept(
        @NonNull Collection<CodeableConcept> outcomeCodeableConcept) {
      this.outcomeCodeableConcept = Collections.unmodifiableCollection(outcomeCodeableConcept);
      return this;
    }

    public CarePlan_ActivityBuilder.Impl withOutcomeCodeableConcept(
        @NonNull CodeableConceptBuilder... outcomeCodeableConcept) {
      this.outcomeCodeableConcept =
          Arrays.stream(outcomeCodeableConcept).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param detail */
    public CarePlan_ActivityBuilder.Impl withDetail(@NonNull CarePlan$Activity$Detail detail) {
      this.detail = Optional.of(detail);
      return this;
    }

    public CarePlan_ActivityBuilder.Impl withDetail(
        @NonNull CarePlan_Activity_DetailBuilder detail) {
      this.detail = Optional.of(detail.build());
      return this;
    }

    public CarePlan.Activity build() {
      return new CarePlan.Activity(
          OptionConverters.toScala(id),
          progress.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(reference),
          outcomeReference.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          outcomeCodeableConcept.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(detail),
          LitUtils.emptyMetaElMap());
    }
  }
}
