// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/insurance_plan.proto

package com.google.fhir.r4.core;

public interface InsurancePlanOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.InsurancePlan)
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
   * Business Identifier for Product
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Business Identifier for Product
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Business Identifier for Product
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Business Identifier for Product
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
   * Business Identifier for Product
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   * <code>.google.fhir.r4.core.InsurancePlan.StatusCode status = 11;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.google.fhir.r4.core.InsurancePlan.StatusCode status = 11;</code>
   *
   * @return The status.
   */
  com.google.fhir.r4.core.InsurancePlan.StatusCode getStatus();
  /** <code>.google.fhir.r4.core.InsurancePlan.StatusCode status = 11;</code> */
  com.google.fhir.r4.core.InsurancePlan.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Kind of product
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept type = 12;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getTypeList();
  /**
   *
   *
   * <pre>
   * Kind of product
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept type = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getType(int index);
  /**
   *
   *
   * <pre>
   * Kind of product
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept type = 12;</code>
   */
  int getTypeCount();
  /**
   *
   *
   * <pre>
   * Kind of product
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept type = 12;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> getTypeOrBuilderList();
  /**
   *
   *
   * <pre>
   * Kind of product
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept type = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getTypeOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Official name
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 13;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Official name
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 13;</code>
   *
   * @return The name.
   */
  com.google.fhir.r4.core.String getName();
  /**
   *
   *
   * <pre>
   * Official name
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 13;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getNameOrBuilder();

  /**
   *
   *
   * <pre>
   * Alternate names
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String alias = 14;</code>
   */
  java.util.List<com.google.fhir.r4.core.String> getAliasList();
  /**
   *
   *
   * <pre>
   * Alternate names
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String alias = 14;</code>
   */
  com.google.fhir.r4.core.String getAlias(int index);
  /**
   *
   *
   * <pre>
   * Alternate names
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String alias = 14;</code>
   */
  int getAliasCount();
  /**
   *
   *
   * <pre>
   * Alternate names
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String alias = 14;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.StringOrBuilder> getAliasOrBuilderList();
  /**
   *
   *
   * <pre>
   * Alternate names
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String alias = 14;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getAliasOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * When the product is available
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 15;</code>
   *
   * @return Whether the period field is set.
   */
  boolean hasPeriod();
  /**
   *
   *
   * <pre>
   * When the product is available
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 15;</code>
   *
   * @return The period.
   */
  com.google.fhir.r4.core.Period getPeriod();
  /**
   *
   *
   * <pre>
   * When the product is available
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 15;</code>
   */
  com.google.fhir.r4.core.PeriodOrBuilder getPeriodOrBuilder();

  /**
   *
   *
   * <pre>
   * Plan issuer
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference owned_by = 16 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return Whether the ownedBy field is set.
   */
  boolean hasOwnedBy();
  /**
   *
   *
   * <pre>
   * Plan issuer
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference owned_by = 16 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The ownedBy.
   */
  com.google.fhir.r4.core.Reference getOwnedBy();
  /**
   *
   *
   * <pre>
   * Plan issuer
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference owned_by = 16 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getOwnedByOrBuilder();

  /**
   *
   *
   * <pre>
   * Product administrator
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference administered_by = 17 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return Whether the administeredBy field is set.
   */
  boolean hasAdministeredBy();
  /**
   *
   *
   * <pre>
   * Product administrator
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference administered_by = 17 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The administeredBy.
   */
  com.google.fhir.r4.core.Reference getAdministeredBy();
  /**
   *
   *
   * <pre>
   * Product administrator
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference administered_by = 17 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getAdministeredByOrBuilder();

  /**
   *
   *
   * <pre>
   * Where product applies
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference coverage_area = 18 [(.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getCoverageAreaList();
  /**
   *
   *
   * <pre>
   * Where product applies
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference coverage_area = 18 [(.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getCoverageArea(int index);
  /**
   *
   *
   * <pre>
   * Where product applies
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference coverage_area = 18 [(.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   */
  int getCoverageAreaCount();
  /**
   *
   *
   * <pre>
   * Where product applies
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference coverage_area = 18 [(.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getCoverageAreaOrBuilderList();
  /**
   *
   *
   * <pre>
   * Where product applies
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference coverage_area = 18 [(.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getCoverageAreaOrBuilder(int index);

  /** <code>repeated .google.fhir.r4.core.InsurancePlan.Contact contact = 19;</code> */
  java.util.List<com.google.fhir.r4.core.InsurancePlan.Contact> getContactList();
  /** <code>repeated .google.fhir.r4.core.InsurancePlan.Contact contact = 19;</code> */
  com.google.fhir.r4.core.InsurancePlan.Contact getContact(int index);
  /** <code>repeated .google.fhir.r4.core.InsurancePlan.Contact contact = 19;</code> */
  int getContactCount();
  /** <code>repeated .google.fhir.r4.core.InsurancePlan.Contact contact = 19;</code> */
  java.util.List<? extends com.google.fhir.r4.core.InsurancePlan.ContactOrBuilder>
      getContactOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.InsurancePlan.Contact contact = 19;</code> */
  com.google.fhir.r4.core.InsurancePlan.ContactOrBuilder getContactOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Technical endpoint
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference endpoint = 20 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getEndpointList();
  /**
   *
   *
   * <pre>
   * Technical endpoint
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference endpoint = 20 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getEndpoint(int index);
  /**
   *
   *
   * <pre>
   * Technical endpoint
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference endpoint = 20 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];
   * </code>
   */
  int getEndpointCount();
  /**
   *
   *
   * <pre>
   * Technical endpoint
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference endpoint = 20 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getEndpointOrBuilderList();
  /**
   *
   *
   * <pre>
   * Technical endpoint
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference endpoint = 20 [(.google.fhir.proto.valid_reference_type) = "Endpoint"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getEndpointOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * What networks are Included
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference network = 21 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getNetworkList();
  /**
   *
   *
   * <pre>
   * What networks are Included
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference network = 21 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getNetwork(int index);
  /**
   *
   *
   * <pre>
   * What networks are Included
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference network = 21 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  int getNetworkCount();
  /**
   *
   *
   * <pre>
   * What networks are Included
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference network = 21 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getNetworkOrBuilderList();
  /**
   *
   *
   * <pre>
   * What networks are Included
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference network = 21 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getNetworkOrBuilder(int index);

  /** <code>repeated .google.fhir.r4.core.InsurancePlan.Coverage coverage = 22;</code> */
  java.util.List<com.google.fhir.r4.core.InsurancePlan.Coverage> getCoverageList();
  /** <code>repeated .google.fhir.r4.core.InsurancePlan.Coverage coverage = 22;</code> */
  com.google.fhir.r4.core.InsurancePlan.Coverage getCoverage(int index);
  /** <code>repeated .google.fhir.r4.core.InsurancePlan.Coverage coverage = 22;</code> */
  int getCoverageCount();
  /** <code>repeated .google.fhir.r4.core.InsurancePlan.Coverage coverage = 22;</code> */
  java.util.List<? extends com.google.fhir.r4.core.InsurancePlan.CoverageOrBuilder>
      getCoverageOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.InsurancePlan.Coverage coverage = 22;</code> */
  com.google.fhir.r4.core.InsurancePlan.CoverageOrBuilder getCoverageOrBuilder(int index);

  /** <code>repeated .google.fhir.r4.core.InsurancePlan.Plan plan = 23;</code> */
  java.util.List<com.google.fhir.r4.core.InsurancePlan.Plan> getPlanList();
  /** <code>repeated .google.fhir.r4.core.InsurancePlan.Plan plan = 23;</code> */
  com.google.fhir.r4.core.InsurancePlan.Plan getPlan(int index);
  /** <code>repeated .google.fhir.r4.core.InsurancePlan.Plan plan = 23;</code> */
  int getPlanCount();
  /** <code>repeated .google.fhir.r4.core.InsurancePlan.Plan plan = 23;</code> */
  java.util.List<? extends com.google.fhir.r4.core.InsurancePlan.PlanOrBuilder>
      getPlanOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.InsurancePlan.Plan plan = 23;</code> */
  com.google.fhir.r4.core.InsurancePlan.PlanOrBuilder getPlanOrBuilder(int index);
}
