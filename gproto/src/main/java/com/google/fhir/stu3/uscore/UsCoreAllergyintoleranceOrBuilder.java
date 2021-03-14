// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/uscore.proto

package com.google.fhir.stu3.uscore;

public interface UsCoreAllergyintoleranceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.uscore.UsCoreAllergyintolerance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Id id = 1;</code>
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
   * <code>.google.fhir.stu3.proto.Id id = 1;</code>
   *
   * @return The id.
   */
  com.google.fhir.stu3.proto.Id getId();
  /**
   *
   *
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Id id = 1;</code>
   */
  com.google.fhir.stu3.proto.IdOrBuilder getIdOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Meta meta = 2;</code>
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
   * <code>.google.fhir.stu3.proto.Meta meta = 2;</code>
   *
   * @return The meta.
   */
  com.google.fhir.stu3.proto.Meta getMeta();
  /**
   *
   *
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Meta meta = 2;</code>
   */
  com.google.fhir.stu3.proto.MetaOrBuilder getMetaOrBuilder();

  /**
   *
   *
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri implicit_rules = 3;</code>
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
   * <code>.google.fhir.stu3.proto.Uri implicit_rules = 3;</code>
   *
   * @return The implicitRules.
   */
  com.google.fhir.stu3.proto.Uri getImplicitRules();
  /**
   *
   *
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri implicit_rules = 3;</code>
   */
  com.google.fhir.stu3.proto.UriOrBuilder getImplicitRulesOrBuilder();

  /**
   *
   *
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.LanguageCode language = 4;</code>
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
   * <code>.google.fhir.stu3.proto.LanguageCode language = 4;</code>
   *
   * @return The language.
   */
  com.google.fhir.stu3.proto.LanguageCode getLanguage();
  /**
   *
   *
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.LanguageCode language = 4;</code>
   */
  com.google.fhir.stu3.proto.LanguageCodeOrBuilder getLanguageOrBuilder();

  /**
   *
   *
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Narrative text = 5;</code>
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
   * <code>.google.fhir.stu3.proto.Narrative text = 5;</code>
   *
   * @return The text.
   */
  com.google.fhir.stu3.proto.Narrative getText();
  /**
   *
   *
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Narrative text = 5;</code>
   */
  com.google.fhir.stu3.proto.NarrativeOrBuilder getTextOrBuilder();

  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.ContainedResource> getContainedList();
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  com.google.fhir.stu3.proto.ContainedResource getContained(int index);
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  int getContainedCount();
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ContainedResourceOrBuilder>
      getContainedOrBuilderList();
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  com.google.fhir.stu3.proto.ContainedResourceOrBuilder getContainedOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> getExtensionList();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  com.google.fhir.stu3.proto.Extension getExtension(int index);
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  int getExtensionCount();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder>
      getExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> getModifierExtensionList();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  com.google.fhir.stu3.proto.Extension getModifierExtension(int index);
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  int getModifierExtensionCount();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder>
      getModifierExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getModifierExtensionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * External ids for this item
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * External ids for this item
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * External ids for this item
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * External ids for this item
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.IdentifierOrBuilder>
      getIdentifierOrBuilderList();
  /**
   *
   *
   * <pre>
   * External ids for this item
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * active | inactive | resolved
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.AllergyIntoleranceClinicalStatusCode clinical_status = 10;</code>
   *
   * @return Whether the clinicalStatus field is set.
   */
  boolean hasClinicalStatus();
  /**
   *
   *
   * <pre>
   * active | inactive | resolved
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.AllergyIntoleranceClinicalStatusCode clinical_status = 10;</code>
   *
   * @return The clinicalStatus.
   */
  com.google.fhir.stu3.proto.AllergyIntoleranceClinicalStatusCode getClinicalStatus();
  /**
   *
   *
   * <pre>
   * active | inactive | resolved
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.AllergyIntoleranceClinicalStatusCode clinical_status = 10;</code>
   */
  com.google.fhir.stu3.proto.AllergyIntoleranceClinicalStatusCodeOrBuilder
      getClinicalStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * unconfirmed | confirmed | refuted | entered-in-error
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.AllergyIntoleranceVerificationStatusCode verification_status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the verificationStatus field is set.
   */
  boolean hasVerificationStatus();
  /**
   *
   *
   * <pre>
   * unconfirmed | confirmed | refuted | entered-in-error
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.AllergyIntoleranceVerificationStatusCode verification_status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The verificationStatus.
   */
  com.google.fhir.stu3.proto.AllergyIntoleranceVerificationStatusCode getVerificationStatus();
  /**
   *
   *
   * <pre>
   * unconfirmed | confirmed | refuted | entered-in-error
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.AllergyIntoleranceVerificationStatusCode verification_status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.AllergyIntoleranceVerificationStatusCodeOrBuilder
      getVerificationStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * allergy | intolerance - Underlying mechanism (if known)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.AllergyIntoleranceTypeCode type = 12;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * allergy | intolerance - Underlying mechanism (if known)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.AllergyIntoleranceTypeCode type = 12;</code>
   *
   * @return The type.
   */
  com.google.fhir.stu3.proto.AllergyIntoleranceTypeCode getType();
  /**
   *
   *
   * <pre>
   * allergy | intolerance - Underlying mechanism (if known)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.AllergyIntoleranceTypeCode type = 12;</code>
   */
  com.google.fhir.stu3.proto.AllergyIntoleranceTypeCodeOrBuilder getTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * food | medication | environment | biologic
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.AllergyIntoleranceCategoryCode category = 13;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.AllergyIntoleranceCategoryCode> getCategoryList();
  /**
   *
   *
   * <pre>
   * food | medication | environment | biologic
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.AllergyIntoleranceCategoryCode category = 13;</code>
   */
  com.google.fhir.stu3.proto.AllergyIntoleranceCategoryCode getCategory(int index);
  /**
   *
   *
   * <pre>
   * food | medication | environment | biologic
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.AllergyIntoleranceCategoryCode category = 13;</code>
   */
  int getCategoryCount();
  /**
   *
   *
   * <pre>
   * food | medication | environment | biologic
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.AllergyIntoleranceCategoryCode category = 13;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.AllergyIntoleranceCategoryCodeOrBuilder>
      getCategoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * food | medication | environment | biologic
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.AllergyIntoleranceCategoryCode category = 13;</code>
   */
  com.google.fhir.stu3.proto.AllergyIntoleranceCategoryCodeOrBuilder getCategoryOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * low | high | unable-to-assess
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.AllergyIntoleranceCriticalityCode criticality = 14;</code>
   *
   * @return Whether the criticality field is set.
   */
  boolean hasCriticality();
  /**
   *
   *
   * <pre>
   * low | high | unable-to-assess
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.AllergyIntoleranceCriticalityCode criticality = 14;</code>
   *
   * @return The criticality.
   */
  com.google.fhir.stu3.proto.AllergyIntoleranceCriticalityCode getCriticality();
  /**
   *
   *
   * <pre>
   * low | high | unable-to-assess
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.AllergyIntoleranceCriticalityCode criticality = 14;</code>
   */
  com.google.fhir.stu3.proto.AllergyIntoleranceCriticalityCodeOrBuilder getCriticalityOrBuilder();

  /**
   *
   *
   * <pre>
   * Code that identifies the allergy or intolerance
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CodeableConcept code = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   *
   *
   * <pre>
   * Code that identifies the allergy or intolerance
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CodeableConcept code = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The code.
   */
  com.google.fhir.stu3.proto.CodeableConcept getCode();
  /**
   *
   *
   * <pre>
   * Code that identifies the allergy or intolerance
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CodeableConcept code = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getCodeOrBuilder();

  /**
   *
   *
   * <pre>
   * Who the sensitivity is for
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference patient = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return Whether the patient field is set.
   */
  boolean hasPatient();
  /**
   *
   *
   * <pre>
   * Who the sensitivity is for
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference patient = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return The patient.
   */
  com.google.fhir.stu3.proto.Reference getPatient();
  /**
   *
   *
   * <pre>
   * Who the sensitivity is for
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference patient = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getPatientOrBuilder();

  /**
   * <code>.google.fhir.stu3.uscore.UsCoreAllergyintolerance.Onset onset = 17;</code>
   *
   * @return Whether the onset field is set.
   */
  boolean hasOnset();
  /**
   * <code>.google.fhir.stu3.uscore.UsCoreAllergyintolerance.Onset onset = 17;</code>
   *
   * @return The onset.
   */
  com.google.fhir.stu3.uscore.UsCoreAllergyintolerance.Onset getOnset();
  /** <code>.google.fhir.stu3.uscore.UsCoreAllergyintolerance.Onset onset = 17;</code> */
  com.google.fhir.stu3.uscore.UsCoreAllergyintolerance.OnsetOrBuilder getOnsetOrBuilder();

  /**
   *
   *
   * <pre>
   * Date record was believed accurate
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime asserted_date = 18;</code>
   *
   * @return Whether the assertedDate field is set.
   */
  boolean hasAssertedDate();
  /**
   *
   *
   * <pre>
   * Date record was believed accurate
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime asserted_date = 18;</code>
   *
   * @return The assertedDate.
   */
  com.google.fhir.stu3.proto.DateTime getAssertedDate();
  /**
   *
   *
   * <pre>
   * Date record was believed accurate
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime asserted_date = 18;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getAssertedDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Who recorded the sensitivity
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference recorder = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return Whether the recorder field is set.
   */
  boolean hasRecorder();
  /**
   *
   *
   * <pre>
   * Who recorded the sensitivity
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference recorder = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return The recorder.
   */
  com.google.fhir.stu3.proto.Reference getRecorder();
  /**
   *
   *
   * <pre>
   * Who recorded the sensitivity
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference recorder = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getRecorderOrBuilder();

  /**
   *
   *
   * <pre>
   * Source of the information about the allergy
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference asserter = 20 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Practitioner"];
   * </code>
   *
   * @return Whether the asserter field is set.
   */
  boolean hasAsserter();
  /**
   *
   *
   * <pre>
   * Source of the information about the allergy
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference asserter = 20 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Practitioner"];
   * </code>
   *
   * @return The asserter.
   */
  com.google.fhir.stu3.proto.Reference getAsserter();
  /**
   *
   *
   * <pre>
   * Source of the information about the allergy
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference asserter = 20 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Practitioner"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getAsserterOrBuilder();

  /**
   *
   *
   * <pre>
   * Date(/time) of last known occurrence of a reaction
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime last_occurrence = 21;</code>
   *
   * @return Whether the lastOccurrence field is set.
   */
  boolean hasLastOccurrence();
  /**
   *
   *
   * <pre>
   * Date(/time) of last known occurrence of a reaction
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime last_occurrence = 21;</code>
   *
   * @return The lastOccurrence.
   */
  com.google.fhir.stu3.proto.DateTime getLastOccurrence();
  /**
   *
   *
   * <pre>
   * Date(/time) of last known occurrence of a reaction
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime last_occurrence = 21;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getLastOccurrenceOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional text not captured in other fields
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 22;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Annotation> getNoteList();
  /**
   *
   *
   * <pre>
   * Additional text not captured in other fields
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 22;</code>
   */
  com.google.fhir.stu3.proto.Annotation getNote(int index);
  /**
   *
   *
   * <pre>
   * Additional text not captured in other fields
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 22;</code>
   */
  int getNoteCount();
  /**
   *
   *
   * <pre>
   * Additional text not captured in other fields
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 22;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.AnnotationOrBuilder> getNoteOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional text not captured in other fields
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 22;</code>
   */
  com.google.fhir.stu3.proto.AnnotationOrBuilder getNoteOrBuilder(int index);

  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreAllergyintolerance.Reaction reaction = 23;</code>
   */
  java.util.List<com.google.fhir.stu3.uscore.UsCoreAllergyintolerance.Reaction> getReactionList();
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreAllergyintolerance.Reaction reaction = 23;</code>
   */
  com.google.fhir.stu3.uscore.UsCoreAllergyintolerance.Reaction getReaction(int index);
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreAllergyintolerance.Reaction reaction = 23;</code>
   */
  int getReactionCount();
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreAllergyintolerance.Reaction reaction = 23;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.uscore.UsCoreAllergyintolerance.ReactionOrBuilder>
      getReactionOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreAllergyintolerance.Reaction reaction = 23;</code>
   */
  com.google.fhir.stu3.uscore.UsCoreAllergyintolerance.ReactionOrBuilder getReactionOrBuilder(
      int index);
}
