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

public interface AdverseEvent_SuspectEntity_CausalityBuilder {
  public AdverseEvent$SuspectEntity$Causality build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements AdverseEvent_SuspectEntity_CausalityBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Reference> author = Optional.empty();
    private Optional<CodeableConcept> method = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<CodeableConcept> assessment = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<String> productRelatedness = Optional.empty();

    /** Required fields for {@link AdverseEvent$SuspectEntity$Causality} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public AdverseEvent_SuspectEntity_CausalityBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param author */
    public AdverseEvent_SuspectEntity_CausalityBuilder.Impl withAuthor(@NonNull Reference author) {
      this.author = Optional.of(author);
      return this;
    }

    public AdverseEvent_SuspectEntity_CausalityBuilder.Impl withAuthor(
        @NonNull ReferenceBuilder author) {
      this.author = Optional.of(author.build());
      return this;
    }
    /** @param method */
    public AdverseEvent_SuspectEntity_CausalityBuilder.Impl withMethod(
        @NonNull CodeableConcept method) {
      this.method = Optional.of(method);
      return this;
    }

    public AdverseEvent_SuspectEntity_CausalityBuilder.Impl withMethod(
        @NonNull CodeableConceptBuilder method) {
      this.method = Optional.of(method.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public AdverseEvent_SuspectEntity_CausalityBuilder.Impl withExtension(
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
    public AdverseEvent_SuspectEntity_CausalityBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public AdverseEvent_SuspectEntity_CausalityBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param assessment */
    public AdverseEvent_SuspectEntity_CausalityBuilder.Impl withAssessment(
        @NonNull CodeableConcept assessment) {
      this.assessment = Optional.of(assessment);
      return this;
    }

    public AdverseEvent_SuspectEntity_CausalityBuilder.Impl withAssessment(
        @NonNull CodeableConceptBuilder assessment) {
      this.assessment = Optional.of(assessment.build());
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
    public AdverseEvent_SuspectEntity_CausalityBuilder.Impl withModifierExtension(
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
    public AdverseEvent_SuspectEntity_CausalityBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public AdverseEvent_SuspectEntity_CausalityBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param productRelatedness */
    public AdverseEvent_SuspectEntity_CausalityBuilder.Impl withProductRelatedness(
        @NonNull String productRelatedness) {
      this.productRelatedness = Optional.of(productRelatedness);
      return this;
    }

    public AdverseEvent$SuspectEntity$Causality build() {
      return new AdverseEvent$SuspectEntity$Causality(
          OptionConverters.toScala(id),
          OptionConverters.toScala(author),
          OptionConverters.toScala(method),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(assessment),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(productRelatedness),
          LitUtils.emptyMetaElMap());
    }
  }
}
