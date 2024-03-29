package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Bundle_EntryBuilder {
  public Bundle.Entry build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements Bundle_EntryBuilder {
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
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Bundle_EntryBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param link - A series of links that provide context to this bundle. */
    public Bundle_EntryBuilder.Impl withLink(@NonNull Bundle.Link... link) {
      this.link = Arrays.asList(link);
      return this;
    }
    /** @param link - A series of links that provide context to this bundle. */
    public Bundle_EntryBuilder.Impl withLink(@NonNull Collection<Bundle.Link> link) {
      this.link = Collections.unmodifiableCollection(link);
      return this;
    }

    public Bundle_EntryBuilder.Impl withLink(@NonNull Bundle_LinkBuilder... link) {
      this.link = Arrays.stream(link).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param fullUrl */
    public Bundle_EntryBuilder.Impl withFullUrl(@NonNull String fullUrl) {
      this.fullUrl = Optional.of(fullUrl);
      return this;
    }
    /** @param resource */
    public Bundle_EntryBuilder.Impl withResource(@NonNull Resource resource) {
      this.resource = Optional.of(resource);
      return this;
    }

    public Bundle_EntryBuilder.Impl withResource(@NonNull ResourceBuilder resource) {
      this.resource = Optional.of(resource.build());
      return this;
    }
    /** @param extension */
    public Bundle_EntryBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /** @param extension */
    public Bundle_EntryBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Bundle_EntryBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param modifierExtension */
    public Bundle_EntryBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /** @param modifierExtension */
    public Bundle_EntryBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Bundle_EntryBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param search */
    public Bundle_EntryBuilder.Impl withSearch(@NonNull Bundle$Entry$Search search) {
      this.search = Optional.of(search);
      return this;
    }

    public Bundle_EntryBuilder.Impl withSearch(@NonNull Bundle_Entry_SearchBuilder search) {
      this.search = Optional.of(search.build());
      return this;
    }
    /** @param request */
    public Bundle_EntryBuilder.Impl withRequest(@NonNull Bundle$Entry$Request request) {
      this.request = Optional.of(request);
      return this;
    }

    public Bundle_EntryBuilder.Impl withRequest(@NonNull Bundle_Entry_RequestBuilder request) {
      this.request = Optional.of(request.build());
      return this;
    }
    /** @param response */
    public Bundle_EntryBuilder.Impl withResponse(@NonNull Bundle$Entry$Response response) {
      this.response = Optional.of(response);
      return this;
    }

    public Bundle_EntryBuilder.Impl withResponse(@NonNull Bundle_Entry_ResponseBuilder response) {
      this.response = Optional.of(response.build());
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
}
