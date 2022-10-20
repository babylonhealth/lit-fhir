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

public interface SubstancePolymer_MonomerSetBuilder {
  public SubstancePolymer.MonomerSet build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SubstancePolymer_MonomerSetBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<CodeableConcept> ratioType = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<SubstancePolymer$MonomerSet$StartingMaterial> startingMaterial =
        Collections.emptyList();

    /** Required fields for {@link SubstancePolymer.MonomerSet} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstancePolymer_MonomerSetBuilder.Impl withId(@NonNull String id) {
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
    public SubstancePolymer_MonomerSetBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public SubstancePolymer_MonomerSetBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstancePolymer_MonomerSetBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param ratioType */
    public SubstancePolymer_MonomerSetBuilder.Impl withRatioType(
        @NonNull CodeableConcept ratioType) {
      this.ratioType = Optional.of(ratioType);
      return this;
    }

    public SubstancePolymer_MonomerSetBuilder.Impl withRatioType(
        @NonNull CodeableConceptBuilder ratioType) {
      this.ratioType = Optional.of(ratioType.build());
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
    public SubstancePolymer_MonomerSetBuilder.Impl withModifierExtension(
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
    public SubstancePolymer_MonomerSetBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstancePolymer_MonomerSetBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param startingMaterial */
    public SubstancePolymer_MonomerSetBuilder.Impl withStartingMaterial(
        @NonNull SubstancePolymer$MonomerSet$StartingMaterial... startingMaterial) {
      this.startingMaterial = Arrays.asList(startingMaterial);
      return this;
    }
    /** @param startingMaterial */
    public SubstancePolymer_MonomerSetBuilder.Impl withStartingMaterial(
        @NonNull Collection<SubstancePolymer$MonomerSet$StartingMaterial> startingMaterial) {
      this.startingMaterial = Collections.unmodifiableCollection(startingMaterial);
      return this;
    }

    public SubstancePolymer_MonomerSetBuilder.Impl withStartingMaterial(
        @NonNull SubstancePolymer_MonomerSet_StartingMaterialBuilder... startingMaterial) {
      this.startingMaterial = Arrays.stream(startingMaterial).map(e -> e.build()).collect(toList());
      return this;
    }

    public SubstancePolymer.MonomerSet build() {
      return new SubstancePolymer.MonomerSet(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(ratioType),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          startingMaterial.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
