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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class AuditEvent_EntityBuilder {
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
  public AuditEvent_EntityBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public AuditEvent_EntityBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param what */
  public AuditEvent_EntityBuilder withWhat(@NonNull Reference what) {
    this.what = Optional.of(what);
    return this;
  }
  /**
   * @param _type - Identifier for a family of the event. For example, a menu item, program, rule,
   *     policy, function code, application name or URL. It identifies the performed function.
   */
  public AuditEvent_EntityBuilder withType(@NonNull Coding _type) {
    this._type = Optional.of(_type);
    return this;
  }
  /** @param role */
  public AuditEvent_EntityBuilder withRole(@NonNull Coding role) {
    this.role = Optional.of(role);
    return this;
  }
  /** @param name */
  public AuditEvent_EntityBuilder withName(@NonNull String name) {
    this.name = Optional.of(name);
    return this;
  }
  /** @param query */
  public AuditEvent_EntityBuilder withQuery(@NonNull byte[] query) {
    this.query = Optional.of(query);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public AuditEvent_EntityBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public AuditEvent_EntityBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param lifecycle */
  public AuditEvent_EntityBuilder withLifecycle(@NonNull Coding lifecycle) {
    this.lifecycle = Optional.of(lifecycle);
    return this;
  }
  /** @param description */
  public AuditEvent_EntityBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /** @param securityLabel */
  public AuditEvent_EntityBuilder withSecurityLabel(@NonNull Coding... securityLabel) {
    this.securityLabel = Arrays.asList(securityLabel);
    return this;
  }
  /** @param securityLabel */
  public AuditEvent_EntityBuilder withSecurityLabel(@NonNull Collection<Coding> securityLabel) {
    this.securityLabel = Collections.unmodifiableCollection(securityLabel);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public AuditEvent_EntityBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public AuditEvent_EntityBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param detail */
  public AuditEvent_EntityBuilder withDetail(@NonNull AuditEvent$Entity$Detail... detail) {
    this.detail = Arrays.asList(detail);
    return this;
  }
  /** @param detail */
  public AuditEvent_EntityBuilder withDetail(@NonNull Collection<AuditEvent$Entity$Detail> detail) {
    this.detail = Collections.unmodifiableCollection(detail);
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
