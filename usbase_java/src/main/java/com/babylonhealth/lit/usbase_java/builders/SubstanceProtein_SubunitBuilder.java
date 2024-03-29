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

public interface SubstanceProtein_SubunitBuilder {
  public SubstanceProtein.Subunit build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SubstanceProtein_SubunitBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Integer> length = Optional.empty();
    private Optional<Integer> subunit = Optional.empty();
    private Optional<String> sequence = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Attachment> sequenceAttachment = Optional.empty();
    private Optional<String> nTerminalModification = Optional.empty();
    private Optional<String> cTerminalModification = Optional.empty();
    private Optional<Identifier> nTerminalModificationId = Optional.empty();
    private Optional<Identifier> cTerminalModificationId = Optional.empty();

    /** Required fields for {@link SubstanceProtein.Subunit} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstanceProtein_SubunitBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param length */
    public SubstanceProtein_SubunitBuilder.Impl withLength(@NonNull Integer length) {
      this.length = Optional.of(length);
      return this;
    }
    /**
     * @param subunit - This subclause refers to the description of each subunit constituting the
     *     SubstanceProtein. A subunit is a linear sequence of amino acids linked through peptide
     *     bonds. The Subunit information shall be provided when the finished SubstanceProtein is a
     *     complex of multiple sequences; subunits are not used to delineate domains within a single
     *     sequence. Subunits are listed in order of decreasing length; sequences of the same length
     *     will be ordered by decreasing molecular weight; subunits that have identical sequences
     *     will be repeated multiple times.
     */
    public SubstanceProtein_SubunitBuilder.Impl withSubunit(@NonNull Integer subunit) {
      this.subunit = Optional.of(subunit);
      return this;
    }
    /** @param sequence */
    public SubstanceProtein_SubunitBuilder.Impl withSequence(@NonNull String sequence) {
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
    public SubstanceProtein_SubunitBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public SubstanceProtein_SubunitBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceProtein_SubunitBuilder.Impl withExtension(
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
    public SubstanceProtein_SubunitBuilder.Impl withModifierExtension(
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
    public SubstanceProtein_SubunitBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstanceProtein_SubunitBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param sequenceAttachment */
    public SubstanceProtein_SubunitBuilder.Impl withSequenceAttachment(
        @NonNull Attachment sequenceAttachment) {
      this.sequenceAttachment = Optional.of(sequenceAttachment);
      return this;
    }

    public SubstanceProtein_SubunitBuilder.Impl withSequenceAttachment(
        @NonNull AttachmentBuilder sequenceAttachment) {
      this.sequenceAttachment = Optional.of(sequenceAttachment.build());
      return this;
    }
    /** @param nTerminalModification */
    public SubstanceProtein_SubunitBuilder.Impl withNTerminalModification(
        @NonNull String nTerminalModification) {
      this.nTerminalModification = Optional.of(nTerminalModification);
      return this;
    }
    /** @param cTerminalModification */
    public SubstanceProtein_SubunitBuilder.Impl withCTerminalModification(
        @NonNull String cTerminalModification) {
      this.cTerminalModification = Optional.of(cTerminalModification);
      return this;
    }
    /** @param nTerminalModificationId */
    public SubstanceProtein_SubunitBuilder.Impl withNTerminalModificationId(
        @NonNull Identifier nTerminalModificationId) {
      this.nTerminalModificationId = Optional.of(nTerminalModificationId);
      return this;
    }

    public SubstanceProtein_SubunitBuilder.Impl withNTerminalModificationId(
        @NonNull IdentifierBuilder nTerminalModificationId) {
      this.nTerminalModificationId = Optional.of(nTerminalModificationId.build());
      return this;
    }
    /** @param cTerminalModificationId */
    public SubstanceProtein_SubunitBuilder.Impl withCTerminalModificationId(
        @NonNull Identifier cTerminalModificationId) {
      this.cTerminalModificationId = Optional.of(cTerminalModificationId);
      return this;
    }

    public SubstanceProtein_SubunitBuilder.Impl withCTerminalModificationId(
        @NonNull IdentifierBuilder cTerminalModificationId) {
      this.cTerminalModificationId = Optional.of(cTerminalModificationId.build());
      return this;
    }

    public SubstanceProtein.Subunit build() {
      return new SubstanceProtein.Subunit(
          OptionConverters.toScala(id),
          OptionConverters.toScala(length.map(x -> (Object) x)),
          OptionConverters.toScala(subunit.map(x -> (Object) x)),
          OptionConverters.toScala(sequence),
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(sequenceAttachment),
          OptionConverters.toScala(nTerminalModification),
          OptionConverters.toScala(cTerminalModification),
          OptionConverters.toScala(nTerminalModificationId),
          OptionConverters.toScala(cTerminalModificationId),
          LitUtils.emptyMetaElMap());
    }
  }
}
