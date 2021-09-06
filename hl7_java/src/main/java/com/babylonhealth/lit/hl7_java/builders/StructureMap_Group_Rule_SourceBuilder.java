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

public interface StructureMap_Group_Rule_SourceBuilder {
  public StructureMap$Group$Rule$Source build();

  public static Impl init(String context) {
    return new Impl(context);
  }

  public static Impl builder(String context) {
    return new Impl(context);
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

  public class Impl implements StructureMap_Group_Rule_SourceBuilder {
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
    private Optional<ChoiceAll> defaultValue = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link StructureMap$Group$Rule$Source}
     *
     * @param context
     */
    public Impl(String context) {
      this.context = context;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public StructureMap_Group_Rule_SourceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param min */
    public StructureMap_Group_Rule_SourceBuilder.Impl withMin(@NonNull Integer min) {
      this.min = Optional.of(min);
      return this;
    }
    /** @param max */
    public StructureMap_Group_Rule_SourceBuilder.Impl withMax(@NonNull String max) {
      this.max = Optional.of(max);
      return this;
    }
    /** @param _type */
    public StructureMap_Group_Rule_SourceBuilder.Impl withType(@NonNull String _type) {
      this._type = Optional.of(_type);
      return this;
    }
    /** @param check */
    public StructureMap_Group_Rule_SourceBuilder.Impl withCheck(@NonNull String check) {
      this.check = Optional.of(check);
      return this;
    }
    /** @param element */
    public StructureMap_Group_Rule_SourceBuilder.Impl withElement(@NonNull String element) {
      this.element = Optional.of(element);
      return this;
    }
    /** @param listMode */
    public StructureMap_Group_Rule_SourceBuilder.Impl withListMode(
        @NonNull MAP_SOURCE_LIST_MODE listMode) {
      this.listMode = Optional.of(listMode);
      return this;
    }
    /** @param variable */
    public StructureMap_Group_Rule_SourceBuilder.Impl withVariable(@NonNull String variable) {
      this.variable = Optional.of(variable);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public StructureMap_Group_Rule_SourceBuilder.Impl withExtension(
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
    public StructureMap_Group_Rule_SourceBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public StructureMap_Group_Rule_SourceBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param condition */
    public StructureMap_Group_Rule_SourceBuilder.Impl withCondition(@NonNull String condition) {
      this.condition = Optional.of(condition);
      return this;
    }
    /** @param logMessage */
    public StructureMap_Group_Rule_SourceBuilder.Impl withLogMessage(@NonNull String logMessage) {
      this.logMessage = Optional.of(logMessage);
      return this;
    }
    /**
     * @param defaultValue Field is a 'choice' field. Type should be one of Address, Age,
     *     Annotation, Attachment, byte[], BigDecimal, Boolean, String, CodeableConcept, Coding,
     *     ContactDetail, ContactPoint, Contributor, Count, DataRequirement, Distance, Dosage,
     *     Duration, Expression, FHIRDate, FHIRDateTime, HumanName, Identifier, Integer, LocalTime,
     *     Meta, Money, ParameterDefinition, Period, Quantity, Range, Ratio, Reference,
     *     RelatedArtifact, SampledData, Signature, Timing, TriggerDefinition, UUID, UsageContext,
     *     ZonedDateTime. To pass the value in, wrap with one of the
     *     StructureMap_Group_Rule_SourceBuilder.defaultValue static methods
     */
    public StructureMap_Group_Rule_SourceBuilder.Impl withDefaultValue(
        @NonNull ChoiceAll defaultValue) {
      this.defaultValue = Optional.of(defaultValue);
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
    public StructureMap_Group_Rule_SourceBuilder.Impl withModifierExtension(
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
    public StructureMap_Group_Rule_SourceBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public StructureMap_Group_Rule_SourceBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
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
}
