// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/profiles/group_definition.proto

package com.google.fhir.r4.core;

public final class GroupDefinitionOuterClass {
  private GroupDefinitionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_GroupDefinition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_GroupDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_GroupDefinition_TypeCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_GroupDefinition_TypeCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_GroupDefinition_Characteristic_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_GroupDefinition_Characteristic_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_GroupDefinition_Characteristic_ValueX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_GroupDefinition_Characteristic_ValueX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?proto/google/fhir/proto/r4/core/profil" +
      "es/group_definition.proto\022\023google.fhir.r" +
      "4.core\032\031google/protobuf/any.proto\032)proto" +
      "/google/fhir/proto/annotations.proto\032+pr" +
      "oto/google/fhir/proto/r4/core/codes.prot" +
      "o\032/proto/google/fhir/proto/r4/core/datat" +
      "ypes.proto\"\217\024\n\017GroupDefinition\022#\n\002id\030\001 \001" +
      "(\0132\027.google.fhir.r4.core.Id\022\'\n\004meta\030\002 \001(" +
      "\0132\031.google.fhir.r4.core.Meta\0220\n\016implicit" +
      "_rules\030\003 \001(\0132\030.google.fhir.r4.core.Uri\022+" +
      "\n\010language\030\004 \001(\0132\031.google.fhir.r4.core.C" +
      "ode\022,\n\004text\030\005 \001(\0132\036.google.fhir.r4.core." +
      "Narrative\022\'\n\tcontained\030\006 \003(\0132\024.google.pr" +
      "otobuf.Any\0221\n\textension\030\010 \003(\0132\036.google.f" +
      "hir.r4.core.Extension\022:\n\022modifier_extens" +
      "ion\030\t \003(\0132\036.google.fhir.r4.core.Extensio" +
      "n\0223\n\nidentifier\030\n \003(\0132\037.google.fhir.r4.c" +
      "ore.Identifier\022,\n\006active\030\013 \001(\0132\034.google." +
      "fhir.r4.core.Boolean\022C\n\004type\030\014 \001(\0132-.goo" +
      "gle.fhir.r4.core.GroupDefinition.TypeCod" +
      "eB\006\360\320\207\353\004\001\0224\n\006actual\030\r \001(\0132\034.google.fhir." +
      "r4.core.BooleanB\006\360\320\207\353\004\001\0222\n\004code\030\016 \001(\0132$." +
      "google.fhir.r4.core.CodeableConcept\022)\n\004n" +
      "ame\030\017 \001(\0132\033.google.fhir.r4.core.String\0222" +
      "\n\010quantity\030\020 \001(\0132 .google.fhir.r4.core.U" +
      "nsignedInt\022\206\001\n\017managing_entity\030\021 \001(\0132\036.g" +
      "oogle.fhir.r4.core.ReferenceBM\362\377\374\302\006\014Orga" +
      "nization\362\377\374\302\006\rRelatedPerson\362\377\374\302\006\014Practit" +
      "ioner\362\377\374\302\006\020PractitionerRole\022K\n\016character" +
      "istic\030\022 \003(\01323.google.fhir.r4.core.GroupD" +
      "efinition.Characteristic\032\206\002\n\010TypeCode\0227\n" +
      "\005value\030\001 \001(\0162(.google.fhir.r4.core.Group" +
      "TypeCode.Value\022\'\n\002id\030\002 \001(\0132\033.google.fhir" +
      ".r4.core.String\0221\n\textension\030\003 \003(\0132\036.goo" +
      "gle.fhir.r4.core.Extension:e\300\237\343\266\005\001\212\371\203\262\005\'" +
      "http://hl7.org/fhir/ValueSet/group-type\232" +
      "\265\216\223\006,http://hl7.org/fhir/StructureDefini" +
      "tion/code\032\300\005\n\016Characteristic\022\'\n\002id\030\001 \001(\013" +
      "2\033.google.fhir.r4.core.String\0221\n\textensi" +
      "on\030\002 \003(\0132\036.google.fhir.r4.core.Extension" +
      "\022:\n\022modifier_extension\030\003 \003(\0132\036.google.fh" +
      "ir.r4.core.Extension\022:\n\004code\030\004 \001(\0132$.goo" +
      "gle.fhir.r4.core.CodeableConceptB\006\360\320\207\353\004\001" +
      "\022Q\n\005value\030\005 \001(\0132:.google.fhir.r4.core.Gr" +
      "oupDefinition.Characteristic.ValueXB\006\360\320\207" +
      "\353\004\001\0225\n\007exclude\030\006 \001(\0132\034.google.fhir.r4.co" +
      "re.BooleanB\006\360\320\207\353\004\001\022+\n\006period\030\007 \001(\0132\033.goo" +
      "gle.fhir.r4.core.Period\032\242\002\n\006ValueX\022@\n\020co" +
      "deable_concept\030\001 \001(\0132$.google.fhir.r4.co" +
      "re.CodeableConceptH\000\022/\n\007boolean\030\002 \001(\0132\034." +
      "google.fhir.r4.core.BooleanH\000\0221\n\010quantit" +
      "y\030\003 \001(\0132\035.google.fhir.r4.core.QuantityH\000" +
      "\022+\n\005range\030\004 \001(\0132\032.google.fhir.r4.core.Ra" +
      "ngeH\000\0223\n\treference\030\005 \001(\0132\036.google.fhir.r" +
      "4.core.ReferenceH\000:\006\240\203\203\350\006\001B\010\n\006choice:\351\004\300" +
      "\237\343\266\005\003\232\265\216\223\006-http://hl7.org/fhir/Structure" +
      "Definition/Group\262\376\344\227\0067http://hl7.org/fhi" +
      "r/StructureDefinition/groupdefinition\232\206\223" +
      "\240\010!member.empty() or (actual = true)\262\365\365\327" +
      "\t\030\n\006actual\020\004\032\014Group.actual\262\365\365\327\t-\n\016charac" +
      "teristic\020\004\032\031Group.characteristic.code\262\365\365" +
      "\327\t.\n\024characteristic-value\020\006\032\024Group.chara" +
      "cteristic\262\365\365\327\t\024\n\004code\020\004\032\nGroup.code\262\365\365\327\t" +
      ")\n\007exclude\020\004\032\034Group.characteristic.exclu" +
      "de\262\365\365\327\t \n\nidentifier\020\004\032\020Group.identifier" +
      "\262\365\365\327\t)\n\017managing-entity\020\005\032\024Group.managin" +
      "gEntity\262\365\365\327\t\037\n\006member\020\005\032\023Group.member.en" +
      "tity\262\365\365\327\t\024\n\004type\020\004\032\nGroup.type\262\365\365\327\td\n\005va" +
      "lue\020\004\032Y(Group.characteristic.value as Co" +
      "deableConcept) | (Group.characteristic.v" +
      "alue as boolean)J\004\010\007\020\010J\004\010\023\020\024B!\n\027com.goog" +
      "le.fhir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Codes.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_GroupDefinition_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_GroupDefinition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_GroupDefinition_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Identifier", "Active", "Type", "Actual", "Code", "Name", "Quantity", "ManagingEntity", "Characteristic", });
    internal_static_google_fhir_r4_core_GroupDefinition_TypeCode_descriptor =
      internal_static_google_fhir_r4_core_GroupDefinition_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_GroupDefinition_TypeCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_GroupDefinition_TypeCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_GroupDefinition_Characteristic_descriptor =
      internal_static_google_fhir_r4_core_GroupDefinition_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_GroupDefinition_Characteristic_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_GroupDefinition_Characteristic_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Code", "Value", "Exclude", "Period", });
    internal_static_google_fhir_r4_core_GroupDefinition_Characteristic_ValueX_descriptor =
      internal_static_google_fhir_r4_core_GroupDefinition_Characteristic_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_GroupDefinition_Characteristic_ValueX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_GroupDefinition_Characteristic_ValueX_descriptor,
        new java.lang.String[] { "CodeableConcept", "Boolean", "Quantity", "Range", "Reference", "Choice", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirPathMessageConstraint);
    registry.add(com.google.fhir.proto.Annotations.fhirProfileBase);
    registry.add(com.google.fhir.proto.Annotations.fhirStructureDefinitionUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirValuesetUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirVersion);
    registry.add(com.google.fhir.proto.Annotations.isChoiceType);
    registry.add(com.google.fhir.proto.Annotations.searchParameter);
    registry.add(com.google.fhir.proto.Annotations.structureDefinitionKind);
    registry.add(com.google.fhir.proto.Annotations.validReferenceType);
    registry.add(com.google.fhir.proto.Annotations.validationRequirement);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.fhir.proto.Annotations.getDescriptor();
    com.google.fhir.r4.core.Codes.getDescriptor();
    com.google.fhir.r4.core.Datatypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
