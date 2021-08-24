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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface MetaBuilder extends DataTypeBuilder {
  public Meta build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements MetaBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Coding> tag = Collections.emptyList();
    private Optional<String> source = Optional.empty();
    private Collection<String> profile = Collections.emptyList();
    private Collection<Coding> security = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> versionId = Optional.empty();
    private Optional<ZonedDateTime> lastUpdated = Optional.empty();

    /** Required fields for {@link Meta} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public MetaBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param tag - Tags applied to this resource. Tags are intended to be used to identify and
     *     relate resources to process and workflow, and applications are not required to consider
     *     the tags when interpreting the meaning of a resource.
     */
    public MetaBuilder.Impl withTag(@NonNull Coding... tag) {
      this.tag = Arrays.asList(tag);
      return this;
    }
    /**
     * @param tag - Tags applied to this resource. Tags are intended to be used to identify and
     *     relate resources to process and workflow, and applications are not required to consider
     *     the tags when interpreting the meaning of a resource.
     */
    public MetaBuilder.Impl withTag(@NonNull Collection<Coding> tag) {
      this.tag = Collections.unmodifiableCollection(tag);
      return this;
    }

    public MetaBuilder.Impl withTag(@NonNull CodingBuilder... tag) {
      this.tag = Arrays.stream(tag).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param source - A uri that identifies the source system of the resource. This provides a
     *     minimal amount of [Provenance](provenance.html#) information that can be used to track or
     *     differentiate the source of information in the resource. The source may identify another
     *     FHIR server, document, message, database, etc.
     */
    public MetaBuilder.Impl withSource(@NonNull String source) {
      this.source = Optional.of(source);
      return this;
    }
    /**
     * @param profile - A list of profiles (references to
     *     [StructureDefinition](structuredefinition.html#) resources) that this resource claims to
     *     conform to. The URL is a reference to
     *     [StructureDefinition.url](structuredefinition-definitions.html#StructureDefinition.url).
     */
    public MetaBuilder.Impl withProfile(@NonNull String... profile) {
      this.profile = Arrays.asList(profile);
      return this;
    }
    /**
     * @param profile - A list of profiles (references to
     *     [StructureDefinition](structuredefinition.html#) resources) that this resource claims to
     *     conform to. The URL is a reference to
     *     [StructureDefinition.url](structuredefinition-definitions.html#StructureDefinition.url).
     */
    public MetaBuilder.Impl withProfile(@NonNull Collection<String> profile) {
      this.profile = Collections.unmodifiableCollection(profile);
      return this;
    }
    /**
     * @param security - Security labels applied to this resource. These tags connect specific
     *     resources to the overall security policy and infrastructure.
     */
    public MetaBuilder.Impl withSecurity(@NonNull Coding... security) {
      this.security = Arrays.asList(security);
      return this;
    }
    /**
     * @param security - Security labels applied to this resource. These tags connect specific
     *     resources to the overall security policy and infrastructure.
     */
    public MetaBuilder.Impl withSecurity(@NonNull Collection<Coding> security) {
      this.security = Collections.unmodifiableCollection(security);
      return this;
    }

    public MetaBuilder.Impl withSecurity(@NonNull CodingBuilder... security) {
      this.security = Arrays.stream(security).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public MetaBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public MetaBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MetaBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param versionId - The version specific identifier, as it appears in the version portion of
     *     the URL. This value changes when the resource is created, updated, or deleted.
     */
    public MetaBuilder.Impl withVersionId(@NonNull String versionId) {
      this.versionId = Optional.of(versionId);
      return this;
    }
    /** @param lastUpdated - When the resource last changed - e.g. when the version changed. */
    public MetaBuilder.Impl withLastUpdated(@NonNull ZonedDateTime lastUpdated) {
      this.lastUpdated = Optional.of(lastUpdated);
      return this;
    }

    public Meta build() {
      return new Meta(
          OptionConverters.toScala(id),
          tag.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(source),
          profile.stream().collect(new LitSeqJCollector<>()),
          security.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(versionId),
          OptionConverters.toScala(lastUpdated),
          LitUtils.emptyMetaElMap());
    }
  }
}
