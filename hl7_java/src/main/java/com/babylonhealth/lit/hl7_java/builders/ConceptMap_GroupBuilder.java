package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
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

public interface ConceptMap_GroupBuilder {
  public ConceptMap.Group build();

  public static Impl init(Collection<ConceptMap$Group$Element> element) {
    return new Impl(element);
  }

  public static Impl builder(Collection<ConceptMap_Group_ElementBuilder> element) {
    return new Impl(new LitSeq<>(element).map(ConceptMap_Group_ElementBuilder::build));
  }

  public class Impl implements ConceptMap_GroupBuilder {
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
    public Impl(Collection<ConceptMap$Group$Element> element) {
      this.element = element;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ConceptMap_GroupBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param source - Identifier for the source value set that contains the concepts that are being
     *     mapped and provides context for the mappings.
     */
    public ConceptMap_GroupBuilder.Impl withSource(@NonNull String source) {
      this.source = Optional.of(source);
      return this;
    }
    /**
     * @param target - The target value set provides context for the mappings. Note that the mapping
     *     is made between concepts, not between value sets, but the value set provides important
     *     context about how the concept mapping choices are made.
     */
    public ConceptMap_GroupBuilder.Impl withTarget(@NonNull String target) {
      this.target = Optional.of(target);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ConceptMap_GroupBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ConceptMap_GroupBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ConceptMap_GroupBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param sourceVersion */
    public ConceptMap_GroupBuilder.Impl withSourceVersion(@NonNull String sourceVersion) {
      this.sourceVersion = Optional.of(sourceVersion);
      return this;
    }
    /** @param targetVersion */
    public ConceptMap_GroupBuilder.Impl withTargetVersion(@NonNull String targetVersion) {
      this.targetVersion = Optional.of(targetVersion);
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
    public ConceptMap_GroupBuilder.Impl withModifierExtension(
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
    public ConceptMap_GroupBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ConceptMap_GroupBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param unmapped */
    public ConceptMap_GroupBuilder.Impl withUnmapped(@NonNull ConceptMap$Group$Unmapped unmapped) {
      this.unmapped = Optional.of(unmapped);
      return this;
    }

    public ConceptMap_GroupBuilder.Impl withUnmapped(
        @NonNull ConceptMap_Group_UnmappedBuilder unmapped) {
      this.unmapped = Optional.of(unmapped.build());
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
}
