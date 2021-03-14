// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/immunization.proto

package com.google.fhir.r4.core;

public final class ImmunizationOuterClass {
  private ImmunizationOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Immunization_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Immunization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Immunization_StatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Immunization_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Immunization_OccurrenceX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Immunization_OccurrenceX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Immunization_Performer_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Immunization_Performer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Immunization_Education_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Immunization_Education_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Immunization_Reaction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Immunization_Reaction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Immunization_ProtocolApplied_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Immunization_ProtocolApplied_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Immunization_ProtocolApplied_DoseNumberX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Immunization_ProtocolApplied_DoseNumberX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Immunization_ProtocolApplied_SeriesDosesX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Immunization_ProtocolApplied_SeriesDosesX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*proto/r4/core/resources/immunization.p"
          + "roto\022\023google.fhir.r4.core\032\031google/protob"
          + "uf/any.proto\032\027proto/annotations.proto\032\035p"
          + "roto/r4/core/datatypes.proto\032\035proto/r4/c"
          + "ore/valuesets.proto\"\355#\n\014Immunization\022#\n\002"
          + "id\030\001 \001(\0132\027.google.fhir.r4.core.Id\022\'\n\004met"
          + "a\030\002 \001(\0132\031.google.fhir.r4.core.Meta\0220\n\016im"
          + "plicit_rules\030\003 \001(\0132\030.google.fhir.r4.core"
          + ".Uri\022+\n\010language\030\004 \001(\0132\031.google.fhir.r4."
          + "core.Code\022,\n\004text\030\005 \001(\0132\036.google.fhir.r4"
          + ".core.Narrative\022\'\n\tcontained\030\006 \003(\0132\024.goo"
          + "gle.protobuf.Any\0221\n\textension\030\010 \003(\0132\036.go"
          + "ogle.fhir.r4.core.Extension\022:\n\022modifier_"
          + "extension\030\t \003(\0132\036.google.fhir.r4.core.Ex"
          + "tension\0223\n\nidentifier\030\n \003(\0132\037.google.fhi"
          + "r.r4.core.Identifier\022D\n\006status\030\013 \001(\0132,.g"
          + "oogle.fhir.r4.core.Immunization.StatusCo"
          + "deB\006\360\320\207\353\004\001\022;\n\rstatus_reason\030\014 \001(\0132$.goog"
          + "le.fhir.r4.core.CodeableConcept\022B\n\014vacci"
          + "ne_code\030\r \001(\0132$.google.fhir.r4.core.Code"
          + "ableConceptB\006\360\320\207\353\004\001\022D\n\007patient\030\016 \001(\0132\036.g"
          + "oogle.fhir.r4.core.ReferenceB\023\360\320\207\353\004\001\362\377\374\302"
          + "\006\007Patient\022B\n\tencounter\030\017 \001(\0132\036.google.fh"
          + "ir.r4.core.ReferenceB\017\362\377\374\302\006\tEncounter\022I\n"
          + "\noccurrence\030\020 \001(\0132-.google.fhir.r4.core."
          + "Immunization.OccurrenceXB\006\360\320\207\353\004\001\022/\n\010reco"
          + "rded\030\021 \001(\0132\035.google.fhir.r4.core.DateTim"
          + "e\0224\n\016primary_source\030\022 \001(\0132\034.google.fhir."
          + "r4.core.Boolean\022;\n\rreport_origin\030\023 \001(\0132$"
          + ".google.fhir.r4.core.CodeableConcept\022@\n\010"
          + "location\030\024 \001(\0132\036.google.fhir.r4.core.Ref"
          + "erenceB\016\362\377\374\302\006\010Location\022H\n\014manufacturer\030\025"
          + " \001(\0132\036.google.fhir.r4.core.ReferenceB\022\362\377"
          + "\374\302\006\014Organization\022/\n\nlot_number\030\026 \001(\0132\033.g"
          + "oogle.fhir.r4.core.String\0222\n\017expiration_"
          + "date\030\027 \001(\0132\031.google.fhir.r4.core.Date\0222\n"
          + "\004site\030\030 \001(\0132$.google.fhir.r4.core.Codeab"
          + "leConcept\0223\n\005route\030\031 \001(\0132$.google.fhir.r"
          + "4.core.CodeableConcept\022:\n\rdose_quantity\030"
          + "\032 \001(\0132#.google.fhir.r4.core.SimpleQuanti"
          + "ty\022>\n\tperformer\030\033 \003(\0132+.google.fhir.r4.c"
          + "ore.Immunization.Performer\022-\n\004note\030\034 \003(\013"
          + "2\037.google.fhir.r4.core.Annotation\0229\n\013rea"
          + "son_code\030\035 \003(\0132$.google.fhir.r4.core.Cod"
          + "eableConcept\022p\n\020reason_reference\030\036 \003(\0132\036"
          + ".google.fhir.r4.core.ReferenceB6\362\377\374\302\006\tCo"
          + "ndition\362\377\374\302\006\013Observation\362\377\374\302\006\020Diagnostic"
          + "Report\0222\n\014is_subpotent\030\037 \001(\0132\034.google.fh"
          + "ir.r4.core.Boolean\022>\n\020subpotent_reason\030 "
          + " \003(\0132$.google.fhir.r4.core.CodeableConce"
          + "pt\022>\n\teducation\030! \003(\0132+.google.fhir.r4.c"
          + "ore.Immunization.Education\022A\n\023program_el"
          + "igibility\030\" \003(\0132$.google.fhir.r4.core.Co"
          + "deableConcept\022<\n\016funding_source\030# \001(\0132$."
          + "google.fhir.r4.core.CodeableConcept\022<\n\010r"
          + "eaction\030$ \003(\0132*.google.fhir.r4.core.Immu"
          + "nization.Reaction\022K\n\020protocol_applied\030% "
          + "\003(\01321.google.fhir.r4.core.Immunization.P"
          + "rotocolApplied\032\243\002\n\nStatusCode\022I\n\005value\030\001"
          + " \001(\0162:.google.fhir.r4.core.ImmunizationS"
          + "tatusCodesValueSet.Value\022\'\n\002id\030\002 \001(\0132\033.g"
          + "oogle.fhir.r4.core.String\0221\n\textension\030\003"
          + " \003(\0132\036.google.fhir.r4.core.Extension:n\300\237"
          + "\343\266\005\001\212\371\203\262\0050http://hl7.org/fhir/ValueSet/i"
          + "mmunization-status\232\265\216\223\006,http://hl7.org/f"
          + "hir/StructureDefinition/code\032\220\001\n\013Occurre"
          + "nceX\0222\n\tdate_time\030\001 \001(\0132\035.google.fhir.r4"
          + ".core.DateTimeH\000\022;\n\014string_value\030\002 \001(\0132\033"
          + ".google.fhir.r4.core.StringH\000R\006string:\006\240"
          + "\203\203\350\006\001B\010\n\006choice\032\314\002\n\tPerformer\022\'\n\002id\030\001 \001("
          + "\0132\033.google.fhir.r4.core.String\0221\n\textens"
          + "ion\030\002 \003(\0132\036.google.fhir.r4.core.Extensio"
          + "n\022:\n\022modifier_extension\030\003 \003(\0132\036.google.f"
          + "hir.r4.core.Extension\0226\n\010function\030\004 \001(\0132"
          + "$.google.fhir.r4.core.CodeableConcept\022o\n"
          + "\005actor\030\005 \001(\0132\036.google.fhir.r4.core.Refer"
          + "enceB@\360\320\207\353\004\001\362\377\374\302\006\014Practitioner\362\377\374\302\006\020Prac"
          + "titionerRole\362\377\374\302\006\014Organization\032\252\003\n\tEduca"
          + "tion\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.core.S"
          + "tring\0221\n\textension\030\002 \003(\0132\036.google.fhir.r"
          + "4.core.Extension\022:\n\022modifier_extension\030\003"
          + " \003(\0132\036.google.fhir.r4.core.Extension\0222\n\r"
          + "document_type\030\004 \001(\0132\033.google.fhir.r4.cor"
          + "e.String\022+\n\treference\030\005 \001(\0132\030.google.fhi"
          + "r.r4.core.Uri\0227\n\020publication_date\030\006 \001(\0132"
          + "\035.google.fhir.r4.core.DateTime\0228\n\021presen"
          + "tation_date\030\007 \001(\0132\035.google.fhir.r4.core."
          + "DateTime:1\232\206\223\240\010+documentType.exists() or"
          + " reference.exists()\032\302\002\n\010Reaction\022\'\n\002id\030\001"
          + " \001(\0132\033.google.fhir.r4.core.String\0221\n\text"
          + "ension\030\002 \003(\0132\036.google.fhir.r4.core.Exten"
          + "sion\022:\n\022modifier_extension\030\003 \003(\0132\036.googl"
          + "e.fhir.r4.core.Extension\022+\n\004date\030\004 \001(\0132\035"
          + ".google.fhir.r4.core.DateTime\022A\n\006detail\030"
          + "\005 \001(\0132\036.google.fhir.r4.core.ReferenceB\021\362"
          + "\377\374\302\006\013Observation\022.\n\010reported\030\006 \001(\0132\034.goo"
          + "gle.fhir.r4.core.Boolean\032\300\006\n\017ProtocolApp"
          + "lied\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.core.S"
          + "tring\0221\n\textension\030\002 \003(\0132\036.google.fhir.r"
          + "4.core.Extension\022:\n\022modifier_extension\030\003"
          + " \003(\0132\036.google.fhir.r4.core.Extension\022+\n\006"
          + "series\030\004 \001(\0132\033.google.fhir.r4.core.Strin"
          + "g\022E\n\tauthority\030\005 \001(\0132\036.google.fhir.r4.co"
          + "re.ReferenceB\022\362\377\374\302\006\014Organization\022<\n\016targ"
          + "et_disease\030\006 \003(\0132$.google.fhir.r4.core.C"
          + "odeableConcept\022Z\n\013dose_number\030\007 \001(\0132=.go"
          + "ogle.fhir.r4.core.Immunization.ProtocolA"
          + "pplied.DoseNumberXB\006\360\320\207\353\004\001\022T\n\014series_dos"
          + "es\030\010 \001(\0132>.google.fhir.r4.core.Immunizat"
          + "ion.ProtocolApplied.SeriesDosesX\032\226\001\n\013Dos"
          + "eNumberX\0228\n\014positive_int\030\001 \001(\0132 .google."
          + "fhir.r4.core.PositiveIntH\000\022;\n\014string_val"
          + "ue\030\002 \001(\0132\033.google.fhir.r4.core.StringH\000R"
          + "\006string:\006\240\203\203\350\006\001B\010\n\006choice\032\227\001\n\014SeriesDose"
          + "sX\0228\n\014positive_int\030\001 \001(\0132 .google.fhir.r"
          + "4.core.PositiveIntH\000\022;\n\014string_value\030\002 \001"
          + "(\0132\033.google.fhir.r4.core.StringH\000R\006strin"
          + "g:\006\240\203\203\350\006\001B\010\n\006choice:@\300\237\343\266\005\003\262\376\344\227\0064http://"
          + "hl7.org/fhir/StructureDefinition/Immuniz"
          + "ationJ\004\010\007\020\010B!\n\027com.google.fhir.r4.coreP\001"
          + "\230\306\260\265\007\004b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.fhir.proto.Annotations.getDescriptor(),
              com.google.fhir.r4.core.Datatypes.getDescriptor(),
              com.google.fhir.r4.core.Valuesets.getDescriptor(),
            });
    internal_static_google_fhir_r4_core_Immunization_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_Immunization_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Immunization_descriptor,
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
              "StatusReason",
              "VaccineCode",
              "Patient",
              "Encounter",
              "Occurrence",
              "Recorded",
              "PrimarySource",
              "ReportOrigin",
              "Location",
              "Manufacturer",
              "LotNumber",
              "ExpirationDate",
              "Site",
              "Route",
              "DoseQuantity",
              "Performer",
              "Note",
              "ReasonCode",
              "ReasonReference",
              "IsSubpotent",
              "SubpotentReason",
              "Education",
              "ProgramEligibility",
              "FundingSource",
              "Reaction",
              "ProtocolApplied",
            });
    internal_static_google_fhir_r4_core_Immunization_StatusCode_descriptor =
        internal_static_google_fhir_r4_core_Immunization_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Immunization_StatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Immunization_StatusCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_Immunization_OccurrenceX_descriptor =
        internal_static_google_fhir_r4_core_Immunization_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_Immunization_OccurrenceX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Immunization_OccurrenceX_descriptor,
            new java.lang.String[] {
              "DateTime", "StringValue", "Choice",
            });
    internal_static_google_fhir_r4_core_Immunization_Performer_descriptor =
        internal_static_google_fhir_r4_core_Immunization_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_Immunization_Performer_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Immunization_Performer_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Function", "Actor",
            });
    internal_static_google_fhir_r4_core_Immunization_Education_descriptor =
        internal_static_google_fhir_r4_core_Immunization_descriptor.getNestedTypes().get(3);
    internal_static_google_fhir_r4_core_Immunization_Education_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Immunization_Education_descriptor,
            new java.lang.String[] {
              "Id",
              "Extension",
              "ModifierExtension",
              "DocumentType",
              "Reference",
              "PublicationDate",
              "PresentationDate",
            });
    internal_static_google_fhir_r4_core_Immunization_Reaction_descriptor =
        internal_static_google_fhir_r4_core_Immunization_descriptor.getNestedTypes().get(4);
    internal_static_google_fhir_r4_core_Immunization_Reaction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Immunization_Reaction_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Date", "Detail", "Reported",
            });
    internal_static_google_fhir_r4_core_Immunization_ProtocolApplied_descriptor =
        internal_static_google_fhir_r4_core_Immunization_descriptor.getNestedTypes().get(5);
    internal_static_google_fhir_r4_core_Immunization_ProtocolApplied_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Immunization_ProtocolApplied_descriptor,
            new java.lang.String[] {
              "Id",
              "Extension",
              "ModifierExtension",
              "Series",
              "Authority",
              "TargetDisease",
              "DoseNumber",
              "SeriesDoses",
            });
    internal_static_google_fhir_r4_core_Immunization_ProtocolApplied_DoseNumberX_descriptor =
        internal_static_google_fhir_r4_core_Immunization_ProtocolApplied_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_Immunization_ProtocolApplied_DoseNumberX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Immunization_ProtocolApplied_DoseNumberX_descriptor,
            new java.lang.String[] {
              "PositiveInt", "StringValue", "Choice",
            });
    internal_static_google_fhir_r4_core_Immunization_ProtocolApplied_SeriesDosesX_descriptor =
        internal_static_google_fhir_r4_core_Immunization_ProtocolApplied_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_fhir_r4_core_Immunization_ProtocolApplied_SeriesDosesX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Immunization_ProtocolApplied_SeriesDosesX_descriptor,
            new java.lang.String[] {
              "PositiveInt", "StringValue", "Choice",
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
    com.google.fhir.r4.core.Datatypes.getDescriptor();
    com.google.fhir.r4.core.Valuesets.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}