// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/patient.proto

package com.google.fhir.r4.core;

public final class PatientOuterClass {
  private PatientOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Patient_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Patient_GenderCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_GenderCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Patient_DeceasedX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_DeceasedX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Patient_MultipleBirthX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_MultipleBirthX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Patient_Contact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_Contact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Patient_Contact_GenderCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_Contact_GenderCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Patient_Communication_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_Communication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Patient_Link_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_Link_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Patient_Link_TypeCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_Link_TypeCode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%proto/r4/core/resources/patient.proto\022"
          + "\023google.fhir.r4.core\032\031google/protobuf/an"
          + "y.proto\032\027proto/annotations.proto\032\031proto/"
          + "r4/core/codes.proto\032\035proto/r4/core/datat"
          + "ypes.proto\"\251\035\n\007Patient\022#\n\002id\030\001 \001(\0132\027.goo"
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
          + "tifier\022,\n\006active\030\013 \001(\0132\034.google.fhir.r4."
          + "core.Boolean\022,\n\004name\030\014 \003(\0132\036.google.fhir"
          + ".r4.core.HumanName\0222\n\007telecom\030\r \003(\0132!.go"
          + "ogle.fhir.r4.core.ContactPoint\0227\n\006gender"
          + "\030\016 \001(\0132\'.google.fhir.r4.core.Patient.Gen"
          + "derCode\022-\n\nbirth_date\030\017 \001(\0132\031.google.fhi"
          + "r.r4.core.Date\0228\n\010deceased\030\020 \001(\0132&.googl"
          + "e.fhir.r4.core.Patient.DeceasedX\022-\n\007addr"
          + "ess\030\021 \003(\0132\034.google.fhir.r4.core.Address\022"
          + "<\n\016marital_status\030\022 \001(\0132$.google.fhir.r4"
          + ".core.CodeableConcept\022C\n\016multiple_birth\030"
          + "\023 \001(\0132+.google.fhir.r4.core.Patient.Mult"
          + "ipleBirthX\022.\n\005photo\030\024 \003(\0132\037.google.fhir."
          + "r4.core.Attachment\0225\n\007contact\030\025 \003(\0132$.go"
          + "ogle.fhir.r4.core.Patient.Contact\022A\n\rcom"
          + "munication\030\026 \003(\0132*.google.fhir.r4.core.P"
          + "atient.Communication\022x\n\024general_practiti"
          + "oner\030\027 \003(\0132\036.google.fhir.r4.core.Referen"
          + "ceB:\362\377\374\302\006\014Organization\362\377\374\302\006\014Practitioner"
          + "\362\377\374\302\006\020PractitionerRole\022Q\n\025managing_organ"
          + "ization\030\030 \001(\0132\036.google.fhir.r4.core.Refe"
          + "renceB\022\362\377\374\302\006\014Organization\022/\n\004link\030\031 \003(\0132"
          + "!.google.fhir.r4.core.Patient.Link\032\236\002\n\nG"
          + "enderCode\022B\n\005value\030\001 \001(\01623.google.fhir.r"
          + "4.core.AdministrativeGenderCode.Value\022\'\n"
          + "\002id\030\002 \001(\0132\033.google.fhir.r4.core.String\0221"
          + "\n\textension\030\003 \003(\0132\036.google.fhir.r4.core."
          + "Extension:p\300\237\343\266\005\001\212\371\203\262\0052http://hl7.org/fh"
          + "ir/ValueSet/administrative-gender\232\265\216\223\006,h"
          + "ttp://hl7.org/fhir/StructureDefinition/c"
          + "ode\032\202\001\n\tDeceasedX\022/\n\007boolean\030\001 \001(\0132\034.goo"
          + "gle.fhir.r4.core.BooleanH\000\0222\n\tdate_time\030"
          + "\002 \001(\0132\035.google.fhir.r4.core.DateTimeH\000:\006"
          + "\240\203\203\350\006\001B\010\n\006choice\032\204\001\n\016MultipleBirthX\022/\n\007b"
          + "oolean\030\001 \001(\0132\034.google.fhir.r4.core.Boole"
          + "anH\000\022/\n\007integer\030\002 \001(\0132\034.google.fhir.r4.c"
          + "ore.IntegerH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\235\007\n\007Cont"
          + "act\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.core.St"
          + "ring\0221\n\textension\030\002 \003(\0132\036.google.fhir.r4"
          + ".core.Extension\022:\n\022modifier_extension\030\003 "
          + "\003(\0132\036.google.fhir.r4.core.Extension\022:\n\014r"
          + "elationship\030\004 \003(\0132$.google.fhir.r4.core."
          + "CodeableConcept\022,\n\004name\030\005 \001(\0132\036.google.f"
          + "hir.r4.core.HumanName\0222\n\007telecom\030\006 \003(\0132!"
          + ".google.fhir.r4.core.ContactPoint\022-\n\007add"
          + "ress\030\007 \001(\0132\034.google.fhir.r4.core.Address"
          + "\022?\n\006gender\030\010 \001(\0132/.google.fhir.r4.core.P"
          + "atient.Contact.GenderCode\022H\n\014organizatio"
          + "n\030\t \001(\0132\036.google.fhir.r4.core.ReferenceB"
          + "\022\362\377\374\302\006\014Organization\022+\n\006period\030\n \001(\0132\033.go"
          + "ogle.fhir.r4.core.Period\032\236\002\n\nGenderCode\022"
          + "B\n\005value\030\001 \001(\01623.google.fhir.r4.core.Adm"
          + "inistrativeGenderCode.Value\022\'\n\002id\030\002 \001(\0132"
          + "\033.google.fhir.r4.core.String\0221\n\textensio"
          + "n\030\003 \003(\0132\036.google.fhir.r4.core.Extension:"
          + "p\300\237\343\266\005\001\212\371\203\262\0052http://hl7.org/fhir/ValueSe"
          + "t/administrative-gender\232\265\216\223\006,http://hl7."
          + "org/fhir/StructureDefinition/code:T\232\206\223\240\010"
          + "Nname.exists() or telecom.exists() or ad"
          + "dress.exists() or organization.exists()\032"
          + "\230\002\n\rCommunication\022\'\n\002id\030\001 \001(\0132\033.google.f"
          + "hir.r4.core.String\0221\n\textension\030\002 \003(\0132\036."
          + "google.fhir.r4.core.Extension\022:\n\022modifie"
          + "r_extension\030\003 \003(\0132\036.google.fhir.r4.core."
          + "Extension\022>\n\010language\030\004 \001(\0132$.google.fhi"
          + "r.r4.core.CodeableConceptB\006\360\320\207\353\004\001\022/\n\tpre"
          + "ferred\030\005 \001(\0132\034.google.fhir.r4.core.Boole"
          + "an\032\276\004\n\004Link\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4"
          + ".core.String\0221\n\textension\030\002 \003(\0132\036.google"
          + ".fhir.r4.core.Extension\022:\n\022modifier_exte"
          + "nsion\030\003 \003(\0132\036.google.fhir.r4.core.Extens"
          + "ion\022U\n\005other\030\004 \001(\0132\036.google.fhir.r4.core"
          + ".ReferenceB&\360\320\207\353\004\001\362\377\374\302\006\007Patient\362\377\374\302\006\rRel"
          + "atedPerson\022@\n\004type\030\005 \001(\0132*.google.fhir.r"
          + "4.core.Patient.Link.TypeCodeB\006\360\320\207\353\004\001\032\204\002\n"
          + "\010TypeCode\0226\n\005value\030\001 \001(\0162\'.google.fhir.r"
          + "4.core.LinkTypeCode.Value\022\'\n\002id\030\002 \001(\0132\033."
          + "google.fhir.r4.core.String\0221\n\textension\030"
          + "\003 \003(\0132\036.google.fhir.r4.core.Extension:d\300"
          + "\237\343\266\005\001\212\371\203\262\005&http://hl7.org/fhir/ValueSet/"
          + "link-type\232\265\216\223\006,http://hl7.org/fhir/Struc"
          + "tureDefinition/code:;\300\237\343\266\005\003\262\376\344\227\006/http://"
          + "hl7.org/fhir/StructureDefinition/Patient"
          + "J\004\010\007\020\010B!\n\027com.google.fhir.r4.coreP\001\230\306\260\265\007"
          + "\004b\006proto3"
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
    internal_static_google_fhir_r4_core_Patient_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_Patient_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Patient_descriptor,
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
              "Name",
              "Telecom",
              "Gender",
              "BirthDate",
              "Deceased",
              "Address",
              "MaritalStatus",
              "MultipleBirth",
              "Photo",
              "Contact",
              "Communication",
              "GeneralPractitioner",
              "ManagingOrganization",
              "Link",
            });
    internal_static_google_fhir_r4_core_Patient_GenderCode_descriptor =
        internal_static_google_fhir_r4_core_Patient_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Patient_GenderCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Patient_GenderCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_Patient_DeceasedX_descriptor =
        internal_static_google_fhir_r4_core_Patient_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_Patient_DeceasedX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Patient_DeceasedX_descriptor,
            new java.lang.String[] {
              "Boolean", "DateTime", "Choice",
            });
    internal_static_google_fhir_r4_core_Patient_MultipleBirthX_descriptor =
        internal_static_google_fhir_r4_core_Patient_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_Patient_MultipleBirthX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Patient_MultipleBirthX_descriptor,
            new java.lang.String[] {
              "Boolean", "Integer", "Choice",
            });
    internal_static_google_fhir_r4_core_Patient_Contact_descriptor =
        internal_static_google_fhir_r4_core_Patient_descriptor.getNestedTypes().get(3);
    internal_static_google_fhir_r4_core_Patient_Contact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Patient_Contact_descriptor,
            new java.lang.String[] {
              "Id",
              "Extension",
              "ModifierExtension",
              "Relationship",
              "Name",
              "Telecom",
              "Address",
              "Gender",
              "Organization",
              "Period",
            });
    internal_static_google_fhir_r4_core_Patient_Contact_GenderCode_descriptor =
        internal_static_google_fhir_r4_core_Patient_Contact_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Patient_Contact_GenderCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Patient_Contact_GenderCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_Patient_Communication_descriptor =
        internal_static_google_fhir_r4_core_Patient_descriptor.getNestedTypes().get(4);
    internal_static_google_fhir_r4_core_Patient_Communication_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Patient_Communication_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Language", "Preferred",
            });
    internal_static_google_fhir_r4_core_Patient_Link_descriptor =
        internal_static_google_fhir_r4_core_Patient_descriptor.getNestedTypes().get(5);
    internal_static_google_fhir_r4_core_Patient_Link_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Patient_Link_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Other", "Type",
            });
    internal_static_google_fhir_r4_core_Patient_Link_TypeCode_descriptor =
        internal_static_google_fhir_r4_core_Patient_Link_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Patient_Link_TypeCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Patient_Link_TypeCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
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