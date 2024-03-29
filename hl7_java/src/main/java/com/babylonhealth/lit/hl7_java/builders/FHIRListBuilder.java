package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.LIST_MODE;
import com.babylonhealth.lit.hl7.LIST_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface FHIRListBuilder extends DomainResourceBuilder {
  public FHIRList build();

  public static Impl init(LIST_MODE mode, LIST_STATUS status) {
    return new Impl(mode, status);
  }

  public static Impl builder(LIST_MODE mode, LIST_STATUS status) {
    return new Impl(mode, status);
  }

  public class Impl implements FHIRListBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private LIST_MODE mode;
    private Optional<CodeableConcept> code = Optional.empty();
    private Optional<FHIRDateTime> date = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Optional<String> title = Optional.empty();
    private LIST_STATUS status;
    private Optional<Reference> source = Optional.empty();
    private Optional<Reference> subject = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Optional<CodeableConcept> orderedBy = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<CodeableConcept> emptyReason = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<FHIRList.Entry> entry = Collections.emptyList();

    /**
     * Required fields for {@link FHIRList}
     *
     * @param mode - How this list was prepared - whether it is a working list that is suitable for
     *     being maintained on an ongoing basis, or if it represents a snapshot of a list of items
     *     from another source, or whether it is a prepared list where items may be marked as added,
     *     modified or deleted.
     * @param status - Indicates the current state of this list.
     */
    public Impl(LIST_MODE mode, LIST_STATUS status) {
      this.mode = mode;
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public FHIRListBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public FHIRListBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public FHIRListBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public FHIRListBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public FHIRListBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param code - This code defines the purpose of the list - why it was created. */
    public FHIRListBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public FHIRListBuilder.Impl withCode(@NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /** @param date - The date that the list was prepared. */
    public FHIRListBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /** @param note - Comments that apply to the overall list. */
    public FHIRListBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note - Comments that apply to the overall list. */
    public FHIRListBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public FHIRListBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param title - A label for the list assigned by the author. */
    public FHIRListBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /**
     * @param source - The entity responsible for deciding what the contents of the list were. Where
     *     the list was created by a human, this is the same as the author of the list.
     */
    public FHIRListBuilder.Impl withSource(@NonNull Reference source) {
      this.source = Optional.of(source);
      return this;
    }

    public FHIRListBuilder.Impl withSource(@NonNull ReferenceBuilder source) {
      this.source = Optional.of(source.build());
      return this;
    }
    /**
     * @param subject - The common subject (or patient) of the resources that are in the list if
     *     there is one.
     */
    public FHIRListBuilder.Impl withSubject(@NonNull Reference subject) {
      this.subject = Optional.of(subject);
      return this;
    }

    public FHIRListBuilder.Impl withSubject(@NonNull ReferenceBuilder subject) {
      this.subject = Optional.of(subject.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public FHIRListBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public FHIRListBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public FHIRListBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public FHIRListBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public FHIRListBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public FHIRListBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public FHIRListBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param encounter - The encounter that is the context in which this list was created. */
    public FHIRListBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public FHIRListBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /** @param orderedBy - What order applies to the items in the list. */
    public FHIRListBuilder.Impl withOrderedBy(@NonNull CodeableConcept orderedBy) {
      this.orderedBy = Optional.of(orderedBy);
      return this;
    }

    public FHIRListBuilder.Impl withOrderedBy(@NonNull CodeableConceptBuilder orderedBy) {
      this.orderedBy = Optional.of(orderedBy.build());
      return this;
    }
    /**
     * @param identifier - Identifier for the List assigned for business purposes outside the
     *     context of FHIR.
     */
    public FHIRListBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Identifier for the List assigned for business purposes outside the
     *     context of FHIR.
     */
    public FHIRListBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public FHIRListBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param emptyReason - If the list is empty, why the list is empty. */
    public FHIRListBuilder.Impl withEmptyReason(@NonNull CodeableConcept emptyReason) {
      this.emptyReason = Optional.of(emptyReason);
      return this;
    }

    public FHIRListBuilder.Impl withEmptyReason(@NonNull CodeableConceptBuilder emptyReason) {
      this.emptyReason = Optional.of(emptyReason.build());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public FHIRListBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
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
    public FHIRListBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public FHIRListBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public FHIRListBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param entry - Entries in this list. */
    public FHIRListBuilder.Impl withEntry(@NonNull FHIRList.Entry... entry) {
      this.entry = Arrays.asList(entry);
      return this;
    }
    /** @param entry - Entries in this list. */
    public FHIRListBuilder.Impl withEntry(@NonNull Collection<FHIRList.Entry> entry) {
      this.entry = Collections.unmodifiableCollection(entry);
      return this;
    }

    public FHIRListBuilder.Impl withEntry(@NonNull FHIRList_EntryBuilder... entry) {
      this.entry = Arrays.stream(entry).map(e -> e.build()).collect(toList());
      return this;
    }

    public FHIRListBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public FHIRList build() {
      return new FHIRList(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          mode,
          OptionConverters.toScala(code),
          OptionConverters.toScala(date),
          note.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(title),
          status,
          OptionConverters.toScala(source),
          OptionConverters.toScala(subject),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          OptionConverters.toScala(orderedBy),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(emptyReason),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          entry.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
