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
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class SpecimenDefinition_TypeTested_ContainerBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<CodeableConcept> cap = Optional.empty();
  private Optional<CodeableConcept> _type = Optional.empty();
  private Optional<CodeableConcept> material = Optional.empty();
  private Optional<Quantity> capacity = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> description = Optional.empty();
  private Optional<String> preparation = Optional.empty();
  private Optional<Choice_2072987899> minimumVolume = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<SpecimenDefinition$TypeTested$Container$Additive> additive =
      Collections.emptyList();

  /** Required fields for {@link SpecimenDefinition$TypeTested$Container} */
  public SpecimenDefinition_TypeTested_ContainerBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public SpecimenDefinition_TypeTested_ContainerBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param cap */
  public SpecimenDefinition_TypeTested_ContainerBuilder withCap(@NonNull CodeableConcept cap) {
    this.cap = Optional.of(cap);
    return this;
  }
  /** @param _type */
  public SpecimenDefinition_TypeTested_ContainerBuilder withType(@NonNull CodeableConcept _type) {
    this._type = Optional.of(_type);
    return this;
  }
  /** @param material */
  public SpecimenDefinition_TypeTested_ContainerBuilder withMaterial(
      @NonNull CodeableConcept material) {
    this.material = Optional.of(material);
    return this;
  }
  /** @param capacity */
  public SpecimenDefinition_TypeTested_ContainerBuilder withCapacity(@NonNull Quantity capacity) {
    this.capacity = Optional.of(capacity);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public SpecimenDefinition_TypeTested_ContainerBuilder withExtension(
      @NonNull Extension... extension) {
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
  public SpecimenDefinition_TypeTested_ContainerBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param description */
  public SpecimenDefinition_TypeTested_ContainerBuilder withDescription(
      @NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /** @param preparation */
  public SpecimenDefinition_TypeTested_ContainerBuilder withPreparation(
      @NonNull String preparation) {
    this.preparation = Optional.of(preparation);
    return this;
  }
  /** @param minimumVolume Field is a 'choice' field. Type should be one of Quantity, String. */
  public SpecimenDefinition_TypeTested_ContainerBuilder withMinimumVolume(
      @NonNull Choice_2072987899 minimumVolume) {
    this.minimumVolume = Optional.of(minimumVolume);
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
  public SpecimenDefinition_TypeTested_ContainerBuilder withModifierExtension(
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
  public SpecimenDefinition_TypeTested_ContainerBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param additive */
  public SpecimenDefinition_TypeTested_ContainerBuilder withAdditive(
      @NonNull SpecimenDefinition$TypeTested$Container$Additive... additive) {
    this.additive = Arrays.asList(additive);
    return this;
  }
  /** @param additive */
  public SpecimenDefinition_TypeTested_ContainerBuilder withAdditive(
      @NonNull Collection<SpecimenDefinition$TypeTested$Container$Additive> additive) {
    this.additive = Collections.unmodifiableCollection(additive);
    return this;
  }

  public SpecimenDefinition$TypeTested$Container build() {
    return new SpecimenDefinition$TypeTested$Container(
        OptionConverters.toScala(id),
        OptionConverters.toScala(cap),
        OptionConverters.toScala(_type),
        OptionConverters.toScala(material),
        OptionConverters.toScala(capacity),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(description),
        OptionConverters.toScala(preparation),
        (Option) OptionConverters.toScala(minimumVolume),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        additive.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
