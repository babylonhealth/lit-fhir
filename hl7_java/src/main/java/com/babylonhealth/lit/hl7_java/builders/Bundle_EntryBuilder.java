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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class Bundle_EntryBuilder {
  private Optional<String> id = Optional.empty();
  private Collection<Bundle.Link> link = Collections.emptyList();
  private Optional<String> fullUrl = Optional.empty();
  private Optional<Resource> resource = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Bundle$Entry$Search> search = Optional.empty();
  private Optional<Bundle$Entry$Request> request = Optional.empty();
  private Optional<Bundle$Entry$Response> response = Optional.empty();

  /** Required fields for {@link Bundle.Entry} */
  public Bundle_EntryBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Bundle_EntryBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param link - A series of links that provide context to this bundle. */
  public Bundle_EntryBuilder withLink(@NonNull Bundle.Link... link) {
    this.link = Arrays.asList(link);
    return this;
  }
  /** @param link - A series of links that provide context to this bundle. */
  public Bundle_EntryBuilder withLink(@NonNull Collection<Bundle.Link> link) {
    this.link = Collections.unmodifiableCollection(link);
    return this;
  }
  /** @param fullUrl */
  public Bundle_EntryBuilder withFullUrl(@NonNull String fullUrl) {
    this.fullUrl = Optional.of(fullUrl);
    return this;
  }
  /** @param resource */
  public Bundle_EntryBuilder withResource(@NonNull Resource resource) {
    this.resource = Optional.of(resource);
    return this;
  }
  /** @param extension */
  public Bundle_EntryBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /** @param extension */
  public Bundle_EntryBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param modifierExtension */
  public Bundle_EntryBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /** @param modifierExtension */
  public Bundle_EntryBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param search */
  public Bundle_EntryBuilder withSearch(@NonNull Bundle$Entry$Search search) {
    this.search = Optional.of(search);
    return this;
  }
  /** @param request */
  public Bundle_EntryBuilder withRequest(@NonNull Bundle$Entry$Request request) {
    this.request = Optional.of(request);
    return this;
  }
  /** @param response */
  public Bundle_EntryBuilder withResponse(@NonNull Bundle$Entry$Response response) {
    this.response = Optional.of(response);
    return this;
  }

  public Bundle.Entry build() {
    return new Bundle.Entry(
        OptionConverters.toScala(id),
        link.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(fullUrl),
        OptionConverters.toScala(resource),
        extension.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(search),
        OptionConverters.toScala(request),
        OptionConverters.toScala(response),
        LitUtils.emptyMetaElMap());
  }
}
