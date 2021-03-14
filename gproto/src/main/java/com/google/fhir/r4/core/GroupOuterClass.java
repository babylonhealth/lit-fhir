// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/group.proto

package com.google.fhir.r4.core;

public final class GroupOuterClass {
  private GroupOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Group_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Group_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Group_TypeCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Group_TypeCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Group_Characteristic_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Group_Characteristic_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Group_Characteristic_ValueX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Group_Characteristic_ValueX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Group_Member_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Group_Member_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#proto/r4/core/resources/group.proto\022\023g"
          + "oogle.fhir.r4.core\032\031google/protobuf/any."
          + "proto\032\027proto/annotations.proto\032\031proto/r4"
          + "/core/codes.proto\032\035proto/r4/core/datatyp"
          + "es.proto\"\256\023\n\005Group\022#\n\002id\030\001 \001(\0132\027.google."
          + "fhir.r4.core.Id\022\'\n\004meta\030\002 \001(\0132\031.google.f"
          + "hir.r4.core.Meta\0220\n\016implicit_rules\030\003 \001(\013"
          + "2\030.google.fhir.r4.core.Uri\022+\n\010language\030\004"
          + " \001(\0132\031.google.fhir.r4.core.Code\022,\n\004text\030"
          + "\005 \001(\0132\036.google.fhir.r4.core.Narrative\022\'\n"
          + "\tcontained\030\006 \003(\0132\024.google.protobuf.Any\0221"
          + "\n\textension\030\010 \003(\0132\036.google.fhir.r4.core."
          + "Extension\022:\n\022modifier_extension\030\t \003(\0132\036."
          + "google.fhir.r4.core.Extension\0223\n\nidentif"
          + "ier\030\n \003(\0132\037.google.fhir.r4.core.Identifi"
          + "er\022,\n\006active\030\013 \001(\0132\034.google.fhir.r4.core"
          + ".Boolean\0229\n\004type\030\014 \001(\0132#.google.fhir.r4."
          + "core.Group.TypeCodeB\006\360\320\207\353\004\001\0224\n\006actual\030\r "
          + "\001(\0132\034.google.fhir.r4.core.BooleanB\006\360\320\207\353\004"
          + "\001\0222\n\004code\030\016 \001(\0132$.google.fhir.r4.core.Co"
          + "deableConcept\022)\n\004name\030\017 \001(\0132\033.google.fhi"
          + "r.r4.core.String\0222\n\010quantity\030\020 \001(\0132 .goo"
          + "gle.fhir.r4.core.UnsignedInt\022\206\001\n\017managin"
          + "g_entity\030\021 \001(\0132\036.google.fhir.r4.core.Ref"
          + "erenceBM\362\377\374\302\006\014Organization\362\377\374\302\006\rRelatedP"
          + "erson\362\377\374\302\006\014Practitioner\362\377\374\302\006\020Practitione"
          + "rRole\022A\n\016characteristic\030\022 \003(\0132).google.f"
          + "hir.r4.core.Group.Characteristic\0221\n\006memb"
          + "er\030\023 \003(\0132!.google.fhir.r4.core.Group.Mem"
          + "ber\032\206\002\n\010TypeCode\0227\n\005value\030\001 \001(\0162(.google"
          + ".fhir.r4.core.GroupTypeCode.Value\022\'\n\002id\030"
          + "\002 \001(\0132\033.google.fhir.r4.core.String\0221\n\tex"
          + "tension\030\003 \003(\0132\036.google.fhir.r4.core.Exte"
          + "nsion:e\300\237\343\266\005\001\212\371\203\262\005\'http://hl7.org/fhir/V"
          + "alueSet/group-type\232\265\216\223\006,http://hl7.org/f"
          + "hir/StructureDefinition/code\032\266\005\n\016Charact"
          + "eristic\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.cor"
          + "e.String\0221\n\textension\030\002 \003(\0132\036.google.fhi"
          + "r.r4.core.Extension\022:\n\022modifier_extensio"
          + "n\030\003 \003(\0132\036.google.fhir.r4.core.Extension\022"
          + ":\n\004code\030\004 \001(\0132$.google.fhir.r4.core.Code"
          + "ableConceptB\006\360\320\207\353\004\001\022G\n\005value\030\005 \001(\01320.goo"
          + "gle.fhir.r4.core.Group.Characteristic.Va"
          + "lueXB\006\360\320\207\353\004\001\0225\n\007exclude\030\006 \001(\0132\034.google.f"
          + "hir.r4.core.BooleanB\006\360\320\207\353\004\001\022+\n\006period\030\007 "
          + "\001(\0132\033.google.fhir.r4.core.Period\032\242\002\n\006Val"
          + "ueX\022@\n\020codeable_concept\030\001 \001(\0132$.google.f"
          + "hir.r4.core.CodeableConceptH\000\022/\n\007boolean"
          + "\030\002 \001(\0132\034.google.fhir.r4.core.BooleanH\000\0221"
          + "\n\010quantity\030\003 \001(\0132\035.google.fhir.r4.core.Q"
          + "uantityH\000\022+\n\005range\030\004 \001(\0132\032.google.fhir.r"
          + "4.core.RangeH\000\0223\n\treference\030\005 \001(\0132\036.goog"
          + "le.fhir.r4.core.ReferenceH\000:\006\240\203\203\350\006\001B\010\n\006c"
          + "hoice\032\241\003\n\006Member\022\'\n\002id\030\001 \001(\0132\033.google.fh"
          + "ir.r4.core.String\0221\n\textension\030\002 \003(\0132\036.g"
          + "oogle.fhir.r4.core.Extension\022:\n\022modifier"
          + "_extension\030\003 \003(\0132\036.google.fhir.r4.core.E"
          + "xtension\022\241\001\n\006entity\030\004 \001(\0132\036.google.fhir."
          + "r4.core.ReferenceBq\360\320\207\353\004\001\362\377\374\302\006\007Patient\362\377"
          + "\374\302\006\014Practitioner\362\377\374\302\006\020PractitionerRole\362\377"
          + "\374\302\006\006Device\362\377\374\302\006\nMedication\362\377\374\302\006\tSubstanc"
          + "e\362\377\374\302\006\005Group\022+\n\006period\030\005 \001(\0132\033.google.fh"
          + "ir.r4.core.Period\022.\n\010inactive\030\006 \001(\0132\034.go"
          + "ogle.fhir.r4.core.Boolean:`\300\237\343\266\005\003\262\376\344\227\006-h"
          + "ttp://hl7.org/fhir/StructureDefinition/G"
          + "roup\232\206\223\240\010!member.empty() or (actual = tr"
          + "ue)J\004\010\007\020\010B!\n\027com.google.fhir.r4.coreP\001\230\306"
          + "\260\265\007\004b\006proto3"
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
    internal_static_google_fhir_r4_core_Group_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_Group_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Group_descriptor,
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
              "Type",
              "Actual",
              "Code",
              "Name",
              "Quantity",
              "ManagingEntity",
              "Characteristic",
              "Member",
            });
    internal_static_google_fhir_r4_core_Group_TypeCode_descriptor =
        internal_static_google_fhir_r4_core_Group_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Group_TypeCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Group_TypeCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_Group_Characteristic_descriptor =
        internal_static_google_fhir_r4_core_Group_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_Group_Characteristic_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Group_Characteristic_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Code", "Value", "Exclude", "Period",
            });
    internal_static_google_fhir_r4_core_Group_Characteristic_ValueX_descriptor =
        internal_static_google_fhir_r4_core_Group_Characteristic_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Group_Characteristic_ValueX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Group_Characteristic_ValueX_descriptor,
            new java.lang.String[] {
              "CodeableConcept", "Boolean", "Quantity", "Range", "Reference", "Choice",
            });
    internal_static_google_fhir_r4_core_Group_Member_descriptor =
        internal_static_google_fhir_r4_core_Group_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_Group_Member_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Group_Member_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Entity", "Period", "Inactive",
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