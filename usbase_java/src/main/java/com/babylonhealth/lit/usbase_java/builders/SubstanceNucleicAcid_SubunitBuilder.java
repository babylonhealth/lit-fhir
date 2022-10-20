package com.babylonhealth.lit.usbase_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface SubstanceNucleicAcid_SubunitBuilder {
  public SubstanceNucleicAcid.Subunit build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SubstanceNucleicAcid_SubunitBuilder {
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
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstanceNucleicAcid_SubunitBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param length */
    public SubstanceNucleicAcid_SubunitBuilder.Impl withLength(@NonNull Integer length) {
      this.length = Optional.of(length);
      return this;
    }
    /**
     * @param subunit - Subunits are listed in order of decreasing length; sequences of the same
     *     length will be ordered by molecular weight; subunits that have identical sequences will
     *     be repeated multiple times.
     */
    public SubstanceNucleicAcid_SubunitBuilder.Impl withSubunit(@NonNull Integer subunit) {
      this.subunit = Optional.of(subunit);
      return this;
    }
    /** @param sequence */
    public SubstanceNucleicAcid_SubunitBuilder.Impl withSequence(@NonNull String sequence) {
      this.sequence = Optional.of(sequence);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SubstanceNucleicAcid_SubunitBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public SubstanceNucleicAcid_SubunitBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceNucleicAcid_SubunitBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param fivePrime */
    public SubstanceNucleicAcid_SubunitBuilder.Impl withFivePrime(
        @NonNull CodeableConcept fivePrime) {
      this.fivePrime = Optional.of(fivePrime);
      return this;
    }

    public SubstanceNucleicAcid_SubunitBuilder.Impl withFivePrime(
        @NonNull CodeableConceptBuilder fivePrime) {
      this.fivePrime = Optional.of(fivePrime.build());
      return this;
    }
    /** @param threePrime */
    public SubstanceNucleicAcid_SubunitBuilder.Impl withThreePrime(
        @NonNull CodeableConcept threePrime) {
      this.threePrime = Optional.of(threePrime);
      return this;
    }

    public SubstanceNucleicAcid_SubunitBuilder.Impl withThreePrime(
        @NonNull CodeableConceptBuilder threePrime) {
      this.threePrime = Optional.of(threePrime.build());
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
    public SubstanceNucleicAcid_SubunitBuilder.Impl withModifierExtension(
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
    public SubstanceNucleicAcid_SubunitBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstanceNucleicAcid_SubunitBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param sequenceAttachment */
    public SubstanceNucleicAcid_SubunitBuilder.Impl withSequenceAttachment(
        @NonNull Attachment sequenceAttachment) {
      this.sequenceAttachment = Optional.of(sequenceAttachment);
      return this;
    }

    public SubstanceNucleicAcid_SubunitBuilder.Impl withSequenceAttachment(
        @NonNull AttachmentBuilder sequenceAttachment) {
      this.sequenceAttachment = Optional.of(sequenceAttachment.build());
      return this;
    }
    /** @param sugar */
    public SubstanceNucleicAcid_SubunitBuilder.Impl withSugar(
        @NonNull SubstanceNucleicAcid$Subunit$Sugar... sugar) {
      this.sugar = Arrays.asList(sugar);
      return this;
    }
    /** @param sugar */
    public SubstanceNucleicAcid_SubunitBuilder.Impl withSugar(
        @NonNull Collection<SubstanceNucleicAcid$Subunit$Sugar> sugar) {
      this.sugar = Collections.unmodifiableCollection(sugar);
      return this;
    }

    public SubstanceNucleicAcid_SubunitBuilder.Impl withSugar(
        @NonNull SubstanceNucleicAcid_Subunit_SugarBuilder... sugar) {
      this.sugar = Arrays.stream(sugar).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param linkage */
    public SubstanceNucleicAcid_SubunitBuilder.Impl withLinkage(
        @NonNull SubstanceNucleicAcid$Subunit$Linkage... linkage) {
      this.linkage = Arrays.asList(linkage);
      return this;
    }
    /** @param linkage */
    public SubstanceNucleicAcid_SubunitBuilder.Impl withLinkage(
        @NonNull Collection<SubstanceNucleicAcid$Subunit$Linkage> linkage) {
      this.linkage = Collections.unmodifiableCollection(linkage);
      return this;
    }

    public SubstanceNucleicAcid_SubunitBuilder.Impl withLinkage(
        @NonNull SubstanceNucleicAcid_Subunit_LinkageBuilder... linkage) {
      this.linkage = Arrays.stream(linkage).map(e -> e.build()).collect(toList());
      return this;
    }

    public SubstanceNucleicAcid.Subunit build() {
      return new SubstanceNucleicAcid.Subunit(
          OptionConverters.toScala(id),
          OptionConverters.toScala(length.map(x -> (Object) x)),
          OptionConverters.toScala(subunit.map(x -> (Object) x)),
          OptionConverters.toScala(sequence),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(fivePrime),
          OptionConverters.toScala(threePrime),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(sequenceAttachment),
          sugar.stream().collect(new LitSeqJCollector<>()),
          linkage.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
