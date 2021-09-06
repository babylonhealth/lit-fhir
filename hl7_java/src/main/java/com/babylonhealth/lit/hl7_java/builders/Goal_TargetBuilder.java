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

public interface Goal_TargetBuilder {
  public Goal.Target build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceDurationOrFHIRDate due(Duration d) {
    return new ChoiceDurationOrFHIRDate(d);
  }

  public static ChoiceDurationOrFHIRDate due(FHIRDate f) {
    return new ChoiceDurationOrFHIRDate(f);
  }

  public static ChoiceTarget_Detail detail(Boolean b) {
    return new ChoiceTarget_Detail(b);
  }

  public static ChoiceTarget_Detail detail(CodeableConcept c) {
    return new ChoiceTarget_Detail(c);
  }

  public static ChoiceTarget_Detail detail(Integer i) {
    return new ChoiceTarget_Detail(i);
  }

  public static ChoiceTarget_Detail detail(Quantity q) {
    return new ChoiceTarget_Detail(q);
  }

  public static ChoiceTarget_Detail detail(Range r) {
    return new ChoiceTarget_Detail(r);
  }

  public static ChoiceTarget_Detail detail(Ratio r) {
    return new ChoiceTarget_Detail(r);
  }

  public static ChoiceTarget_Detail detail(String s) {
    return new ChoiceTarget_Detail(s);
  }

  public class Impl implements Goal_TargetBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<ChoiceDurationOrFHIRDate> due = Optional.empty();
    private Optional<CodeableConcept> measure = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ChoiceTarget_Detail> detail = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link Goal.Target} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Goal_TargetBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param due Field is a 'choice' field. Type should be one of Duration, FHIRDate. To pass the
     *     value in, wrap with one of the Goal_TargetBuilder.due static methods
     */
    public Goal_TargetBuilder.Impl withDue(@NonNull ChoiceDurationOrFHIRDate due) {
      this.due = Optional.of(due);
      return this;
    }
    /** @param measure */
    public Goal_TargetBuilder.Impl withMeasure(@NonNull CodeableConcept measure) {
      this.measure = Optional.of(measure);
      return this;
    }

    public Goal_TargetBuilder.Impl withMeasure(@NonNull CodeableConceptBuilder measure) {
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
    public Goal_TargetBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Goal_TargetBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Goal_TargetBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param detail Field is a 'choice' field. Type should be one of Boolean, CodeableConcept,
     *     Integer, Quantity, Range, Ratio, String. To pass the value in, wrap with one of the
     *     Goal_TargetBuilder.detail static methods
     */
    public Goal_TargetBuilder.Impl withDetail(@NonNull ChoiceTarget_Detail detail) {
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
    public Goal_TargetBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public Goal_TargetBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Goal_TargetBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Goal.Target build() {
      return new Goal.Target(
          OptionConverters.toScala(id),
          (Option) OptionConverters.toScala(due),
          OptionConverters.toScala(measure),
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(detail),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
