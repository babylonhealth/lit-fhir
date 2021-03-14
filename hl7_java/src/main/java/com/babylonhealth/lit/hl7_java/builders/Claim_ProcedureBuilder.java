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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class Claim_ProcedureBuilder {
  private Optional<String> id = Optional.empty();
  private Collection<Reference> udi = Collections.emptyList();
  private Collection<CodeableConcept> _type = Collections.emptyList();
  private Optional<FHIRDateTime> date = Optional.empty();
  private Integer sequence;
  private Collection<Extension> extension = Collections.emptyList();
  private Choice<$bslash$div<CodeableConcept, Reference>> procedure;
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /**
   * Required fields for {@link Claim.Procedure}
   *
   * @param sequence
   * @param procedure - Procedures performed on the patient relevant to the billing items with the
   *     claim. Field is a 'choice' field. Type should be one of CodeableConcept, Reference.
   */
  public Claim_ProcedureBuilder(Integer sequence, @NonNull Object procedure) {
    this.sequence = sequence;
    this.procedure =
        (Choice)
            Choice$.MODULE$.fromSuffix(
                autoSuffix(
                    procedure.getClass().getSimpleName(), Claim.Procedure$.MODULE$.procedure()),
                procedure,
                Claim.Procedure$.MODULE$.procedure());
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Claim_ProcedureBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param udi */
  public Claim_ProcedureBuilder withUdi(@NonNull Reference... udi) {
    this.udi = Arrays.asList(udi);
    return this;
  }
  /** @param udi */
  public Claim_ProcedureBuilder withUdi(@NonNull Collection<Reference> udi) {
    this.udi = Collections.unmodifiableCollection(udi);
    return this;
  }
  /**
   * @param _type - The category of claim, e.g. oral, pharmacy, vision, institutional, professional.
   */
  public Claim_ProcedureBuilder withType(@NonNull CodeableConcept... _type) {
    this._type = Arrays.asList(_type);
    return this;
  }
  /**
   * @param _type - The category of claim, e.g. oral, pharmacy, vision, institutional, professional.
   */
  public Claim_ProcedureBuilder withType(@NonNull Collection<CodeableConcept> _type) {
    this._type = Collections.unmodifiableCollection(_type);
    return this;
  }
  /** @param date */
  public Claim_ProcedureBuilder withDate(@NonNull FHIRDateTime date) {
    this.date = Optional.of(date);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Claim_ProcedureBuilder withExtension(@NonNull Extension... extension) {
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
  public Claim_ProcedureBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
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
  public Claim_ProcedureBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public Claim_ProcedureBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public Claim.Procedure build() {
    return new Claim.Procedure(
        OptionConverters.toScala(id),
        udi.stream().collect(new LitSeqJCollector<>()),
        _type.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(date),
        sequence,
        extension.stream().collect(new LitSeqJCollector<>()),
        procedure,
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}