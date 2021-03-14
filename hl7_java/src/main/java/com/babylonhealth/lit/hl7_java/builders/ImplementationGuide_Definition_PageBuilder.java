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
import com.babylonhealth.lit.hl7.GUIDE_PAGE_GENERATION;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ImplementationGuide_Definition_PageBuilder {
  private Optional<String> id = Optional.empty();
  private Collection<ImplementationGuide$Definition$Page> page = Collections.emptyList();
  private String title;
  private Choice<$bslash$div<Reference, String>> name;
  private Collection<Extension> extension = Collections.emptyList();
  private GUIDE_PAGE_GENERATION generation;
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /**
   * Required fields for {@link ImplementationGuide$Definition$Page}
   *
   * @param title - A short, descriptive, user-friendly title for the implementation guide.
   * @param name - A natural language name identifying the implementation guide. This name should be
   *     usable as an identifier for the module by machine processing applications such as code
   *     generation. Field is a 'choice' field. Type should be one of Reference, String.
   * @param generation
   */
  public ImplementationGuide_Definition_PageBuilder(
      String title, @NonNull Object name, GUIDE_PAGE_GENERATION generation) {
    this.title = title;
    this.name =
        (Choice)
            Choice$.MODULE$.fromSuffix(
                autoSuffix(
                    name.getClass().getSimpleName(),
                    ImplementationGuide$Definition$Page$.MODULE$.name()),
                name,
                ImplementationGuide$Definition$Page$.MODULE$.name());
    this.generation = generation;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ImplementationGuide_Definition_PageBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param page */
  public ImplementationGuide_Definition_PageBuilder withPage(
      @NonNull ImplementationGuide$Definition$Page... page) {
    this.page = Arrays.asList(page);
    return this;
  }
  /** @param page */
  public ImplementationGuide_Definition_PageBuilder withPage(
      @NonNull Collection<ImplementationGuide$Definition$Page> page) {
    this.page = Collections.unmodifiableCollection(page);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ImplementationGuide_Definition_PageBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ImplementationGuide_Definition_PageBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public ImplementationGuide_Definition_PageBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public ImplementationGuide_Definition_PageBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public ImplementationGuide$Definition$Page build() {
    return new ImplementationGuide$Definition$Page(
        OptionConverters.toScala(id),
        page.stream().collect(new LitSeqJCollector<>()),
        title,
        name,
        extension.stream().collect(new LitSeqJCollector<>()),
        generation,
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
