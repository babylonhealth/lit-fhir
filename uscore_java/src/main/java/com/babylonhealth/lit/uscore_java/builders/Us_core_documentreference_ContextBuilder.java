package com.babylonhealth.lit.uscore_java.builders;

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
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.uscore.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.uscore_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.uscore_java.model.Unions.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface Us_core_documentreference_ContextBuilder {
  public Us$core$documentreference$Context build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements Us_core_documentreference_ContextBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<CodeableConcept> event = Collections.emptyList();
    private Optional<Period> period = Optional.empty();
    private Collection<Reference> related = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Optional<CodeableConcept> facilityType = Optional.empty();
    private Optional<CodeableConcept> practiceSetting = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Reference> sourcePatientInfo = Optional.empty();

    /** Required fields for {@link Us$core$documentreference$Context} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Us_core_documentreference_ContextBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param event - This list of codes represents the main clinical acts, such as a colonoscopy or
     *     an appendectomy, being documented. In some cases, the event is inherent in the type Code,
     *     such as a "History and Physical Report" in which the procedure being documented is
     *     necessarily a "History and Physical" act.
     */
    public Us_core_documentreference_ContextBuilder.Impl withEvent(
        @NonNull CodeableConcept... event) {
      this.event = Arrays.asList(event);
      return this;
    }
    /**
     * @param event - This list of codes represents the main clinical acts, such as a colonoscopy or
     *     an appendectomy, being documented. In some cases, the event is inherent in the type Code,
     *     such as a "History and Physical Report" in which the procedure being documented is
     *     necessarily a "History and Physical" act.
     */
    public Us_core_documentreference_ContextBuilder.Impl withEvent(
        @NonNull Collection<CodeableConcept> event) {
      this.event = Collections.unmodifiableCollection(event);
      return this;
    }

    public Us_core_documentreference_ContextBuilder.Impl withEvent(
        @NonNull CodeableConceptBuilder... event) {
      this.event = Arrays.stream(event).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param period - The time period over which the service that is described by the document was
     *     provided.
     */
    public Us_core_documentreference_ContextBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public Us_core_documentreference_ContextBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /** @param related - Related identifiers or resources associated with the DocumentReference. */
    public Us_core_documentreference_ContextBuilder.Impl withRelated(
        @NonNull Reference... related) {
      this.related = Arrays.asList(related);
      return this;
    }
    /** @param related - Related identifiers or resources associated with the DocumentReference. */
    public Us_core_documentreference_ContextBuilder.Impl withRelated(
        @NonNull Collection<Reference> related) {
      this.related = Collections.unmodifiableCollection(related);
      return this;
    }

    public Us_core_documentreference_ContextBuilder.Impl withRelated(
        @NonNull ReferenceBuilder... related) {
      this.related = Arrays.stream(related).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Us_core_documentreference_ContextBuilder.Impl withExtension(
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
    public Us_core_documentreference_ContextBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Us_core_documentreference_ContextBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param encounter - Describes the clinical encounter or type of care that the document content
     *     is associated with.
     */
    public Us_core_documentreference_ContextBuilder.Impl withEncounter(
        @NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public Us_core_documentreference_ContextBuilder.Impl withEncounter(
        @NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /** @param facilityType - The kind of facility where the patient was seen. */
    public Us_core_documentreference_ContextBuilder.Impl withFacilityType(
        @NonNull CodeableConcept facilityType) {
      this.facilityType = Optional.of(facilityType);
      return this;
    }

    public Us_core_documentreference_ContextBuilder.Impl withFacilityType(
        @NonNull CodeableConceptBuilder facilityType) {
      this.facilityType = Optional.of(facilityType.build());
      return this;
    }
    /**
     * @param practiceSetting - This property may convey specifics about the practice setting where
     *     the content was created, often reflecting the clinical specialty.
     */
    public Us_core_documentreference_ContextBuilder.Impl withPracticeSetting(
        @NonNull CodeableConcept practiceSetting) {
      this.practiceSetting = Optional.of(practiceSetting);
      return this;
    }

    public Us_core_documentreference_ContextBuilder.Impl withPracticeSetting(
        @NonNull CodeableConceptBuilder practiceSetting) {
      this.practiceSetting = Optional.of(practiceSetting.build());
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
    public Us_core_documentreference_ContextBuilder.Impl withModifierExtension(
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
    public Us_core_documentreference_ContextBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Us_core_documentreference_ContextBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param sourcePatientInfo - The Patient Information as known when the document was published.
     *     May be a reference to a version specific, or contained.
     */
    public Us_core_documentreference_ContextBuilder.Impl withSourcePatientInfo(
        @NonNull Reference sourcePatientInfo) {
      this.sourcePatientInfo = Optional.of(sourcePatientInfo);
      return this;
    }

    public Us_core_documentreference_ContextBuilder.Impl withSourcePatientInfo(
        @NonNull ReferenceBuilder sourcePatientInfo) {
      this.sourcePatientInfo = Optional.of(sourcePatientInfo.build());
      return this;
    }

    public Us$core$documentreference$Context build() {
      return new Us$core$documentreference$Context(
          OptionConverters.toScala(id),
          event.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(period),
          related.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          OptionConverters.toScala(facilityType),
          OptionConverters.toScala(practiceSetting),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(sourcePatientInfo),
          LitUtils.emptyMetaElMap());
    }
  }
}
