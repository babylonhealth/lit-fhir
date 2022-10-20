package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.CONDITIONAL_DELETE_STATUS;
import com.babylonhealth.lit.hl7.CONDITIONAL_READ_STATUS;
import com.babylonhealth.lit.hl7.REFERENCE_HANDLING_POLICY;
import com.babylonhealth.lit.hl7.RESOURCE_TYPES;
import com.babylonhealth.lit.hl7.VERSIONING_POLICY;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface CapabilityStatement_Rest_ResourceBuilder {
  public CapabilityStatement$Rest$Resource build();

  public static Impl init(RESOURCE_TYPES _type) {
    return new Impl(_type);
  }

  public static Impl builder(RESOURCE_TYPES _type) {
    return new Impl(_type);
  }

  public class Impl implements CapabilityStatement_Rest_ResourceBuilder {
    private Optional<String> id = Optional.empty();
    private RESOURCE_TYPES _type;
    private Optional<String> profile = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<VERSIONING_POLICY> versioning = Optional.empty();
    private Optional<Boolean> readHistory = Optional.empty();
    private Optional<Boolean> updateCreate = Optional.empty();
    private Optional<String> documentation = Optional.empty();
    private Collection<String> searchInclude = Collections.emptyList();
    private Optional<CONDITIONAL_READ_STATUS> conditionalRead = Optional.empty();
    private Collection<REFERENCE_HANDLING_POLICY> referencePolicy = Collections.emptyList();
    private Collection<String> supportedProfile = Collections.emptyList();
    private Collection<String> searchRevInclude = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Boolean> conditionalCreate = Optional.empty();
    private Optional<Boolean> conditionalUpdate = Optional.empty();
    private Optional<CONDITIONAL_DELETE_STATUS> conditionalDelete = Optional.empty();
    private Collection<CapabilityStatement$Rest$Resource$Operation> operation =
        Collections.emptyList();
    private Collection<CapabilityStatement$Rest$Resource$Interaction> interaction =
        Collections.emptyList();
    private Collection<CapabilityStatement$Rest$Resource$SearchParam> searchParam =
        Collections.emptyList();

    /**
     * Required fields for {@link CapabilityStatement$Rest$Resource}
     *
     * @param _type
     */
    public Impl(RESOURCE_TYPES _type) {
      this._type = _type;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param profile */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withProfile(@NonNull String profile) {
      this.profile = Optional.of(profile);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withExtension(
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
    public CapabilityStatement_Rest_ResourceBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public CapabilityStatement_Rest_ResourceBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param versioning */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withVersioning(
        @NonNull VERSIONING_POLICY versioning) {
      this.versioning = Optional.of(versioning);
      return this;
    }
    /** @param readHistory */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withReadHistory(
        @NonNull Boolean readHistory) {
      this.readHistory = Optional.of(readHistory);
      return this;
    }
    /** @param updateCreate */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withUpdateCreate(
        @NonNull Boolean updateCreate) {
      this.updateCreate = Optional.of(updateCreate);
      return this;
    }
    /** @param documentation */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withDocumentation(
        @NonNull String documentation) {
      this.documentation = Optional.of(documentation);
      return this;
    }
    /** @param searchInclude */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withSearchInclude(
        @NonNull String... searchInclude) {
      this.searchInclude = Arrays.asList(searchInclude);
      return this;
    }
    /** @param searchInclude */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withSearchInclude(
        @NonNull Collection<String> searchInclude) {
      this.searchInclude = Collections.unmodifiableCollection(searchInclude);
      return this;
    }
    /** @param conditionalRead */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withConditionalRead(
        @NonNull CONDITIONAL_READ_STATUS conditionalRead) {
      this.conditionalRead = Optional.of(conditionalRead);
      return this;
    }
    /** @param referencePolicy */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withReferencePolicy(
        @NonNull REFERENCE_HANDLING_POLICY... referencePolicy) {
      this.referencePolicy = Arrays.asList(referencePolicy);
      return this;
    }
    /** @param referencePolicy */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withReferencePolicy(
        @NonNull Collection<REFERENCE_HANDLING_POLICY> referencePolicy) {
      this.referencePolicy = Collections.unmodifiableCollection(referencePolicy);
      return this;
    }
    /** @param supportedProfile */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withSupportedProfile(
        @NonNull String... supportedProfile) {
      this.supportedProfile = Arrays.asList(supportedProfile);
      return this;
    }
    /** @param supportedProfile */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withSupportedProfile(
        @NonNull Collection<String> supportedProfile) {
      this.supportedProfile = Collections.unmodifiableCollection(supportedProfile);
      return this;
    }
    /** @param searchRevInclude */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withSearchRevInclude(
        @NonNull String... searchRevInclude) {
      this.searchRevInclude = Arrays.asList(searchRevInclude);
      return this;
    }
    /** @param searchRevInclude */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withSearchRevInclude(
        @NonNull Collection<String> searchRevInclude) {
      this.searchRevInclude = Collections.unmodifiableCollection(searchRevInclude);
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
    public CapabilityStatement_Rest_ResourceBuilder.Impl withModifierExtension(
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
    public CapabilityStatement_Rest_ResourceBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public CapabilityStatement_Rest_ResourceBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param conditionalCreate */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withConditionalCreate(
        @NonNull Boolean conditionalCreate) {
      this.conditionalCreate = Optional.of(conditionalCreate);
      return this;
    }
    /** @param conditionalUpdate */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withConditionalUpdate(
        @NonNull Boolean conditionalUpdate) {
      this.conditionalUpdate = Optional.of(conditionalUpdate);
      return this;
    }
    /** @param conditionalDelete */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withConditionalDelete(
        @NonNull CONDITIONAL_DELETE_STATUS conditionalDelete) {
      this.conditionalDelete = Optional.of(conditionalDelete);
      return this;
    }
    /** @param operation */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withOperation(
        @NonNull CapabilityStatement$Rest$Resource$Operation... operation) {
      this.operation = Arrays.asList(operation);
      return this;
    }
    /** @param operation */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withOperation(
        @NonNull Collection<CapabilityStatement$Rest$Resource$Operation> operation) {
      this.operation = Collections.unmodifiableCollection(operation);
      return this;
    }

    public CapabilityStatement_Rest_ResourceBuilder.Impl withOperation(
        @NonNull CapabilityStatement_Rest_Resource_OperationBuilder... operation) {
      this.operation = Arrays.stream(operation).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param interaction */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withInteraction(
        @NonNull CapabilityStatement$Rest$Resource$Interaction... interaction) {
      this.interaction = Arrays.asList(interaction);
      return this;
    }
    /** @param interaction */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withInteraction(
        @NonNull Collection<CapabilityStatement$Rest$Resource$Interaction> interaction) {
      this.interaction = Collections.unmodifiableCollection(interaction);
      return this;
    }

    public CapabilityStatement_Rest_ResourceBuilder.Impl withInteraction(
        @NonNull CapabilityStatement_Rest_Resource_InteractionBuilder... interaction) {
      this.interaction = Arrays.stream(interaction).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param searchParam */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withSearchParam(
        @NonNull CapabilityStatement$Rest$Resource$SearchParam... searchParam) {
      this.searchParam = Arrays.asList(searchParam);
      return this;
    }
    /** @param searchParam */
    public CapabilityStatement_Rest_ResourceBuilder.Impl withSearchParam(
        @NonNull Collection<CapabilityStatement$Rest$Resource$SearchParam> searchParam) {
      this.searchParam = Collections.unmodifiableCollection(searchParam);
      return this;
    }

    public CapabilityStatement_Rest_ResourceBuilder.Impl withSearchParam(
        @NonNull CapabilityStatement_Rest_Resource_SearchParamBuilder... searchParam) {
      this.searchParam = Arrays.stream(searchParam).map(e -> e.build()).collect(toList());
      return this;
    }

    public CapabilityStatement$Rest$Resource build() {
      return new CapabilityStatement$Rest$Resource(
          OptionConverters.toScala(id),
          _type,
          OptionConverters.toScala(profile),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(versioning),
          OptionConverters.toScala(readHistory.map(x -> (Object) x)),
          OptionConverters.toScala(updateCreate.map(x -> (Object) x)),
          OptionConverters.toScala(documentation),
          searchInclude.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(conditionalRead),
          referencePolicy.stream().collect(new LitSeqJCollector<>()),
          supportedProfile.stream().collect(new LitSeqJCollector<>()),
          searchRevInclude.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(conditionalCreate.map(x -> (Object) x)),
          OptionConverters.toScala(conditionalUpdate.map(x -> (Object) x)),
          OptionConverters.toScala(conditionalDelete),
          operation.stream().collect(new LitSeqJCollector<>()),
          interaction.stream().collect(new LitSeqJCollector<>()),
          searchParam.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
