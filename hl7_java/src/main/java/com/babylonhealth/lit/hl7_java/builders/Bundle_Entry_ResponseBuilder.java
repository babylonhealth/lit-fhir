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

public interface Bundle_Entry_ResponseBuilder {
  public Bundle$Entry$Response build();

  public static Impl init(String status) {
    return new Impl(status);
  }

  public static Impl builder(String status) {
    return new Impl(status);
  }

  public class Impl implements Bundle_Entry_ResponseBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> etag = Optional.empty();
    private String status;
    private Optional<Resource> outcome = Optional.empty();
    private Optional<String> location = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ZonedDateTime> lastModified = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link Bundle$Entry$Response}
     *
     * @param status
     */
    public Impl(String status) {
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Bundle_Entry_ResponseBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param etag */
    public Bundle_Entry_ResponseBuilder.Impl withEtag(@NonNull String etag) {
      this.etag = Optional.of(etag);
      return this;
    }
    /** @param outcome */
    public Bundle_Entry_ResponseBuilder.Impl withOutcome(@NonNull Resource outcome) {
      this.outcome = Optional.of(outcome);
      return this;
    }
    /** @param location */
    public Bundle_Entry_ResponseBuilder.Impl withLocation(@NonNull String location) {
      this.location = Optional.of(location);
      return this;
    }
    /** @param extension */
    public Bundle_Entry_ResponseBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /** @param extension */
    public Bundle_Entry_ResponseBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /** @param lastModified */
    public Bundle_Entry_ResponseBuilder.Impl withLastModified(@NonNull ZonedDateTime lastModified) {
      this.lastModified = Optional.of(lastModified);
      return this;
    }
    /** @param modifierExtension */
    public Bundle_Entry_ResponseBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /** @param modifierExtension */
    public Bundle_Entry_ResponseBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Bundle$Entry$Response build() {
      return new Bundle$Entry$Response(
          OptionConverters.toScala(id),
          OptionConverters.toScala(etag),
          status,
          OptionConverters.toScala(outcome),
          OptionConverters.toScala(location),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(lastModified),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
