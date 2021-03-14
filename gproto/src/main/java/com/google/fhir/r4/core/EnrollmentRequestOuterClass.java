// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/enrollment_request.proto

package com.google.fhir.r4.core;

public final class EnrollmentRequestOuterClass {
  private EnrollmentRequestOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_EnrollmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_EnrollmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_EnrollmentRequest_StatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_EnrollmentRequest_StatusCode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0proto/r4/core/resources/enrollment_req"
          + "uest.proto\022\023google.fhir.r4.core\032\031google/"
          + "protobuf/any.proto\032\027proto/annotations.pr"
          + "oto\032\031proto/r4/core/codes.proto\032\035proto/r4"
          + "/core/datatypes.proto\"\312\t\n\021EnrollmentRequ"
          + "est\022#\n\002id\030\001 \001(\0132\027.google.fhir.r4.core.Id"
          + "\022\'\n\004meta\030\002 \001(\0132\031.google.fhir.r4.core.Met"
          + "a\0220\n\016implicit_rules\030\003 \001(\0132\030.google.fhir."
          + "r4.core.Uri\022+\n\010language\030\004 \001(\0132\031.google.f"
          + "hir.r4.core.Code\022,\n\004text\030\005 \001(\0132\036.google."
          + "fhir.r4.core.Narrative\022\'\n\tcontained\030\006 \003("
          + "\0132\024.google.protobuf.Any\0221\n\textension\030\010 \003"
          + "(\0132\036.google.fhir.r4.core.Extension\022:\n\022mo"
          + "difier_extension\030\t \003(\0132\036.google.fhir.r4."
          + "core.Extension\0223\n\nidentifier\030\n \003(\0132\037.goo"
          + "gle.fhir.r4.core.Identifier\022A\n\006status\030\013 "
          + "\001(\01321.google.fhir.r4.core.EnrollmentRequ"
          + "est.StatusCode\022.\n\007created\030\014 \001(\0132\035.google"
          + ".fhir.r4.core.DateTime\022C\n\007insurer\030\r \001(\0132"
          + "\036.google.fhir.r4.core.ReferenceB\022\362\377\374\302\006\014O"
          + "rganization\022l\n\010provider\030\016 \001(\0132\036.google.f"
          + "hir.r4.core.ReferenceB:\362\377\374\302\006\014Practitione"
          + "r\362\377\374\302\006\020PractitionerRole\362\377\374\302\006\014Organizatio"
          + "n\022@\n\tcandidate\030\017 \001(\0132\036.google.fhir.r4.co"
          + "re.ReferenceB\r\362\377\374\302\006\007Patient\022@\n\010coverage\030"
          + "\020 \001(\0132\036.google.fhir.r4.core.ReferenceB\016\362"
          + "\377\374\302\006\010Coverage\032\225\002\n\nStatusCode\022E\n\005value\030\001 "
          + "\001(\01626.google.fhir.r4.core.FinancialResou"
          + "rceStatusCode.Value\022\'\n\002id\030\002 \001(\0132\033.google"
          + ".fhir.r4.core.String\0221\n\textension\030\003 \003(\0132"
          + "\036.google.fhir.r4.core.Extension:d\300\237\343\266\005\001\212"
          + "\371\203\262\005&http://hl7.org/fhir/ValueSet/fm-sta"
          + "tus\232\265\216\223\006,http://hl7.org/fhir/StructureDe"
          + "finition/code:E\300\237\343\266\005\003\262\376\344\227\0069http://hl7.or"
          + "g/fhir/StructureDefinition/EnrollmentReq"
          + "uestJ\004\010\007\020\010B!\n\027com.google.fhir.r4.coreP\001\230"
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
            });
    internal_static_google_fhir_r4_core_EnrollmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_EnrollmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_EnrollmentRequest_descriptor,
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
              "Status",
              "Created",
              "Insurer",
              "Provider",
              "Candidate",
              "Coverage",
            });
    internal_static_google_fhir_r4_core_EnrollmentRequest_StatusCode_descriptor =
        internal_static_google_fhir_r4_core_EnrollmentRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_EnrollmentRequest_StatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_EnrollmentRequest_StatusCode_descriptor,
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
    registry.add(com.google.fhir.proto.Annotations.validReferenceType);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.fhir.proto.Annotations.getDescriptor();
    com.google.fhir.r4.core.Codes.getDescriptor();
    com.google.fhir.r4.core.Datatypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}