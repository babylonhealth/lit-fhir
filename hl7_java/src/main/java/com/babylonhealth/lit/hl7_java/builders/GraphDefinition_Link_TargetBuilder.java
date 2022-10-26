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
import com.babylonhealth.lit.hl7.RESOURCE_TYPES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface GraphDefinition_Link_TargetBuilder {
  public GraphDefinition$Link$Target build();

  public static Impl init(RESOURCE_TYPES _type) {
    return new Impl(_type);
  }

  public static Impl builder(RESOURCE_TYPES _type) {
    return new Impl(_type);
  }

  public class Impl implements GraphDefinition_Link_TargetBuilder {
    private Optional<String> id = Optional.empty();
    private RESOURCE_TYPES _type;
    private Collection<GraphDefinition.Link> link = Collections.emptyList();
    private Optional<String> params = Optional.empty();
    private Optional<String> profile = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<GraphDefinition$Link$Target$Compartment> compartment =
        Collections.emptyList();

    /**
     * Required fields for {@link GraphDefinition$Link$Target}
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
    public GraphDefinition_Link_TargetBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param link - Links this graph makes rules about. */
    public GraphDefinition_Link_TargetBuilder.Impl withLink(@NonNull GraphDefinition.Link... link) {
      this.link = Arrays.asList(link);
      return this;
    }
    /** @param link - Links this graph makes rules about. */
    public GraphDefinition_Link_TargetBuilder.Impl withLink(
        @NonNull Collection<GraphDefinition.Link> link) {
      this.link = Collections.unmodifiableCollection(link);
      return this;
    }

    public GraphDefinition_Link_TargetBuilder.Impl withLink(
        @NonNull GraphDefinition_LinkBuilder... link) {
      this.link = Arrays.stream(link).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param params */
    public GraphDefinition_Link_TargetBuilder.Impl withParams(@NonNull String params) {
      this.params = Optional.of(params);
      return this;
    }
    /** @param profile - The profile that describes the use of the base resource. */
    public GraphDefinition_Link_TargetBuilder.Impl withProfile(@NonNull String profile) {
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
    public GraphDefinition_Link_TargetBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public GraphDefinition_Link_TargetBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public GraphDefinition_Link_TargetBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
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
    public GraphDefinition_Link_TargetBuilder.Impl withModifierExtension(
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
    public GraphDefinition_Link_TargetBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public GraphDefinition_Link_TargetBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param compartment */
    public GraphDefinition_Link_TargetBuilder.Impl withCompartment(
        @NonNull GraphDefinition$Link$Target$Compartment... compartment) {
      this.compartment = Arrays.asList(compartment);
      return this;
    }
    /** @param compartment */
    public GraphDefinition_Link_TargetBuilder.Impl withCompartment(
        @NonNull Collection<GraphDefinition$Link$Target$Compartment> compartment) {
      this.compartment = Collections.unmodifiableCollection(compartment);
      return this;
    }

    public GraphDefinition_Link_TargetBuilder.Impl withCompartment(
        @NonNull GraphDefinition_Link_Target_CompartmentBuilder... compartment) {
      this.compartment = Arrays.stream(compartment).map(e -> e.build()).collect(toList());
      return this;
    }

    public GraphDefinition$Link$Target build() {
      return new GraphDefinition$Link$Target(
          OptionConverters.toScala(id),
          _type,
          link.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(params),
          OptionConverters.toScala(profile),
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          compartment.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
