// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface SpecimenOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.Specimen)
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
   * External Identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * External Identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * External Identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * External Identifier
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
   * External Identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Identifier assigned by the lab
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier accession_identifier = 10;</code>
   *
   * @return Whether the accessionIdentifier field is set.
   */
  boolean hasAccessionIdentifier();
  /**
   *
   *
   * <pre>
   * Identifier assigned by the lab
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier accession_identifier = 10;</code>
   *
   * @return The accessionIdentifier.
   */
  com.google.fhir.stu3.proto.Identifier getAccessionIdentifier();
  /**
   *
   *
   * <pre>
   * Identifier assigned by the lab
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier accession_identifier = 10;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getAccessionIdentifierOrBuilder();

  /**
   *
   *
   * <pre>
   * available | unavailable | unsatisfactory | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.SpecimenStatusCode status = 11;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * available | unavailable | unsatisfactory | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.SpecimenStatusCode status = 11;</code>
   *
   * @return The status.
   */
  com.google.fhir.stu3.proto.SpecimenStatusCode getStatus();
  /**
   *
   *
   * <pre>
   * available | unavailable | unsatisfactory | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.SpecimenStatusCode status = 11;</code>
   */
  com.google.fhir.stu3.proto.SpecimenStatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Kind of material that forms the specimen
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 12;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * Kind of material that forms the specimen
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 12;</code>
   *
   * @return The type.
   */
  com.google.fhir.stu3.proto.CodeableConcept getType();
  /**
   *
   *
   * <pre>
   * Kind of material that forms the specimen
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 12;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Where the specimen came from. This may be from the patient(s) or from the
   * environment or a device
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Substance"];
   * </code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   *
   *
   * <pre>
   * Where the specimen came from. This may be from the patient(s) or from the
   * environment or a device
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Substance"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.stu3.proto.Reference getSubject();
  /**
   *
   *
   * <pre>
   * Where the specimen came from. This may be from the patient(s) or from the
   * environment or a device
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Substance"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * The time when specimen was received for processing
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime received_time = 14;</code>
   *
   * @return Whether the receivedTime field is set.
   */
  boolean hasReceivedTime();
  /**
   *
   *
   * <pre>
   * The time when specimen was received for processing
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime received_time = 14;</code>
   *
   * @return The receivedTime.
   */
  com.google.fhir.stu3.proto.DateTime getReceivedTime();
  /**
   *
   *
   * <pre>
   * The time when specimen was received for processing
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime received_time = 14;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getReceivedTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Specimen from which this specimen originated
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference parent = 15 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getParentList();
  /**
   *
   *
   * <pre>
   * Specimen from which this specimen originated
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference parent = 15 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getParent(int index);
  /**
   *
   *
   * <pre>
   * Specimen from which this specimen originated
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference parent = 15 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
   * </code>
   */
  int getParentCount();
  /**
   *
   *
   * <pre>
   * Specimen from which this specimen originated
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference parent = 15 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getParentOrBuilderList();
  /**
   *
   *
   * <pre>
   * Specimen from which this specimen originated
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference parent = 15 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getParentOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Why the specimen was collected
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference request = 16 [(.google.fhir.proto.valid_reference_type) = "ProcedureRequest"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getRequestList();
  /**
   *
   *
   * <pre>
   * Why the specimen was collected
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference request = 16 [(.google.fhir.proto.valid_reference_type) = "ProcedureRequest"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getRequest(int index);
  /**
   *
   *
   * <pre>
   * Why the specimen was collected
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference request = 16 [(.google.fhir.proto.valid_reference_type) = "ProcedureRequest"];
   * </code>
   */
  int getRequestCount();
  /**
   *
   *
   * <pre>
   * Why the specimen was collected
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference request = 16 [(.google.fhir.proto.valid_reference_type) = "ProcedureRequest"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getRequestOrBuilderList();
  /**
   *
   *
   * <pre>
   * Why the specimen was collected
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference request = 16 [(.google.fhir.proto.valid_reference_type) = "ProcedureRequest"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getRequestOrBuilder(int index);

  /**
   * <code>.google.fhir.stu3.proto.Specimen.Collection collection = 17;</code>
   *
   * @return Whether the collection field is set.
   */
  boolean hasCollection();
  /**
   * <code>.google.fhir.stu3.proto.Specimen.Collection collection = 17;</code>
   *
   * @return The collection.
   */
  com.google.fhir.stu3.proto.Specimen.Collection getCollection();
  /** <code>.google.fhir.stu3.proto.Specimen.Collection collection = 17;</code> */
  com.google.fhir.stu3.proto.Specimen.CollectionOrBuilder getCollectionOrBuilder();

  /** <code>repeated .google.fhir.stu3.proto.Specimen.Processing processing = 18;</code> */
  java.util.List<com.google.fhir.stu3.proto.Specimen.Processing> getProcessingList();
  /** <code>repeated .google.fhir.stu3.proto.Specimen.Processing processing = 18;</code> */
  com.google.fhir.stu3.proto.Specimen.Processing getProcessing(int index);
  /** <code>repeated .google.fhir.stu3.proto.Specimen.Processing processing = 18;</code> */
  int getProcessingCount();
  /** <code>repeated .google.fhir.stu3.proto.Specimen.Processing processing = 18;</code> */
  java.util.List<? extends com.google.fhir.stu3.proto.Specimen.ProcessingOrBuilder>
      getProcessingOrBuilderList();
  /** <code>repeated .google.fhir.stu3.proto.Specimen.Processing processing = 18;</code> */
  com.google.fhir.stu3.proto.Specimen.ProcessingOrBuilder getProcessingOrBuilder(int index);

  /** <code>repeated .google.fhir.stu3.proto.Specimen.Container container = 19;</code> */
  java.util.List<com.google.fhir.stu3.proto.Specimen.Container> getContainerList();
  /** <code>repeated .google.fhir.stu3.proto.Specimen.Container container = 19;</code> */
  com.google.fhir.stu3.proto.Specimen.Container getContainer(int index);
  /** <code>repeated .google.fhir.stu3.proto.Specimen.Container container = 19;</code> */
  int getContainerCount();
  /** <code>repeated .google.fhir.stu3.proto.Specimen.Container container = 19;</code> */
  java.util.List<? extends com.google.fhir.stu3.proto.Specimen.ContainerOrBuilder>
      getContainerOrBuilderList();
  /** <code>repeated .google.fhir.stu3.proto.Specimen.Container container = 19;</code> */
  com.google.fhir.stu3.proto.Specimen.ContainerOrBuilder getContainerOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Comments
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 20;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Annotation> getNoteList();
  /**
   *
   *
   * <pre>
   * Comments
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 20;</code>
   */
  com.google.fhir.stu3.proto.Annotation getNote(int index);
  /**
   *
   *
   * <pre>
   * Comments
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 20;</code>
   */
  int getNoteCount();
  /**
   *
   *
   * <pre>
   * Comments
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 20;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.AnnotationOrBuilder> getNoteOrBuilderList();
  /**
   *
   *
   * <pre>
   * Comments
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 20;</code>
   */
  com.google.fhir.stu3.proto.AnnotationOrBuilder getNoteOrBuilder(int index);
}