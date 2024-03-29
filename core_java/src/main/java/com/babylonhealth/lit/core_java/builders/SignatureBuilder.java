package com.babylonhealth.lit.core_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.model.Unions.*;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface SignatureBuilder extends ElementBuilder {
  public Signature build();

  public static Impl init(Reference who, Collection<Coding> _type, ZonedDateTime when) {
    return new Impl(who, _type, when);
  }

  public static Impl builder(
      ReferenceBuilder who, Collection<CodingBuilder> _type, ZonedDateTime when) {
    return new Impl(who.build(), new LitSeq<>(_type).map(CodingBuilder::build), when);
  }

  public class Impl implements SignatureBuilder {
    private Optional<String> id = Optional.empty();
    private Reference who;
    private Collection<Coding> _type;
    private ZonedDateTime when;
    private Optional<byte[]> data = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> sigFormat = Optional.empty();
    private Optional<Reference> onBehalfOf = Optional.empty();
    private Optional<String> targetFormat = Optional.empty();

    /**
     * Required fields for {@link Signature}
     *
     * @param who - A reference to an application-usable description of the identity that signed
     *     (e.g. the signature used their private key).
     * @param _type - An indication of the reason that the entity signed this document. This may be
     *     explicitly included as part of the signature information and can be used when determining
     *     accountability for various actions concerning the document.
     * @param when - When the digital signature was signed.
     */
    public Impl(Reference who, Collection<Coding> _type, ZonedDateTime when) {
      this.who = who;
      this._type = _type;
      this.when = when;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public SignatureBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param data - The base64 encoding of the Signature content. When signature is not recorded
     *     electronically this element would be empty.
     */
    public SignatureBuilder.Impl withData(@NonNull byte[] data) {
      this.data = Optional.of(data);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public SignatureBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public SignatureBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SignatureBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param sigFormat - A mime type that indicates the technical format of the signature.
     *     Important mime types are application/signature+xml for X ML DigSig, application/jose for
     *     JWS, and image/* for a graphical image of a signature, etc.
     */
    public SignatureBuilder.Impl withSigFormat(@NonNull String sigFormat) {
      this.sigFormat = Optional.of(sigFormat);
      return this;
    }
    /**
     * @param onBehalfOf - A reference to an application-usable description of the identity that is
     *     represented by the signature.
     */
    public SignatureBuilder.Impl withOnBehalfOf(@NonNull Reference onBehalfOf) {
      this.onBehalfOf = Optional.of(onBehalfOf);
      return this;
    }

    public SignatureBuilder.Impl withOnBehalfOf(@NonNull ReferenceBuilder onBehalfOf) {
      this.onBehalfOf = Optional.of(onBehalfOf.build());
      return this;
    }
    /**
     * @param targetFormat - A mime type that indicates the technical format of the target resources
     *     signed by the signature.
     */
    public SignatureBuilder.Impl withTargetFormat(@NonNull String targetFormat) {
      this.targetFormat = Optional.of(targetFormat);
      return this;
    }

    public Signature build() {
      return new Signature(
          OptionConverters.toScala(id),
          who,
          _type.stream().collect(new NonEmptyLitSeqJCollector<>()),
          when,
          OptionConverters.toScala(data),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(sigFormat),
          OptionConverters.toScala(onBehalfOf),
          OptionConverters.toScala(targetFormat),
          LitUtils.emptyMetaElMap());
    }
  }
}
