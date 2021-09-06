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
import com.babylonhealth.lit.hl7.CONSENT_STATE_CODES;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface ConsentBuilder extends DomainResourceBuilder {
  public Consent build();

  public static Impl init(
      CodeableConcept scope, CONSENT_STATE_CODES status, Collection<CodeableConcept> category) {
    return new Impl(scope, status, category);
  }

  public static Choice_0340660840 source(Attachment a) {
    return new Choice_0340660840(a);
  }

  public static Choice_0340660840 source(Reference r) {
    return new Choice_0340660840(r);
  }

  public class Impl implements ConsentBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private CodeableConcept scope;
    private CONSENT_STATE_CODES status;
    private Optional<Reference> patient = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<CodeableConcept> category;
    private Optional<FHIRDateTime> dateTime = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Reference> performer = Collections.emptyList();
    private Optional<Choice_0340660840> source = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<CodeableConcept> policyRule = Optional.empty();
    private Collection<Reference> organization = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Consent.Policy> policy = Collections.emptyList();
    private Collection<Consent.Verification> verification = Collections.emptyList();
    private Optional<Consent.Provision> provision = Optional.empty();

    /**
     * Required fields for {@link Consent}
     *
     * @param scope - A selector of the type of consent being presented: ADR, Privacy, Treatment,
     *     Research. This list is now extensible.
     * @param status - Indicates the current state of this consent.
     * @param category - A classification of the type of consents found in the statement. This
     *     element supports indexing and retrieval of consent statements.
     */
    public Impl(
        CodeableConcept scope, CONSENT_STATE_CODES status, Collection<CodeableConcept> category) {
      this.scope = scope;
      this.status = status;
      this.category = category;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ConsentBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public ConsentBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public ConsentBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }
    /** @param patient - The patient/healthcare consumer to whom this consent applies. */
    public ConsentBuilder.Impl withPatient(@NonNull Reference patient) {
      this.patient = Optional.of(patient);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public ConsentBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param dateTime - When this Consent was issued / created / indexed. */
    public ConsentBuilder.Impl withDateTime(@NonNull FHIRDateTime dateTime) {
      this.dateTime = Optional.of(dateTime);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ConsentBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ConsentBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ConsentBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ConsentBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /**
     * @param performer - Either the Grantor, which is the entity responsible for granting the
     *     rights listed in a Consent Directive or the Grantee, which is the entity responsible for
     *     complying with the Consent Directive, including any obligations or limitations on
     *     authorizations and enforcement of prohibitions.
     */
    public ConsentBuilder.Impl withPerformer(@NonNull Reference... performer) {
      this.performer = Arrays.asList(performer);
      return this;
    }
    /**
     * @param performer - Either the Grantor, which is the entity responsible for granting the
     *     rights listed in a Consent Directive or the Grantee, which is the entity responsible for
     *     complying with the Consent Directive, including any obligations or limitations on
     *     authorizations and enforcement of prohibitions.
     */
    public ConsentBuilder.Impl withPerformer(@NonNull Collection<Reference> performer) {
      this.performer = Collections.unmodifiableCollection(performer);
      return this;
    }
    /**
     * @param source - The source on which this consent statement is based. The source might be a
     *     scanned original paper form, or a reference to a consent that links back to such a
     *     source, a reference to a document repository (e.g. XDS) that stores the original consent
     *     document. Field is a 'choice' field. Type should be one of Attachment, Reference. To pass
     *     the value in, wrap with one of the ConsentBuilder.source static methods
     */
    public ConsentBuilder.Impl withSource(@NonNull Choice_0340660840 source) {
      this.source = Optional.of(source);
      return this;
    }
    /** @param identifier - Unique identifier for this copy of the Consent Statement. */
    public ConsentBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - Unique identifier for this copy of the Consent Statement. */
    public ConsentBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }
    /** @param policyRule - A reference to the specific base computable regulation or policy. */
    public ConsentBuilder.Impl withPolicyRule(@NonNull CodeableConcept policyRule) {
      this.policyRule = Optional.of(policyRule);
      return this;
    }
    /**
     * @param organization - The organization that manages the consent, and the framework within
     *     which it is executed.
     */
    public ConsentBuilder.Impl withOrganization(@NonNull Reference... organization) {
      this.organization = Arrays.asList(organization);
      return this;
    }
    /**
     * @param organization - The organization that manages the consent, and the framework within
     *     which it is executed.
     */
    public ConsentBuilder.Impl withOrganization(@NonNull Collection<Reference> organization) {
      this.organization = Collections.unmodifiableCollection(organization);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public ConsentBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
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
    public ConsentBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public ConsentBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /**
     * @param policy - The references to the policies that are included in this consent scope.
     *     Policies may be organizational, but are often defined jurisdictionally, or in law.
     */
    public ConsentBuilder.Impl withPolicy(@NonNull Consent.Policy... policy) {
      this.policy = Arrays.asList(policy);
      return this;
    }
    /**
     * @param policy - The references to the policies that are included in this consent scope.
     *     Policies may be organizational, but are often defined jurisdictionally, or in law.
     */
    public ConsentBuilder.Impl withPolicy(@NonNull Collection<Consent.Policy> policy) {
      this.policy = Collections.unmodifiableCollection(policy);
      return this;
    }
    /**
     * @param verification - Whether a treatment instruction (e.g. artificial respiration yes or no)
     *     was verified with the patient, his/her family or another authorized person.
     */
    public ConsentBuilder.Impl withVerification(@NonNull Consent.Verification... verification) {
      this.verification = Arrays.asList(verification);
      return this;
    }
    /**
     * @param verification - Whether a treatment instruction (e.g. artificial respiration yes or no)
     *     was verified with the patient, his/her family or another authorized person.
     */
    public ConsentBuilder.Impl withVerification(
        @NonNull Collection<Consent.Verification> verification) {
      this.verification = Collections.unmodifiableCollection(verification);
      return this;
    }
    /**
     * @param provision - An exception to the base policy of this consent. An exception can be an
     *     addition or removal of access permissions.
     */
    public ConsentBuilder.Impl withProvision(@NonNull Consent.Provision provision) {
      this.provision = Optional.of(provision);
      return this;
    }

    public ConsentBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Consent build() {
      return new Consent(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          scope,
          status,
          OptionConverters.toScala(patient),
          OptionConverters.toScala(language),
          category.stream().collect(new NonEmptyLitSeqJCollector<>()),
          OptionConverters.toScala(dateTime),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          performer.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(source),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(policyRule),
          organization.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          policy.stream().collect(new LitSeqJCollector<>()),
          verification.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(provision),
          LitUtils.emptyMetaElMap());
    }
  }
}
