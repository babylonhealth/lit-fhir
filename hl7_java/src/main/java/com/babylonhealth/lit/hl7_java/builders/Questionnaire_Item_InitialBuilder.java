package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.FHIRDate;
import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;
import scala.math.BigDecimal;

public interface Questionnaire_Item_InitialBuilder {
  public Questionnaire$Item$Initial build();

  public static Impl init(@NonNull Choice01113166363 value) {
    return new Impl(value);
  }

  public static Impl builder(@NonNull Choice01113166363 value) {
    return new Impl(value);
  }

  public static Choice01113166363 value(Attachment a) {
    return new Choice01113166363(a);
  }

  public static Choice01113166363 value(BigDecimal b) {
    return new Choice01113166363(b);
  }

  public static Choice01113166363 value(Boolean b) {
    return new Choice01113166363(b);
  }

  public static Choice01113166363 value(Coding c) {
    return new Choice01113166363(c);
  }

  public static Choice01113166363 value(FHIRDate f) {
    return new Choice01113166363(f);
  }

  public static Choice01113166363 value(FHIRDateTime f) {
    return new Choice01113166363(f);
  }

  public static Choice01113166363 value(Integer i) {
    return new Choice01113166363(i);
  }

  public static Choice01113166363 value(LocalTime l) {
    return new Choice01113166363(l);
  }

  public static Choice01113166363 value(Quantity q) {
    return new Choice01113166363(q);
  }

  public static Choice01113166363 value(Reference r) {
    return new Choice01113166363(r);
  }

  public static Choice01113166363 valueString(String s) {
    return Choice01113166363.Choice01113166363String(s);
  }

  public static Choice01113166363 valueUri(String s) {
    return Choice01113166363.Choice01113166363UriStr(s);
  }

  public class Impl implements Questionnaire_Item_InitialBuilder {
    private Optional<String> id = Optional.empty();
    private Choice01113166363 value;
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link Questionnaire$Item$Initial}
     *
     * @param value Field is a 'choice' field. Type should be one of Attachment, BigDecimal,
     *     Boolean, Coding, FHIRDate, FHIRDateTime, Integer, LocalTime, Quantity, Reference, String.
     *     To pass the value in, wrap with one of the Questionnaire_Item_InitialBuilder.value static
     *     methods
     */
    public Impl(@NonNull Choice01113166363 value) {
      this.value = value;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Questionnaire_Item_InitialBuilder.Impl withId(@NonNull String id) {
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
    public Questionnaire_Item_InitialBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Questionnaire_Item_InitialBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Questionnaire_Item_InitialBuilder.Impl withExtension(
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
    public Questionnaire_Item_InitialBuilder.Impl withModifierExtension(
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
    public Questionnaire_Item_InitialBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Questionnaire_Item_InitialBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Questionnaire$Item$Initial build() {
      return new Questionnaire$Item$Initial(
          OptionConverters.toScala(id),
          (Choice) value,
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
