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

public interface SubstanceSpecification_NameBuilder {
  public SubstanceSpecification.Name build();

  public static Impl init(String name) {
    return new Impl(name);
  }

  public static Impl builder(String name) {
    return new Impl(name);
  }

  public class Impl implements SubstanceSpecification_NameBuilder {
    private Optional<String> id = Optional.empty();
    private String name;
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<CodeableConcept> status = Optional.empty();
    private Collection<CodeableConcept> domain = Collections.emptyList();
    private Collection<Reference> source = Collections.emptyList();
    private Collection<SubstanceSpecification.Name> synonym = Collections.emptyList();
    private Collection<CodeableConcept> language = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Boolean> preferred = Optional.empty();
    private Collection<SubstanceSpecification.Name> translation = Collections.emptyList();
    private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<SubstanceSpecification$Name$Official> official = Collections.emptyList();

    /**
     * Required fields for {@link SubstanceSpecification.Name}
     *
     * @param name - Names applicable to this substance.
     */
    public Impl(String name) {
      this.name = name;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstanceSpecification_NameBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param _type - High level categorization, e.g. polymer or nucleic acid. */
    public SubstanceSpecification_NameBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public SubstanceSpecification_NameBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param status - Status of substance within the catalogue e.g. approved. */
    public SubstanceSpecification_NameBuilder.Impl withStatus(@NonNull CodeableConcept status) {
      this.status = Optional.of(status);
      return this;
    }

    public SubstanceSpecification_NameBuilder.Impl withStatus(
        @NonNull CodeableConceptBuilder status) {
      this.status = Optional.of(status.build());
      return this;
    }
    /** @param domain - If the substance applies to only human or veterinary use. */
    public SubstanceSpecification_NameBuilder.Impl withDomain(@NonNull CodeableConcept... domain) {
      this.domain = Arrays.asList(domain);
      return this;
    }
    /** @param domain - If the substance applies to only human or veterinary use. */
    public SubstanceSpecification_NameBuilder.Impl withDomain(
        @NonNull Collection<CodeableConcept> domain) {
      this.domain = Collections.unmodifiableCollection(domain);
      return this;
    }

    public SubstanceSpecification_NameBuilder.Impl withDomain(
        @NonNull CodeableConceptBuilder... domain) {
      this.domain = Arrays.stream(domain).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param source - Supporting literature. */
    public SubstanceSpecification_NameBuilder.Impl withSource(@NonNull Reference... source) {
      this.source = Arrays.asList(source);
      return this;
    }
    /** @param source - Supporting literature. */
    public SubstanceSpecification_NameBuilder.Impl withSource(
        @NonNull Collection<Reference> source) {
      this.source = Collections.unmodifiableCollection(source);
      return this;
    }

    public SubstanceSpecification_NameBuilder.Impl withSource(@NonNull ReferenceBuilder... source) {
      this.source = Arrays.stream(source).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param synonym */
    public SubstanceSpecification_NameBuilder.Impl withSynonym(
        @NonNull SubstanceSpecification.Name... synonym) {
      this.synonym = Arrays.asList(synonym);
      return this;
    }
    /** @param synonym */
    public SubstanceSpecification_NameBuilder.Impl withSynonym(
        @NonNull Collection<SubstanceSpecification.Name> synonym) {
      this.synonym = Collections.unmodifiableCollection(synonym);
      return this;
    }

    public SubstanceSpecification_NameBuilder.Impl withSynonym(
        @NonNull SubstanceSpecification_NameBuilder... synonym) {
      this.synonym = Arrays.stream(synonym).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public SubstanceSpecification_NameBuilder.Impl withLanguage(
        @NonNull CodeableConcept... language) {
      this.language = Arrays.asList(language);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public SubstanceSpecification_NameBuilder.Impl withLanguage(
        @NonNull Collection<CodeableConcept> language) {
      this.language = Collections.unmodifiableCollection(language);
      return this;
    }

    public SubstanceSpecification_NameBuilder.Impl withLanguage(
        @NonNull CodeableConceptBuilder... language) {
      this.language = Arrays.stream(language).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SubstanceSpecification_NameBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public SubstanceSpecification_NameBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceSpecification_NameBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param preferred */
    public SubstanceSpecification_NameBuilder.Impl withPreferred(@NonNull Boolean preferred) {
      this.preferred = Optional.of(preferred);
      return this;
    }
    /** @param translation */
    public SubstanceSpecification_NameBuilder.Impl withTranslation(
        @NonNull SubstanceSpecification.Name... translation) {
      this.translation = Arrays.asList(translation);
      return this;
    }
    /** @param translation */
    public SubstanceSpecification_NameBuilder.Impl withTranslation(
        @NonNull Collection<SubstanceSpecification.Name> translation) {
      this.translation = Collections.unmodifiableCollection(translation);
      return this;
    }

    public SubstanceSpecification_NameBuilder.Impl withTranslation(
        @NonNull SubstanceSpecification_NameBuilder... translation) {
      this.translation = Arrays.stream(translation).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param jurisdiction */
    public SubstanceSpecification_NameBuilder.Impl withJurisdiction(
        @NonNull CodeableConcept... jurisdiction) {
      this.jurisdiction = Arrays.asList(jurisdiction);
      return this;
    }
    /** @param jurisdiction */
    public SubstanceSpecification_NameBuilder.Impl withJurisdiction(
        @NonNull Collection<CodeableConcept> jurisdiction) {
      this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
      return this;
    }

    public SubstanceSpecification_NameBuilder.Impl withJurisdiction(
        @NonNull CodeableConceptBuilder... jurisdiction) {
      this.jurisdiction = Arrays.stream(jurisdiction).map(e -> e.build()).collect(toList());
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
    public SubstanceSpecification_NameBuilder.Impl withModifierExtension(
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
    public SubstanceSpecification_NameBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstanceSpecification_NameBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param official */
    public SubstanceSpecification_NameBuilder.Impl withOfficial(
        @NonNull SubstanceSpecification$Name$Official... official) {
      this.official = Arrays.asList(official);
      return this;
    }
    /** @param official */
    public SubstanceSpecification_NameBuilder.Impl withOfficial(
        @NonNull Collection<SubstanceSpecification$Name$Official> official) {
      this.official = Collections.unmodifiableCollection(official);
      return this;
    }

    public SubstanceSpecification_NameBuilder.Impl withOfficial(
        @NonNull SubstanceSpecification_Name_OfficialBuilder... official) {
      this.official = Arrays.stream(official).map(e -> e.build()).collect(toList());
      return this;
    }

    public SubstanceSpecification.Name build() {
      return new SubstanceSpecification.Name(
          OptionConverters.toScala(id),
          name,
          OptionConverters.toScala(_type),
          OptionConverters.toScala(status),
          domain.stream().collect(new LitSeqJCollector<>()),
          source.stream().collect(new LitSeqJCollector<>()),
          synonym.stream().collect(new LitSeqJCollector<>()),
          language.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(preferred.map(x -> (Object) x)),
          translation.stream().collect(new LitSeqJCollector<>()),
          jurisdiction.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          official.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
