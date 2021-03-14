// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/uscore.proto

package com.google.fhir.r4.uscore;

public interface USCoreOrganizationProfileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.uscore.USCoreOrganizationProfile)
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
   * Identifies this organization  across multiple systems
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Identifies this organization  across multiple systems
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Identifies this organization  across multiple systems
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Identifies this organization  across multiple systems
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
   * Identifies this organization  across multiple systems
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Whether the organization's record is still in active use
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Boolean active = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the active field is set.
   */
  boolean hasActive();
  /**
   *
   *
   * <pre>
   * Whether the organization's record is still in active use
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Boolean active = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The active.
   */
  com.google.fhir.r4.core.Boolean getActive();
  /**
   *
   *
   * <pre>
   * Whether the organization's record is still in active use
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Boolean active = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getActiveOrBuilder();

  /**
   *
   *
   * <pre>
   * Kind of organization
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept type = 12;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getTypeList();
  /**
   *
   *
   * <pre>
   * Kind of organization
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept type = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getType(int index);
  /**
   *
   *
   * <pre>
   * Kind of organization
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept type = 12;</code>
   */
  int getTypeCount();
  /**
   *
   *
   * <pre>
   * Kind of organization
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept type = 12;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> getTypeOrBuilderList();
  /**
   *
   *
   * <pre>
   * Kind of organization
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept type = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getTypeOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Name used for the organization
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String name = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name used for the organization
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String name = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The name.
   */
  com.google.fhir.r4.core.String getName();
  /**
   *
   *
   * <pre>
   * Name used for the organization
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String name = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.StringOrBuilder getNameOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of alternate names that the organization is known as, or was known
   * as in the past
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String alias = 14;</code>
   */
  java.util.List<com.google.fhir.r4.core.String> getAliasList();
  /**
   *
   *
   * <pre>
   * A list of alternate names that the organization is known as, or was known
   * as in the past
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String alias = 14;</code>
   */
  com.google.fhir.r4.core.String getAlias(int index);
  /**
   *
   *
   * <pre>
   * A list of alternate names that the organization is known as, or was known
   * as in the past
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String alias = 14;</code>
   */
  int getAliasCount();
  /**
   *
   *
   * <pre>
   * A list of alternate names that the organization is known as, or was known
   * as in the past
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String alias = 14;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.StringOrBuilder> getAliasOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of alternate names that the organization is known as, or was known
   * as in the past
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String alias = 14;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getAliasOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A contact detail for the organization
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.ContactPoint telecom = 15 [(.google.fhir.proto.fhir_path_constraint) = "where(use = &#92;'home&#92;').empty()"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.ContactPoint> getTelecomList();
  /**
   *
   *
   * <pre>
   * A contact detail for the organization
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.ContactPoint telecom = 15 [(.google.fhir.proto.fhir_path_constraint) = "where(use = &#92;'home&#92;').empty()"];
   * </code>
   */
  com.google.fhir.r4.core.ContactPoint getTelecom(int index);
  /**
   *
   *
   * <pre>
   * A contact detail for the organization
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.ContactPoint telecom = 15 [(.google.fhir.proto.fhir_path_constraint) = "where(use = &#92;'home&#92;').empty()"];
   * </code>
   */
  int getTelecomCount();
  /**
   *
   *
   * <pre>
   * A contact detail for the organization
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.ContactPoint telecom = 15 [(.google.fhir.proto.fhir_path_constraint) = "where(use = &#92;'home&#92;').empty()"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ContactPointOrBuilder> getTelecomOrBuilderList();
  /**
   *
   *
   * <pre>
   * A contact detail for the organization
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.ContactPoint telecom = 15 [(.google.fhir.proto.fhir_path_constraint) = "where(use = &#92;'home&#92;').empty()"];
   * </code>
   */
  com.google.fhir.r4.core.ContactPointOrBuilder getTelecomOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * An address for the organization
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Address address = 16 [(.google.fhir.proto.fhir_path_constraint) = "where(use = &#92;'home&#92;').empty()"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Address> getAddressList();
  /**
   *
   *
   * <pre>
   * An address for the organization
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Address address = 16 [(.google.fhir.proto.fhir_path_constraint) = "where(use = &#92;'home&#92;').empty()"];
   * </code>
   */
  com.google.fhir.r4.core.Address getAddress(int index);
  /**
   *
   *
   * <pre>
   * An address for the organization
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Address address = 16 [(.google.fhir.proto.fhir_path_constraint) = "where(use = &#92;'home&#92;').empty()"];
   * </code>
   */
  int getAddressCount();
  /**
   *
   *
   * <pre>
   * An address for the organization
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Address address = 16 [(.google.fhir.proto.fhir_path_constraint) = "where(use = &#92;'home&#92;').empty()"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.AddressOrBuilder> getAddressOrBuilderList();
  /**
   *
   *
   * <pre>
   * An address for the organization
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Address address = 16 [(.google.fhir.proto.fhir_path_constraint) = "where(use = &#92;'home&#92;').empty()"];
   * </code>
   */
  com.google.fhir.r4.core.AddressOrBuilder getAddressOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The organization of which this organization forms a part
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference part_of = 17 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return Whether the partOf field is set.
   */
  boolean hasPartOf();
  /**
   *
   *
   * <pre>
   * The organization of which this organization forms a part
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference part_of = 17 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The partOf.
   */
  com.google.fhir.r4.core.Reference getPartOf();
  /**
   *
   *
   * <pre>
   * The organization of which this organization forms a part
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference part_of = 17 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPartOfOrBuilder();

  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreOrganizationProfile.Contact contact = 18;</code>
   */
  java.util.List<com.google.fhir.r4.uscore.USCoreOrganizationProfile.Contact> getContactList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreOrganizationProfile.Contact contact = 18;</code>
   */
  com.google.fhir.r4.uscore.USCoreOrganizationProfile.Contact getContact(int index);
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreOrganizationProfile.Contact contact = 18;</code>
   */
  int getContactCount();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreOrganizationProfile.Contact contact = 18;</code>
   */
  java.util.List<? extends com.google.fhir.r4.uscore.USCoreOrganizationProfile.ContactOrBuilder>
      getContactOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreOrganizationProfile.Contact contact = 18;</code>
   */
  com.google.fhir.r4.uscore.USCoreOrganizationProfile.ContactOrBuilder getContactOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Technical endpoints providing access to services operated for the
   * organization
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference endpoint = 19 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getEndpointList();
  /**
   *
   *
   * <pre>
   * Technical endpoints providing access to services operated for the
   * organization
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference endpoint = 19 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getEndpoint(int index);
  /**
   *
   *
   * <pre>
   * Technical endpoints providing access to services operated for the
   * organization
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference endpoint = 19 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];
   * </code>
   */
  int getEndpointCount();
  /**
   *
   *
   * <pre>
   * Technical endpoints providing access to services operated for the
   * organization
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference endpoint = 19 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getEndpointOrBuilderList();
  /**
   *
   *
   * <pre>
   * Technical endpoints providing access to services operated for the
   * organization
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference endpoint = 19 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getEndpointOrBuilder(int index);
}
