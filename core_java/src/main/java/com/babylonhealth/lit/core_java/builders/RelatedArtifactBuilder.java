package com.babylonhealth.lit.core_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.RELATED_ARTIFACT_TYPE;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface RelatedArtifactBuilder extends ElementBuilder {
  public RelatedArtifact build();

  public static Impl init(RELATED_ARTIFACT_TYPE _type) {
    return new Impl(_type);
  }

  public static Impl builder(RELATED_ARTIFACT_TYPE _type) {
    return new Impl(_type);
  }

  public class Impl implements RelatedArtifactBuilder {
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
    public Impl(RELATED_ARTIFACT_TYPE _type) {
      this._type = _type;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public RelatedArtifactBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param url - A url for the artifact that can be followed to access the actual content. */
    public RelatedArtifactBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /**
     * @param label - A short label that can be used to reference the citation from elsewhere in the
     *     containing artifact, such as a footnote index.
     */
    public RelatedArtifactBuilder.Impl withLabel(@NonNull String label) {
      this.label = Optional.of(label);
      return this;
    }
    /**
     * @param display - A brief description of the document or knowledge resource being referenced,
     *     suitable for display to a consumer.
     */
    public RelatedArtifactBuilder.Impl withDisplay(@NonNull String display) {
      this.display = Optional.of(display);
      return this;
    }
    /**
     * @param citation - A bibliographic citation for the related artifact. This text SHOULD be
     *     formatted according to an accepted citation format.
     */
    public RelatedArtifactBuilder.Impl withCitation(@NonNull String citation) {
      this.citation = Optional.of(citation);
      return this;
    }
    /**
     * @param document - The document being referenced, represented as an attachment. This is
     *     exclusive with the resource element.
     */
    public RelatedArtifactBuilder.Impl withDocument(@NonNull Attachment document) {
      this.document = Optional.of(document);
      return this;
    }

    public RelatedArtifactBuilder.Impl withDocument(@NonNull AttachmentBuilder document) {
      this.document = Optional.of(document.build());
      return this;
    }
    /**
     * @param resource - The related resource, such as a library, value set, profile, or other
     *     knowledge resource.
     */
    public RelatedArtifactBuilder.Impl withResource(@NonNull String resource) {
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
    public RelatedArtifactBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public RelatedArtifactBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public RelatedArtifactBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
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
}
