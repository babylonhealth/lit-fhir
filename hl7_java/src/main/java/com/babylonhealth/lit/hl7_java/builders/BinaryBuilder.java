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
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class BinaryBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<byte[]> data = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private String contentType;
  private Optional<String> implicitRules = Optional.empty();
  private Optional<Reference> securityContext = Optional.empty();

  /**
   * Required fields for {@link Binary}
   *
   * @param contentType - MimeType of the binary content represented as a standard MimeType (BCP
   *     13).
   */
  public BinaryBuilder(String contentType) {
    this.contentType = contentType;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public BinaryBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public BinaryBuilder withMeta(@NonNull Meta meta) {
    this.meta = Optional.of(meta);
    return this;
  }
  /** @param data - The actual content, base64 encoded. */
  public BinaryBuilder withData(@NonNull byte[] data) {
    this.data = Optional.of(data);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public BinaryBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public BinaryBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param securityContext - This element identifies another resource that can be used as a proxy
   *     of the security sensitivity to use when deciding and enforcing access control rules for the
   *     Binary resource. Given that the Binary resource contains very few elements that can be used
   *     to determine the sensitivity of the data and relationships to individuals, the referenced
   *     resource stands in as a proxy equivalent for this purpose. This referenced resource may be
   *     related to the Binary (e.g. Media, DocumentReference), or may be some non-related Resource
   *     purely as a security proxy. E.g. to identify that the binary resource relates to a patient,
   *     and access should only be granted to applications that have access to the patient.
   */
  public BinaryBuilder withSecurityContext(@NonNull Reference securityContext) {
    this.securityContext = Optional.of(securityContext);
    return this;
  }

  public BinaryBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Binary build() {
    return new Binary(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(meta),
        (Option) OptionConverters.toScala(data),
        (Option) OptionConverters.toScala(language),
        contentType,
        (Option) OptionConverters.toScala(implicitRules),
        (Option) OptionConverters.toScala(securityContext),
        LitUtils.emptyMetaElMap());
  }
}
