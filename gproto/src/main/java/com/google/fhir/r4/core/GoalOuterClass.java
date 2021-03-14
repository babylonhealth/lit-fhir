// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/goal.proto

package com.google.fhir.r4.core;

public final class GoalOuterClass {
  private GoalOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Goal_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Goal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Goal_LifecycleStatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Goal_LifecycleStatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Goal_StartX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Goal_StartX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Goal_Target_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Goal_Target_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Goal_Target_DetailX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Goal_Target_DetailX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Goal_Target_DueX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Goal_Target_DueX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"proto/r4/core/resources/goal.proto\022\023go"
          + "ogle.fhir.r4.core\032\031google/protobuf/any.p"
          + "roto\032\027proto/annotations.proto\032\031proto/r4/"
          + "core/codes.proto\032\035proto/r4/core/datatype"
          + "s.proto\"\376\026\n\004Goal\022#\n\002id\030\001 \001(\0132\027.google.fh"
          + "ir.r4.core.Id\022\'\n\004meta\030\002 \001(\0132\031.google.fhi"
          + "r.r4.core.Meta\0220\n\016implicit_rules\030\003 \001(\0132\030"
          + ".google.fhir.r4.core.Uri\022+\n\010language\030\004 \001"
          + "(\0132\031.google.fhir.r4.core.Code\022,\n\004text\030\005 "
          + "\001(\0132\036.google.fhir.r4.core.Narrative\022\'\n\tc"
          + "ontained\030\006 \003(\0132\024.google.protobuf.Any\0221\n\t"
          + "extension\030\010 \003(\0132\036.google.fhir.r4.core.Ex"
          + "tension\022:\n\022modifier_extension\030\t \003(\0132\036.go"
          + "ogle.fhir.r4.core.Extension\0223\n\nidentifie"
          + "r\030\n \003(\0132\037.google.fhir.r4.core.Identifier"
          + "\022O\n\020lifecycle_status\030\013 \001(\0132-.google.fhir"
          + ".r4.core.Goal.LifecycleStatusCodeB\006\360\320\207\353\004"
          + "\001\022@\n\022achievement_status\030\014 \001(\0132$.google.f"
          + "hir.r4.core.CodeableConcept\0226\n\010category\030"
          + "\r \003(\0132$.google.fhir.r4.core.CodeableConc"
          + "ept\0226\n\010priority\030\016 \001(\0132$.google.fhir.r4.c"
          + "ore.CodeableConcept\022A\n\013description\030\017 \001(\013"
          + "2$.google.fhir.r4.core.CodeableConceptB\006"
          + "\360\320\207\353\004\001\022a\n\007subject\030\020 \001(\0132\036.google.fhir.r4"
          + ".core.ReferenceB0\360\320\207\353\004\001\362\377\374\302\006\007Patient\362\377\374\302"
          + "\006\005Group\362\377\374\302\006\014Organization\022/\n\005start\030\021 \001(\013"
          + "2 .google.fhir.r4.core.Goal.StartX\0220\n\006ta"
          + "rget\030\022 \003(\0132 .google.fhir.r4.core.Goal.Ta"
          + "rget\022.\n\013status_date\030\023 \001(\0132\031.google.fhir."
          + "r4.core.Date\0222\n\rstatus_reason\030\024 \001(\0132\033.go"
          + "ogle.fhir.r4.core.String\022~\n\014expressed_by"
          + "\030\025 \001(\0132\036.google.fhir.r4.core.ReferenceBH"
          + "\362\377\374\302\006\007Patient\362\377\374\302\006\014Practitioner\362\377\374\302\006\020Pra"
          + "ctitionerRole\362\377\374\302\006\rRelatedPerson\022\250\001\n\tadd"
          + "resses\030\026 \003(\0132\036.google.fhir.r4.core.Refer"
          + "enceBu\362\377\374\302\006\tCondition\362\377\374\302\006\013Observation\362\377"
          + "\374\302\006\023MedicationStatement\362\377\374\302\006\016NutritionOr"
          + "der\362\377\374\302\006\016ServiceRequest\362\377\374\302\006\016RiskAssessm"
          + "ent\022-\n\004note\030\027 \003(\0132\037.google.fhir.r4.core."
          + "Annotation\022:\n\014outcome_code\030\030 \003(\0132$.googl"
          + "e.fhir.r4.core.CodeableConcept\022L\n\021outcom"
          + "e_reference\030\031 \003(\0132\036.google.fhir.r4.core."
          + "ReferenceB\021\362\377\374\302\006\013Observation\032\234\002\n\023Lifecyc"
          + "leStatusCode\022A\n\005value\030\001 \001(\01622.google.fhi"
          + "r.r4.core.GoalLifecycleStatusCode.Value\022"
          + "\'\n\002id\030\002 \001(\0132\033.google.fhir.r4.core.String"
          + "\0221\n\textension\030\003 \003(\0132\036.google.fhir.r4.cor"
          + "e.Extension:f\300\237\343\266\005\001\212\371\203\262\005(http://hl7.org/"
          + "fhir/ValueSet/goal-status\232\265\216\223\006,http://hl"
          + "7.org/fhir/StructureDefinition/code\032\207\001\n\006"
          + "StartX\022)\n\004date\030\001 \001(\0132\031.google.fhir.r4.co"
          + "re.DateH\000\022@\n\020codeable_concept\030\002 \001(\0132$.go"
          + "ogle.fhir.r4.core.CodeableConceptH\000:\006\240\203\203"
          + "\350\006\001B\010\n\006choice\032\220\007\n\006Target\022\'\n\002id\030\001 \001(\0132\033.g"
          + "oogle.fhir.r4.core.String\0221\n\textension\030\002"
          + " \003(\0132\036.google.fhir.r4.core.Extension\022:\n\022"
          + "modifier_extension\030\003 \003(\0132\036.google.fhir.r"
          + "4.core.Extension\0225\n\007measure\030\004 \001(\0132$.goog"
          + "le.fhir.r4.core.CodeableConcept\0228\n\006detai"
          + "l\030\005 \001(\0132(.google.fhir.r4.core.Goal.Targe"
          + "t.DetailX\0222\n\003due\030\006 \001(\0132%.google.fhir.r4."
          + "core.Goal.Target.DueX\032\211\003\n\007DetailX\0221\n\010qua"
          + "ntity\030\001 \001(\0132\035.google.fhir.r4.core.Quanti"
          + "tyH\000\022+\n\005range\030\002 \001(\0132\032.google.fhir.r4.cor"
          + "e.RangeH\000\022@\n\020codeable_concept\030\003 \001(\0132$.go"
          + "ogle.fhir.r4.core.CodeableConceptH\000\022;\n\014s"
          + "tring_value\030\004 \001(\0132\033.google.fhir.r4.core."
          + "StringH\000R\006string\022/\n\007boolean\030\005 \001(\0132\034.goog"
          + "le.fhir.r4.core.BooleanH\000\022/\n\007integer\030\006 \001"
          + "(\0132\034.google.fhir.r4.core.IntegerH\000\022+\n\005ra"
          + "tio\030\007 \001(\0132\032.google.fhir.r4.core.RatioH\000:"
          + "\006\240\203\203\350\006\001B\010\n\006choice\032v\n\004DueX\022)\n\004date\030\001 \001(\0132"
          + "\031.google.fhir.r4.core.DateH\000\0221\n\010duration"
          + "\030\002 \001(\0132\035.google.fhir.r4.core.DurationH\000:"
          + "\006\240\203\203\350\006\001B\010\n\006choice:E\232\206\223\240\010?(detail.exists("
          + ") and measure.exists()) or detail.exists"
          + "().not():8\300\237\343\266\005\003\262\376\344\227\006,http://hl7.org/fhi"
          + "r/StructureDefinition/GoalJ\004\010\007\020\010B!\n\027com."
          + "google.fhir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.fhir.proto.Annotations.getDescriptor(),
              com.google.fhir.r4.core.Codes.getDescriptor(),
              com.google.fhir.r4.core.Datatypes.getDescriptor(),
            });
    internal_static_google_fhir_r4_core_Goal_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_Goal_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Goal_descriptor,
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
              "LifecycleStatus",
              "AchievementStatus",
              "Category",
              "Priority",
              "Description",
              "Subject",
              "Start",
              "Target",
              "StatusDate",
              "StatusReason",
              "ExpressedBy",
              "Addresses",
              "Note",
              "OutcomeCode",
              "OutcomeReference",
            });
    internal_static_google_fhir_r4_core_Goal_LifecycleStatusCode_descriptor =
        internal_static_google_fhir_r4_core_Goal_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Goal_LifecycleStatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Goal_LifecycleStatusCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_Goal_StartX_descriptor =
        internal_static_google_fhir_r4_core_Goal_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_Goal_StartX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Goal_StartX_descriptor,
            new java.lang.String[] {
              "Date", "CodeableConcept", "Choice",
            });
    internal_static_google_fhir_r4_core_Goal_Target_descriptor =
        internal_static_google_fhir_r4_core_Goal_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_Goal_Target_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Goal_Target_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Measure", "Detail", "Due",
            });
    internal_static_google_fhir_r4_core_Goal_Target_DetailX_descriptor =
        internal_static_google_fhir_r4_core_Goal_Target_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Goal_Target_DetailX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Goal_Target_DetailX_descriptor,
            new java.lang.String[] {
              "Quantity",
              "Range",
              "CodeableConcept",
              "StringValue",
              "Boolean",
              "Integer",
              "Ratio",
              "Choice",
            });
    internal_static_google_fhir_r4_core_Goal_Target_DueX_descriptor =
        internal_static_google_fhir_r4_core_Goal_Target_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_Goal_Target_DueX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Goal_Target_DueX_descriptor,
            new java.lang.String[] {
              "Date", "Duration", "Choice",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirPathMessageConstraint);
    registry.add(com.google.fhir.proto.Annotations.fhirProfileBase);
    registry.add(com.google.fhir.proto.Annotations.fhirStructureDefinitionUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirValuesetUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirVersion);
    registry.add(com.google.fhir.proto.Annotations.isChoiceType);
    registry.add(com.google.fhir.proto.Annotations.structureDefinitionKind);
    registry.add(com.google.fhir.proto.Annotations.validReferenceType);
    registry.add(com.google.fhir.proto.Annotations.validationRequirement);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.fhir.proto.Annotations.getDescriptor();
    com.google.fhir.r4.core.Codes.getDescriptor();
    com.google.fhir.r4.core.Datatypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}