// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface GroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.Group)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Id id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Id id = 1;</code>
   * @return The id.
   */
  com.google.fhir.stu3.proto.Id getId();
  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Id id = 1;</code>
   */
  com.google.fhir.stu3.proto.IdOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Meta meta = 2;</code>
   * @return Whether the meta field is set.
   */
  boolean hasMeta();
  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Meta meta = 2;</code>
   * @return The meta.
   */
  com.google.fhir.stu3.proto.Meta getMeta();
  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Meta meta = 2;</code>
   */
  com.google.fhir.stu3.proto.MetaOrBuilder getMetaOrBuilder();

  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri implicit_rules = 3;</code>
   * @return Whether the implicitRules field is set.
   */
  boolean hasImplicitRules();
  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri implicit_rules = 3;</code>
   * @return The implicitRules.
   */
  com.google.fhir.stu3.proto.Uri getImplicitRules();
  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri implicit_rules = 3;</code>
   */
  com.google.fhir.stu3.proto.UriOrBuilder getImplicitRulesOrBuilder();

  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.LanguageCode language = 4;</code>
   * @return Whether the language field is set.
   */
  boolean hasLanguage();
  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.LanguageCode language = 4;</code>
   * @return The language.
   */
  com.google.fhir.stu3.proto.LanguageCode getLanguage();
  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.LanguageCode language = 4;</code>
   */
  com.google.fhir.stu3.proto.LanguageCodeOrBuilder getLanguageOrBuilder();

  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Narrative text = 5;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Narrative text = 5;</code>
   * @return The text.
   */
  com.google.fhir.stu3.proto.Narrative getText();
  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Narrative text = 5;</code>
   */
  com.google.fhir.stu3.proto.NarrativeOrBuilder getTextOrBuilder();

  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.ContainedResource> 
      getContainedList();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  com.google.fhir.stu3.proto.ContainedResource getContained(int index);
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  int getContainedCount();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ContainedResourceOrBuilder> 
      getContainedOrBuilderList();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  com.google.fhir.stu3.proto.ContainedResourceOrBuilder getContainedOrBuilder(
      int index);

  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  com.google.fhir.stu3.proto.Extension getExtension(int index);
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> 
      getModifierExtensionList();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  com.google.fhir.stu3.proto.Extension getModifierExtension(int index);
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  int getModifierExtensionCount();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder> 
      getModifierExtensionOrBuilderList();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getModifierExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * Unique id
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * Unique id
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   * <pre>
   * Unique id
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * Unique id
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * Unique id
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <pre>
   * Whether this group's record is in active use
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean active = 10;</code>
   * @return Whether the active field is set.
   */
  boolean hasActive();
  /**
   * <pre>
   * Whether this group's record is in active use
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean active = 10;</code>
   * @return The active.
   */
  com.google.fhir.stu3.proto.Boolean getActive();
  /**
   * <pre>
   * Whether this group's record is in active use
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean active = 10;</code>
   */
  com.google.fhir.stu3.proto.BooleanOrBuilder getActiveOrBuilder();

  /**
   * <pre>
   * person | animal | practitioner | device | medication | substance
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.GroupTypeCode type = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * person | animal | practitioner | device | medication | substance
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.GroupTypeCode type = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The type.
   */
  com.google.fhir.stu3.proto.GroupTypeCode getType();
  /**
   * <pre>
   * person | animal | practitioner | device | medication | substance
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.GroupTypeCode type = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.GroupTypeCodeOrBuilder getTypeOrBuilder();

  /**
   * <pre>
   * Descriptive or actual
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean actual = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the actual field is set.
   */
  boolean hasActual();
  /**
   * <pre>
   * Descriptive or actual
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean actual = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The actual.
   */
  com.google.fhir.stu3.proto.Boolean getActual();
  /**
   * <pre>
   * Descriptive or actual
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean actual = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.BooleanOrBuilder getActualOrBuilder();

  /**
   * <pre>
   * Kind of Group members
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept code = 13;</code>
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   * <pre>
   * Kind of Group members
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept code = 13;</code>
   * @return The code.
   */
  com.google.fhir.stu3.proto.CodeableConcept getCode();
  /**
   * <pre>
   * Kind of Group members
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept code = 13;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getCodeOrBuilder();

  /**
   * <pre>
   * Label for Group
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String name = 14;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Label for Group
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String name = 14;</code>
   * @return The name.
   */
  com.google.fhir.stu3.proto.String getName();
  /**
   * <pre>
   * Label for Group
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String name = 14;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Number of members
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.UnsignedInt quantity = 15;</code>
   * @return Whether the quantity field is set.
   */
  boolean hasQuantity();
  /**
   * <pre>
   * Number of members
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.UnsignedInt quantity = 15;</code>
   * @return The quantity.
   */
  com.google.fhir.stu3.proto.UnsignedInt getQuantity();
  /**
   * <pre>
   * Number of members
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.UnsignedInt quantity = 15;</code>
   */
  com.google.fhir.stu3.proto.UnsignedIntOrBuilder getQuantityOrBuilder();

  /**
   * <code>repeated .google.fhir.stu3.proto.Group.Characteristic characteristic = 16;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Group.Characteristic> 
      getCharacteristicList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Group.Characteristic characteristic = 16;</code>
   */
  com.google.fhir.stu3.proto.Group.Characteristic getCharacteristic(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.Group.Characteristic characteristic = 16;</code>
   */
  int getCharacteristicCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.Group.Characteristic characteristic = 16;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.Group.CharacteristicOrBuilder> 
      getCharacteristicOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Group.Characteristic characteristic = 16;</code>
   */
  com.google.fhir.stu3.proto.Group.CharacteristicOrBuilder getCharacteristicOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.stu3.proto.Group.Member member = 17;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Group.Member> 
      getMemberList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Group.Member member = 17;</code>
   */
  com.google.fhir.stu3.proto.Group.Member getMember(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.Group.Member member = 17;</code>
   */
  int getMemberCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.Group.Member member = 17;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.Group.MemberOrBuilder> 
      getMemberOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Group.Member member = 17;</code>
   */
  com.google.fhir.stu3.proto.Group.MemberOrBuilder getMemberOrBuilder(
      int index);
}
