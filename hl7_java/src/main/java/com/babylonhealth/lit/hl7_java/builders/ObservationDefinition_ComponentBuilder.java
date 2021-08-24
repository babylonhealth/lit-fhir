package com.babylonhealth.lit.hl7_java.builders;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import scala.math.BigDecimal;
import scala.Option;
import scala.collection.immutable.Seq;
import scala.jdk.javaapi.CollectionConverters;
import scala.jdk.javaapi.OptionConverters;

import lombok.NonNull;

import com.babylonhealth.lit.core.FHIRComponentFieldMeta;
import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.FHIRDate;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeq$;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.Choice$;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.hl7.PERMITTED_DATA_TYPE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface ObservationDefinition_ComponentBuilder {
  public ObservationDefinition.Component build();

  public static Impl init(CodeableConcept code) {
    return new Impl(code);
  }

  public static Impl builder(CodeableConceptBuilder code) {
    return new Impl(code.build());
  }

  public class Impl implements ObservationDefinition_ComponentBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept code;
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<ObservationDefinition.QualifiedValue> qualifiedValue =
        Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<PERMITTED_DATA_TYPE> permittedDataType = Collections.emptyList();
    private Optional<ObservationDefinition.QuantitativeDetails> quantitativeDetails =
        Optional.empty();

    /**
     * Required fields for {@link ObservationDefinition.Component}
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
    public ObservationDefinition_ComponentBuilder.Impl withId(@NonNull String id) {
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
    public ObservationDefinition_ComponentBuilder.Impl withExtension(
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
    public ObservationDefinition_ComponentBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ObservationDefinition_ComponentBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param qualifiedValue - A set of qualified values associated with a context and a set of
     *     conditions - provides a range for quantitative and ordinal observations and a collection
     *     of value sets for qualitative observations.
     */
    public ObservationDefinition_ComponentBuilder.Impl withQualifiedValue(
        @NonNull ObservationDefinition.QualifiedValue... qualifiedValue) {
      this.qualifiedValue = Arrays.asList(qualifiedValue);
      return this;
    }
    /**
     * @param qualifiedValue - A set of qualified values associated with a context and a set of
     *     conditions - provides a range for quantitative and ordinal observations and a collection
     *     of value sets for qualitative observations.
     */
    public ObservationDefinition_ComponentBuilder.Impl withQualifiedValue(
        @NonNull Collection<ObservationDefinition.QualifiedValue> qualifiedValue) {
      this.qualifiedValue = Collections.unmodifiableCollection(qualifiedValue);
      return this;
    }

    public ObservationDefinition_ComponentBuilder.Impl withQualifiedValue(
        @NonNull ObservationDefinition_QualifiedValueBuilder... qualifiedValue) {
      this.qualifiedValue = Arrays.stream(qualifiedValue).map(e -> e.build()).collect(toList());
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
    public ObservationDefinition_ComponentBuilder.Impl withModifierExtension(
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
    public ObservationDefinition_ComponentBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ObservationDefinition_ComponentBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param permittedDataType - The data types allowed for the value element of the instance
     *     observations conforming to this ObservationDefinition.
     */
    public ObservationDefinition_ComponentBuilder.Impl withPermittedDataType(
        @NonNull PERMITTED_DATA_TYPE... permittedDataType) {
      this.permittedDataType = Arrays.asList(permittedDataType);
      return this;
    }
    /**
     * @param permittedDataType - The data types allowed for the value element of the instance
     *     observations conforming to this ObservationDefinition.
     */
    public ObservationDefinition_ComponentBuilder.Impl withPermittedDataType(
        @NonNull Collection<PERMITTED_DATA_TYPE> permittedDataType) {
      this.permittedDataType = Collections.unmodifiableCollection(permittedDataType);
      return this;
    }
    /**
     * @param quantitativeDetails - Characteristics for quantitative results of observations
     *     conforming to this ObservationDefinition.
     */
    public ObservationDefinition_ComponentBuilder.Impl withQuantitativeDetails(
        @NonNull ObservationDefinition.QuantitativeDetails quantitativeDetails) {
      this.quantitativeDetails = Optional.of(quantitativeDetails);
      return this;
    }

    public ObservationDefinition_ComponentBuilder.Impl withQuantitativeDetails(
        @NonNull ObservationDefinition_QuantitativeDetailsBuilder quantitativeDetails) {
      this.quantitativeDetails = Optional.of(quantitativeDetails.build());
      return this;
    }

    public ObservationDefinition.Component build() {
      return new ObservationDefinition.Component(
          OptionConverters.toScala(id),
          code,
          extension.stream().collect(new LitSeqJCollector<>()),
          qualifiedValue.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          permittedDataType.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(quantitativeDetails),
          LitUtils.emptyMetaElMap());
    }
  }
}
