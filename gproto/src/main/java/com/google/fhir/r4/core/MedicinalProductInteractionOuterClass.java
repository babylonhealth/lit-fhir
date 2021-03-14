// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/medicinal_product_interaction.proto

package com.google.fhir.r4.core;

public final class MedicinalProductInteractionOuterClass {
  private MedicinalProductInteractionOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicinalProductInteraction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicinalProductInteraction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicinalProductInteraction_Interactant_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicinalProductInteraction_Interactant_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicinalProductInteraction_Interactant_ItemX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicinalProductInteraction_Interactant_ItemX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n;proto/r4/core/resources/medicinal_prod"
          + "uct_interaction.proto\022\023google.fhir.r4.co"
          + "re\032\031google/protobuf/any.proto\032\027proto/ann"
          + "otations.proto\032\035proto/r4/core/datatypes."
          + "proto\"\231\013\n\033MedicinalProductInteraction\022#\n"
          + "\002id\030\001 \001(\0132\027.google.fhir.r4.core.Id\022\'\n\004me"
          + "ta\030\002 \001(\0132\031.google.fhir.r4.core.Meta\0220\n\016i"
          + "mplicit_rules\030\003 \001(\0132\030.google.fhir.r4.cor"
          + "e.Uri\022+\n\010language\030\004 \001(\0132\031.google.fhir.r4"
          + ".core.Code\022,\n\004text\030\005 \001(\0132\036.google.fhir.r"
          + "4.core.Narrative\022\'\n\tcontained\030\006 \003(\0132\024.go"
          + "ogle.protobuf.Any\0221\n\textension\030\010 \003(\0132\036.g"
          + "oogle.fhir.r4.core.Extension\022:\n\022modifier"
          + "_extension\030\t \003(\0132\036.google.fhir.r4.core.E"
          + "xtension\022f\n\007subject\030\n \003(\0132\036.google.fhir."
          + "r4.core.ReferenceB5\362\377\374\302\006\020MedicinalProduc"
          + "t\362\377\374\302\006\nMedication\362\377\374\302\006\tSubstance\0220\n\013desc"
          + "ription\030\013 \001(\0132\033.google.fhir.r4.core.Stri"
          + "ng\022Q\n\013interactant\030\014 \003(\0132<.google.fhir.r4"
          + ".core.MedicinalProductInteraction.Intera"
          + "ctant\0222\n\004type\030\r \001(\0132$.google.fhir.r4.cor"
          + "e.CodeableConcept\0224\n\006effect\030\016 \001(\0132$.goog"
          + "le.fhir.r4.core.CodeableConcept\0227\n\tincid"
          + "ence\030\017 \001(\0132$.google.fhir.r4.core.Codeabl"
          + "eConcept\0228\n\nmanagement\030\020 \001(\0132$.google.fh"
          + "ir.r4.core.CodeableConcept\032\345\003\n\013Interacta"
          + "nt\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.core.Str"
          + "ing\0221\n\textension\030\002 \003(\0132\036.google.fhir.r4."
          + "core.Extension\022:\n\022modifier_extension\030\003 \003"
          + "(\0132\036.google.fhir.r4.core.Extension\022X\n\004it"
          + "em\030\004 \001(\0132B.google.fhir.r4.core.Medicinal"
          + "ProductInteraction.Interactant.ItemXB\006\360\320"
          + "\207\353\004\001\032\343\001\n\005ItemX\022\205\001\n\treference\030\001 \001(\0132\036.goo"
          + "gle.fhir.r4.core.ReferenceBP\362\377\374\302\006\020Medici"
          + "nalProduct\362\377\374\302\006\nMedication\362\377\374\302\006\tSubstanc"
          + "e\362\377\374\302\006\025ObservationDefinitionH\000\022@\n\020codeab"
          + "le_concept\030\002 \001(\0132$.google.fhir.r4.core.C"
          + "odeableConceptH\000:\006\240\203\203\350\006\001B\010\n\006choice:O\300\237\343\266"
          + "\005\003\262\376\344\227\006Chttp://hl7.org/fhir/StructureDef"
          + "inition/MedicinalProductInteractionJ\004\010\007\020"
          + "\010B!\n\027com.google.fhir.r4.coreP\001\230\306\260\265\007\004b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.fhir.proto.Annotations.getDescriptor(),
              com.google.fhir.r4.core.Datatypes.getDescriptor(),
            });
    internal_static_google_fhir_r4_core_MedicinalProductInteraction_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_MedicinalProductInteraction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicinalProductInteraction_descriptor,
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
              "Description",
              "Interactant",
              "Type",
              "Effect",
              "Incidence",
              "Management",
            });
    internal_static_google_fhir_r4_core_MedicinalProductInteraction_Interactant_descriptor =
        internal_static_google_fhir_r4_core_MedicinalProductInteraction_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_MedicinalProductInteraction_Interactant_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicinalProductInteraction_Interactant_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Item",
            });
    internal_static_google_fhir_r4_core_MedicinalProductInteraction_Interactant_ItemX_descriptor =
        internal_static_google_fhir_r4_core_MedicinalProductInteraction_Interactant_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_MedicinalProductInteraction_Interactant_ItemX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicinalProductInteraction_Interactant_ItemX_descriptor,
            new java.lang.String[] {
              "Reference", "CodeableConcept", "Choice",
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