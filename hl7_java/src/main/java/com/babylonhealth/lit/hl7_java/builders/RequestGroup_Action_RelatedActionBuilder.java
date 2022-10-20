package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.ACTION_RELATIONSHIP_TYPE;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface RequestGroup_Action_RelatedActionBuilder {
  public RequestGroup$Action$RelatedAction build();

  public static Impl init(String actionId, ACTION_RELATIONSHIP_TYPE relationship) {
    return new Impl(actionId, relationship);
  }

  public static Impl builder(String actionId, ACTION_RELATIONSHIP_TYPE relationship) {
    return new Impl(actionId, relationship);
  }

  public static ChoiceDurationOrRange offset(Duration d) {
    return new ChoiceDurationOrRange(d);
  }

  public static ChoiceDurationOrRange offset(Range r) {
    return new ChoiceDurationOrRange(r);
  }

  public class Impl implements RequestGroup_Action_RelatedActionBuilder {
    private Optional<String> id = Optional.empty();
    private String actionId;
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ChoiceDurationOrRange> offset = Optional.empty();
    private ACTION_RELATIONSHIP_TYPE relationship;
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link RequestGroup$Action$RelatedAction}
     *
     * @param actionId
     * @param relationship
     */
    public Impl(String actionId, ACTION_RELATIONSHIP_TYPE relationship) {
      this.actionId = actionId;
      this.relationship = relationship;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public RequestGroup_Action_RelatedActionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public RequestGroup_Action_RelatedActionBuilder.Impl withExtension(
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
    public RequestGroup_Action_RelatedActionBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public RequestGroup_Action_RelatedActionBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param offset Field is a 'choice' field. Type should be one of Duration, Range. To pass the
     *     value in, wrap with one of the RequestGroup_Action_RelatedActionBuilder.offset static
     *     methods
     */
    public RequestGroup_Action_RelatedActionBuilder.Impl withOffset(
        @NonNull ChoiceDurationOrRange offset) {
      this.offset = Optional.of(offset);
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
    public RequestGroup_Action_RelatedActionBuilder.Impl withModifierExtension(
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
    public RequestGroup_Action_RelatedActionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public RequestGroup_Action_RelatedActionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public RequestGroup$Action$RelatedAction build() {
      return new RequestGroup$Action$RelatedAction(
          OptionConverters.toScala(id),
          actionId,
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(offset),
          relationship,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
