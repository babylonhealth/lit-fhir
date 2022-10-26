package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDate;
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

public interface ExplanationOfBenefit_SupportingInfoBuilder {
  public ExplanationOfBenefit.SupportingInfo build();

  public static Impl init(Integer sequence, CodeableConcept category) {
    return new Impl(sequence, category);
  }

  public static Impl builder(Integer sequence, CodeableConceptBuilder category) {
    return new Impl(sequence, category.build());
  }

  public static Choice_2028408917 value(Attachment a) {
    return new Choice_2028408917(a);
  }

  public static Choice_2028408917 value(Boolean b) {
    return new Choice_2028408917(b);
  }

  public static Choice_2028408917 value(Quantity q) {
    return new Choice_2028408917(q);
  }

  public static Choice_2028408917 value(Reference r) {
    return new Choice_2028408917(r);
  }

  public static Choice_2028408917 value(String s) {
    return new Choice_2028408917(s);
  }

  public static ChoiceDateOrPeriod timing(FHIRDate f) {
    return new ChoiceDateOrPeriod(f);
  }

  public static ChoiceDateOrPeriod timing(Period p) {
    return new ChoiceDateOrPeriod(p);
  }

  public class Impl implements ExplanationOfBenefit_SupportingInfoBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> code = Optional.empty();
    private Optional<Coding> reason = Optional.empty();
    private Integer sequence;
    private CodeableConcept category;
    private Optional<Choice_2028408917> value = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ChoiceDateOrPeriod> timing = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link ExplanationOfBenefit.SupportingInfo}
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
    public ExplanationOfBenefit_SupportingInfoBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param code */
    public ExplanationOfBenefit_SupportingInfoBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public ExplanationOfBenefit_SupportingInfoBuilder.Impl withCode(
        @NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /** @param reason */
    public ExplanationOfBenefit_SupportingInfoBuilder.Impl withReason(@NonNull Coding reason) {
      this.reason = Optional.of(reason);
      return this;
    }

    public ExplanationOfBenefit_SupportingInfoBuilder.Impl withReason(
        @NonNull CodingBuilder reason) {
      this.reason = Optional.of(reason.build());
      return this;
    }
    /**
     * @param value Field is a 'choice' field. Type should be one of Attachment, Boolean, Quantity,
     *     Reference, String. To pass the value in, wrap with one of the
     *     ExplanationOfBenefit_SupportingInfoBuilder.value static methods
     */
    public ExplanationOfBenefit_SupportingInfoBuilder.Impl withValue(
        @NonNull Choice_2028408917 value) {
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
    public ExplanationOfBenefit_SupportingInfoBuilder.Impl withExtension(
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
    public ExplanationOfBenefit_SupportingInfoBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ExplanationOfBenefit_SupportingInfoBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param timing Field is a 'choice' field. Type should be one of FHIRDate, Period. To pass the
     *     value in, wrap with one of the ExplanationOfBenefit_SupportingInfoBuilder.timing static
     *     methods
     */
    public ExplanationOfBenefit_SupportingInfoBuilder.Impl withTiming(
        @NonNull ChoiceDateOrPeriod timing) {
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
    public ExplanationOfBenefit_SupportingInfoBuilder.Impl withModifierExtension(
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
    public ExplanationOfBenefit_SupportingInfoBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ExplanationOfBenefit_SupportingInfoBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public ExplanationOfBenefit.SupportingInfo build() {
      return new ExplanationOfBenefit.SupportingInfo(
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
