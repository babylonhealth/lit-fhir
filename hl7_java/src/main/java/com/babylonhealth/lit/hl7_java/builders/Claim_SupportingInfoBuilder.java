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

public interface Claim_SupportingInfoBuilder {
  public Claim.SupportingInfo build();

  public static Impl init(Integer sequence, CodeableConcept category) {
    return new Impl(sequence, category);
  }

  public static Impl builder(Integer sequence, CodeableConceptBuilder category) {
    return new Impl(sequence, category.build());
  }

  public static ChoiceSupportingInfo_Value value(Attachment a) {
    return new ChoiceSupportingInfo_Value(a);
  }

  public static ChoiceSupportingInfo_Value value(Boolean b) {
    return new ChoiceSupportingInfo_Value(b);
  }

  public static ChoiceSupportingInfo_Value value(Quantity q) {
    return new ChoiceSupportingInfo_Value(q);
  }

  public static ChoiceSupportingInfo_Value value(Reference r) {
    return new ChoiceSupportingInfo_Value(r);
  }

  public static ChoiceSupportingInfo_Value value(String s) {
    return new ChoiceSupportingInfo_Value(s);
  }

  public static ChoiceFHIRDateOrPeriod timing(FHIRDate f) {
    return new ChoiceFHIRDateOrPeriod(f);
  }

  public static ChoiceFHIRDateOrPeriod timing(Period p) {
    return new ChoiceFHIRDateOrPeriod(p);
  }

  public class Impl implements Claim_SupportingInfoBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> code = Optional.empty();
    private Optional<CodeableConcept> reason = Optional.empty();
    private Integer sequence;
    private CodeableConcept category;
    private Optional<ChoiceSupportingInfo_Value> value = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ChoiceFHIRDateOrPeriod> timing = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link Claim.SupportingInfo}
     *
     * @param sequence
     * @param category
     */
    public Impl(Integer sequence, CodeableConcept category) {
      this.sequence = sequence;
      this.category = category;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Claim_SupportingInfoBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param code */
    public Claim_SupportingInfoBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public Claim_SupportingInfoBuilder.Impl withCode(@NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /** @param reason */
    public Claim_SupportingInfoBuilder.Impl withReason(@NonNull CodeableConcept reason) {
      this.reason = Optional.of(reason);
      return this;
    }

    public Claim_SupportingInfoBuilder.Impl withReason(@NonNull CodeableConceptBuilder reason) {
      this.reason = Optional.of(reason.build());
      return this;
    }
    /**
     * @param value Field is a 'choice' field. Type should be one of Attachment, Boolean, Quantity,
     *     Reference, String. To pass the value in, wrap with one of the
     *     Claim_SupportingInfoBuilder.value static methods
     */
    public Claim_SupportingInfoBuilder.Impl withValue(@NonNull ChoiceSupportingInfo_Value value) {
      this.value = Optional.of(value);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Claim_SupportingInfoBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Claim_SupportingInfoBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Claim_SupportingInfoBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param timing Field is a 'choice' field. Type should be one of FHIRDate, Period. To pass the
     *     value in, wrap with one of the Claim_SupportingInfoBuilder.timing static methods
     */
    public Claim_SupportingInfoBuilder.Impl withTiming(@NonNull ChoiceFHIRDateOrPeriod timing) {
      this.timing = Optional.of(timing);
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
    public Claim_SupportingInfoBuilder.Impl withModifierExtension(
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
    public Claim_SupportingInfoBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Claim_SupportingInfoBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Claim.SupportingInfo build() {
      return new Claim.SupportingInfo(
          OptionConverters.toScala(id),
          OptionConverters.toScala(code),
          OptionConverters.toScala(reason),
          sequence,
          category,
          (Option) OptionConverters.toScala(value),
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(timing),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
