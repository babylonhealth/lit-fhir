// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/domain_resource.proto

package com.google.fhir.r4.core;

public final class DomainResourceOuterClass {
  private DomainResourceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_DomainResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DomainResource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?proto/google/fhir/proto/r4/core/resour" +
      "ces/domain_resource.proto\022\023google.fhir.r" +
      "4.core\032\031google/protobuf/any.proto\032)proto" +
      "/google/fhir/proto/annotations.proto\032/pr" +
      "oto/google/fhir/proto/r4/core/datatypes." +
      "proto\"\342\003\n\016DomainResource\022#\n\002id\030\001 \001(\0132\027.g" +
      "oogle.fhir.r4.core.Id\022\'\n\004meta\030\002 \001(\0132\031.go" +
      "ogle.fhir.r4.core.Meta\0220\n\016implicit_rules" +
      "\030\003 \001(\0132\030.google.fhir.r4.core.Uri\022+\n\010lang" +
      "uage\030\004 \001(\0132\031.google.fhir.r4.core.Code\022,\n" +
      "\004text\030\005 \001(\0132\036.google.fhir.r4.core.Narrat" +
      "ive\022\'\n\tcontained\030\006 \003(\0132\024.google.protobuf" +
      ".Any\0221\n\textension\030\010 \003(\0132\036.google.fhir.r4" +
      ".core.Extension\022:\n\022modifier_extension\030\t " +
      "\003(\0132\036.google.fhir.r4.core.Extension:W\300\237\343" +
      "\266\005\003\360\354\305\346\006\001\262\376\344\227\0066http://hl7.org/fhir/Struc" +
      "tureDefinition/DomainResource\262\365\365\327\t\t\n\005_te" +
      "xt\020\003J\004\010\007\020\010B!\n\027com.google.fhir.r4.coreP\001\230" +
      "\306\260\265\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_DomainResource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_DomainResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_DomainResource_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirStructureDefinitionUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirVersion);
    registry.add(com.google.fhir.proto.Annotations.isAbstractType);
    registry.add(com.google.fhir.proto.Annotations.searchParameter);
    registry.add(com.google.fhir.proto.Annotations.structureDefinitionKind);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.fhir.proto.Annotations.getDescriptor();
    com.google.fhir.r4.core.Datatypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
