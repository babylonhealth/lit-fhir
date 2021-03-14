// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/profiles/diagnostic_report_genetics.proto

package com.google.fhir.r4.core;

public final class DiagnosticReportGeneticsOuterClass {
  private DiagnosticReportGeneticsOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_DiagnosticReportGenetics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DiagnosticReportGenetics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_DiagnosticReportGenetics_StatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DiagnosticReportGenetics_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_DiagnosticReportGenetics_EffectiveX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DiagnosticReportGenetics_EffectiveX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_DiagnosticReportGenetics_Media_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DiagnosticReportGenetics_Media_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7proto/r4/core/profiles/diagnostic_repo"
          + "rt_genetics.proto\022\023google.fhir.r4.core\032\031"
          + "google/protobuf/any.proto\032\027proto/annotat"
          + "ions.proto\032\031proto/r4/core/codes.proto\032\035p"
          + "roto/r4/core/datatypes.proto\032\036proto/r4/c"
          + "ore/extensions.proto\"\303\031\n\030DiagnosticRepor"
          + "tGenetics\022#\n\002id\030\001 \001(\0132\027.google.fhir.r4.c"
          + "ore.Id\022\'\n\004meta\030\002 \001(\0132\031.google.fhir.r4.co"
          + "re.Meta\0220\n\016implicit_rules\030\003 \001(\0132\030.google"
          + ".fhir.r4.core.Uri\022+\n\010language\030\004 \001(\0132\031.go"
          + "ogle.fhir.r4.core.Code\022,\n\004text\030\005 \001(\0132\036.g"
          + "oogle.fhir.r4.core.Narrative\022\'\n\tcontaine"
          + "d\030\006 \003(\0132\024.google.protobuf.Any\0221\n\textensi"
          + "on\030\010 \003(\0132\036.google.fhir.r4.core.Extension"
          + "\022:\n\022modifier_extension\030\t \003(\0132\036.google.fh"
          + "ir.r4.core.Extension\0223\n\nidentifier\030\n \003(\013"
          + "2\037.google.fhir.r4.core.Identifier\022\237\001\n\010ba"
          + "sed_on\030\013 \003(\0132\036.google.fhir.r4.core.Refer"
          + "enceBm\362\377\374\302\006\010CarePlan\362\377\374\302\006\032ImmunizationRe"
          + "commendation\362\377\374\302\006\021MedicationRequest\362\377\374\302\006"
          + "\016NutritionOrder\362\377\374\302\006\016ServiceRequest\022P\n\006s"
          + "tatus\030\014 \001(\01328.google.fhir.r4.core.Diagno"
          + "sticReportGenetics.StatusCodeB\006\360\320\207\353\004\001\0226\n"
          + "\010category\030\r \003(\0132$.google.fhir.r4.core.Co"
          + "deableConcept\022:\n\004code\030\016 \001(\0132$.google.fhi"
          + "r.r4.core.CodeableConceptB\006\360\320\207\353\004\001\022c\n\007sub"
          + "ject\030\017 \001(\0132\036.google.fhir.r4.core.Referen"
          + "ceB2\362\377\374\302\006\007Patient\362\377\374\302\006\005Group\362\377\374\302\006\006Device"
          + "\362\377\374\302\006\010Location\022B\n\tencounter\030\020 \001(\0132\036.goog"
          + "le.fhir.r4.core.ReferenceB\017\362\377\374\302\006\tEncount"
          + "er\022K\n\teffective\030\021 \001(\01328.google.fhir.r4.c"
          + "ore.DiagnosticReportGenetics.EffectiveX\022"
          + ",\n\006issued\030\022 \001(\0132\034.google.fhir.r4.core.In"
          + "stant\022{\n\tperformer\030\023 \003(\0132\036.google.fhir.r"
          + "4.core.ReferenceBH\362\377\374\302\006\014Practitioner\362\377\374\302"
          + "\006\020PractitionerRole\362\377\374\302\006\014Organization\362\377\374\302"
          + "\006\010CareTeam\022\205\001\n\023results_interpreter\030\024 \003(\013"
          + "2\036.google.fhir.r4.core.ReferenceBH\362\377\374\302\006\014"
          + "Practitioner\362\377\374\302\006\020PractitionerRole\362\377\374\302\006\014"
          + "Organization\362\377\374\302\006\010CareTeam\022@\n\010specimen\030\025"
          + " \003(\0132\036.google.fhir.r4.core.ReferenceB\016\362\377"
          + "\374\302\006\010Specimen\022A\n\006result\030\026 \003(\0132\036.google.fh"
          + "ir.r4.core.ReferenceB\021\362\377\374\302\006\013Observation\022"
          + "I\n\rimaging_study\030\027 \003(\0132\036.google.fhir.r4."
          + "core.ReferenceB\022\362\377\374\302\006\014ImagingStudy\022B\n\005me"
          + "dia\030\030 \003(\01323.google.fhir.r4.core.Diagnost"
          + "icReportGenetics.Media\022/\n\nconclusion\030\031 \001"
          + "(\0132\033.google.fhir.r4.core.String\0227\n\016prese"
          + "nted_form\030\033 \003(\0132\037.google.fhir.r4.core.At"
          + "tachment\022\247\001\n\022assessed_condition\030\034 \003(\0132\036."
          + "google.fhir.r4.core.ReferenceBX\252\374\217\223\006Rhtt"
          + "p://hl7.org/fhir/StructureDefinition/Dia"
          + "gnosticReport-geneticsAssessedConditionR"
          + "\021AssessedCondition\022\256\001\n\025family_member_his"
          + "tory\030\035 \003(\0132\036.google.fhir.r4.core.Referen"
          + "ceBZ\252\374\217\223\006Thttp://hl7.org/fhir/StructureD"
          + "efinition/DiagnosticReport-geneticsFamil"
          + "yMemberHistoryR\023FamilyMemberHistory\022\232\001\n\010"
          + "analysis\030\036 \003(\0132-.google.fhir.r4.core.Dia"
          + "gnosticReportAnalysisBO\252\374\217\223\006Ihttp://hl7."
          + "org/fhir/StructureDefinition/DiagnosticR"
          + "eport-geneticsAnalysisR\010Analysis\022\242\001\n\nref"
          + "erences\030\037 \003(\0132/.google.fhir.r4.core.Diag"
          + "nosticReportReferencesBQ\252\374\217\223\006Khttp://hl7"
          + ".org/fhir/StructureDefinition/Diagnostic"
          + "Report-geneticsReferencesR\nReferences\032\243\002"
          + "\n\nStatusCode\022D\n\005value\030\001 \001(\01625.google.fhi"
          + "r.r4.core.DiagnosticReportStatusCode.Val"
          + "ue\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4.core.Str"
          + "ing\0221\n\textension\030\003 \003(\0132\036.google.fhir.r4."
          + "core.Extension:s\300\237\343\266\005\001\212\371\203\262\0055http://hl7.o"
          + "rg/fhir/ValueSet/diagnostic-report-statu"
          + "s\232\265\216\223\006,http://hl7.org/fhir/StructureDefi"
          + "nition/code\032\201\001\n\nEffectiveX\0222\n\tdate_time\030"
          + "\001 \001(\0132\035.google.fhir.r4.core.DateTimeH\000\022-"
          + "\n\006period\030\002 \001(\0132\033.google.fhir.r4.core.Per"
          + "iodH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\216\002\n\005Media\022\'\n\002id\030"
          + "\001 \001(\0132\033.google.fhir.r4.core.String\0221\n\tex"
          + "tension\030\002 \003(\0132\036.google.fhir.r4.core.Exte"
          + "nsion\022:\n\022modifier_extension\030\003 \003(\0132\036.goog"
          + "le.fhir.r4.core.Extension\022,\n\007comment\030\004 \001"
          + "(\0132\033.google.fhir.r4.core.String\022?\n\004link\030"
          + "\005 \001(\0132\036.google.fhir.r4.core.ReferenceB\021\360"
          + "\320\207\353\004\001\362\377\374\302\006\005Media:\213\001\300\237\343\266\005\003\232\265\216\223\0068http://hl"
          + "7.org/fhir/StructureDefinition/Diagnosti"
          + "cReport\262\376\344\227\006Ahttp://hl7.org/fhir/Structu"
          + "reDefinition/diagnosticreport-geneticsJ\004"
          + "\010\007\020\010J\004\010\032\020\033B!\n\027com.google.fhir.r4.coreP\001\230"
          + "\306\260\265\007\004b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.fhir.proto.Annotations.getDescriptor(),
              com.google.fhir.r4.core.Codes.getDescriptor(),
              com.google.fhir.r4.core.Datatypes.getDescriptor(),
              com.google.fhir.r4.core.Extensions.getDescriptor(),
            });
    internal_static_google_fhir_r4_core_DiagnosticReportGenetics_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_DiagnosticReportGenetics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_DiagnosticReportGenetics_descriptor,
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
              "BasedOn",
              "Status",
              "Category",
              "Code",
              "Subject",
              "Encounter",
              "Effective",
              "Issued",
              "Performer",
              "ResultsInterpreter",
              "Specimen",
              "Result",
              "ImagingStudy",
              "Media",
              "Conclusion",
              "PresentedForm",
              "AssessedCondition",
              "FamilyMemberHistory",
              "Analysis",
              "References",
            });
    internal_static_google_fhir_r4_core_DiagnosticReportGenetics_StatusCode_descriptor =
        internal_static_google_fhir_r4_core_DiagnosticReportGenetics_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_DiagnosticReportGenetics_StatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_DiagnosticReportGenetics_StatusCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_DiagnosticReportGenetics_EffectiveX_descriptor =
        internal_static_google_fhir_r4_core_DiagnosticReportGenetics_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_fhir_r4_core_DiagnosticReportGenetics_EffectiveX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_DiagnosticReportGenetics_EffectiveX_descriptor,
            new java.lang.String[] {
              "DateTime", "Period", "Choice",
            });
    internal_static_google_fhir_r4_core_DiagnosticReportGenetics_Media_descriptor =
        internal_static_google_fhir_r4_core_DiagnosticReportGenetics_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_fhir_r4_core_DiagnosticReportGenetics_Media_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_DiagnosticReportGenetics_Media_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Comment", "Link",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirInlinedExtensionUrl);
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
    com.google.fhir.r4.core.Extensions.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}