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

public interface ClinicalImpression_FindingBuilder {
  public ClinicalImpression.Finding build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements ClinicalImpression_FindingBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> basis = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> itemReference = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> itemCodeableConcept = Optional.empty();

    /** Required fields for {@link ClinicalImpression.Finding} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ClinicalImpression_FindingBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param basis */
    public ClinicalImpression_FindingBuilder.Impl withBasis(@NonNull String basis) {
      this.basis = Optional.of(basis);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ClinicalImpression_FindingBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ClinicalImpression_FindingBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ClinicalImpression_FindingBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param itemReference */
    public ClinicalImpression_FindingBuilder.Impl withItemReference(
        @NonNull Reference itemReference) {
      this.itemReference = Optional.of(itemReference);
      return this;
    }

    public ClinicalImpression_FindingBuilder.Impl withItemReference(
        @NonNull ReferenceBuilder itemReference) {
      this.itemReference = Optional.of(itemReference.build());
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
    public ClinicalImpression_FindingBuilder.Impl withModifierExtension(
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
    public ClinicalImpression_FindingBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ClinicalImpression_FindingBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param itemCodeableConcept */
    public ClinicalImpression_FindingBuilder.Impl withItemCodeableConcept(
        @NonNull CodeableConcept itemCodeableConcept) {
      this.itemCodeableConcept = Optional.of(itemCodeableConcept);
      return this;
    }

    public ClinicalImpression_FindingBuilder.Impl withItemCodeableConcept(
        @NonNull CodeableConceptBuilder itemCodeableConcept) {
      this.itemCodeableConcept = Optional.of(itemCodeableConcept.build());
      return this;
    }

    public ClinicalImpression.Finding build() {
      return new ClinicalImpression.Finding(
          OptionConverters.toScala(id),
          OptionConverters.toScala(basis),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(itemReference),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(itemCodeableConcept),
          LitUtils.emptyMetaElMap());
    }
  }
}
