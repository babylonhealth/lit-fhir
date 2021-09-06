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
import com.babylonhealth.lit.hl7.QUESTIONNAIRE_ENABLE_OPERATOR;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface Questionnaire_Item_EnableWhenBuilder {
  public Questionnaire$Item$EnableWhen build();

  public static Impl init(
      String question,
      QUESTIONNAIRE_ENABLE_OPERATOR operator,
      @NonNull ChoiceEnableWhen_Answer answer) {
    return new Impl(question, operator, answer);
  }

  public static Impl builder(
      String question,
      QUESTIONNAIRE_ENABLE_OPERATOR operator,
      @NonNull ChoiceEnableWhen_Answer answer) {
    return new Impl(question, operator, answer);
  }

  public static ChoiceEnableWhen_Answer answer(BigDecimal b) {
    return new ChoiceEnableWhen_Answer(b);
  }

  public static ChoiceEnableWhen_Answer answer(Boolean b) {
    return new ChoiceEnableWhen_Answer(b);
  }

  public static ChoiceEnableWhen_Answer answer(Coding c) {
    return new ChoiceEnableWhen_Answer(c);
  }

  public static ChoiceEnableWhen_Answer answer(FHIRDate f) {
    return new ChoiceEnableWhen_Answer(f);
  }

  public static ChoiceEnableWhen_Answer answer(FHIRDateTime f) {
    return new ChoiceEnableWhen_Answer(f);
  }

  public static ChoiceEnableWhen_Answer answer(Integer i) {
    return new ChoiceEnableWhen_Answer(i);
  }

  public static ChoiceEnableWhen_Answer answer(LocalTime l) {
    return new ChoiceEnableWhen_Answer(l);
  }

  public static ChoiceEnableWhen_Answer answer(Quantity q) {
    return new ChoiceEnableWhen_Answer(q);
  }

  public static ChoiceEnableWhen_Answer answer(Reference r) {
    return new ChoiceEnableWhen_Answer(r);
  }

  public static ChoiceEnableWhen_Answer answer(String s) {
    return new ChoiceEnableWhen_Answer(s);
  }

  public class Impl implements Questionnaire_Item_EnableWhenBuilder {
    private Optional<String> id = Optional.empty();
    private String question;
    private QUESTIONNAIRE_ENABLE_OPERATOR operator;
    private Collection<Extension> extension = Collections.emptyList();
    private ChoiceEnableWhen_Answer answer;
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link Questionnaire$Item$EnableWhen}
     *
     * @param question
     * @param operator
     * @param answer Field is a 'choice' field. Type should be one of BigDecimal, Boolean, Coding,
     *     FHIRDate, FHIRDateTime, Integer, LocalTime, Quantity, Reference, String. To pass the
     *     value in, wrap with one of the Questionnaire_Item_EnableWhenBuilder.answer static methods
     */
    public Impl(
        String question,
        QUESTIONNAIRE_ENABLE_OPERATOR operator,
        @NonNull ChoiceEnableWhen_Answer answer) {
      this.question = question;
      this.operator = operator;
      this.answer = answer;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Questionnaire_Item_EnableWhenBuilder.Impl withId(@NonNull String id) {
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
    public Questionnaire_Item_EnableWhenBuilder.Impl withExtension(
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
    public Questionnaire_Item_EnableWhenBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Questionnaire_Item_EnableWhenBuilder.Impl withExtension(
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
    public Questionnaire_Item_EnableWhenBuilder.Impl withModifierExtension(
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
    public Questionnaire_Item_EnableWhenBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Questionnaire_Item_EnableWhenBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Questionnaire$Item$EnableWhen build() {
      return new Questionnaire$Item$EnableWhen(
          OptionConverters.toScala(id),
          question,
          operator,
          extension.stream().collect(new LitSeqJCollector<>()),
          (Choice) answer,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
