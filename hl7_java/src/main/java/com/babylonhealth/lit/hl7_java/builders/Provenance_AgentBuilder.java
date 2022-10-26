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

public interface Provenance_AgentBuilder {
  public Provenance.Agent build();

  public static Impl init(Reference who) {
    return new Impl(who);
  }

  public static Impl builder(ReferenceBuilder who) {
    return new Impl(who.build());
  }

  public class Impl implements Provenance_AgentBuilder {
    private Optional<String> id = Optional.empty();
    private Reference who;
    private Optional<CodeableConcept> _type = Optional.empty();
    private Collection<CodeableConcept> role = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> onBehalfOf = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link Provenance.Agent}
     *
     * @param who
     */
    public Impl(Reference who) {
      this.who = who;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Provenance_AgentBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param _type */
    public Provenance_AgentBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public Provenance_AgentBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param role */
    public Provenance_AgentBuilder.Impl withRole(@NonNull CodeableConcept... role) {
      this.role = Arrays.asList(role);
      return this;
    }
    /** @param role */
    public Provenance_AgentBuilder.Impl withRole(@NonNull Collection<CodeableConcept> role) {
      this.role = Collections.unmodifiableCollection(role);
      return this;
    }

    public Provenance_AgentBuilder.Impl withRole(@NonNull CodeableConceptBuilder... role) {
      this.role = Arrays.stream(role).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Provenance_AgentBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Provenance_AgentBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Provenance_AgentBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param onBehalfOf */
    public Provenance_AgentBuilder.Impl withOnBehalfOf(@NonNull Reference onBehalfOf) {
      this.onBehalfOf = Optional.of(onBehalfOf);
      return this;
    }

    public Provenance_AgentBuilder.Impl withOnBehalfOf(@NonNull ReferenceBuilder onBehalfOf) {
      this.onBehalfOf = Optional.of(onBehalfOf.build());
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
    public Provenance_AgentBuilder.Impl withModifierExtension(
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
    public Provenance_AgentBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Provenance_AgentBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Provenance.Agent build() {
      return new Provenance.Agent(
          OptionConverters.toScala(id),
          who,
          OptionConverters.toScala(_type),
          role.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(onBehalfOf),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
