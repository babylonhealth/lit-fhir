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
import com.babylonhealth.lit.hl7.RESOURCE_TYPES;
import com.babylonhealth.lit.hl7.SEARCH_PARAM_TYPE;
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS;
import com.babylonhealth.lit.hl7.RESOURCE_TYPES;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.SEARCH_MODIFIER_CODE;
import com.babylonhealth.lit.hl7.SEARCH_XPATH_USAGE;
import com.babylonhealth.lit.hl7.SEARCH_COMPARATOR;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class SearchParameterBuilder {
  private Optional<String> id = Optional.empty();
  private String url;
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private String name;
  private Optional<FHIRDateTime> date = Optional.empty();
  private String code;
  private Collection<RESOURCE_TYPES> base;
  private SEARCH_PARAM_TYPE _type;
  private Optional<String> xpath = Optional.empty();
  private Collection<String> chain = Collections.emptyList();
  private PUBLICATION_STATUS status;
  private Collection<RESOURCE_TYPES> target = Collections.emptyList();
  private Optional<String> version = Optional.empty();
  private Collection<ContactDetail> contact = Collections.emptyList();
  private Optional<String> purpose = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<SEARCH_MODIFIER_CODE> modifier = Collections.emptyList();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> publisher = Optional.empty();
  private Collection<UsageContext> useContext = Collections.emptyList();
  private Optional<String> expression = Optional.empty();
  private Optional<SEARCH_XPATH_USAGE> xpathUsage = Optional.empty();
  private Optional<Boolean> multipleOr = Optional.empty();
  private Collection<SEARCH_COMPARATOR> comparator = Collections.emptyList();
  private Optional<String> derivedFrom = Optional.empty();
  private String description;
  private Optional<Boolean> multipleAnd = Optional.empty();
  private Optional<Boolean> experimental = Optional.empty();
  private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<SearchParameter.Component> component = Collections.emptyList();

  /**
   * Required fields for {@link SearchParameter}
   *
   * @param url - An absolute URI that is used to identify this search parameter when it is
   *     referenced in a specification, model, design or an instance; also called its canonical
   *     identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
   *     which an authoritative instance of this search parameter is (or will be) published. This
   *     URL can be the target of a canonical reference. It SHALL remain the same when the search
   *     parameter is stored on different servers.
   * @param name - A natural language name identifying the search parameter. This name should be
   *     usable as an identifier for the module by machine processing applications such as code
   *     generation.
   * @param code - The code used in the URL or the parameter name in a parameters resource for this
   *     search parameter.
   * @param base - The base resource type(s) that this search parameter can be used against.
   * @param _type - The type of value that a search parameter may contain, and how the content is
   *     interpreted.
   * @param status - The status of this search parameter. Enables tracking the life-cycle of the
   *     content.
   * @param description - And how it used.
   */
  public SearchParameterBuilder(
      String url,
      String name,
      String code,
      Collection<RESOURCE_TYPES> base,
      SEARCH_PARAM_TYPE _type,
      PUBLICATION_STATUS status,
      String description) {
    this.url = url;
    this.name = name;
    this.code = code;
    this.base = base;
    this._type = _type;
    this.status = status;
    this.description = description;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public SearchParameterBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public SearchParameterBuilder withMeta(@NonNull Meta meta) {
    this.meta = Optional.of(meta);
    return this;
  }
  /**
   * @param text - A human-readable narrative that contains a summary of the resource and can be
   *     used to represent the content of the resource to a human. The narrative need not encode all
   *     the structured data, but is required to contain sufficient detail to make it "clinically
   *     safe" for a human to just read the narrative. Resource definitions may define what content
   *     should be represented in the narrative to ensure clinical safety.
   */
  public SearchParameterBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param date - The date (and optionally time) when the search parameter was published. The date
   *     must change when the business version changes and it must change if the status code
   *     changes. In addition, it should change when the substantive content of the search parameter
   *     changes.
   */
  public SearchParameterBuilder withDate(@NonNull FHIRDateTime date) {
    this.date = Optional.of(date);
    return this;
  }
  /** @param xpath - An XPath expression that returns a set of elements for the search parameter. */
  public SearchParameterBuilder withXpath(@NonNull String xpath) {
    this.xpath = Optional.of(xpath);
    return this;
  }
  /**
   * @param chain - Contains the names of any search parameters which may be chained to the
   *     containing search parameter. Chained parameters may be added to search parameters of type
   *     reference and specify that resources will only be returned if they contain a reference to a
   *     resource which matches the chained parameter value. Values for this field should be drawn
   *     from SearchParameter.code for a parameter on the target resource type.
   */
  public SearchParameterBuilder withChain(@NonNull String... chain) {
    this.chain = Arrays.asList(chain);
    return this;
  }
  /**
   * @param chain - Contains the names of any search parameters which may be chained to the
   *     containing search parameter. Chained parameters may be added to search parameters of type
   *     reference and specify that resources will only be returned if they contain a reference to a
   *     resource which matches the chained parameter value. Values for this field should be drawn
   *     from SearchParameter.code for a parameter on the target resource type.
   */
  public SearchParameterBuilder withChain(@NonNull Collection<String> chain) {
    this.chain = Collections.unmodifiableCollection(chain);
    return this;
  }
  /** @param target - Types of resource (if a resource is referenced). */
  public SearchParameterBuilder withTarget(@NonNull RESOURCE_TYPES... target) {
    this.target = Arrays.asList(target);
    return this;
  }
  /** @param target - Types of resource (if a resource is referenced). */
  public SearchParameterBuilder withTarget(@NonNull Collection<RESOURCE_TYPES> target) {
    this.target = Collections.unmodifiableCollection(target);
    return this;
  }
  /**
   * @param version - The identifier that is used to identify this version of the search parameter
   *     when it is referenced in a specification, model, design or instance. This is an arbitrary
   *     value managed by the search parameter author and is not expected to be globally unique. For
   *     example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available.
   *     There is also no expectation that versions can be placed in a lexicographical sequence.
   */
  public SearchParameterBuilder withVersion(@NonNull String version) {
    this.version = Optional.of(version);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public SearchParameterBuilder withContact(@NonNull ContactDetail... contact) {
    this.contact = Arrays.asList(contact);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public SearchParameterBuilder withContact(@NonNull Collection<ContactDetail> contact) {
    this.contact = Collections.unmodifiableCollection(contact);
    return this;
  }
  /**
   * @param purpose - Explanation of why this search parameter is needed and why it has been
   *     designed as it has.
   */
  public SearchParameterBuilder withPurpose(@NonNull String purpose) {
    this.purpose = Optional.of(purpose);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public SearchParameterBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /** @param modifier - A modifier supported for the search parameter. */
  public SearchParameterBuilder withModifier(@NonNull SEARCH_MODIFIER_CODE... modifier) {
    this.modifier = Arrays.asList(modifier);
    return this;
  }
  /** @param modifier - A modifier supported for the search parameter. */
  public SearchParameterBuilder withModifier(@NonNull Collection<SEARCH_MODIFIER_CODE> modifier) {
    this.modifier = Collections.unmodifiableCollection(modifier);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public SearchParameterBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public SearchParameterBuilder withContained(@NonNull Collection<Resource> contained) {
    this.contained = Collections.unmodifiableCollection(contained);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public SearchParameterBuilder withExtension(@NonNull Extension... extension) {
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
  public SearchParameterBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param publisher - The name of the organization or individual that published the search
   *     parameter.
   */
  public SearchParameterBuilder withPublisher(@NonNull String publisher) {
    this.publisher = Optional.of(publisher);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate search parameter instances.
   */
  public SearchParameterBuilder withUseContext(@NonNull UsageContext... useContext) {
    this.useContext = Arrays.asList(useContext);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate search parameter instances.
   */
  public SearchParameterBuilder withUseContext(@NonNull Collection<UsageContext> useContext) {
    this.useContext = Collections.unmodifiableCollection(useContext);
    return this;
  }
  /**
   * @param expression - A FHIRPath expression that returns a set of elements for the search
   *     parameter.
   */
  public SearchParameterBuilder withExpression(@NonNull String expression) {
    this.expression = Optional.of(expression);
    return this;
  }
  /**
   * @param xpathUsage - How the search parameter relates to the set of elements returned by
   *     evaluating the xpath query.
   */
  public SearchParameterBuilder withXpathUsage(@NonNull SEARCH_XPATH_USAGE xpathUsage) {
    this.xpathUsage = Optional.of(xpathUsage);
    return this;
  }
  /**
   * @param multipleOr - Whether multiple values are allowed for each time the parameter exists.
   *     Values are separated by commas, and the parameter matches if any of the values match.
   */
  public SearchParameterBuilder withMultipleOr(@NonNull Boolean multipleOr) {
    this.multipleOr = Optional.of(multipleOr);
    return this;
  }
  /** @param comparator - Comparators supported for the search parameter. */
  public SearchParameterBuilder withComparator(@NonNull SEARCH_COMPARATOR... comparator) {
    this.comparator = Arrays.asList(comparator);
    return this;
  }
  /** @param comparator - Comparators supported for the search parameter. */
  public SearchParameterBuilder withComparator(@NonNull Collection<SEARCH_COMPARATOR> comparator) {
    this.comparator = Collections.unmodifiableCollection(comparator);
    return this;
  }
  /**
   * @param derivedFrom - Where this search parameter is originally defined. If a derivedFrom is
   *     provided, then the details in the search parameter must be consistent with the definition
   *     from which it is defined. i.e. the parameter should have the same meaning, and (usually)
   *     the functionality should be a proper subset of the underlying search parameter.
   */
  public SearchParameterBuilder withDerivedFrom(@NonNull String derivedFrom) {
    this.derivedFrom = Optional.of(derivedFrom);
    return this;
  }
  /**
   * @param multipleAnd - Whether multiple parameters are allowed - e.g. more than one parameter
   *     with the same name. The search matches if all the parameters match.
   */
  public SearchParameterBuilder withMultipleAnd(@NonNull Boolean multipleAnd) {
    this.multipleAnd = Optional.of(multipleAnd);
    return this;
  }
  /**
   * @param experimental - A Boolean value to indicate that this search parameter is authored for
   *     testing purposes (or education/evaluation/marketing) and is not intended to be used for
   *     genuine usage.
   */
  public SearchParameterBuilder withExperimental(@NonNull Boolean experimental) {
    this.experimental = Optional.of(experimental);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the search parameter is intended to
   *     be used.
   */
  public SearchParameterBuilder withJurisdiction(@NonNull CodeableConcept... jurisdiction) {
    this.jurisdiction = Arrays.asList(jurisdiction);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the search parameter is intended to
   *     be used.
   */
  public SearchParameterBuilder withJurisdiction(
      @NonNull Collection<CodeableConcept> jurisdiction) {
    this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public SearchParameterBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
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
  public SearchParameterBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public SearchParameterBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param component - Used to define the parts of a composite search parameter. */
  public SearchParameterBuilder withComponent(@NonNull SearchParameter.Component... component) {
    this.component = Arrays.asList(component);
    return this;
  }
  /** @param component - Used to define the parts of a composite search parameter. */
  public SearchParameterBuilder withComponent(
      @NonNull Collection<SearchParameter.Component> component) {
    this.component = Collections.unmodifiableCollection(component);
    return this;
  }

  public SearchParameterBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public SearchParameter build() {
    return new SearchParameter(
        OptionConverters.toScala(id),
        url,
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        name,
        OptionConverters.toScala(date),
        code,
        base.stream().collect(new NonEmptyLitSeqJCollector<>()),
        _type,
        OptionConverters.toScala(xpath),
        chain.stream().collect(new LitSeqJCollector<>()),
        status,
        target.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(version),
        contact.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(purpose),
        OptionConverters.toScala(language),
        modifier.stream().collect(new LitSeqJCollector<>()),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(publisher),
        useContext.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(expression),
        OptionConverters.toScala(xpathUsage),
        OptionConverters.toScala(multipleOr.map(x -> (Object) x)),
        comparator.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(derivedFrom),
        description,
        OptionConverters.toScala(multipleAnd.map(x -> (Object) x)),
        OptionConverters.toScala(experimental.map(x -> (Object) x)),
        jurisdiction.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        component.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
