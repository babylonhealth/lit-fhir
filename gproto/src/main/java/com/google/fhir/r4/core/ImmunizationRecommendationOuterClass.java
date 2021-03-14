// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/immunization_recommendation.proto

package com.google.fhir.r4.core;

public final class ImmunizationRecommendationOuterClass {
  private ImmunizationRecommendationOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ImmunizationRecommendation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ImmunizationRecommendation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_DateCriterion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_DateCriterion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_DoseNumberX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_DoseNumberX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_SeriesDosesX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_SeriesDosesX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9proto/r4/core/resources/immunization_r"
          + "ecommendation.proto\022\023google.fhir.r4.core"
          + "\032\031google/protobuf/any.proto\032\027proto/annot"
          + "ations.proto\032\035proto/r4/core/datatypes.pr"
          + "oto\"\212\024\n\032ImmunizationRecommendation\022#\n\002id"
          + "\030\001 \001(\0132\027.google.fhir.r4.core.Id\022\'\n\004meta\030"
          + "\002 \001(\0132\031.google.fhir.r4.core.Meta\0220\n\016impl"
          + "icit_rules\030\003 \001(\0132\030.google.fhir.r4.core.U"
          + "ri\022+\n\010language\030\004 \001(\0132\031.google.fhir.r4.co"
          + "re.Code\022,\n\004text\030\005 \001(\0132\036.google.fhir.r4.c"
          + "ore.Narrative\022\'\n\tcontained\030\006 \003(\0132\024.googl"
          + "e.protobuf.Any\0221\n\textension\030\010 \003(\0132\036.goog"
          + "le.fhir.r4.core.Extension\022:\n\022modifier_ex"
          + "tension\030\t \003(\0132\036.google.fhir.r4.core.Exte"
          + "nsion\0223\n\nidentifier\030\n \003(\0132\037.google.fhir."
          + "r4.core.Identifier\022D\n\007patient\030\013 \001(\0132\036.go"
          + "ogle.fhir.r4.core.ReferenceB\023\360\320\207\353\004\001\362\377\374\302\006"
          + "\007Patient\0223\n\004date\030\014 \001(\0132\035.google.fhir.r4."
          + "core.DateTimeB\006\360\320\207\353\004\001\022E\n\tauthority\030\r \001(\013"
          + "2\036.google.fhir.r4.core.ReferenceB\022\362\377\374\302\006\014"
          + "Organization\022^\n\016recommendation\030\016 \003(\0132>.g"
          + "oogle.fhir.r4.core.ImmunizationRecommend"
          + "ation.RecommendationB\006\360\320\207\353\004\001\032\313\r\n\016Recomme"
          + "ndation\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.cor"
          + "e.String\0221\n\textension\030\002 \003(\0132\036.google.fhi"
          + "r.r4.core.Extension\022:\n\022modifier_extensio"
          + "n\030\003 \003(\0132\036.google.fhir.r4.core.Extension\022"
          + ":\n\014vaccine_code\030\004 \003(\0132$.google.fhir.r4.c"
          + "ore.CodeableConcept\022<\n\016target_disease\030\005 "
          + "\001(\0132$.google.fhir.r4.core.CodeableConcep"
          + "t\022J\n\034contraindicated_vaccine_code\030\006 \003(\0132"
          + "$.google.fhir.r4.core.CodeableConcept\022E\n"
          + "\017forecast_status\030\007 \001(\0132$.google.fhir.r4."
          + "core.CodeableConceptB\006\360\320\207\353\004\001\022=\n\017forecast"
          + "_reason\030\010 \003(\0132$.google.fhir.r4.core.Code"
          + "ableConcept\022d\n\016date_criterion\030\t \003(\0132L.go"
          + "ogle.fhir.r4.core.ImmunizationRecommenda"
          + "tion.Recommendation.DateCriterion\0220\n\013des"
          + "cription\030\n \001(\0132\033.google.fhir.r4.core.Str"
          + "ing\022+\n\006series\030\013 \001(\0132\033.google.fhir.r4.cor"
          + "e.String\022_\n\013dose_number\030\014 \001(\0132J.google.f"
          + "hir.r4.core.ImmunizationRecommendation.R"
          + "ecommendation.DoseNumberX\022a\n\014series_dose"
          + "s\030\r \001(\0132K.google.fhir.r4.core.Immunizati"
          + "onRecommendation.Recommendation.SeriesDo"
          + "sesX\022o\n\027supporting_immunization\030\016 \003(\0132\036."
          + "google.fhir.r4.core.ReferenceB.\362\377\374\302\006\014Imm"
          + "unization\362\377\374\302\006\026ImmunizationEvaluation\022V\n"
          + "\036supporting_patient_information\030\017 \003(\0132\036."
          + "google.fhir.r4.core.ReferenceB\016\362\377\374\302\006\010Res"
          + "ource\032\231\002\n\rDateCriterion\022\'\n\002id\030\001 \001(\0132\033.go"
          + "ogle.fhir.r4.core.String\0221\n\textension\030\002 "
          + "\003(\0132\036.google.fhir.r4.core.Extension\022:\n\022m"
          + "odifier_extension\030\003 \003(\0132\036.google.fhir.r4"
          + ".core.Extension\022:\n\004code\030\004 \001(\0132$.google.f"
          + "hir.r4.core.CodeableConceptB\006\360\320\207\353\004\001\0224\n\005v"
          + "alue\030\005 \001(\0132\035.google.fhir.r4.core.DateTim"
          + "eB\006\360\320\207\353\004\001\032\226\001\n\013DoseNumberX\0228\n\014positive_in"
          + "t\030\001 \001(\0132 .google.fhir.r4.core.PositiveIn"
          + "tH\000\022;\n\014string_value\030\002 \001(\0132\033.google.fhir."
          + "r4.core.StringH\000R\006string:\006\240\203\203\350\006\001B\010\n\006choi"
          + "ce\032\227\001\n\014SeriesDosesX\0228\n\014positive_int\030\001 \001("
          + "\0132 .google.fhir.r4.core.PositiveIntH\000\022;\n"
          + "\014string_value\030\002 \001(\0132\033.google.fhir.r4.cor"
          + "e.StringH\000R\006string:\006\240\203\203\350\006\001B\010\n\006choice:4\232\206"
          + "\223\240\010.vaccineCode.exists() or targetDiseas"
          + "e.exists():N\300\237\343\266\005\003\262\376\344\227\006Bhttp://hl7.org/f"
          + "hir/StructureDefinition/ImmunizationReco"
          + "mmendationJ\004\010\007\020\010B!\n\027com.google.fhir.r4.c"
          + "oreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.fhir.proto.Annotations.getDescriptor(),
              com.google.fhir.r4.core.Datatypes.getDescriptor(),
            });
    internal_static_google_fhir_r4_core_ImmunizationRecommendation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_ImmunizationRecommendation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ImmunizationRecommendation_descriptor,
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
              "Patient",
              "Date",
              "Authority",
              "Recommendation",
            });
    internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_descriptor =
        internal_static_google_fhir_r4_core_ImmunizationRecommendation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_descriptor,
            new java.lang.String[] {
              "Id",
              "Extension",
              "ModifierExtension",
              "VaccineCode",
              "TargetDisease",
              "ContraindicatedVaccineCode",
              "ForecastStatus",
              "ForecastReason",
              "DateCriterion",
              "Description",
              "Series",
              "DoseNumber",
              "SeriesDoses",
              "SupportingImmunization",
              "SupportingPatientInformation",
            });
    internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_DateCriterion_descriptor =
        internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_DateCriterion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_DateCriterion_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Code", "Value",
            });
    internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_DoseNumberX_descriptor =
        internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_DoseNumberX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_DoseNumberX_descriptor,
            new java.lang.String[] {
              "PositiveInt", "StringValue", "Choice",
            });
    internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_SeriesDosesX_descriptor =
        internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_SeriesDosesX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ImmunizationRecommendation_Recommendation_SeriesDosesX_descriptor,
            new java.lang.String[] {
              "PositiveInt", "StringValue", "Choice",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirPathMessageConstraint);
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
