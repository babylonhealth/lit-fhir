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
import com.babylonhealth.lit.hl7.RESTFUL_CAPABILITY_MODE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface CapabilityStatement_RestBuilder {
  public CapabilityStatement.Rest build();

  public static Impl init(RESTFUL_CAPABILITY_MODE mode) {
    return new Impl(mode);
  }

  public static Impl builder(RESTFUL_CAPABILITY_MODE mode) {
    return new Impl(mode);
  }

  public class Impl implements CapabilityStatement_RestBuilder {
    private Optional<String> id = Optional.empty();
    private RESTFUL_CAPABILITY_MODE mode;
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<CapabilityStatement$Rest$Resource$Operation> operation =
        Collections.emptyList();
    private Collection<CapabilityStatement$Rest$Resource$SearchParam> searchParam =
        Collections.emptyList();
    private Collection<String> compartment = Collections.emptyList();
    private Optional<String> documentation = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CapabilityStatement$Rest$Security> security = Optional.empty();
    private Collection<CapabilityStatement$Rest$Interaction> interaction = Collections.emptyList();
    private Collection<CapabilityStatement$Rest$Resource> resource = Collections.emptyList();

    /**
     * Required fields for {@link CapabilityStatement.Rest}
     *
     * @param mode
     */
    public Impl(RESTFUL_CAPABILITY_MODE mode) {
      this.mode = mode;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public CapabilityStatement_RestBuilder.Impl withId(@NonNull String id) {
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
    public CapabilityStatement_RestBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public CapabilityStatement_RestBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public CapabilityStatement_RestBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param operation */
    public CapabilityStatement_RestBuilder.Impl withOperation(
        @NonNull CapabilityStatement$Rest$Resource$Operation... operation) {
      this.operation = Arrays.asList(operation);
      return this;
    }
    /** @param operation */
    public CapabilityStatement_RestBuilder.Impl withOperation(
        @NonNull Collection<CapabilityStatement$Rest$Resource$Operation> operation) {
      this.operation = Collections.unmodifiableCollection(operation);
      return this;
    }

    public CapabilityStatement_RestBuilder.Impl withOperation(
        @NonNull CapabilityStatement_Rest_Resource_OperationBuilder... operation) {
      this.operation = Arrays.stream(operation).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param searchParam */
    public CapabilityStatement_RestBuilder.Impl withSearchParam(
        @NonNull CapabilityStatement$Rest$Resource$SearchParam... searchParam) {
      this.searchParam = Arrays.asList(searchParam);
      return this;
    }
    /** @param searchParam */
    public CapabilityStatement_RestBuilder.Impl withSearchParam(
        @NonNull Collection<CapabilityStatement$Rest$Resource$SearchParam> searchParam) {
      this.searchParam = Collections.unmodifiableCollection(searchParam);
      return this;
    }

    public CapabilityStatement_RestBuilder.Impl withSearchParam(
        @NonNull CapabilityStatement_Rest_Resource_SearchParamBuilder... searchParam) {
      this.searchParam = Arrays.stream(searchParam).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param compartment */
    public CapabilityStatement_RestBuilder.Impl withCompartment(@NonNull String... compartment) {
      this.compartment = Arrays.asList(compartment);
      return this;
    }
    /** @param compartment */
    public CapabilityStatement_RestBuilder.Impl withCompartment(
        @NonNull Collection<String> compartment) {
      this.compartment = Collections.unmodifiableCollection(compartment);
      return this;
    }
    /** @param documentation */
    public CapabilityStatement_RestBuilder.Impl withDocumentation(@NonNull String documentation) {
      this.documentation = Optional.of(documentation);
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
    public CapabilityStatement_RestBuilder.Impl withModifierExtension(
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
    public CapabilityStatement_RestBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public CapabilityStatement_RestBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param security */
    public CapabilityStatement_RestBuilder.Impl withSecurity(
        @NonNull CapabilityStatement$Rest$Security security) {
      this.security = Optional.of(security);
      return this;
    }

    public CapabilityStatement_RestBuilder.Impl withSecurity(
        @NonNull CapabilityStatement_Rest_SecurityBuilder security) {
      this.security = Optional.of(security.build());
      return this;
    }
    /** @param interaction */
    public CapabilityStatement_RestBuilder.Impl withInteraction(
        @NonNull CapabilityStatement$Rest$Interaction... interaction) {
      this.interaction = Arrays.asList(interaction);
      return this;
    }
    /** @param interaction */
    public CapabilityStatement_RestBuilder.Impl withInteraction(
        @NonNull Collection<CapabilityStatement$Rest$Interaction> interaction) {
      this.interaction = Collections.unmodifiableCollection(interaction);
      return this;
    }

    public CapabilityStatement_RestBuilder.Impl withInteraction(
        @NonNull CapabilityStatement_Rest_InteractionBuilder... interaction) {
      this.interaction = Arrays.stream(interaction).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param resource */
    public CapabilityStatement_RestBuilder.Impl withResource(
        @NonNull CapabilityStatement$Rest$Resource... resource) {
      this.resource = Arrays.asList(resource);
      return this;
    }
    /** @param resource */
    public CapabilityStatement_RestBuilder.Impl withResource(
        @NonNull Collection<CapabilityStatement$Rest$Resource> resource) {
      this.resource = Collections.unmodifiableCollection(resource);
      return this;
    }

    public CapabilityStatement_RestBuilder.Impl withResource(
        @NonNull CapabilityStatement_Rest_ResourceBuilder... resource) {
      this.resource = Arrays.stream(resource).map(e -> e.build()).collect(toList());
      return this;
    }

    public CapabilityStatement.Rest build() {
      return new CapabilityStatement.Rest(
          OptionConverters.toScala(id),
          mode,
          extension.stream().collect(new LitSeqJCollector<>()),
          operation.stream().collect(new LitSeqJCollector<>()),
          searchParam.stream().collect(new LitSeqJCollector<>()),
          compartment.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(documentation),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(security),
          interaction.stream().collect(new LitSeqJCollector<>()),
          resource.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
