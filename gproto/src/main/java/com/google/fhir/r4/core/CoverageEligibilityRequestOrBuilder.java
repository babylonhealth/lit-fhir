// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/coverage_eligibility_request.proto

package com.google.fhir.r4.core;

public interface CoverageEligibilityRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.CoverageEligibilityRequest)
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
   * Business Identifier for coverage eligiblity request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Business Identifier for coverage eligiblity request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Business Identifier for coverage eligiblity request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Business Identifier for coverage eligiblity request
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
   * Business Identifier for coverage eligiblity request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   * <code>
   * .google.fhir.r4.core.CoverageEligibilityRequest.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>
   * .google.fhir.r4.core.CoverageEligibilityRequest.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.r4.core.CoverageEligibilityRequest.StatusCode getStatus();
  /**
   * <code>
   * .google.fhir.r4.core.CoverageEligibilityRequest.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.CoverageEligibilityRequest.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Desired processing priority
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept priority = 12;</code>
   *
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   *
   *
   * <pre>
   * Desired processing priority
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept priority = 12;</code>
   *
   * @return The priority.
   */
  com.google.fhir.r4.core.CodeableConcept getPriority();
  /**
   *
   *
   * <pre>
   * Desired processing priority
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept priority = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getPriorityOrBuilder();

  /**
   * <code>
   * repeated .google.fhir.r4.core.CoverageEligibilityRequest.PurposeCode purpose = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.CoverageEligibilityRequest.PurposeCode> getPurposeList();
  /**
   * <code>
   * repeated .google.fhir.r4.core.CoverageEligibilityRequest.PurposeCode purpose = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.CoverageEligibilityRequest.PurposeCode getPurpose(int index);
  /**
   * <code>
   * repeated .google.fhir.r4.core.CoverageEligibilityRequest.PurposeCode purpose = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  int getPurposeCount();
  /**
   * <code>
   * repeated .google.fhir.r4.core.CoverageEligibilityRequest.PurposeCode purpose = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CoverageEligibilityRequest.PurposeCodeOrBuilder>
      getPurposeOrBuilderList();
  /**
   * <code>
   * repeated .google.fhir.r4.core.CoverageEligibilityRequest.PurposeCode purpose = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.CoverageEligibilityRequest.PurposeCodeOrBuilder getPurposeOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Intended recipient of products and services
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference patient = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return Whether the patient field is set.
   */
  boolean hasPatient();
  /**
   *
   *
   * <pre>
   * Intended recipient of products and services
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference patient = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return The patient.
   */
  com.google.fhir.r4.core.Reference getPatient();
  /**
   *
   *
   * <pre>
   * Intended recipient of products and services
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference patient = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPatientOrBuilder();

  /**
   * <code>.google.fhir.r4.core.CoverageEligibilityRequest.ServicedX serviced = 15;</code>
   *
   * @return Whether the serviced field is set.
   */
  boolean hasServiced();
  /**
   * <code>.google.fhir.r4.core.CoverageEligibilityRequest.ServicedX serviced = 15;</code>
   *
   * @return The serviced.
   */
  com.google.fhir.r4.core.CoverageEligibilityRequest.ServicedX getServiced();
  /** <code>.google.fhir.r4.core.CoverageEligibilityRequest.ServicedX serviced = 15;</code> */
  com.google.fhir.r4.core.CoverageEligibilityRequest.ServicedXOrBuilder getServicedOrBuilder();

  /**
   *
   *
   * <pre>
   * Creation date
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.DateTime created = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the created field is set.
   */
  boolean hasCreated();
  /**
   *
   *
   * <pre>
   * Creation date
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.DateTime created = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The created.
   */
  com.google.fhir.r4.core.DateTime getCreated();
  /**
   *
   *
   * <pre>
   * Creation date
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.DateTime created = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getCreatedOrBuilder();

  /**
   *
   *
   * <pre>
   * Author
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference enterer = 17 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];
   * </code>
   *
   * @return Whether the enterer field is set.
   */
  boolean hasEnterer();
  /**
   *
   *
   * <pre>
   * Author
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference enterer = 17 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];
   * </code>
   *
   * @return The enterer.
   */
  com.google.fhir.r4.core.Reference getEnterer();
  /**
   *
   *
   * <pre>
   * Author
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference enterer = 17 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getEntererOrBuilder();

  /**
   *
   *
   * <pre>
   * Party responsible for the request
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference provider = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return Whether the provider field is set.
   */
  boolean hasProvider();
  /**
   *
   *
   * <pre>
   * Party responsible for the request
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference provider = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The provider.
   */
  com.google.fhir.r4.core.Reference getProvider();
  /**
   *
   *
   * <pre>
   * Party responsible for the request
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference provider = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getProviderOrBuilder();

  /**
   *
   *
   * <pre>
   * Coverage issuer
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference insurer = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return Whether the insurer field is set.
   */
  boolean hasInsurer();
  /**
   *
   *
   * <pre>
   * Coverage issuer
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference insurer = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The insurer.
   */
  com.google.fhir.r4.core.Reference getInsurer();
  /**
   *
   *
   * <pre>
   * Coverage issuer
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference insurer = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getInsurerOrBuilder();

  /**
   *
   *
   * <pre>
   * Servicing facility
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference facility = 20 [(.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   *
   * @return Whether the facility field is set.
   */
  boolean hasFacility();
  /**
   *
   *
   * <pre>
   * Servicing facility
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference facility = 20 [(.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   *
   * @return The facility.
   */
  com.google.fhir.r4.core.Reference getFacility();
  /**
   *
   *
   * <pre>
   * Servicing facility
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference facility = 20 [(.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getFacilityOrBuilder();

  /**
   * <code>
   * repeated .google.fhir.r4.core.CoverageEligibilityRequest.SupportingInformation supporting_info = 21;
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.CoverageEligibilityRequest.SupportingInformation>
      getSupportingInfoList();
  /**
   * <code>
   * repeated .google.fhir.r4.core.CoverageEligibilityRequest.SupportingInformation supporting_info = 21;
   * </code>
   */
  com.google.fhir.r4.core.CoverageEligibilityRequest.SupportingInformation getSupportingInfo(
      int index);
  /**
   * <code>
   * repeated .google.fhir.r4.core.CoverageEligibilityRequest.SupportingInformation supporting_info = 21;
   * </code>
   */
  int getSupportingInfoCount();
  /**
   * <code>
   * repeated .google.fhir.r4.core.CoverageEligibilityRequest.SupportingInformation supporting_info = 21;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.fhir.r4.core.CoverageEligibilityRequest.SupportingInformationOrBuilder>
      getSupportingInfoOrBuilderList();
  /**
   * <code>
   * repeated .google.fhir.r4.core.CoverageEligibilityRequest.SupportingInformation supporting_info = 21;
   * </code>
   */
  com.google.fhir.r4.core.CoverageEligibilityRequest.SupportingInformationOrBuilder
      getSupportingInfoOrBuilder(int index);

  /**
   * <code>repeated .google.fhir.r4.core.CoverageEligibilityRequest.Insurance insurance = 22;</code>
   */
  java.util.List<com.google.fhir.r4.core.CoverageEligibilityRequest.Insurance> getInsuranceList();
  /**
   * <code>repeated .google.fhir.r4.core.CoverageEligibilityRequest.Insurance insurance = 22;</code>
   */
  com.google.fhir.r4.core.CoverageEligibilityRequest.Insurance getInsurance(int index);
  /**
   * <code>repeated .google.fhir.r4.core.CoverageEligibilityRequest.Insurance insurance = 22;</code>
   */
  int getInsuranceCount();
  /**
   * <code>repeated .google.fhir.r4.core.CoverageEligibilityRequest.Insurance insurance = 22;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CoverageEligibilityRequest.InsuranceOrBuilder>
      getInsuranceOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.CoverageEligibilityRequest.Insurance insurance = 22;</code>
   */
  com.google.fhir.r4.core.CoverageEligibilityRequest.InsuranceOrBuilder getInsuranceOrBuilder(
      int index);

  /** <code>repeated .google.fhir.r4.core.CoverageEligibilityRequest.Details item = 23;</code> */
  java.util.List<com.google.fhir.r4.core.CoverageEligibilityRequest.Details> getItemList();
  /** <code>repeated .google.fhir.r4.core.CoverageEligibilityRequest.Details item = 23;</code> */
  com.google.fhir.r4.core.CoverageEligibilityRequest.Details getItem(int index);
  /** <code>repeated .google.fhir.r4.core.CoverageEligibilityRequest.Details item = 23;</code> */
  int getItemCount();
  /** <code>repeated .google.fhir.r4.core.CoverageEligibilityRequest.Details item = 23;</code> */
  java.util.List<? extends com.google.fhir.r4.core.CoverageEligibilityRequest.DetailsOrBuilder>
      getItemOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.CoverageEligibilityRequest.Details item = 23;</code> */
  com.google.fhir.r4.core.CoverageEligibilityRequest.DetailsOrBuilder getItemOrBuilder(int index);
}
