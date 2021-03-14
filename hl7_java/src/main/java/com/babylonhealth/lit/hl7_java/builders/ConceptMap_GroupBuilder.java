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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ConceptMap_GroupBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> source = Optional.empty();
  private Optional<String> target = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> sourceVersion = Optional.empty();
  private Optional<String> targetVersion = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<ConceptMap$Group$Unmapped> unmapped = Optional.empty();
  private Collection<ConceptMap$Group$Element> element;

  /**
   * Required fields for {@link ConceptMap.Group}
   *
   * @param element
   */
  public ConceptMap_GroupBuilder(Collection<ConceptMap$Group$Element> element) {
    this.element = element;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ConceptMap_GroupBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param source - Identifier for the source value set that contains the concepts that are being
   *     mapped and provides context for the mappings.
   */
  public ConceptMap_GroupBuilder withSource(@NonNull String source) {
    this.source = Optional.of(source);
    return this;
  }
  /**
   * @param target - The target value set provides context for the mappings. Note that the mapping
   *     is made between concepts, not between value sets, but the value set provides important
   *     context about how the concept mapping choices are made.
   */
  public ConceptMap_GroupBuilder withTarget(@NonNull String target) {
    this.target = Optional.of(target);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ConceptMap_GroupBuilder withExtension(@NonNull Extension... extension) {
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
  public ConceptMap_GroupBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param sourceVersion */
  public ConceptMap_GroupBuilder withSourceVersion(@NonNull String sourceVersion) {
    this.sourceVersion = Optional.of(sourceVersion);
    return this;
  }
  /** @param targetVersion */
  public ConceptMap_GroupBuilder withTargetVersion(@NonNull String targetVersion) {
    this.targetVersion = Optional.of(targetVersion);
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
  public ConceptMap_GroupBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public ConceptMap_GroupBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param unmapped */
  public ConceptMap_GroupBuilder withUnmapped(@NonNull ConceptMap$Group$Unmapped unmapped) {
    this.unmapped = Optional.of(unmapped);
    return this;
  }

  public ConceptMap.Group build() {
    return new ConceptMap.Group(
        OptionConverters.toScala(id),
        OptionConverters.toScala(source),
        OptionConverters.toScala(target),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(sourceVersion),
        OptionConverters.toScala(targetVersion),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(unmapped),
        element.stream().collect(new NonEmptyLitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
