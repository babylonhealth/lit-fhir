package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.Option;
import scala.jdk.javaapi.OptionConverters;
import scala.math.BigDecimal;

public interface ValueSet_Expansion_ParameterBuilder {
  public ValueSet$Expansion$Parameter build();

  public static Impl init(String name) {
    return new Impl(name);
  }

  public static Impl builder(String name) {
    return new Impl(name);
  }

  public static Choice01475253842 value(BigDecimal b) {
    return new Choice01475253842(b);
  }

  public static Choice01475253842 value(Boolean b) {
    return new Choice01475253842(b);
  }

  public static Choice01475253842 value(FHIRDateTime f) {
    return new Choice01475253842(f);
  }

  public static Choice01475253842 value(Integer i) {
    return new Choice01475253842(i);
  }

  public static Choice01475253842 valueCode(String s) {
    return Choice01475253842.Choice01475253842Code(s);
  }

  public static Choice01475253842 valueString(String s) {
    return Choice01475253842.Choice01475253842String(s);
  }

  public static Choice01475253842 valueUri(String s) {
    return Choice01475253842.Choice01475253842UriStr(s);
  }

  public class Impl implements ValueSet_Expansion_ParameterBuilder {
    private Optional<String> id = Optional.empty();
    private String name;
    private Optional<Choice01475253842> value = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link ValueSet$Expansion$Parameter}
     *
     * @param name - A natural language name identifying the value set. This name should be usable
     *     as an identifier for the module by machine processing applications such as code
     *     generation.
     */
    public Impl(String name) {
      this.name = name;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ValueSet_Expansion_ParameterBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param value Field is a 'choice' field. Type should be one of BigDecimal, Boolean, String,
     *     FHIRDateTime, Integer. To pass the value in, wrap with one of the
     *     ValueSet_Expansion_ParameterBuilder.value static methods
     */
    public ValueSet_Expansion_ParameterBuilder.Impl withValue(@NonNull Choice01475253842 value) {
      this.value = Optional.of(value);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ValueSet_Expansion_ParameterBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ValueSet_Expansion_ParameterBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ValueSet_Expansion_ParameterBuilder.Impl withExtension(
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
    public ValueSet_Expansion_ParameterBuilder.Impl withModifierExtension(
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
    public ValueSet_Expansion_ParameterBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ValueSet_Expansion_ParameterBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public ValueSet$Expansion$Parameter build() {
      return new ValueSet$Expansion$Parameter(
          OptionConverters.toScala(id),
          name,
          (Option) OptionConverters.toScala(value),
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
