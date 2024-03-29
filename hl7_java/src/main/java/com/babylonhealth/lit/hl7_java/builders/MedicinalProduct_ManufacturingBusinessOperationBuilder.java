package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
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

public interface MedicinalProduct_ManufacturingBusinessOperationBuilder {
  public MedicinalProduct.ManufacturingBusinessOperation build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements MedicinalProduct_ManufacturingBusinessOperationBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> regulator = Optional.empty();
    private Collection<Reference> manufacturer = Collections.emptyList();
    private Optional<CodeableConcept> operationType = Optional.empty();
    private Optional<FHIRDateTime> effectiveDate = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> confidentialityIndicator = Optional.empty();
    private Optional<Identifier> authorisationReferenceNumber = Optional.empty();

    /** Required fields for {@link MedicinalProduct.ManufacturingBusinessOperation} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl withId(@NonNull String id) {
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
    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl withExtension(
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
    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param regulator */
    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl withRegulator(
        @NonNull Reference regulator) {
      this.regulator = Optional.of(regulator);
      return this;
    }

    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl withRegulator(
        @NonNull ReferenceBuilder regulator) {
      this.regulator = Optional.of(regulator.build());
      return this;
    }
    /** @param manufacturer */
    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl withManufacturer(
        @NonNull Reference... manufacturer) {
      this.manufacturer = Arrays.asList(manufacturer);
      return this;
    }
    /** @param manufacturer */
    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl withManufacturer(
        @NonNull Collection<Reference> manufacturer) {
      this.manufacturer = Collections.unmodifiableCollection(manufacturer);
      return this;
    }

    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl withManufacturer(
        @NonNull ReferenceBuilder... manufacturer) {
      this.manufacturer = Arrays.stream(manufacturer).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param operationType */
    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl withOperationType(
        @NonNull CodeableConcept operationType) {
      this.operationType = Optional.of(operationType);
      return this;
    }

    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl withOperationType(
        @NonNull CodeableConceptBuilder operationType) {
      this.operationType = Optional.of(operationType.build());
      return this;
    }
    /** @param effectiveDate */
    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl withEffectiveDate(
        @NonNull FHIRDateTime effectiveDate) {
      this.effectiveDate = Optional.of(effectiveDate);
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
    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl withModifierExtension(
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
    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param confidentialityIndicator */
    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl withConfidentialityIndicator(
        @NonNull CodeableConcept confidentialityIndicator) {
      this.confidentialityIndicator = Optional.of(confidentialityIndicator);
      return this;
    }

    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl withConfidentialityIndicator(
        @NonNull CodeableConceptBuilder confidentialityIndicator) {
      this.confidentialityIndicator = Optional.of(confidentialityIndicator.build());
      return this;
    }
    /** @param authorisationReferenceNumber */
    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl
        withAuthorisationReferenceNumber(@NonNull Identifier authorisationReferenceNumber) {
      this.authorisationReferenceNumber = Optional.of(authorisationReferenceNumber);
      return this;
    }

    public MedicinalProduct_ManufacturingBusinessOperationBuilder.Impl
        withAuthorisationReferenceNumber(@NonNull IdentifierBuilder authorisationReferenceNumber) {
      this.authorisationReferenceNumber = Optional.of(authorisationReferenceNumber.build());
      return this;
    }

    public MedicinalProduct.ManufacturingBusinessOperation build() {
      return new MedicinalProduct.ManufacturingBusinessOperation(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(regulator),
          manufacturer.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(operationType),
          OptionConverters.toScala(effectiveDate),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(confidentialityIndicator),
          OptionConverters.toScala(authorisationReferenceNumber),
          LitUtils.emptyMetaElMap());
    }
  }
}
