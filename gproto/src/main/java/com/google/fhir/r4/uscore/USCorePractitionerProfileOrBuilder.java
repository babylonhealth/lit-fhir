// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/uscore.proto

package com.google.fhir.r4.uscore;

public interface USCorePractitionerProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.uscore.USCorePractitionerProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   * @return The id.
   */
  com.google.fhir.r4.core.Id getId();
  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   */
  com.google.fhir.r4.core.IdOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   * @return Whether the meta field is set.
   */
  boolean hasMeta();
  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   * @return The meta.
   */
  com.google.fhir.r4.core.Meta getMeta();
  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   */
  com.google.fhir.r4.core.MetaOrBuilder getMetaOrBuilder();

  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   * @return Whether the implicitRules field is set.
   */
  boolean hasImplicitRules();
  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   * @return The implicitRules.
   */
  com.google.fhir.r4.core.Uri getImplicitRules();
  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   */
  com.google.fhir.r4.core.UriOrBuilder getImplicitRulesOrBuilder();

  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   * @return Whether the language field is set.
   */
  boolean hasLanguage();
  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   * @return The language.
   */
  com.google.fhir.r4.core.Code getLanguage();
  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   */
  com.google.fhir.r4.core.CodeOrBuilder getLanguageOrBuilder();

  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   * @return The text.
   */
  com.google.fhir.r4.core.Narrative getText();
  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   */
  com.google.fhir.r4.core.NarrativeOrBuilder getTextOrBuilder();

  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getContainedList();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  com.google.protobuf.Any getContained(int index);
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  int getContainedCount();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getContainedOrBuilderList();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  com.google.protobuf.AnyOrBuilder getContainedOrBuilder(
      int index);

  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  com.google.fhir.r4.core.Extension getExtension(int index);
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> 
      getModifierExtensionList();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  com.google.fhir.r4.core.Extension getModifierExtension(int index);
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  int getModifierExtensionCount();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> 
      getModifierExtensionOrBuilderList();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getModifierExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * An identifier for the person as this agent
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * An identifier for the person as this agent
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   * <pre>
   * An identifier for the person as this agent
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * An identifier for the person as this agent
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * An identifier for the person as this agent
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <pre>
   * Whether this practitioner's record is in active use
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean active = 11;</code>
   * @return Whether the active field is set.
   */
  boolean hasActive();
  /**
   * <pre>
   * Whether this practitioner's record is in active use
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean active = 11;</code>
   * @return The active.
   */
  com.google.fhir.r4.core.Boolean getActive();
  /**
   * <pre>
   * Whether this practitioner's record is in active use
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean active = 11;</code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getActiveOrBuilder();

  /**
   * <pre>
   * The name(s) associated with the practitioner
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.HumanName name = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  java.util.List<com.google.fhir.r4.core.HumanName> 
      getNameList();
  /**
   * <pre>
   * The name(s) associated with the practitioner
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.HumanName name = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.HumanName getName(int index);
  /**
   * <pre>
   * The name(s) associated with the practitioner
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.HumanName name = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  int getNameCount();
  /**
   * <pre>
   * The name(s) associated with the practitioner
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.HumanName name = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.HumanNameOrBuilder> 
      getNameOrBuilderList();
  /**
   * <pre>
   * The name(s) associated with the practitioner
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.HumanName name = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.HumanNameOrBuilder getNameOrBuilder(
      int index);

  /**
   * <pre>
   * A contact detail for the practitioner (that apply to all roles)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 13;</code>
   */
  java.util.List<com.google.fhir.r4.core.ContactPoint> 
      getTelecomList();
  /**
   * <pre>
   * A contact detail for the practitioner (that apply to all roles)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 13;</code>
   */
  com.google.fhir.r4.core.ContactPoint getTelecom(int index);
  /**
   * <pre>
   * A contact detail for the practitioner (that apply to all roles)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 13;</code>
   */
  int getTelecomCount();
  /**
   * <pre>
   * A contact detail for the practitioner (that apply to all roles)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 13;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ContactPointOrBuilder> 
      getTelecomOrBuilderList();
  /**
   * <pre>
   * A contact detail for the practitioner (that apply to all roles)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 13;</code>
   */
  com.google.fhir.r4.core.ContactPointOrBuilder getTelecomOrBuilder(
      int index);

  /**
   * <pre>
   * Address(es) of the practitioner that are not role specific (typically home
   * address)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Address address = 14;</code>
   */
  java.util.List<com.google.fhir.r4.core.Address> 
      getAddressList();
  /**
   * <pre>
   * Address(es) of the practitioner that are not role specific (typically home
   * address)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Address address = 14;</code>
   */
  com.google.fhir.r4.core.Address getAddress(int index);
  /**
   * <pre>
   * Address(es) of the practitioner that are not role specific (typically home
   * address)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Address address = 14;</code>
   */
  int getAddressCount();
  /**
   * <pre>
   * Address(es) of the practitioner that are not role specific (typically home
   * address)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Address address = 14;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.AddressOrBuilder> 
      getAddressOrBuilderList();
  /**
   * <pre>
   * Address(es) of the practitioner that are not role specific (typically home
   * address)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Address address = 14;</code>
   */
  com.google.fhir.r4.core.AddressOrBuilder getAddressOrBuilder(
      int index);

  /**
   * <code>.google.fhir.r4.uscore.USCorePractitionerProfile.GenderCode gender = 15;</code>
   * @return Whether the gender field is set.
   */
  boolean hasGender();
  /**
   * <code>.google.fhir.r4.uscore.USCorePractitionerProfile.GenderCode gender = 15;</code>
   * @return The gender.
   */
  com.google.fhir.r4.uscore.USCorePractitionerProfile.GenderCode getGender();
  /**
   * <code>.google.fhir.r4.uscore.USCorePractitionerProfile.GenderCode gender = 15;</code>
   */
  com.google.fhir.r4.uscore.USCorePractitionerProfile.GenderCodeOrBuilder getGenderOrBuilder();

  /**
   * <pre>
   * The date  on which the practitioner was born
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date birth_date = 16;</code>
   * @return Whether the birthDate field is set.
   */
  boolean hasBirthDate();
  /**
   * <pre>
   * The date  on which the practitioner was born
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date birth_date = 16;</code>
   * @return The birthDate.
   */
  com.google.fhir.r4.core.Date getBirthDate();
  /**
   * <pre>
   * The date  on which the practitioner was born
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date birth_date = 16;</code>
   */
  com.google.fhir.r4.core.DateOrBuilder getBirthDateOrBuilder();

  /**
   * <pre>
   * Image of the person
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Attachment photo = 17;</code>
   */
  java.util.List<com.google.fhir.r4.core.Attachment> 
      getPhotoList();
  /**
   * <pre>
   * Image of the person
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Attachment photo = 17;</code>
   */
  com.google.fhir.r4.core.Attachment getPhoto(int index);
  /**
   * <pre>
   * Image of the person
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Attachment photo = 17;</code>
   */
  int getPhotoCount();
  /**
   * <pre>
   * Image of the person
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Attachment photo = 17;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.AttachmentOrBuilder> 
      getPhotoOrBuilderList();
  /**
   * <pre>
   * Image of the person
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Attachment photo = 17;</code>
   */
  com.google.fhir.r4.core.AttachmentOrBuilder getPhotoOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.r4.uscore.USCorePractitionerProfile.Qualification qualification = 18;</code>
   */
  java.util.List<com.google.fhir.r4.uscore.USCorePractitionerProfile.Qualification> 
      getQualificationList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCorePractitionerProfile.Qualification qualification = 18;</code>
   */
  com.google.fhir.r4.uscore.USCorePractitionerProfile.Qualification getQualification(int index);
  /**
   * <code>repeated .google.fhir.r4.uscore.USCorePractitionerProfile.Qualification qualification = 18;</code>
   */
  int getQualificationCount();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCorePractitionerProfile.Qualification qualification = 18;</code>
   */
  java.util.List<? extends com.google.fhir.r4.uscore.USCorePractitionerProfile.QualificationOrBuilder> 
      getQualificationOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCorePractitionerProfile.Qualification qualification = 18;</code>
   */
  com.google.fhir.r4.uscore.USCorePractitionerProfile.QualificationOrBuilder getQualificationOrBuilder(
      int index);

  /**
   * <pre>
   * A language the practitioner can use in patient communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept communication = 19;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getCommunicationList();
  /**
   * <pre>
   * A language the practitioner can use in patient communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept communication = 19;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getCommunication(int index);
  /**
   * <pre>
   * A language the practitioner can use in patient communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept communication = 19;</code>
   */
  int getCommunicationCount();
  /**
   * <pre>
   * A language the practitioner can use in patient communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept communication = 19;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getCommunicationOrBuilderList();
  /**
   * <pre>
   * A language the practitioner can use in patient communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept communication = 19;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCommunicationOrBuilder(
      int index);
}
