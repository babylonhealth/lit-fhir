package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.REFERENCE_VERSION_RULES;
import com.babylonhealth.lit.hl7.RESOURCE_AGGREGATION_MODE;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface ElementDefinition_TypeBuilder {
  public ElementDefinition.Type build();

  public static Impl init(String code) {
    return new Impl(code);
  }

  public static Impl builder(String code) {
    return new Impl(code);
  }

  public class Impl implements ElementDefinition_TypeBuilder {
    private Optional<String> id = Optional.empty();
    private String code;
    private Collection<String> profile = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<REFERENCE_VERSION_RULES> versioning = Optional.empty();
    private Collection<RESOURCE_AGGREGATION_MODE> aggregation = Collections.emptyList();
    private Collection<String> targetProfile = Collections.emptyList();

    /**
     * Required fields for {@link ElementDefinition.Type}
     *
     * @param code - A code that has the same meaning as the element in a particular terminology.
     */
    public Impl(String code) {
      this.code = code;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public ElementDefinition_TypeBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param profile */
    public ElementDefinition_TypeBuilder.Impl withProfile(@NonNull String... profile) {
      this.profile = Arrays.asList(profile);
      return this;
    }
    /** @param profile */
    public ElementDefinition_TypeBuilder.Impl withProfile(@NonNull Collection<String> profile) {
      this.profile = Collections.unmodifiableCollection(profile);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public ElementDefinition_TypeBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public ElementDefinition_TypeBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ElementDefinition_TypeBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param versioning */
    public ElementDefinition_TypeBuilder.Impl withVersioning(
        @NonNull REFERENCE_VERSION_RULES versioning) {
      this.versioning = Optional.of(versioning);
      return this;
    }
    /** @param aggregation */
    public ElementDefinition_TypeBuilder.Impl withAggregation(
        @NonNull RESOURCE_AGGREGATION_MODE... aggregation) {
      this.aggregation = Arrays.asList(aggregation);
      return this;
    }
    /** @param aggregation */
    public ElementDefinition_TypeBuilder.Impl withAggregation(
        @NonNull Collection<RESOURCE_AGGREGATION_MODE> aggregation) {
      this.aggregation = Collections.unmodifiableCollection(aggregation);
      return this;
    }
    /** @param targetProfile */
    public ElementDefinition_TypeBuilder.Impl withTargetProfile(@NonNull String... targetProfile) {
      this.targetProfile = Arrays.asList(targetProfile);
      return this;
    }
    /** @param targetProfile */
    public ElementDefinition_TypeBuilder.Impl withTargetProfile(
        @NonNull Collection<String> targetProfile) {
      this.targetProfile = Collections.unmodifiableCollection(targetProfile);
      return this;
    }

    public ElementDefinition.Type build() {
      return new ElementDefinition.Type(
          OptionConverters.toScala(id),
          code,
          profile.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(versioning),
          aggregation.stream().collect(new LitSeqJCollector<>()),
          targetProfile.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
