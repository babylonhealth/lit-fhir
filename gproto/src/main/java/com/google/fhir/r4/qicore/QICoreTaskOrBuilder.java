// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/qicore/qicore.proto

package com.google.fhir.r4.qicore;

public interface QICoreTaskOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.qicore.QICoreTask)
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
   * Formal definition of task
   * </pre>
   *
   * <code>.google.fhir.r4.core.Canonical instantiates_canonical = 10;</code>
   *
   * @return Whether the instantiatesCanonical field is set.
   */
  boolean hasInstantiatesCanonical();
  /**
   *
   *
   * <pre>
   * Formal definition of task
   * </pre>
   *
   * <code>.google.fhir.r4.core.Canonical instantiates_canonical = 10;</code>
   *
   * @return The instantiatesCanonical.
   */
  com.google.fhir.r4.core.Canonical getInstantiatesCanonical();
  /**
   *
   *
   * <pre>
   * Formal definition of task
   * </pre>
   *
   * <code>.google.fhir.r4.core.Canonical instantiates_canonical = 10;</code>
   */
  com.google.fhir.r4.core.CanonicalOrBuilder getInstantiatesCanonicalOrBuilder();

  /**
   *
   *
   * <pre>
   * Formal definition of task
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri instantiates_uri = 11;</code>
   *
   * @return Whether the instantiatesUri field is set.
   */
  boolean hasInstantiatesUri();
  /**
   *
   *
   * <pre>
   * Formal definition of task
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri instantiates_uri = 11;</code>
   *
   * @return The instantiatesUri.
   */
  com.google.fhir.r4.core.Uri getInstantiatesUri();
  /**
   *
   *
   * <pre>
   * Formal definition of task
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri instantiates_uri = 11;</code>
   */
  com.google.fhir.r4.core.UriOrBuilder getInstantiatesUriOrBuilder();

  /**
   *
   *
   * <pre>
   * Request fulfilled by this task
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getBasedOnList();
  /**
   *
   *
   * <pre>
   * Request fulfilled by this task
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getBasedOn(int index);
  /**
   *
   *
   * <pre>
   * Request fulfilled by this task
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  int getBasedOnCount();
  /**
   *
   *
   * <pre>
   * Request fulfilled by this task
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getBasedOnOrBuilderList();
  /**
   *
   *
   * <pre>
   * Request fulfilled by this task
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getBasedOnOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Requisition or grouper id
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier group_identifier = 13;</code>
   *
   * @return Whether the groupIdentifier field is set.
   */
  boolean hasGroupIdentifier();
  /**
   *
   *
   * <pre>
   * Requisition or grouper id
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier group_identifier = 13;</code>
   *
   * @return The groupIdentifier.
   */
  com.google.fhir.r4.core.Identifier getGroupIdentifier();
  /**
   *
   *
   * <pre>
   * Requisition or grouper id
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier group_identifier = 13;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getGroupIdentifierOrBuilder();

  /**
   *
   *
   * <pre>
   * Composite task
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference part_of = 14 [(.google.fhir.proto.valid_reference_type) = "Task"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getPartOfList();
  /**
   *
   *
   * <pre>
   * Composite task
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference part_of = 14 [(.google.fhir.proto.valid_reference_type) = "Task"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getPartOf(int index);
  /**
   *
   *
   * <pre>
   * Composite task
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference part_of = 14 [(.google.fhir.proto.valid_reference_type) = "Task"];
   * </code>
   */
  int getPartOfCount();
  /**
   *
   *
   * <pre>
   * Composite task
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference part_of = 14 [(.google.fhir.proto.valid_reference_type) = "Task"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getPartOfOrBuilderList();
  /**
   *
   *
   * <pre>
   * Composite task
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference part_of = 14 [(.google.fhir.proto.valid_reference_type) = "Task"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPartOfOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Reason for current status
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept status_reason = 15;</code>
   *
   * @return Whether the statusReason field is set.
   */
  boolean hasStatusReason();
  /**
   *
   *
   * <pre>
   * Reason for current status
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept status_reason = 15;</code>
   *
   * @return The statusReason.
   */
  com.google.fhir.r4.core.CodeableConcept getStatusReason();
  /**
   *
   *
   * <pre>
   * Reason for current status
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept status_reason = 15;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getStatusReasonOrBuilder();

  /**
   *
   *
   * <pre>
   * E.g. "Specimen collected", "IV prepped"
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept business_status = 16;</code>
   *
   * @return Whether the businessStatus field is set.
   */
  boolean hasBusinessStatus();
  /**
   *
   *
   * <pre>
   * E.g. "Specimen collected", "IV prepped"
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept business_status = 16;</code>
   *
   * @return The businessStatus.
   */
  com.google.fhir.r4.core.CodeableConcept getBusinessStatus();
  /**
   *
   *
   * <pre>
   * E.g. "Specimen collected", "IV prepped"
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept business_status = 16;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getBusinessStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Human-readable explanation of task
   * </pre>
   *
   * <code>.google.fhir.r4.core.String description = 17;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * Human-readable explanation of task
   * </pre>
   *
   * <code>.google.fhir.r4.core.String description = 17;</code>
   *
   * @return The description.
   */
  com.google.fhir.r4.core.String getDescription();
  /**
   *
   *
   * <pre>
   * Human-readable explanation of task
   * </pre>
   *
   * <code>.google.fhir.r4.core.String description = 17;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getDescriptionOrBuilder();

  /**
   *
   *
   * <pre>
   * What task is acting on
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference focus = 18 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   *
   * @return Whether the focus field is set.
   */
  boolean hasFocus();
  /**
   *
   *
   * <pre>
   * What task is acting on
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference focus = 18 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   *
   * @return The focus.
   */
  com.google.fhir.r4.core.Reference getFocus();
  /**
   *
   *
   * <pre>
   * What task is acting on
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference focus = 18 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getFocusOrBuilder();

  /**
   *
   *
   * <pre>
   * Beneficiary of the Task
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference for_value = 19[json_name = "for", (.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   *
   * @return Whether the forValue field is set.
   */
  boolean hasForValue();
  /**
   *
   *
   * <pre>
   * Beneficiary of the Task
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference for_value = 19[json_name = "for", (.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   *
   * @return The forValue.
   */
  com.google.fhir.r4.core.Reference getForValue();
  /**
   *
   *
   * <pre>
   * Beneficiary of the Task
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference for_value = 19[json_name = "for", (.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getForValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Healthcare event during which this task originated
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 20 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   *
   * @return Whether the encounter field is set.
   */
  boolean hasEncounter();
  /**
   *
   *
   * <pre>
   * Healthcare event during which this task originated
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 20 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   *
   * @return The encounter.
   */
  com.google.fhir.r4.core.Reference getEncounter();
  /**
   *
   *
   * <pre>
   * Healthcare event during which this task originated
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 20 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getEncounterOrBuilder();

  /**
   *
   *
   * <pre>
   * Task Creation Date
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime authored_on = 21;</code>
   *
   * @return Whether the authoredOn field is set.
   */
  boolean hasAuthoredOn();
  /**
   *
   *
   * <pre>
   * Task Creation Date
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime authored_on = 21;</code>
   *
   * @return The authoredOn.
   */
  com.google.fhir.r4.core.DateTime getAuthoredOn();
  /**
   *
   *
   * <pre>
   * Task Creation Date
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime authored_on = 21;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getAuthoredOnOrBuilder();

  /**
   *
   *
   * <pre>
   * Task Last Modified Date
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime last_modified = 22;</code>
   *
   * @return Whether the lastModified field is set.
   */
  boolean hasLastModified();
  /**
   *
   *
   * <pre>
   * Task Last Modified Date
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime last_modified = 22;</code>
   *
   * @return The lastModified.
   */
  com.google.fhir.r4.core.DateTime getLastModified();
  /**
   *
   *
   * <pre>
   * Task Last Modified Date
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime last_modified = 22;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getLastModifiedOrBuilder();

  /**
   *
   *
   * <pre>
   * Who is asking for task to be done
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference requester = 23 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   *
   * @return Whether the requester field is set.
   */
  boolean hasRequester();
  /**
   *
   *
   * <pre>
   * Who is asking for task to be done
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference requester = 23 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   *
   * @return The requester.
   */
  com.google.fhir.r4.core.Reference getRequester();
  /**
   *
   *
   * <pre>
   * Who is asking for task to be done
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference requester = 23 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getRequesterOrBuilder();

  /**
   *
   *
   * <pre>
   * Requested performer
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept performer_type = 24;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getPerformerTypeList();
  /**
   *
   *
   * <pre>
   * Requested performer
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept performer_type = 24;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getPerformerType(int index);
  /**
   *
   *
   * <pre>
   * Requested performer
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept performer_type = 24;</code>
   */
  int getPerformerTypeCount();
  /**
   *
   *
   * <pre>
   * Requested performer
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept performer_type = 24;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getPerformerTypeOrBuilderList();
  /**
   *
   *
   * <pre>
   * Requested performer
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept performer_type = 24;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getPerformerTypeOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Responsible individual
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference owner = 25 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam", (.google.fhir.proto.valid_reference_type) = "HealthcareService", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   *
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   *
   *
   * <pre>
   * Responsible individual
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference owner = 25 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam", (.google.fhir.proto.valid_reference_type) = "HealthcareService", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   *
   * @return The owner.
   */
  com.google.fhir.r4.core.Reference getOwner();
  /**
   *
   *
   * <pre>
   * Responsible individual
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference owner = 25 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam", (.google.fhir.proto.valid_reference_type) = "HealthcareService", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getOwnerOrBuilder();

  /**
   *
   *
   * <pre>
   * Where task occurs
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference location = 26 [(.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   *
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   *
   *
   * <pre>
   * Where task occurs
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference location = 26 [(.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   *
   * @return The location.
   */
  com.google.fhir.r4.core.Reference getLocation();
  /**
   *
   *
   * <pre>
   * Where task occurs
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference location = 26 [(.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Why task is needed
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept reason_code = 27;</code>
   *
   * @return Whether the reasonCode field is set.
   */
  boolean hasReasonCode();
  /**
   *
   *
   * <pre>
   * Why task is needed
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept reason_code = 27;</code>
   *
   * @return The reasonCode.
   */
  com.google.fhir.r4.core.CodeableConcept getReasonCode();
  /**
   *
   *
   * <pre>
   * Why task is needed
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept reason_code = 27;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getReasonCodeOrBuilder();

  /**
   *
   *
   * <pre>
   * Why task is needed
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference reason_reference = 28 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   *
   * @return Whether the reasonReference field is set.
   */
  boolean hasReasonReference();
  /**
   *
   *
   * <pre>
   * Why task is needed
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference reason_reference = 28 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   *
   * @return The reasonReference.
   */
  com.google.fhir.r4.core.Reference getReasonReference();
  /**
   *
   *
   * <pre>
   * Why task is needed
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference reason_reference = 28 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getReasonReferenceOrBuilder();

  /**
   *
   *
   * <pre>
   * Associated insurance coverage
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference insurance = 29 [(.google.fhir.proto.valid_reference_type) = "Coverage", (.google.fhir.proto.valid_reference_type) = "ClaimResponse"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getInsuranceList();
  /**
   *
   *
   * <pre>
   * Associated insurance coverage
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference insurance = 29 [(.google.fhir.proto.valid_reference_type) = "Coverage", (.google.fhir.proto.valid_reference_type) = "ClaimResponse"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getInsurance(int index);
  /**
   *
   *
   * <pre>
   * Associated insurance coverage
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference insurance = 29 [(.google.fhir.proto.valid_reference_type) = "Coverage", (.google.fhir.proto.valid_reference_type) = "ClaimResponse"];
   * </code>
   */
  int getInsuranceCount();
  /**
   *
   *
   * <pre>
   * Associated insurance coverage
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference insurance = 29 [(.google.fhir.proto.valid_reference_type) = "Coverage", (.google.fhir.proto.valid_reference_type) = "ClaimResponse"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getInsuranceOrBuilderList();
  /**
   *
   *
   * <pre>
   * Associated insurance coverage
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference insurance = 29 [(.google.fhir.proto.valid_reference_type) = "Coverage", (.google.fhir.proto.valid_reference_type) = "ClaimResponse"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getInsuranceOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Comments made about the task
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 30;</code>
   */
  java.util.List<com.google.fhir.r4.core.Annotation> getNoteList();
  /**
   *
   *
   * <pre>
   * Comments made about the task
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 30;</code>
   */
  com.google.fhir.r4.core.Annotation getNote(int index);
  /**
   *
   *
   * <pre>
   * Comments made about the task
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 30;</code>
   */
  int getNoteCount();
  /**
   *
   *
   * <pre>
   * Comments made about the task
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 30;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.AnnotationOrBuilder> getNoteOrBuilderList();
  /**
   *
   *
   * <pre>
   * Comments made about the task
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 30;</code>
   */
  com.google.fhir.r4.core.AnnotationOrBuilder getNoteOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Key events in history of the Task
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference relevant_history = 31 [(.google.fhir.proto.valid_reference_type) = "Provenance"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getRelevantHistoryList();
  /**
   *
   *
   * <pre>
   * Key events in history of the Task
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference relevant_history = 31 [(.google.fhir.proto.valid_reference_type) = "Provenance"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getRelevantHistory(int index);
  /**
   *
   *
   * <pre>
   * Key events in history of the Task
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference relevant_history = 31 [(.google.fhir.proto.valid_reference_type) = "Provenance"];
   * </code>
   */
  int getRelevantHistoryCount();
  /**
   *
   *
   * <pre>
   * Key events in history of the Task
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference relevant_history = 31 [(.google.fhir.proto.valid_reference_type) = "Provenance"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getRelevantHistoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Key events in history of the Task
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference relevant_history = 31 [(.google.fhir.proto.valid_reference_type) = "Provenance"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getRelevantHistoryOrBuilder(int index);

  /**
   * <code>
   * .google.fhir.r4.qicore.QICoreTask.Restriction restriction = 32 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   *
   * @return Whether the restriction field is set.
   */
  boolean hasRestriction();
  /**
   * <code>
   * .google.fhir.r4.qicore.QICoreTask.Restriction restriction = 32 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   *
   * @return The restriction.
   */
  com.google.fhir.r4.qicore.QICoreTask.Restriction getRestriction();
  /**
   * <code>
   * .google.fhir.r4.qicore.QICoreTask.Restriction restriction = 32 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  com.google.fhir.r4.qicore.QICoreTask.RestrictionOrBuilder getRestrictionOrBuilder();

  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreTask.Parameter input = 33 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.qicore.QICoreTask.Parameter> getInputList();
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreTask.Parameter input = 33 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  com.google.fhir.r4.qicore.QICoreTask.Parameter getInput(int index);
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreTask.Parameter input = 33 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  int getInputCount();
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreTask.Parameter input = 33 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.qicore.QICoreTask.ParameterOrBuilder>
      getInputOrBuilderList();
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreTask.Parameter input = 33 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  com.google.fhir.r4.qicore.QICoreTask.ParameterOrBuilder getInputOrBuilder(int index);

  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreTask.Output output = 34 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.qicore.QICoreTask.Output> getOutputList();
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreTask.Output output = 34 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  com.google.fhir.r4.qicore.QICoreTask.Output getOutput(int index);
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreTask.Output output = 34 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  int getOutputCount();
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreTask.Output output = 34 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.qicore.QICoreTask.OutputOrBuilder>
      getOutputOrBuilderList();
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreTask.Output output = 34 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  com.google.fhir.r4.qicore.QICoreTask.OutputOrBuilder getOutputOrBuilder(int index);
}
