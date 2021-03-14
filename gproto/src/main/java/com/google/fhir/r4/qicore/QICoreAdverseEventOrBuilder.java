// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/qicore/qicore.proto

package com.google.fhir.r4.qicore;

public interface QICoreAdverseEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.qicore.QICoreAdverseEvent)
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
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
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
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
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
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
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
   * Business identifier for the event
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier identifier = 10;</code>
   *
   * @return Whether the identifier field is set.
   */
  boolean hasIdentifier();
  /**
   *
   *
   * <pre>
   * Business identifier for the event
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier identifier = 10;</code>
   *
   * @return The identifier.
   */
  com.google.fhir.r4.core.Identifier getIdentifier();
  /**
   *
   *
   * <pre>
   * Business identifier for the event
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder();

  /**
   * <code>
   * .google.fhir.r4.qicore.QICoreAdverseEvent.ActualityCode actuality = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the actuality field is set.
   */
  boolean hasActuality();
  /**
   * <code>
   * .google.fhir.r4.qicore.QICoreAdverseEvent.ActualityCode actuality = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The actuality.
   */
  com.google.fhir.r4.qicore.QICoreAdverseEvent.ActualityCode getActuality();
  /**
   * <code>
   * .google.fhir.r4.qicore.QICoreAdverseEvent.ActualityCode actuality = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.qicore.QICoreAdverseEvent.ActualityCodeOrBuilder getActualityOrBuilder();

  /**
   *
   *
   * <pre>
   * product-problem | product-quality | product-use-error | wrong-dose |
   * incorrect-prescribing-information | wrong-technique |
   * wrong-route-of-administration | wrong-rate | wrong-duration | wrong-time |
   * expired-drug | medical-device-use-error | problem-different-manufacturer |
   * unsafe-physical-environment
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 12;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getCategoryList();
  /**
   *
   *
   * <pre>
   * product-problem | product-quality | product-use-error | wrong-dose |
   * incorrect-prescribing-information | wrong-technique |
   * wrong-route-of-administration | wrong-rate | wrong-duration | wrong-time |
   * expired-drug | medical-device-use-error | problem-different-manufacturer |
   * unsafe-physical-environment
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getCategory(int index);
  /**
   *
   *
   * <pre>
   * product-problem | product-quality | product-use-error | wrong-dose |
   * incorrect-prescribing-information | wrong-technique |
   * wrong-route-of-administration | wrong-rate | wrong-duration | wrong-time |
   * expired-drug | medical-device-use-error | problem-different-manufacturer |
   * unsafe-physical-environment
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 12;</code>
   */
  int getCategoryCount();
  /**
   *
   *
   * <pre>
   * product-problem | product-quality | product-use-error | wrong-dose |
   * incorrect-prescribing-information | wrong-technique |
   * wrong-route-of-administration | wrong-rate | wrong-duration | wrong-time |
   * expired-drug | medical-device-use-error | problem-different-manufacturer |
   * unsafe-physical-environment
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 12;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getCategoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * product-problem | product-quality | product-use-error | wrong-dose |
   * incorrect-prescribing-information | wrong-technique |
   * wrong-route-of-administration | wrong-rate | wrong-duration | wrong-time |
   * expired-drug | medical-device-use-error | problem-different-manufacturer |
   * unsafe-physical-environment
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCategoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Type of the event itself in relation to the subject
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.CodeableConcept event = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   *
   *
   * <pre>
   * Type of the event itself in relation to the subject
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.CodeableConcept event = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The event.
   */
  com.google.fhir.r4.core.CodeableConcept getEvent();
  /**
   *
   *
   * <pre>
   * Type of the event itself in relation to the subject
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.CodeableConcept event = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getEventOrBuilder();

  /**
   *
   *
   * <pre>
   * Subject impacted by event
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   *
   *
   * <pre>
   * Subject impacted by event
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.r4.core.Reference getSubject();
  /**
   *
   *
   * <pre>
   * Subject impacted by event
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
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
   * .google.fhir.r4.core.Reference encounter = 15 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
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
   * .google.fhir.r4.core.Reference encounter = 15 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
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
   * .google.fhir.r4.core.Reference encounter = 15 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getEncounterOrBuilder();

  /**
   *
   *
   * <pre>
   * When the event occurred
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime date = 16;</code>
   *
   * @return Whether the date field is set.
   */
  boolean hasDate();
  /**
   *
   *
   * <pre>
   * When the event occurred
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime date = 16;</code>
   *
   * @return The date.
   */
  com.google.fhir.r4.core.DateTime getDate();
  /**
   *
   *
   * <pre>
   * When the event occurred
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime date = 16;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getDateOrBuilder();

  /**
   *
   *
   * <pre>
   * When the event was detected
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime detected = 17;</code>
   *
   * @return Whether the detected field is set.
   */
  boolean hasDetected();
  /**
   *
   *
   * <pre>
   * When the event was detected
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime detected = 17;</code>
   *
   * @return The detected.
   */
  com.google.fhir.r4.core.DateTime getDetected();
  /**
   *
   *
   * <pre>
   * When the event was detected
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime detected = 17;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getDetectedOrBuilder();

  /**
   *
   *
   * <pre>
   * When the event was recorded
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime recorded_date = 18;</code>
   *
   * @return Whether the recordedDate field is set.
   */
  boolean hasRecordedDate();
  /**
   *
   *
   * <pre>
   * When the event was recorded
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime recorded_date = 18;</code>
   *
   * @return The recordedDate.
   */
  com.google.fhir.r4.core.DateTime getRecordedDate();
  /**
   *
   *
   * <pre>
   * When the event was recorded
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime recorded_date = 18;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getRecordedDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Effect on the subject due to this event
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference resulting_condition = 19 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getResultingConditionList();
  /**
   *
   *
   * <pre>
   * Effect on the subject due to this event
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference resulting_condition = 19 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getResultingCondition(int index);
  /**
   *
   *
   * <pre>
   * Effect on the subject due to this event
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference resulting_condition = 19 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  int getResultingConditionCount();
  /**
   *
   *
   * <pre>
   * Effect on the subject due to this event
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference resulting_condition = 19 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getResultingConditionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Effect on the subject due to this event
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference resulting_condition = 19 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getResultingConditionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Location where adverse event occurred
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference location = 20 [(.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   *
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   *
   *
   * <pre>
   * Location where adverse event occurred
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference location = 20 [(.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   *
   * @return The location.
   */
  com.google.fhir.r4.core.Reference getLocation();
  /**
   *
   *
   * <pre>
   * Location where adverse event occurred
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference location = 20 [(.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Seriousness of the event
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept seriousness = 21;</code>
   *
   * @return Whether the seriousness field is set.
   */
  boolean hasSeriousness();
  /**
   *
   *
   * <pre>
   * Seriousness of the event
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept seriousness = 21;</code>
   *
   * @return The seriousness.
   */
  com.google.fhir.r4.core.CodeableConcept getSeriousness();
  /**
   *
   *
   * <pre>
   * Seriousness of the event
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept seriousness = 21;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getSeriousnessOrBuilder();

  /**
   *
   *
   * <pre>
   * mild | moderate | severe
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept severity = 22;</code>
   *
   * @return Whether the severity field is set.
   */
  boolean hasSeverity();
  /**
   *
   *
   * <pre>
   * mild | moderate | severe
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept severity = 22;</code>
   *
   * @return The severity.
   */
  com.google.fhir.r4.core.CodeableConcept getSeverity();
  /**
   *
   *
   * <pre>
   * mild | moderate | severe
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept severity = 22;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getSeverityOrBuilder();

  /**
   *
   *
   * <pre>
   * resolved | recovering | ongoing | resolvedWithSequelae | fatal | unknown
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept outcome = 23;</code>
   *
   * @return Whether the outcome field is set.
   */
  boolean hasOutcome();
  /**
   *
   *
   * <pre>
   * resolved | recovering | ongoing | resolvedWithSequelae | fatal | unknown
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept outcome = 23;</code>
   *
   * @return The outcome.
   */
  com.google.fhir.r4.core.CodeableConcept getOutcome();
  /**
   *
   *
   * <pre>
   * resolved | recovering | ongoing | resolvedWithSequelae | fatal | unknown
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept outcome = 23;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getOutcomeOrBuilder();

  /**
   *
   *
   * <pre>
   * Who recorded the adverse event
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference recorder = 24 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];
   * </code>
   *
   * @return Whether the recorder field is set.
   */
  boolean hasRecorder();
  /**
   *
   *
   * <pre>
   * Who recorded the adverse event
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference recorder = 24 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];
   * </code>
   *
   * @return The recorder.
   */
  com.google.fhir.r4.core.Reference getRecorder();
  /**
   *
   *
   * <pre>
   * Who recorded the adverse event
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference recorder = 24 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getRecorderOrBuilder();

  /**
   *
   *
   * <pre>
   * Who  was involved in the adverse event or the potential adverse event
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference contributor = 25 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Device"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getContributorList();
  /**
   *
   *
   * <pre>
   * Who  was involved in the adverse event or the potential adverse event
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference contributor = 25 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Device"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getContributor(int index);
  /**
   *
   *
   * <pre>
   * Who  was involved in the adverse event or the potential adverse event
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference contributor = 25 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Device"];
   * </code>
   */
  int getContributorCount();
  /**
   *
   *
   * <pre>
   * Who  was involved in the adverse event or the potential adverse event
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference contributor = 25 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Device"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getContributorOrBuilderList();
  /**
   *
   *
   * <pre>
   * Who  was involved in the adverse event or the potential adverse event
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference contributor = 25 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Device"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getContributorOrBuilder(int index);

  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreAdverseEvent.SuspectEntity suspect_entity = 26 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.qicore.QICoreAdverseEvent.SuspectEntity> getSuspectEntityList();
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreAdverseEvent.SuspectEntity suspect_entity = 26 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  com.google.fhir.r4.qicore.QICoreAdverseEvent.SuspectEntity getSuspectEntity(int index);
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreAdverseEvent.SuspectEntity suspect_entity = 26 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  int getSuspectEntityCount();
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreAdverseEvent.SuspectEntity suspect_entity = 26 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.qicore.QICoreAdverseEvent.SuspectEntityOrBuilder>
      getSuspectEntityOrBuilderList();
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreAdverseEvent.SuspectEntity suspect_entity = 26 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  com.google.fhir.r4.qicore.QICoreAdverseEvent.SuspectEntityOrBuilder getSuspectEntityOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * AdverseEvent.subjectMedicalHistory
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference subject_medical_history = 27 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "AllergyIntolerance", (.google.fhir.proto.valid_reference_type) = "FamilyMemberHistory", (.google.fhir.proto.valid_reference_type) = "Immunization", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "Media", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getSubjectMedicalHistoryList();
  /**
   *
   *
   * <pre>
   * AdverseEvent.subjectMedicalHistory
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference subject_medical_history = 27 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "AllergyIntolerance", (.google.fhir.proto.valid_reference_type) = "FamilyMemberHistory", (.google.fhir.proto.valid_reference_type) = "Immunization", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "Media", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getSubjectMedicalHistory(int index);
  /**
   *
   *
   * <pre>
   * AdverseEvent.subjectMedicalHistory
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference subject_medical_history = 27 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "AllergyIntolerance", (.google.fhir.proto.valid_reference_type) = "FamilyMemberHistory", (.google.fhir.proto.valid_reference_type) = "Immunization", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "Media", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  int getSubjectMedicalHistoryCount();
  /**
   *
   *
   * <pre>
   * AdverseEvent.subjectMedicalHistory
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference subject_medical_history = 27 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "AllergyIntolerance", (.google.fhir.proto.valid_reference_type) = "FamilyMemberHistory", (.google.fhir.proto.valid_reference_type) = "Immunization", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "Media", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getSubjectMedicalHistoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * AdverseEvent.subjectMedicalHistory
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference subject_medical_history = 27 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "AllergyIntolerance", (.google.fhir.proto.valid_reference_type) = "FamilyMemberHistory", (.google.fhir.proto.valid_reference_type) = "Immunization", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "Media", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSubjectMedicalHistoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * AdverseEvent.referenceDocument
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reference_document = 28 [(.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getReferenceDocumentList();
  /**
   *
   *
   * <pre>
   * AdverseEvent.referenceDocument
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reference_document = 28 [(.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getReferenceDocument(int index);
  /**
   *
   *
   * <pre>
   * AdverseEvent.referenceDocument
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reference_document = 28 [(.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  int getReferenceDocumentCount();
  /**
   *
   *
   * <pre>
   * AdverseEvent.referenceDocument
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reference_document = 28 [(.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getReferenceDocumentOrBuilderList();
  /**
   *
   *
   * <pre>
   * AdverseEvent.referenceDocument
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reference_document = 28 [(.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getReferenceDocumentOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * AdverseEvent.study
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference study = 29 [(.google.fhir.proto.valid_reference_type) = "ResearchStudy"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getStudyList();
  /**
   *
   *
   * <pre>
   * AdverseEvent.study
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference study = 29 [(.google.fhir.proto.valid_reference_type) = "ResearchStudy"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getStudy(int index);
  /**
   *
   *
   * <pre>
   * AdverseEvent.study
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference study = 29 [(.google.fhir.proto.valid_reference_type) = "ResearchStudy"];
   * </code>
   */
  int getStudyCount();
  /**
   *
   *
   * <pre>
   * AdverseEvent.study
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference study = 29 [(.google.fhir.proto.valid_reference_type) = "ResearchStudy"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getStudyOrBuilderList();
  /**
   *
   *
   * <pre>
   * AdverseEvent.study
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference study = 29 [(.google.fhir.proto.valid_reference_type) = "ResearchStudy"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getStudyOrBuilder(int index);
}
