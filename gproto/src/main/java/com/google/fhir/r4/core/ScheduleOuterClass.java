// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/schedule.proto

package com.google.fhir.r4.core;

public final class ScheduleOuterClass {
  private ScheduleOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Schedule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Schedule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&proto/r4/core/resources/schedule.proto"
          + "\022\023google.fhir.r4.core\032\031google/protobuf/a"
          + "ny.proto\032\027proto/annotations.proto\032\035proto"
          + "/r4/core/datatypes.proto\"\357\007\n\010Schedule\022#\n"
          + "\002id\030\001 \001(\0132\027.google.fhir.r4.core.Id\022\'\n\004me"
          + "ta\030\002 \001(\0132\031.google.fhir.r4.core.Meta\0220\n\016i"
          + "mplicit_rules\030\003 \001(\0132\030.google.fhir.r4.cor"
          + "e.Uri\022+\n\010language\030\004 \001(\0132\031.google.fhir.r4"
          + ".core.Code\022,\n\004text\030\005 \001(\0132\036.google.fhir.r"
          + "4.core.Narrative\022\'\n\tcontained\030\006 \003(\0132\024.go"
          + "ogle.protobuf.Any\0221\n\textension\030\010 \003(\0132\036.g"
          + "oogle.fhir.r4.core.Extension\022:\n\022modifier"
          + "_extension\030\t \003(\0132\036.google.fhir.r4.core.E"
          + "xtension\0223\n\nidentifier\030\n \003(\0132\037.google.fh"
          + "ir.r4.core.Identifier\022,\n\006active\030\013 \001(\0132\034."
          + "google.fhir.r4.core.Boolean\022>\n\020service_c"
          + "ategory\030\014 \003(\0132$.google.fhir.r4.core.Code"
          + "ableConcept\022:\n\014service_type\030\r \003(\0132$.goog"
          + "le.fhir.r4.core.CodeableConcept\0227\n\tspeci"
          + "alty\030\016 \003(\0132$.google.fhir.r4.core.Codeabl"
          + "eConcept\022\256\001\n\005actor\030\017 \003(\0132\036.google.fhir.r"
          + "4.core.ReferenceB\177\360\320\207\353\004\001\362\377\374\302\006\007Patient\362\377\374"
          + "\302\006\014Practitioner\362\377\374\302\006\020PractitionerRole\362\377\374"
          + "\302\006\rRelatedPerson\362\377\374\302\006\006Device\362\377\374\302\006\021Health"
          + "careService\362\377\374\302\006\010Location\0225\n\020planning_ho"
          + "rizon\030\020 \001(\0132\033.google.fhir.r4.core.Period"
          + "\022,\n\007comment\030\021 \001(\0132\033.google.fhir.r4.core."
          + "String:<\300\237\343\266\005\003\262\376\344\227\0060http://hl7.org/fhir/"
          + "StructureDefinition/ScheduleJ\004\010\007\020\010B!\n\027co"
          + "m.google.fhir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.fhir.proto.Annotations.getDescriptor(),
              com.google.fhir.r4.core.Datatypes.getDescriptor(),
            });
    internal_static_google_fhir_r4_core_Schedule_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_Schedule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Schedule_descriptor,
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
              "Active",
              "ServiceCategory",
              "ServiceType",
              "Specialty",
              "Actor",
              "PlanningHorizon",
              "Comment",
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