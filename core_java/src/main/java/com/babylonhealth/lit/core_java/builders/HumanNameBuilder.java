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
import com.babylonhealth.lit.core.NAME_USE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface HumanNameBuilder extends ElementBuilder {
  public HumanName build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements HumanNameBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<NAME_USE> use = Optional.empty();
    private Optional<String> text = Optional.empty();
    private Collection<String> given = Collections.emptyList();
    private Optional<String> family = Optional.empty();
    private Collection<String> prefix = Collections.emptyList();
    private Collection<String> suffix = Collections.emptyList();
    private Optional<Period> period = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();

    /** Required fields for {@link HumanName} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public HumanNameBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param use - Identifies the purpose for this name. */
    public HumanNameBuilder.Impl withUse(@NonNull NAME_USE use) {
      this.use = Optional.of(use);
      return this;
    }
    /**
     * @param text - Specifies the entire name as it should be displayed e.g. on an application UI.
     *     This may be provided instead of or as well as the specific parts.
     */
    public HumanNameBuilder.Impl withText(@NonNull String text) {
      this.text = Optional.of(text);
      return this;
    }
    /** @param given - Given name. */
    public HumanNameBuilder.Impl withGiven(@NonNull String... given) {
      this.given = Arrays.asList(given);
      return this;
    }
    /** @param given - Given name. */
    public HumanNameBuilder.Impl withGiven(@NonNull Collection<String> given) {
      this.given = Collections.unmodifiableCollection(given);
      return this;
    }
    /**
     * @param family - The part of a name that links to the genealogy. In some cultures (e.g.
     *     Eritrea) the family name of a son is the first name of his father.
     */
    public HumanNameBuilder.Impl withFamily(@NonNull String family) {
      this.family = Optional.of(family);
      return this;
    }
    /**
     * @param prefix - Part of the name that is acquired as a title due to academic, legal,
     *     employment or nobility status, etc. and that appears at the start of the name.
     */
    public HumanNameBuilder.Impl withPrefix(@NonNull String... prefix) {
      this.prefix = Arrays.asList(prefix);
      return this;
    }
    /**
     * @param prefix - Part of the name that is acquired as a title due to academic, legal,
     *     employment or nobility status, etc. and that appears at the start of the name.
     */
    public HumanNameBuilder.Impl withPrefix(@NonNull Collection<String> prefix) {
      this.prefix = Collections.unmodifiableCollection(prefix);
      return this;
    }
    /**
     * @param suffix - Part of the name that is acquired as a title due to academic, legal,
     *     employment or nobility status, etc. and that appears at the end of the name.
     */
    public HumanNameBuilder.Impl withSuffix(@NonNull String... suffix) {
      this.suffix = Arrays.asList(suffix);
      return this;
    }
    /**
     * @param suffix - Part of the name that is acquired as a title due to academic, legal,
     *     employment or nobility status, etc. and that appears at the end of the name.
     */
    public HumanNameBuilder.Impl withSuffix(@NonNull Collection<String> suffix) {
      this.suffix = Collections.unmodifiableCollection(suffix);
      return this;
    }
    /**
     * @param period - Indicates the period of time when this name was valid for the named person.
     */
    public HumanNameBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public HumanNameBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public HumanNameBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public HumanName build() {
      return new HumanName(
          OptionConverters.toScala(id),
          OptionConverters.toScala(use),
          OptionConverters.toScala(text),
          given.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(family),
          prefix.stream().collect(new LitSeqJCollector<>()),
          suffix.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(period),
          extension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
