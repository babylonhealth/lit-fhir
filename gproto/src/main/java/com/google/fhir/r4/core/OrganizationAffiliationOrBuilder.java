// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/organization_affiliation.proto

package com.google.fhir.r4.core;

public interface OrganizationAffiliationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.OrganizationAffiliation)
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
   * Business identifiers that are specific to this role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * Business identifiers that are specific to this role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   * <pre>
   * Business identifiers that are specific to this role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * Business identifiers that are specific to this role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * Business identifiers that are specific to this role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <pre>
   * Whether this organization affiliation record is in active use
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean active = 11;</code>
   * @return Whether the active field is set.
   */
  boolean hasActive();
  /**
   * <pre>
   * Whether this organization affiliation record is in active use
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean active = 11;</code>
   * @return The active.
   */
  com.google.fhir.r4.core.Boolean getActive();
  /**
   * <pre>
   * Whether this organization affiliation record is in active use
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean active = 11;</code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getActiveOrBuilder();

  /**
   * <pre>
   * The period during which the participatingOrganization is affiliated with
   * the primary organization
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 12;</code>
   * @return Whether the period field is set.
   */
  boolean hasPeriod();
  /**
   * <pre>
   * The period during which the participatingOrganization is affiliated with
   * the primary organization
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 12;</code>
   * @return The period.
   */
  com.google.fhir.r4.core.Period getPeriod();
  /**
   * <pre>
   * The period during which the participatingOrganization is affiliated with
   * the primary organization
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 12;</code>
   */
  com.google.fhir.r4.core.PeriodOrBuilder getPeriodOrBuilder();

  /**
   * <pre>
   * Organization where the role is available
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference organization = 13 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return Whether the organization field is set.
   */
  boolean hasOrganization();
  /**
   * <pre>
   * Organization where the role is available
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference organization = 13 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return The organization.
   */
  com.google.fhir.r4.core.Reference getOrganization();
  /**
   * <pre>
   * Organization where the role is available
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference organization = 13 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getOrganizationOrBuilder();

  /**
   * <pre>
   * Organization that provides/performs the role (e.g. providing services or is
   * a member of)
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference participating_organization = 14 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return Whether the participatingOrganization field is set.
   */
  boolean hasParticipatingOrganization();
  /**
   * <pre>
   * Organization that provides/performs the role (e.g. providing services or is
   * a member of)
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference participating_organization = 14 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return The participatingOrganization.
   */
  com.google.fhir.r4.core.Reference getParticipatingOrganization();
  /**
   * <pre>
   * Organization that provides/performs the role (e.g. providing services or is
   * a member of)
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference participating_organization = 14 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getParticipatingOrganizationOrBuilder();

  /**
   * <pre>
   * Health insurance provider network in which the participatingOrganization
   * provides the role's services (if defined) at the indicated locations (if
   * defined)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference network = 15 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getNetworkList();
  /**
   * <pre>
   * Health insurance provider network in which the participatingOrganization
   * provides the role's services (if defined) at the indicated locations (if
   * defined)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference network = 15 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.r4.core.Reference getNetwork(int index);
  /**
   * <pre>
   * Health insurance provider network in which the participatingOrganization
   * provides the role's services (if defined) at the indicated locations (if
   * defined)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference network = 15 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  int getNetworkCount();
  /**
   * <pre>
   * Health insurance provider network in which the participatingOrganization
   * provides the role's services (if defined) at the indicated locations (if
   * defined)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference network = 15 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getNetworkOrBuilderList();
  /**
   * <pre>
   * Health insurance provider network in which the participatingOrganization
   * provides the role's services (if defined) at the indicated locations (if
   * defined)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference network = 15 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getNetworkOrBuilder(
      int index);

  /**
   * <pre>
   * Definition of the role the participatingOrganization plays
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept code = 16;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getCodeList();
  /**
   * <pre>
   * Definition of the role the participatingOrganization plays
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept code = 16;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getCode(int index);
  /**
   * <pre>
   * Definition of the role the participatingOrganization plays
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept code = 16;</code>
   */
  int getCodeCount();
  /**
   * <pre>
   * Definition of the role the participatingOrganization plays
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept code = 16;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getCodeOrBuilderList();
  /**
   * <pre>
   * Definition of the role the participatingOrganization plays
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept code = 16;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCodeOrBuilder(
      int index);

  /**
   * <pre>
   * Specific specialty of the participatingOrganization in the context of the
   * role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept specialty = 17;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getSpecialtyList();
  /**
   * <pre>
   * Specific specialty of the participatingOrganization in the context of the
   * role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept specialty = 17;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getSpecialty(int index);
  /**
   * <pre>
   * Specific specialty of the participatingOrganization in the context of the
   * role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept specialty = 17;</code>
   */
  int getSpecialtyCount();
  /**
   * <pre>
   * Specific specialty of the participatingOrganization in the context of the
   * role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept specialty = 17;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getSpecialtyOrBuilderList();
  /**
   * <pre>
   * Specific specialty of the participatingOrganization in the context of the
   * role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept specialty = 17;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getSpecialtyOrBuilder(
      int index);

  /**
   * <pre>
   * The location(s) at which the role occurs
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference location = 18 [(.google.fhir.proto.valid_reference_type) = "Location"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getLocationList();
  /**
   * <pre>
   * The location(s) at which the role occurs
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference location = 18 [(.google.fhir.proto.valid_reference_type) = "Location"];</code>
   */
  com.google.fhir.r4.core.Reference getLocation(int index);
  /**
   * <pre>
   * The location(s) at which the role occurs
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference location = 18 [(.google.fhir.proto.valid_reference_type) = "Location"];</code>
   */
  int getLocationCount();
  /**
   * <pre>
   * The location(s) at which the role occurs
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference location = 18 [(.google.fhir.proto.valid_reference_type) = "Location"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getLocationOrBuilderList();
  /**
   * <pre>
   * The location(s) at which the role occurs
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference location = 18 [(.google.fhir.proto.valid_reference_type) = "Location"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getLocationOrBuilder(
      int index);

  /**
   * <pre>
   * Healthcare services provided through the role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference healthcare_service = 19 [(.google.fhir.proto.valid_reference_type) = "HealthcareService"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getHealthcareServiceList();
  /**
   * <pre>
   * Healthcare services provided through the role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference healthcare_service = 19 [(.google.fhir.proto.valid_reference_type) = "HealthcareService"];</code>
   */
  com.google.fhir.r4.core.Reference getHealthcareService(int index);
  /**
   * <pre>
   * Healthcare services provided through the role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference healthcare_service = 19 [(.google.fhir.proto.valid_reference_type) = "HealthcareService"];</code>
   */
  int getHealthcareServiceCount();
  /**
   * <pre>
   * Healthcare services provided through the role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference healthcare_service = 19 [(.google.fhir.proto.valid_reference_type) = "HealthcareService"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getHealthcareServiceOrBuilderList();
  /**
   * <pre>
   * Healthcare services provided through the role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference healthcare_service = 19 [(.google.fhir.proto.valid_reference_type) = "HealthcareService"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getHealthcareServiceOrBuilder(
      int index);

  /**
   * <pre>
   * Contact details at the participatingOrganization relevant to this
   * Affiliation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 20;</code>
   */
  java.util.List<com.google.fhir.r4.core.ContactPoint> 
      getTelecomList();
  /**
   * <pre>
   * Contact details at the participatingOrganization relevant to this
   * Affiliation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 20;</code>
   */
  com.google.fhir.r4.core.ContactPoint getTelecom(int index);
  /**
   * <pre>
   * Contact details at the participatingOrganization relevant to this
   * Affiliation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 20;</code>
   */
  int getTelecomCount();
  /**
   * <pre>
   * Contact details at the participatingOrganization relevant to this
   * Affiliation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 20;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ContactPointOrBuilder> 
      getTelecomOrBuilderList();
  /**
   * <pre>
   * Contact details at the participatingOrganization relevant to this
   * Affiliation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 20;</code>
   */
  com.google.fhir.r4.core.ContactPointOrBuilder getTelecomOrBuilder(
      int index);

  /**
   * <pre>
   * Technical endpoints providing access to services operated for this role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference endpoint = 21 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getEndpointList();
  /**
   * <pre>
   * Technical endpoints providing access to services operated for this role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference endpoint = 21 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];</code>
   */
  com.google.fhir.r4.core.Reference getEndpoint(int index);
  /**
   * <pre>
   * Technical endpoints providing access to services operated for this role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference endpoint = 21 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];</code>
   */
  int getEndpointCount();
  /**
   * <pre>
   * Technical endpoints providing access to services operated for this role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference endpoint = 21 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getEndpointOrBuilderList();
  /**
   * <pre>
   * Technical endpoints providing access to services operated for this role
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference endpoint = 21 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getEndpointOrBuilder(
      int index);
}
