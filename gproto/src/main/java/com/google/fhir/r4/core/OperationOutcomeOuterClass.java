// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/operation_outcome.proto

package com.google.fhir.r4.core;

public final class OperationOutcomeOuterClass {
  private OperationOutcomeOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_OperationOutcome_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_OperationOutcome_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_OperationOutcome_Issue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_OperationOutcome_Issue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_OperationOutcome_Issue_SeverityCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_OperationOutcome_Issue_SeverityCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_OperationOutcome_Issue_CodeType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_OperationOutcome_Issue_CodeType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/proto/r4/core/resources/operation_outc"
          + "ome.proto\022\023google.fhir.r4.core\032\031google/p"
          + "rotobuf/any.proto\032\027proto/annotations.pro"
          + "to\032\031proto/r4/core/codes.proto\032\035proto/r4/"
          + "core/datatypes.proto\"\276\014\n\020OperationOutcom"
          + "e\022#\n\002id\030\001 \001(\0132\027.google.fhir.r4.core.Id\022\'"
          + "\n\004meta\030\002 \001(\0132\031.google.fhir.r4.core.Meta\022"
          + "0\n\016implicit_rules\030\003 \001(\0132\030.google.fhir.r4"
          + ".core.Uri\022+\n\010language\030\004 \001(\0132\031.google.fhi"
          + "r.r4.core.Code\022,\n\004text\030\005 \001(\0132\036.google.fh"
          + "ir.r4.core.Narrative\022\'\n\tcontained\030\006 \003(\0132"
          + "\024.google.protobuf.Any\0221\n\textension\030\010 \003(\013"
          + "2\036.google.fhir.r4.core.Extension\022:\n\022modi"
          + "fier_extension\030\t \003(\0132\036.google.fhir.r4.co"
          + "re.Extension\022B\n\005issue\030\n \003(\0132+.google.fhi"
          + "r.r4.core.OperationOutcome.IssueB\006\360\320\207\353\004\001"
          + "\032\246\010\n\005Issue\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4."
          + "core.String\0221\n\textension\030\002 \003(\0132\036.google."
          + "fhir.r4.core.Extension\022:\n\022modifier_exten"
          + "sion\030\003 \003(\0132\036.google.fhir.r4.core.Extensi"
          + "on\022R\n\010severity\030\004 \001(\01328.google.fhir.r4.co"
          + "re.OperationOutcome.Issue.SeverityCodeB\006"
          + "\360\320\207\353\004\001\022J\n\004code\030\005 \001(\01324.google.fhir.r4.co"
          + "re.OperationOutcome.Issue.CodeTypeB\006\360\320\207\353"
          + "\004\001\0225\n\007details\030\006 \001(\0132$.google.fhir.r4.cor"
          + "e.CodeableConcept\0220\n\013diagnostics\030\007 \001(\0132\033"
          + ".google.fhir.r4.core.String\022-\n\010location\030"
          + "\010 \003(\0132\033.google.fhir.r4.core.String\022/\n\nex"
          + "pression\030\t \003(\0132\033.google.fhir.r4.core.Str"
          + "ing\032\222\002\n\014SeverityCode\022;\n\005value\030\001 \001(\0162,.go"
          + "ogle.fhir.r4.core.IssueSeverityCode.Valu"
          + "e\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4.core.Stri"
          + "ng\0221\n\textension\030\003 \003(\0132\036.google.fhir.r4.c"
          + "ore.Extension:i\300\237\343\266\005\001\212\371\203\262\005+http://hl7.or"
          + "g/fhir/ValueSet/issue-severity\232\265\216\223\006,http"
          + "://hl7.org/fhir/StructureDefinition/code"
          + "\032\206\002\n\010CodeType\0227\n\005value\030\001 \001(\0162(.google.fh"
          + "ir.r4.core.IssueTypeCode.Value\022\'\n\002id\030\002 \001"
          + "(\0132\033.google.fhir.r4.core.String\0221\n\texten"
          + "sion\030\003 \003(\0132\036.google.fhir.r4.core.Extensi"
          + "on:e\300\237\343\266\005\001\212\371\203\262\005\'http://hl7.org/fhir/Valu"
          + "eSet/issue-type\232\265\216\223\006,http://hl7.org/fhir"
          + "/StructureDefinition/code:D\300\237\343\266\005\003\262\376\344\227\0068h"
          + "ttp://hl7.org/fhir/StructureDefinition/O"
          + "perationOutcomeJ\004\010\007\020\010B!\n\027com.google.fhir"
          + ".r4.coreP\001\230\306\260\265\007\004b\006proto3"
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
    internal_static_google_fhir_r4_core_OperationOutcome_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_OperationOutcome_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_OperationOutcome_descriptor,
            new java.lang.String[] {
              "Id",
              "Meta",
              "ImplicitRules",
              "Language",
              "Text",
              "Contained",
              "Extension",
              "ModifierExtension",
              "Issue",
            });
    internal_static_google_fhir_r4_core_OperationOutcome_Issue_descriptor =
        internal_static_google_fhir_r4_core_OperationOutcome_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_OperationOutcome_Issue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_OperationOutcome_Issue_descriptor,
            new java.lang.String[] {
              "Id",
              "Extension",
              "ModifierExtension",
              "Severity",
              "Code",
              "Details",
              "Diagnostics",
              "Location",
              "Expression",
            });
    internal_static_google_fhir_r4_core_OperationOutcome_Issue_SeverityCode_descriptor =
        internal_static_google_fhir_r4_core_OperationOutcome_Issue_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_OperationOutcome_Issue_SeverityCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_OperationOutcome_Issue_SeverityCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_OperationOutcome_Issue_CodeType_descriptor =
        internal_static_google_fhir_r4_core_OperationOutcome_Issue_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_fhir_r4_core_OperationOutcome_Issue_CodeType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_OperationOutcome_Issue_CodeType_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirProfileBase);
    registry.add(com.google.fhir.proto.Annotations.fhirStructureDefinitionUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirValuesetUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirVersion);
    registry.add(com.google.fhir.proto.Annotations.structureDefinitionKind);
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
