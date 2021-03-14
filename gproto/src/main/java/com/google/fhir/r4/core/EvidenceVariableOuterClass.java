// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/evidence_variable.proto

package com.google.fhir.r4.core;

public final class EvidenceVariableOuterClass {
  private EvidenceVariableOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_EvidenceVariable_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_EvidenceVariable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_EvidenceVariable_StatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_EvidenceVariable_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_EvidenceVariable_TypeCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_EvidenceVariable_TypeCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_DefinitionX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_DefinitionX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_ParticipantEffectiveX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_ParticipantEffectiveX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_GroupMeasureCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_GroupMeasureCode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/proto/r4/core/resources/evidence_varia"
          + "ble.proto\022\023google.fhir.r4.core\032\031google/p"
          + "rotobuf/any.proto\032\027proto/annotations.pro"
          + "to\032\031proto/r4/core/codes.proto\032\035proto/r4/"
          + "core/datatypes.proto\"\354\037\n\020EvidenceVariabl"
          + "e\022#\n\002id\030\001 \001(\0132\027.google.fhir.r4.core.Id\022\'"
          + "\n\004meta\030\002 \001(\0132\031.google.fhir.r4.core.Meta\022"
          + "0\n\016implicit_rules\030\003 \001(\0132\030.google.fhir.r4"
          + ".core.Uri\022+\n\010language\030\004 \001(\0132\031.google.fhi"
          + "r.r4.core.Code\022,\n\004text\030\005 \001(\0132\036.google.fh"
          + "ir.r4.core.Narrative\022\'\n\tcontained\030\006 \003(\0132"
          + "\024.google.protobuf.Any\0221\n\textension\030\010 \003(\013"
          + "2\036.google.fhir.r4.core.Extension\022:\n\022modi"
          + "fier_extension\030\t \003(\0132\036.google.fhir.r4.co"
          + "re.Extension\022%\n\003url\030\n \001(\0132\030.google.fhir."
          + "r4.core.Uri\0223\n\nidentifier\030\013 \003(\0132\037.google"
          + ".fhir.r4.core.Identifier\022,\n\007version\030\014 \001("
          + "\0132\033.google.fhir.r4.core.String\022)\n\004name\030\r"
          + " \001(\0132\033.google.fhir.r4.core.String\022*\n\005tit"
          + "le\030\016 \001(\0132\033.google.fhir.r4.core.String\0220\n"
          + "\013short_title\030\017 \001(\0132\033.google.fhir.r4.core"
          + ".String\022-\n\010subtitle\030\020 \001(\0132\033.google.fhir."
          + "r4.core.String\022H\n\006status\030\021 \001(\01320.google."
          + "fhir.r4.core.EvidenceVariable.StatusCode"
          + "B\006\360\320\207\353\004\001\022+\n\004date\030\022 \001(\0132\035.google.fhir.r4."
          + "core.DateTime\022.\n\tpublisher\030\023 \001(\0132\033.googl"
          + "e.fhir.r4.core.String\0223\n\007contact\030\024 \003(\0132\""
          + ".google.fhir.r4.core.ContactDetail\0222\n\013de"
          + "scription\030\025 \001(\0132\035.google.fhir.r4.core.Ma"
          + "rkdown\022-\n\004note\030\026 \003(\0132\037.google.fhir.r4.co"
          + "re.Annotation\0226\n\013use_context\030\027 \003(\0132!.goo"
          + "gle.fhir.r4.core.UsageContext\022:\n\014jurisdi"
          + "ction\030\030 \003(\0132$.google.fhir.r4.core.Codeab"
          + "leConcept\0220\n\tcopyright\030\031 \001(\0132\035.google.fh"
          + "ir.r4.core.Markdown\0220\n\rapproval_date\030\032 \001"
          + "(\0132\031.google.fhir.r4.core.Date\0223\n\020last_re"
          + "view_date\030\033 \001(\0132\031.google.fhir.r4.core.Da"
          + "te\0225\n\020effective_period\030\034 \001(\0132\033.google.fh"
          + "ir.r4.core.Period\0223\n\005topic\030\035 \003(\0132$.googl"
          + "e.fhir.r4.core.CodeableConcept\0222\n\006author"
          + "\030\036 \003(\0132\".google.fhir.r4.core.ContactDeta"
          + "il\0222\n\006editor\030\037 \003(\0132\".google.fhir.r4.core"
          + ".ContactDetail\0224\n\010reviewer\030  \003(\0132\".googl"
          + "e.fhir.r4.core.ContactDetail\0224\n\010endorser"
          + "\030! \003(\0132\".google.fhir.r4.core.ContactDeta"
          + "il\022>\n\020related_artifact\030\" \003(\0132$.google.fh"
          + "ir.r4.core.RelatedArtifact\022<\n\004type\030# \001(\013"
          + "2..google.fhir.r4.core.EvidenceVariable."
          + "TypeCode\022T\n\016characteristic\030$ \003(\01324.googl"
          + "e.fhir.r4.core.EvidenceVariable.Characte"
          + "risticB\006\360\320\207\353\004\001\032\230\002\n\nStatusCode\022?\n\005value\030\001"
          + " \001(\01620.google.fhir.r4.core.PublicationSt"
          + "atusCode.Value\022\'\n\002id\030\002 \001(\0132\033.google.fhir"
          + ".r4.core.String\0221\n\textension\030\003 \003(\0132\036.goo"
          + "gle.fhir.r4.core.Extension:m\300\237\343\266\005\001\212\371\203\262\005/"
          + "http://hl7.org/fhir/ValueSet/publication"
          + "-status\232\265\216\223\006,http://hl7.org/fhir/Structu"
          + "reDefinition/code\032\224\002\n\010TypeCode\022B\n\005value\030"
          + "\001 \001(\01623.google.fhir.r4.core.EvidenceVari"
          + "ableTypeCode.Value\022\'\n\002id\030\002 \001(\0132\033.google."
          + "fhir.r4.core.String\0221\n\textension\030\003 \003(\0132\036"
          + ".google.fhir.r4.core.Extension:h\300\237\343\266\005\001\212\371"
          + "\203\262\005*http://hl7.org/fhir/ValueSet/variabl"
          + "e-type\232\265\216\223\006,http://hl7.org/fhir/Structur"
          + "eDefinition/code\032\304\014\n\016Characteristic\022\'\n\002i"
          + "d\030\001 \001(\0132\033.google.fhir.r4.core.String\0221\n\t"
          + "extension\030\002 \003(\0132\036.google.fhir.r4.core.Ex"
          + "tension\022:\n\022modifier_extension\030\003 \003(\0132\036.go"
          + "ogle.fhir.r4.core.Extension\0220\n\013descripti"
          + "on\030\004 \001(\0132\033.google.fhir.r4.core.String\022\\\n"
          + "\ndefinition\030\005 \001(\0132@.google.fhir.r4.core."
          + "EvidenceVariable.Characteristic.Definiti"
          + "onXB\006\360\320\207\353\004\001\0228\n\rusage_context\030\006 \003(\0132!.goo"
          + "gle.fhir.r4.core.UsageContext\022-\n\007exclude"
          + "\030\007 \001(\0132\034.google.fhir.r4.core.Boolean\022i\n\025"
          + "participant_effective\030\010 \001(\0132J.google.fhi"
          + "r.r4.core.EvidenceVariable.Characteristi"
          + "c.ParticipantEffectiveX\0226\n\017time_from_sta"
          + "rt\030\t \001(\0132\035.google.fhir.r4.core.Duration\022"
          + "\\\n\rgroup_measure\030\n \001(\0132E.google.fhir.r4."
          + "core.EvidenceVariable.Characteristic.Gro"
          + "upMeasureCode\032\227\003\n\013DefinitionX\022@\n\treferen"
          + "ce\030\001 \001(\0132\036.google.fhir.r4.core.Reference"
          + "B\013\362\377\374\302\006\005GroupH\000\0223\n\tcanonical\030\002 \001(\0132\036.goo"
          + "gle.fhir.r4.core.CanonicalH\000\022@\n\020codeable"
          + "_concept\030\003 \001(\0132$.google.fhir.r4.core.Cod"
          + "eableConceptH\000\0225\n\nexpression\030\004 \001(\0132\037.goo"
          + "gle.fhir.r4.core.ExpressionH\000\022@\n\020data_re"
          + "quirement\030\005 \001(\0132$.google.fhir.r4.core.Da"
          + "taRequirementH\000\022D\n\022trigger_definition\030\006 "
          + "\001(\0132&.google.fhir.r4.core.TriggerDefinit"
          + "ionH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\356\001\n\025ParticipantE"
          + "ffectiveX\0222\n\tdate_time\030\001 \001(\0132\035.google.fh"
          + "ir.r4.core.DateTimeH\000\022-\n\006period\030\002 \001(\0132\033."
          + "google.fhir.r4.core.PeriodH\000\0221\n\010duration"
          + "\030\003 \001(\0132\035.google.fhir.r4.core.DurationH\000\022"
          + "-\n\006timing\030\004 \001(\0132\033.google.fhir.r4.core.Ti"
          + "mingH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\224\002\n\020GroupMeasur"
          + "eCode\022:\n\005value\030\001 \001(\0162+.google.fhir.r4.co"
          + "re.GroupMeasureCode.Value\022\'\n\002id\030\002 \001(\0132\033."
          + "google.fhir.r4.core.String\0221\n\textension\030"
          + "\003 \003(\0132\036.google.fhir.r4.core.Extension:h\300"
          + "\237\343\266\005\001\212\371\203\262\005*http://hl7.org/fhir/ValueSet/"
          + "group-measure\232\265\216\223\006,http://hl7.org/fhir/S"
          + "tructureDefinition/code:D\300\237\343\266\005\003\262\376\344\227\0068htt"
          + "p://hl7.org/fhir/StructureDefinition/Evi"
          + "denceVariableJ\004\010\007\020\010B!\n\027com.google.fhir.r"
          + "4.coreP\001\230\306\260\265\007\004b\006proto3"
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
    internal_static_google_fhir_r4_core_EvidenceVariable_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_EvidenceVariable_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_EvidenceVariable_descriptor,
            new java.lang.String[] {
              "Id",
              "Meta",
              "ImplicitRules",
              "Language",
              "Text",
              "Contained",
              "Extension",
              "ModifierExtension",
              "Url",
              "Identifier",
              "Version",
              "Name",
              "Title",
              "ShortTitle",
              "Subtitle",
              "Status",
              "Date",
              "Publisher",
              "Contact",
              "Description",
              "Note",
              "UseContext",
              "Jurisdiction",
              "Copyright",
              "ApprovalDate",
              "LastReviewDate",
              "EffectivePeriod",
              "Topic",
              "Author",
              "Editor",
              "Reviewer",
              "Endorser",
              "RelatedArtifact",
              "Type",
              "Characteristic",
            });
    internal_static_google_fhir_r4_core_EvidenceVariable_StatusCode_descriptor =
        internal_static_google_fhir_r4_core_EvidenceVariable_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_EvidenceVariable_StatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_EvidenceVariable_StatusCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_EvidenceVariable_TypeCode_descriptor =
        internal_static_google_fhir_r4_core_EvidenceVariable_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_EvidenceVariable_TypeCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_EvidenceVariable_TypeCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_descriptor =
        internal_static_google_fhir_r4_core_EvidenceVariable_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_descriptor,
            new java.lang.String[] {
              "Id",
              "Extension",
              "ModifierExtension",
              "Description",
              "Definition",
              "UsageContext",
              "Exclude",
              "ParticipantEffective",
              "TimeFromStart",
              "GroupMeasure",
            });
    internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_DefinitionX_descriptor =
        internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_DefinitionX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_DefinitionX_descriptor,
            new java.lang.String[] {
              "Reference",
              "Canonical",
              "CodeableConcept",
              "Expression",
              "DataRequirement",
              "TriggerDefinition",
              "Choice",
            });
    internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_ParticipantEffectiveX_descriptor =
        internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_ParticipantEffectiveX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_ParticipantEffectiveX_descriptor,
            new java.lang.String[] {
              "DateTime", "Period", "Duration", "Timing", "Choice",
            });
    internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_GroupMeasureCode_descriptor =
        internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_GroupMeasureCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_EvidenceVariable_Characteristic_GroupMeasureCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
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