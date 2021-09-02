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
import com.babylonhealth.lit.hl7.PROPERTY_REPRESENTATION;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class Elementdefinition_deBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Integer> min = Optional.empty();
  private Optional<String> max = Optional.empty();
  private String path;
  private Collection<Coding> code = Collections.emptyList();
  private Optional<String> label = Optional.empty();
  private Collection<String> alias = Collections.emptyList();
  private Optional<String> comment = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> sliceName = Optional.empty();
  private Optional<Integer> maxLength = Optional.empty();
  private Collection<String> condition = Collections.emptyList();
  private Optional<String> definition = Optional.empty();
  private Optional<Choice_0637176084> minValue = Optional.empty();
  private Optional<Choice_0637176084> maxValue = Optional.empty();
  private Optional<Boolean> mustSupport = Optional.empty();
  private Optional<String> requirements = Optional.empty();
  private Optional<String> orderMeaning = Optional.empty();
  private Optional<ElementDefinition.Base> base = Optional.empty();
  private Optional<Choice_1349125893> defaultValue = Optional.empty();
  private Optional<String> isModifierReason = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<ElementDefinition.Example> example = Collections.emptyList();
  private Collection<ElementDefinition.Mapping> mapping = Collections.emptyList();
  private Collection<ElementDefinition.Type> _type = Collections.emptyList();
  private Optional<String> meaningWhenMissing = Optional.empty();
  private Optional<Boolean> sliceIsConstraining = Optional.empty();
  private Optional<ElementDefinition.Binding> binding = Optional.empty();
  private Collection<ElementDefinition.Constraint> constraint = Collections.emptyList();

  /**
   * Required fields for {@link Elementdefinition_de}
   *
   * @param path - The path identifies the element and is expressed as a "."-separated list of
   *     ancestor elements, beginning with the name of the resource or extension.
   */
  public Elementdefinition_deBuilder(String path) {
    this.path = path;
  }

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public Elementdefinition_deBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param min - The minimum number of times this element SHALL appear in the instance. */
  public Elementdefinition_deBuilder withMin(@NonNull Integer min) {
    this.min = Optional.of(min);
    return this;
  }
  /**
   * @param max - The maximum number of times this element is permitted to appear in the instance.
   */
  public Elementdefinition_deBuilder withMax(@NonNull String max) {
    this.max = Optional.of(max);
    return this;
  }
  /** @param code - A code that has the same meaning as the element in a particular terminology. */
  public Elementdefinition_deBuilder withCode(@NonNull Coding... code) {
    this.code = Arrays.asList(code);
    return this;
  }
  /** @param code - A code that has the same meaning as the element in a particular terminology. */
  public Elementdefinition_deBuilder withCode(@NonNull Collection<Coding> code) {
    this.code = Collections.unmodifiableCollection(code);
    return this;
  }
  /**
   * @param label - A single preferred label which is the text to display beside the element
   *     indicating its meaning or to use to prompt for the element in a user display or form.
   */
  public Elementdefinition_deBuilder withLabel(@NonNull String label) {
    this.label = Optional.of(label);
    return this;
  }
  /** @param alias - Identifies additional names by which this element might also be known. */
  public Elementdefinition_deBuilder withAlias(@NonNull String... alias) {
    this.alias = Arrays.asList(alias);
    return this;
  }
  /** @param alias - Identifies additional names by which this element might also be known. */
  public Elementdefinition_deBuilder withAlias(@NonNull Collection<String> alias) {
    this.alias = Collections.unmodifiableCollection(alias);
    return this;
  }
  /**
   * @param comment - Explanatory notes and implementation guidance about the data element,
   *     including notes about how to use the data properly, exceptions to proper use, etc. (Note:
   *     The text you are reading is specified in ElementDefinition.comment).
   */
  public Elementdefinition_deBuilder withComment(@NonNull String comment) {
    this.comment = Optional.of(comment);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Elementdefinition_deBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Elementdefinition_deBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param sliceName - The name of this element definition slice, when slicing is working. The name
   *     must be a token with no dots or spaces. This is a unique name referring to a specific set
   *     of constraints applied to this element, used to provide a name to different slices of the
   *     same element.
   */
  public Elementdefinition_deBuilder withSliceName(@NonNull String sliceName) {
    this.sliceName = Optional.of(sliceName);
    return this;
  }
  /**
   * @param maxLength - Indicates the maximum length in characters that is permitted to be present
   *     in conformant instances and which is expected to be supported by conformant consumers that
   *     support the element.
   */
  public Elementdefinition_deBuilder withMaxLength(@NonNull Integer maxLength) {
    this.maxLength = Optional.of(maxLength);
    return this;
  }
  /**
   * @param condition - A reference to an invariant that may make additional statements about the
   *     cardinality or value in the instance.
   */
  public Elementdefinition_deBuilder withCondition(@NonNull String... condition) {
    this.condition = Arrays.asList(condition);
    return this;
  }
  /**
   * @param condition - A reference to an invariant that may make additional statements about the
   *     cardinality or value in the instance.
   */
  public Elementdefinition_deBuilder withCondition(@NonNull Collection<String> condition) {
    this.condition = Collections.unmodifiableCollection(condition);
    return this;
  }
  /**
   * @param definition - Provides a complete explanation of the meaning of the data element for
   *     human readability. For the case of elements derived from existing elements (e.g.
   *     constraints), the definition SHALL be consistent with the base definition, but convey the
   *     meaning of the element in the particular context of use of the resource. (Note: The text
   *     you are reading is specified in ElementDefinition.definition).
   */
  public Elementdefinition_deBuilder withDefinition(@NonNull String definition) {
    this.definition = Optional.of(definition);
    return this;
  }
  /**
   * @param minValue - The minimum allowed value for the element. The value is inclusive. This is
   *     allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. Field
   *     is a 'choice' field. Type should be one of BigDecimal, FHIRDate, FHIRDateTime, Integer,
   *     LocalTime, Quantity, ZonedDateTime.
   */
  public Elementdefinition_deBuilder withMinValue(@NonNull Choice_0637176084 minValue) {
    this.minValue = Optional.of(minValue);
    return this;
  }
  /**
   * @param maxValue - The maximum allowed value for the element. The value is inclusive. This is
   *     allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. Field
   *     is a 'choice' field. Type should be one of BigDecimal, FHIRDate, FHIRDateTime, Integer,
   *     LocalTime, Quantity, ZonedDateTime.
   */
  public Elementdefinition_deBuilder withMaxValue(@NonNull Choice_0637176084 maxValue) {
    this.maxValue = Optional.of(maxValue);
    return this;
  }
  /**
   * @param mustSupport - If true, implementations that produce or consume resources SHALL provide
   *     "support" for the element in some meaningful way. If false, the element may be ignored and
   *     not supported. If false, whether to populate or use the data element in any way is at the
   *     discretion of the implementation.
   */
  public Elementdefinition_deBuilder withMustSupport(@NonNull Boolean mustSupport) {
    this.mustSupport = Optional.of(mustSupport);
    return this;
  }
  /**
   * @param requirements - This element is for traceability of why the element was created and why
   *     the constraints exist as they do. This may be used to point to source materials or
   *     specifications that drove the structure of this element.
   */
  public Elementdefinition_deBuilder withRequirements(@NonNull String requirements) {
    this.requirements = Optional.of(requirements);
    return this;
  }
  /**
   * @param orderMeaning - If present, indicates that the order of the repeating element has meaning
   *     and describes what that meaning is. If absent, it means that the order of the element has
   *     no meaning.
   */
  public Elementdefinition_deBuilder withOrderMeaning(@NonNull String orderMeaning) {
    this.orderMeaning = Optional.of(orderMeaning);
    return this;
  }
  /**
   * @param base - Information about the base definition of the element, provided to make it
   *     unnecessary for tools to trace the deviation of the element through the derived and related
   *     profiles. When the element definition is not the original definition of an element - i.g.
   *     either in a constraint on another type, or for elements from a super type in a snap shot -
   *     then the information in provided in the element definition may be different to the base
   *     definition. On the original definition of the element, it will be same.
   */
  public Elementdefinition_deBuilder withBase(@NonNull ElementDefinition.Base base) {
    this.base = Optional.of(base);
    return this;
  }
  /**
   * @param defaultValue - The value that should be used if there is no value stated in the instance
   *     (e.g. 'if not otherwise specified, the abstract is false'). Field is a 'choice' field. Type
   *     should be one of Address, Age, Annotation, Attachment, byte[], BigDecimal, Boolean, String,
   *     CodeableConcept, Coding, ContactDetail, ContactPoint, Contributor, Count, DataRequirement,
   *     Distance, Dosage, Duration, Expression, FHIRDate, FHIRDateTime, HumanName, Identifier,
   *     Integer, LocalTime, Meta, Money, ParameterDefinition, Period, Quantity, Range, Ratio,
   *     Reference, RelatedArtifact, SampledData, Signature, Timing, TriggerDefinition, UUID,
   *     UsageContext, ZonedDateTime.
   */
  public Elementdefinition_deBuilder withDefaultValue(@NonNull Choice_1349125893 defaultValue) {
    this.defaultValue = Optional.of(defaultValue);
    return this;
  }
  /**
   * @param isModifierReason - Explains how that element affects the interpretation of the resource
   *     or element that contains it.
   */
  public Elementdefinition_deBuilder withIsModifierReason(@NonNull String isModifierReason) {
    this.isModifierReason = Optional.of(isModifierReason);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the element and that modifies the understanding of the element in
   *     which it is contained and/or the understanding of the containing element's descendants.
   *     Usually modifier elements provide negation or qualification. To make the use of extensions
   *     safe and manageable, there is a strict set of governance applied to the definition and use
   *     of extensions. Though any implementer can define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public Elementdefinition_deBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the element and that modifies the understanding of the element in
   *     which it is contained and/or the understanding of the containing element's descendants.
   *     Usually modifier elements provide negation or qualification. To make the use of extensions
   *     safe and manageable, there is a strict set of governance applied to the definition and use
   *     of extensions. Though any implementer can define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public Elementdefinition_deBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param example - A sample value for this element demonstrating the type of information that
   *     would typically be found in the element.
   */
  public Elementdefinition_deBuilder withExample(@NonNull ElementDefinition.Example... example) {
    this.example = Arrays.asList(example);
    return this;
  }
  /**
   * @param example - A sample value for this element demonstrating the type of information that
   *     would typically be found in the element.
   */
  public Elementdefinition_deBuilder withExample(
      @NonNull Collection<ElementDefinition.Example> example) {
    this.example = Collections.unmodifiableCollection(example);
    return this;
  }
  /**
   * @param mapping - Identifies a concept from an external specification that roughly corresponds
   *     to this element.
   */
  public Elementdefinition_deBuilder withMapping(@NonNull ElementDefinition.Mapping... mapping) {
    this.mapping = Arrays.asList(mapping);
    return this;
  }
  /**
   * @param mapping - Identifies a concept from an external specification that roughly corresponds
   *     to this element.
   */
  public Elementdefinition_deBuilder withMapping(
      @NonNull Collection<ElementDefinition.Mapping> mapping) {
    this.mapping = Collections.unmodifiableCollection(mapping);
    return this;
  }
  /** @param _type - The data type or resource that the value of this element is permitted to be. */
  public Elementdefinition_deBuilder withType(@NonNull ElementDefinition.Type... _type) {
    this._type = Arrays.asList(_type);
    return this;
  }
  /** @param _type - The data type or resource that the value of this element is permitted to be. */
  public Elementdefinition_deBuilder withType(@NonNull Collection<ElementDefinition.Type> _type) {
    this._type = Collections.unmodifiableCollection(_type);
    return this;
  }
  /**
   * @param meaningWhenMissing - The Implicit meaning that is to be understood when this element is
   *     missing (e.g. 'when this element is missing, the period is ongoing').
   */
  public Elementdefinition_deBuilder withMeaningWhenMissing(@NonNull String meaningWhenMissing) {
    this.meaningWhenMissing = Optional.of(meaningWhenMissing);
    return this;
  }
  /**
   * @param sliceIsConstraining - If true, indicates that this slice definition is constraining a
   *     slice definition with the same name in an inherited profile. If false, the slice is not
   *     overriding any slice in an inherited profile. If missing, the slice might or might not be
   *     overriding a slice in an inherited profile, depending on the sliceName.
   */
  public Elementdefinition_deBuilder withSliceIsConstraining(@NonNull Boolean sliceIsConstraining) {
    this.sliceIsConstraining = Optional.of(sliceIsConstraining);
    return this;
  }
  /**
   * @param binding - Binds to a value set if this element is coded (code, Coding, CodeableConcept,
   *     Quantity), or the data types (string, uri).
   */
  public Elementdefinition_deBuilder withBinding(@NonNull ElementDefinition.Binding binding) {
    this.binding = Optional.of(binding);
    return this;
  }
  /**
   * @param constraint - Formal constraints such as co-occurrence and other constraints that can be
   *     computationally evaluated within the context of the instance.
   */
  public Elementdefinition_deBuilder withConstraint(
      @NonNull ElementDefinition.Constraint... constraint) {
    this.constraint = Arrays.asList(constraint);
    return this;
  }
  /**
   * @param constraint - Formal constraints such as co-occurrence and other constraints that can be
   *     computationally evaluated within the context of the instance.
   */
  public Elementdefinition_deBuilder withConstraint(
      @NonNull Collection<ElementDefinition.Constraint> constraint) {
    this.constraint = Collections.unmodifiableCollection(constraint);
    return this;
  }

  public Elementdefinition_de build() {
    return new Elementdefinition_de(
        OptionConverters.toScala(id),
        OptionConverters.toScala(min.map(x -> (Object) x)),
        OptionConverters.toScala(max),
        path,
        code.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(label),
        alias.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(comment),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(sliceName),
        OptionConverters.toScala(maxLength.map(x -> (Object) x)),
        condition.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(definition),
        (Option) OptionConverters.toScala(minValue),
        (Option) OptionConverters.toScala(maxValue),
        OptionConverters.toScala(mustSupport.map(x -> (Object) x)),
        OptionConverters.toScala(requirements),
        OptionConverters.toScala(orderMeaning),
        OptionConverters.toScala(base),
        (Option) OptionConverters.toScala(defaultValue),
        OptionConverters.toScala(isModifierReason),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        example.stream().collect(new LitSeqJCollector<>()),
        mapping.stream().collect(new LitSeqJCollector<>()),
        _type.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(meaningWhenMissing),
        OptionConverters.toScala(sliceIsConstraining.map(x -> (Object) x)),
        OptionConverters.toScala(binding),
        constraint.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
