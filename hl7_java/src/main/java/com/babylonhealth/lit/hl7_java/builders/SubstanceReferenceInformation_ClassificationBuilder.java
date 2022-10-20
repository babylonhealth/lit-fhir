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

public interface SubstanceReferenceInformation_ClassificationBuilder {
  public SubstanceReferenceInformation.Classification build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SubstanceReferenceInformation_ClassificationBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> domain = Optional.empty();
    private Collection<Reference> source = Collections.emptyList();
    private Collection<CodeableConcept> subtype = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<CodeableConcept> classification = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link SubstanceReferenceInformation.Classification} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstanceReferenceInformation_ClassificationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param domain */
    public SubstanceReferenceInformation_ClassificationBuilder.Impl withDomain(
        @NonNull CodeableConcept domain) {
      this.domain = Optional.of(domain);
      return this;
    }

    public SubstanceReferenceInformation_ClassificationBuilder.Impl withDomain(
        @NonNull CodeableConceptBuilder domain) {
      this.domain = Optional.of(domain.build());
      return this;
    }
    /** @param source */
    public SubstanceReferenceInformation_ClassificationBuilder.Impl withSource(
        @NonNull Reference... source) {
      this.source = Arrays.asList(source);
      return this;
    }
    /** @param source */
    public SubstanceReferenceInformation_ClassificationBuilder.Impl withSource(
        @NonNull Collection<Reference> source) {
      this.source = Collections.unmodifiableCollection(source);
      return this;
    }

    public SubstanceReferenceInformation_ClassificationBuilder.Impl withSource(
        @NonNull ReferenceBuilder... source) {
      this.source = Arrays.stream(source).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param subtype */
    public SubstanceReferenceInformation_ClassificationBuilder.Impl withSubtype(
        @NonNull CodeableConcept... subtype) {
      this.subtype = Arrays.asList(subtype);
      return this;
    }
    /** @param subtype */
    public SubstanceReferenceInformation_ClassificationBuilder.Impl withSubtype(
        @NonNull Collection<CodeableConcept> subtype) {
      this.subtype = Collections.unmodifiableCollection(subtype);
      return this;
    }

    public SubstanceReferenceInformation_ClassificationBuilder.Impl withSubtype(
        @NonNull CodeableConceptBuilder... subtype) {
      this.subtype = Arrays.stream(subtype).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SubstanceReferenceInformation_ClassificationBuilder.Impl withExtension(
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
    public SubstanceReferenceInformation_ClassificationBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceReferenceInformation_ClassificationBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param classification - Todo. */
    public SubstanceReferenceInformation_ClassificationBuilder.Impl withClassification(
        @NonNull CodeableConcept classification) {
      this.classification = Optional.of(classification);
      return this;
    }

    public SubstanceReferenceInformation_ClassificationBuilder.Impl withClassification(
        @NonNull CodeableConceptBuilder classification) {
      this.classification = Optional.of(classification.build());
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
    public SubstanceReferenceInformation_ClassificationBuilder.Impl withModifierExtension(
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
    public SubstanceReferenceInformation_ClassificationBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstanceReferenceInformation_ClassificationBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public SubstanceReferenceInformation.Classification build() {
      return new SubstanceReferenceInformation.Classification(
          OptionConverters.toScala(id),
          OptionConverters.toScala(domain),
          source.stream().collect(new LitSeqJCollector<>()),
          subtype.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(classification),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
