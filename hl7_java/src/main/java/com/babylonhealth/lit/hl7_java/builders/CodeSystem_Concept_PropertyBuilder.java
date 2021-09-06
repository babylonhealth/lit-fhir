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

public interface CodeSystem_Concept_PropertyBuilder {
  public CodeSystem$Concept$Property build();

  public static Impl init(String code, @NonNull ChoiceProperty_Value value) {
    return new Impl(code, value);
  }

  public static Impl builder(String code, @NonNull ChoiceProperty_Value value) {
    return new Impl(code, value);
  }

  public static ChoiceProperty_Value value(BigDecimal b) {
    return new ChoiceProperty_Value(b);
  }

  public static ChoiceProperty_Value value(Boolean b) {
    return new ChoiceProperty_Value(b);
  }

  public static ChoiceProperty_Value value(Coding c) {
    return new ChoiceProperty_Value(c);
  }

  public static ChoiceProperty_Value value(FHIRDateTime f) {
    return new ChoiceProperty_Value(f);
  }

  public static ChoiceProperty_Value value(Integer i) {
    return new ChoiceProperty_Value(i);
  }

  public static ChoiceProperty_Value valueCode(String s) {
    return ChoiceProperty_Value.ChoiceProperty_ValueCode(s);
  }

  public static ChoiceProperty_Value valueString(String s) {
    return ChoiceProperty_Value.ChoiceProperty_ValueString(s);
  }

  public class Impl implements CodeSystem_Concept_PropertyBuilder {
    private Optional<String> id = Optional.empty();
    private String code;
    private ChoiceProperty_Value value;
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link CodeSystem$Concept$Property}
     *
     * @param code
     * @param value Field is a 'choice' field. Type should be one of BigDecimal, Boolean, String,
     *     Coding, FHIRDateTime, Integer. To pass the value in, wrap with one of the
     *     CodeSystem_Concept_PropertyBuilder.value static methods
     */
    public Impl(String code, @NonNull ChoiceProperty_Value value) {
      this.code = code;
      this.value = value;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public CodeSystem_Concept_PropertyBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public CodeSystem_Concept_PropertyBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public CodeSystem_Concept_PropertyBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public CodeSystem_Concept_PropertyBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
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
    public CodeSystem_Concept_PropertyBuilder.Impl withModifierExtension(
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
    public CodeSystem_Concept_PropertyBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public CodeSystem_Concept_PropertyBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public CodeSystem$Concept$Property build() {
      return new CodeSystem$Concept$Property(
          OptionConverters.toScala(id),
          code,
          (Choice) value,
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
