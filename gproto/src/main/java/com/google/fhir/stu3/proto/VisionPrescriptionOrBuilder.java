// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface VisionPrescriptionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.VisionPrescription)
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
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Business identifier
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
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * active | cancelled | draft | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.FinancialResourceStatusCode status = 10;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * active | cancelled | draft | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.FinancialResourceStatusCode status = 10;</code>
   *
   * @return The status.
   */
  com.google.fhir.stu3.proto.FinancialResourceStatusCode getStatus();
  /**
   *
   *
   * <pre>
   * active | cancelled | draft | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.FinancialResourceStatusCode status = 10;</code>
   */
  com.google.fhir.stu3.proto.FinancialResourceStatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Who prescription is for
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference patient = 11 [(.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return Whether the patient field is set.
   */
  boolean hasPatient();
  /**
   *
   *
   * <pre>
   * Who prescription is for
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference patient = 11 [(.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return The patient.
   */
  com.google.fhir.stu3.proto.Reference getPatient();
  /**
   *
   *
   * <pre>
   * Who prescription is for
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference patient = 11 [(.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getPatientOrBuilder();

  /**
   *
   *
   * <pre>
   * Created during encounter / admission / stay
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference encounter = 12 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   *
   * @return Whether the encounter field is set.
   */
  boolean hasEncounter();
  /**
   *
   *
   * <pre>
   * Created during encounter / admission / stay
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference encounter = 12 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   *
   * @return The encounter.
   */
  com.google.fhir.stu3.proto.Reference getEncounter();
  /**
   *
   *
   * <pre>
   * Created during encounter / admission / stay
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference encounter = 12 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getEncounterOrBuilder();

  /**
   *
   *
   * <pre>
   * When prescription was authorized
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date_written = 13;</code>
   *
   * @return Whether the dateWritten field is set.
   */
  boolean hasDateWritten();
  /**
   *
   *
   * <pre>
   * When prescription was authorized
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date_written = 13;</code>
   *
   * @return The dateWritten.
   */
  com.google.fhir.stu3.proto.DateTime getDateWritten();
  /**
   *
   *
   * <pre>
   * When prescription was authorized
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date_written = 13;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getDateWrittenOrBuilder();

  /**
   *
   *
   * <pre>
   * Who authorizes the vision product
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference prescriber = 14 [(.google.fhir.proto.valid_reference_type) = "Practitioner"];
   * </code>
   *
   * @return Whether the prescriber field is set.
   */
  boolean hasPrescriber();
  /**
   *
   *
   * <pre>
   * Who authorizes the vision product
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference prescriber = 14 [(.google.fhir.proto.valid_reference_type) = "Practitioner"];
   * </code>
   *
   * @return The prescriber.
   */
  com.google.fhir.stu3.proto.Reference getPrescriber();
  /**
   *
   *
   * <pre>
   * Who authorizes the vision product
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference prescriber = 14 [(.google.fhir.proto.valid_reference_type) = "Practitioner"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getPrescriberOrBuilder();

  /**
   * <code>.google.fhir.stu3.proto.VisionPrescription.Reason reason = 15;</code>
   *
   * @return Whether the reason field is set.
   */
  boolean hasReason();
  /**
   * <code>.google.fhir.stu3.proto.VisionPrescription.Reason reason = 15;</code>
   *
   * @return The reason.
   */
  com.google.fhir.stu3.proto.VisionPrescription.Reason getReason();
  /** <code>.google.fhir.stu3.proto.VisionPrescription.Reason reason = 15;</code> */
  com.google.fhir.stu3.proto.VisionPrescription.ReasonOrBuilder getReasonOrBuilder();

  /** <code>repeated .google.fhir.stu3.proto.VisionPrescription.Dispense dispense = 16;</code> */
  java.util.List<com.google.fhir.stu3.proto.VisionPrescription.Dispense> getDispenseList();
  /** <code>repeated .google.fhir.stu3.proto.VisionPrescription.Dispense dispense = 16;</code> */
  com.google.fhir.stu3.proto.VisionPrescription.Dispense getDispense(int index);
  /** <code>repeated .google.fhir.stu3.proto.VisionPrescription.Dispense dispense = 16;</code> */
  int getDispenseCount();
  /** <code>repeated .google.fhir.stu3.proto.VisionPrescription.Dispense dispense = 16;</code> */
  java.util.List<? extends com.google.fhir.stu3.proto.VisionPrescription.DispenseOrBuilder>
      getDispenseOrBuilderList();
  /** <code>repeated .google.fhir.stu3.proto.VisionPrescription.Dispense dispense = 16;</code> */
  com.google.fhir.stu3.proto.VisionPrescription.DispenseOrBuilder getDispenseOrBuilder(int index);
}
