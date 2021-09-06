package com.babylonhealth.lit.core_java.builders;

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
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.core.ALL_TYPES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface DataRequirementBuilder extends ElementBuilder {
  public DataRequirement build();

  public static Impl init(ALL_TYPES _type) {
    return new Impl(_type);
  }

  public static Impl builder(ALL_TYPES _type) {
    return new Impl(_type);
  }

  public static ChoiceCodeableConceptOrReference subject(CodeableConcept c) {
    return new ChoiceCodeableConceptOrReference(c);
  }

  public static ChoiceCodeableConceptOrReference subject(Reference r) {
    return new ChoiceCodeableConceptOrReference(r);
  }

  public class Impl implements DataRequirementBuilder {
    private Optional<String> id = Optional.empty();
    private ALL_TYPES _type;
    private Optional<Integer> limit = Optional.empty();
    private Collection<String> profile = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ChoiceCodeableConceptOrReference> subject = Optional.empty();
    private Collection<String> mustSupport = Collections.emptyList();
    private Collection<DataRequirement.Sort> sort = Collections.emptyList();
    private Collection<DataRequirement.CodeFilter> codeFilter = Collections.emptyList();
    private Collection<DataRequirement.DateFilter> dateFilter = Collections.emptyList();

    /**
     * Required fields for {@link DataRequirement}
     *
     * @param _type - The type of the required data, specified as the type name of a resource. For
     *     profiles, this value is set to the type of the base resource of the profile.
     */
    public Impl(ALL_TYPES _type) {
      this._type = _type;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public DataRequirementBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param limit - Specifies a maximum number of results that are required (uses the _count
     *     search parameter).
     */
    public DataRequirementBuilder.Impl withLimit(@NonNull Integer limit) {
      this.limit = Optional.of(limit);
      return this;
    }
    /**
     * @param profile - The profile of the required data, specified as the uri of the profile
     *     definition.
     */
    public DataRequirementBuilder.Impl withProfile(@NonNull String... profile) {
      this.profile = Arrays.asList(profile);
      return this;
    }
    /**
     * @param profile - The profile of the required data, specified as the uri of the profile
     *     definition.
     */
    public DataRequirementBuilder.Impl withProfile(@NonNull Collection<String> profile) {
      this.profile = Collections.unmodifiableCollection(profile);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public DataRequirementBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public DataRequirementBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public DataRequirementBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param subject - The intended subjects of the data requirement. If this element is not
     *     provided, a Patient subject is assumed. Field is a 'choice' field. Type should be one of
     *     CodeableConcept, Reference. To pass the value in, wrap with one of the
     *     DataRequirementBuilder.subject static methods
     */
    public DataRequirementBuilder.Impl withSubject(
        @NonNull ChoiceCodeableConceptOrReference subject) {
      this.subject = Optional.of(subject);
      return this;
    }
    /**
     * @param mustSupport - Indicates that specific elements of the type are referenced by the
     *     knowledge module and must be supported by the consumer in order to obtain an effective
     *     evaluation. This does not mean that a value is required for this element, only that the
     *     consuming system must understand the element and be able to provide values for it if they
     *     are available.
     *     <p>The value of mustSupport SHALL be a FHIRPath resolveable on the type of the
     *     DataRequirement. The path SHALL consist only of identifiers, constant indexers, and
     *     .resolve() (see the [Simple FHIRPath Profile](fhirpath.html#simple) for full details).
     */
    public DataRequirementBuilder.Impl withMustSupport(@NonNull String... mustSupport) {
      this.mustSupport = Arrays.asList(mustSupport);
      return this;
    }
    /**
     * @param mustSupport - Indicates that specific elements of the type are referenced by the
     *     knowledge module and must be supported by the consumer in order to obtain an effective
     *     evaluation. This does not mean that a value is required for this element, only that the
     *     consuming system must understand the element and be able to provide values for it if they
     *     are available.
     *     <p>The value of mustSupport SHALL be a FHIRPath resolveable on the type of the
     *     DataRequirement. The path SHALL consist only of identifiers, constant indexers, and
     *     .resolve() (see the [Simple FHIRPath Profile](fhirpath.html#simple) for full details).
     */
    public DataRequirementBuilder.Impl withMustSupport(@NonNull Collection<String> mustSupport) {
      this.mustSupport = Collections.unmodifiableCollection(mustSupport);
      return this;
    }
    /** @param sort - Specifies the order of the results to be returned. */
    public DataRequirementBuilder.Impl withSort(@NonNull DataRequirement.Sort... sort) {
      this.sort = Arrays.asList(sort);
      return this;
    }
    /** @param sort - Specifies the order of the results to be returned. */
    public DataRequirementBuilder.Impl withSort(@NonNull Collection<DataRequirement.Sort> sort) {
      this.sort = Collections.unmodifiableCollection(sort);
      return this;
    }

    public DataRequirementBuilder.Impl withSort(@NonNull DataRequirement_SortBuilder... sort) {
      this.sort = Arrays.stream(sort).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param codeFilter - Code filters specify additional constraints on the data, specifying the
     *     value set of interest for a particular element of the data. Each code filter defines an
     *     additional constraint on the data, i.e. code filters are AND'ed, not OR'ed.
     */
    public DataRequirementBuilder.Impl withCodeFilter(
        @NonNull DataRequirement.CodeFilter... codeFilter) {
      this.codeFilter = Arrays.asList(codeFilter);
      return this;
    }
    /**
     * @param codeFilter - Code filters specify additional constraints on the data, specifying the
     *     value set of interest for a particular element of the data. Each code filter defines an
     *     additional constraint on the data, i.e. code filters are AND'ed, not OR'ed.
     */
    public DataRequirementBuilder.Impl withCodeFilter(
        @NonNull Collection<DataRequirement.CodeFilter> codeFilter) {
      this.codeFilter = Collections.unmodifiableCollection(codeFilter);
      return this;
    }

    public DataRequirementBuilder.Impl withCodeFilter(
        @NonNull DataRequirement_CodeFilterBuilder... codeFilter) {
      this.codeFilter = Arrays.stream(codeFilter).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param dateFilter - Date filters specify additional constraints on the data in terms of the
     *     applicable date range for specific elements. Each date filter specifies an additional
     *     constraint on the data, i.e. date filters are AND'ed, not OR'ed.
     */
    public DataRequirementBuilder.Impl withDateFilter(
        @NonNull DataRequirement.DateFilter... dateFilter) {
      this.dateFilter = Arrays.asList(dateFilter);
      return this;
    }
    /**
     * @param dateFilter - Date filters specify additional constraints on the data in terms of the
     *     applicable date range for specific elements. Each date filter specifies an additional
     *     constraint on the data, i.e. date filters are AND'ed, not OR'ed.
     */
    public DataRequirementBuilder.Impl withDateFilter(
        @NonNull Collection<DataRequirement.DateFilter> dateFilter) {
      this.dateFilter = Collections.unmodifiableCollection(dateFilter);
      return this;
    }

    public DataRequirementBuilder.Impl withDateFilter(
        @NonNull DataRequirement_DateFilterBuilder... dateFilter) {
      this.dateFilter = Arrays.stream(dateFilter).map(e -> e.build()).collect(toList());
      return this;
    }

    public DataRequirement build() {
      return new DataRequirement(
          OptionConverters.toScala(id),
          _type,
          OptionConverters.toScala(limit.map(x -> (Object) x)),
          profile.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(subject),
          mustSupport.stream().collect(new LitSeqJCollector<>()),
          sort.stream().collect(new LitSeqJCollector<>()),
          codeFilter.stream().collect(new LitSeqJCollector<>()),
          dateFilter.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
