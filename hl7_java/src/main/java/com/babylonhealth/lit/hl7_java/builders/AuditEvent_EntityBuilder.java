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

public interface AuditEvent_EntityBuilder {
  public AuditEvent.Entity build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements AuditEvent_EntityBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Reference> what = Optional.empty();
    private Optional<Coding> _type = Optional.empty();
    private Optional<Coding> role = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<byte[]> query = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Coding> lifecycle = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Collection<Coding> securityLabel = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<AuditEvent$Entity$Detail> detail = Collections.emptyList();

    /** Required fields for {@link AuditEvent.Entity} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public AuditEvent_EntityBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param what */
    public AuditEvent_EntityBuilder.Impl withWhat(@NonNull Reference what) {
      this.what = Optional.of(what);
      return this;
    }

    public AuditEvent_EntityBuilder.Impl withWhat(@NonNull ReferenceBuilder what) {
      this.what = Optional.of(what.build());
      return this;
    }
    /**
     * @param _type - Identifier for a family of the event. For example, a menu item, program, rule,
     *     policy, function code, application name or URL. It identifies the performed function.
     */
    public AuditEvent_EntityBuilder.Impl withType(@NonNull Coding _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public AuditEvent_EntityBuilder.Impl withType(@NonNull CodingBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param role */
    public AuditEvent_EntityBuilder.Impl withRole(@NonNull Coding role) {
      this.role = Optional.of(role);
      return this;
    }

    public AuditEvent_EntityBuilder.Impl withRole(@NonNull CodingBuilder role) {
      this.role = Optional.of(role.build());
      return this;
    }
    /** @param name */
    public AuditEvent_EntityBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /** @param query */
    public AuditEvent_EntityBuilder.Impl withQuery(@NonNull byte[] query) {
      this.query = Optional.of(query);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public AuditEvent_EntityBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public AuditEvent_EntityBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public AuditEvent_EntityBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param lifecycle */
    public AuditEvent_EntityBuilder.Impl withLifecycle(@NonNull Coding lifecycle) {
      this.lifecycle = Optional.of(lifecycle);
      return this;
    }

    public AuditEvent_EntityBuilder.Impl withLifecycle(@NonNull CodingBuilder lifecycle) {
      this.lifecycle = Optional.of(lifecycle.build());
      return this;
    }
    /** @param description */
    public AuditEvent_EntityBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param securityLabel */
    public AuditEvent_EntityBuilder.Impl withSecurityLabel(@NonNull Coding... securityLabel) {
      this.securityLabel = Arrays.asList(securityLabel);
      return this;
    }
    /** @param securityLabel */
    public AuditEvent_EntityBuilder.Impl withSecurityLabel(
        @NonNull Collection<Coding> securityLabel) {
      this.securityLabel = Collections.unmodifiableCollection(securityLabel);
      return this;
    }

    public AuditEvent_EntityBuilder.Impl withSecurityLabel(
        @NonNull CodingBuilder... securityLabel) {
      this.securityLabel = Arrays.stream(securityLabel).map(e -> e.build()).collect(toList());
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
    public AuditEvent_EntityBuilder.Impl withModifierExtension(
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
    public AuditEvent_EntityBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public AuditEvent_EntityBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param detail */
    public AuditEvent_EntityBuilder.Impl withDetail(@NonNull AuditEvent$Entity$Detail... detail) {
      this.detail = Arrays.asList(detail);
      return this;
    }
    /** @param detail */
    public AuditEvent_EntityBuilder.Impl withDetail(
        @NonNull Collection<AuditEvent$Entity$Detail> detail) {
      this.detail = Collections.unmodifiableCollection(detail);
      return this;
    }

    public AuditEvent_EntityBuilder.Impl withDetail(
        @NonNull AuditEvent_Entity_DetailBuilder... detail) {
      this.detail = Arrays.stream(detail).map(e -> e.build()).collect(toList());
      return this;
    }

    public AuditEvent.Entity build() {
      return new AuditEvent.Entity(
          OptionConverters.toScala(id),
          OptionConverters.toScala(what),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(role),
          OptionConverters.toScala(name),
          OptionConverters.toScala(query),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(lifecycle),
          OptionConverters.toScala(description),
          securityLabel.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          detail.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
