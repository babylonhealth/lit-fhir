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
      String question, QUESTIONNAIRE_ENABLE_OPERATOR operator, @NonNull Choice_0388264667 answer) {
    return new Impl(question, operator, answer);
  }

  public static Choice_0388264667 answer(BigDecimal b) {
    return new Choice_0388264667(b);
  }

  public static Choice_0388264667 answer(Boolean b) {
    return new Choice_0388264667(b);
  }

  public static Choice_0388264667 answer(Coding c) {
    return new Choice_0388264667(c);
  }

  public static Choice_0388264667 answer(FHIRDate f) {
    return new Choice_0388264667(f);
  }

  public static Choice_0388264667 answer(FHIRDateTime f) {
    return new Choice_0388264667(f);
  }

  public static Choice_0388264667 answer(Integer i) {
    return new Choice_0388264667(i);
  }

  public static Choice_0388264667 answer(LocalTime l) {
    return new Choice_0388264667(l);
  }

  public static Choice_0388264667 answer(Quantity q) {
    return new Choice_0388264667(q);
  }

  public static Choice_0388264667 answer(Reference r) {
    return new Choice_0388264667(r);
  }

  public static Choice_0388264667 answer(String s) {
    return new Choice_0388264667(s);
  }

  public class Impl implements Questionnaire_Item_EnableWhenBuilder {
    private Optional<String> id = Optional.empty();
    private String question;
    private QUESTIONNAIRE_ENABLE_OPERATOR operator;
    private Collection<Extension> extension = Collections.emptyList();
    private Choice_0388264667 answer;
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
        @NonNull Choice_0388264667 answer) {
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
