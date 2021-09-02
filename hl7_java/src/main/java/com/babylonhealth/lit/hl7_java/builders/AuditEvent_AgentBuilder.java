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

public class AuditEvent_AgentBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Reference> who = Optional.empty();
  private Optional<CodeableConcept> _type = Optional.empty();
  private Collection<CodeableConcept> role = Collections.emptyList();
  private Optional<String> name = Optional.empty();
  private Optional<String> altId = Optional.empty();
  private Optional<Coding> media = Optional.empty();
  private Collection<String> policy = Collections.emptyList();
  private Optional<Reference> location = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Boolean requestor;
  private Collection<CodeableConcept> purposeOfUse = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<AuditEvent$Agent$Network> network = Optional.empty();

  /**
   * Required fields for {@link AuditEvent.Agent}
   *
   * @param requestor
   */
  public AuditEvent_AgentBuilder(Boolean requestor) {
    this.requestor = requestor;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public AuditEvent_AgentBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param who */
  public AuditEvent_AgentBuilder withWho(@NonNull Reference who) {
    this.who = Optional.of(who);
    return this;
  }
  /**
   * @param _type - Identifier for a family of the event. For example, a menu item, program, rule,
   *     policy, function code, application name or URL. It identifies the performed function.
   */
  public AuditEvent_AgentBuilder withType(@NonNull CodeableConcept _type) {
    this._type = Optional.of(_type);
    return this;
  }
  /** @param role */
  public AuditEvent_AgentBuilder withRole(@NonNull CodeableConcept... role) {
    this.role = Arrays.asList(role);
    return this;
  }
  /** @param role */
  public AuditEvent_AgentBuilder withRole(@NonNull Collection<CodeableConcept> role) {
    this.role = Collections.unmodifiableCollection(role);
    return this;
  }
  /** @param name */
  public AuditEvent_AgentBuilder withName(@NonNull String name) {
    this.name = Optional.of(name);
    return this;
  }
  /** @param altId */
  public AuditEvent_AgentBuilder withAltId(@NonNull String altId) {
    this.altId = Optional.of(altId);
    return this;
  }
  /** @param media */
  public AuditEvent_AgentBuilder withMedia(@NonNull Coding media) {
    this.media = Optional.of(media);
    return this;
  }
  /** @param policy */
  public AuditEvent_AgentBuilder withPolicy(@NonNull String... policy) {
    this.policy = Arrays.asList(policy);
    return this;
  }
  /** @param policy */
  public AuditEvent_AgentBuilder withPolicy(@NonNull Collection<String> policy) {
    this.policy = Collections.unmodifiableCollection(policy);
    return this;
  }
  /** @param location */
  public AuditEvent_AgentBuilder withLocation(@NonNull Reference location) {
    this.location = Optional.of(location);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public AuditEvent_AgentBuilder withExtension(@NonNull Extension... extension) {
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
  public AuditEvent_AgentBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param purposeOfUse */
  public AuditEvent_AgentBuilder withPurposeOfUse(@NonNull CodeableConcept... purposeOfUse) {
    this.purposeOfUse = Arrays.asList(purposeOfUse);
    return this;
  }
  /** @param purposeOfUse */
  public AuditEvent_AgentBuilder withPurposeOfUse(
      @NonNull Collection<CodeableConcept> purposeOfUse) {
    this.purposeOfUse = Collections.unmodifiableCollection(purposeOfUse);
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
  public AuditEvent_AgentBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public AuditEvent_AgentBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param network */
  public AuditEvent_AgentBuilder withNetwork(@NonNull AuditEvent$Agent$Network network) {
    this.network = Optional.of(network);
    return this;
  }

  public AuditEvent.Agent build() {
    return new AuditEvent.Agent(
        OptionConverters.toScala(id),
        OptionConverters.toScala(who),
        OptionConverters.toScala(_type),
        role.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(name),
        OptionConverters.toScala(altId),
        OptionConverters.toScala(media),
        policy.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(location),
        extension.stream().collect(new LitSeqJCollector<>()),
        requestor,
        purposeOfUse.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(network),
        LitUtils.emptyMetaElMap());
  }
}
