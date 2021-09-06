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
import com.babylonhealth.lit.hl7.ASSERT_OPERATOR_CODES;
import com.babylonhealth.lit.hl7.DEFINED_TYPES;
import com.babylonhealth.lit.hl7.ASSERT_RESPONSE_CODE_TYPES;
import com.babylonhealth.lit.hl7.ASSERT_DIRECTION_CODES;
import com.babylonhealth.lit.hl7.HTTP_OPERATIONS;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class TestScript_Setup_Action_AssertBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> path = Optional.empty();
  private Optional<String> label = Optional.empty();
  private Optional<String> value = Optional.empty();
  private Optional<ASSERT_OPERATOR_CODES> operator = Optional.empty();
  private Optional<DEFINED_TYPES> resource = Optional.empty();
  private Optional<ASSERT_RESPONSE_CODE_TYPES> response = Optional.empty();
  private Optional<String> sourceId = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<ASSERT_DIRECTION_CODES> direction = Optional.empty();
  private Optional<String> minimumId = Optional.empty();
  private Optional<String> expression = Optional.empty();
  private Optional<String> requestURL = Optional.empty();
  private Optional<String> description = Optional.empty();
  private Optional<String> contentType = Optional.empty();
  private Optional<String> headerField = Optional.empty();
  private Boolean warningOnly;
  private Optional<String> responseCode = Optional.empty();
  private Optional<HTTP_OPERATIONS> requestMethod = Optional.empty();
  private Optional<Boolean> navigationLinks = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<String> compareToSourceId = Optional.empty();
  private Optional<String> validateProfileId = Optional.empty();
  private Optional<String> compareToSourcePath = Optional.empty();
  private Optional<String> compareToSourceExpression = Optional.empty();

  /**
   * Required fields for {@link TestScript$Setup$Action$Assert}
   *
   * @param warningOnly
   */
  public TestScript_Setup_Action_AssertBuilder(Boolean warningOnly) {
    this.warningOnly = warningOnly;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public TestScript_Setup_Action_AssertBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param path */
  public TestScript_Setup_Action_AssertBuilder withPath(@NonNull String path) {
    this.path = Optional.of(path);
    return this;
  }
  /** @param label */
  public TestScript_Setup_Action_AssertBuilder withLabel(@NonNull String label) {
    this.label = Optional.of(label);
    return this;
  }
  /** @param value */
  public TestScript_Setup_Action_AssertBuilder withValue(@NonNull String value) {
    this.value = Optional.of(value);
    return this;
  }
  /** @param operator */
  public TestScript_Setup_Action_AssertBuilder withOperator(
      @NonNull ASSERT_OPERATOR_CODES operator) {
    this.operator = Optional.of(operator);
    return this;
  }
  /** @param resource */
  public TestScript_Setup_Action_AssertBuilder withResource(@NonNull DEFINED_TYPES resource) {
    this.resource = Optional.of(resource);
    return this;
  }
  /** @param response */
  public TestScript_Setup_Action_AssertBuilder withResponse(
      @NonNull ASSERT_RESPONSE_CODE_TYPES response) {
    this.response = Optional.of(response);
    return this;
  }
  /** @param sourceId */
  public TestScript_Setup_Action_AssertBuilder withSourceId(@NonNull String sourceId) {
    this.sourceId = Optional.of(sourceId);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public TestScript_Setup_Action_AssertBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public TestScript_Setup_Action_AssertBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param direction */
  public TestScript_Setup_Action_AssertBuilder withDirection(
      @NonNull ASSERT_DIRECTION_CODES direction) {
    this.direction = Optional.of(direction);
    return this;
  }
  /** @param minimumId */
  public TestScript_Setup_Action_AssertBuilder withMinimumId(@NonNull String minimumId) {
    this.minimumId = Optional.of(minimumId);
    return this;
  }
  /** @param expression */
  public TestScript_Setup_Action_AssertBuilder withExpression(@NonNull String expression) {
    this.expression = Optional.of(expression);
    return this;
  }
  /** @param requestURL */
  public TestScript_Setup_Action_AssertBuilder withRequestURL(@NonNull String requestURL) {
    this.requestURL = Optional.of(requestURL);
    return this;
  }
  /**
   * @param description - A free text natural language description of the test script from a
   *     consumer's perspective.
   */
  public TestScript_Setup_Action_AssertBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /** @param contentType */
  public TestScript_Setup_Action_AssertBuilder withContentType(@NonNull String contentType) {
    this.contentType = Optional.of(contentType);
    return this;
  }
  /** @param headerField */
  public TestScript_Setup_Action_AssertBuilder withHeaderField(@NonNull String headerField) {
    this.headerField = Optional.of(headerField);
    return this;
  }
  /** @param responseCode */
  public TestScript_Setup_Action_AssertBuilder withResponseCode(@NonNull String responseCode) {
    this.responseCode = Optional.of(responseCode);
    return this;
  }
  /** @param requestMethod */
  public TestScript_Setup_Action_AssertBuilder withRequestMethod(
      @NonNull HTTP_OPERATIONS requestMethod) {
    this.requestMethod = Optional.of(requestMethod);
    return this;
  }
  /** @param navigationLinks */
  public TestScript_Setup_Action_AssertBuilder withNavigationLinks(
      @NonNull Boolean navigationLinks) {
    this.navigationLinks = Optional.of(navigationLinks);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public TestScript_Setup_Action_AssertBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public TestScript_Setup_Action_AssertBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param compareToSourceId */
  public TestScript_Setup_Action_AssertBuilder withCompareToSourceId(
      @NonNull String compareToSourceId) {
    this.compareToSourceId = Optional.of(compareToSourceId);
    return this;
  }
  /** @param validateProfileId */
  public TestScript_Setup_Action_AssertBuilder withValidateProfileId(
      @NonNull String validateProfileId) {
    this.validateProfileId = Optional.of(validateProfileId);
    return this;
  }
  /** @param compareToSourcePath */
  public TestScript_Setup_Action_AssertBuilder withCompareToSourcePath(
      @NonNull String compareToSourcePath) {
    this.compareToSourcePath = Optional.of(compareToSourcePath);
    return this;
  }
  /** @param compareToSourceExpression */
  public TestScript_Setup_Action_AssertBuilder withCompareToSourceExpression(
      @NonNull String compareToSourceExpression) {
    this.compareToSourceExpression = Optional.of(compareToSourceExpression);
    return this;
  }

  public TestScript$Setup$Action$Assert build() {
    return new TestScript$Setup$Action$Assert(
        OptionConverters.toScala(id),
        OptionConverters.toScala(path),
        OptionConverters.toScala(label),
        OptionConverters.toScala(value),
        OptionConverters.toScala(operator),
        OptionConverters.toScala(resource),
        OptionConverters.toScala(response),
        OptionConverters.toScala(sourceId),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(direction),
        OptionConverters.toScala(minimumId),
        OptionConverters.toScala(expression),
        OptionConverters.toScala(requestURL),
        OptionConverters.toScala(description),
        OptionConverters.toScala(contentType),
        OptionConverters.toScala(headerField),
        warningOnly,
        OptionConverters.toScala(responseCode),
        OptionConverters.toScala(requestMethod),
        OptionConverters.toScala(navigationLinks.map(x -> (Object) x)),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(compareToSourceId),
        OptionConverters.toScala(validateProfileId),
        OptionConverters.toScala(compareToSourcePath),
        OptionConverters.toScala(compareToSourceExpression),
        LitUtils.emptyMetaElMap());
  }
}
