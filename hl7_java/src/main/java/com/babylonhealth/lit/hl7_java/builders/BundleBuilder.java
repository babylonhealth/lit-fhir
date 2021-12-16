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
import com.babylonhealth.lit.hl7.BUNDLE_TYPE;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface BundleBuilder extends ResourceBuilder {
  public Bundle build();

  public static Impl init(BUNDLE_TYPE _type) {
    return new Impl(_type);
  }

  public static Impl builder(BUNDLE_TYPE _type) {
    return new Impl(_type);
  }

  public class Impl implements BundleBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private BUNDLE_TYPE _type;
    private Optional<Integer> total = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<ZonedDateTime> timestamp = Optional.empty();
    private Optional<Signature> signature = Optional.empty();
    private Optional<Identifier> identifier = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Bundle.Link> link = Collections.emptyList();
    private Collection<Bundle.Entry> entry = Collections.emptyList();

    /**
     * Required fields for {@link Bundle}
     *
     * @param _type - Indicates the purpose of this bundle - how it is intended to be used.
     */
    public Impl(BUNDLE_TYPE _type) {
      this._type = _type;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public BundleBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public BundleBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public BundleBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
      this.meta = Optional.of(meta.build());
      return this;
    }
    /**
     * @param total - If a set of search matches, this is the total number of entries of type
     *     'match' across all pages in the search. It does not include search.mode = 'include' or
     *     'outcome' entries and it does not provide a count of the number of entries in the Bundle.
     */
    public BundleBuilder.Impl withTotal(@NonNull Integer total) {
      this.total = Optional.of(total);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public BundleBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param timestamp - The date/time that the bundle was assembled - i.e. when the resources were
     *     placed in the bundle.
     */
    public BundleBuilder.Impl withTimestamp(@NonNull ZonedDateTime timestamp) {
      this.timestamp = Optional.of(timestamp);
      return this;
    }
    /** @param signature - Digital Signature - base64 encoded. XML-DSig or a JWT. */
    public BundleBuilder.Impl withSignature(@NonNull Signature signature) {
      this.signature = Optional.of(signature);
      return this;
    }

    public BundleBuilder.Impl withSignature(@NonNull SignatureBuilder signature) {
      this.signature = Optional.of(signature.build());
      return this;
    }
    /**
     * @param identifier - A persistent identifier for the bundle that won't change as a bundle is
     *     copied from server to server.
     */
    public BundleBuilder.Impl withIdentifier(@NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public BundleBuilder.Impl withIdentifier(@NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public BundleBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param link - A series of links that provide context to this bundle. */
    public BundleBuilder.Impl withLink(@NonNull Bundle.Link... link) {
      this.link = Arrays.asList(link);
      return this;
    }
    /** @param link - A series of links that provide context to this bundle. */
    public BundleBuilder.Impl withLink(@NonNull Collection<Bundle.Link> link) {
      this.link = Collections.unmodifiableCollection(link);
      return this;
    }

    public BundleBuilder.Impl withLink(@NonNull Bundle_LinkBuilder... link) {
      this.link = Arrays.stream(link).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param entry - An entry in a bundle resource - will either contain a resource or information
     *     about a resource (transactions and history only).
     */
    public BundleBuilder.Impl withEntry(@NonNull Bundle.Entry... entry) {
      this.entry = Arrays.asList(entry);
      return this;
    }
    /**
     * @param entry - An entry in a bundle resource - will either contain a resource or information
     *     about a resource (transactions and history only).
     */
    public BundleBuilder.Impl withEntry(@NonNull Collection<Bundle.Entry> entry) {
      this.entry = Collections.unmodifiableCollection(entry);
      return this;
    }

    public BundleBuilder.Impl withEntry(@NonNull Bundle_EntryBuilder... entry) {
      this.entry = Arrays.stream(entry).map(e -> e.build()).collect(toList());
      return this;
    }

    public BundleBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Bundle build() {
      return new Bundle(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          _type,
          OptionConverters.toScala(total.map(x -> (Object) x)),
          OptionConverters.toScala(language),
          OptionConverters.toScala(timestamp),
          OptionConverters.toScala(signature),
          OptionConverters.toScala(identifier),
          OptionConverters.toScala(implicitRules),
          link.stream().collect(new LitSeqJCollector<>()),
          entry.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
