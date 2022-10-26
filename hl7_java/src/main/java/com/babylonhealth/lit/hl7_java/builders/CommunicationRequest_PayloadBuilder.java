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

public interface CommunicationRequest_PayloadBuilder {
  public CommunicationRequest.Payload build();

  public static Impl init(@NonNull ChoiceAttachmentOrReferenceOrString content) {
    return new Impl(content);
  }

  public static Impl builder(@NonNull ChoiceAttachmentOrReferenceOrString content) {
    return new Impl(content);
  }

  public static ChoiceAttachmentOrReferenceOrString content(Attachment a) {
    return new ChoiceAttachmentOrReferenceOrString(a);
  }

  public static ChoiceAttachmentOrReferenceOrString content(Reference r) {
    return new ChoiceAttachmentOrReferenceOrString(r);
  }

  public static ChoiceAttachmentOrReferenceOrString content(String s) {
    return new ChoiceAttachmentOrReferenceOrString(s);
  }

  public class Impl implements CommunicationRequest_PayloadBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private ChoiceAttachmentOrReferenceOrString content;
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link CommunicationRequest.Payload}
     *
     * @param content Field is a 'choice' field. Type should be one of Attachment, Reference,
     *     String. To pass the value in, wrap with one of the
     *     CommunicationRequest_PayloadBuilder.content static methods
     */
    public Impl(@NonNull ChoiceAttachmentOrReferenceOrString content) {
      this.content = content;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public CommunicationRequest_PayloadBuilder.Impl withId(@NonNull String id) {
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
    public CommunicationRequest_PayloadBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public CommunicationRequest_PayloadBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public CommunicationRequest_PayloadBuilder.Impl withExtension(
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
    public CommunicationRequest_PayloadBuilder.Impl withModifierExtension(
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
    public CommunicationRequest_PayloadBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public CommunicationRequest_PayloadBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public CommunicationRequest.Payload build() {
      return new CommunicationRequest.Payload(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          content,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
