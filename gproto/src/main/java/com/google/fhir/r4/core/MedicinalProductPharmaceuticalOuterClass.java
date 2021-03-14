// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/medicinal_product_pharmaceutical.proto

package com.google.fhir.r4.core;

public final class MedicinalProductPharmaceuticalOuterClass {
  private MedicinalProductPharmaceuticalOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_Characteristics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_Characteristics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_RouteOfAdministration_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_RouteOfAdministration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_WithdrawalPeriod_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_WithdrawalPeriod_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n>proto/r4/core/resources/medicinal_prod"
          + "uct_pharmaceutical.proto\022\023google.fhir.r4"
          + ".core\032\031google/protobuf/any.proto\032\027proto/"
          + "annotations.proto\032\035proto/r4/core/datatyp"
          + "es.proto\"\220\025\n\036MedicinalProductPharmaceuti"
          + "cal\022#\n\002id\030\001 \001(\0132\027.google.fhir.r4.core.Id"
          + "\022\'\n\004meta\030\002 \001(\0132\031.google.fhir.r4.core.Met"
          + "a\0220\n\016implicit_rules\030\003 \001(\0132\030.google.fhir."
          + "r4.core.Uri\022+\n\010language\030\004 \001(\0132\031.google.f"
          + "hir.r4.core.Code\022,\n\004text\030\005 \001(\0132\036.google."
          + "fhir.r4.core.Narrative\022\'\n\tcontained\030\006 \003("
          + "\0132\024.google.protobuf.Any\0221\n\textension\030\010 \003"
          + "(\0132\036.google.fhir.r4.core.Extension\022:\n\022mo"
          + "difier_extension\030\t \003(\0132\036.google.fhir.r4."
          + "core.Extension\0223\n\nidentifier\030\n \003(\0132\037.goo"
          + "gle.fhir.r4.core.Identifier\022M\n\027administr"
          + "able_dose_form\030\013 \001(\0132$.google.fhir.r4.co"
          + "re.CodeableConceptB\006\360\320\207\353\004\001\022B\n\024unit_of_pr"
          + "esentation\030\014 \001(\0132$.google.fhir.r4.core.C"
          + "odeableConcept\022T\n\ningredient\030\r \003(\0132\036.goo"
          + "gle.fhir.r4.core.ReferenceB \362\377\374\302\006\032Medici"
          + "nalProductIngredient\022F\n\006device\030\016 \003(\0132\036.g"
          + "oogle.fhir.r4.core.ReferenceB\026\362\377\374\302\006\020Devi"
          + "ceDefinition\022\\\n\017characteristics\030\017 \003(\0132C."
          + "google.fhir.r4.core.MedicinalProductPhar"
          + "maceutical.Characteristics\022r\n\027route_of_a"
          + "dministration\030\020 \003(\0132I.google.fhir.r4.cor"
          + "e.MedicinalProductPharmaceutical.RouteOf"
          + "AdministrationB\006\360\320\207\353\004\001\032\233\002\n\017Characteristi"
          + "cs\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.core.Str"
          + "ing\0221\n\textension\030\002 \003(\0132\036.google.fhir.r4."
          + "core.Extension\022:\n\022modifier_extension\030\003 \003"
          + "(\0132\036.google.fhir.r4.core.Extension\022:\n\004co"
          + "de\030\004 \001(\0132$.google.fhir.r4.core.CodeableC"
          + "onceptB\006\360\320\207\353\004\001\0224\n\006status\030\005 \001(\0132$.google."
          + "fhir.r4.core.CodeableConcept\032\312\n\n\025RouteOf"
          + "Administration\022\'\n\002id\030\001 \001(\0132\033.google.fhir"
          + ".r4.core.String\0221\n\textension\030\002 \003(\0132\036.goo"
          + "gle.fhir.r4.core.Extension\022:\n\022modifier_e"
          + "xtension\030\003 \003(\0132\036.google.fhir.r4.core.Ext"
          + "ension\022:\n\004code\030\004 \001(\0132$.google.fhir.r4.co"
          + "re.CodeableConceptB\006\360\320\207\353\004\001\0221\n\nfirst_dose"
          + "\030\005 \001(\0132\035.google.fhir.r4.core.Quantity\0226\n"
          + "\017max_single_dose\030\006 \001(\0132\035.google.fhir.r4."
          + "core.Quantity\0227\n\020max_dose_per_day\030\007 \001(\0132"
          + "\035.google.fhir.r4.core.Quantity\022A\n\035max_do"
          + "se_per_treatment_period\030\010 \001(\0132\032.google.f"
          + "hir.r4.core.Ratio\022;\n\024max_treatment_perio"
          + "d\030\t \001(\0132\035.google.fhir.r4.core.Duration\022o"
          + "\n\016target_species\030\n \003(\0132W.google.fhir.r4."
          + "core.MedicinalProductPharmaceutical.Rout"
          + "eOfAdministration.TargetSpecies\032\307\005\n\rTarg"
          + "etSpecies\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.c"
          + "ore.String\0221\n\textension\030\002 \003(\0132\036.google.f"
          + "hir.r4.core.Extension\022:\n\022modifier_extens"
          + "ion\030\003 \003(\0132\036.google.fhir.r4.core.Extensio"
          + "n\022:\n\004code\030\004 \001(\0132$.google.fhir.r4.core.Co"
          + "deableConceptB\006\360\320\207\353\004\001\022\203\001\n\021withdrawal_per"
          + "iod\030\005 \003(\0132h.google.fhir.r4.core.Medicina"
          + "lProductPharmaceutical.RouteOfAdministra"
          + "tion.TargetSpecies.WithdrawalPeriod\032\333\002\n\020"
          + "WithdrawalPeriod\022\'\n\002id\030\001 \001(\0132\033.google.fh"
          + "ir.r4.core.String\0221\n\textension\030\002 \003(\0132\036.g"
          + "oogle.fhir.r4.core.Extension\022:\n\022modifier"
          + "_extension\030\003 \003(\0132\036.google.fhir.r4.core.E"
          + "xtension\022<\n\006tissue\030\004 \001(\0132$.google.fhir.r"
          + "4.core.CodeableConceptB\006\360\320\207\353\004\001\0224\n\005value\030"
          + "\005 \001(\0132\035.google.fhir.r4.core.QuantityB\006\360\320"
          + "\207\353\004\001\022;\n\026supporting_information\030\006 \001(\0132\033.g"
          + "oogle.fhir.r4.core.String:R\300\237\343\266\005\003\262\376\344\227\006Fh"
          + "ttp://hl7.org/fhir/StructureDefinition/M"
          + "edicinalProductPharmaceuticalJ\004\010\007\020\010B!\n\027c"
          + "om.google.fhir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.fhir.proto.Annotations.getDescriptor(),
              com.google.fhir.r4.core.Datatypes.getDescriptor(),
            });
    internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_descriptor,
            new java.lang.String[] {
              "Id",
              "Meta",
              "ImplicitRules",
              "Language",
              "Text",
              "Contained",
              "Extension",
              "ModifierExtension",
              "Identifier",
              "AdministrableDoseForm",
              "UnitOfPresentation",
              "Ingredient",
              "Device",
              "Characteristics",
              "RouteOfAdministration",
            });
    internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_Characteristics_descriptor =
        internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_Characteristics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_Characteristics_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Code", "Status",
            });
    internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_RouteOfAdministration_descriptor =
        internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_RouteOfAdministration_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_RouteOfAdministration_descriptor,
            new java.lang.String[] {
              "Id",
              "Extension",
              "ModifierExtension",
              "Code",
              "FirstDose",
              "MaxSingleDose",
              "MaxDosePerDay",
              "MaxDosePerTreatmentPeriod",
              "MaxTreatmentPeriod",
              "TargetSpecies",
            });
    internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_descriptor =
        internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_RouteOfAdministration_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Code", "WithdrawalPeriod",
            });
    internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_WithdrawalPeriod_descriptor =
        internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_WithdrawalPeriod_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_WithdrawalPeriod_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Tissue", "Value", "SupportingInformation",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirStructureDefinitionUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirVersion);
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
