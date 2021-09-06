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

public interface Parameters_ParameterBuilder {
  public Parameters.Parameter build();

  public static Impl init(String name) {
    return new Impl(name);
  }

  public static Impl builder(String name) {
    return new Impl(name);
  }

  public static Choice_1349125893 value(Address a) {
    return new Choice_1349125893(a);
  }

  public static Choice_1349125893 value(Age a) {
    return new Choice_1349125893(a);
  }

  public static Choice_1349125893 value(Annotation a) {
    return new Choice_1349125893(a);
  }

  public static Choice_1349125893 value(Attachment a) {
    return new Choice_1349125893(a);
  }

  public static Choice_1349125893 value(byte[] b) {
    return new Choice_1349125893(b);
  }

  public static Choice_1349125893 value(BigDecimal b) {
    return new Choice_1349125893(b);
  }

  public static Choice_1349125893 value(Boolean b) {
    return new Choice_1349125893(b);
  }

  public static Choice_1349125893 value(CodeableConcept c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 value(Coding c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 value(ContactDetail c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 value(ContactPoint c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 value(Contributor c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 value(Count c) {
    return new Choice_1349125893(c);
  }

  public static Choice_1349125893 value(DataRequirement d) {
    return new Choice_1349125893(d);
  }

  public static Choice_1349125893 value(Distance d) {
    return new Choice_1349125893(d);
  }

  public static Choice_1349125893 value(Dosage d) {
    return new Choice_1349125893(d);
  }

  public static Choice_1349125893 value(Duration d) {
    return new Choice_1349125893(d);
  }

  public static Choice_1349125893 value(Expression e) {
    return new Choice_1349125893(e);
  }

  public static Choice_1349125893 value(FHIRDate f) {
    return new Choice_1349125893(f);
  }

  public static Choice_1349125893 value(FHIRDateTime f) {
    return new Choice_1349125893(f);
  }

  public static Choice_1349125893 value(HumanName h) {
    return new Choice_1349125893(h);
  }

  public static Choice_1349125893 value(Identifier i) {
    return new Choice_1349125893(i);
  }

  public static Choice_1349125893 value(LocalTime l) {
    return new Choice_1349125893(l);
  }

  public static Choice_1349125893 value(Meta m) {
    return new Choice_1349125893(m);
  }

  public static Choice_1349125893 value(Money m) {
    return new Choice_1349125893(m);
  }

  public static Choice_1349125893 value(ParameterDefinition p) {
    return new Choice_1349125893(p);
  }

  public static Choice_1349125893 value(Period p) {
    return new Choice_1349125893(p);
  }

  public static Choice_1349125893 value(Quantity q) {
    return new Choice_1349125893(q);
  }

  public static Choice_1349125893 value(Range r) {
    return new Choice_1349125893(r);
  }

  public static Choice_1349125893 value(Ratio r) {
    return new Choice_1349125893(r);
  }

  public static Choice_1349125893 value(Reference r) {
    return new Choice_1349125893(r);
  }

  public static Choice_1349125893 value(RelatedArtifact r) {
    return new Choice_1349125893(r);
  }

  public static Choice_1349125893 value(SampledData s) {
    return new Choice_1349125893(s);
  }

  public static Choice_1349125893 value(Signature s) {
    return new Choice_1349125893(s);
  }

  public static Choice_1349125893 value(Timing t) {
    return new Choice_1349125893(t);
  }

  public static Choice_1349125893 value(TriggerDefinition t) {
    return new Choice_1349125893(t);
  }

  public static Choice_1349125893 value(UUID u) {
    return new Choice_1349125893(u);
  }

  public static Choice_1349125893 value(UsageContext u) {
    return new Choice_1349125893(u);
  }

  public static Choice_1349125893 value(ZonedDateTime z) {
    return new Choice_1349125893(z);
  }

  public static Choice_1349125893 valueCanonical(String s) {
    return Choice_1349125893.Choice_1349125893Canonical(s);
  }

  public static Choice_1349125893 valueCode(String s) {
    return Choice_1349125893.Choice_1349125893Code(s);
  }

  public static Choice_1349125893 valueId(String s) {
    return Choice_1349125893.Choice_1349125893Id(s);
  }

  public static Choice_1349125893 valueInteger(Integer i) {
    return Choice_1349125893.Choice_1349125893Int(i);
  }

  public static Choice_1349125893 valueMarkdown(String s) {
    return Choice_1349125893.Choice_1349125893Markdown(s);
  }

  public static Choice_1349125893 valueOid(String s) {
    return Choice_1349125893.Choice_1349125893OID(s);
  }

  public static Choice_1349125893 valuePositiveInt(Integer i) {
    return Choice_1349125893.Choice_1349125893PositiveInt(i);
  }

  public static Choice_1349125893 valueString(String s) {
    return Choice_1349125893.Choice_1349125893String(s);
  }

  public static Choice_1349125893 valueUnsignedInt(Integer i) {
    return Choice_1349125893.Choice_1349125893UnsignedInt(i);
  }

  public static Choice_1349125893 valueUri(String s) {
    return Choice_1349125893.Choice_1349125893UriStr(s);
  }

  public static Choice_1349125893 valueUrl(String s) {
    return Choice_1349125893.Choice_1349125893UrlStr(s);
  }

  public class Impl implements Parameters_ParameterBuilder {
    private Optional<String> id = Optional.empty();
    private String name;
    private Collection<Parameters.Parameter> part = Collections.emptyList();
    private Optional<Choice_1349125893> value = Optional.empty();
    private Optional<Resource> resource = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link Parameters.Parameter}
     *
     * @param name
     */
    public Impl(String name) {
      this.name = name;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Parameters_ParameterBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param part */
    public Parameters_ParameterBuilder.Impl withPart(@NonNull Parameters.Parameter... part) {
      this.part = Arrays.asList(part);
      return this;
    }
    /** @param part */
    public Parameters_ParameterBuilder.Impl withPart(
        @NonNull Collection<Parameters.Parameter> part) {
      this.part = Collections.unmodifiableCollection(part);
      return this;
    }
    /**
     * @param value Field is a 'choice' field. Type should be one of Address, Age, Annotation,
     *     Attachment, byte[], BigDecimal, Boolean, String, CodeableConcept, Coding, ContactDetail,
     *     ContactPoint, Contributor, Count, DataRequirement, Distance, Dosage, Duration,
     *     Expression, FHIRDate, FHIRDateTime, HumanName, Identifier, Integer, LocalTime, Meta,
     *     Money, ParameterDefinition, Period, Quantity, Range, Ratio, Reference, RelatedArtifact,
     *     SampledData, Signature, Timing, TriggerDefinition, UUID, UsageContext, ZonedDateTime. To
     *     pass the value in, wrap with one of the Parameters_ParameterBuilder.value static methods
     */
    public Parameters_ParameterBuilder.Impl withValue(@NonNull Choice_1349125893 value) {
      this.value = Optional.of(value);
      return this;
    }
    /** @param resource */
    public Parameters_ParameterBuilder.Impl withResource(@NonNull Resource resource) {
      this.resource = Optional.of(resource);
      return this;
    }
    /** @param extension */
    public Parameters_ParameterBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /** @param extension */
    public Parameters_ParameterBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /** @param modifierExtension */
    public Parameters_ParameterBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /** @param modifierExtension */
    public Parameters_ParameterBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Parameters.Parameter build() {
      return new Parameters.Parameter(
          OptionConverters.toScala(id),
          name,
          part.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(value),
          OptionConverters.toScala(resource),
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
