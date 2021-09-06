package com.babylonhealth.lit.core_java.builders;

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
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface UsageContextBuilder extends ElementBuilder {
  public UsageContext build();

  public static Impl init(Coding code, @NonNull ChoiceUsageContext_Value value) {
    return new Impl(code, value);
  }

  public static Impl builder(CodingBuilder code, @NonNull ChoiceUsageContext_Value value) {
    return new Impl(code.build(), value);
  }

  public static ChoiceUsageContext_Value value(CodeableConcept c) {
    return new ChoiceUsageContext_Value(c);
  }

  public static ChoiceUsageContext_Value value(Quantity q) {
    return new ChoiceUsageContext_Value(q);
  }

  public static ChoiceUsageContext_Value value(Range r) {
    return new ChoiceUsageContext_Value(r);
  }

  public static ChoiceUsageContext_Value value(Reference r) {
    return new ChoiceUsageContext_Value(r);
  }

  public class Impl implements UsageContextBuilder {
    private Optional<String> id = Optional.empty();
    private Coding code;
    private ChoiceUsageContext_Value value;
    private Collection<Extension> extension = Collections.emptyList();

    /**
     * Required fields for {@link UsageContext}
     *
     * @param code - A code that identifies the type of context being specified by this usage
     *     context.
     * @param value - A value that defines the context specified in this context of use. The
     *     interpretation of the value is defined by the code. Field is a 'choice' field. Type
     *     should be one of CodeableConcept, Quantity, Range, Reference. To pass the value in, wrap
     *     with one of the UsageContextBuilder.value static methods
     */
    public Impl(Coding code, @NonNull ChoiceUsageContext_Value value) {
      this.code = code;
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public UsageContextBuilder.Impl withId(@NonNull String id) {
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
    public UsageContextBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public UsageContextBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public UsageContextBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }

    public UsageContext build() {
      return new UsageContext(
          OptionConverters.toScala(id),
          code,
          value,
          extension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
