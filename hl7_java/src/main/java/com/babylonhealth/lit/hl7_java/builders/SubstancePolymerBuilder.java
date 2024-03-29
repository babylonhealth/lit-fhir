package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LANGUAGES;
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

public interface SubstancePolymerBuilder extends DomainResourceBuilder {
  public SubstancePolymer build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SubstancePolymerBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> _class = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<CodeableConcept> geometry = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<String> modification = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<CodeableConcept> copolymerConnectivity = Collections.emptyList();
    private Collection<SubstancePolymer.MonomerSet> monomerSet = Collections.emptyList();
    private Collection<SubstancePolymer.Repeat> repeat = Collections.emptyList();

    /** Required fields for {@link SubstancePolymer} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstancePolymerBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public SubstancePolymerBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public SubstancePolymerBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
      this.meta = Optional.of(meta.build());
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public SubstancePolymerBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public SubstancePolymerBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param _class - Todo. */
    public SubstancePolymerBuilder.Impl withClass(@NonNull CodeableConcept _class) {
      this._class = Optional.of(_class);
      return this;
    }

    public SubstancePolymerBuilder.Impl withClass(@NonNull CodeableConceptBuilder _class) {
      this._class = Optional.of(_class.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public SubstancePolymerBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param geometry - Todo. */
    public SubstancePolymerBuilder.Impl withGeometry(@NonNull CodeableConcept geometry) {
      this.geometry = Optional.of(geometry);
      return this;
    }

    public SubstancePolymerBuilder.Impl withGeometry(@NonNull CodeableConceptBuilder geometry) {
      this.geometry = Optional.of(geometry.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public SubstancePolymerBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public SubstancePolymerBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public SubstancePolymerBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
      this.contained = Arrays.stream(contained).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SubstancePolymerBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public SubstancePolymerBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstancePolymerBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param modification - Todo. */
    public SubstancePolymerBuilder.Impl withModification(@NonNull String... modification) {
      this.modification = Arrays.asList(modification);
      return this;
    }
    /** @param modification - Todo. */
    public SubstancePolymerBuilder.Impl withModification(@NonNull Collection<String> modification) {
      this.modification = Collections.unmodifiableCollection(modification);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public SubstancePolymerBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
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
    public SubstancePolymerBuilder.Impl withModifierExtension(
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
    public SubstancePolymerBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstancePolymerBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param copolymerConnectivity - Todo. */
    public SubstancePolymerBuilder.Impl withCopolymerConnectivity(
        @NonNull CodeableConcept... copolymerConnectivity) {
      this.copolymerConnectivity = Arrays.asList(copolymerConnectivity);
      return this;
    }
    /** @param copolymerConnectivity - Todo. */
    public SubstancePolymerBuilder.Impl withCopolymerConnectivity(
        @NonNull Collection<CodeableConcept> copolymerConnectivity) {
      this.copolymerConnectivity = Collections.unmodifiableCollection(copolymerConnectivity);
      return this;
    }

    public SubstancePolymerBuilder.Impl withCopolymerConnectivity(
        @NonNull CodeableConceptBuilder... copolymerConnectivity) {
      this.copolymerConnectivity =
          Arrays.stream(copolymerConnectivity).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param monomerSet - Todo. */
    public SubstancePolymerBuilder.Impl withMonomerSet(
        @NonNull SubstancePolymer.MonomerSet... monomerSet) {
      this.monomerSet = Arrays.asList(monomerSet);
      return this;
    }
    /** @param monomerSet - Todo. */
    public SubstancePolymerBuilder.Impl withMonomerSet(
        @NonNull Collection<SubstancePolymer.MonomerSet> monomerSet) {
      this.monomerSet = Collections.unmodifiableCollection(monomerSet);
      return this;
    }

    public SubstancePolymerBuilder.Impl withMonomerSet(
        @NonNull SubstancePolymer_MonomerSetBuilder... monomerSet) {
      this.monomerSet = Arrays.stream(monomerSet).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param repeat - Todo. */
    public SubstancePolymerBuilder.Impl withRepeat(@NonNull SubstancePolymer.Repeat... repeat) {
      this.repeat = Arrays.asList(repeat);
      return this;
    }
    /** @param repeat - Todo. */
    public SubstancePolymerBuilder.Impl withRepeat(
        @NonNull Collection<SubstancePolymer.Repeat> repeat) {
      this.repeat = Collections.unmodifiableCollection(repeat);
      return this;
    }

    public SubstancePolymerBuilder.Impl withRepeat(
        @NonNull SubstancePolymer_RepeatBuilder... repeat) {
      this.repeat = Arrays.stream(repeat).map(e -> e.build()).collect(toList());
      return this;
    }

    public SubstancePolymerBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public SubstancePolymer build() {
      return new SubstancePolymer(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(_class),
          OptionConverters.toScala(language),
          OptionConverters.toScala(geometry),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          modification.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          copolymerConnectivity.stream().collect(new LitSeqJCollector<>()),
          monomerSet.stream().collect(new LitSeqJCollector<>()),
          repeat.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
