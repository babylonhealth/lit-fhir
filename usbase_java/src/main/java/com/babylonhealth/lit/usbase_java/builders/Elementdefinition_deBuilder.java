package com.babylonhealth.lit.usbase_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDate;
import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.UUID;
import lombok.NonNull;
import scala.Option;
import scala.jdk.javaapi.OptionConverters;
import scala.math.BigDecimal;

public interface Elementdefinition_deBuilder extends ElementDefinitionBuilder {
  public Elementdefinition_de build();

  public static Impl init(String path) {
    return new Impl(path);
  }

  public static Impl builder(String path) {
    return new Impl(path);
  }

  public static ChoiceAll fixed(Address a) {
    return new ChoiceAll(a);
  }

  public static ChoiceAll fixed(Age a) {
    return new ChoiceAll(a);
  }

  public static ChoiceAll fixed(Annotation a) {
    return new ChoiceAll(a);
  }

  public static ChoiceAll fixed(Attachment a) {
    return new ChoiceAll(a);
  }

  public static ChoiceAll fixed(byte[] b) {
    return new ChoiceAll(b);
  }

  public static ChoiceAll fixed(BigDecimal b) {
    return new ChoiceAll(b);
  }

  public static ChoiceAll fixed(Boolean b) {
    return new ChoiceAll(b);
  }

