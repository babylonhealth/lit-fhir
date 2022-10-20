package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.ACCOUNT_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface AccountBuilder extends DomainResourceBuilder {
  public Account build();

  public static Impl init(ACCOUNT_STATUS status) {
    return new Impl(status);
  }

  public static Impl builder(ACCOUNT_STATUS status) {
    return new Impl(status);
  }

  public class Impl implements AccountBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<Reference> owner = Optional.empty();
    private ACCOUNT_STATUS status;
    private Optional<Reference> partOf = Optional.empty();
    private Collection<Reference> subject = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<Period> servicePeriod = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Account.Coverage> coverage = Collections.emptyList();
    private Collection<Account.Guarantor> guarantor = Collections.emptyList();

    /**
     * Required fields for {@link Account}
     *
     * @param status - Indicates whether the account is presently used/usable or not.
     */
    public Impl(ACCOUNT_STATUS status) {
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public AccountBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public AccountBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public AccountBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
      this.meta = Optional.of(meta.build());
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public AccountBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public AccountBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param _type - Categorizes the account for reporting and searching purposes. */
    public AccountBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public AccountBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param name - Name used for the account when displaying it to humans in reports, etc. */
    public AccountBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param owner - Indicates the service area, hospital, department, etc. with responsibility for
     *     managing the Account.
     */
    public AccountBuilder.Impl withOwner(@NonNull Reference owner) {
      this.owner = Optional.of(owner);
      return this;
    }

    public AccountBuilder.Impl withOwner(@NonNull ReferenceBuilder owner) {
      this.owner = Optional.of(owner.build());
      return this;
    }
    /** @param partOf - Reference to a parent Account. */
    public AccountBuilder.Impl withPartOf(@NonNull Reference partOf) {
      this.partOf = Optional.of(partOf);
      return this;
    }

    public AccountBuilder.Impl withPartOf(@NonNull ReferenceBuilder partOf) {
      this.partOf = Optional.of(partOf.build());
      return this;
    }
    /**
     * @param subject - Identifies the entity which incurs the expenses. While the immediate
     *     recipients of services or goods might be entities related to the subject, the expenses
     *     were ultimately incurred by the subject of the Account.
     */
    public AccountBuilder.Impl withSubject(@NonNull Reference... subject) {
      this.subject = Arrays.asList(subject);
      return this;
    }
    /**
     * @param subject - Identifies the entity which incurs the expenses. While the immediate
     *     recipients of services or goods might be entities related to the subject, the expenses
     *     were ultimately incurred by the subject of the Account.
     */
    public AccountBuilder.Impl withSubject(@NonNull Collection<Reference> subject) {
      this.subject = Collections.unmodifiableCollection(subject);
      return this;
    }

    public AccountBuilder.Impl withSubject(@NonNull ReferenceBuilder... subject) {
      this.subject = Arrays.stream(subject).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public AccountBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public AccountBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public AccountBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public AccountBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
      this.contained = Arrays.stream(contained).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public AccountBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public AccountBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public AccountBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Unique identifier used to reference the account. Might or might not be
     *     intended for human use (e.g. credit card number).
     */
    public AccountBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Unique identifier used to reference the account. Might or might not be
     *     intended for human use (e.g. credit card number).
     */
    public AccountBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public AccountBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param description - Provides additional information about what the account tracks and how it
     *     is used.
     */
    public AccountBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public AccountBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param servicePeriod - The date range of services associated with this account. */
    public AccountBuilder.Impl withServicePeriod(@NonNull Period servicePeriod) {
      this.servicePeriod = Optional.of(servicePeriod);
      return this;
    }

    public AccountBuilder.Impl withServicePeriod(@NonNull PeriodBuilder servicePeriod) {
      this.servicePeriod = Optional.of(servicePeriod.build());
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
    public AccountBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public AccountBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public AccountBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param coverage - The party(s) that are responsible for covering the payment of this account,
     *     and what order should they be applied to the account.
     */
    public AccountBuilder.Impl withCoverage(@NonNull Account.Coverage... coverage) {
      this.coverage = Arrays.asList(coverage);
      return this;
    }
    /**
     * @param coverage - The party(s) that are responsible for covering the payment of this account,
     *     and what order should they be applied to the account.
     */
    public AccountBuilder.Impl withCoverage(@NonNull Collection<Account.Coverage> coverage) {
      this.coverage = Collections.unmodifiableCollection(coverage);
      return this;
    }

    public AccountBuilder.Impl withCoverage(@NonNull Account_CoverageBuilder... coverage) {
      this.coverage = Arrays.stream(coverage).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param guarantor - The parties responsible for balancing the account if other payment options
     *     fall short.
     */
    public AccountBuilder.Impl withGuarantor(@NonNull Account.Guarantor... guarantor) {
      this.guarantor = Arrays.asList(guarantor);
      return this;
    }
    /**
     * @param guarantor - The parties responsible for balancing the account if other payment options
     *     fall short.
     */
    public AccountBuilder.Impl withGuarantor(@NonNull Collection<Account.Guarantor> guarantor) {
      this.guarantor = Collections.unmodifiableCollection(guarantor);
      return this;
    }

    public AccountBuilder.Impl withGuarantor(@NonNull Account_GuarantorBuilder... guarantor) {
      this.guarantor = Arrays.stream(guarantor).map(e -> e.build()).collect(toList());
      return this;
    }

    public AccountBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Account build() {
      return new Account(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(name),
          OptionConverters.toScala(owner),
          status,
          OptionConverters.toScala(partOf),
          subject.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(servicePeriod),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          coverage.stream().collect(new LitSeqJCollector<>()),
          guarantor.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
