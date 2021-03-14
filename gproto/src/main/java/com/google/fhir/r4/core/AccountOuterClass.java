// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/account.proto

package com.google.fhir.r4.core;

public final class AccountOuterClass {
  private AccountOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Account_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Account_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Account_StatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Account_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Account_Coverage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Account_Coverage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Account_Guarantor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Account_Guarantor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%proto/r4/core/resources/account.proto\022"
          + "\023google.fhir.r4.core\032\031google/protobuf/an"
          + "y.proto\032\027proto/annotations.proto\032\031proto/"
          + "r4/core/codes.proto\032\035proto/r4/core/datat"
          + "ypes.proto\"\275\020\n\007Account\022#\n\002id\030\001 \001(\0132\027.goo"
          + "gle.fhir.r4.core.Id\022\'\n\004meta\030\002 \001(\0132\031.goog"
          + "le.fhir.r4.core.Meta\0220\n\016implicit_rules\030\003"
          + " \001(\0132\030.google.fhir.r4.core.Uri\022+\n\010langua"
          + "ge\030\004 \001(\0132\031.google.fhir.r4.core.Code\022,\n\004t"
          + "ext\030\005 \001(\0132\036.google.fhir.r4.core.Narrativ"
          + "e\022\'\n\tcontained\030\006 \003(\0132\024.google.protobuf.A"
          + "ny\0221\n\textension\030\010 \003(\0132\036.google.fhir.r4.c"
          + "ore.Extension\022:\n\022modifier_extension\030\t \003("
          + "\0132\036.google.fhir.r4.core.Extension\0223\n\nide"
          + "ntifier\030\n \003(\0132\037.google.fhir.r4.core.Iden"
          + "tifier\022?\n\006status\030\013 \001(\0132\'.google.fhir.r4."
          + "core.Account.StatusCodeB\006\360\320\207\353\004\001\0222\n\004type\030"
          + "\014 \001(\0132$.google.fhir.r4.core.CodeableConc"
          + "ept\022)\n\004name\030\r \001(\0132\033.google.fhir.r4.core."
          + "String\022\251\001\n\007subject\030\016 \003(\0132\036.google.fhir.r"
          + "4.core.ReferenceBx\362\377\374\302\006\007Patient\362\377\374\302\006\006Dev"
          + "ice\362\377\374\302\006\014Practitioner\362\377\374\302\006\020PractitionerR"
          + "ole\362\377\374\302\006\010Location\362\377\374\302\006\021HealthcareService"
          + "\362\377\374\302\006\014Organization\0223\n\016service_period\030\017 \001"
          + "(\0132\033.google.fhir.r4.core.Period\0227\n\010cover"
          + "age\030\020 \003(\0132%.google.fhir.r4.core.Account."
          + "Coverage\022A\n\005owner\030\021 \001(\0132\036.google.fhir.r4"
          + ".core.ReferenceB\022\362\377\374\302\006\014Organization\0220\n\013d"
          + "escription\030\022 \001(\0132\033.google.fhir.r4.core.S"
          + "tring\0229\n\tguarantor\030\023 \003(\0132&.google.fhir.r"
          + "4.core.Account.Guarantor\022>\n\007part_of\030\024 \001("
          + "\0132\036.google.fhir.r4.core.ReferenceB\r\362\377\374\302\006"
          + "\007Account\032\220\002\n\nStatusCode\022;\n\005value\030\001 \001(\0162,"
          + ".google.fhir.r4.core.AccountStatusCode.V"
          + "alue\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4.core.S"
          + "tring\0221\n\textension\030\003 \003(\0132\036.google.fhir.r"
          + "4.core.Extension:i\300\237\343\266\005\001\212\371\203\262\005+http://hl7"
          + ".org/fhir/ValueSet/account-status\232\265\216\223\006,h"
          + "ttp://hl7.org/fhir/StructureDefinition/c"
          + "ode\032\236\002\n\010Coverage\022\'\n\002id\030\001 \001(\0132\033.google.fh"
          + "ir.r4.core.String\0221\n\textension\030\002 \003(\0132\036.g"
          + "oogle.fhir.r4.core.Extension\022:\n\022modifier"
          + "_extension\030\003 \003(\0132\036.google.fhir.r4.core.E"
          + "xtension\022F\n\010coverage\030\004 \001(\0132\036.google.fhir"
          + ".r4.core.ReferenceB\024\360\320\207\353\004\001\362\377\374\302\006\010Coverage"
          + "\0222\n\010priority\030\005 \001(\0132 .google.fhir.r4.core"
          + ".PositiveInt\032\350\002\n\tGuarantor\022\'\n\002id\030\001 \001(\0132\033"
          + ".google.fhir.r4.core.String\0221\n\textension"
          + "\030\002 \003(\0132\036.google.fhir.r4.core.Extension\022:"
          + "\n\022modifier_extension\030\003 \003(\0132\036.google.fhir"
          + ".r4.core.Extension\022g\n\005party\030\004 \001(\0132\036.goog"
          + "le.fhir.r4.core.ReferenceB8\360\320\207\353\004\001\362\377\374\302\006\007P"
          + "atient\362\377\374\302\006\rRelatedPerson\362\377\374\302\006\014Organizat"
          + "ion\022-\n\007on_hold\030\005 \001(\0132\034.google.fhir.r4.co"
          + "re.Boolean\022+\n\006period\030\006 \001(\0132\033.google.fhir"
          + ".r4.core.Period:;\300\237\343\266\005\003\262\376\344\227\006/http://hl7."
          + "org/fhir/StructureDefinition/AccountJ\004\010\007"
          + "\020\010B!\n\027com.google.fhir.r4.coreP\001\230\306\260\265\007\004b\006p"
          + "roto3"
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
    internal_static_google_fhir_r4_core_Account_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_Account_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Account_descriptor,
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
              "Type",
              "Name",
              "Subject",
              "ServicePeriod",
              "Coverage",
              "Owner",
              "Description",
              "Guarantor",
              "PartOf",
            });
    internal_static_google_fhir_r4_core_Account_StatusCode_descriptor =
        internal_static_google_fhir_r4_core_Account_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Account_StatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Account_StatusCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_Account_Coverage_descriptor =
        internal_static_google_fhir_r4_core_Account_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_Account_Coverage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Account_Coverage_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Coverage", "Priority",
            });
    internal_static_google_fhir_r4_core_Account_Guarantor_descriptor =
        internal_static_google_fhir_r4_core_Account_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_Account_Guarantor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Account_Guarantor_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Party", "OnHold", "Period",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirProfileBase);
    registry.add(com.google.fhir.proto.Annotations.fhirStructureDefinitionUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirValuesetUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirVersion);
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
