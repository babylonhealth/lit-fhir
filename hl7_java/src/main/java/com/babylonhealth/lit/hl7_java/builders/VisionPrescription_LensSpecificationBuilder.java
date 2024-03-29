package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.VISION_EYE_CODES;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;
import scala.math.BigDecimal;

public interface VisionPrescription_LensSpecificationBuilder {
  public VisionPrescription.LensSpecification build();

  public static Impl init(VISION_EYE_CODES eye, CodeableConcept product) {
    return new Impl(eye, product);
  }

  public static Impl builder(VISION_EYE_CODES eye, CodeableConceptBuilder product) {
    return new Impl(eye, product.build());
  }

  public class Impl implements VisionPrescription_LensSpecificationBuilder {
    private Optional<String> id = Optional.empty();
    private VISION_EYE_CODES eye;
    private Optional<BigDecimal> add = Optional.empty();
    private Optional<Integer> axis = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Optional<BigDecimal> power = Optional.empty();
    private Optional<String> color = Optional.empty();
    private Optional<String> brand = Optional.empty();
    private Optional<BigDecimal> sphere = Optional.empty();
    private CodeableConcept product;
    private Optional<BigDecimal> cylinder = Optional.empty();
    private Optional<BigDecimal> diameter = Optional.empty();
    private Optional<Quantity> duration = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<BigDecimal> backCurve = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<VisionPrescription$LensSpecification$Prism> prism = Collections.emptyList();

    /**
     * Required fields for {@link VisionPrescription.LensSpecification}
     *
     * @param eye
     * @param product
     */
    public Impl(VISION_EYE_CODES eye, CodeableConcept product) {
      this.eye = eye;
      this.product = product;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public VisionPrescription_LensSpecificationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param add */
    public VisionPrescription_LensSpecificationBuilder.Impl withAdd(@NonNull BigDecimal add) {
      this.add = Optional.of(add);
      return this;
    }
    /** @param axis */
    public VisionPrescription_LensSpecificationBuilder.Impl withAxis(@NonNull Integer axis) {
      this.axis = Optional.of(axis);
      return this;
    }
    /** @param note */
    public VisionPrescription_LensSpecificationBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note */
    public VisionPrescription_LensSpecificationBuilder.Impl withNote(
        @NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public VisionPrescription_LensSpecificationBuilder.Impl withNote(
        @NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param power */
    public VisionPrescription_LensSpecificationBuilder.Impl withPower(@NonNull BigDecimal power) {
      this.power = Optional.of(power);
      return this;
    }
    /** @param color */
    public VisionPrescription_LensSpecificationBuilder.Impl withColor(@NonNull String color) {
      this.color = Optional.of(color);
      return this;
    }
    /** @param brand */
    public VisionPrescription_LensSpecificationBuilder.Impl withBrand(@NonNull String brand) {
      this.brand = Optional.of(brand);
      return this;
    }
    /** @param sphere */
    public VisionPrescription_LensSpecificationBuilder.Impl withSphere(@NonNull BigDecimal sphere) {
      this.sphere = Optional.of(sphere);
      return this;
    }
    /** @param cylinder */
    public VisionPrescription_LensSpecificationBuilder.Impl withCylinder(
        @NonNull BigDecimal cylinder) {
      this.cylinder = Optional.of(cylinder);
      return this;
    }
    /** @param diameter */
    public VisionPrescription_LensSpecificationBuilder.Impl withDiameter(
        @NonNull BigDecimal diameter) {
      this.diameter = Optional.of(diameter);
      return this;
    }
    /** @param duration */
    public VisionPrescription_LensSpecificationBuilder.Impl withDuration(
        @NonNull Quantity duration) {
      this.duration = Optional.of(duration);
      return this;
    }

    public VisionPrescription_LensSpecificationBuilder.Impl withDuration(
        @NonNull QuantityBuilder duration) {
      this.duration = Optional.of(duration.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public VisionPrescription_LensSpecificationBuilder.Impl withExtension(
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
    public VisionPrescription_LensSpecificationBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public VisionPrescription_LensSpecificationBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param backCurve */
    public VisionPrescription_LensSpecificationBuilder.Impl withBackCurve(
        @NonNull BigDecimal backCurve) {
      this.backCurve = Optional.of(backCurve);
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
    public VisionPrescription_LensSpecificationBuilder.Impl withModifierExtension(
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
    public VisionPrescription_LensSpecificationBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public VisionPrescription_LensSpecificationBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param prism */
    public VisionPrescription_LensSpecificationBuilder.Impl withPrism(
        @NonNull VisionPrescription$LensSpecification$Prism... prism) {
      this.prism = Arrays.asList(prism);
      return this;
    }
    /** @param prism */
    public VisionPrescription_LensSpecificationBuilder.Impl withPrism(
        @NonNull Collection<VisionPrescription$LensSpecification$Prism> prism) {
      this.prism = Collections.unmodifiableCollection(prism);
      return this;
    }

    public VisionPrescription_LensSpecificationBuilder.Impl withPrism(
        @NonNull VisionPrescription_LensSpecification_PrismBuilder... prism) {
      this.prism = Arrays.stream(prism).map(e -> e.build()).collect(toList());
      return this;
    }

    public VisionPrescription.LensSpecification build() {
      return new VisionPrescription.LensSpecification(
          OptionConverters.toScala(id),
          eye,
          OptionConverters.toScala(add),
          OptionConverters.toScala(axis.map(x -> (Object) x)),
          note.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(power),
          OptionConverters.toScala(color),
          OptionConverters.toScala(brand),
          OptionConverters.toScala(sphere),
          product,
          OptionConverters.toScala(cylinder),
          OptionConverters.toScala(diameter),
          OptionConverters.toScala(duration),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(backCurve),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          prism.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
