// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/medicinal_product_contraindication.proto

package com.google.fhir.r4.core;

public interface MedicinalProductContraindicationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.MedicinalProductContraindication)
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
   * The medication for which this is an indication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference subject = 10 [(.google.fhir.proto.valid_reference_type) = "MedicinalProduct", (.google.fhir.proto.valid_reference_type) = "Medication"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getSubjectList();
  /**
   *
   *
   * <pre>
   * The medication for which this is an indication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference subject = 10 [(.google.fhir.proto.valid_reference_type) = "MedicinalProduct", (.google.fhir.proto.valid_reference_type) = "Medication"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getSubject(int index);
  /**
   *
   *
   * <pre>
   * The medication for which this is an indication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference subject = 10 [(.google.fhir.proto.valid_reference_type) = "MedicinalProduct", (.google.fhir.proto.valid_reference_type) = "Medication"];
   * </code>
   */
  int getSubjectCount();
  /**
   *
   *
   * <pre>
   * The medication for which this is an indication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference subject = 10 [(.google.fhir.proto.valid_reference_type) = "MedicinalProduct", (.google.fhir.proto.valid_reference_type) = "Medication"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getSubjectOrBuilderList();
  /**
   *
   *
   * <pre>
   * The medication for which this is an indication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference subject = 10 [(.google.fhir.proto.valid_reference_type) = "MedicinalProduct", (.google.fhir.proto.valid_reference_type) = "Medication"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSubjectOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The disease, symptom or procedure for the contraindication
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept disease = 11;</code>
   *
   * @return Whether the disease field is set.
   */
  boolean hasDisease();
  /**
   *
   *
   * <pre>
   * The disease, symptom or procedure for the contraindication
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept disease = 11;</code>
   *
   * @return The disease.
   */
  com.google.fhir.r4.core.CodeableConcept getDisease();
  /**
   *
   *
   * <pre>
   * The disease, symptom or procedure for the contraindication
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept disease = 11;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getDiseaseOrBuilder();

  /**
   *
   *
   * <pre>
   * The status of the disease or symptom for the contraindication
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept disease_status = 12;</code>
   *
   * @return Whether the diseaseStatus field is set.
   */
  boolean hasDiseaseStatus();
  /**
   *
   *
   * <pre>
   * The status of the disease or symptom for the contraindication
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept disease_status = 12;</code>
   *
   * @return The diseaseStatus.
   */
  com.google.fhir.r4.core.CodeableConcept getDiseaseStatus();
  /**
   *
   *
   * <pre>
   * The status of the disease or symptom for the contraindication
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept disease_status = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getDiseaseStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * A comorbidity (concurrent condition) or coinfection
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept comorbidity = 13;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getComorbidityList();
  /**
   *
   *
   * <pre>
   * A comorbidity (concurrent condition) or coinfection
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept comorbidity = 13;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getComorbidity(int index);
  /**
   *
   *
   * <pre>
   * A comorbidity (concurrent condition) or coinfection
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept comorbidity = 13;</code>
   */
  int getComorbidityCount();
  /**
   *
   *
   * <pre>
   * A comorbidity (concurrent condition) or coinfection
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept comorbidity = 13;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getComorbidityOrBuilderList();
  /**
   *
   *
   * <pre>
   * A comorbidity (concurrent condition) or coinfection
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept comorbidity = 13;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getComorbidityOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Information about the use of the medicinal product in relation to other
   * therapies as part of the indication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference therapeutic_indication = 14 [(.google.fhir.proto.valid_reference_type) = "MedicinalProductIndication"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getTherapeuticIndicationList();
  /**
   *
   *
   * <pre>
   * Information about the use of the medicinal product in relation to other
   * therapies as part of the indication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference therapeutic_indication = 14 [(.google.fhir.proto.valid_reference_type) = "MedicinalProductIndication"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getTherapeuticIndication(int index);
  /**
   *
   *
   * <pre>
   * Information about the use of the medicinal product in relation to other
   * therapies as part of the indication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference therapeutic_indication = 14 [(.google.fhir.proto.valid_reference_type) = "MedicinalProductIndication"];
   * </code>
   */
  int getTherapeuticIndicationCount();
  /**
   *
   *
   * <pre>
   * Information about the use of the medicinal product in relation to other
   * therapies as part of the indication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference therapeutic_indication = 14 [(.google.fhir.proto.valid_reference_type) = "MedicinalProductIndication"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getTherapeuticIndicationOrBuilderList();
  /**
   *
   *
   * <pre>
   * Information about the use of the medicinal product in relation to other
   * therapies as part of the indication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference therapeutic_indication = 14 [(.google.fhir.proto.valid_reference_type) = "MedicinalProductIndication"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getTherapeuticIndicationOrBuilder(int index);

  /**
   * <code>
   * repeated .google.fhir.r4.core.MedicinalProductContraindication.OtherTherapy other_therapy = 15;
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.MedicinalProductContraindication.OtherTherapy>
      getOtherTherapyList();
  /**
   * <code>
   * repeated .google.fhir.r4.core.MedicinalProductContraindication.OtherTherapy other_therapy = 15;
   * </code>
   */
  com.google.fhir.r4.core.MedicinalProductContraindication.OtherTherapy getOtherTherapy(int index);
  /**
   * <code>
   * repeated .google.fhir.r4.core.MedicinalProductContraindication.OtherTherapy other_therapy = 15;
   * </code>
   */
  int getOtherTherapyCount();
  /**
   * <code>
   * repeated .google.fhir.r4.core.MedicinalProductContraindication.OtherTherapy other_therapy = 15;
   * </code>
   */
  java.util.List<
          ? extends com.google.fhir.r4.core.MedicinalProductContraindication.OtherTherapyOrBuilder>
      getOtherTherapyOrBuilderList();
  /**
   * <code>
   * repeated .google.fhir.r4.core.MedicinalProductContraindication.OtherTherapy other_therapy = 15;
   * </code>
   */
  com.google.fhir.r4.core.MedicinalProductContraindication.OtherTherapyOrBuilder
      getOtherTherapyOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The population group to which this applies
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Population population = 16;</code>
   */
  java.util.List<com.google.fhir.r4.core.Population> getPopulationList();
  /**
   *
   *
   * <pre>
   * The population group to which this applies
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Population population = 16;</code>
   */
  com.google.fhir.r4.core.Population getPopulation(int index);
  /**
   *
   *
   * <pre>
   * The population group to which this applies
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Population population = 16;</code>
   */
  int getPopulationCount();
  /**
   *
   *
   * <pre>
   * The population group to which this applies
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Population population = 16;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.PopulationOrBuilder>
      getPopulationOrBuilderList();
  /**
   *
   *
   * <pre>
   * The population group to which this applies
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Population population = 16;</code>
   */
  com.google.fhir.r4.core.PopulationOrBuilder getPopulationOrBuilder(int index);
}
