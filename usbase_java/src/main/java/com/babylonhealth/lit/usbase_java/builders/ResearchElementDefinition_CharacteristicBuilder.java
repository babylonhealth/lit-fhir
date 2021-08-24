package com.babylonhealth.lit.usbase_java.builders;

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
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.hl7.GROUP_MEASURE;
import com.babylonhealth.lit.hl7.GROUP_MEASURE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface ResearchElementDefinition_CharacteristicBuilder {
  public ResearchElementDefinition.Characteristic build();

  public static Impl init(@NonNull Choice00836574492 definition) {
    return new Impl(definition);
  }

  public static Impl builder(@NonNull Choice00836574492 definition) {
    return new Impl(definition);
  }

  public static Choice00836574492 definition(String s) {
    return new Choice00836574492(s);
  }

  public static Choice00836574492 definition(CodeableConcept c) {
    return new Choice00836574492(c);
  }

  public static Choice00836574492 definition(DataRequirement d) {
    return new Choice00836574492(d);
  }

  public static Choice00836574492 definition(Expression e) {
    return new Choice00836574492(e);
  }

  public static Choice_1938137622 studyEffective(Duration d) {
    return new Choice_1938137622(d);
  }

  public static Choice_1938137622 studyEffective(FHIRDateTime f) {
    return new Choice_1938137622(f);
  }

  public static Choice_1938137622 studyEffective(Period p) {
    return new Choice_1938137622(p);
  }

  public static Choice_1938137622 studyEffective(Timing t) {
    return new Choice_1938137622(t);
  }

  public static Choice_1938137622 participantEffective(Duration d) {
    return new Choice_1938137622(d);
  }

  public static Choice_1938137622 participantEffective(FHIRDateTime f) {
    return new Choice_1938137622(f);
  }

  public static Choice_1938137622 participantEffective(Period p) {
    return new Choice_1938137622(p);
  }

  public static Choice_1938137622 participantEffective(Timing t) {
    return new Choice_1938137622(t);
  }

  public class Impl implements ResearchElementDefinition_CharacteristicBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Boolean> exclude = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<UsageContext> usageContext = Collections.emptyList();
    private Choice00836574492 definition;
    private Optional<CodeableConcept> unitOfMeasure = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Choice_1938137622> studyEffective = Optional.empty();
    private Optional<Choice_1938137622> participantEffective = Optional.empty();
    private Optional<String> studyEffectiveDescription = Optional.empty();
    private Optional<GROUP_MEASURE> studyEffectiveGroupMeasure = Optional.empty();
    private Optional<Duration> studyEffectiveTimeFromStart = Optional.empty();
    private Optional<String> participantEffectiveDescription = Optional.empty();
    private Optional<GROUP_MEASURE> participantEffectiveGroupMeasure = Optional.empty();
    private Optional<Duration> participantEffectiveTimeFromStart = Optional.empty();

    /**
     * Required fields for {@link ResearchElementDefinition.Characteristic}
     *
     * @param definition Field is a 'choice' field. Type should be one of String, CodeableConcept,
     *     DataRequirement, Expression. To pass the value in, wrap with one of the
     *     ResearchElementDefinition_CharacteristicBuilder.definition static methods
     */
    public Impl(@NonNull Choice00836574492 definition) {
      this.definition = definition;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ResearchElementDefinition_CharacteristicBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param exclude */
    public ResearchElementDefinition_CharacteristicBuilder.Impl withExclude(
        @NonNull Boolean exclude) {
      this.exclude = Optional.of(exclude);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ResearchElementDefinition_CharacteristicBuilder.Impl withExtension(
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
    public ResearchElementDefinition_CharacteristicBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ResearchElementDefinition_CharacteristicBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param usageContext */
    public ResearchElementDefinition_CharacteristicBuilder.Impl withUsageContext(
        @NonNull UsageContext... usageContext) {
      this.usageContext = Arrays.asList(usageContext);
      return this;
    }
    /** @param usageContext */
    public ResearchElementDefinition_CharacteristicBuilder.Impl withUsageContext(
        @NonNull Collection<UsageContext> usageContext) {
      this.usageContext = Collections.unmodifiableCollection(usageContext);
      return this;
    }

    public ResearchElementDefinition_CharacteristicBuilder.Impl withUsageContext(
        @NonNull UsageContextBuilder... usageContext) {
      this.usageContext = Arrays.stream(usageContext).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param unitOfMeasure */
    public ResearchElementDefinition_CharacteristicBuilder.Impl withUnitOfMeasure(
        @NonNull CodeableConcept unitOfMeasure) {
      this.unitOfMeasure = Optional.of(unitOfMeasure);
      return this;
    }

    public ResearchElementDefinition_CharacteristicBuilder.Impl withUnitOfMeasure(
        @NonNull CodeableConceptBuilder unitOfMeasure) {
      this.unitOfMeasure = Optional.of(unitOfMeasure.build());
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
    public ResearchElementDefinition_CharacteristicBuilder.Impl withModifierExtension(
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
    public ResearchElementDefinition_CharacteristicBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ResearchElementDefinition_CharacteristicBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param studyEffective Field is a 'choice' field. Type should be one of Duration,
     *     FHIRDateTime, Period, Timing. To pass the value in, wrap with one of the
     *     ResearchElementDefinition_CharacteristicBuilder.studyEffective static methods
     */
    public ResearchElementDefinition_CharacteristicBuilder.Impl withStudyEffective(
        @NonNull Choice_1938137622 studyEffective) {
      this.studyEffective = Optional.of(studyEffective);
      return this;
    }
    /**
     * @param participantEffective Field is a 'choice' field. Type should be one of Duration,
     *     FHIRDateTime, Period, Timing. To pass the value in, wrap with one of the
     *     ResearchElementDefinition_CharacteristicBuilder.participantEffective static methods
     */
    public ResearchElementDefinition_CharacteristicBuilder.Impl withParticipantEffective(
        @NonNull Choice_1938137622 participantEffective) {
      this.participantEffective = Optional.of(participantEffective);
      return this;
    }
    /** @param studyEffectiveDescription */
    public ResearchElementDefinition_CharacteristicBuilder.Impl withStudyEffectiveDescription(
        @NonNull String studyEffectiveDescription) {
      this.studyEffectiveDescription = Optional.of(studyEffectiveDescription);
      return this;
    }
    /** @param studyEffectiveGroupMeasure */
    public ResearchElementDefinition_CharacteristicBuilder.Impl withStudyEffectiveGroupMeasure(
        @NonNull GROUP_MEASURE studyEffectiveGroupMeasure) {
      this.studyEffectiveGroupMeasure = Optional.of(studyEffectiveGroupMeasure);
      return this;
    }
    /** @param studyEffectiveTimeFromStart */
    public ResearchElementDefinition_CharacteristicBuilder.Impl withStudyEffectiveTimeFromStart(
        @NonNull Duration studyEffectiveTimeFromStart) {
      this.studyEffectiveTimeFromStart = Optional.of(studyEffectiveTimeFromStart);
      return this;
    }

    public ResearchElementDefinition_CharacteristicBuilder.Impl withStudyEffectiveTimeFromStart(
        @NonNull DurationBuilder studyEffectiveTimeFromStart) {
      this.studyEffectiveTimeFromStart = Optional.of(studyEffectiveTimeFromStart.build());
      return this;
    }
    /** @param participantEffectiveDescription */
    public ResearchElementDefinition_CharacteristicBuilder.Impl withParticipantEffectiveDescription(
        @NonNull String participantEffectiveDescription) {
      this.participantEffectiveDescription = Optional.of(participantEffectiveDescription);
      return this;
    }
    /** @param participantEffectiveGroupMeasure */
    public ResearchElementDefinition_CharacteristicBuilder.Impl
        withParticipantEffectiveGroupMeasure(
            @NonNull GROUP_MEASURE participantEffectiveGroupMeasure) {
      this.participantEffectiveGroupMeasure = Optional.of(participantEffectiveGroupMeasure);
      return this;
    }
    /** @param participantEffectiveTimeFromStart */
    public ResearchElementDefinition_CharacteristicBuilder.Impl
        withParticipantEffectiveTimeFromStart(@NonNull Duration participantEffectiveTimeFromStart) {
      this.participantEffectiveTimeFromStart = Optional.of(participantEffectiveTimeFromStart);
      return this;
    }

    public ResearchElementDefinition_CharacteristicBuilder.Impl
        withParticipantEffectiveTimeFromStart(
            @NonNull DurationBuilder participantEffectiveTimeFromStart) {
      this.participantEffectiveTimeFromStart =
          Optional.of(participantEffectiveTimeFromStart.build());
      return this;
    }

    public ResearchElementDefinition.Characteristic build() {
      return new ResearchElementDefinition.Characteristic(
          OptionConverters.toScala(id),
          OptionConverters.toScala(exclude.map(x -> (Object) x)),
          extension.stream().collect(new LitSeqJCollector<>()),
          usageContext.stream().collect(new LitSeqJCollector<>()),
          definition,
          OptionConverters.toScala(unitOfMeasure),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(studyEffective),
          (Option) OptionConverters.toScala(participantEffective),
          OptionConverters.toScala(studyEffectiveDescription),
          OptionConverters.toScala(studyEffectiveGroupMeasure),
          OptionConverters.toScala(studyEffectiveTimeFromStart),
          OptionConverters.toScala(participantEffectiveDescription),
          OptionConverters.toScala(participantEffectiveGroupMeasure),
          OptionConverters.toScala(participantEffectiveTimeFromStart),
          LitUtils.emptyMetaElMap());
    }
  }
}
