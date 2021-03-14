// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/qicore/qicore.proto

package com.google.fhir.r4.qicore;

public interface QICoreCarePlanOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.qicore.QICoreCarePlan)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   *
   * @return The id.
   */
  com.google.fhir.r4.core.Id getId();
  /**
   *
   *
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   */
  com.google.fhir.r4.core.IdOrBuilder getIdOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   *
   * @return Whether the meta field is set.
   */
  boolean hasMeta();
  /**
   *
   *
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   *
   * @return The meta.
   */
  com.google.fhir.r4.core.Meta getMeta();
  /**
   *
   *
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   */
  com.google.fhir.r4.core.MetaOrBuilder getMetaOrBuilder();

  /**
   *
   *
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   *
   * @return Whether the implicitRules field is set.
   */
  boolean hasImplicitRules();
  /**
   *
   *
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   *
   * @return The implicitRules.
   */
  com.google.fhir.r4.core.Uri getImplicitRules();
  /**
   *
   *
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   */
  com.google.fhir.r4.core.UriOrBuilder getImplicitRulesOrBuilder();

  /**
   *
   *
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   *
   * @return Whether the language field is set.
   */
  boolean hasLanguage();
  /**
   *
   *
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   *
   * @return The language.
   */
  com.google.fhir.r4.core.Code getLanguage();
  /**
   *
   *
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   */
  com.google.fhir.r4.core.CodeOrBuilder getLanguageOrBuilder();

  /**
   *
   *
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Narrative text = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   *
   *
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Narrative text = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The text.
   */
  com.google.fhir.r4.core.Narrative getText();
  /**
   *
   *
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Narrative text = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.NarrativeOrBuilder getTextOrBuilder();

  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  java.util.List<com.google.protobuf.Any> getContainedList();
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  com.google.protobuf.Any getContained(int index);
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  int getContainedCount();
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> getContainedOrBuilderList();
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  com.google.protobuf.AnyOrBuilder getContainedOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> getExtensionList();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  com.google.fhir.r4.core.Extension getExtension(int index);
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  int getExtensionCount();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> getExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getExtensionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> getModifierExtensionList();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  com.google.fhir.r4.core.Extension getModifierExtension(int index);
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  int getModifierExtensionCount();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder>
      getModifierExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getModifierExtensionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * External Ids for this plan
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * External Ids for this plan
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * External Ids for this plan
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * External Ids for this plan
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdentifierOrBuilder>
      getIdentifierOrBuilderList();
  /**
   *
   *
   * <pre>
   * External Ids for this plan
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Instantiates FHIR protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates_canonical = 11;</code>
   */
  java.util.List<com.google.fhir.r4.core.Canonical> getInstantiatesCanonicalList();
  /**
   *
   *
   * <pre>
   * Instantiates FHIR protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates_canonical = 11;</code>
   */
  com.google.fhir.r4.core.Canonical getInstantiatesCanonical(int index);
  /**
   *
   *
   * <pre>
   * Instantiates FHIR protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates_canonical = 11;</code>
   */
  int getInstantiatesCanonicalCount();
  /**
   *
   *
   * <pre>
   * Instantiates FHIR protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates_canonical = 11;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CanonicalOrBuilder>
      getInstantiatesCanonicalOrBuilderList();
  /**
   *
   *
   * <pre>
   * Instantiates FHIR protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates_canonical = 11;</code>
   */
  com.google.fhir.r4.core.CanonicalOrBuilder getInstantiatesCanonicalOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Instantiates external protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Uri instantiates_uri = 12;</code>
   */
  java.util.List<com.google.fhir.r4.core.Uri> getInstantiatesUriList();
  /**
   *
   *
   * <pre>
   * Instantiates external protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Uri instantiates_uri = 12;</code>
   */
  com.google.fhir.r4.core.Uri getInstantiatesUri(int index);
  /**
   *
   *
   * <pre>
   * Instantiates external protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Uri instantiates_uri = 12;</code>
   */
  int getInstantiatesUriCount();
  /**
   *
   *
   * <pre>
   * Instantiates external protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Uri instantiates_uri = 12;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.UriOrBuilder> getInstantiatesUriOrBuilderList();
  /**
   *
   *
   * <pre>
   * Instantiates external protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Uri instantiates_uri = 12;</code>
   */
  com.google.fhir.r4.core.UriOrBuilder getInstantiatesUriOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Fulfills CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 13 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getBasedOnList();
  /**
   *
   *
   * <pre>
   * Fulfills CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 13 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getBasedOn(int index);
  /**
   *
   *
   * <pre>
   * Fulfills CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 13 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  int getBasedOnCount();
  /**
   *
   *
   * <pre>
   * Fulfills CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 13 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getBasedOnOrBuilderList();
  /**
   *
   *
   * <pre>
   * Fulfills CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 13 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getBasedOnOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * CarePlan replaced by this CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference replaces = 14 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getReplacesList();
  /**
   *
   *
   * <pre>
   * CarePlan replaced by this CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference replaces = 14 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getReplaces(int index);
  /**
   *
   *
   * <pre>
   * CarePlan replaced by this CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference replaces = 14 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  int getReplacesCount();
  /**
   *
   *
   * <pre>
   * CarePlan replaced by this CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference replaces = 14 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getReplacesOrBuilderList();
  /**
   *
   *
   * <pre>
   * CarePlan replaced by this CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference replaces = 14 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getReplacesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Part of referenced CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference part_of = 15 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getPartOfList();
  /**
   *
   *
   * <pre>
   * Part of referenced CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference part_of = 15 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getPartOf(int index);
  /**
   *
   *
   * <pre>
   * Part of referenced CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference part_of = 15 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  int getPartOfCount();
  /**
   *
   *
   * <pre>
   * Part of referenced CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference part_of = 15 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getPartOfOrBuilderList();
  /**
   *
   *
   * <pre>
   * Part of referenced CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference part_of = 15 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPartOfOrBuilder(int index);

  /**
   * <code>
   * .google.fhir.r4.qicore.QICoreCarePlan.StatusCode status = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>
   * .google.fhir.r4.qicore.QICoreCarePlan.StatusCode status = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.r4.qicore.QICoreCarePlan.StatusCode getStatus();
  /**
   * <code>
   * .google.fhir.r4.qicore.QICoreCarePlan.StatusCode status = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.qicore.QICoreCarePlan.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <code>
   * .google.fhir.r4.qicore.QICoreCarePlan.IntentCode intent = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the intent field is set.
   */
  boolean hasIntent();
  /**
   * <code>
   * .google.fhir.r4.qicore.QICoreCarePlan.IntentCode intent = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The intent.
   */
  com.google.fhir.r4.qicore.QICoreCarePlan.IntentCode getIntent();
  /**
   * <code>
   * .google.fhir.r4.qicore.QICoreCarePlan.IntentCode intent = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.qicore.QICoreCarePlan.IntentCodeOrBuilder getIntentOrBuilder();

  /**
   *
   *
   * <pre>
   * Type of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.CodeableConcept category = 18 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getCategoryList();
  /**
   *
   *
   * <pre>
   * Type of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.CodeableConcept category = 18 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.CodeableConcept getCategory(int index);
  /**
   *
   *
   * <pre>
   * Type of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.CodeableConcept category = 18 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  int getCategoryCount();
  /**
   *
   *
   * <pre>
   * Type of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.CodeableConcept category = 18 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getCategoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Type of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.CodeableConcept category = 18 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCategoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Human-friendly name for the care plan
   * </pre>
   *
   * <code>.google.fhir.r4.core.String title = 19;</code>
   *
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   *
   *
   * <pre>
   * Human-friendly name for the care plan
   * </pre>
   *
   * <code>.google.fhir.r4.core.String title = 19;</code>
   *
   * @return The title.
   */
  com.google.fhir.r4.core.String getTitle();
  /**
   *
   *
   * <pre>
   * Human-friendly name for the care plan
   * </pre>
   *
   * <code>.google.fhir.r4.core.String title = 19;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getTitleOrBuilder();

  /**
   *
   *
   * <pre>
   * Summary of nature of plan
   * </pre>
   *
   * <code>.google.fhir.r4.core.String description = 20;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * Summary of nature of plan
   * </pre>
   *
   * <code>.google.fhir.r4.core.String description = 20;</code>
   *
   * @return The description.
   */
  com.google.fhir.r4.core.String getDescription();
  /**
   *
   *
   * <pre>
   * Summary of nature of plan
   * </pre>
   *
   * <code>.google.fhir.r4.core.String description = 20;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getDescriptionOrBuilder();

  /**
   *
   *
   * <pre>
   * Who the care plan is for
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 21 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   *
   *
   * <pre>
   * Who the care plan is for
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 21 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.r4.core.Reference getSubject();
  /**
   *
   *
   * <pre>
   * Who the care plan is for
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 21 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * Encounter created as part of
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 22 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   *
   * @return Whether the encounter field is set.
   */
  boolean hasEncounter();
  /**
   *
   *
   * <pre>
   * Encounter created as part of
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 22 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   *
   * @return The encounter.
   */
  com.google.fhir.r4.core.Reference getEncounter();
  /**
   *
   *
   * <pre>
   * Encounter created as part of
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 22 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getEncounterOrBuilder();

  /**
   *
   *
   * <pre>
   * Time period plan covers
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 23;</code>
   *
   * @return Whether the period field is set.
   */
  boolean hasPeriod();
  /**
   *
   *
   * <pre>
   * Time period plan covers
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 23;</code>
   *
   * @return The period.
   */
  com.google.fhir.r4.core.Period getPeriod();
  /**
   *
   *
   * <pre>
   * Time period plan covers
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 23;</code>
   */
  com.google.fhir.r4.core.PeriodOrBuilder getPeriodOrBuilder();

  /**
   *
   *
   * <pre>
   * Date record was first recorded
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime created = 24;</code>
   *
   * @return Whether the created field is set.
   */
  boolean hasCreated();
  /**
   *
   *
   * <pre>
   * Date record was first recorded
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime created = 24;</code>
   *
   * @return The created.
   */
  com.google.fhir.r4.core.DateTime getCreated();
  /**
   *
   *
   * <pre>
   * Date record was first recorded
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime created = 24;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getCreatedOrBuilder();

  /**
   *
   *
   * <pre>
   * Who is the designated responsible party
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference author = 25 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   *
   * @return Whether the author field is set.
   */
  boolean hasAuthor();
  /**
   *
   *
   * <pre>
   * Who is the designated responsible party
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference author = 25 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   *
   * @return The author.
   */
  com.google.fhir.r4.core.Reference getAuthor();
  /**
   *
   *
   * <pre>
   * Who is the designated responsible party
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference author = 25 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getAuthorOrBuilder();

  /**
   *
   *
   * <pre>
   * Who provided the content of the care plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference contributor = 26 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getContributorList();
  /**
   *
   *
   * <pre>
   * Who provided the content of the care plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference contributor = 26 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getContributor(int index);
  /**
   *
   *
   * <pre>
   * Who provided the content of the care plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference contributor = 26 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  int getContributorCount();
  /**
   *
   *
   * <pre>
   * Who provided the content of the care plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference contributor = 26 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getContributorOrBuilderList();
  /**
   *
   *
   * <pre>
   * Who provided the content of the care plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference contributor = 26 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getContributorOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Who's involved in plan?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference care_team = 27 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getCareTeamList();
  /**
   *
   *
   * <pre>
   * Who's involved in plan?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference care_team = 27 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getCareTeam(int index);
  /**
   *
   *
   * <pre>
   * Who's involved in plan?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference care_team = 27 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  int getCareTeamCount();
  /**
   *
   *
   * <pre>
   * Who's involved in plan?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference care_team = 27 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getCareTeamOrBuilderList();
  /**
   *
   *
   * <pre>
   * Who's involved in plan?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference care_team = 27 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getCareTeamOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Health issues this plan addresses
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference addresses = 28 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getAddressesList();
  /**
   *
   *
   * <pre>
   * Health issues this plan addresses
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference addresses = 28 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getAddresses(int index);
  /**
   *
   *
   * <pre>
   * Health issues this plan addresses
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference addresses = 28 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  int getAddressesCount();
  /**
   *
   *
   * <pre>
   * Health issues this plan addresses
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference addresses = 28 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getAddressesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Health issues this plan addresses
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference addresses = 28 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getAddressesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Information considered as part of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference supporting_info = 29 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getSupportingInfoList();
  /**
   *
   *
   * <pre>
   * Information considered as part of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference supporting_info = 29 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getSupportingInfo(int index);
  /**
   *
   *
   * <pre>
   * Information considered as part of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference supporting_info = 29 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  int getSupportingInfoCount();
  /**
   *
   *
   * <pre>
   * Information considered as part of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference supporting_info = 29 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getSupportingInfoOrBuilderList();
  /**
   *
   *
   * <pre>
   * Information considered as part of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference supporting_info = 29 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSupportingInfoOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Desired outcome of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference goal = 30 [(.google.fhir.proto.valid_reference_type) = "Goal"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getGoalList();
  /**
   *
   *
   * <pre>
   * Desired outcome of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference goal = 30 [(.google.fhir.proto.valid_reference_type) = "Goal"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getGoal(int index);
  /**
   *
   *
   * <pre>
   * Desired outcome of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference goal = 30 [(.google.fhir.proto.valid_reference_type) = "Goal"];
   * </code>
   */
  int getGoalCount();
  /**
   *
   *
   * <pre>
   * Desired outcome of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference goal = 30 [(.google.fhir.proto.valid_reference_type) = "Goal"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getGoalOrBuilderList();
  /**
   *
   *
   * <pre>
   * Desired outcome of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference goal = 30 [(.google.fhir.proto.valid_reference_type) = "Goal"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getGoalOrBuilder(int index);

  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreCarePlan.Activity activity = 31 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())", (.google.fhir.proto.fhir_path_constraint) = "detail.empty() or reference.empty()"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.qicore.QICoreCarePlan.Activity> getActivityList();
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreCarePlan.Activity activity = 31 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())", (.google.fhir.proto.fhir_path_constraint) = "detail.empty() or reference.empty()"];
   * </code>
   */
  com.google.fhir.r4.qicore.QICoreCarePlan.Activity getActivity(int index);
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreCarePlan.Activity activity = 31 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())", (.google.fhir.proto.fhir_path_constraint) = "detail.empty() or reference.empty()"];
   * </code>
   */
  int getActivityCount();
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreCarePlan.Activity activity = 31 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())", (.google.fhir.proto.fhir_path_constraint) = "detail.empty() or reference.empty()"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.qicore.QICoreCarePlan.ActivityOrBuilder>
      getActivityOrBuilderList();
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreCarePlan.Activity activity = 31 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())", (.google.fhir.proto.fhir_path_constraint) = "detail.empty() or reference.empty()"];
   * </code>
   */
  com.google.fhir.r4.qicore.QICoreCarePlan.ActivityOrBuilder getActivityOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Comments about the plan
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 32;</code>
   */
  java.util.List<com.google.fhir.r4.core.Annotation> getNoteList();
  /**
   *
   *
   * <pre>
   * Comments about the plan
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 32;</code>
   */
  com.google.fhir.r4.core.Annotation getNote(int index);
  /**
   *
   *
   * <pre>
   * Comments about the plan
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 32;</code>
   */
  int getNoteCount();
  /**
   *
   *
   * <pre>
   * Comments about the plan
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 32;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.AnnotationOrBuilder> getNoteOrBuilderList();
  /**
   *
   *
   * <pre>
   * Comments about the plan
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 32;</code>
   */
  com.google.fhir.r4.core.AnnotationOrBuilder getNoteOrBuilder(int index);
}
