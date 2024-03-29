package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.ASSERT_DIRECTION_CODES;
import com.babylonhealth.lit.hl7.ASSERT_OPERATOR_CODES;
import com.babylonhealth.lit.hl7.ASSERT_RESPONSE_CODE_TYPES;
import com.babylonhealth.lit.hl7.DEFINED_TYPES;
import com.babylonhealth.lit.hl7.HTTP_OPERATIONS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface TestScript_Setup_Action_AssertBuilder {
  public TestScript$Setup$Action$Assert build();

  public static Impl init(Boolean warningOnly) {
    return new Impl(warningOnly);
  }

  public static Impl builder(Boolean warningOnly) {
    return new Impl(warningOnly);
  }

  public class Impl implements TestScript_Setup_Action_AssertBuilder {
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
    public Impl(Boolean warningOnly) {
      this.warningOnly = warningOnly;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public TestScript_Setup_Action_AssertBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param path */
    public TestScript_Setup_Action_AssertBuilder.Impl withPath(@NonNull String path) {
      this.path = Optional.of(path);
      return this;
    }
    /** @param label */
    public TestScript_Setup_Action_AssertBuilder.Impl withLabel(@NonNull String label) {
      this.label = Optional.of(label);
      return this;
    }
    /** @param value */
    public TestScript_Setup_Action_AssertBuilder.Impl withValue(@NonNull String value) {
      this.value = Optional.of(value);
      return this;
    }
    /** @param operator */
    public TestScript_Setup_Action_AssertBuilder.Impl withOperator(
        @NonNull ASSERT_OPERATOR_CODES operator) {
      this.operator = Optional.of(operator);
      return this;
    }
    /** @param resource */
    public TestScript_Setup_Action_AssertBuilder.Impl withResource(
        @NonNull DEFINED_TYPES resource) {
      this.resource = Optional.of(resource);
      return this;
    }
    /** @param response */
    public TestScript_Setup_Action_AssertBuilder.Impl withResponse(
        @NonNull ASSERT_RESPONSE_CODE_TYPES response) {
      this.response = Optional.of(response);
      return this;
    }
    /** @param sourceId */
    public TestScript_Setup_Action_AssertBuilder.Impl withSourceId(@NonNull String sourceId) {
      this.sourceId = Optional.of(sourceId);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public TestScript_Setup_Action_AssertBuilder.Impl withExtension(
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
    public TestScript_Setup_Action_AssertBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public TestScript_Setup_Action_AssertBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param direction */
    public TestScript_Setup_Action_AssertBuilder.Impl withDirection(
        @NonNull ASSERT_DIRECTION_CODES direction) {
      this.direction = Optional.of(direction);
      return this;
    }
    /** @param minimumId */
    public TestScript_Setup_Action_AssertBuilder.Impl withMinimumId(@NonNull String minimumId) {
      this.minimumId = Optional.of(minimumId);
      return this;
    }
    /** @param expression */
    public TestScript_Setup_Action_AssertBuilder.Impl withExpression(@NonNull String expression) {
      this.expression = Optional.of(expression);
      return this;
    }
    /** @param requestURL */
    public TestScript_Setup_Action_AssertBuilder.Impl withRequestURL(@NonNull String requestURL) {
      this.requestURL = Optional.of(requestURL);
      return this;
    }
    /**
     * @param description - A free text natural language description of the test script from a
     *     consumer's perspective.
     */
    public TestScript_Setup_Action_AssertBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param contentType */
    public TestScript_Setup_Action_AssertBuilder.Impl withContentType(@NonNull String contentType) {
      this.contentType = Optional.of(contentType);
      return this;
    }
    /** @param headerField */
    public TestScript_Setup_Action_AssertBuilder.Impl withHeaderField(@NonNull String headerField) {
      this.headerField = Optional.of(headerField);
      return this;
    }
    /** @param responseCode */
    public TestScript_Setup_Action_AssertBuilder.Impl withResponseCode(
        @NonNull String responseCode) {
      this.responseCode = Optional.of(responseCode);
      return this;
    }
    /** @param requestMethod */
    public TestScript_Setup_Action_AssertBuilder.Impl withRequestMethod(
        @NonNull HTTP_OPERATIONS requestMethod) {
      this.requestMethod = Optional.of(requestMethod);
      return this;
    }
    /** @param navigationLinks */
    public TestScript_Setup_Action_AssertBuilder.Impl withNavigationLinks(
        @NonNull Boolean navigationLinks) {
      this.navigationLinks = Optional.of(navigationLinks);
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
    public TestScript_Setup_Action_AssertBuilder.Impl withModifierExtension(
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
    public TestScript_Setup_Action_AssertBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public TestScript_Setup_Action_AssertBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param compareToSourceId */
    public TestScript_Setup_Action_AssertBuilder.Impl withCompareToSourceId(
        @NonNull String compareToSourceId) {
      this.compareToSourceId = Optional.of(compareToSourceId);
      return this;
    }
    /** @param validateProfileId */
    public TestScript_Setup_Action_AssertBuilder.Impl withValidateProfileId(
        @NonNull String validateProfileId) {
      this.validateProfileId = Optional.of(validateProfileId);
      return this;
    }
    /** @param compareToSourcePath */
    public TestScript_Setup_Action_AssertBuilder.Impl withCompareToSourcePath(
        @NonNull String compareToSourcePath) {
      this.compareToSourcePath = Optional.of(compareToSourcePath);
      return this;
    }
    /** @param compareToSourceExpression */
    public TestScript_Setup_Action_AssertBuilder.Impl withCompareToSourceExpression(
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
}
