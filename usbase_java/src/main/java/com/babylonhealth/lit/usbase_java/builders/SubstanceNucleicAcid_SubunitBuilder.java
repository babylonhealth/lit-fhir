package com.babylonhealth.lit.usbase_java.builders;

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
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class SubstanceNucleicAcid_SubunitBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Integer> length = Optional.empty();
  private Optional<Integer> subunit = Optional.empty();
  private Optional<String> sequence = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<CodeableConcept> fivePrime = Optional.empty();
  private Optional<CodeableConcept> threePrime = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Attachment> sequenceAttachment = Optional.empty();
  private Collection<SubstanceNucleicAcid$Subunit$Sugar> sugar = Collections.emptyList();
  private Collection<SubstanceNucleicAcid$Subunit$Linkage> linkage = Collections.emptyList();

  /** Required fields for {@link SubstanceNucleicAcid.Subunit} */
  public SubstanceNucleicAcid_SubunitBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public SubstanceNucleicAcid_SubunitBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param length */
  public SubstanceNucleicAcid_SubunitBuilder withLength(@NonNull Integer length) {
    this.length = Optional.of(length);
    return this;
  }
  /**
   * @param subunit - Subunits are listed in order of decreasing length; sequences of the same
   *     length will be ordered by molecular weight; subunits that have identical sequences will be
   *     repeated multiple times.
   */
  public SubstanceNucleicAcid_SubunitBuilder withSubunit(@NonNull Integer subunit) {
    this.subunit = Optional.of(subunit);
    return this;
  }
  /** @param sequence */
  public SubstanceNucleicAcid_SubunitBuilder withSequence(@NonNull String sequence) {
    this.sequence = Optional.of(sequence);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public SubstanceNucleicAcid_SubunitBuilder withExtension(@NonNull Extension... extension) {
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
  public SubstanceNucleicAcid_SubunitBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param fivePrime */
  public SubstanceNucleicAcid_SubunitBuilder withFivePrime(@NonNull CodeableConcept fivePrime) {
    this.fivePrime = Optional.of(fivePrime);
    return this;
  }
  /** @param threePrime */
  public SubstanceNucleicAcid_SubunitBuilder withThreePrime(@NonNull CodeableConcept threePrime) {
    this.threePrime = Optional.of(threePrime);
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
  public SubstanceNucleicAcid_SubunitBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
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
  public SubstanceNucleicAcid_SubunitBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param sequenceAttachment */
  public SubstanceNucleicAcid_SubunitBuilder withSequenceAttachment(
      @NonNull Attachment sequenceAttachment) {
    this.sequenceAttachment = Optional.of(sequenceAttachment);
    return this;
  }
  /** @param sugar */
  public SubstanceNucleicAcid_SubunitBuilder withSugar(
      @NonNull SubstanceNucleicAcid$Subunit$Sugar... sugar) {
    this.sugar = Arrays.asList(sugar);
    return this;
  }
  /** @param sugar */
  public SubstanceNucleicAcid_SubunitBuilder withSugar(
      @NonNull Collection<SubstanceNucleicAcid$Subunit$Sugar> sugar) {
    this.sugar = Collections.unmodifiableCollection(sugar);
    return this;
  }
  /** @param linkage */
  public SubstanceNucleicAcid_SubunitBuilder withLinkage(
      @NonNull SubstanceNucleicAcid$Subunit$Linkage... linkage) {
    this.linkage = Arrays.asList(linkage);
    return this;
  }
  /** @param linkage */
  public SubstanceNucleicAcid_SubunitBuilder withLinkage(
      @NonNull Collection<SubstanceNucleicAcid$Subunit$Linkage> linkage) {
    this.linkage = Collections.unmodifiableCollection(linkage);
    return this;
  }

  public SubstanceNucleicAcid.Subunit build() {
    return new SubstanceNucleicAcid.Subunit(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(length.map(x -> (Object) x)),
        (Option) OptionConverters.toScala(subunit.map(x -> (Object) x)),
        (Option) OptionConverters.toScala(sequence),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(fivePrime),
        (Option) OptionConverters.toScala(threePrime),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(sequenceAttachment),
        sugar.stream().collect(new LitSeqJCollector<>()),
        linkage.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
