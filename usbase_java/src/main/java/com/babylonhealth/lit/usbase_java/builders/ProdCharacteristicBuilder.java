package com.babylonhealth.lit.usbase_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface ProdCharacteristicBuilder extends BackboneElementBuilder {
  public ProdCharacteristic build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements ProdCharacteristicBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Quantity> width = Optional.empty();
    private Optional<Quantity> depth = Optional.empty();
    private Optional<String> shape = Optional.empty();
    private Collection<String> color = Collections.emptyList();
    private Collection<Attachment> image = Collections.emptyList();
    private Optional<Quantity> height = Optional.empty();
    private Optional<Quantity> weight = Optional.empty();
    private Collection<String> imprint = Collections.emptyList();
    private Optional<CodeableConcept> scoring = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Quantity> nominalVolume = Optional.empty();
    private Optional<Quantity> externalDiameter = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link ProdCharacteristic} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public ProdCharacteristicBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param width - Where applicable, the width can be specified using a numerical value and its
     *     unit of measurement The unit of measurement shall be specified in accordance with ISO
     *     11240 and the resulting terminology The symbol and the symbol identifier shall be used.
     */
    public ProdCharacteristicBuilder.Impl withWidth(@NonNull Quantity width) {
      this.width = Optional.of(width);
      return this;
    }

    public ProdCharacteristicBuilder.Impl withWidth(@NonNull QuantityBuilder width) {
      this.width = Optional.of(width.build());
      return this;
    }
    /**
     * @param depth - Where applicable, the depth can be specified using a numerical value and its
     *     unit of measurement The unit of measurement shall be specified in accordance with ISO
     *     11240 and the resulting terminology The symbol and the symbol identifier shall be used.
     */
    public ProdCharacteristicBuilder.Impl withDepth(@NonNull Quantity depth) {
      this.depth = Optional.of(depth);
      return this;
    }

    public ProdCharacteristicBuilder.Impl withDepth(@NonNull QuantityBuilder depth) {
      this.depth = Optional.of(depth.build());
      return this;
    }
    /**
     * @param shape - Where applicable, the shape can be specified An appropriate controlled
     *     vocabulary shall be used The term and the term identifier shall be used.
     */
    public ProdCharacteristicBuilder.Impl withShape(@NonNull String shape) {
      this.shape = Optional.of(shape);
      return this;
    }
    /**
     * @param color - Where applicable, the color can be specified An appropriate controlled
     *     vocabulary shall be used The term and the term identifier shall be used.
     */
    public ProdCharacteristicBuilder.Impl withColor(@NonNull String... color) {
      this.color = Arrays.asList(color);
      return this;
    }
    /**
     * @param color - Where applicable, the color can be specified An appropriate controlled
     *     vocabulary shall be used The term and the term identifier shall be used.
     */
    public ProdCharacteristicBuilder.Impl withColor(@NonNull Collection<String> color) {
      this.color = Collections.unmodifiableCollection(color);
      return this;
    }
    /**
     * @param image - Where applicable, the image can be provided The format of the image attachment
     *     shall be specified by regional implementations.
     */
    public ProdCharacteristicBuilder.Impl withImage(@NonNull Attachment... image) {
      this.image = Arrays.asList(image);
      return this;
    }
    /**
     * @param image - Where applicable, the image can be provided The format of the image attachment
     *     shall be specified by regional implementations.
     */
    public ProdCharacteristicBuilder.Impl withImage(@NonNull Collection<Attachment> image) {
      this.image = Collections.unmodifiableCollection(image);
      return this;
    }

    public ProdCharacteristicBuilder.Impl withImage(@NonNull AttachmentBuilder... image) {
      this.image = Arrays.stream(image).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param height - Where applicable, the height can be specified using a numerical value and its
     *     unit of measurement The unit of measurement shall be specified in accordance with ISO
     *     11240 and the resulting terminology The symbol and the symbol identifier shall be used.
     */
    public ProdCharacteristicBuilder.Impl withHeight(@NonNull Quantity height) {
      this.height = Optional.of(height);
      return this;
    }

    public ProdCharacteristicBuilder.Impl withHeight(@NonNull QuantityBuilder height) {
      this.height = Optional.of(height.build());
      return this;
    }
    /**
     * @param weight - Where applicable, the weight can be specified using a numerical value and its
     *     unit of measurement The unit of measurement shall be specified in accordance with ISO
     *     11240 and the resulting terminology The symbol and the symbol identifier shall be used.
     */
    public ProdCharacteristicBuilder.Impl withWeight(@NonNull Quantity weight) {
      this.weight = Optional.of(weight);
      return this;
    }

    public ProdCharacteristicBuilder.Impl withWeight(@NonNull QuantityBuilder weight) {
      this.weight = Optional.of(weight.build());
      return this;
    }
    /** @param imprint - Where applicable, the imprint can be specified as text. */
    public ProdCharacteristicBuilder.Impl withImprint(@NonNull String... imprint) {
      this.imprint = Arrays.asList(imprint);
      return this;
    }
    /** @param imprint - Where applicable, the imprint can be specified as text. */
    public ProdCharacteristicBuilder.Impl withImprint(@NonNull Collection<String> imprint) {
      this.imprint = Collections.unmodifiableCollection(imprint);
      return this;
    }
    /**
     * @param scoring - Where applicable, the scoring can be specified An appropriate controlled
     *     vocabulary shall be used The term and the term identifier shall be used.
     */
    public ProdCharacteristicBuilder.Impl withScoring(@NonNull CodeableConcept scoring) {
      this.scoring = Optional.of(scoring);
      return this;
    }

    public ProdCharacteristicBuilder.Impl withScoring(@NonNull CodeableConceptBuilder scoring) {
      this.scoring = Optional.of(scoring.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public ProdCharacteristicBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public ProdCharacteristicBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ProdCharacteristicBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param nominalVolume - Where applicable, the nominal volume can be specified using a
     *     numerical value and its unit of measurement The unit of measurement shall be specified in
     *     accordance with ISO 11240 and the resulting terminology The symbol and the symbol
     *     identifier shall be used.
     */
    public ProdCharacteristicBuilder.Impl withNominalVolume(@NonNull Quantity nominalVolume) {
      this.nominalVolume = Optional.of(nominalVolume);
      return this;
    }

    public ProdCharacteristicBuilder.Impl withNominalVolume(
        @NonNull QuantityBuilder nominalVolume) {
      this.nominalVolume = Optional.of(nominalVolume.build());
      return this;
    }
    /**
     * @param externalDiameter - Where applicable, the external diameter can be specified using a
     *     numerical value and its unit of measurement The unit of measurement shall be specified in
     *     accordance with ISO 11240 and the resulting terminology The symbol and the symbol
     *     identifier shall be used.
     */
    public ProdCharacteristicBuilder.Impl withExternalDiameter(@NonNull Quantity externalDiameter) {
      this.externalDiameter = Optional.of(externalDiameter);
      return this;
    }

    public ProdCharacteristicBuilder.Impl withExternalDiameter(
        @NonNull QuantityBuilder externalDiameter) {
      this.externalDiameter = Optional.of(externalDiameter.build());
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the element and that modifies the understanding of the element
     *     in which it is contained and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer can define an extension, there
     *     is a set of requirements that SHALL be met as part of the definition of the extension.
     *     Applications processing a resource are required to check for modifier extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public ProdCharacteristicBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the element and that modifies the understanding of the element
     *     in which it is contained and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer can define an extension, there
     *     is a set of requirements that SHALL be met as part of the definition of the extension.
     *     Applications processing a resource are required to check for modifier extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public ProdCharacteristicBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ProdCharacteristicBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public ProdCharacteristic build() {
      return new ProdCharacteristic(
          OptionConverters.toScala(id),
          OptionConverters.toScala(width),
          OptionConverters.toScala(depth),
          OptionConverters.toScala(shape),
          color.stream().collect(new LitSeqJCollector<>()),
          image.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(height),
          OptionConverters.toScala(weight),
          imprint.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(scoring),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(nominalVolume),
          OptionConverters.toScala(externalDiameter),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
