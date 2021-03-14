// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/care_team.proto

package com.google.fhir.r4.core;

public final class CareTeamOuterClass {
  private CareTeamOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_CareTeam_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_CareTeam_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_CareTeam_StatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_CareTeam_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_CareTeam_Participant_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_CareTeam_Participant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'proto/r4/core/resources/care_team.prot"
          + "o\022\023google.fhir.r4.core\032\031google/protobuf/"
          + "any.proto\032\027proto/annotations.proto\032\031prot"
          + "o/r4/core/codes.proto\032\035proto/r4/core/dat"
          + "atypes.proto\"\267\020\n\010CareTeam\022#\n\002id\030\001 \001(\0132\027."
          + "google.fhir.r4.core.Id\022\'\n\004meta\030\002 \001(\0132\031.g"
          + "oogle.fhir.r4.core.Meta\0220\n\016implicit_rule"
          + "s\030\003 \001(\0132\030.google.fhir.r4.core.Uri\022+\n\010lan"
          + "guage\030\004 \001(\0132\031.google.fhir.r4.core.Code\022,"
          + "\n\004text\030\005 \001(\0132\036.google.fhir.r4.core.Narra"
          + "tive\022\'\n\tcontained\030\006 \003(\0132\024.google.protobu"
          + "f.Any\0221\n\textension\030\010 \003(\0132\036.google.fhir.r"
          + "4.core.Extension\022:\n\022modifier_extension\030\t"
          + " \003(\0132\036.google.fhir.r4.core.Extension\0223\n\n"
          + "identifier\030\n \003(\0132\037.google.fhir.r4.core.I"
          + "dentifier\0228\n\006status\030\013 \001(\0132(.google.fhir."
          + "r4.core.CareTeam.StatusCode\0226\n\010category\030"
          + "\014 \003(\0132$.google.fhir.r4.core.CodeableConc"
          + "ept\022)\n\004name\030\r \001(\0132\033.google.fhir.r4.core."
          + "String\022I\n\007subject\030\016 \001(\0132\036.google.fhir.r4"
          + ".core.ReferenceB\030\362\377\374\302\006\007Patient\362\377\374\302\006\005Grou"
          + "p\022B\n\tencounter\030\017 \001(\0132\036.google.fhir.r4.co"
          + "re.ReferenceB\017\362\377\374\302\006\tEncounter\022+\n\006period\030"
          + "\020 \001(\0132\033.google.fhir.r4.core.Period\022>\n\013pa"
          + "rticipant\030\021 \003(\0132).google.fhir.r4.core.Ca"
          + "reTeam.Participant\0229\n\013reason_code\030\022 \003(\0132"
          + "$.google.fhir.r4.core.CodeableConcept\022I\n"
          + "\020reason_reference\030\023 \003(\0132\036.google.fhir.r4"
          + ".core.ReferenceB\017\362\377\374\302\006\tCondition\022Q\n\025mana"
          + "ging_organization\030\024 \003(\0132\036.google.fhir.r4"
          + ".core.ReferenceB\022\362\377\374\302\006\014Organization\0222\n\007t"
          + "elecom\030\025 \003(\0132!.google.fhir.r4.core.Conta"
          + "ctPoint\022-\n\004note\030\026 \003(\0132\037.google.fhir.r4.c"
          + "ore.Annotation\032\223\002\n\nStatusCode\022<\n\005value\030\001"
          + " \001(\0162-.google.fhir.r4.core.CareTeamStatu"
          + "sCode.Value\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4"
          + ".core.String\0221\n\textension\030\003 \003(\0132\036.google"
          + ".fhir.r4.core.Extension:k\300\237\343\266\005\001\212\371\203\262\005-htt"
          + "p://hl7.org/fhir/ValueSet/care-team-stat"
          + "us\232\265\216\223\006,http://hl7.org/fhir/StructureDef"
          + "inition/code\032\323\004\n\013Participant\022\'\n\002id\030\001 \001(\013"
          + "2\033.google.fhir.r4.core.String\0221\n\textensi"
          + "on\030\002 \003(\0132\036.google.fhir.r4.core.Extension"
          + "\022:\n\022modifier_extension\030\003 \003(\0132\036.google.fh"
          + "ir.r4.core.Extension\0222\n\004role\030\004 \003(\0132$.goo"
          + "gle.fhir.r4.core.CodeableConcept\022\230\001\n\006mem"
          + "ber\030\005 \001(\0132\036.google.fhir.r4.core.Referenc"
          + "eBh\362\377\374\302\006\014Practitioner\362\377\374\302\006\020PractitionerR"
          + "ole\362\377\374\302\006\rRelatedPerson\362\377\374\302\006\007Patient\362\377\374\302\006"
          + "\014Organization\362\377\374\302\006\010CareTeam\022H\n\014on_behalf"
          + "_of\030\006 \001(\0132\036.google.fhir.r4.core.Referenc"
          + "eB\022\362\377\374\302\006\014Organization\022+\n\006period\030\007 \001(\0132\033."
          + "google.fhir.r4.core.Period:f\232\206\223\240\010`onBeha"
          + "lfOf.exists() implies (member.resolve()."
          + "iif(empty(), true, ofType(Practitioner)."
          + "exists())):<\300\237\343\266\005\003\262\376\344\227\0060http://hl7.org/f"
          + "hir/StructureDefinition/CareTeamJ\004\010\007\020\010B!"
          + "\n\027com.google.fhir.r4.coreP\001\230\306\260\265\007\004b\006proto"
          + "3"
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
    internal_static_google_fhir_r4_core_CareTeam_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_CareTeam_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_CareTeam_descriptor,
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
              "Category",
              "Name",
              "Subject",
              "Encounter",
              "Period",
              "Participant",
              "ReasonCode",
              "ReasonReference",
              "ManagingOrganization",
              "Telecom",
              "Note",
            });
    internal_static_google_fhir_r4_core_CareTeam_StatusCode_descriptor =
        internal_static_google_fhir_r4_core_CareTeam_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_CareTeam_StatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_CareTeam_StatusCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_CareTeam_Participant_descriptor =
        internal_static_google_fhir_r4_core_CareTeam_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_CareTeam_Participant_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_CareTeam_Participant_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Role", "Member", "OnBehalfOf", "Period",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirPathMessageConstraint);
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