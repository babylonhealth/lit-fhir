// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/medicinal_product_contraindication.proto

package com.google.fhir.r4.core;

public final class MedicinalProductContraindicationOuterClass {
  private MedicinalProductContraindicationOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicinalProductContraindication_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicinalProductContraindication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicinalProductContraindication_OtherTherapy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicinalProductContraindication_OtherTherapy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicinalProductContraindication_OtherTherapy_MedicationX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicinalProductContraindication_OtherTherapy_MedicationX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n@proto/r4/core/resources/medicinal_prod"
          + "uct_contraindication.proto\022\023google.fhir."
          + "r4.core\032\031google/protobuf/any.proto\032\027prot"
          + "o/annotations.proto\032\035proto/r4/core/datat"
          + "ypes.proto\"\277\014\n MedicinalProductContraind"
          + "ication\022#\n\002id\030\001 \001(\0132\027.google.fhir.r4.cor"
          + "e.Id\022\'\n\004meta\030\002 \001(\0132\031.google.fhir.r4.core"
          + ".Meta\0220\n\016implicit_rules\030\003 \001(\0132\030.google.f"
          + "hir.r4.core.Uri\022+\n\010language\030\004 \001(\0132\031.goog"
          + "le.fhir.r4.core.Code\022,\n\004text\030\005 \001(\0132\036.goo"
          + "gle.fhir.r4.core.Narrative\022\'\n\tcontained\030"
          + "\006 \003(\0132\024.google.protobuf.Any\0221\n\textension"
          + "\030\010 \003(\0132\036.google.fhir.r4.core.Extension\022:"
          + "\n\022modifier_extension\030\t \003(\0132\036.google.fhir"
          + ".r4.core.Extension\022W\n\007subject\030\n \003(\0132\036.go"
          + "ogle.fhir.r4.core.ReferenceB&\362\377\374\302\006\020Medic"
          + "inalProduct\362\377\374\302\006\nMedication\0225\n\007disease\030\013"
          + " \001(\0132$.google.fhir.r4.core.CodeableConce"
          + "pt\022<\n\016disease_status\030\014 \001(\0132$.google.fhir"
          + ".r4.core.CodeableConcept\0229\n\013comorbidity\030"
          + "\r \003(\0132$.google.fhir.r4.core.CodeableConc"
          + "ept\022`\n\026therapeutic_indication\030\016 \003(\0132\036.go"
          + "ogle.fhir.r4.core.ReferenceB \362\377\374\302\006\032Medic"
          + "inalProductIndication\022Y\n\rother_therapy\030\017"
          + " \003(\0132B.google.fhir.r4.core.MedicinalProd"
          + "uctContraindication.OtherTherapy\0223\n\npopu"
          + "lation\030\020 \003(\0132\037.google.fhir.r4.core.Popul"
          + "ation\032\320\004\n\014OtherTherapy\022\'\n\002id\030\001 \001(\0132\033.goo"
          + "gle.fhir.r4.core.String\0221\n\textension\030\002 \003"
          + "(\0132\036.google.fhir.r4.core.Extension\022:\n\022mo"
          + "difier_extension\030\003 \003(\0132\036.google.fhir.r4."
          + "core.Extension\022O\n\031therapy_relationship_t"
          + "ype\030\004 \001(\0132$.google.fhir.r4.core.Codeable"
          + "ConceptB\006\360\320\207\353\004\001\022j\n\nmedication\030\005 \001(\0132N.go"
          + "ogle.fhir.r4.core.MedicinalProductContra"
          + "indication.OtherTherapy.MedicationXB\006\360\320\207"
          + "\353\004\001\032\352\001\n\013MedicationX\022@\n\020codeable_concept\030"
          + "\001 \001(\0132$.google.fhir.r4.core.CodeableConc"
          + "eptH\000\022\206\001\n\treference\030\002 \001(\0132\036.google.fhir."
          + "r4.core.ReferenceBQ\362\377\374\302\006\020MedicinalProduc"
          + "t\362\377\374\302\006\nMedication\362\377\374\302\006\tSubstance\362\377\374\302\006\026Su"
          + "bstanceSpecificationH\000:\006\240\203\203\350\006\001B\010\n\006choice"
          + ":T\300\237\343\266\005\003\262\376\344\227\006Hhttp://hl7.org/fhir/Struct"
          + "ureDefinition/MedicinalProductContraindi"
          + "cationJ\004\010\007\020\010B!\n\027com.google.fhir.r4.coreP"
          + "\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.fhir.proto.Annotations.getDescriptor(),
              com.google.fhir.r4.core.Datatypes.getDescriptor(),
            });
    internal_static_google_fhir_r4_core_MedicinalProductContraindication_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_MedicinalProductContraindication_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicinalProductContraindication_descriptor,
            new java.lang.String[] {
              "Id",
              "Meta",
              "ImplicitRules",
              "Language",
              "Text",
              "Contained",
              "Extension",
              "ModifierExtension",
              "Subject",
              "Disease",
              "DiseaseStatus",
              "Comorbidity",
              "TherapeuticIndication",
              "OtherTherapy",
              "Population",
            });
    internal_static_google_fhir_r4_core_MedicinalProductContraindication_OtherTherapy_descriptor =
        internal_static_google_fhir_r4_core_MedicinalProductContraindication_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_MedicinalProductContraindication_OtherTherapy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicinalProductContraindication_OtherTherapy_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "TherapyRelationshipType", "Medication",
            });
    internal_static_google_fhir_r4_core_MedicinalProductContraindication_OtherTherapy_MedicationX_descriptor =
        internal_static_google_fhir_r4_core_MedicinalProductContraindication_OtherTherapy_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_MedicinalProductContraindication_OtherTherapy_MedicationX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicinalProductContraindication_OtherTherapy_MedicationX_descriptor,
            new java.lang.String[] {
              "CodeableConcept", "Reference", "Choice",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirStructureDefinitionUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirVersion);
    registry.add(com.google.fhir.proto.Annotations.isChoiceType);
    registry.add(com.google.fhir.proto.Annotations.structureDefinitionKind);
    registry.add(com.google.fhir.proto.Annotations.validReferenceType);
    registry.add(com.google.fhir.proto.Annotations.validationRequirement);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.fhir.proto.Annotations.getDescriptor();
    com.google.fhir.r4.core.Datatypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}