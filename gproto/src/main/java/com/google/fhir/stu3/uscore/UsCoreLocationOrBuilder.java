// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/uscore.proto

package com.google.fhir.stu3.uscore;

public interface UsCoreLocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.uscore.UsCoreLocation)
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
   * Unique code or number identifying the location to its users
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Unique code or number identifying the location to its users
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Unique code or number identifying the location to its users
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Unique code or number identifying the location to its users
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
   * Unique code or number identifying the location to its users
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * active | suspended | inactive
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.LocationStatusCode status = 10;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * active | suspended | inactive
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.LocationStatusCode status = 10;</code>
   *
   * @return The status.
   */
  com.google.fhir.stu3.proto.LocationStatusCode getStatus();
  /**
   *
   *
   * <pre>
   * active | suspended | inactive
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.LocationStatusCode status = 10;</code>
   */
  com.google.fhir.stu3.proto.LocationStatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * The Operational status of the location (typically only for a bed/room)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Coding operational_status = 11;</code>
   *
   * @return Whether the operationalStatus field is set.
   */
  boolean hasOperationalStatus();
  /**
   *
   *
   * <pre>
   * The Operational status of the location (typically only for a bed/room)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Coding operational_status = 11;</code>
   *
   * @return The operationalStatus.
   */
  com.google.fhir.stu3.proto.Coding getOperationalStatus();
  /**
   *
   *
   * <pre>
   * The Operational status of the location (typically only for a bed/room)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Coding operational_status = 11;</code>
   */
  com.google.fhir.stu3.proto.CodingOrBuilder getOperationalStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Name of the location as used by humans
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.String name = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name of the location as used by humans
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.String name = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The name.
   */
  com.google.fhir.stu3.proto.String getName();
  /**
   *
   *
   * <pre>
   * Name of the location as used by humans
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.String name = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getNameOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of alternate names that the location is known as, or was known as in
   * the past
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.String alias = 13;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.String> getAliasList();
  /**
   *
   *
   * <pre>
   * A list of alternate names that the location is known as, or was known as in
   * the past
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.String alias = 13;</code>
   */
  com.google.fhir.stu3.proto.String getAlias(int index);
  /**
   *
   *
   * <pre>
   * A list of alternate names that the location is known as, or was known as in
   * the past
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.String alias = 13;</code>
   */
  int getAliasCount();
  /**
   *
   *
   * <pre>
   * A list of alternate names that the location is known as, or was known as in
   * the past
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.String alias = 13;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.StringOrBuilder> getAliasOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of alternate names that the location is known as, or was known as in
   * the past
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.String alias = 13;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getAliasOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Additional details about the location that could be displayed as further
   * information to identify the location beyond its name
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 14;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * Additional details about the location that could be displayed as further
   * information to identify the location beyond its name
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 14;</code>
   *
   * @return The description.
   */
  com.google.fhir.stu3.proto.String getDescription();
  /**
   *
   *
   * <pre>
   * Additional details about the location that could be displayed as further
   * information to identify the location beyond its name
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 14;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getDescriptionOrBuilder();

  /**
   *
   *
   * <pre>
   * instance | kind
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.LocationModeCode mode = 15;</code>
   *
   * @return Whether the mode field is set.
   */
  boolean hasMode();
  /**
   *
   *
   * <pre>
   * instance | kind
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.LocationModeCode mode = 15;</code>
   *
   * @return The mode.
   */
  com.google.fhir.stu3.proto.LocationModeCode getMode();
  /**
   *
   *
   * <pre>
   * instance | kind
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.LocationModeCode mode = 15;</code>
   */
  com.google.fhir.stu3.proto.LocationModeCodeOrBuilder getModeOrBuilder();

  /**
   *
   *
   * <pre>
   * Type of function performed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 16;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * Type of function performed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 16;</code>
   *
   * @return The type.
   */
  com.google.fhir.stu3.proto.CodeableConcept getType();
  /**
   *
   *
   * <pre>
   * Type of function performed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 16;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Contact details of the location
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactPoint telecom = 17;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.ContactPoint> getTelecomList();
  /**
   *
   *
   * <pre>
   * Contact details of the location
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactPoint telecom = 17;</code>
   */
  com.google.fhir.stu3.proto.ContactPoint getTelecom(int index);
  /**
   *
   *
   * <pre>
   * Contact details of the location
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactPoint telecom = 17;</code>
   */
  int getTelecomCount();
  /**
   *
   *
   * <pre>
   * Contact details of the location
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactPoint telecom = 17;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ContactPointOrBuilder>
      getTelecomOrBuilderList();
  /**
   *
   *
   * <pre>
   * Contact details of the location
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactPoint telecom = 17;</code>
   */
  com.google.fhir.stu3.proto.ContactPointOrBuilder getTelecomOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Physical location
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Address address = 18;</code>
   *
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   *
   *
   * <pre>
   * Physical location
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Address address = 18;</code>
   *
   * @return The address.
   */
  com.google.fhir.stu3.proto.Address getAddress();
  /**
   *
   *
   * <pre>
   * Physical location
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Address address = 18;</code>
   */
  com.google.fhir.stu3.proto.AddressOrBuilder getAddressOrBuilder();

  /**
   *
   *
   * <pre>
   * Physical form of the location
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept physical_type = 19;</code>
   *
   * @return Whether the physicalType field is set.
   */
  boolean hasPhysicalType();
  /**
   *
   *
   * <pre>
   * Physical form of the location
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept physical_type = 19;</code>
   *
   * @return The physicalType.
   */
  com.google.fhir.stu3.proto.CodeableConcept getPhysicalType();
  /**
   *
   *
   * <pre>
   * Physical form of the location
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept physical_type = 19;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getPhysicalTypeOrBuilder();

  /**
   * <code>.google.fhir.stu3.uscore.UsCoreLocation.Position position = 20;</code>
   *
   * @return Whether the position field is set.
   */
  boolean hasPosition();
  /**
   * <code>.google.fhir.stu3.uscore.UsCoreLocation.Position position = 20;</code>
   *
   * @return The position.
   */
  com.google.fhir.stu3.uscore.UsCoreLocation.Position getPosition();
  /** <code>.google.fhir.stu3.uscore.UsCoreLocation.Position position = 20;</code> */
  com.google.fhir.stu3.uscore.UsCoreLocation.PositionOrBuilder getPositionOrBuilder();

  /**
   *
   *
   * <pre>
   * Organization responsible for provisioning and upkeep
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference managing_organization = 21 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return Whether the managingOrganization field is set.
   */
  boolean hasManagingOrganization();
  /**
   *
   *
   * <pre>
   * Organization responsible for provisioning and upkeep
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference managing_organization = 21 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The managingOrganization.
   */
  com.google.fhir.stu3.proto.Reference getManagingOrganization();
  /**
   *
   *
   * <pre>
   * Organization responsible for provisioning and upkeep
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference managing_organization = 21 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getManagingOrganizationOrBuilder();

  /**
   *
   *
   * <pre>
   * Another Location this one is physically part of
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference part_of = 22 [(.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   *
   * @return Whether the partOf field is set.
   */
  boolean hasPartOf();
  /**
   *
   *
   * <pre>
   * Another Location this one is physically part of
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference part_of = 22 [(.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   *
   * @return The partOf.
   */
  com.google.fhir.stu3.proto.Reference getPartOf();
  /**
   *
   *
   * <pre>
   * Another Location this one is physically part of
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference part_of = 22 [(.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getPartOfOrBuilder();

  /**
   *
   *
   * <pre>
   * Technical endpoints providing access to services operated for the location
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference endpoint = 23 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getEndpointList();
  /**
   *
   *
   * <pre>
   * Technical endpoints providing access to services operated for the location
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference endpoint = 23 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getEndpoint(int index);
  /**
   *
   *
   * <pre>
   * Technical endpoints providing access to services operated for the location
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference endpoint = 23 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];
   * </code>
   */
  int getEndpointCount();
  /**
   *
   *
   * <pre>
   * Technical endpoints providing access to services operated for the location
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference endpoint = 23 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getEndpointOrBuilderList();
  /**
   *
   *
   * <pre>
   * Technical endpoints providing access to services operated for the location
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference endpoint = 23 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getEndpointOrBuilder(int index);
}