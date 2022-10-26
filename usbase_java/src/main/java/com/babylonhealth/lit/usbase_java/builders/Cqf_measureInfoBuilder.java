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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface Cqf_measureInfoBuilder extends ExtensionBuilder {
  public Cqf_measureInfo build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceAll value(Address a) {
    return new ChoiceAll(a);
  }

  public static ChoiceAll value(Age a) {
    return new ChoiceAll(a);
  }

  public static ChoiceAll value(Annotation a) {
    return new ChoiceAll(a);
  }

  public static ChoiceAll value(Attachment a) {
    return new ChoiceAll(a);
  }

  public static ChoiceAll value(byte[] b) {
    return new ChoiceAll(b);
  }

  public static ChoiceAll value(BigDecimal b) {
    return new ChoiceAll(b);
  }

  public static ChoiceAll value(Boolean b) {
    return new ChoiceAll(b);
  }

  public static ChoiceAll value(CodeableConcept c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll value(Coding c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll value(ContactDetail c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll value(ContactPoint c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll value(Contributor c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll value(Count c) {
    return new ChoiceAll(c);
  }

  public static ChoiceAll value(DataRequirement d) {
    return new ChoiceAll(d);
  }

  public static ChoiceAll value(Distance d) {
    return new ChoiceAll(d);
  }

  public static ChoiceAll value(Dosage d) {
    return new ChoiceAll(d);
  }

  public static ChoiceAll value(Duration d) {
    return new ChoiceAll(d);
  }

  public static ChoiceAll value(Expression e) {
    return new ChoiceAll(e);
  }

  public static ChoiceAll value(FHIRDate f) {
    return new ChoiceAll(f);
  }

  public static ChoiceAll value(FHIRDateTime f) {
    return new ChoiceAll(f);
  }

  public static ChoiceAll value(HumanName h) {
    return new ChoiceAll(h);
  }

  public static ChoiceAll value(Identifier i) {
    return new ChoiceAll(i);
  }

  public static ChoiceAll value(LocalTime l) {
    return new ChoiceAll(l);
  }

  public static ChoiceAll value(Meta m) {
    return new ChoiceAll(m);
  }

  public static ChoiceAll value(Money m) {
    return new ChoiceAll(m);
  }

  public static ChoiceAll value(ParameterDefinition p) {
    return new ChoiceAll(p);
  }

  public static ChoiceAll value(Period p) {
    return new ChoiceAll(p);
  }

  public static ChoiceAll value(Quantity q) {
    return new ChoiceAll(q);
  }

  public static ChoiceAll value(Range r) {
    return new ChoiceAll(r);
  }

  public static ChoiceAll value(Ratio r) {
    return new ChoiceAll(r);
  }

  public static ChoiceAll value(Reference r) {
    return new ChoiceAll(r);
  }

  public static ChoiceAll value(RelatedArtifact r) {
    return new ChoiceAll(r);
  }

  public static ChoiceAll value(SampledData s) {
    return new ChoiceAll(s);
  }

  public static ChoiceAll value(Signature s) {
    return new ChoiceAll(s);
  }

  public static ChoiceAll value(Timing t) {
    return new ChoiceAll(t);
  }

  public static ChoiceAll value(TriggerDefinition t) {
    return new ChoiceAll(t);
  }

  public static ChoiceAll value(UUID u) {
    return new ChoiceAll(u);
  }

  public static ChoiceAll value(UsageContext u) {
    return new ChoiceAll(u);
  }

  public static ChoiceAll value(ZonedDateTime z) {
    return new ChoiceAll(z);
  }

  public static ChoiceAll valueCanonical(String s) {
    return ChoiceAll.ChoiceAllCanonical(s);
  }

  public static ChoiceAll valueCode(String s) {
    return ChoiceAll.ChoiceAllCode(s);
  }

  public static ChoiceAll valueId(String s) {
    return ChoiceAll.ChoiceAllId(s);
  }

  public static ChoiceAll valueInteger(Integer i) {
    return ChoiceAll.ChoiceAllInt(i);
  }

  public static ChoiceAll valueMarkdown(String s) {
    return ChoiceAll.ChoiceAllMarkdown(s);
  }

  public static ChoiceAll valueOid(String s) {
    return ChoiceAll.ChoiceAllOID(s);
  }

  public static ChoiceAll valuePositiveInt(Integer i) {
    return ChoiceAll.ChoiceAllPositiveInt(i);
  }

  public static ChoiceAll valueString(String s) {
    return ChoiceAll.ChoiceAllString(s);
  }

  public static ChoiceAll valueUnsignedInt(Integer i) {
    return ChoiceAll.ChoiceAllUnsignedInt(i);
  }

  public static ChoiceAll valueUri(String s) {
    return ChoiceAll.ChoiceAllUriStr(s);
  }

  public static ChoiceAll valueUrl(String s) {
    return ChoiceAll.ChoiceAllUrlStr(s);
  }

  public class Impl implements Cqf_measureInfoBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();

    /** Required fields for {@link Cqf_measureInfo} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Cqf_measureInfoBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public Cqf_measureInfoBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Cqf_measureInfoBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Cqf_measureInfoBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Cqf_measureInfo build() {
      return new Cqf_measureInfo(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
