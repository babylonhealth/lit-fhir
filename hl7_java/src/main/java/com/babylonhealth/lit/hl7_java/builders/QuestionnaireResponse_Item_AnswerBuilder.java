package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

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
import scala.Option;
import scala.jdk.javaapi.OptionConverters;
import scala.math.BigDecimal;

public interface QuestionnaireResponse_Item_AnswerBuilder {
  public QuestionnaireResponse$Item$Answer build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
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

  public class Impl implements QuestionnaireResponse_Item_AnswerBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<QuestionnaireResponse.Item> item = Collections.emptyList();
    private Optional<Choice01113166363> value = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link QuestionnaireResponse$Item$Answer} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public QuestionnaireResponse_Item_AnswerBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param item - A group or question item from the original questionnaire for which answers are
     *     provided.
     */
    public QuestionnaireResponse_Item_AnswerBuilder.Impl withItem(
        @NonNull QuestionnaireResponse.Item... item) {
      this.item = Arrays.asList(item);
      return this;
    }
    /**
     * @param item - A group or question item from the original questionnaire for which answers are
     *     provided.
     */
    public QuestionnaireResponse_Item_AnswerBuilder.Impl withItem(
        @NonNull Collection<QuestionnaireResponse.Item> item) {
      this.item = Collections.unmodifiableCollection(item);
      return this;
    }

    public QuestionnaireResponse_Item_AnswerBuilder.Impl withItem(
        @NonNull QuestionnaireResponse_ItemBuilder... item) {
      this.item = Arrays.stream(item).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param value Field is a 'choice' field. Type should be one of Attachment, BigDecimal,
     *     Boolean, Coding, FHIRDate, FHIRDateTime, Integer, LocalTime, Quantity, Reference, String.
     *     To pass the value in, wrap with one of the QuestionnaireResponse_Item_AnswerBuilder.value
     *     static methods
     */
    public QuestionnaireResponse_Item_AnswerBuilder.Impl withValue(
        @NonNull Choice01113166363 value) {
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
    public QuestionnaireResponse_Item_AnswerBuilder.Impl withExtension(
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
    public QuestionnaireResponse_Item_AnswerBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public QuestionnaireResponse_Item_AnswerBuilder.Impl withExtension(
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
    public QuestionnaireResponse_Item_AnswerBuilder.Impl withModifierExtension(
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
    public QuestionnaireResponse_Item_AnswerBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public QuestionnaireResponse_Item_AnswerBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public QuestionnaireResponse$Item$Answer build() {
      return new QuestionnaireResponse$Item$Answer(
          OptionConverters.toScala(id),
          item.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(value),
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
