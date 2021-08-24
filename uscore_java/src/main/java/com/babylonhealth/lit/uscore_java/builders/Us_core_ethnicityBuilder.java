package com.babylonhealth.lit.uscore_java.builders;

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
import com.babylonhealth.lit.uscore.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.uscore_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.uscore_java.model.Unions.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface Us_core_ethnicityBuilder extends ExtensionBuilder {
  public Us_core_ethnicity build();

  public static Impl init(Collection<Extension> extension) {
    return new Impl(extension);
  }

  public static Impl builder(Collection<ExtensionBuilder> extension) {
    return new Impl(new LitSeq<>(extension).map(ExtensionBuilder::build));
  }

  public static Choice_1666105572 value(Address a) {
    return new Choice_1666105572(a);
  }

  public static Choice_1666105572 value(Age a) {
    return new Choice_1666105572(a);
  }

  public static Choice_1666105572 value(Annotation a) {
    return new Choice_1666105572(a);
  }

  public static Choice_1666105572 value(Attachment a) {
    return new Choice_1666105572(a);
  }

  public static Choice_1666105572 value(byte[] b) {
    return new Choice_1666105572(b);
  }

  public static Choice_1666105572 value(BigDecimal b) {
    return new Choice_1666105572(b);
  }

  public static Choice_1666105572 value(Boolean b) {
    return new Choice_1666105572(b);
  }

  public static Choice_1666105572 value(CodeableConcept c) {
    return new Choice_1666105572(c);
  }

  public static Choice_1666105572 value(Coding c) {
    return new Choice_1666105572(c);
  }

  public static Choice_1666105572 value(ContactDetail c) {
    return new Choice_1666105572(c);
  }

  public static Choice_1666105572 value(ContactPoint c) {
    return new Choice_1666105572(c);
  }

  public static Choice_1666105572 value(Contributor c) {
    return new Choice_1666105572(c);
  }

  public static Choice_1666105572 value(Count c) {
    return new Choice_1666105572(c);
  }

  public static Choice_1666105572 value(DataRequirement d) {
    return new Choice_1666105572(d);
  }

  public static Choice_1666105572 value(Distance d) {
    return new Choice_1666105572(d);
  }

  public static Choice_1666105572 value(Dosage d) {
    return new Choice_1666105572(d);
  }

  public static Choice_1666105572 value(Duration d) {
    return new Choice_1666105572(d);
  }

  public static Choice_1666105572 value(Expression e) {
    return new Choice_1666105572(e);
  }

  public static Choice_1666105572 value(FHIRDate f) {
    return new Choice_1666105572(f);
  }

  public static Choice_1666105572 value(FHIRDateTime f) {
    return new Choice_1666105572(f);
  }

  public static Choice_1666105572 value(HumanName h) {
    return new Choice_1666105572(h);
  }

  public static Choice_1666105572 value(Identifier i) {
    return new Choice_1666105572(i);
  }

  public static Choice_1666105572 value(LocalTime l) {
    return new Choice_1666105572(l);
  }

  public static Choice_1666105572 value(Meta m) {
    return new Choice_1666105572(m);
  }

  public static Choice_1666105572 value(Money m) {
    return new Choice_1666105572(m);
  }

  public static Choice_1666105572 value(ParameterDefinition p) {
    return new Choice_1666105572(p);
  }

  public static Choice_1666105572 value(Period p) {
    return new Choice_1666105572(p);
  }

  public static Choice_1666105572 value(Quantity q) {
    return new Choice_1666105572(q);
  }

  public static Choice_1666105572 value(Range r) {
    return new Choice_1666105572(r);
  }

  public static Choice_1666105572 value(Ratio r) {
    return new Choice_1666105572(r);
  }

  public static Choice_1666105572 value(Reference r) {
    return new Choice_1666105572(r);
  }

  public static Choice_1666105572 value(RelatedArtifact r) {
    return new Choice_1666105572(r);
  }

  public static Choice_1666105572 value(SampledData s) {
    return new Choice_1666105572(s);
  }

  public static Choice_1666105572 value(Signature s) {
    return new Choice_1666105572(s);
  }

  public static Choice_1666105572 value(Timing t) {
    return new Choice_1666105572(t);
  }

  public static Choice_1666105572 value(TriggerDefinition t) {
    return new Choice_1666105572(t);
  }

  public static Choice_1666105572 value(UUID u) {
    return new Choice_1666105572(u);
  }

  public static Choice_1666105572 value(UsageContext u) {
    return new Choice_1666105572(u);
  }

  public static Choice_1666105572 value(ZonedDateTime z) {
    return new Choice_1666105572(z);
  }

  public static Choice_1666105572 valueCanonical(String s) {
    return Choice_1666105572.Choice_1666105572Canonical(s);
  }

  public static Choice_1666105572 valueCode(String s) {
    return Choice_1666105572.Choice_1666105572Code(s);
  }

  public static Choice_1666105572 valueId(String s) {
    return Choice_1666105572.Choice_1666105572Id(s);
  }

  public static Choice_1666105572 valueInteger(Integer i) {
    return Choice_1666105572.Choice_1666105572Int(i);
  }

  public static Choice_1666105572 valueMarkdown(String s) {
    return Choice_1666105572.Choice_1666105572Markdown(s);
  }

  public static Choice_1666105572 valueOid(String s) {
    return Choice_1666105572.Choice_1666105572OID(s);
  }

  public static Choice_1666105572 valuePositiveInt(Integer i) {
    return Choice_1666105572.Choice_1666105572PositiveInt(i);
  }

  public static Choice_1666105572 valueString(String s) {
    return Choice_1666105572.Choice_1666105572String(s);
  }

  public static Choice_1666105572 valueUnsignedInt(Integer i) {
    return Choice_1666105572.Choice_1666105572UnsignedInt(i);
  }

  public static Choice_1666105572 valueUri(String s) {
    return Choice_1666105572.Choice_1666105572UriStr(s);
  }

  public static Choice_1666105572 valueUrl(String s) {
    return Choice_1666105572.Choice_1666105572UrlStr(s);
  }

  public class Impl implements Us_core_ethnicityBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension;

    /**
     * Required fields for {@link Us_core_ethnicity}
     *
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public Impl(Collection<Extension> extension) {
      this.extension = extension;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Us_core_ethnicityBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Us_core_ethnicity build() {
      return new Us_core_ethnicity(
          OptionConverters.toScala(id),
          extension.stream().collect(new NonEmptyLitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
