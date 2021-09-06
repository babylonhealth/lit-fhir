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
import com.babylonhealth.lit.hl7.HTTP_VERB;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface Bundle_Entry_RequestBuilder {
  public Bundle$Entry$Request build();

  public static Impl init(String url, HTTP_VERB method) {
    return new Impl(url, method);
  }

  public class Impl implements Bundle_Entry_RequestBuilder {
    private Optional<String> id = Optional.empty();
    private String url;
    private HTTP_VERB method;
    private Optional<String> ifMatch = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> ifNoneMatch = Optional.empty();
    private Optional<String> ifNoneExist = Optional.empty();
    private Optional<ZonedDateTime> ifModifiedSince = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link Bundle$Entry$Request}
     *
     * @param url
     * @param method
     */
    public Impl(String url, HTTP_VERB method) {
      this.url = url;
      this.method = method;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Bundle_Entry_RequestBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param ifMatch */
    public Bundle_Entry_RequestBuilder.Impl withIfMatch(@NonNull String ifMatch) {
      this.ifMatch = Optional.of(ifMatch);
      return this;
    }
    /** @param extension */
    public Bundle_Entry_RequestBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /** @param extension */
    public Bundle_Entry_RequestBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /** @param ifNoneMatch */
    public Bundle_Entry_RequestBuilder.Impl withIfNoneMatch(@NonNull String ifNoneMatch) {
      this.ifNoneMatch = Optional.of(ifNoneMatch);
      return this;
    }
    /** @param ifNoneExist */
    public Bundle_Entry_RequestBuilder.Impl withIfNoneExist(@NonNull String ifNoneExist) {
      this.ifNoneExist = Optional.of(ifNoneExist);
      return this;
    }
    /** @param ifModifiedSince */
    public Bundle_Entry_RequestBuilder.Impl withIfModifiedSince(
        @NonNull ZonedDateTime ifModifiedSince) {
      this.ifModifiedSince = Optional.of(ifModifiedSince);
      return this;
    }
    /** @param modifierExtension */
    public Bundle_Entry_RequestBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /** @param modifierExtension */
    public Bundle_Entry_RequestBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Bundle$Entry$Request build() {
      return new Bundle$Entry$Request(
          OptionConverters.toScala(id),
          url,
          method,
          OptionConverters.toScala(ifMatch),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(ifNoneMatch),
          OptionConverters.toScala(ifNoneExist),
          OptionConverters.toScala(ifModifiedSince),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
