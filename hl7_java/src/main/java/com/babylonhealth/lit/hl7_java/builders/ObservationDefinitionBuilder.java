package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.PERMITTED_DATA_TYPE;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface ObservationDefinitionBuilder extends DomainResourceBuilder {
  public ObservationDefinition build();

  public static Impl init(CodeableConcept code) {
    return new Impl(code);
  }

  public static Impl builder(CodeableConceptBuilder code) {
    return new Impl(code.build());
  }

  public class Impl implements ObservationDefinitionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private CodeableConcept code;
    private Optional<CodeableConcept> method = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<CodeableConcept> category = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<PERMITTED_DATA_TYPE> permittedDataType = Collections.emptyList();
    private Optional<Reference> validCodedValueSet = Optional.empty();
    private Optional<String> preferredReportName = Optional.empty();
    private Optional<Reference> normalCodedValueSet = Optional.empty();
    private Optional<Reference> abnormalCodedValueSet = Optional.empty();
    private Optional<Reference> criticalCodedValueSet = Optional.empty();
    private Optional<Boolean> multipleResultsAllowed = Optional.empty();
    private Collection<ObservationDefinition.QualifiedInterval> qualifiedInterval =
        Collections.emptyList();
    private Optional<ObservationDefinition.QuantitativeDetails> quantitativeDetails =
        Optional.empty();

    /**
     * Required fields for {@link ObservationDefinition}
     *
     * @param code - Describes what will be observed. Sometimes this is called the observation
     *     "name".
     */
    public Impl(CodeableConcept code) {
      this.code = code;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ObservationDefinitionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public ObservationDefinitionBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public ObservationDefinitionBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param method - The method or technique used to perform the observation. */
    public ObservationDefinitionBuilder.Impl withMethod(@NonNull CodeableConcept method) {
      this.method = Optional.of(method);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withMethod(@NonNull CodeableConceptBuilder method) {
      this.method = Optional.of(method.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public ObservationDefinitionBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param category - A code that classifies the general type of observation. */
    public ObservationDefinitionBuilder.Impl withCategory(@NonNull CodeableConcept... category) {
      this.category = Arrays.asList(category);
      return this;
    }
    /** @param category - A code that classifies the general type of observation. */
    public ObservationDefinitionBuilder.Impl withCategory(
        @NonNull Collection<CodeableConcept> category) {
      this.category = Collections.unmodifiableCollection(category);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withCategory(
        @NonNull CodeableConceptBuilder... category) {
      this.category = Arrays.stream(category).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ObservationDefinitionBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ObservationDefinitionBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public ObservationDefinitionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ObservationDefinitionBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - A unique identifier assigned to this ObservationDefinition artifact. */
    public ObservationDefinitionBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - A unique identifier assigned to this ObservationDefinition artifact. */
    public ObservationDefinitionBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public ObservationDefinitionBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
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
    public ObservationDefinitionBuilder.Impl withModifierExtension(
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
    public ObservationDefinitionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param permittedDataType - The data types allowed for the value element of the instance
     *     observations conforming to this ObservationDefinition.
     */
    public ObservationDefinitionBuilder.Impl withPermittedDataType(
        @NonNull PERMITTED_DATA_TYPE... permittedDataType) {
      this.permittedDataType = Arrays.asList(permittedDataType);
      return this;
    }
    /**
     * @param permittedDataType - The data types allowed for the value element of the instance
     *     observations conforming to this ObservationDefinition.
     */
    public ObservationDefinitionBuilder.Impl withPermittedDataType(
        @NonNull Collection<PERMITTED_DATA_TYPE> permittedDataType) {
      this.permittedDataType = Collections.unmodifiableCollection(permittedDataType);
      return this;
    }
    /**
     * @param validCodedValueSet - The set of valid coded results for the observations conforming to
     *     this ObservationDefinition.
     */
    public ObservationDefinitionBuilder.Impl withValidCodedValueSet(
        @NonNull Reference validCodedValueSet) {
      this.validCodedValueSet = Optional.of(validCodedValueSet);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withValidCodedValueSet(
        @NonNull ReferenceBuilder validCodedValueSet) {
      this.validCodedValueSet = Optional.of(validCodedValueSet.build());
      return this;
    }
    /**
     * @param preferredReportName - The preferred name to be used when reporting the results of
     *     observations conforming to this ObservationDefinition.
     */
    public ObservationDefinitionBuilder.Impl withPreferredReportName(
        @NonNull String preferredReportName) {
      this.preferredReportName = Optional.of(preferredReportName);
      return this;
    }
    /**
     * @param normalCodedValueSet - The set of normal coded results for the observations conforming
     *     to this ObservationDefinition.
     */
    public ObservationDefinitionBuilder.Impl withNormalCodedValueSet(
        @NonNull Reference normalCodedValueSet) {
      this.normalCodedValueSet = Optional.of(normalCodedValueSet);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withNormalCodedValueSet(
        @NonNull ReferenceBuilder normalCodedValueSet) {
      this.normalCodedValueSet = Optional.of(normalCodedValueSet.build());
      return this;
    }
    /**
     * @param abnormalCodedValueSet - The set of abnormal coded results for the observation
     *     conforming to this ObservationDefinition.
     */
    public ObservationDefinitionBuilder.Impl withAbnormalCodedValueSet(
        @NonNull Reference abnormalCodedValueSet) {
      this.abnormalCodedValueSet = Optional.of(abnormalCodedValueSet);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withAbnormalCodedValueSet(
        @NonNull ReferenceBuilder abnormalCodedValueSet) {
      this.abnormalCodedValueSet = Optional.of(abnormalCodedValueSet.build());
      return this;
    }
    /**
     * @param criticalCodedValueSet - The set of critical coded results for the observation
     *     conforming to this ObservationDefinition.
     */
    public ObservationDefinitionBuilder.Impl withCriticalCodedValueSet(
        @NonNull Reference criticalCodedValueSet) {
      this.criticalCodedValueSet = Optional.of(criticalCodedValueSet);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withCriticalCodedValueSet(
        @NonNull ReferenceBuilder criticalCodedValueSet) {
      this.criticalCodedValueSet = Optional.of(criticalCodedValueSet.build());
      return this;
    }
    /**
     * @param multipleResultsAllowed - Multiple results allowed for observations conforming to this
     *     ObservationDefinition.
     */
    public ObservationDefinitionBuilder.Impl withMultipleResultsAllowed(
        @NonNull Boolean multipleResultsAllowed) {
      this.multipleResultsAllowed = Optional.of(multipleResultsAllowed);
      return this;
    }
    /**
     * @param qualifiedInterval - Multiple ranges of results qualified by different contexts for
     *     ordinal or continuous observations conforming to this ObservationDefinition.
     */
    public ObservationDefinitionBuilder.Impl withQualifiedInterval(
        @NonNull ObservationDefinition.QualifiedInterval... qualifiedInterval) {
      this.qualifiedInterval = Arrays.asList(qualifiedInterval);
      return this;
    }
    /**
     * @param qualifiedInterval - Multiple ranges of results qualified by different contexts for
     *     ordinal or continuous observations conforming to this ObservationDefinition.
     */
    public ObservationDefinitionBuilder.Impl withQualifiedInterval(
        @NonNull Collection<ObservationDefinition.QualifiedInterval> qualifiedInterval) {
      this.qualifiedInterval = Collections.unmodifiableCollection(qualifiedInterval);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withQualifiedInterval(
        @NonNull ObservationDefinition_QualifiedIntervalBuilder... qualifiedInterval) {
      this.qualifiedInterval =
          Arrays.stream(qualifiedInterval).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param quantitativeDetails - Characteristics for quantitative results of this observation.
     */
    public ObservationDefinitionBuilder.Impl withQuantitativeDetails(
        @NonNull ObservationDefinition.QuantitativeDetails quantitativeDetails) {
      this.quantitativeDetails = Optional.of(quantitativeDetails);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withQuantitativeDetails(
        @NonNull ObservationDefinition_QuantitativeDetailsBuilder quantitativeDetails) {
      this.quantitativeDetails = Optional.of(quantitativeDetails.build());
      return this;
    }

    public ObservationDefinitionBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public ObservationDefinition build() {
      return new ObservationDefinition(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          code,
          OptionConverters.toScala(method),
          OptionConverters.toScala(language),
          category.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          permittedDataType.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(validCodedValueSet),
          OptionConverters.toScala(preferredReportName),
          OptionConverters.toScala(normalCodedValueSet),
          OptionConverters.toScala(abnormalCodedValueSet),
          OptionConverters.toScala(criticalCodedValueSet),
          OptionConverters.toScala(multipleResultsAllowed.map(x -> (Object) x)),
          qualifiedInterval.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(quantitativeDetails),
          LitUtils.emptyMetaElMap());
    }
  }
}
