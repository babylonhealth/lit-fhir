// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/uscore.proto

package com.google.fhir.r4.uscore;

public interface USCoreImplantableDeviceProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.uscore.USCoreImplantableDeviceProfile)
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
   * Instance identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * Instance identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   * <pre>
   * Instance identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * Instance identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * Instance identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <pre>
   * The reference to the definition for the device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference definition = 11 [(.google.fhir.proto.valid_reference_type) = "DeviceDefinition"];</code>
   * @return Whether the definition field is set.
   */
  boolean hasDefinition();
  /**
   * <pre>
   * The reference to the definition for the device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference definition = 11 [(.google.fhir.proto.valid_reference_type) = "DeviceDefinition"];</code>
   * @return The definition.
   */
  com.google.fhir.r4.core.Reference getDefinition();
  /**
   * <pre>
   * The reference to the definition for the device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference definition = 11 [(.google.fhir.proto.valid_reference_type) = "DeviceDefinition"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getDefinitionOrBuilder();

  /**
   * <code>.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.UdiCarrier udi_carrier = 12;</code>
   * @return Whether the udiCarrier field is set.
   */
  boolean hasUdiCarrier();
  /**
   * <code>.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.UdiCarrier udi_carrier = 12;</code>
   * @return The udiCarrier.
   */
  com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.UdiCarrier getUdiCarrier();
  /**
   * <code>.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.UdiCarrier udi_carrier = 12;</code>
   */
  com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.UdiCarrierOrBuilder getUdiCarrierOrBuilder();

  /**
   * <code>.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.StatusCode status = 13;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.StatusCode status = 13;</code>
   * @return The status.
   */
  com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.StatusCode getStatus();
  /**
   * <code>.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.StatusCode status = 13;</code>
   */
  com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * online | paused | standby | offline | not-ready | transduc-discon |
   * hw-discon | off
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept status_reason = 14;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getStatusReasonList();
  /**
   * <pre>
   * online | paused | standby | offline | not-ready | transduc-discon |
   * hw-discon | off
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept status_reason = 14;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getStatusReason(int index);
  /**
   * <pre>
   * online | paused | standby | offline | not-ready | transduc-discon |
   * hw-discon | off
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept status_reason = 14;</code>
   */
  int getStatusReasonCount();
  /**
   * <pre>
   * online | paused | standby | offline | not-ready | transduc-discon |
   * hw-discon | off
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept status_reason = 14;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getStatusReasonOrBuilderList();
  /**
   * <pre>
   * online | paused | standby | offline | not-ready | transduc-discon |
   * hw-discon | off
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept status_reason = 14;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getStatusReasonOrBuilder(
      int index);

  /**
   * <pre>
   * The distinct identification string
   * </pre>
   *
   * <code>.google.fhir.r4.core.String distinct_identifier = 15;</code>
   * @return Whether the distinctIdentifier field is set.
   */
  boolean hasDistinctIdentifier();
  /**
   * <pre>
   * The distinct identification string
   * </pre>
   *
   * <code>.google.fhir.r4.core.String distinct_identifier = 15;</code>
   * @return The distinctIdentifier.
   */
  com.google.fhir.r4.core.String getDistinctIdentifier();
  /**
   * <pre>
   * The distinct identification string
   * </pre>
   *
   * <code>.google.fhir.r4.core.String distinct_identifier = 15;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getDistinctIdentifierOrBuilder();

  /**
   * <pre>
   * Name of device manufacturer
   * </pre>
   *
   * <code>.google.fhir.r4.core.String manufacturer = 16;</code>
   * @return Whether the manufacturer field is set.
   */
  boolean hasManufacturer();
  /**
   * <pre>
   * Name of device manufacturer
   * </pre>
   *
   * <code>.google.fhir.r4.core.String manufacturer = 16;</code>
   * @return The manufacturer.
   */
  com.google.fhir.r4.core.String getManufacturer();
  /**
   * <pre>
   * Name of device manufacturer
   * </pre>
   *
   * <code>.google.fhir.r4.core.String manufacturer = 16;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getManufacturerOrBuilder();

  /**
   * <pre>
   * Date when the device was made
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime manufacture_date = 17;</code>
   * @return Whether the manufactureDate field is set.
   */
  boolean hasManufactureDate();
  /**
   * <pre>
   * Date when the device was made
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime manufacture_date = 17;</code>
   * @return The manufactureDate.
   */
  com.google.fhir.r4.core.DateTime getManufactureDate();
  /**
   * <pre>
   * Date when the device was made
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime manufacture_date = 17;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getManufactureDateOrBuilder();

  /**
   * <pre>
   * Date and time of expiry of this device (if applicable)
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime expiration_date = 18;</code>
   * @return Whether the expirationDate field is set.
   */
  boolean hasExpirationDate();
  /**
   * <pre>
   * Date and time of expiry of this device (if applicable)
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime expiration_date = 18;</code>
   * @return The expirationDate.
   */
  com.google.fhir.r4.core.DateTime getExpirationDate();
  /**
   * <pre>
   * Date and time of expiry of this device (if applicable)
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime expiration_date = 18;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getExpirationDateOrBuilder();

  /**
   * <pre>
   * Lot number of manufacture
   * </pre>
   *
   * <code>.google.fhir.r4.core.String lot_number = 19;</code>
   * @return Whether the lotNumber field is set.
   */
  boolean hasLotNumber();
  /**
   * <pre>
   * Lot number of manufacture
   * </pre>
   *
   * <code>.google.fhir.r4.core.String lot_number = 19;</code>
   * @return The lotNumber.
   */
  com.google.fhir.r4.core.String getLotNumber();
  /**
   * <pre>
   * Lot number of manufacture
   * </pre>
   *
   * <code>.google.fhir.r4.core.String lot_number = 19;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getLotNumberOrBuilder();

  /**
   * <pre>
   * Serial number assigned by the manufacturer
   * </pre>
   *
   * <code>.google.fhir.r4.core.String serial_number = 20;</code>
   * @return Whether the serialNumber field is set.
   */
  boolean hasSerialNumber();
  /**
   * <pre>
   * Serial number assigned by the manufacturer
   * </pre>
   *
   * <code>.google.fhir.r4.core.String serial_number = 20;</code>
   * @return The serialNumber.
   */
  com.google.fhir.r4.core.String getSerialNumber();
  /**
   * <pre>
   * Serial number assigned by the manufacturer
   * </pre>
   *
   * <code>.google.fhir.r4.core.String serial_number = 20;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getSerialNumberOrBuilder();

  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.DeviceName device_name = 21;</code>
   */
  java.util.List<com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.DeviceName> 
      getDeviceNameList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.DeviceName device_name = 21;</code>
   */
  com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.DeviceName getDeviceName(int index);
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.DeviceName device_name = 21;</code>
   */
  int getDeviceNameCount();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.DeviceName device_name = 21;</code>
   */
  java.util.List<? extends com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.DeviceNameOrBuilder> 
      getDeviceNameOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.DeviceName device_name = 21;</code>
   */
  com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.DeviceNameOrBuilder getDeviceNameOrBuilder(
      int index);

  /**
   * <pre>
   * The model number for the device
   * </pre>
   *
   * <code>.google.fhir.r4.core.String model_number = 22;</code>
   * @return Whether the modelNumber field is set.
   */
  boolean hasModelNumber();
  /**
   * <pre>
   * The model number for the device
   * </pre>
   *
   * <code>.google.fhir.r4.core.String model_number = 22;</code>
   * @return The modelNumber.
   */
  com.google.fhir.r4.core.String getModelNumber();
  /**
   * <pre>
   * The model number for the device
   * </pre>
   *
   * <code>.google.fhir.r4.core.String model_number = 22;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getModelNumberOrBuilder();

  /**
   * <pre>
   * The part number of the device
   * </pre>
   *
   * <code>.google.fhir.r4.core.String part_number = 23;</code>
   * @return Whether the partNumber field is set.
   */
  boolean hasPartNumber();
  /**
   * <pre>
   * The part number of the device
   * </pre>
   *
   * <code>.google.fhir.r4.core.String part_number = 23;</code>
   * @return The partNumber.
   */
  com.google.fhir.r4.core.String getPartNumber();
  /**
   * <pre>
   * The part number of the device
   * </pre>
   *
   * <code>.google.fhir.r4.core.String part_number = 23;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getPartNumberOrBuilder();

  /**
   * <pre>
   * The kind or type of device
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 24 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * The kind or type of device
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 24 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The type.
   */
  com.google.fhir.r4.core.CodeableConcept getType();
  /**
   * <pre>
   * The kind or type of device
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 24 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getTypeOrBuilder();

  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Specialization specialization = 25;</code>
   */
  java.util.List<com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Specialization> 
      getSpecializationList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Specialization specialization = 25;</code>
   */
  com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Specialization getSpecialization(int index);
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Specialization specialization = 25;</code>
   */
  int getSpecializationCount();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Specialization specialization = 25;</code>
   */
  java.util.List<? extends com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.SpecializationOrBuilder> 
      getSpecializationOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Specialization specialization = 25;</code>
   */
  com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.SpecializationOrBuilder getSpecializationOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Version version = 26;</code>
   */
  java.util.List<com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Version> 
      getVersionList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Version version = 26;</code>
   */
  com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Version getVersion(int index);
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Version version = 26;</code>
   */
  int getVersionCount();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Version version = 26;</code>
   */
  java.util.List<? extends com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.VersionOrBuilder> 
      getVersionOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Version version = 26;</code>
   */
  com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.VersionOrBuilder getVersionOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Property property = 27;</code>
   */
  java.util.List<com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Property> 
      getPropertyList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Property property = 27;</code>
   */
  com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Property getProperty(int index);
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Property property = 27;</code>
   */
  int getPropertyCount();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Property property = 27;</code>
   */
  java.util.List<? extends com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.PropertyOrBuilder> 
      getPropertyOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImplantableDeviceProfile.Property property = 27;</code>
   */
  com.google.fhir.r4.uscore.USCoreImplantableDeviceProfile.PropertyOrBuilder getPropertyOrBuilder(
      int index);

  /**
   * <pre>
   * Patient to whom Device is affixed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference patient = 28 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return Whether the patient field is set.
   */
  boolean hasPatient();
  /**
   * <pre>
   * Patient to whom Device is affixed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference patient = 28 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return The patient.
   */
  com.google.fhir.r4.core.Reference getPatient();
  /**
   * <pre>
   * Patient to whom Device is affixed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference patient = 28 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPatientOrBuilder();

  /**
   * <pre>
   * Organization responsible for device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference owner = 29 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   * <pre>
   * Organization responsible for device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference owner = 29 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return The owner.
   */
  com.google.fhir.r4.core.Reference getOwner();
  /**
   * <pre>
   * Organization responsible for device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference owner = 29 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getOwnerOrBuilder();

  /**
   * <pre>
   * Details for human/organization for support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint contact = 30;</code>
   */
  java.util.List<com.google.fhir.r4.core.ContactPoint> 
      getContactList();
  /**
   * <pre>
   * Details for human/organization for support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint contact = 30;</code>
   */
  com.google.fhir.r4.core.ContactPoint getContact(int index);
  /**
   * <pre>
   * Details for human/organization for support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint contact = 30;</code>
   */
  int getContactCount();
  /**
   * <pre>
   * Details for human/organization for support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint contact = 30;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ContactPointOrBuilder> 
      getContactOrBuilderList();
  /**
   * <pre>
   * Details for human/organization for support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint contact = 30;</code>
   */
  com.google.fhir.r4.core.ContactPointOrBuilder getContactOrBuilder(
      int index);

  /**
   * <pre>
   * Where the device is found
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference location = 31 [(.google.fhir.proto.valid_reference_type) = "Location"];</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <pre>
   * Where the device is found
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference location = 31 [(.google.fhir.proto.valid_reference_type) = "Location"];</code>
   * @return The location.
   */
  com.google.fhir.r4.core.Reference getLocation();
  /**
   * <pre>
   * Where the device is found
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference location = 31 [(.google.fhir.proto.valid_reference_type) = "Location"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * Network address to contact device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri url = 32;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * Network address to contact device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri url = 32;</code>
   * @return The url.
   */
  com.google.fhir.r4.core.Uri getUrl();
  /**
   * <pre>
   * Network address to contact device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri url = 32;</code>
   */
  com.google.fhir.r4.core.UriOrBuilder getUrlOrBuilder();

  /**
   * <pre>
   * Device notes and comments
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 33;</code>
   */
  java.util.List<com.google.fhir.r4.core.Annotation> 
      getNoteList();
  /**
   * <pre>
   * Device notes and comments
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 33;</code>
   */
  com.google.fhir.r4.core.Annotation getNote(int index);
  /**
   * <pre>
   * Device notes and comments
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 33;</code>
   */
  int getNoteCount();
  /**
   * <pre>
   * Device notes and comments
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 33;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.AnnotationOrBuilder> 
      getNoteOrBuilderList();
  /**
   * <pre>
   * Device notes and comments
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 33;</code>
   */
  com.google.fhir.r4.core.AnnotationOrBuilder getNoteOrBuilder(
      int index);

  /**
   * <pre>
   * Safety Characteristics of Device
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept safety = 34;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getSafetyList();
  /**
   * <pre>
   * Safety Characteristics of Device
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept safety = 34;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getSafety(int index);
  /**
   * <pre>
   * Safety Characteristics of Device
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept safety = 34;</code>
   */
  int getSafetyCount();
  /**
   * <pre>
   * Safety Characteristics of Device
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept safety = 34;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getSafetyOrBuilderList();
  /**
   * <pre>
   * Safety Characteristics of Device
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept safety = 34;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getSafetyOrBuilder(
      int index);

  /**
   * <pre>
   * The parent device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference parent = 35 [(.google.fhir.proto.valid_reference_type) = "Device"];</code>
   * @return Whether the parent field is set.
   */
  boolean hasParent();
  /**
   * <pre>
   * The parent device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference parent = 35 [(.google.fhir.proto.valid_reference_type) = "Device"];</code>
   * @return The parent.
   */
  com.google.fhir.r4.core.Reference getParent();
  /**
   * <pre>
   * The parent device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference parent = 35 [(.google.fhir.proto.valid_reference_type) = "Device"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getParentOrBuilder();
}
