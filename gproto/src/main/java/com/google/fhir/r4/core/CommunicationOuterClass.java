// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/communication.proto

package com.google.fhir.r4.core;

public final class CommunicationOuterClass {
  private CommunicationOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Communication_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Communication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Communication_StatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Communication_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Communication_PriorityCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Communication_PriorityCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Communication_Payload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Communication_Payload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Communication_Payload_ContentX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Communication_Payload_ContentX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+proto/r4/core/resources/communication."
          + "proto\022\023google.fhir.r4.core\032\031google/proto"
          + "buf/any.proto\032\027proto/annotations.proto\032\031"
          + "proto/r4/core/codes.proto\032\035proto/r4/core"
          + "/datatypes.proto\"\372\030\n\rCommunication\022#\n\002id"
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
          + "r4.core.Identifier\022>\n\026instantiates_canon"
          + "ical\030\013 \003(\0132\036.google.fhir.r4.core.Canonic"
          + "al\0222\n\020instantiates_uri\030\014 \003(\0132\030.google.fh"
          + "ir.r4.core.Uri\022@\n\010based_on\030\r \003(\0132\036.googl"
          + "e.fhir.r4.core.ReferenceB\016\362\377\374\302\006\010Resource"
          + "\022?\n\007part_of\030\016 \003(\0132\036.google.fhir.r4.core."
          + "ReferenceB\016\362\377\374\302\006\010Resource\022K\n\016in_response"
          + "_to\030\017 \003(\0132\036.google.fhir.r4.core.Referenc"
          + "eB\023\362\377\374\302\006\rCommunication\022E\n\006status\030\020 \001(\0132-"
          + ".google.fhir.r4.core.Communication.Statu"
          + "sCodeB\006\360\320\207\353\004\001\022;\n\rstatus_reason\030\021 \001(\0132$.g"
          + "oogle.fhir.r4.core.CodeableConcept\0226\n\010ca"
          + "tegory\030\022 \003(\0132$.google.fhir.r4.core.Codea"
          + "bleConcept\022A\n\010priority\030\023 \001(\0132/.google.fh"
          + "ir.r4.core.Communication.PriorityCode\0224\n"
          + "\006medium\030\024 \003(\0132$.google.fhir.r4.core.Code"
          + "ableConcept\022I\n\007subject\030\025 \001(\0132\036.google.fh"
          + "ir.r4.core.ReferenceB\030\362\377\374\302\006\007Patient\362\377\374\302\006"
          + "\005Group\0223\n\005topic\030\026 \001(\0132$.google.fhir.r4.c"
          + "ore.CodeableConcept\022=\n\005about\030\027 \003(\0132\036.goo"
          + "gle.fhir.r4.core.ReferenceB\016\362\377\374\302\006\010Resour"
          + "ce\022B\n\tencounter\030\030 \001(\0132\036.google.fhir.r4.c"
          + "ore.ReferenceB\017\362\377\374\302\006\tEncounter\022+\n\004sent\030\031"
          + " \001(\0132\035.google.fhir.r4.core.DateTime\022/\n\010r"
          + "eceived\030\032 \001(\0132\035.google.fhir.r4.core.Date"
          + "Time\022\312\001\n\trecipient\030\033 \003(\0132\036.google.fhir.r"
          + "4.core.ReferenceB\226\001\362\377\374\302\006\006Device\362\377\374\302\006\014Org"
          + "anization\362\377\374\302\006\007Patient\362\377\374\302\006\014Practitioner"
          + "\362\377\374\302\006\020PractitionerRole\362\377\374\302\006\rRelatedPerso"
          + "n\362\377\374\302\006\005Group\362\377\374\302\006\010CareTeam\362\377\374\302\006\021Healthca"
          + "reService\022\255\001\n\006sender\030\034 \001(\0132\036.google.fhir"
          + ".r4.core.ReferenceB}\362\377\374\302\006\006Device\362\377\374\302\006\014Or"
          + "ganization\362\377\374\302\006\007Patient\362\377\374\302\006\014Practitione"
          + "r\362\377\374\302\006\020PractitionerRole\362\377\374\302\006\rRelatedPers"
          + "on\362\377\374\302\006\021HealthcareService\0229\n\013reason_code"
          + "\030\035 \003(\0132$.google.fhir.r4.core.CodeableCon"
          + "cept\022\207\001\n\020reason_reference\030\036 \003(\0132\036.google"
          + ".fhir.r4.core.ReferenceBM\362\377\374\302\006\tCondition"
          + "\362\377\374\302\006\013Observation\362\377\374\302\006\020DiagnosticReport\362"
          + "\377\374\302\006\021DocumentReference\022;\n\007payload\030\037 \003(\0132"
          + "*.google.fhir.r4.core.Communication.Payl"
          + "oad\022-\n\004note\030  \003(\0132\037.google.fhir.r4.core."
          + "Annotation\032\214\002\n\nStatusCode\0229\n\005value\030\001 \001(\016"
          + "2*.google.fhir.r4.core.EventStatusCode.V"
          + "alue\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4.core.S"
          + "tring\0221\n\textension\030\003 \003(\0132\036.google.fhir.r"
          + "4.core.Extension:g\300\237\343\266\005\001\212\371\203\262\005)http://hl7"
          + ".org/fhir/ValueSet/event-status\232\265\216\223\006,htt"
          + "p://hl7.org/fhir/StructureDefinition/cod"
          + "e\032\226\002\n\014PriorityCode\022=\n\005value\030\001 \001(\0162..goog"
          + "le.fhir.r4.core.RequestPriorityCode.Valu"
          + "e\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4.core.Stri"
          + "ng\0221\n\textension\030\003 \003(\0132\036.google.fhir.r4.c"
          + "ore.Extension:k\300\237\343\266\005\001\212\371\203\262\005-http://hl7.or"
          + "g/fhir/ValueSet/request-priority\232\265\216\223\006,ht"
          + "tp://hl7.org/fhir/StructureDefinition/co"
          + "de\032\307\003\n\007Payload\022\'\n\002id\030\001 \001(\0132\033.google.fhir"
          + ".r4.core.String\0221\n\textension\030\002 \003(\0132\036.goo"
          + "gle.fhir.r4.core.Extension\022:\n\022modifier_e"
          + "xtension\030\003 \003(\0132\036.google.fhir.r4.core.Ext"
          + "ension\022L\n\007content\030\004 \001(\01323.google.fhir.r4"
          + ".core.Communication.Payload.ContentXB\006\360\320"
          + "\207\353\004\001\032\325\001\n\010ContentX\022;\n\014string_value\030\001 \001(\0132"
          + "\033.google.fhir.r4.core.StringH\000R\006string\0225"
          + "\n\nattachment\030\002 \001(\0132\037.google.fhir.r4.core"
          + ".AttachmentH\000\022C\n\treference\030\003 \001(\0132\036.googl"
          + "e.fhir.r4.core.ReferenceB\016\362\377\374\302\006\010Resource"
          + "H\000:\006\240\203\203\350\006\001B\010\n\006choice:A\300\237\343\266\005\003\262\376\344\227\0065http:/"
          + "/hl7.org/fhir/StructureDefinition/Commun"
          + "icationJ\004\010\007\020\010B!\n\027com.google.fhir.r4.core"
          + "P\001\230\306\260\265\007\004b\006proto3"
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
    internal_static_google_fhir_r4_core_Communication_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_Communication_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Communication_descriptor,
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
              "BasedOn",
              "PartOf",
              "InResponseTo",
              "Status",
              "StatusReason",
              "Category",
              "Priority",
              "Medium",
              "Subject",
              "Topic",
              "About",
              "Encounter",
              "Sent",
              "Received",
              "Recipient",
              "Sender",
              "ReasonCode",
              "ReasonReference",
              "Payload",
              "Note",
            });
    internal_static_google_fhir_r4_core_Communication_StatusCode_descriptor =
        internal_static_google_fhir_r4_core_Communication_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Communication_StatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Communication_StatusCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_Communication_PriorityCode_descriptor =
        internal_static_google_fhir_r4_core_Communication_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_Communication_PriorityCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Communication_PriorityCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_Communication_Payload_descriptor =
        internal_static_google_fhir_r4_core_Communication_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_Communication_Payload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Communication_Payload_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Content",
            });
    internal_static_google_fhir_r4_core_Communication_Payload_ContentX_descriptor =
        internal_static_google_fhir_r4_core_Communication_Payload_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_Communication_Payload_ContentX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Communication_Payload_ContentX_descriptor,
            new java.lang.String[] {
              "StringValue", "Attachment", "Reference", "Choice",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
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