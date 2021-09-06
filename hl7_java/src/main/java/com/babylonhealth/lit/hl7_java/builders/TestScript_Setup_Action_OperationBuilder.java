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
import com.babylonhealth.lit.hl7.HTTP_OPERATIONS;
import com.babylonhealth.lit.hl7.DEFINED_TYPES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface TestScript_Setup_Action_OperationBuilder {
  public TestScript$Setup$Action$Operation build();

  public static Impl init(Boolean encodeRequestUrl) {
    return new Impl(encodeRequestUrl);
  }

  public static Impl builder(Boolean encodeRequestUrl) {
    return new Impl(encodeRequestUrl);
  }

  public class Impl implements TestScript_Setup_Action_OperationBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> url = Optional.empty();
    private Optional<Coding> _type = Optional.empty();
    private Optional<String> label = Optional.empty();
    private Optional<String> accept = Optional.empty();
    private Optional<HTTP_OPERATIONS> method = Optional.empty();
    private Optional<Integer> origin = Optional.empty();
    private Optional<String> params = Optional.empty();
    private Optional<DEFINED_TYPES> resource = Optional.empty();
    private Optional<String> sourceId = Optional.empty();
    private Optional<String> targetId = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> requestId = Optional.empty();
    private Optional<String> responseId = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Optional<String> contentType = Optional.empty();
    private Optional<Integer> destination = Optional.empty();
    private Boolean encodeRequestUrl;
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<TestScript$Setup$Action$Operation$RequestHeader> requestHeader =
        Collections.emptyList();

    /**
     * Required fields for {@link TestScript$Setup$Action$Operation}
     *
     * @param encodeRequestUrl
     */
    public Impl(Boolean encodeRequestUrl) {
      this.encodeRequestUrl = encodeRequestUrl;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public TestScript_Setup_Action_OperationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param url - An absolute URI that is used to identify this test script when it is referenced
     *     in a specification, model, design or an instance; also called its canonical identifier.
     *     This SHOULD be globally unique and SHOULD be a literal address at which at which an
     *     authoritative instance of this test script is (or will be) published. This URL can be the
     *     target of a canonical reference. It SHALL remain the same when the test script is stored
     *     on different servers.
     */
    public TestScript_Setup_Action_OperationBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /** @param _type */
    public TestScript_Setup_Action_OperationBuilder.Impl withType(@NonNull Coding _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public TestScript_Setup_Action_OperationBuilder.Impl withType(@NonNull CodingBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param label */
    public TestScript_Setup_Action_OperationBuilder.Impl withLabel(@NonNull String label) {
      this.label = Optional.of(label);
      return this;
    }
    /** @param accept */
    public TestScript_Setup_Action_OperationBuilder.Impl withAccept(@NonNull String accept) {
      this.accept = Optional.of(accept);
      return this;
    }
    /** @param method */
    public TestScript_Setup_Action_OperationBuilder.Impl withMethod(
        @NonNull HTTP_OPERATIONS method) {
      this.method = Optional.of(method);
      return this;
    }
    /**
     * @param origin - An abstract server used in operations within this test script in the origin
     *     element.
     */
    public TestScript_Setup_Action_OperationBuilder.Impl withOrigin(@NonNull Integer origin) {
      this.origin = Optional.of(origin);
      return this;
    }
    /** @param params */
    public TestScript_Setup_Action_OperationBuilder.Impl withParams(@NonNull String params) {
      this.params = Optional.of(params);
      return this;
    }
    /** @param resource */
    public TestScript_Setup_Action_OperationBuilder.Impl withResource(
        @NonNull DEFINED_TYPES resource) {
      this.resource = Optional.of(resource);
      return this;
    }
    /** @param sourceId */
    public TestScript_Setup_Action_OperationBuilder.Impl withSourceId(@NonNull String sourceId) {
      this.sourceId = Optional.of(sourceId);
      return this;
    }
    /** @param targetId */
    public TestScript_Setup_Action_OperationBuilder.Impl withTargetId(@NonNull String targetId) {
      this.targetId = Optional.of(targetId);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public TestScript_Setup_Action_OperationBuilder.Impl withExtension(
        @NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public TestScript_Setup_Action_OperationBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public TestScript_Setup_Action_OperationBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param requestId */
    public TestScript_Setup_Action_OperationBuilder.Impl withRequestId(@NonNull String requestId) {
      this.requestId = Optional.of(requestId);
      return this;
    }
    /** @param responseId */
    public TestScript_Setup_Action_OperationBuilder.Impl withResponseId(
        @NonNull String responseId) {
      this.responseId = Optional.of(responseId);
      return this;
    }
    /**
     * @param description - A free text natural language description of the test script from a
     *     consumer's perspective.
     */
    public TestScript_Setup_Action_OperationBuilder.Impl withDescription(
        @NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param contentType */
    public TestScript_Setup_Action_OperationBuilder.Impl withContentType(
        @NonNull String contentType) {
      this.contentType = Optional.of(contentType);
      return this;
    }
    /**
     * @param destination - An abstract server used in operations within this test script in the
     *     destination element.
     */
    public TestScript_Setup_Action_OperationBuilder.Impl withDestination(
        @NonNull Integer destination) {
      this.destination = Optional.of(destination);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public TestScript_Setup_Action_OperationBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public TestScript_Setup_Action_OperationBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public TestScript_Setup_Action_OperationBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param requestHeader */
    public TestScript_Setup_Action_OperationBuilder.Impl withRequestHeader(
        @NonNull TestScript$Setup$Action$Operation$RequestHeader... requestHeader) {
      this.requestHeader = Arrays.asList(requestHeader);
      return this;
    }
    /** @param requestHeader */
    public TestScript_Setup_Action_OperationBuilder.Impl withRequestHeader(
        @NonNull Collection<TestScript$Setup$Action$Operation$RequestHeader> requestHeader) {
      this.requestHeader = Collections.unmodifiableCollection(requestHeader);
      return this;
    }

    public TestScript_Setup_Action_OperationBuilder.Impl withRequestHeader(
        @NonNull TestScript_Setup_Action_Operation_RequestHeaderBuilder... requestHeader) {
      this.requestHeader = Arrays.stream(requestHeader).map(e -> e.build()).collect(toList());
      return this;
    }

    public TestScript$Setup$Action$Operation build() {
      return new TestScript$Setup$Action$Operation(
          OptionConverters.toScala(id),
          OptionConverters.toScala(url),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(label),
          OptionConverters.toScala(accept),
          OptionConverters.toScala(method),
          OptionConverters.toScala(origin.map(x -> (Object) x)),
          OptionConverters.toScala(params),
          OptionConverters.toScala(resource),
          OptionConverters.toScala(sourceId),
          OptionConverters.toScala(targetId),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(requestId),
          OptionConverters.toScala(responseId),
          OptionConverters.toScala(description),
          OptionConverters.toScala(contentType),
          OptionConverters.toScala(destination.map(x -> (Object) x)),
          encodeRequestUrl,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          requestHeader.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
