package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.LitSeq;
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
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface MedicinalProductPackaged_PackageItemBuilder {
  public MedicinalProductPackaged.PackageItem build();

  public static Impl init(CodeableConcept _type, Quantity quantity) {
    return new Impl(_type, quantity);
  }

  public static Impl builder(CodeableConceptBuilder _type, QuantityBuilder quantity) {
    return new Impl(_type.build(), quantity.build());
  }

  public class Impl implements MedicinalProductPackaged_PackageItemBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept _type;
    private Collection<Reference> device = Collections.emptyList();
    private Quantity quantity;
    private Collection<CodeableConcept> material = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<MedicinalProductPackaged.PackageItem> packageItem = Collections.emptyList();
    private Collection<Reference> manufacturer = Collections.emptyList();
    private Collection<Reference> manufacturedItem = Collections.emptyList();
    private Collection<Choice> shelfLifeStorage = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<CodeableConcept> alternateMaterial = Collections.emptyList();
    private Collection<CodeableConcept> otherCharacteristics = Collections.emptyList();
    private Optional<Choice> physicalCharacteristics = Optional.empty();

    /**
     * Required fields for {@link MedicinalProductPackaged.PackageItem}
     *
     * @param _type
     * @param quantity
     */
    public Impl(CodeableConcept _type, Quantity quantity) {
      this._type = _type;
      this.quantity = quantity;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param device */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withDevice(
        @NonNull Reference... device) {
      this.device = Arrays.asList(device);
      return this;
    }
    /** @param device */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withDevice(
        @NonNull Collection<Reference> device) {
      this.device = Collections.unmodifiableCollection(device);
      return this;
    }

    public MedicinalProductPackaged_PackageItemBuilder.Impl withDevice(
        @NonNull ReferenceBuilder... device) {
      this.device = Arrays.stream(device).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param material */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withMaterial(
        @NonNull CodeableConcept... material) {
      this.material = Arrays.asList(material);
      return this;
    }
    /** @param material */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withMaterial(
        @NonNull Collection<CodeableConcept> material) {
      this.material = Collections.unmodifiableCollection(material);
      return this;
    }

    public MedicinalProductPackaged_PackageItemBuilder.Impl withMaterial(
        @NonNull CodeableConceptBuilder... material) {
      this.material = Arrays.stream(material).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withExtension(
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
    public MedicinalProductPackaged_PackageItemBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicinalProductPackaged_PackageItemBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - Unique identifier. */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withIdentifier(
        @NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - Unique identifier. */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public MedicinalProductPackaged_PackageItemBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param packageItem - A packaging item, as a contained for medicine, possibly with other
     *     packaging items within.
     */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withPackageItem(
        @NonNull MedicinalProductPackaged.PackageItem... packageItem) {
      this.packageItem = Arrays.asList(packageItem);
      return this;
    }
    /**
     * @param packageItem - A packaging item, as a contained for medicine, possibly with other
     *     packaging items within.
     */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withPackageItem(
        @NonNull Collection<MedicinalProductPackaged.PackageItem> packageItem) {
      this.packageItem = Collections.unmodifiableCollection(packageItem);
      return this;
    }

    public MedicinalProductPackaged_PackageItemBuilder.Impl withPackageItem(
        @NonNull MedicinalProductPackaged_PackageItemBuilder... packageItem) {
      this.packageItem = Arrays.stream(packageItem).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param manufacturer - Manufacturer of this Package Item. */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withManufacturer(
        @NonNull Reference... manufacturer) {
      this.manufacturer = Arrays.asList(manufacturer);
      return this;
    }
    /** @param manufacturer - Manufacturer of this Package Item. */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withManufacturer(
        @NonNull Collection<Reference> manufacturer) {
      this.manufacturer = Collections.unmodifiableCollection(manufacturer);
      return this;
    }

    public MedicinalProductPackaged_PackageItemBuilder.Impl withManufacturer(
        @NonNull ReferenceBuilder... manufacturer) {
      this.manufacturer = Arrays.stream(manufacturer).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param manufacturedItem */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withManufacturedItem(
        @NonNull Reference... manufacturedItem) {
      this.manufacturedItem = Arrays.asList(manufacturedItem);
      return this;
    }
    /** @param manufacturedItem */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withManufacturedItem(
        @NonNull Collection<Reference> manufacturedItem) {
      this.manufacturedItem = Collections.unmodifiableCollection(manufacturedItem);
      return this;
    }

    public MedicinalProductPackaged_PackageItemBuilder.Impl withManufacturedItem(
        @NonNull ReferenceBuilder... manufacturedItem) {
      this.manufacturedItem = Arrays.stream(manufacturedItem).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param shelfLifeStorage */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withShelfLifeStorage(
        @NonNull Choice... shelfLifeStorage) {
      this.shelfLifeStorage = Arrays.asList(shelfLifeStorage);
      return this;
    }
    /** @param shelfLifeStorage */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withShelfLifeStorage(
        @NonNull Collection<Choice> shelfLifeStorage) {
      this.shelfLifeStorage = Collections.unmodifiableCollection(shelfLifeStorage);
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
    public MedicinalProductPackaged_PackageItemBuilder.Impl withModifierExtension(
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
    public MedicinalProductPackaged_PackageItemBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicinalProductPackaged_PackageItemBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param alternateMaterial */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withAlternateMaterial(
        @NonNull CodeableConcept... alternateMaterial) {
      this.alternateMaterial = Arrays.asList(alternateMaterial);
      return this;
    }
    /** @param alternateMaterial */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withAlternateMaterial(
        @NonNull Collection<CodeableConcept> alternateMaterial) {
      this.alternateMaterial = Collections.unmodifiableCollection(alternateMaterial);
      return this;
    }

    public MedicinalProductPackaged_PackageItemBuilder.Impl withAlternateMaterial(
        @NonNull CodeableConceptBuilder... alternateMaterial) {
      this.alternateMaterial =
          Arrays.stream(alternateMaterial).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param otherCharacteristics */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withOtherCharacteristics(
        @NonNull CodeableConcept... otherCharacteristics) {
      this.otherCharacteristics = Arrays.asList(otherCharacteristics);
      return this;
    }
    /** @param otherCharacteristics */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withOtherCharacteristics(
        @NonNull Collection<CodeableConcept> otherCharacteristics) {
      this.otherCharacteristics = Collections.unmodifiableCollection(otherCharacteristics);
      return this;
    }

    public MedicinalProductPackaged_PackageItemBuilder.Impl withOtherCharacteristics(
        @NonNull CodeableConceptBuilder... otherCharacteristics) {
      this.otherCharacteristics =
          Arrays.stream(otherCharacteristics).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param physicalCharacteristics */
    public MedicinalProductPackaged_PackageItemBuilder.Impl withPhysicalCharacteristics(
        @NonNull Choice physicalCharacteristics) {
      this.physicalCharacteristics = Optional.of(physicalCharacteristics);
      return this;
    }

    public MedicinalProductPackaged.PackageItem build() {
      return new MedicinalProductPackaged.PackageItem(
          OptionConverters.toScala(id),
          _type,
          device.stream().collect(new LitSeqJCollector<>()),
          quantity,
          material.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          packageItem.stream().collect(new LitSeqJCollector<>()),
          manufacturer.stream().collect(new LitSeqJCollector<>()),
          manufacturedItem.stream().collect(new LitSeqJCollector<>()),
          (LitSeq) shelfLifeStorage.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          alternateMaterial.stream().collect(new LitSeqJCollector<>()),
          otherCharacteristics.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(physicalCharacteristics),
          LitUtils.emptyMetaElMap());
    }
  }
}
