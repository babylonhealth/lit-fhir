package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

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
import scala.jdk.javaapi.OptionConverters;

public interface QuestionnaireResponse_ItemBuilder {
  public QuestionnaireResponse.Item build();

  public static Impl init(String linkId) {
    return new Impl(linkId);
  }

  public static Impl builder(String linkId) {
    return new Impl(linkId);
  }

  public class Impl implements QuestionnaireResponse_ItemBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> text = Optional.empty();
    private Collection<QuestionnaireResponse.Item> item = Collections.emptyList();
    private String linkId;
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> definition = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<QuestionnaireResponse$Item$Answer> answer = Collections.emptyList();

    /**
     * Required fields for {@link QuestionnaireResponse.Item}
     *
     * @param linkId
     */
    public Impl(String linkId) {
      this.linkId = linkId;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public QuestionnaireResponse_ItemBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public QuestionnaireResponse_ItemBuilder.Impl withText(@NonNull String text) {
      this.text = Optional.of(text);
      return this;
    }
    /**
     * @param item - A group or question item from the original questionnaire for which answers are
     *     provided.
     */
    public QuestionnaireResponse_ItemBuilder.Impl withItem(
        @NonNull QuestionnaireResponse.Item... item) {
      this.item = Arrays.asList(item);
      return this;
    }
    /**
     * @param item - A group or question item from the original questionnaire for which answers are
     *     provided.
     */
    public QuestionnaireResponse_ItemBuilder.Impl withItem(
        @NonNull Collection<QuestionnaireResponse.Item> item) {
      this.item = Collections.unmodifiableCollection(item);
      return this;
    }

    public QuestionnaireResponse_ItemBuilder.Impl withItem(
        @NonNull QuestionnaireResponse_ItemBuilder... item) {
      this.item = Arrays.stream(item).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public QuestionnaireResponse_ItemBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public QuestionnaireResponse_ItemBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public QuestionnaireResponse_ItemBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param definition */
    public QuestionnaireResponse_ItemBuilder.Impl withDefinition(@NonNull String definition) {
      this.definition = Optional.of(definition);
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
    public QuestionnaireResponse_ItemBuilder.Impl withModifierExtension(
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
    public QuestionnaireResponse_ItemBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public QuestionnaireResponse_ItemBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param answer */
    public QuestionnaireResponse_ItemBuilder.Impl withAnswer(
        @NonNull QuestionnaireResponse$Item$Answer... answer) {
      this.answer = Arrays.asList(answer);
      return this;
    }
    /** @param answer */
    public QuestionnaireResponse_ItemBuilder.Impl withAnswer(
        @NonNull Collection<QuestionnaireResponse$Item$Answer> answer) {
      this.answer = Collections.unmodifiableCollection(answer);
      return this;
    }

    public QuestionnaireResponse_ItemBuilder.Impl withAnswer(
        @NonNull QuestionnaireResponse_Item_AnswerBuilder... answer) {
      this.answer = Arrays.stream(answer).map(e -> e.build()).collect(toList());
      return this;
    }

    public QuestionnaireResponse.Item build() {
      return new QuestionnaireResponse.Item(
          OptionConverters.toScala(id),
          OptionConverters.toScala(text),
          item.stream().collect(new LitSeqJCollector<>()),
          linkId,
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(definition),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          answer.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
