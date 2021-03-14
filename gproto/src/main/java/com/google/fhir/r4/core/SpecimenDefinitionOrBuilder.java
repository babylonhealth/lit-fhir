// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/specimen_definition.proto

package com.google.fhir.r4.core;

public interface SpecimenDefinitionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.SpecimenDefinition)
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
   * Business identifier of a kind of specimen
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
   * Business identifier of a kind of specimen
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
   * Business identifier of a kind of specimen
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder();

  /**
   *
   *
   * <pre>
   * Kind of material to collect
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type_collected = 11;</code>
   *
   * @return Whether the typeCollected field is set.
   */
  boolean hasTypeCollected();
  /**
   *
   *
   * <pre>
   * Kind of material to collect
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type_collected = 11;</code>
   *
   * @return The typeCollected.
   */
  com.google.fhir.r4.core.CodeableConcept getTypeCollected();
  /**
   *
   *
   * <pre>
   * Kind of material to collect
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type_collected = 11;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getTypeCollectedOrBuilder();

  /**
   *
   *
   * <pre>
   * Patient preparation for collection
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept patient_preparation = 12;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getPatientPreparationList();
  /**
   *
   *
   * <pre>
   * Patient preparation for collection
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept patient_preparation = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getPatientPreparation(int index);
  /**
   *
   *
   * <pre>
   * Patient preparation for collection
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept patient_preparation = 12;</code>
   */
  int getPatientPreparationCount();
  /**
   *
   *
   * <pre>
   * Patient preparation for collection
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept patient_preparation = 12;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getPatientPreparationOrBuilderList();
  /**
   *
   *
   * <pre>
   * Patient preparation for collection
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept patient_preparation = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getPatientPreparationOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Time aspect for collection
   * </pre>
   *
   * <code>.google.fhir.r4.core.String time_aspect = 13;</code>
   *
   * @return Whether the timeAspect field is set.
   */
  boolean hasTimeAspect();
  /**
   *
   *
   * <pre>
   * Time aspect for collection
   * </pre>
   *
   * <code>.google.fhir.r4.core.String time_aspect = 13;</code>
   *
   * @return The timeAspect.
   */
  com.google.fhir.r4.core.String getTimeAspect();
  /**
   *
   *
   * <pre>
   * Time aspect for collection
   * </pre>
   *
   * <code>.google.fhir.r4.core.String time_aspect = 13;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getTimeAspectOrBuilder();

  /**
   *
   *
   * <pre>
   * Specimen collection procedure
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept collection = 14;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getCollectionList();
  /**
   *
   *
   * <pre>
   * Specimen collection procedure
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept collection = 14;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getCollection(int index);
  /**
   *
   *
   * <pre>
   * Specimen collection procedure
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept collection = 14;</code>
   */
  int getCollectionCount();
  /**
   *
   *
   * <pre>
   * Specimen collection procedure
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept collection = 14;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getCollectionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Specimen collection procedure
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept collection = 14;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCollectionOrBuilder(int index);

  /** <code>repeated .google.fhir.r4.core.SpecimenDefinition.TypeTested type_tested = 15;</code> */
  java.util.List<com.google.fhir.r4.core.SpecimenDefinition.TypeTested> getTypeTestedList();
  /** <code>repeated .google.fhir.r4.core.SpecimenDefinition.TypeTested type_tested = 15;</code> */
  com.google.fhir.r4.core.SpecimenDefinition.TypeTested getTypeTested(int index);
  /** <code>repeated .google.fhir.r4.core.SpecimenDefinition.TypeTested type_tested = 15;</code> */
  int getTypeTestedCount();
  /** <code>repeated .google.fhir.r4.core.SpecimenDefinition.TypeTested type_tested = 15;</code> */
  java.util.List<? extends com.google.fhir.r4.core.SpecimenDefinition.TypeTestedOrBuilder>
      getTypeTestedOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.SpecimenDefinition.TypeTested type_tested = 15;</code> */
  com.google.fhir.r4.core.SpecimenDefinition.TypeTestedOrBuilder getTypeTestedOrBuilder(int index);
}
