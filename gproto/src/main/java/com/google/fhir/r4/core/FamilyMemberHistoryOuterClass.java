// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/family_member_history.proto

package com.google.fhir.r4.core;

public final class FamilyMemberHistoryOuterClass {
  private FamilyMemberHistoryOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_FamilyMemberHistory_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_FamilyMemberHistory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_FamilyMemberHistory_StatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_FamilyMemberHistory_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_FamilyMemberHistory_BornX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_FamilyMemberHistory_BornX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_FamilyMemberHistory_AgeX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_FamilyMemberHistory_AgeX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_FamilyMemberHistory_DeceasedX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_FamilyMemberHistory_DeceasedX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_FamilyMemberHistory_Condition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_FamilyMemberHistory_Condition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_FamilyMemberHistory_Condition_OnsetX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_FamilyMemberHistory_Condition_OnsetX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3proto/r4/core/resources/family_member_"
          + "history.proto\022\023google.fhir.r4.core\032\031goog"
          + "le/protobuf/any.proto\032\027proto/annotations"
          + ".proto\032\031proto/r4/core/codes.proto\032\035proto"
          + "/r4/core/datatypes.proto\"\212\032\n\023FamilyMembe"
          + "rHistory\022#\n\002id\030\001 \001(\0132\027.google.fhir.r4.co"
          + "re.Id\022\'\n\004meta\030\002 \001(\0132\031.google.fhir.r4.cor"
          + "e.Meta\0220\n\016implicit_rules\030\003 \001(\0132\030.google."
          + "fhir.r4.core.Uri\022+\n\010language\030\004 \001(\0132\031.goo"
          + "gle.fhir.r4.core.Code\022,\n\004text\030\005 \001(\0132\036.go"
          + "ogle.fhir.r4.core.Narrative\022\'\n\tcontained"
          + "\030\006 \003(\0132\024.google.protobuf.Any\0221\n\textensio"
          + "n\030\010 \003(\0132\036.google.fhir.r4.core.Extension\022"
          + ":\n\022modifier_extension\030\t \003(\0132\036.google.fhi"
          + "r.r4.core.Extension\0223\n\nidentifier\030\n \003(\0132"
          + "\037.google.fhir.r4.core.Identifier\022>\n\026inst"
          + "antiates_canonical\030\013 \003(\0132\036.google.fhir.r"
          + "4.core.Canonical\0222\n\020instantiates_uri\030\014 \003"
          + "(\0132\030.google.fhir.r4.core.Uri\022K\n\006status\030\r"
          + " \001(\01323.google.fhir.r4.core.FamilyMemberH"
          + "istory.StatusCodeB\006\360\320\207\353\004\001\022@\n\022data_absent"
          + "_reason\030\016 \001(\0132$.google.fhir.r4.core.Code"
          + "ableConcept\022D\n\007patient\030\017 \001(\0132\036.google.fh"
          + "ir.r4.core.ReferenceB\023\360\320\207\353\004\001\362\377\374\302\006\007Patien"
          + "t\022+\n\004date\030\020 \001(\0132\035.google.fhir.r4.core.Da"
          + "teTime\022)\n\004name\030\021 \001(\0132\033.google.fhir.r4.co"
          + "re.String\022B\n\014relationship\030\022 \001(\0132$.google"
          + ".fhir.r4.core.CodeableConceptB\006\360\320\207\353\004\001\0221\n"
          + "\003sex\030\023 \001(\0132$.google.fhir.r4.core.Codeabl"
          + "eConcept\022<\n\004born\030\024 \001(\0132..google.fhir.r4."
          + "core.FamilyMemberHistory.BornX\022:\n\003age\030\025 "
          + "\001(\0132-.google.fhir.r4.core.FamilyMemberHi"
          + "story.AgeX\0223\n\restimated_age\030\026 \001(\0132\034.goog"
          + "le.fhir.r4.core.Boolean\022D\n\010deceased\030\027 \001("
          + "\01322.google.fhir.r4.core.FamilyMemberHist"
          + "ory.DeceasedX\0229\n\013reason_code\030\030 \003(\0132$.goo"
          + "gle.fhir.r4.core.CodeableConcept\022\273\001\n\020rea"
          + "son_reference\030\031 \003(\0132\036.google.fhir.r4.cor"
          + "e.ReferenceB\200\001\362\377\374\302\006\tCondition\362\377\374\302\006\013Obser"
          + "vation\362\377\374\302\006\022AllergyIntolerance\362\377\374\302\006\025Ques"
          + "tionnaireResponse\362\377\374\302\006\020DiagnosticReport\362"
          + "\377\374\302\006\021DocumentReference\022-\n\004note\030\032 \003(\0132\037.g"
          + "oogle.fhir.r4.core.Annotation\022E\n\tconditi"
          + "on\030\033 \003(\01322.google.fhir.r4.core.FamilyMem"
          + "berHistory.Condition\032\226\002\n\nStatusCode\022A\n\005v"
          + "alue\030\001 \001(\01622.google.fhir.r4.core.FamilyH"
          + "istoryStatusCode.Value\022\'\n\002id\030\002 \001(\0132\033.goo"
          + "gle.fhir.r4.core.String\0221\n\textension\030\003 \003"
          + "(\0132\036.google.fhir.r4.core.Extension:i\300\237\343\266"
          + "\005\001\212\371\203\262\005+http://hl7.org/fhir/ValueSet/his"
          + "tory-status\232\265\216\223\006,http://hl7.org/fhir/Str"
          + "uctureDefinition/code\032\260\001\n\005BornX\022-\n\006perio"
          + "d\030\001 \001(\0132\033.google.fhir.r4.core.PeriodH\000\022)"
          + "\n\004date\030\002 \001(\0132\031.google.fhir.r4.core.DateH"
          + "\000\022;\n\014string_value\030\003 \001(\0132\033.google.fhir.r4"
          + ".core.StringH\000R\006string:\006\240\203\203\350\006\001B\010\n\006choice"
          + "\032\253\001\n\004AgeX\022\'\n\003age\030\001 \001(\0132\030.google.fhir.r4."
          + "core.AgeH\000\022+\n\005range\030\002 \001(\0132\032.google.fhir."
          + "r4.core.RangeH\000\022;\n\014string_value\030\003 \001(\0132\033."
          + "google.fhir.r4.core.StringH\000R\006string:\006\240\203"
          + "\203\350\006\001B\010\n\006choice\032\214\002\n\tDeceasedX\022/\n\007boolean\030"
          + "\001 \001(\0132\034.google.fhir.r4.core.BooleanH\000\022\'\n"
          + "\003age\030\002 \001(\0132\030.google.fhir.r4.core.AgeH\000\022+"
          + "\n\005range\030\003 \001(\0132\032.google.fhir.r4.core.Rang"
          + "eH\000\022)\n\004date\030\004 \001(\0132\031.google.fhir.r4.core."
          + "DateH\000\022;\n\014string_value\030\005 \001(\0132\033.google.fh"
          + "ir.r4.core.StringH\000R\006string:\006\240\203\203\350\006\001B\010\n\006c"
          + "hoice\032\252\005\n\tCondition\022\'\n\002id\030\001 \001(\0132\033.google"
          + ".fhir.r4.core.String\0221\n\textension\030\002 \003(\0132"
          + "\036.google.fhir.r4.core.Extension\022:\n\022modif"
          + "ier_extension\030\003 \003(\0132\036.google.fhir.r4.cor"
          + "e.Extension\022:\n\004code\030\004 \001(\0132$.google.fhir."
          + "r4.core.CodeableConceptB\006\360\320\207\353\004\001\0225\n\007outco"
          + "me\030\005 \001(\0132$.google.fhir.r4.core.CodeableC"
          + "oncept\022:\n\024contributed_to_death\030\006 \001(\0132\034.g"
          + "oogle.fhir.r4.core.Boolean\022H\n\005onset\030\007 \001("
          + "\01329.google.fhir.r4.core.FamilyMemberHist"
          + "ory.Condition.OnsetX\022-\n\004note\030\010 \003(\0132\037.goo"
          + "gle.fhir.r4.core.Annotation\032\334\001\n\006OnsetX\022\'"
          + "\n\003age\030\001 \001(\0132\030.google.fhir.r4.core.AgeH\000\022"
          + "+\n\005range\030\002 \001(\0132\032.google.fhir.r4.core.Ran"
          + "geH\000\022-\n\006period\030\003 \001(\0132\033.google.fhir.r4.co"
          + "re.PeriodH\000\022;\n\014string_value\030\004 \001(\0132\033.goog"
          + "le.fhir.r4.core.StringH\000R\006string:\006\240\203\203\350\006\001"
          + "B\010\n\006choice:\222\001\300\237\343\266\005\003\262\376\344\227\006;http://hl7.org/"
          + "fhir/StructureDefinition/FamilyMemberHis"
          + "tory\232\206\223\240\010\033age.empty() or born.empty()\232\206\223"
          + "\240\010$age.exists() or estimatedAge.empty()J"
          + "\004\010\007\020\010B!\n\027com.google.fhir.r4.coreP\001\230\306\260\265\007\004"
          + "b\006proto3"
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
    internal_static_google_fhir_r4_core_FamilyMemberHistory_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_FamilyMemberHistory_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_FamilyMemberHistory_descriptor,
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
              "InstantiatesCanonical",
              "InstantiatesUri",
              "Status",
              "DataAbsentReason",
              "Patient",
              "Date",
              "Name",
              "Relationship",
              "Sex",
              "Born",
              "Age",
              "EstimatedAge",
              "Deceased",
              "ReasonCode",
              "ReasonReference",
              "Note",
              "Condition",
            });
    internal_static_google_fhir_r4_core_FamilyMemberHistory_StatusCode_descriptor =
        internal_static_google_fhir_r4_core_FamilyMemberHistory_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_FamilyMemberHistory_StatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_FamilyMemberHistory_StatusCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_FamilyMemberHistory_BornX_descriptor =
        internal_static_google_fhir_r4_core_FamilyMemberHistory_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_FamilyMemberHistory_BornX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_FamilyMemberHistory_BornX_descriptor,
            new java.lang.String[] {
              "Period", "Date", "StringValue", "Choice",
            });
    internal_static_google_fhir_r4_core_FamilyMemberHistory_AgeX_descriptor =
        internal_static_google_fhir_r4_core_FamilyMemberHistory_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_FamilyMemberHistory_AgeX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_FamilyMemberHistory_AgeX_descriptor,
            new java.lang.String[] {
              "Age", "Range", "StringValue", "Choice",
            });
    internal_static_google_fhir_r4_core_FamilyMemberHistory_DeceasedX_descriptor =
        internal_static_google_fhir_r4_core_FamilyMemberHistory_descriptor.getNestedTypes().get(3);
    internal_static_google_fhir_r4_core_FamilyMemberHistory_DeceasedX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_FamilyMemberHistory_DeceasedX_descriptor,
            new java.lang.String[] {
              "Boolean", "Age", "Range", "Date", "StringValue", "Choice",
            });
    internal_static_google_fhir_r4_core_FamilyMemberHistory_Condition_descriptor =
        internal_static_google_fhir_r4_core_FamilyMemberHistory_descriptor.getNestedTypes().get(4);
    internal_static_google_fhir_r4_core_FamilyMemberHistory_Condition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_FamilyMemberHistory_Condition_descriptor,
            new java.lang.String[] {
              "Id",
              "Extension",
              "ModifierExtension",
              "Code",
              "Outcome",
              "ContributedToDeath",
              "Onset",
              "Note",
            });
    internal_static_google_fhir_r4_core_FamilyMemberHistory_Condition_OnsetX_descriptor =
        internal_static_google_fhir_r4_core_FamilyMemberHistory_Condition_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_FamilyMemberHistory_Condition_OnsetX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_FamilyMemberHistory_Condition_OnsetX_descriptor,
            new java.lang.String[] {
              "Age", "Range", "Period", "StringValue", "Choice",
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