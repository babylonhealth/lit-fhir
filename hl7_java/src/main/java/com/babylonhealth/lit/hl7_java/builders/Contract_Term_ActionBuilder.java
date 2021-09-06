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

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface Contract_Term_ActionBuilder {
  public Contract$Term$Action build();

  public static Impl init(CodeableConcept _type, CodeableConcept intent, CodeableConcept status) {
    return new Impl(_type, intent, status);
  }

  public static Impl builder(
      CodeableConceptBuilder _type, CodeableConceptBuilder intent, CodeableConceptBuilder status) {
    return new Impl(_type.build(), intent.build(), status.build());
  }

  public static Choice00609373412 occurrence(FHIRDateTime f) {
    return new Choice00609373412(f);
  }

  public static Choice00609373412 occurrence(Period p) {
    return new Choice00609373412(p);
  }

  public static Choice00609373412 occurrence(Timing t) {
    return new Choice00609373412(t);
  }

  public class Impl implements Contract_Term_ActionBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept _type;
    private Collection<Annotation> note = Collections.emptyList();
    private CodeableConcept intent;
    private Collection<String> linkId = Collections.emptyList();
    private CodeableConcept status;
    private Collection<String> reason = Collections.emptyList();
    private Optional<Reference> context = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Reference> requester = Collections.emptyList();
    private Optional<Reference> performer = Optional.empty();
    private Collection<CodeableConcept> reasonCode = Collections.emptyList();
    private Optional<Boolean> doNotPerform = Optional.empty();
    private Collection<String> reasonLinkId = Collections.emptyList();
    private Collection<String> contextLinkId = Collections.emptyList();
    private Optional<Choice00609373412> occurrence = Optional.empty();
    private Collection<CodeableConcept> performerType = Collections.emptyList();
    private Optional<CodeableConcept> performerRole = Optional.empty();
    private Collection<String> requesterLinkId = Collections.emptyList();
    private Collection<String> performerLinkId = Collections.emptyList();
    private Collection<Reference> reasonReference = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Integer> securityLabelNumber = Collections.emptyList();
    private Collection<Contract$Term$Action$Subject> subject = Collections.emptyList();

    /**
     * Required fields for {@link Contract$Term$Action}
     *
     * @param _type - A high-level category for the legal instrument, whether constructed as a
     *     Contract definition, derivative, or instance in any legal state. Provides additional
     *     information about its content within the context of the Contract's scope to distinguish
     *     the kinds of systems that would be interested in the contract.
     * @param intent
     * @param status - The status of the resource instance.
     */
    public Impl(CodeableConcept _type, CodeableConcept intent, CodeableConcept status) {
      this._type = _type;
      this.intent = intent;
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Contract_Term_ActionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param note */
    public Contract_Term_ActionBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note */
    public Contract_Term_ActionBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public Contract_Term_ActionBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param linkId */
    public Contract_Term_ActionBuilder.Impl withLinkId(@NonNull String... linkId) {
      this.linkId = Arrays.asList(linkId);
      return this;
    }
    /** @param linkId */
    public Contract_Term_ActionBuilder.Impl withLinkId(@NonNull Collection<String> linkId) {
      this.linkId = Collections.unmodifiableCollection(linkId);
      return this;
    }
    /** @param reason */
    public Contract_Term_ActionBuilder.Impl withReason(@NonNull String... reason) {
      this.reason = Arrays.asList(reason);
      return this;
    }
    /** @param reason */
    public Contract_Term_ActionBuilder.Impl withReason(@NonNull Collection<String> reason) {
      this.reason = Collections.unmodifiableCollection(reason);
      return this;
    }
    /** @param context */
    public Contract_Term_ActionBuilder.Impl withContext(@NonNull Reference context) {
      this.context = Optional.of(context);
      return this;
    }

    public Contract_Term_ActionBuilder.Impl withContext(@NonNull ReferenceBuilder context) {
      this.context = Optional.of(context.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Contract_Term_ActionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Contract_Term_ActionBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Contract_Term_ActionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param requester */
    public Contract_Term_ActionBuilder.Impl withRequester(@NonNull Reference... requester) {
      this.requester = Arrays.asList(requester);
      return this;
    }
    /** @param requester */
    public Contract_Term_ActionBuilder.Impl withRequester(
        @NonNull Collection<Reference> requester) {
      this.requester = Collections.unmodifiableCollection(requester);
      return this;
    }

    public Contract_Term_ActionBuilder.Impl withRequester(@NonNull ReferenceBuilder... requester) {
      this.requester = Arrays.stream(requester).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param performer */
    public Contract_Term_ActionBuilder.Impl withPerformer(@NonNull Reference performer) {
      this.performer = Optional.of(performer);
      return this;
    }

    public Contract_Term_ActionBuilder.Impl withPerformer(@NonNull ReferenceBuilder performer) {
      this.performer = Optional.of(performer.build());
      return this;
    }
    /** @param reasonCode */
    public Contract_Term_ActionBuilder.Impl withReasonCode(@NonNull CodeableConcept... reasonCode) {
      this.reasonCode = Arrays.asList(reasonCode);
      return this;
    }
    /** @param reasonCode */
    public Contract_Term_ActionBuilder.Impl withReasonCode(
        @NonNull Collection<CodeableConcept> reasonCode) {
      this.reasonCode = Collections.unmodifiableCollection(reasonCode);
      return this;
    }

    public Contract_Term_ActionBuilder.Impl withReasonCode(
        @NonNull CodeableConceptBuilder... reasonCode) {
      this.reasonCode = Arrays.stream(reasonCode).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param doNotPerform */
    public Contract_Term_ActionBuilder.Impl withDoNotPerform(@NonNull Boolean doNotPerform) {
      this.doNotPerform = Optional.of(doNotPerform);
      return this;
    }
    /** @param reasonLinkId */
    public Contract_Term_ActionBuilder.Impl withReasonLinkId(@NonNull String... reasonLinkId) {
      this.reasonLinkId = Arrays.asList(reasonLinkId);
      return this;
    }
    /** @param reasonLinkId */
    public Contract_Term_ActionBuilder.Impl withReasonLinkId(
        @NonNull Collection<String> reasonLinkId) {
      this.reasonLinkId = Collections.unmodifiableCollection(reasonLinkId);
      return this;
    }
    /** @param contextLinkId */
    public Contract_Term_ActionBuilder.Impl withContextLinkId(@NonNull String... contextLinkId) {
      this.contextLinkId = Arrays.asList(contextLinkId);
      return this;
    }
    /** @param contextLinkId */
    public Contract_Term_ActionBuilder.Impl withContextLinkId(
        @NonNull Collection<String> contextLinkId) {
      this.contextLinkId = Collections.unmodifiableCollection(contextLinkId);
      return this;
    }
    /**
     * @param occurrence Field is a 'choice' field. Type should be one of FHIRDateTime, Period,
     *     Timing. To pass the value in, wrap with one of the Contract_Term_ActionBuilder.occurrence
     *     static methods
     */
    public Contract_Term_ActionBuilder.Impl withOccurrence(@NonNull Choice00609373412 occurrence) {
      this.occurrence = Optional.of(occurrence);
      return this;
    }
    /** @param performerType */
    public Contract_Term_ActionBuilder.Impl withPerformerType(
        @NonNull CodeableConcept... performerType) {
      this.performerType = Arrays.asList(performerType);
      return this;
    }
    /** @param performerType */
    public Contract_Term_ActionBuilder.Impl withPerformerType(
        @NonNull Collection<CodeableConcept> performerType) {
      this.performerType = Collections.unmodifiableCollection(performerType);
      return this;
    }

    public Contract_Term_ActionBuilder.Impl withPerformerType(
        @NonNull CodeableConceptBuilder... performerType) {
      this.performerType = Arrays.stream(performerType).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param performerRole */
    public Contract_Term_ActionBuilder.Impl withPerformerRole(
        @NonNull CodeableConcept performerRole) {
      this.performerRole = Optional.of(performerRole);
      return this;
    }

    public Contract_Term_ActionBuilder.Impl withPerformerRole(
        @NonNull CodeableConceptBuilder performerRole) {
      this.performerRole = Optional.of(performerRole.build());
      return this;
    }
    /** @param requesterLinkId */
    public Contract_Term_ActionBuilder.Impl withRequesterLinkId(
        @NonNull String... requesterLinkId) {
      this.requesterLinkId = Arrays.asList(requesterLinkId);
      return this;
    }
    /** @param requesterLinkId */
    public Contract_Term_ActionBuilder.Impl withRequesterLinkId(
        @NonNull Collection<String> requesterLinkId) {
      this.requesterLinkId = Collections.unmodifiableCollection(requesterLinkId);
      return this;
    }
    /** @param performerLinkId */
    public Contract_Term_ActionBuilder.Impl withPerformerLinkId(
        @NonNull String... performerLinkId) {
      this.performerLinkId = Arrays.asList(performerLinkId);
      return this;
    }
    /** @param performerLinkId */
    public Contract_Term_ActionBuilder.Impl withPerformerLinkId(
        @NonNull Collection<String> performerLinkId) {
      this.performerLinkId = Collections.unmodifiableCollection(performerLinkId);
      return this;
    }
    /** @param reasonReference */
    public Contract_Term_ActionBuilder.Impl withReasonReference(
        @NonNull Reference... reasonReference) {
      this.reasonReference = Arrays.asList(reasonReference);
      return this;
    }
    /** @param reasonReference */
    public Contract_Term_ActionBuilder.Impl withReasonReference(
        @NonNull Collection<Reference> reasonReference) {
      this.reasonReference = Collections.unmodifiableCollection(reasonReference);
      return this;
    }

    public Contract_Term_ActionBuilder.Impl withReasonReference(
        @NonNull ReferenceBuilder... reasonReference) {
      this.reasonReference = Arrays.stream(reasonReference).map(e -> e.build()).collect(toList());
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
    public Contract_Term_ActionBuilder.Impl withModifierExtension(
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
    public Contract_Term_ActionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Contract_Term_ActionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param securityLabelNumber */
    public Contract_Term_ActionBuilder.Impl withSecurityLabelNumber(
        @NonNull Integer... securityLabelNumber) {
      this.securityLabelNumber = Arrays.asList(securityLabelNumber);
      return this;
    }
    /** @param securityLabelNumber */
    public Contract_Term_ActionBuilder.Impl withSecurityLabelNumber(
        @NonNull Collection<Integer> securityLabelNumber) {
      this.securityLabelNumber = Collections.unmodifiableCollection(securityLabelNumber);
      return this;
    }
    /**
     * @param subject - The target entity impacted by or of interest to parties to the agreement.
     */
    public Contract_Term_ActionBuilder.Impl withSubject(
        @NonNull Contract$Term$Action$Subject... subject) {
      this.subject = Arrays.asList(subject);
      return this;
    }
    /**
     * @param subject - The target entity impacted by or of interest to parties to the agreement.
     */
    public Contract_Term_ActionBuilder.Impl withSubject(
        @NonNull Collection<Contract$Term$Action$Subject> subject) {
      this.subject = Collections.unmodifiableCollection(subject);
      return this;
    }

    public Contract_Term_ActionBuilder.Impl withSubject(
        @NonNull Contract_Term_Action_SubjectBuilder... subject) {
      this.subject = Arrays.stream(subject).map(e -> e.build()).collect(toList());
      return this;
    }

    public Contract$Term$Action build() {
      return new Contract$Term$Action(
          OptionConverters.toScala(id),
          _type,
          note.stream().collect(new LitSeqJCollector<>()),
          intent,
          linkId.stream().collect(new LitSeqJCollector<>()),
          status,
          reason.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(context),
          extension.stream().collect(new LitSeqJCollector<>()),
          requester.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(performer),
          reasonCode.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(doNotPerform.map(x -> (Object) x)),
          reasonLinkId.stream().collect(new LitSeqJCollector<>()),
          contextLinkId.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(occurrence),
          performerType.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(performerRole),
          requesterLinkId.stream().collect(new LitSeqJCollector<>()),
          performerLinkId.stream().collect(new LitSeqJCollector<>()),
          reasonReference.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          securityLabelNumber.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          subject.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
