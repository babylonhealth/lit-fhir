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
import com.babylonhealth.lit.hl7.PROPERTY_REPRESENTATION;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface ElementDefinitionBuilder extends BackboneElementBuilder {
  public ElementDefinition build();

  public static Impl init(String path) {
    return new Impl(path);
  }

  public static Impl builder(String path) {
    return new Impl(path);
  }

  public static Choice_1349125893 fixed(Address a) {
    return new Choice_1349125893(a);
  }

  public static Choice_1349125893 fixed(Age a) {
    return new Choice_1349125893(a);
  }

  public static Choice_1349125893 fixed(Annotation a) {
    return new Choice_1349125893(a);
  }

  public static Choice_1349125893 fixed(Attachment a) {
    return new Choice_1349125893(a);
  }

  public static Choice_1349125893 fixed(byte[] b) {
    return new Choice_1349125893(b);
  }

  public static Choice_1349125893 fixed(BigDecimal b) {
    return new Choice_1349125893(b);
  }

  public static Choice_1349125893 fixed(Boolean b) {
    return new Choice_1349125893(b);
  }

  public static Choice_1349125893 fixed(CodeableConcept c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 fixed(Coding c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 fixed(ContactDetail c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 fixed(ContactPoint c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 fixed(Contributor c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 fixed(Count c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 fixed(DataRequirement d) {
    return new Choice_1349125893(d);
  }

  public static Choice_1349125893 fixed(Distance d) {
    return new Choice_1349125893(d);
  }

  public static Choice_1349125893 fixed(Dosage d) {
    return new Choice_1349125893(d);
  }

  public static Choice_1349125893 fixed(Duration d) {
    return new Choice_1349125893(d);
  }

  public static Choice_1349125893 fixed(Expression e) {
    return new Choice_1349125893(e);
  }

  public static Choice_1349125893 fixed(FHIRDate f) {
    return new Choice_1349125893(f);
  }

  public static Choice_1349125893 fixed(FHIRDateTime f) {
    return new Choice_1349125893(f);
  }

  public static Choice_1349125893 fixed(HumanName h) {
    return new Choice_1349125893(h);
  }

  public static Choice_1349125893 fixed(Identifier i) {
    return new Choice_1349125893(i);
  }

  public static Choice_1349125893 fixed(LocalTime l) {
    return new Choice_1349125893(l);
  }

  public static Choice_1349125893 fixed(Meta m) {
    return new Choice_1349125893(m);
  }

  public static Choice_1349125893 fixed(Money m) {
    return new Choice_1349125893(m);
  }

  public static Choice_1349125893 fixed(ParameterDefinition p) {
    return new Choice_1349125893(p);
  }

  public static Choice_1349125893 fixed(Period p) {
    return new Choice_1349125893(p);
  }

  public static Choice_1349125893 fixed(Quantity q) {
    return new Choice_1349125893(q);
  }

  public static Choice_1349125893 fixed(Range r) {
    return new Choice_1349125893(r);
  }

  public static Choice_1349125893 fixed(Ratio r) {
    return new Choice_1349125893(r);
  }

  public static Choice_1349125893 fixed(Reference r) {
    return new Choice_1349125893(r);
  }

  public static Choice_1349125893 fixed(RelatedArtifact r) {
    return new Choice_1349125893(r);
  }

  public static Choice_1349125893 fixed(SampledData s) {
    return new Choice_1349125893(s);
  }

  public static Choice_1349125893 fixed(Signature s) {
    return new Choice_1349125893(s);
  }

  public static Choice_1349125893 fixed(Timing t) {
    return new Choice_1349125893(t);
  }

  public static Choice_1349125893 fixed(TriggerDefinition t) {
    return new Choice_1349125893(t);
  }

  public static Choice_1349125893 fixed(UUID u) {
    return new Choice_1349125893(u);
  }

  public static Choice_1349125893 fixed(UsageContext u) {
    return new Choice_1349125893(u);
  }

  public static Choice_1349125893 fixed(ZonedDateTime z) {
    return new Choice_1349125893(z);
  }

  public static Choice_1349125893 fixedCanonical(String s) {
    return Choice_1349125893.Choice_1349125893Canonical(s);
  }

  public static Choice_1349125893 fixedCode(String s) {
    return Choice_1349125893.Choice_1349125893Code(s);
  }

  public static Choice_1349125893 fixedId(String s) {
    return Choice_1349125893.Choice_1349125893Id(s);
  }

  public static Choice_1349125893 fixedInteger(Integer i) {
    return Choice_1349125893.Choice_1349125893Int(i);
  }

  public static Choice_1349125893 fixedMarkdown(String s) {
    return Choice_1349125893.Choice_1349125893Markdown(s);
  }

  public static Choice_1349125893 fixedOid(String s) {
    return Choice_1349125893.Choice_1349125893OID(s);
  }

  public static Choice_1349125893 fixedPositiveInt(Integer i) {
    return Choice_1349125893.Choice_1349125893PositiveInt(i);
  }

  public static Choice_1349125893 fixedString(String s) {
    return Choice_1349125893.Choice_1349125893String(s);
  }

  public static Choice_1349125893 fixedUnsignedInt(Integer i) {
    return Choice_1349125893.Choice_1349125893UnsignedInt(i);
  }

  public static Choice_1349125893 fixedUri(String s) {
    return Choice_1349125893.Choice_1349125893UriStr(s);
  }

  public static Choice_1349125893 fixedUrl(String s) {
    return Choice_1349125893.Choice_1349125893UrlStr(s);
  }

  public static Choice_1349125893 pattern(Address a) {
    return new Choice_1349125893(a);
  }

  public static Choice_1349125893 pattern(Age a) {
    return new Choice_1349125893(a);
  }

  public static Choice_1349125893 pattern(Annotation a) {
    return new Choice_1349125893(a);
  }

  public static Choice_1349125893 pattern(Attachment a) {
    return new Choice_1349125893(a);
  }

  public static Choice_1349125893 pattern(byte[] b) {
    return new Choice_1349125893(b);
  }

  public static Choice_1349125893 pattern(BigDecimal b) {
    return new Choice_1349125893(b);
  }

  public static Choice_1349125893 pattern(Boolean b) {
    return new Choice_1349125893(b);
  }

  public static Choice_1349125893 pattern(CodeableConcept c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 pattern(Coding c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 pattern(ContactDetail c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 pattern(ContactPoint c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 pattern(Contributor c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 pattern(Count c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 pattern(DataRequirement d) {
    return new Choice_1349125893(d);
  }

  public static Choice_1349125893 pattern(Distance d) {
    return new Choice_1349125893(d);
  }

  public static Choice_1349125893 pattern(Dosage d) {
    return new Choice_1349125893(d);
  }

  public static Choice_1349125893 pattern(Duration d) {
    return new Choice_1349125893(d);
  }

  public static Choice_1349125893 pattern(Expression e) {
    return new Choice_1349125893(e);
  }

  public static Choice_1349125893 pattern(FHIRDate f) {
    return new Choice_1349125893(f);
  }

  public static Choice_1349125893 pattern(FHIRDateTime f) {
    return new Choice_1349125893(f);
  }

  public static Choice_1349125893 pattern(HumanName h) {
    return new Choice_1349125893(h);
  }

  public static Choice_1349125893 pattern(Identifier i) {
    return new Choice_1349125893(i);
  }

  public static Choice_1349125893 pattern(LocalTime l) {
    return new Choice_1349125893(l);
  }

  public static Choice_1349125893 pattern(Meta m) {
    return new Choice_1349125893(m);
  }

  public static Choice_1349125893 pattern(Money m) {
    return new Choice_1349125893(m);
  }

  public static Choice_1349125893 pattern(ParameterDefinition p) {
    return new Choice_1349125893(p);
  }

  public static Choice_1349125893 pattern(Period p) {
    return new Choice_1349125893(p);
  }

  public static Choice_1349125893 pattern(Quantity q) {
    return new Choice_1349125893(q);
  }

  public static Choice_1349125893 pattern(Range r) {
    return new Choice_1349125893(r);
  }

  public static Choice_1349125893 pattern(Ratio r) {
    return new Choice_1349125893(r);
  }

  public static Choice_1349125893 pattern(Reference r) {
    return new Choice_1349125893(r);
  }

  public static Choice_1349125893 pattern(RelatedArtifact r) {
    return new Choice_1349125893(r);
  }

  public static Choice_1349125893 pattern(SampledData s) {
    return new Choice_1349125893(s);
  }

  public static Choice_1349125893 pattern(Signature s) {
    return new Choice_1349125893(s);
  }

  public static Choice_1349125893 pattern(Timing t) {
    return new Choice_1349125893(t);
  }

  public static Choice_1349125893 pattern(TriggerDefinition t) {
    return new Choice_1349125893(t);
  }

  public static Choice_1349125893 pattern(UUID u) {
    return new Choice_1349125893(u);
  }

  public static Choice_1349125893 pattern(UsageContext u) {
    return new Choice_1349125893(u);
  }

  public static Choice_1349125893 pattern(ZonedDateTime z) {
    return new Choice_1349125893(z);
  }

  public static Choice_1349125893 patternCanonical(String s) {
    return Choice_1349125893.Choice_1349125893Canonical(s);
  }

  public static Choice_1349125893 patternCode(String s) {
    return Choice_1349125893.Choice_1349125893Code(s);
  }

  public static Choice_1349125893 patternId(String s) {
    return Choice_1349125893.Choice_1349125893Id(s);
  }

  public static Choice_1349125893 patternInteger(Integer i) {
    return Choice_1349125893.Choice_1349125893Int(i);
  }

  public static Choice_1349125893 patternMarkdown(String s) {
    return Choice_1349125893.Choice_1349125893Markdown(s);
  }

  public static Choice_1349125893 patternOid(String s) {
    return Choice_1349125893.Choice_1349125893OID(s);
  }

  public static Choice_1349125893 patternPositiveInt(Integer i) {
    return Choice_1349125893.Choice_1349125893PositiveInt(i);
  }

  public static Choice_1349125893 patternString(String s) {
    return Choice_1349125893.Choice_1349125893String(s);
  }

  public static Choice_1349125893 patternUnsignedInt(Integer i) {
    return Choice_1349125893.Choice_1349125893UnsignedInt(i);
  }

  public static Choice_1349125893 patternUri(String s) {
    return Choice_1349125893.Choice_1349125893UriStr(s);
  }

  public static Choice_1349125893 patternUrl(String s) {
    return Choice_1349125893.Choice_1349125893UrlStr(s);
  }

  public static Choice_0637176084 minValue(BigDecimal b) {
    return new Choice_0637176084(b);
  }

  public static Choice_0637176084 minValue(FHIRDate f) {
    return new Choice_0637176084(f);
  }

  public static Choice_0637176084 minValue(FHIRDateTime f) {
    return new Choice_0637176084(f);
  }

  public static Choice_0637176084 minValue(LocalTime l) {
    return new Choice_0637176084(l);
  }

  public static Choice_0637176084 minValue(Quantity q) {
    return new Choice_0637176084(q);
  }

  public static Choice_0637176084 minValue(ZonedDateTime z) {
    return new Choice_0637176084(z);
  }

  public static Choice_0637176084 minValueInteger(Integer i) {
    return Choice_0637176084.Choice_0637176084Int(i);
  }

  public static Choice_0637176084 minValuePositiveInt(Integer i) {
    return Choice_0637176084.Choice_0637176084PositiveInt(i);
  }

  public static Choice_0637176084 minValueUnsignedInt(Integer i) {
    return Choice_0637176084.Choice_0637176084UnsignedInt(i);
  }

  public static Choice_0637176084 maxValue(BigDecimal b) {
    return new Choice_0637176084(b);
  }

  public static Choice_0637176084 maxValue(FHIRDate f) {
    return new Choice_0637176084(f);
  }

  public static Choice_0637176084 maxValue(FHIRDateTime f) {
    return new Choice_0637176084(f);
  }

  public static Choice_0637176084 maxValue(LocalTime l) {
    return new Choice_0637176084(l);
  }

  public static Choice_0637176084 maxValue(Quantity q) {
    return new Choice_0637176084(q);
  }

  public static Choice_0637176084 maxValue(ZonedDateTime z) {
    return new Choice_0637176084(z);
  }

  public static Choice_0637176084 maxValueInteger(Integer i) {
    return Choice_0637176084.Choice_0637176084Int(i);
  }

  public static Choice_0637176084 maxValuePositiveInt(Integer i) {
    return Choice_0637176084.Choice_0637176084PositiveInt(i);
  }

  public static Choice_0637176084 maxValueUnsignedInt(Integer i) {
    return Choice_0637176084.Choice_0637176084UnsignedInt(i);
  }

  public static Choice_1349125893 defaultValue(Address a) {
    return new Choice_1349125893(a);
  }

  public static Choice_1349125893 defaultValue(Age a) {
    return new Choice_1349125893(a);
  }

  public static Choice_1349125893 defaultValue(Annotation a) {
    return new Choice_1349125893(a);
  }

  public static Choice_1349125893 defaultValue(Attachment a) {
    return new Choice_1349125893(a);
  }

  public static Choice_1349125893 defaultValue(byte[] b) {
    return new Choice_1349125893(b);
  }

  public static Choice_1349125893 defaultValue(BigDecimal b) {
    return new Choice_1349125893(b);
  }

  public static Choice_1349125893 defaultValue(Boolean b) {
    return new Choice_1349125893(b);
  }

  public static Choice_1349125893 defaultValue(CodeableConcept c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 defaultValue(Coding c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 defaultValue(ContactDetail c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 defaultValue(ContactPoint c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 defaultValue(Contributor c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 defaultValue(Count c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 defaultValue(DataRequirement d) {
    return new Choice_1349125893(d);
  }

  public static Choice_1349125893 defaultValue(Distance d) {
    return new Choice_1349125893(d);
  }

  public static Choice_1349125893 defaultValue(Dosage d) {
    return new Choice_1349125893(d);
  }

  public static Choice_1349125893 defaultValue(Duration d) {
    return new Choice_1349125893(d);
  }

  public static Choice_1349125893 defaultValue(Expression e) {
    return new Choice_1349125893(e);
  }

  public static Choice_1349125893 defaultValue(FHIRDate f) {
    return new Choice_1349125893(f);
  }

  public static Choice_1349125893 defaultValue(FHIRDateTime f) {
    return new Choice_1349125893(f);
  }

  public static Choice_1349125893 defaultValue(HumanName h) {
    return new Choice_1349125893(h);
  }

  public static Choice_1349125893 defaultValue(Identifier i) {
    return new Choice_1349125893(i);
  }

  public static Choice_1349125893 defaultValue(LocalTime l) {
    return new Choice_1349125893(l);
  }

  public static Choice_1349125893 defaultValue(Meta m) {
    return new Choice_1349125893(m);
  }

  public static Choice_1349125893 defaultValue(Money m) {
    return new Choice_1349125893(m);
  }

  public static Choice_1349125893 defaultValue(ParameterDefinition p) {
    return new Choice_1349125893(p);
  }

  public static Choice_1349125893 defaultValue(Period p) {
    return new Choice_1349125893(p);
  }

  public static Choice_1349125893 defaultValue(Quantity q) {
    return new Choice_1349125893(q);
  }

  public static Choice_1349125893 defaultValue(Range r) {
    return new Choice_1349125893(r);
  }

  public static Choice_1349125893 defaultValue(Ratio r) {
    return new Choice_1349125893(r);
  }

  public static Choice_1349125893 defaultValue(Reference r) {
    return new Choice_1349125893(r);
  }

  public static Choice_1349125893 defaultValue(RelatedArtifact r) {
    return new Choice_1349125893(r);
  }

  public static Choice_1349125893 defaultValue(SampledData s) {
    return new Choice_1349125893(s);
  }

  public static Choice_1349125893 defaultValue(Signature s) {
    return new Choice_1349125893(s);
  }

  public static Choice_1349125893 defaultValue(Timing t) {
    return new Choice_1349125893(t);
  }

  public static Choice_1349125893 defaultValue(TriggerDefinition t) {
    return new Choice_1349125893(t);
  }

  public static Choice_1349125893 defaultValue(UUID u) {
    return new Choice_1349125893(u);
  }

  public static Choice_1349125893 defaultValue(UsageContext u) {
    return new Choice_1349125893(u);
  }

  public static Choice_1349125893 defaultValue(ZonedDateTime z) {
    return new Choice_1349125893(z);
  }

  public static Choice_1349125893 defaultValueCanonical(String s) {
    return Choice_1349125893.Choice_1349125893Canonical(s);
  }

  public static Choice_1349125893 defaultValueCode(String s) {
    return Choice_1349125893.Choice_1349125893Code(s);
  }

  public static Choice_1349125893 defaultValueId(String s) {
    return Choice_1349125893.Choice_1349125893Id(s);
  }

  public static Choice_1349125893 defaultValueInteger(Integer i) {
    return Choice_1349125893.Choice_1349125893Int(i);
  }

  public static Choice_1349125893 defaultValueMarkdown(String s) {
    return Choice_1349125893.Choice_1349125893Markdown(s);
  }

  public static Choice_1349125893 defaultValueOid(String s) {
    return Choice_1349125893.Choice_1349125893OID(s);
  }

  public static Choice_1349125893 defaultValuePositiveInt(Integer i) {
    return Choice_1349125893.Choice_1349125893PositiveInt(i);
  }

  public static Choice_1349125893 defaultValueString(String s) {
    return Choice_1349125893.Choice_1349125893String(s);
  }

  public static Choice_1349125893 defaultValueUnsignedInt(Integer i) {
    return Choice_1349125893.Choice_1349125893UnsignedInt(i);
  }

  public static Choice_1349125893 defaultValueUri(String s) {
    return Choice_1349125893.Choice_1349125893UriStr(s);
  }

  public static Choice_1349125893 defaultValueUrl(String s) {
    return Choice_1349125893.Choice_1349125893UrlStr(s);
  }

  public class Impl implements ElementDefinitionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Integer> min = Optional.empty();
    private Optional<String> max = Optional.empty();
    private String path;
    private Collection<Coding> code = Collections.emptyList();
    private Optional<String> label = Optional.empty();
    private Optional<String> _short = Optional.empty();
    private Collection<String> alias = Collections.emptyList();
    private Optional<String> comment = Optional.empty();
    private Optional<Choice_1349125893> fixed = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> sliceName = Optional.empty();
    private Optional<Integer> maxLength = Optional.empty();
    private Collection<String> condition = Collections.emptyList();
    private Optional<Boolean> isSummary = Optional.empty();
    private Optional<String> definition = Optional.empty();
    private Optional<Choice_1349125893> pattern = Optional.empty();
    private Optional<Boolean> isModifier = Optional.empty();
    private Optional<Choice_0637176084> minValue = Optional.empty();
    private Optional<Choice_0637176084> maxValue = Optional.empty();
    private Optional<Boolean> mustSupport = Optional.empty();
    private Optional<String> requirements = Optional.empty();
    private Optional<String> orderMeaning = Optional.empty();
    private Collection<PROPERTY_REPRESENTATION> representation = Collections.emptyList();
    private Optional<ElementDefinition.Base> base = Optional.empty();
    private Optional<Choice_1349125893> defaultValue = Optional.empty();
    private Optional<String> contentReference = Optional.empty();
    private Optional<String> isModifierReason = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<ElementDefinition.Example> example = Collections.emptyList();
    private Collection<ElementDefinition.Mapping> mapping = Collections.emptyList();
    private Collection<ElementDefinition.Type> _type = Collections.emptyList();
    private Optional<String> meaningWhenMissing = Optional.empty();
    private Optional<Boolean> sliceIsConstraining = Optional.empty();
    private Optional<ElementDefinition.Binding> binding = Optional.empty();
    private Collection<ElementDefinition.Constraint> constraint = Collections.emptyList();
    private Optional<ElementDefinition.Slicing> slicing = Optional.empty();

    /**
     * Required fields for {@link ElementDefinition}
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
    public ElementDefinitionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param min - The minimum number of times this element SHALL appear in the instance. */
    public ElementDefinitionBuilder.Impl withMin(@NonNull Integer min) {
      this.min = Optional.of(min);
      return this;
    }
    /**
     * @param max - The maximum number of times this element is permitted to appear in the instance.
     */
    public ElementDefinitionBuilder.Impl withMax(@NonNull String max) {
      this.max = Optional.of(max);
      return this;
    }
    /**
     * @param code - A code that has the same meaning as the element in a particular terminology.
     */
    public ElementDefinitionBuilder.Impl withCode(@NonNull Coding... code) {
      this.code = Arrays.asList(code);
      return this;
    }
    /**
     * @param code - A code that has the same meaning as the element in a particular terminology.
     */
    public ElementDefinitionBuilder.Impl withCode(@NonNull Collection<Coding> code) {
      this.code = Collections.unmodifiableCollection(code);
      return this;
    }

    public ElementDefinitionBuilder.Impl withCode(@NonNull CodingBuilder... code) {
      this.code = Arrays.stream(code).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param label - A single preferred label which is the text to display beside the element
     *     indicating its meaning or to use to prompt for the element in a user display or form.
     */
    public ElementDefinitionBuilder.Impl withLabel(@NonNull String label) {
      this.label = Optional.of(label);
      return this;
    }
    /**
     * @param _short - A concise description of what this element means (e.g. for use in
     *     autogenerated summaries).
     */
    public ElementDefinitionBuilder.Impl withShort(@NonNull String _short) {
      this._short = Optional.of(_short);
      return this;
    }
    /** @param alias - Identifies additional names by which this element might also be known. */
    public ElementDefinitionBuilder.Impl withAlias(@NonNull String... alias) {
      this.alias = Arrays.asList(alias);
      return this;
    }
    /** @param alias - Identifies additional names by which this element might also be known. */
    public ElementDefinitionBuilder.Impl withAlias(@NonNull Collection<String> alias) {
      this.alias = Collections.unmodifiableCollection(alias);
      return this;
    }
    /**
     * @param comment - Explanatory notes and implementation guidance about the data element,
     *     including notes about how to use the data properly, exceptions to proper use, etc. (Note:
     *     The text you are reading is specified in ElementDefinition.comment).
     */
    public ElementDefinitionBuilder.Impl withComment(@NonNull String comment) {
      this.comment = Optional.of(comment);
      return this;
    }
    /**
     * @param fixed - Specifies a value that SHALL be exactly the value for this element in the
     *     instance. For purposes of comparison, non-significant whitespace is ignored, and all
     *     values must be an exact match (case and accent sensitive). Missing elements/attributes
     *     must also be missing. Field is a 'choice' field. Type should be one of Address, Age,
     *     Annotation, Attachment, byte[], BigDecimal, Boolean, String, CodeableConcept, Coding,
     *     ContactDetail, ContactPoint, Contributor, Count, DataRequirement, Distance, Dosage,
     *     Duration, Expression, FHIRDate, FHIRDateTime, HumanName, Identifier, Integer, LocalTime,
     *     Meta, Money, ParameterDefinition, Period, Quantity, Range, Ratio, Reference,
     *     RelatedArtifact, SampledData, Signature, Timing, TriggerDefinition, UUID, UsageContext,
     *     ZonedDateTime. To pass the value in, wrap with one of the ElementDefinitionBuilder.fixed
     *     static methods
     */
    public ElementDefinitionBuilder.Impl withFixed(@NonNull Choice_1349125893 fixed) {
      this.fixed = Optional.of(fixed);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public ElementDefinitionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ElementDefinitionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ElementDefinitionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param sliceName - The name of this element definition slice, when slicing is working. The
     *     name must be a token with no dots or spaces. This is a unique name referring to a
     *     specific set of constraints applied to this element, used to provide a name to different
     *     slices of the same element.
     */
    public ElementDefinitionBuilder.Impl withSliceName(@NonNull String sliceName) {
      this.sliceName = Optional.of(sliceName);
      return this;
    }
    /**
     * @param maxLength - Indicates the maximum length in characters that is permitted to be present
     *     in conformant instances and which is expected to be supported by conformant consumers
     *     that support the element.
     */
    public ElementDefinitionBuilder.Impl withMaxLength(@NonNull Integer maxLength) {
      this.maxLength = Optional.of(maxLength);
      return this;
    }
    /**
     * @param condition - A reference to an invariant that may make additional statements about the
     *     cardinality or value in the instance.
     */
    public ElementDefinitionBuilder.Impl withCondition(@NonNull String... condition) {
      this.condition = Arrays.asList(condition);
      return this;
    }
    /**
     * @param condition - A reference to an invariant that may make additional statements about the
     *     cardinality or value in the instance.
     */
    public ElementDefinitionBuilder.Impl withCondition(@NonNull Collection<String> condition) {
      this.condition = Collections.unmodifiableCollection(condition);
      return this;
    }
    /**
     * @param isSummary - Whether the element should be included if a client requests a search with
     *     the parameter _summary=true.
     */
    public ElementDefinitionBuilder.Impl withIsSummary(@NonNull Boolean isSummary) {
      this.isSummary = Optional.of(isSummary);
      return this;
    }
    /**
     * @param definition - Provides a complete explanation of the meaning of the data element for
     *     human readability. For the case of elements derived from existing elements (e.g.
     *     constraints), the definition SHALL be consistent with the base definition, but convey the
     *     meaning of the element in the particular context of use of the resource. (Note: The text
     *     you are reading is specified in ElementDefinition.definition).
     */
    public ElementDefinitionBuilder.Impl withDefinition(@NonNull String definition) {
      this.definition = Optional.of(definition);
      return this;
    }
    /**
     * @param pattern - Specifies a value that the value in the instance SHALL follow - that is, any
     *     value in the pattern must be found in the instance. Other additional values may be found
     *     too. This is effectively constraint by example.
     *     <p>When pattern[x] is used to constrain a primitive, it means that the value provided in
     *     the pattern[x] must match the instance value exactly.
     *     <p>When pattern[x] is used to constrain an array, it means that each element provided in
     *     the pattern[x] array must (recursively) match at least one element from the instance
     *     array.
     *     <p>When pattern[x] is used to constrain a complex object, it means that each property in
     *     the pattern must be present in the complex object, and its value must recursively match
     *     -- i.e.,
     *     <p>1. If primitive: it must match exactly the pattern value 2. If a complex object: it
     *     must match (recursively) the pattern value 3. If an array: it must match (recursively)
     *     the pattern value. Field is a 'choice' field. Type should be one of Address, Age,
     *     Annotation, Attachment, byte[], BigDecimal, Boolean, String, CodeableConcept, Coding,
     *     ContactDetail, ContactPoint, Contributor, Count, DataRequirement, Distance, Dosage,
     *     Duration, Expression, FHIRDate, FHIRDateTime, HumanName, Identifier, Integer, LocalTime,
     *     Meta, Money, ParameterDefinition, Period, Quantity, Range, Ratio, Reference,
     *     RelatedArtifact, SampledData, Signature, Timing, TriggerDefinition, UUID, UsageContext,
     *     ZonedDateTime. To pass the value in, wrap with one of the
     *     ElementDefinitionBuilder.pattern static methods
     */
    public ElementDefinitionBuilder.Impl withPattern(@NonNull Choice_1349125893 pattern) {
      this.pattern = Optional.of(pattern);
      return this;
    }
    /**
     * @param isModifier - If true, the value of this element affects the interpretation of the
     *     element or resource that contains it, and the value of the element cannot be ignored.
     *     Typically, this is used for status, negation and qualification codes. The effect of this
     *     is that the element cannot be ignored by systems: they SHALL either recognize the element
     *     and process it, and/or a pre-determination has been made that it is not relevant to their
     *     particular system.
     */
    public ElementDefinitionBuilder.Impl withIsModifier(@NonNull Boolean isModifier) {
      this.isModifier = Optional.of(isModifier);
      return this;
    }
    /**
     * @param minValue - The minimum allowed value for the element. The value is inclusive. This is
     *     allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     *     Field is a 'choice' field. Type should be one of BigDecimal, FHIRDate, FHIRDateTime,
     *     Integer, LocalTime, Quantity, ZonedDateTime. To pass the value in, wrap with one of the
     *     ElementDefinitionBuilder.minValue static methods
     */
    public ElementDefinitionBuilder.Impl withMinValue(@NonNull Choice_0637176084 minValue) {
      this.minValue = Optional.of(minValue);
      return this;
    }
    /**
     * @param maxValue - The maximum allowed value for the element. The value is inclusive. This is
     *     allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     *     Field is a 'choice' field. Type should be one of BigDecimal, FHIRDate, FHIRDateTime,
     *     Integer, LocalTime, Quantity, ZonedDateTime. To pass the value in, wrap with one of the
     *     ElementDefinitionBuilder.maxValue static methods
     */
    public ElementDefinitionBuilder.Impl withMaxValue(@NonNull Choice_0637176084 maxValue) {
      this.maxValue = Optional.of(maxValue);
      return this;
    }
    /**
     * @param mustSupport - If true, implementations that produce or consume resources SHALL provide
     *     "support" for the element in some meaningful way. If false, the element may be ignored
     *     and not supported. If false, whether to populate or use the data element in any way is at
     *     the discretion of the implementation.
     */
    public ElementDefinitionBuilder.Impl withMustSupport(@NonNull Boolean mustSupport) {
      this.mustSupport = Optional.of(mustSupport);
      return this;
    }
    /**
     * @param requirements - This element is for traceability of why the element was created and why
     *     the constraints exist as they do. This may be used to point to source materials or
     *     specifications that drove the structure of this element.
     */
    public ElementDefinitionBuilder.Impl withRequirements(@NonNull String requirements) {
      this.requirements = Optional.of(requirements);
      return this;
    }
    /**
     * @param orderMeaning - If present, indicates that the order of the repeating element has
     *     meaning and describes what that meaning is. If absent, it means that the order of the
     *     element has no meaning.
     */
    public ElementDefinitionBuilder.Impl withOrderMeaning(@NonNull String orderMeaning) {
      this.orderMeaning = Optional.of(orderMeaning);
      return this;
    }
    /**
     * @param representation - Codes that define how this element is represented in instances, when
     *     the deviation varies from the normal case.
     */
    public ElementDefinitionBuilder.Impl withRepresentation(
        @NonNull PROPERTY_REPRESENTATION... representation) {
      this.representation = Arrays.asList(representation);
      return this;
    }
    /**
     * @param representation - Codes that define how this element is represented in instances, when
     *     the deviation varies from the normal case.
     */
    public ElementDefinitionBuilder.Impl withRepresentation(
        @NonNull Collection<PROPERTY_REPRESENTATION> representation) {
      this.representation = Collections.unmodifiableCollection(representation);
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
    public ElementDefinitionBuilder.Impl withBase(@NonNull ElementDefinition.Base base) {
      this.base = Optional.of(base);
      return this;
    }

    public ElementDefinitionBuilder.Impl withBase(@NonNull ElementDefinition_BaseBuilder base) {
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
     *     of the ElementDefinitionBuilder.defaultValue static methods
     */
    public ElementDefinitionBuilder.Impl withDefaultValue(@NonNull Choice_1349125893 defaultValue) {
      this.defaultValue = Optional.of(defaultValue);
      return this;
    }
    /**
     * @param contentReference - Identifies an element defined elsewhere in the definition whose
     *     content rules should be applied to the current element. ContentReferences bring across
     *     all the rules that are in the ElementDefinition for the element, including definitions,
     *     cardinality constraints, bindings, invariants etc.
     */
    public ElementDefinitionBuilder.Impl withContentReference(@NonNull String contentReference) {
      this.contentReference = Optional.of(contentReference);
      return this;
    }
    /**
     * @param isModifierReason - Explains how that element affects the interpretation of the
     *     resource or element that contains it.
     */
    public ElementDefinitionBuilder.Impl withIsModifierReason(@NonNull String isModifierReason) {
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
    public ElementDefinitionBuilder.Impl withModifierExtension(
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
    public ElementDefinitionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ElementDefinitionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param example - A sample value for this element demonstrating the type of information that
     *     would typically be found in the element.
     */
    public ElementDefinitionBuilder.Impl withExample(
        @NonNull ElementDefinition.Example... example) {
      this.example = Arrays.asList(example);
      return this;
    }
    /**
     * @param example - A sample value for this element demonstrating the type of information that
     *     would typically be found in the element.
     */
    public ElementDefinitionBuilder.Impl withExample(
        @NonNull Collection<ElementDefinition.Example> example) {
      this.example = Collections.unmodifiableCollection(example);
      return this;
    }

    public ElementDefinitionBuilder.Impl withExample(
        @NonNull ElementDefinition_ExampleBuilder... example) {
      this.example = Arrays.stream(example).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param mapping - Identifies a concept from an external specification that roughly corresponds
     *     to this element.
     */
    public ElementDefinitionBuilder.Impl withMapping(
        @NonNull ElementDefinition.Mapping... mapping) {
      this.mapping = Arrays.asList(mapping);
      return this;
    }
    /**
     * @param mapping - Identifies a concept from an external specification that roughly corresponds
     *     to this element.
     */
    public ElementDefinitionBuilder.Impl withMapping(
        @NonNull Collection<ElementDefinition.Mapping> mapping) {
      this.mapping = Collections.unmodifiableCollection(mapping);
      return this;
    }

    public ElementDefinitionBuilder.Impl withMapping(
        @NonNull ElementDefinition_MappingBuilder... mapping) {
      this.mapping = Arrays.stream(mapping).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param _type - The data type or resource that the value of this element is permitted to be.
     */
    public ElementDefinitionBuilder.Impl withType(@NonNull ElementDefinition.Type... _type) {
      this._type = Arrays.asList(_type);
      return this;
    }
    /**
     * @param _type - The data type or resource that the value of this element is permitted to be.
     */
    public ElementDefinitionBuilder.Impl withType(
        @NonNull Collection<ElementDefinition.Type> _type) {
      this._type = Collections.unmodifiableCollection(_type);
      return this;
    }

    public ElementDefinitionBuilder.Impl withType(@NonNull ElementDefinition_TypeBuilder... _type) {
      this._type = Arrays.stream(_type).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param meaningWhenMissing - The Implicit meaning that is to be understood when this element
     *     is missing (e.g. 'when this element is missing, the period is ongoing').
     */
    public ElementDefinitionBuilder.Impl withMeaningWhenMissing(
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
    public ElementDefinitionBuilder.Impl withSliceIsConstraining(
        @NonNull Boolean sliceIsConstraining) {
      this.sliceIsConstraining = Optional.of(sliceIsConstraining);
      return this;
    }
    /**
     * @param binding - Binds to a value set if this element is coded (code, Coding,
     *     CodeableConcept, Quantity), or the data types (string, uri).
     */
    public ElementDefinitionBuilder.Impl withBinding(@NonNull ElementDefinition.Binding binding) {
      this.binding = Optional.of(binding);
      return this;
    }

    public ElementDefinitionBuilder.Impl withBinding(
        @NonNull ElementDefinition_BindingBuilder binding) {
      this.binding = Optional.of(binding.build());
      return this;
    }
    /**
     * @param constraint - Formal constraints such as co-occurrence and other constraints that can
     *     be computationally evaluated within the context of the instance.
     */
    public ElementDefinitionBuilder.Impl withConstraint(
        @NonNull ElementDefinition.Constraint... constraint) {
      this.constraint = Arrays.asList(constraint);
      return this;
    }
    /**
     * @param constraint - Formal constraints such as co-occurrence and other constraints that can
     *     be computationally evaluated within the context of the instance.
     */
    public ElementDefinitionBuilder.Impl withConstraint(
        @NonNull Collection<ElementDefinition.Constraint> constraint) {
      this.constraint = Collections.unmodifiableCollection(constraint);
      return this;
    }

    public ElementDefinitionBuilder.Impl withConstraint(
        @NonNull ElementDefinition_ConstraintBuilder... constraint) {
      this.constraint = Arrays.stream(constraint).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param slicing - Indicates that the element is sliced into a set of alternative definitions
     *     (i.e. in a structure definition, there are multiple different constraints on a single
     *     element in the base resource). Slicing can be used in any resource that has cardinality
     *     ..* on the base resource, or any resource with a choice of types. The set of slices is
     *     any elements that come after this in the element sequence that have the same path, until
     *     a shorter path occurs (the shorter path terminates the set).
     */
    public ElementDefinitionBuilder.Impl withSlicing(@NonNull ElementDefinition.Slicing slicing) {
      this.slicing = Optional.of(slicing);
      return this;
    }

    public ElementDefinitionBuilder.Impl withSlicing(
        @NonNull ElementDefinition_SlicingBuilder slicing) {
      this.slicing = Optional.of(slicing.build());
      return this;
    }

    public ElementDefinition build() {
      return new ElementDefinition(
          OptionConverters.toScala(id),
          OptionConverters.toScala(min.map(x -> (Object) x)),
          OptionConverters.toScala(max),
          path,
          code.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(label),
          OptionConverters.toScala(_short),
          alias.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(comment),
          (Option) OptionConverters.toScala(fixed),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(sliceName),
          OptionConverters.toScala(maxLength.map(x -> (Object) x)),
          condition.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(isSummary.map(x -> (Object) x)),
          OptionConverters.toScala(definition),
          (Option) OptionConverters.toScala(pattern),
          OptionConverters.toScala(isModifier.map(x -> (Object) x)),
          (Option) OptionConverters.toScala(minValue),
          (Option) OptionConverters.toScala(maxValue),
          OptionConverters.toScala(mustSupport.map(x -> (Object) x)),
          OptionConverters.toScala(requirements),
          OptionConverters.toScala(orderMeaning),
          representation.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(base),
          (Option) OptionConverters.toScala(defaultValue),
          OptionConverters.toScala(contentReference),
          OptionConverters.toScala(isModifierReason),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          example.stream().collect(new LitSeqJCollector<>()),
          mapping.stream().collect(new LitSeqJCollector<>()),
          _type.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(meaningWhenMissing),
          OptionConverters.toScala(sliceIsConstraining.map(x -> (Object) x)),
          OptionConverters.toScala(binding),
          constraint.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(slicing),
          LitUtils.emptyMetaElMap());
    }
  }
}
