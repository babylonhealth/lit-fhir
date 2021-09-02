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
import com.babylonhealth.lit.core.RELATED_ARTIFACT_TYPE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class RelatedArtifactBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> url = Optional.empty();
  private RELATED_ARTIFACT_TYPE _type;
  private Optional<String> label = Optional.empty();
  private Optional<String> display = Optional.empty();
  private Optional<String> citation = Optional.empty();
  private Optional<Attachment> document = Optional.empty();
  private Optional<String> resource = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();

  /**
   * Required fields for {@link RelatedArtifact}
   *
   * @param _type - The type of relationship to the related artifact.
   */
  public RelatedArtifactBuilder(RELATED_ARTIFACT_TYPE _type) {
    this._type = _type;
  }

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public RelatedArtifactBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param url - A url for the artifact that can be followed to access the actual content. */
  public RelatedArtifactBuilder withUrl(@NonNull String url) {
    this.url = Optional.of(url);
    return this;
  }
  /**
   * @param label - A short label that can be used to reference the citation from elsewhere in the
   *     containing artifact, such as a footnote index.
   */
  public RelatedArtifactBuilder withLabel(@NonNull String label) {
    this.label = Optional.of(label);
    return this;
  }
  /**
   * @param display - A brief description of the document or knowledge resource being referenced,
   *     suitable for display to a consumer.
   */
  public RelatedArtifactBuilder withDisplay(@NonNull String display) {
    this.display = Optional.of(display);
    return this;
  }
  /**
   * @param citation - A bibliographic citation for the related artifact. This text SHOULD be
   *     formatted according to an accepted citation format.
   */
  public RelatedArtifactBuilder withCitation(@NonNull String citation) {
    this.citation = Optional.of(citation);
    return this;
  }
  /**
   * @param document - The document being referenced, represented as an attachment. This is
   *     exclusive with the resource element.
   */
  public RelatedArtifactBuilder withDocument(@NonNull Attachment document) {
    this.document = Optional.of(document);
    return this;
  }
  /**
   * @param resource - The related resource, such as a library, value set, profile, or other
   *     knowledge resource.
   */
  public RelatedArtifactBuilder withResource(@NonNull String resource) {
    this.resource = Optional.of(resource);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public RelatedArtifactBuilder withExtension(@NonNull Extension... extension) {
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
  public RelatedArtifactBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }

  public RelatedArtifact build() {
    return new RelatedArtifact(
        OptionConverters.toScala(id),
        OptionConverters.toScala(url),
        _type,
        OptionConverters.toScala(label),
        OptionConverters.toScala(display),
        OptionConverters.toScala(citation),
        OptionConverters.toScala(document),
        OptionConverters.toScala(resource),
        extension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
