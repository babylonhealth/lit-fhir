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

public interface SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentationBuilder {
  public SubstancePolymer$Repeat$RepeatUnit$StructuralRepresentation build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentationBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Attachment> attachment = Optional.empty();
    private Optional<String> representation = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link SubstancePolymer$Repeat$RepeatUnit$StructuralRepresentation} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentationBuilder.Impl withId(
        @NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param _type */
    public SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentationBuilder.Impl withType(
        @NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentationBuilder.Impl withType(
        @NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentationBuilder.Impl withExtension(
        @NonNull Extension... extension) {
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
    public SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentationBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentationBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param attachment */
    public SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentationBuilder.Impl withAttachment(
        @NonNull Attachment attachment) {
      this.attachment = Optional.of(attachment);
      return this;
    }

    public SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentationBuilder.Impl withAttachment(
        @NonNull AttachmentBuilder attachment) {
      this.attachment = Optional.of(attachment.build());
      return this;
    }
    /** @param representation */
    public SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentationBuilder.Impl
        withRepresentation(@NonNull String representation) {
      this.representation = Optional.of(representation);
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
    public SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentationBuilder.Impl
        withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentationBuilder.Impl
        withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentationBuilder.Impl
        withModifierExtension(@NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public SubstancePolymer$Repeat$RepeatUnit$StructuralRepresentation build() {
      return new SubstancePolymer$Repeat$RepeatUnit$StructuralRepresentation(
          OptionConverters.toScala(id),
          OptionConverters.toScala(_type),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(attachment),
          OptionConverters.toScala(representation),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
