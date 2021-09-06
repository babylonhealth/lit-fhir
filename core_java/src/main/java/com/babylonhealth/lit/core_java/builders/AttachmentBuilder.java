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
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class AttachmentBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> url = Optional.empty();
  private Optional<byte[]> data = Optional.empty();
  private Optional<Integer> size = Optional.empty();
  private Optional<byte[]> hash = Optional.empty();
  private Optional<String> title = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Optional<FHIRDateTime> creation = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> contentType = Optional.empty();

  /** Required fields for {@link Attachment} */
  public AttachmentBuilder() {}

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public AttachmentBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param url - A location where the data can be accessed. */
  public AttachmentBuilder withUrl(@NonNull String url) {
    this.url = Optional.of(url);
    return this;
  }
  /** @param data - The actual data of the attachment - a sequence of bytes, base64 encoded. */
  public AttachmentBuilder withData(@NonNull byte[] data) {
    this.data = Optional.of(data);
    return this;
  }
  /**
   * @param size - The number of bytes of data that make up this attachment (before base64 encoding,
   *     if that is done).
   */
  public AttachmentBuilder withSize(@NonNull Integer size) {
    this.size = Optional.of(size);
    return this;
  }
  /** @param hash - The calculated hash of the data using SHA-1. Represented using base64. */
  public AttachmentBuilder withHash(@NonNull byte[] hash) {
    this.hash = Optional.of(hash);
    return this;
  }
  /** @param title - A label or set of text to display in place of the data. */
  public AttachmentBuilder withTitle(@NonNull String title) {
    this.title = Optional.of(title);
    return this;
  }
  /**
   * @param language - The human language of the content. The value can be any valid value according
   *     to BCP 47.
   */
  public AttachmentBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /** @param creation - The date that the attachment was first created. */
  public AttachmentBuilder withCreation(@NonNull FHIRDateTime creation) {
    this.creation = Optional.of(creation);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public AttachmentBuilder withExtension(@NonNull Extension... extension) {
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
  public AttachmentBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param contentType - Identifies the type of the data in the attachment and allows a method to
   *     be chosen to interpret or render the data. Includes mime type parameters such as charset
   *     where appropriate.
   */
  public AttachmentBuilder withContentType(@NonNull String contentType) {
    this.contentType = Optional.of(contentType);
    return this;
  }

  public Attachment build() {
    return new Attachment(
        OptionConverters.toScala(id),
        OptionConverters.toScala(url),
        OptionConverters.toScala(data),
        OptionConverters.toScala(size.map(x -> (Object) x)),
        OptionConverters.toScala(hash),
        OptionConverters.toScala(title),
        OptionConverters.toScala(language),
        OptionConverters.toScala(creation),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(contentType),
        LitUtils.emptyMetaElMap());
  }
}
