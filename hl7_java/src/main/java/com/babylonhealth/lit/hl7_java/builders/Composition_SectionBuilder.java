package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.LIST_MODE;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Composition_SectionBuilder {
  public Composition.Section build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements Composition_SectionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> code = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<LIST_MODE> mode = Optional.empty();
    private Optional<String> title = Optional.empty();
    private Optional<Reference> focus = Optional.empty();
    private Collection<Reference> entry = Collections.emptyList();
    private Collection<Reference> author = Collections.emptyList();
    private Collection<Composition.Section> section = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<CodeableConcept> orderedBy = Optional.empty();
    private Optional<CodeableConcept> emptyReason = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link Composition.Section} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Composition_SectionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param code */
    public Composition_SectionBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public Composition_SectionBuilder.Impl withCode(@NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public Composition_SectionBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public Composition_SectionBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param mode */
    public Composition_SectionBuilder.Impl withMode(@NonNull LIST_MODE mode) {
      this.mode = Optional.of(mode);
      return this;
    }
    /** @param title - Official human-readable label for the composition. */
    public Composition_SectionBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /** @param focus */
    public Composition_SectionBuilder.Impl withFocus(@NonNull Reference focus) {
      this.focus = Optional.of(focus);
      return this;
    }

    public Composition_SectionBuilder.Impl withFocus(@NonNull ReferenceBuilder focus) {
      this.focus = Optional.of(focus.build());
      return this;
    }
    /** @param entry */
    public Composition_SectionBuilder.Impl withEntry(@NonNull Reference... entry) {
      this.entry = Arrays.asList(entry);
      return this;
    }
    /** @param entry */
    public Composition_SectionBuilder.Impl withEntry(@NonNull Collection<Reference> entry) {
      this.entry = Collections.unmodifiableCollection(entry);
      return this;
    }

    public Composition_SectionBuilder.Impl withEntry(@NonNull ReferenceBuilder... entry) {
      this.entry = Arrays.stream(entry).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param author - Identifies who is responsible for the information in the composition, not
     *     necessarily who typed it in.
     */
    public Composition_SectionBuilder.Impl withAuthor(@NonNull Reference... author) {
      this.author = Arrays.asList(author);
      return this;
    }
    /**
     * @param author - Identifies who is responsible for the information in the composition, not
     *     necessarily who typed it in.
     */
    public Composition_SectionBuilder.Impl withAuthor(@NonNull Collection<Reference> author) {
      this.author = Collections.unmodifiableCollection(author);
      return this;
    }

    public Composition_SectionBuilder.Impl withAuthor(@NonNull ReferenceBuilder... author) {
      this.author = Arrays.stream(author).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param section - The root of the sections that make up the composition. */
    public Composition_SectionBuilder.Impl withSection(@NonNull Composition.Section... section) {
      this.section = Arrays.asList(section);
      return this;
    }
    /** @param section - The root of the sections that make up the composition. */
    public Composition_SectionBuilder.Impl withSection(
        @NonNull Collection<Composition.Section> section) {
      this.section = Collections.unmodifiableCollection(section);
      return this;
    }

    public Composition_SectionBuilder.Impl withSection(
        @NonNull Composition_SectionBuilder... section) {
      this.section = Arrays.stream(section).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Composition_SectionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Composition_SectionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Composition_SectionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param orderedBy */
    public Composition_SectionBuilder.Impl withOrderedBy(@NonNull CodeableConcept orderedBy) {
      this.orderedBy = Optional.of(orderedBy);
      return this;
    }

    public Composition_SectionBuilder.Impl withOrderedBy(
        @NonNull CodeableConceptBuilder orderedBy) {
      this.orderedBy = Optional.of(orderedBy.build());
      return this;
    }
    /** @param emptyReason */
    public Composition_SectionBuilder.Impl withEmptyReason(@NonNull CodeableConcept emptyReason) {
      this.emptyReason = Optional.of(emptyReason);
      return this;
    }

    public Composition_SectionBuilder.Impl withEmptyReason(
        @NonNull CodeableConceptBuilder emptyReason) {
      this.emptyReason = Optional.of(emptyReason.build());
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
    public Composition_SectionBuilder.Impl withModifierExtension(
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
    public Composition_SectionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Composition_SectionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Composition.Section build() {
      return new Composition.Section(
          OptionConverters.toScala(id),
          OptionConverters.toScala(code),
          OptionConverters.toScala(text),
          OptionConverters.toScala(mode),
          OptionConverters.toScala(title),
          OptionConverters.toScala(focus),
          entry.stream().collect(new LitSeqJCollector<>()),
          author.stream().collect(new LitSeqJCollector<>()),
          section.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(orderedBy),
          OptionConverters.toScala(emptyReason),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
