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
import com.babylonhealth.lit.hl7.CONSTRAINT_SEVERITY;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface ElementDefinition_ConstraintBuilder {
  public ElementDefinition.Constraint build();

  public static Impl init(String key, String human, CONSTRAINT_SEVERITY severity) {
    return new Impl(key, human, severity);
  }

  public static Impl builder(String key, String human, CONSTRAINT_SEVERITY severity) {
    return new Impl(key, human, severity);
  }

  public class Impl implements ElementDefinition_ConstraintBuilder {
    private Optional<String> id = Optional.empty();
    private String key;
    private String human;
    private Optional<String> xpath = Optional.empty();
    private Optional<String> source = Optional.empty();
    private CONSTRAINT_SEVERITY severity;
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> expression = Optional.empty();
    private Optional<String> requirements = Optional.empty();

    /**
     * Required fields for {@link ElementDefinition.Constraint}
     *
     * @param key
     * @param human
     * @param severity
     */
    public Impl(String key, String human, CONSTRAINT_SEVERITY severity) {
      this.key = key;
      this.human = human;
      this.severity = severity;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public ElementDefinition_ConstraintBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param xpath */
    public ElementDefinition_ConstraintBuilder.Impl withXpath(@NonNull String xpath) {
      this.xpath = Optional.of(xpath);
      return this;
    }
    /** @param source */
    public ElementDefinition_ConstraintBuilder.Impl withSource(@NonNull String source) {
      this.source = Optional.of(source);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public ElementDefinition_ConstraintBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ElementDefinition_ConstraintBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ElementDefinition_ConstraintBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param expression */
    public ElementDefinition_ConstraintBuilder.Impl withExpression(@NonNull String expression) {
      this.expression = Optional.of(expression);
      return this;
    }
    /**
     * @param requirements - This element is for traceability of why the element was created and why
     *     the constraints exist as they do. This may be used to point to source materials or
     *     specifications that drove the structure of this element.
     */
    public ElementDefinition_ConstraintBuilder.Impl withRequirements(@NonNull String requirements) {
      this.requirements = Optional.of(requirements);
      return this;
    }

    public ElementDefinition.Constraint build() {
      return new ElementDefinition.Constraint(
          OptionConverters.toScala(id),
          key,
          human,
          OptionConverters.toScala(xpath),
          OptionConverters.toScala(source),
          severity,
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(expression),
          OptionConverters.toScala(requirements),
          LitUtils.emptyMetaElMap());
    }
  }
}
