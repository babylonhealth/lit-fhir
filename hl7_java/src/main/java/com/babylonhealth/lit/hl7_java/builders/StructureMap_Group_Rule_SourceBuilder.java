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
import com.babylonhealth.lit.hl7.MAP_SOURCE_LIST_MODE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class StructureMap_Group_Rule_SourceBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Integer> min = Optional.empty();
  private Optional<String> max = Optional.empty();
  private Optional<String> _type = Optional.empty();
  private Optional<String> check = Optional.empty();
  private String context;
  private Optional<String> element = Optional.empty();
  private Optional<MAP_SOURCE_LIST_MODE> listMode = Optional.empty();
  private Optional<String> variable = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> condition = Optional.empty();
  private Optional<String> logMessage = Optional.empty();
  private Optional<Choice_1349125893> defaultValue = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /**
   * Required fields for {@link StructureMap$Group$Rule$Source}
   *
   * @param context
   */
  public StructureMap_Group_Rule_SourceBuilder(String context) {
    this.context = context;
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

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public StructureMap_Group_Rule_SourceBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param min */
  public StructureMap_Group_Rule_SourceBuilder withMin(@NonNull Integer min) {
    this.min = Optional.of(min);
    return this;
  }
  /** @param max */
  public StructureMap_Group_Rule_SourceBuilder withMax(@NonNull String max) {
    this.max = Optional.of(max);
    return this;
  }
  /** @param _type */
  public StructureMap_Group_Rule_SourceBuilder withType(@NonNull String _type) {
    this._type = Optional.of(_type);
    return this;
  }
  /** @param check */
  public StructureMap_Group_Rule_SourceBuilder withCheck(@NonNull String check) {
    this.check = Optional.of(check);
    return this;
  }
  /** @param element */
  public StructureMap_Group_Rule_SourceBuilder withElement(@NonNull String element) {
    this.element = Optional.of(element);
    return this;
  }
  /** @param listMode */
  public StructureMap_Group_Rule_SourceBuilder withListMode(
      @NonNull MAP_SOURCE_LIST_MODE listMode) {
    this.listMode = Optional.of(listMode);
    return this;
  }
  /** @param variable */
  public StructureMap_Group_Rule_SourceBuilder withVariable(@NonNull String variable) {
    this.variable = Optional.of(variable);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public StructureMap_Group_Rule_SourceBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public StructureMap_Group_Rule_SourceBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param condition */
  public StructureMap_Group_Rule_SourceBuilder withCondition(@NonNull String condition) {
    this.condition = Optional.of(condition);
    return this;
  }
  /** @param logMessage */
  public StructureMap_Group_Rule_SourceBuilder withLogMessage(@NonNull String logMessage) {
    this.logMessage = Optional.of(logMessage);
    return this;
  }
  /**
   * @param defaultValue Field is a 'choice' field. Type should be one of Address, Age, Annotation,
   *     Attachment, byte[], BigDecimal, Boolean, String, CodeableConcept, Coding, ContactDetail,
   *     ContactPoint, Contributor, Count, DataRequirement, Distance, Dosage, Duration, Expression,
   *     FHIRDate, FHIRDateTime, HumanName, Identifier, Integer, LocalTime, Meta, Money,
   *     ParameterDefinition, Period, Quantity, Range, Ratio, Reference, RelatedArtifact,
   *     SampledData, Signature, Timing, TriggerDefinition, UUID, UsageContext, ZonedDateTime. To
   *     pass the value in, wrap with one of the StructureMap_Group_Rule_SourceBuilder.defaultValue
   *     static methods
   */
  public StructureMap_Group_Rule_SourceBuilder withDefaultValue(
      @NonNull Choice_1349125893 defaultValue) {
    this.defaultValue = Optional.of(defaultValue);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public StructureMap_Group_Rule_SourceBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public StructureMap_Group_Rule_SourceBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public StructureMap$Group$Rule$Source build() {
    return new StructureMap$Group$Rule$Source(
        OptionConverters.toScala(id),
        OptionConverters.toScala(min.map(x -> (Object) x)),
        OptionConverters.toScala(max),
        OptionConverters.toScala(_type),
        OptionConverters.toScala(check),
        context,
        OptionConverters.toScala(element),
        OptionConverters.toScala(listMode),
        OptionConverters.toScala(variable),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(condition),
        OptionConverters.toScala(logMessage),
        (Option) OptionConverters.toScala(defaultValue),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
