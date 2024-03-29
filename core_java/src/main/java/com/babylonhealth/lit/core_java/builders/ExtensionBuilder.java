package com.babylonhealth.lit.core_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDate;
import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.model.Unions.*;
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

public interface ExtensionBuilder extends ElementBuilder {
  public Extension build();

  public static Impl init(String url) {
    return new Impl(url);
  }

  public static Impl builder(String url) {
    return new Impl(url);
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

  public class Impl implements ExtensionBuilder {
    private Optional<String> id = Optional.empty();
    private String url;
    private Optional<ChoiceAll> value = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();

    /**
     * Required fields for {@link Extension}
     *
     * @param url - Source of the definition for the extension code - a logical name or a URL.
     */
    public Impl(String url) {
      this.url = url;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public ExtensionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](extensibility.html) for a list). Field is a 'choice' field. Type should
     *     be one of Address, Age, Annotation, Attachment, byte[], BigDecimal, Boolean, String,
     *     CodeableConcept, Coding, ContactDetail, ContactPoint, Contributor, Count,
     *     DataRequirement, Distance, Dosage, Duration, Expression, FHIRDate, FHIRDateTime,
     *     HumanName, Identifier, Integer, LocalTime, Meta, Money, ParameterDefinition, Period,
     *     Quantity, Range, Ratio, Reference, RelatedArtifact, SampledData, Signature, Timing,
     *     TriggerDefinition, UUID, UsageContext, ZonedDateTime. To pass the value in, wrap with one
     *     of the ExtensionBuilder.value static methods
     */
    public ExtensionBuilder.Impl withValue(@NonNull ChoiceAll value) {
      this.value = Optional.of(value);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public ExtensionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ExtensionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ExtensionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Extension build() {
      return new Extension(
          OptionConverters.toScala(id),
          url,
          (Option) OptionConverters.toScala(value),
          extension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