  public static ChoiceAll fixed(CodeableConcept c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll fixed(Coding c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll fixed(ContactDetail c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll fixed(ContactPoint c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll fixed(Contributor c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll fixed(Count c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll fixed(DataRequirement d) {
    return new ChoiceAll(d);
  }

  public static ChoiceAll fixed(Distance d) {
    return new ChoiceAll(d);
  }

  public static ChoiceAll fixed(Dosage d) {
    return new ChoiceAll(d);
  }

  public static ChoiceAll fixed(Duration d) {
    return new ChoiceAll(d);
  }

  public static ChoiceAll fixed(Expression e) {
    return new ChoiceAll(e);
  }

  public static ChoiceAll fixed(FHIRDate f) {
    return new ChoiceAll(f);
  }

  public static ChoiceAll fixed(FHIRDateTime f) {
    return new ChoiceAll(f);
  }

  public static ChoiceAll fixed(HumanName h) {
    return new ChoiceAll(h);
  }

  public static ChoiceAll fixed(Identifier i) {
    return new ChoiceAll(i);
  }

  public static ChoiceAll fixed(LocalTime l) {
    return new ChoiceAll(l);
  }

  public static ChoiceAll fixed(Meta m) {
    return new ChoiceAll(m);
  }

  public static ChoiceAll fixed(Money m) {
    return new ChoiceAll(m);
  }

  public static ChoiceAll fixed(ParameterDefinition p) {
    return new ChoiceAll(p);
  }

  public static ChoiceAll fixed(Period p) {
    return new ChoiceAll(p);
  }

  public static ChoiceAll fixed(Quantity q) {
    return new ChoiceAll(q);
  }

  public static ChoiceAll fixed(Range r) {
    return new ChoiceAll(r);
  }

  public static ChoiceAll fixed(Ratio r) {
    return new ChoiceAll(r);
  }

  public static ChoiceAll fixed(Reference r) {
    return new ChoiceAll(r);
  }

  public static ChoiceAll fixed(RelatedArtifact r) {
    return new ChoiceAll(r);
  }

  public static ChoiceAll fixed(SampledData s) {
    return new ChoiceAll(s);
  }

  public static ChoiceAll fixed(Signature s) {
    return new ChoiceAll(s);
  }

  public static ChoiceAll fixed(Timing t) {
    return new ChoiceAll(t);
  }

  public static ChoiceAll fixed(TriggerDefinition t) {
    return new ChoiceAll(t);
  }

  public static ChoiceAll fixed(UUID u) {
    return new ChoiceAll(u);
  }

  public static ChoiceAll fixed(UsageContext u) {
    return new ChoiceAll(u);
  }

  public static ChoiceAll fixed(ZonedDateTime z) {
    return new ChoiceAll(z);
  }

  public static ChoiceAll fixedCanonical(String s) {
    return ChoiceAll.ChoiceAllCanonical(s);
  }

  public static ChoiceAll fixedCode(String s) {
    return ChoiceAll.ChoiceAllCode(s);
  }

  public static ChoiceAll fixedId(String s) {
    return ChoiceAll.ChoiceAllId(s);
  }

  public static ChoiceAll fixedInteger(Integer i) {
    return ChoiceAll.ChoiceAllInt(i);
  }

  public static ChoiceAll fixedMarkdown(String s) {
    return ChoiceAll.ChoiceAllMarkdown(s);
  }

  public static ChoiceAll fixedOid(String s) {
    return ChoiceAll.ChoiceAllOID(s);
  }

  public static ChoiceAll fixedPositiveInt(Integer i) {
    return ChoiceAll.ChoiceAllPositiveInt(i);
  }

  public static ChoiceAll fixedString(String s) {
    return ChoiceAll.ChoiceAllString(s);
  }

  public static ChoiceAll fixedUnsignedInt(Integer i) {
    return ChoiceAll.ChoiceAllUnsignedInt(i);
  }

  public static ChoiceAll fixedUri(String s) {
    return ChoiceAll.ChoiceAllUriStr(s);
  }

  public static ChoiceAll fixedUrl(String s) {
    return ChoiceAll.ChoiceAllUrlStr(s);
  }

  public static ChoiceAll pattern(Address a) {
    return new ChoiceAll(a);
  }

  public static ChoiceAll pattern(Age a) {
    return new ChoiceAll(a);
  }

  public static ChoiceAll pattern(Annotation a) {
    return new ChoiceAll(a);
  }

  public static ChoiceAll pattern(Attachment a) {
    return new ChoiceAll(a);
  }

  public static ChoiceAll pattern(byte[] b) {
    return new ChoiceAll(b);
  }

  public static ChoiceAll pattern(BigDecimal b) {
    return new ChoiceAll(b);
  }

  public static ChoiceAll pattern(Boolean b) {
    return new ChoiceAll(b);
  }

  public static ChoiceAll pattern(CodeableConcept c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll pattern(Coding c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll pattern(ContactDetail c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll pattern(ContactPoint c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll pattern(Contributor c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll pattern(Count c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll pattern(DataRequirement d) {
    return new ChoiceAll(d);
  }

  public static ChoiceAll pattern(Distance d) {
    return new ChoiceAll(d);
  }

  public static ChoiceAll pattern(Dosage d) {
    return new ChoiceAll(d);
  }

  public static ChoiceAll pattern(Duration d) {
    return new ChoiceAll(d);
  }

  public static ChoiceAll pattern(Expression e) {
    return new ChoiceAll(e);
  }

  public static ChoiceAll pattern(FHIRDate f) {
    return new ChoiceAll(f);
  }

  public static ChoiceAll pattern(FHIRDateTime f) {
    return new ChoiceAll(f);
  }

  public static ChoiceAll pattern(HumanName h) {
    return new ChoiceAll(h);
  }

  public static ChoiceAll pattern(Identifier i) {
    return new ChoiceAll(i);
  }

  public static ChoiceAll pattern(LocalTime l) {
    return new ChoiceAll(l);
  }

  public static ChoiceAll pattern(Meta m) {
    return new ChoiceAll(m);
  }

  public static ChoiceAll pattern(Money m) {
    return new ChoiceAll(m);
  }

  public static ChoiceAll pattern(ParameterDefinition p) {
    return new ChoiceAll(p);
  }

  public static ChoiceAll pattern(Period p) {
    return new ChoiceAll(p);
  }

  public static ChoiceAll pattern(Quantity q) {
    return new ChoiceAll(q);
  }

  public static ChoiceAll pattern(Range r) {
    return new ChoiceAll(r);
  }

  public static ChoiceAll pattern(Ratio r) {
    return new ChoiceAll(r);
  }

  public static ChoiceAll pattern(Reference r) {
    return new ChoiceAll(r);
  }

  public static ChoiceAll pattern(RelatedArtifact r) {
    return new ChoiceAll(r);
  }

  public static ChoiceAll pattern(SampledData s) {
    return new ChoiceAll(s);
  }

  public static ChoiceAll pattern(Signature s) {
    return new ChoiceAll(s);
  }

  public static ChoiceAll pattern(Timing t) {
    return new ChoiceAll(t);
  }

  public static ChoiceAll pattern(TriggerDefinition t) {
    return new ChoiceAll(t);
  }

  public static ChoiceAll pattern(UUID u) {
    return new ChoiceAll(u);
  }

  public static ChoiceAll pattern(UsageContext u) {
    return new ChoiceAll(u);
  }

  public static ChoiceAll pattern(ZonedDateTime z) {
    return new ChoiceAll(z);
  }

  public static ChoiceAll patternCanonical(String s) {
    return ChoiceAll.ChoiceAllCanonical(s);
  }

  public static ChoiceAll patternCode(String s) {
    return ChoiceAll.ChoiceAllCode(s);
  }

  public static ChoiceAll patternId(String s) {
    return ChoiceAll.ChoiceAllId(s);
  }

  public static ChoiceAll patternInteger(Integer i) {
    return ChoiceAll.ChoiceAllInt(i);
  }

  public static ChoiceAll patternMarkdown(String s) {
    return ChoiceAll.ChoiceAllMarkdown(s);
  }

  public static ChoiceAll patternOid(String s) {
    return ChoiceAll.ChoiceAllOID(s);
  }

  public static ChoiceAll patternPositiveInt(Integer i) {
    return ChoiceAll.ChoiceAllPositiveInt(i);
  }

  public static ChoiceAll patternString(String s) {
    return ChoiceAll.ChoiceAllString(s);
  }

  public static ChoiceAll patternUnsignedInt(Integer i) {
    return ChoiceAll.ChoiceAllUnsignedInt(i);
  }

  public static ChoiceAll patternUri(String s) {
    return ChoiceAll.ChoiceAllUriStr(s);
  }

  public static ChoiceAll patternUrl(String s) {
    return ChoiceAll.ChoiceAllUrlStr(s);
  }

  public static Choice01480857620 minValue(BigDecimal b) {
    return new Choice01480857620(b);
  }

  public static Choice01480857620 minValue(FHIRDate f) {
    return new Choice01480857620(f);
  }

  public static Choice01480857620 minValue(FHIRDateTime f) {
    return new Choice01480857620(f);
  }

  public static Choice01480857620 minValue(LocalTime l) {
    return new Choice01480857620(l);
  }

  public static Choice01480857620 minValue(Quantity q) {
    return new Choice01480857620(q);
  }

  public static Choice01480857620 minValue(ZonedDateTime z) {
    return new Choice01480857620(z);
  }

  public static Choice01480857620 minValueInteger(Integer i) {
    return Choice01480857620.Choice01480857620Int(i);
  }

  public static Choice01480857620 minValuePositiveInt(Integer i) {
    return Choice01480857620.Choice01480857620PositiveInt(i);
  }

  public static Choice01480857620 minValueUnsignedInt(Integer i) {
    return Choice01480857620.Choice01480857620UnsignedInt(i);
  }

  public static Choice01480857620 maxValue(BigDecimal b) {
    return new Choice01480857620(b);
  }

  public static Choice01480857620 maxValue(FHIRDate f) {
    return new Choice01480857620(f);
  }

  public static Choice01480857620 maxValue(FHIRDateTime f) {
    return new Choice01480857620(f);
  }

  public static Choice01480857620 maxValue(LocalTime l) {
    return new Choice01480857620(l);
  }

  public static Choice01480857620 maxValue(Quantity q) {
    return new Choice01480857620(q);
  }

  public static Choice01480857620 maxValue(ZonedDateTime z) {
    return new Choice01480857620(z);
  }

  public static Choice01480857620 maxValueInteger(Integer i) {
    return Choice01480857620.Choice01480857620Int(i);
  }

  public static Choice01480857620 maxValuePositiveInt(Integer i) {
    return Choice01480857620.Choice01480857620PositiveInt(i);
  }

  public static Choice01480857620 maxValueUnsignedInt(Integer i) {
    return Choice01480857620.Choice01480857620UnsignedInt(i);
  }

  public static ChoiceAll defaultValue(Address a) {
    return new ChoiceAll(a);
  }

  public static ChoiceAll defaultValue(Age a) {
    return new ChoiceAll(a);
  }

  public static ChoiceAll defaultValue(Annotation a) {
    return new ChoiceAll(a);
  }

  public static ChoiceAll defaultValue(Attachment a) {
    return new ChoiceAll(a);
  }

  public static ChoiceAll defaultValue(byte[] b) {
    return new ChoiceAll(b);
  }

  public static ChoiceAll defaultValue(BigDecimal b) {
    return new ChoiceAll(b);
  }

  public static ChoiceAll defaultValue(Boolean b) {
    return new ChoiceAll(b);
  }

  public static ChoiceAll defaultValue(CodeableConcept c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll defaultValue(Coding c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll defaultValue(ContactDetail c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll defaultValue(ContactPoint c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll defaultValue(Contributor c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll defaultValue(Count c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll defaultValue(DataRequirement d) {
    return new ChoiceAll(d);
  }

  public static ChoiceAll defaultValue(Distance d) {
    return new ChoiceAll(d);
  }

  public static ChoiceAll defaultValue(Dosage d) {
    return new ChoiceAll(d);
  }

  public static ChoiceAll defaultValue(Duration d) {
    return new ChoiceAll(d);
  }

  public static ChoiceAll defaultValue(Expression e) {
    return new ChoiceAll(e);
  }

  public static ChoiceAll defaultValue(FHIRDate f) {
    return new ChoiceAll(f);
  }

  public static ChoiceAll defaultValue(FHIRDateTime f) {
    return new ChoiceAll(f);
  }

  public static ChoiceAll defaultValue(HumanName h) {
    return new ChoiceAll(h);
  }

  public static ChoiceAll defaultValue(Identifier i) {
    return new ChoiceAll(i);
  }

  public static ChoiceAll defaultValue(LocalTime l) {
    return new ChoiceAll(l);
  }

  public static ChoiceAll defaultValue(Meta m) {
    return new ChoiceAll(m);
  }

  public static ChoiceAll defaultValue(Money m) {
    return new ChoiceAll(m);
  }

  public static ChoiceAll defaultValue(ParameterDefinition p) {
    return new ChoiceAll(p);
  }

  public static ChoiceAll defaultValue(Period p) {
    return new ChoiceAll(p);
  }

  public static ChoiceAll defaultValue(Quantity q) {
    return new ChoiceAll(q);
  }

  public static ChoiceAll defaultValue(Range r) {
    return new ChoiceAll(r);
  }

  public static ChoiceAll defaultValue(Ratio r) {
    return new ChoiceAll(r);
  }

  public static ChoiceAll defaultValue(Reference r) {
    return new ChoiceAll(r);
  }

  public static ChoiceAll defaultValue(RelatedArtifact r) {
    return new ChoiceAll(r);
  }

  public static ChoiceAll defaultValue(SampledData s) {
    return new ChoiceAll(s);
  }

  public static ChoiceAll defaultValue(Signature s) {
    return new ChoiceAll(s);
  }

  public static ChoiceAll defaultValue(Timing t) {
    return new ChoiceAll(t);
  }

  public static ChoiceAll defaultValue(TriggerDefinition t) {
    return new ChoiceAll(t);
  }

  public static ChoiceAll defaultValue(UUID u) {
    return new ChoiceAll(u);
  }

  public static ChoiceAll defaultValue(UsageContext u) {
    return new ChoiceAll(u);
  }

  public static ChoiceAll defaultValue(ZonedDateTime z) {
    return new ChoiceAll(z);
  }

  public static ChoiceAll defaultValueCanonical(String s) {
    return ChoiceAll.ChoiceAllCanonical(s);
  }

  public static ChoiceAll defaultValueCode(String s) {
    return ChoiceAll.ChoiceAllCode(s);
  }

  public static ChoiceAll defaultValueId(String s) {
    return ChoiceAll.ChoiceAllId(s);
  }

  public static ChoiceAll defaultValueInteger(Integer i) {
    return ChoiceAll.ChoiceAllInt(i);
  }

  public static ChoiceAll defaultValueMarkdown(String s) {
    return ChoiceAll.ChoiceAllMarkdown(s);
  }

  public static ChoiceAll defaultValueOid(String s) {
    return ChoiceAll.ChoiceAllOID(s);
  }

  public static ChoiceAll defaultValuePositiveInt(Integer i) {
    return ChoiceAll.ChoiceAllPositiveInt(i);
  }

  public static ChoiceAll defaultValueString(String s) {
    return ChoiceAll.ChoiceAllString(s);
  }

  public static ChoiceAll defaultValueUnsignedInt(Integer i) {
    return ChoiceAll.ChoiceAllUnsignedInt(i);
  }

  public static ChoiceAll defaultValueUri(String s) {
    return ChoiceAll.ChoiceAllUriStr(s);
  }

  public static ChoiceAll defaultValueUrl(String s) {
    return ChoiceAll.ChoiceAllUrlStr(s);
  }

  public class Impl implements Elementdefinition_deBuilder {
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
    private Optional<Choice01480857620> minValue = Optional.empty();
    private Optional<Choice01480857620> maxValue = Optional.empty();
    private Optional<Boolean> mustSupport = Optional.empty();
    private Optional<String> requirements = Optional.empty();
    private Optional<String> orderMeaning = Optional.empty();
    private Optional<ElementDefinition.Base> base = Optional.empty();
    private Optional<ChoiceAll> defaultValue = Optional.empty();
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
    public Impl(String path) {
      this.path = path;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Elementdefinition_deBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param min - The minimum number of times this element SHALL appear in the instance. */
    public Elementdefinition_deBuilder.Impl withMin(@NonNull Integer min) {
      this.min = Optional.of(min);
      return this;
    }
    /**
     * @param max - The maximum number of times this element is permitted to appear in the instance.
     */
    public Elementdefinition_deBuilder.Impl withMax(@NonNull String max) {
      this.max = Optional.of(max);
      return this;
    }
    /**
     * @param code - A code that has the same meaning as the element in a particular terminology.
     */
    public Elementdefinition_deBuilder.Impl withCode(@NonNull Coding... code) {
      this.code = Arrays.asList(code);
      return this;
    }
    /**
     * @param code - A code that has the same meaning as the element in a particular terminology.
     */
    public Elementdefinition_deBuilder.Impl withCode(@NonNull Collection<Coding> code) {
      this.code = Collections.unmodifiableCollection(code);
      return this;
    }

    public Elementdefinition_deBuilder.Impl withCode(@NonNull CodingBuilder... code) {
      this.code = Arrays.stream(code).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param label - A single preferred label which is the text to display beside the element
     *     indicating its meaning or to use to prompt for the element in a user display or form.
     */
    public Elementdefinition_deBuilder.Impl withLabel(@NonNull String label) {
      this.label = Optional.of(label);
      return this;
    }
    /** @param alias - Identifies additional names by which this element might also be known. */
    public Elementdefinition_deBuilder.Impl withAlias(@NonNull String... alias) {
      this.alias = Arrays.asList(alias);
      return this;
    }
    /** @param alias - Identifies additional names by which this element might also be known. */
    public Elementdefinition_deBuilder.Impl withAlias(@NonNull Collection<String> alias) {
      this.alias = Collections.unmodifiableCollection(alias);
      return this;
    }
    /**
     * @param comment - Explanatory notes and implementation guidance about the data element,
     *     including notes about how to use the data properly, exceptions to proper use, etc. (Note:
     *     The text you are reading is specified in ElementDefinition.comment).
     */
    public Elementdefinition_deBuilder.Impl withComment(@NonNull String comment) {
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
    public Elementdefinition_deBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Elementdefinition_deBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Elementdefinition_deBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param sliceName - The name of this element definition slice, when slicing is working. The
     *     name must be a token with no dots or spaces. This is a unique name referring to a
     *     specific set of constraints applied to this element, used to provide a name to different
     *     slices of the same element.
     */
    public Elementdefinition_deBuilder.Impl withSliceName(@NonNull String sliceName) {
      this.sliceName = Optional.of(sliceName);
      return this;
    }
    /**
     * @param maxLength - Indicates the maximum length in characters that is permitted to be present
     *     in conformant instances and which is expected to be supported by conformant consumers
     *     that support the element.
     */
    public Elementdefinition_deBuilder.Impl withMaxLength(@NonNull Integer maxLength) {
      this.maxLength = Optional.of(maxLength);
      return this;
    }
    /**
     * @param condition - A reference to an invariant that may make additional statements about the
     *     cardinality or value in the instance.
     */
    public Elementdefinition_deBuilder.Impl withCondition(@NonNull String... condition) {
      this.condition = Arrays.asList(condition);
      return this;
    }
    /**
     * @param condition - A reference to an invariant that may make additional statements about the
     *     cardinality or value in the instance.
     */
    public Elementdefinition_deBuilder.Impl withCondition(@NonNull Collection<String> condition) {
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
    public Elementdefinition_deBuilder.Impl withDefinition(@NonNull String definition) {
      this.definition = Optional.of(definition);
      return this;
    }
    /**
     * @param minValue - The minimum allowed value for the element. The value is inclusive. This is
     *     allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     *     Field is a 'choice' field. Type should be one of BigDecimal, FHIRDate, FHIRDateTime,
     *     Integer, LocalTime, Quantity, ZonedDateTime. To pass the value in, wrap with one of the
     *     Elementdefinition_deBuilder.minValue static methods
     */
    public Elementdefinition_deBuilder.Impl withMinValue(@NonNull Choice01480857620 minValue) {
      this.minValue = Optional.of(minValue);
      return this;
    }
    /**
     * @param maxValue - The maximum allowed value for the element. The value is inclusive. This is
     *     allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     *     Field is a 'choice' field. Type should be one of BigDecimal, FHIRDate, FHIRDateTime,
     *     Integer, LocalTime, Quantity, ZonedDateTime. To pass the value in, wrap with one of the
     *     Elementdefinition_deBuilder.maxValue static methods
     */
    public Elementdefinition_deBuilder.Impl withMaxValue(@NonNull Choice01480857620 maxValue) {
      this.maxValue = Optional.of(maxValue);
      return this;
    }
    /**
     * @param mustSupport - If true, implementations that produce or consume resources SHALL provide
     *     "support" for the element in some meaningful way. If false, the element may be ignored
     *     and not supported. If false, whether to populate or use the data element in any way is at
     *     the discretion of the implementation.
     */
    public Elementdefinition_deBuilder.Impl withMustSupport(@NonNull Boolean mustSupport) {
      this.mustSupport = Optional.of(mustSupport);
      return this;
    }
    /**
     * @param requirements - This element is for traceability of why the element was created and why
     *     the constraints exist as they do. This may be used to point to source materials or
     *     specifications that drove the structure of this element.
     */
    public Elementdefinition_deBuilder.Impl withRequirements(@NonNull String requirements) {
      this.requirements = Optional.of(requirements);
      return this;
    }
    /**
     * @param orderMeaning - If present, indicates that the order of the repeating element has
     *     meaning and describes what that meaning is. If absent, it means that the order of the
     *     element has no meaning.
     */
    public Elementdefinition_deBuilder.Impl withOrderMeaning(@NonNull String orderMeaning) {
      this.orderMeaning = Optional.of(orderMeaning);
      return this;
    }
    /**
     * @param base - Information about the base definition of the element, provided to make it
     *     unnecessary for tools to trace the deviation of the element through the derived and
     *     related profiles. When the element definition is not the original definition of an
     *     element - i.g. either in a constraint on another type, or for elements from a super type
     *     in a snap shot - then the information in provided in the element definition may be
     *     different to the base definition. On the original definition of the element, it will be
     *     same.
     */
    public Elementdefinition_deBuilder.Impl withBase(@NonNull ElementDefinition.Base base) {
      this.base = Optional.of(base);
      return this;
    }

    public Elementdefinition_deBuilder.Impl withBase(@NonNull ElementDefinition_BaseBuilder base) {
      this.base = Optional.of(base.build());
      return this;
    }
    /**
     * @param defaultValue - The value that should be used if there is no value stated in the
     *     instance (e.g. 'if not otherwise specified, the abstract is false'). Field is a 'choice'
     *     field. Type should be one of Address, Age, Annotation, Attachment, byte[], BigDecimal,
     *     Boolean, String, CodeableConcept, Coding, ContactDetail, ContactPoint, Contributor,
     *     Count, DataRequirement, Distance, Dosage, Duration, Expression, FHIRDate, FHIRDateTime,
     *     HumanName, Identifier, Integer, LocalTime, Meta, Money, ParameterDefinition, Period,
     *     Quantity, Range, Ratio, Reference, RelatedArtifact, SampledData, Signature, Timing,
     *     TriggerDefinition, UUID, UsageContext, ZonedDateTime. To pass the value in, wrap with one
     *     of the Elementdefinition_deBuilder.defaultValue static methods
     */
    public Elementdefinition_deBuilder.Impl withDefaultValue(@NonNull ChoiceAll defaultValue) {
      this.defaultValue = Optional.of(defaultValue);
      return this;
    }
    /**
     * @param isModifierReason - Explains how that element affects the interpretation of the
     *     resource or element that contains it.
     */
    public Elementdefinition_deBuilder.Impl withIsModifierReason(@NonNull String isModifierReason) {
      this.isModifierReason = Optional.of(isModifierReason);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the element and that modifies the understanding of the element
     *     in which it is contained and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer can define an extension, there
     *     is a set of requirements that SHALL be met as part of the definition of the extension.
     *     Applications processing a resource are required to check for modifier extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public Elementdefinition_deBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the element and that modifies the understanding of the element
     *     in which it is contained and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer can define an extension, there
     *     is a set of requirements that SHALL be met as part of the definition of the extension.
     *     Applications processing a resource are required to check for modifier extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public Elementdefinition_deBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Elementdefinition_deBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param example - A sample value for this element demonstrating the type of information that
     *     would typically be found in the element.
     */
    public Elementdefinition_deBuilder.Impl withExample(
        @NonNull ElementDefinition.Example... example) {
      this.example = Arrays.asList(example);
      return this;
    }
    /**
     * @param example - A sample value for this element demonstrating the type of information that
     *     would typically be found in the element.
     */
    public Elementdefinition_deBuilder.Impl withExample(
        @NonNull Collection<ElementDefinition.Example> example) {
      this.example = Collections.unmodifiableCollection(example);
      return this;
    }

    public Elementdefinition_deBuilder.Impl withExample(
        @NonNull ElementDefinition_ExampleBuilder... example) {
      this.example = Arrays.stream(example).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param mapping - Identifies a concept from an external specification that roughly corresponds
     *     to this element.
     */
    public Elementdefinition_deBuilder.Impl withMapping(
        @NonNull ElementDefinition.Mapping... mapping) {
      this.mapping = Arrays.asList(mapping);
      return this;
    }
    /**
     * @param mapping - Identifies a concept from an external specification that roughly corresponds
     *     to this element.
     */
    public Elementdefinition_deBuilder.Impl withMapping(
        @NonNull Collection<ElementDefinition.Mapping> mapping) {
      this.mapping = Collections.unmodifiableCollection(mapping);
      return this;
    }

    public Elementdefinition_deBuilder.Impl withMapping(
        @NonNull ElementDefinition_MappingBuilder... mapping) {
      this.mapping = Arrays.stream(mapping).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param _type - The data type or resource that the value of this element is permitted to be.
     */
    public Elementdefinition_deBuilder.Impl withType(@NonNull ElementDefinition.Type... _type) {
      this._type = Arrays.asList(_type);
      return this;
    }
    /**
     * @param _type - The data type or resource that the value of this element is permitted to be.
     */
    public Elementdefinition_deBuilder.Impl withType(
        @NonNull Collection<ElementDefinition.Type> _type) {
      this._type = Collections.unmodifiableCollection(_type);
      return this;
    }

    public Elementdefinition_deBuilder.Impl withType(
        @NonNull ElementDefinition_TypeBuilder... _type) {
      this._type = Arrays.stream(_type).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param meaningWhenMissing - The Implicit meaning that is to be understood when this element
     *     is missing (e.g. 'when this element is missing, the period is ongoing').
     */
    public Elementdefinition_deBuilder.Impl withMeaningWhenMissing(
        @NonNull String meaningWhenMissing) {
      this.meaningWhenMissing = Optional.of(meaningWhenMissing);
      return this;
    }
    /**
     * @param sliceIsConstraining - If true, indicates that this slice definition is constraining a
     *     slice definition with the same name in an inherited profile. If false, the slice is not
     *     overriding any slice in an inherited profile. If missing, the slice might or might not be
     *     overriding a slice in an inherited profile, depending on the sliceName.
     */
    public Elementdefinition_deBuilder.Impl withSliceIsConstraining(
        @NonNull Boolean sliceIsConstraining) {
      this.sliceIsConstraining = Optional.of(sliceIsConstraining);
      return this;
    }
    /**
     * @param binding - Binds to a value set if this element is coded (code, Coding,
     *     CodeableConcept, Quantity), or the data types (string, uri).
     */
    public Elementdefinition_deBuilder.Impl withBinding(
        @NonNull ElementDefinition.Binding binding) {
      this.binding = Optional.of(binding);
      return this;
    }

    public Elementdefinition_deBuilder.Impl withBinding(
        @NonNull ElementDefinition_BindingBuilder binding) {
      this.binding = Optional.of(binding.build());
      return this;
    }
    /**
     * @param constraint - Formal constraints such as co-occurrence and other constraints that can
     *     be computationally evaluated within the context of the instance.
     */
    public Elementdefinition_deBuilder.Impl withConstraint(
        @NonNull ElementDefinition.Constraint... constraint) {
      this.constraint = Arrays.asList(constraint);
      return this;
    }
    /**
     * @param constraint - Formal constraints such as co-occurrence and other constraints that can
     *     be computationally evaluated within the context of the instance.
     */
    public Elementdefinition_deBuilder.Impl withConstraint(
        @NonNull Collection<ElementDefinition.Constraint> constraint) {
      this.constraint = Collections.unmodifiableCollection(constraint);
      return this;
    }

    public Elementdefinition_deBuilder.Impl withConstraint(
        @NonNull ElementDefinition_ConstraintBuilder... constraint) {
      this.constraint = Arrays.stream(constraint).map(e -> e.build()).collect(toList());
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
}
