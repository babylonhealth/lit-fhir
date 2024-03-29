package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.CONCEPT_MAP_EQUIVALENCE;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface ConceptMap_Group_Element_TargetBuilder {
  public ConceptMap$Group$Element$Target build();

  public static Impl init(CONCEPT_MAP_EQUIVALENCE equivalence) {
    return new Impl(equivalence);
  }

  public static Impl builder(CONCEPT_MAP_EQUIVALENCE equivalence) {
    return new Impl(equivalence);
  }

  public class Impl implements ConceptMap_Group_Element_TargetBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> code = Optional.empty();
    private Optional<String> display = Optional.empty();
    private Optional<String> comment = Optional.empty();
    private Collection<ConceptMap$Group$Element$Target$DependsOn> product = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private CONCEPT_MAP_EQUIVALENCE equivalence;
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<ConceptMap$Group$Element$Target$DependsOn> dependsOn =
        Collections.emptyList();

    /**
     * Required fields for {@link ConceptMap$Group$Element$Target}
     *
     * @param equivalence
     */
    public Impl(CONCEPT_MAP_EQUIVALENCE equivalence) {
      this.equivalence = equivalence;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ConceptMap_Group_Element_TargetBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param code */
    public ConceptMap_Group_Element_TargetBuilder.Impl withCode(@NonNull String code) {
      this.code = Optional.of(code);
      return this;
    }
    /** @param display */
    public ConceptMap_Group_Element_TargetBuilder.Impl withDisplay(@NonNull String display) {
      this.display = Optional.of(display);
      return this;
    }
    /** @param comment */
    public ConceptMap_Group_Element_TargetBuilder.Impl withComment(@NonNull String comment) {
      this.comment = Optional.of(comment);
      return this;
    }
    /** @param product */
    public ConceptMap_Group_Element_TargetBuilder.Impl withProduct(
        @NonNull ConceptMap$Group$Element$Target$DependsOn... product) {
      this.product = Arrays.asList(product);
      return this;
    }
    /** @param product */
    public ConceptMap_Group_Element_TargetBuilder.Impl withProduct(
        @NonNull Collection<ConceptMap$Group$Element$Target$DependsOn> product) {
      this.product = Collections.unmodifiableCollection(product);
      return this;
    }

    public ConceptMap_Group_Element_TargetBuilder.Impl withProduct(
        @NonNull ConceptMap_Group_Element_Target_DependsOnBuilder... product) {
      this.product = Arrays.stream(product).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ConceptMap_Group_Element_TargetBuilder.Impl withExtension(
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
    public ConceptMap_Group_Element_TargetBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ConceptMap_Group_Element_TargetBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
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
    public ConceptMap_Group_Element_TargetBuilder.Impl withModifierExtension(
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
    public ConceptMap_Group_Element_TargetBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ConceptMap_Group_Element_TargetBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param dependsOn */
    public ConceptMap_Group_Element_TargetBuilder.Impl withDependsOn(
        @NonNull ConceptMap$Group$Element$Target$DependsOn... dependsOn) {
      this.dependsOn = Arrays.asList(dependsOn);
      return this;
    }
    /** @param dependsOn */
    public ConceptMap_Group_Element_TargetBuilder.Impl withDependsOn(
        @NonNull Collection<ConceptMap$Group$Element$Target$DependsOn> dependsOn) {
      this.dependsOn = Collections.unmodifiableCollection(dependsOn);
      return this;
    }

    public ConceptMap_Group_Element_TargetBuilder.Impl withDependsOn(
        @NonNull ConceptMap_Group_Element_Target_DependsOnBuilder... dependsOn) {
      this.dependsOn = Arrays.stream(dependsOn).map(e -> e.build()).collect(toList());
      return this;
    }

    public ConceptMap$Group$Element$Target build() {
      return new ConceptMap$Group$Element$Target(
          OptionConverters.toScala(id),
          OptionConverters.toScala(code),
          OptionConverters.toScala(display),
          OptionConverters.toScala(comment),
          product.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          equivalence,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          dependsOn.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
