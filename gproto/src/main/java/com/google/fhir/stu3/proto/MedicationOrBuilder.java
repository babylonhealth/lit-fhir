// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface MedicationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.Medication)
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
   * Codes that identify this medication
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept code = 9;</code>
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   * <pre>
   * Codes that identify this medication
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept code = 9;</code>
   * @return The code.
   */
  com.google.fhir.stu3.proto.CodeableConcept getCode();
  /**
   * <pre>
   * Codes that identify this medication
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept code = 9;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getCodeOrBuilder();

  /**
   * <pre>
   * active | inactive | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.MedicationStatusCode status = 10;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * active | inactive | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.MedicationStatusCode status = 10;</code>
   * @return The status.
   */
  com.google.fhir.stu3.proto.MedicationStatusCode getStatus();
  /**
   * <pre>
   * active | inactive | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.MedicationStatusCode status = 10;</code>
   */
  com.google.fhir.stu3.proto.MedicationStatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * True if a brand
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean is_brand = 11;</code>
   * @return Whether the isBrand field is set.
   */
  boolean hasIsBrand();
  /**
   * <pre>
   * True if a brand
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean is_brand = 11;</code>
   * @return The isBrand.
   */
  com.google.fhir.stu3.proto.Boolean getIsBrand();
  /**
   * <pre>
   * True if a brand
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean is_brand = 11;</code>
   */
  com.google.fhir.stu3.proto.BooleanOrBuilder getIsBrandOrBuilder();

  /**
   * <pre>
   * True if medication does not require a prescription
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean is_over_the_counter = 12;</code>
   * @return Whether the isOverTheCounter field is set.
   */
  boolean hasIsOverTheCounter();
  /**
   * <pre>
   * True if medication does not require a prescription
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean is_over_the_counter = 12;</code>
   * @return The isOverTheCounter.
   */
  com.google.fhir.stu3.proto.Boolean getIsOverTheCounter();
  /**
   * <pre>
   * True if medication does not require a prescription
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean is_over_the_counter = 12;</code>
   */
  com.google.fhir.stu3.proto.BooleanOrBuilder getIsOverTheCounterOrBuilder();

  /**
   * <pre>
   * Manufacturer of the item
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference manufacturer = 13 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return Whether the manufacturer field is set.
   */
  boolean hasManufacturer();
  /**
   * <pre>
   * Manufacturer of the item
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference manufacturer = 13 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return The manufacturer.
   */
  com.google.fhir.stu3.proto.Reference getManufacturer();
  /**
   * <pre>
   * Manufacturer of the item
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference manufacturer = 13 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getManufacturerOrBuilder();

  /**
   * <pre>
   * powder | tablets | capsule +
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept form = 14;</code>
   * @return Whether the form field is set.
   */
  boolean hasForm();
  /**
   * <pre>
   * powder | tablets | capsule +
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept form = 14;</code>
   * @return The form.
   */
  com.google.fhir.stu3.proto.CodeableConcept getForm();
  /**
   * <pre>
   * powder | tablets | capsule +
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept form = 14;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getFormOrBuilder();

  /**
   * <code>repeated .google.fhir.stu3.proto.Medication.Ingredient ingredient = 15;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Medication.Ingredient> 
      getIngredientList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Medication.Ingredient ingredient = 15;</code>
   */
  com.google.fhir.stu3.proto.Medication.Ingredient getIngredient(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.Medication.Ingredient ingredient = 15;</code>
   */
  int getIngredientCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.Medication.Ingredient ingredient = 15;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.Medication.IngredientOrBuilder> 
      getIngredientOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Medication.Ingredient ingredient = 15;</code>
   */
  com.google.fhir.stu3.proto.Medication.IngredientOrBuilder getIngredientOrBuilder(
      int index);

  /**
   * <code>.google.fhir.stu3.proto.Medication.Package package_value = 16 [json_name = "package"];</code>
   * @return Whether the packageValue field is set.
   */
  boolean hasPackageValue();
  /**
   * <code>.google.fhir.stu3.proto.Medication.Package package_value = 16 [json_name = "package"];</code>
   * @return The packageValue.
   */
  com.google.fhir.stu3.proto.Medication.Package getPackageValue();
  /**
   * <code>.google.fhir.stu3.proto.Medication.Package package_value = 16 [json_name = "package"];</code>
   */
  com.google.fhir.stu3.proto.Medication.PackageOrBuilder getPackageValueOrBuilder();

  /**
   * <pre>
   * Picture of the medication
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Attachment image = 17;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Attachment> 
      getImageList();
  /**
   * <pre>
   * Picture of the medication
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Attachment image = 17;</code>
   */
  com.google.fhir.stu3.proto.Attachment getImage(int index);
  /**
   * <pre>
   * Picture of the medication
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Attachment image = 17;</code>
   */
  int getImageCount();
  /**
   * <pre>
   * Picture of the medication
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Attachment image = 17;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.AttachmentOrBuilder> 
      getImageOrBuilderList();
  /**
   * <pre>
   * Picture of the medication
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Attachment image = 17;</code>
   */
  com.google.fhir.stu3.proto.AttachmentOrBuilder getImageOrBuilder(
      int index);
}
