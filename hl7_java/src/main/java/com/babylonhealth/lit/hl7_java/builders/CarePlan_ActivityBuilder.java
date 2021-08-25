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
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

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
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<CodeableReference> performedActivity = Collections.emptyList();
    private Optional<Reference> plannedActivityReference = Optional.empty();
    private Optional<CarePlan$Activity$PlannedActivityDetail> plannedActivityDetail =
        Optional.empty();

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
    /** @param performedActivity */
    public CarePlan_ActivityBuilder.Impl withPerformedActivity(
        @NonNull CodeableReference... performedActivity) {
      this.performedActivity = Arrays.asList(performedActivity);
      return this;
    }
    /** @param performedActivity */
    public CarePlan_ActivityBuilder.Impl withPerformedActivity(
        @NonNull Collection<CodeableReference> performedActivity) {
      this.performedActivity = Collections.unmodifiableCollection(performedActivity);
      return this;
    }

    public CarePlan_ActivityBuilder.Impl withPerformedActivity(
        @NonNull CodeableReferenceBuilder... performedActivity) {
      this.performedActivity =
          Arrays.stream(performedActivity).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param plannedActivityReference */
    public CarePlan_ActivityBuilder.Impl withPlannedActivityReference(
        @NonNull Reference plannedActivityReference) {
      this.plannedActivityReference = Optional.of(plannedActivityReference);
      return this;
    }

    public CarePlan_ActivityBuilder.Impl withPlannedActivityReference(
        @NonNull ReferenceBuilder plannedActivityReference) {
      this.plannedActivityReference = Optional.of(plannedActivityReference.build());
      return this;
    }
    /** @param plannedActivityDetail */
    public CarePlan_ActivityBuilder.Impl withPlannedActivityDetail(
        @NonNull CarePlan$Activity$PlannedActivityDetail plannedActivityDetail) {
      this.plannedActivityDetail = Optional.of(plannedActivityDetail);
      return this;
    }

    public CarePlan_ActivityBuilder.Impl withPlannedActivityDetail(
        @NonNull CarePlan_Activity_PlannedActivityDetailBuilder plannedActivityDetail) {
      this.plannedActivityDetail = Optional.of(plannedActivityDetail.build());
      return this;
    }

    public CarePlan.Activity build() {
      return new CarePlan.Activity(
          OptionConverters.toScala(id),
          progress.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          performedActivity.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(plannedActivityReference),
          OptionConverters.toScala(plannedActivityDetail),
          LitUtils.emptyMetaElMap());
    }
  }
}
