// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/event_definition.proto

package com.google.fhir.r4.core;

public final class EventDefinitionOuterClass {
  private EventDefinitionOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_EventDefinition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_EventDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_EventDefinition_StatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_EventDefinition_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_EventDefinition_SubjectX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_EventDefinition_SubjectX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.proto/r4/core/resources/event_definiti"
          + "on.proto\022\023google.fhir.r4.core\032\031google/pr"
          + "otobuf/any.proto\032\027proto/annotations.prot"
          + "o\032\031proto/r4/core/codes.proto\032\035proto/r4/c"
          + "ore/datatypes.proto\"\312\022\n\017EventDefinition\022"
          + "#\n\002id\030\001 \001(\0132\027.google.fhir.r4.core.Id\022\'\n\004"
          + "meta\030\002 \001(\0132\031.google.fhir.r4.core.Meta\0220\n"
          + "\016implicit_rules\030\003 \001(\0132\030.google.fhir.r4.c"
          + "ore.Uri\022+\n\010language\030\004 \001(\0132\031.google.fhir."
          + "r4.core.Code\022,\n\004text\030\005 \001(\0132\036.google.fhir"
          + ".r4.core.Narrative\022\'\n\tcontained\030\006 \003(\0132\024."
          + "google.protobuf.Any\0221\n\textension\030\010 \003(\0132\036"
          + ".google.fhir.r4.core.Extension\022:\n\022modifi"
          + "er_extension\030\t \003(\0132\036.google.fhir.r4.core"
          + ".Extension\022%\n\003url\030\n \001(\0132\030.google.fhir.r4"
          + ".core.Uri\0223\n\nidentifier\030\013 \003(\0132\037.google.f"
          + "hir.r4.core.Identifier\022,\n\007version\030\014 \001(\0132"
          + "\033.google.fhir.r4.core.String\022)\n\004name\030\r \001"
          + "(\0132\033.google.fhir.r4.core.String\022*\n\005title"
          + "\030\016 \001(\0132\033.google.fhir.r4.core.String\022-\n\010s"
          + "ubtitle\030\017 \001(\0132\033.google.fhir.r4.core.Stri"
          + "ng\022G\n\006status\030\020 \001(\0132/.google.fhir.r4.core"
          + ".EventDefinition.StatusCodeB\006\360\320\207\353\004\001\0222\n\014e"
          + "xperimental\030\021 \001(\0132\034.google.fhir.r4.core."
          + "Boolean\022>\n\007subject\030\022 \001(\0132-.google.fhir.r"
          + "4.core.EventDefinition.SubjectX\022+\n\004date\030"
          + "\023 \001(\0132\035.google.fhir.r4.core.DateTime\022.\n\t"
          + "publisher\030\024 \001(\0132\033.google.fhir.r4.core.St"
          + "ring\0223\n\007contact\030\025 \003(\0132\".google.fhir.r4.c"
          + "ore.ContactDetail\0222\n\013description\030\026 \001(\0132\035"
          + ".google.fhir.r4.core.Markdown\0226\n\013use_con"
          + "text\030\027 \003(\0132!.google.fhir.r4.core.UsageCo"
          + "ntext\022:\n\014jurisdiction\030\030 \003(\0132$.google.fhi"
          + "r.r4.core.CodeableConcept\022.\n\007purpose\030\031 \001"
          + "(\0132\035.google.fhir.r4.core.Markdown\022*\n\005usa"
          + "ge\030\032 \001(\0132\033.google.fhir.r4.core.String\0220\n"
          + "\tcopyright\030\033 \001(\0132\035.google.fhir.r4.core.M"
          + "arkdown\0220\n\rapproval_date\030\034 \001(\0132\031.google."
          + "fhir.r4.core.Date\0223\n\020last_review_date\030\035 "
          + "\001(\0132\031.google.fhir.r4.core.Date\0225\n\020effect"
          + "ive_period\030\036 \001(\0132\033.google.fhir.r4.core.P"
          + "eriod\0223\n\005topic\030\037 \003(\0132$.google.fhir.r4.co"
          + "re.CodeableConcept\0222\n\006author\030  \003(\0132\".goo"
          + "gle.fhir.r4.core.ContactDetail\0222\n\006editor"
          + "\030! \003(\0132\".google.fhir.r4.core.ContactDeta"
          + "il\0224\n\010reviewer\030\" \003(\0132\".google.fhir.r4.co"
          + "re.ContactDetail\0224\n\010endorser\030# \003(\0132\".goo"
          + "gle.fhir.r4.core.ContactDetail\022>\n\020relate"
          + "d_artifact\030$ \003(\0132$.google.fhir.r4.core.R"
          + "elatedArtifact\022?\n\007trigger\030% \003(\0132&.google"
          + ".fhir.r4.core.TriggerDefinitionB\006\360\320\207\353\004\001\032"
          + "\230\002\n\nStatusCode\022?\n\005value\030\001 \001(\01620.google.f"
          + "hir.r4.core.PublicationStatusCode.Value\022"
          + "\'\n\002id\030\002 \001(\0132\033.google.fhir.r4.core.String"
          + "\0221\n\textension\030\003 \003(\0132\036.google.fhir.r4.cor"
          + "e.Extension:m\300\237\343\266\005\001\212\371\203\262\005/http://hl7.org/"
          + "fhir/ValueSet/publication-status\232\265\216\223\006,ht"
          + "tp://hl7.org/fhir/StructureDefinition/co"
          + "de\032\240\001\n\010SubjectX\022@\n\020codeable_concept\030\001 \001("
          + "\0132$.google.fhir.r4.core.CodeableConceptH"
          + "\000\022@\n\treference\030\002 \001(\0132\036.google.fhir.r4.co"
          + "re.ReferenceB\013\362\377\374\302\006\005GroupH\000:\006\240\203\203\350\006\001B\010\n\006c"
          + "hoice:C\300\237\343\266\005\003\262\376\344\227\0067http://hl7.org/fhir/S"
          + "tructureDefinition/EventDefinitionJ\004\010\007\020\010"
          + "B!\n\027com.google.fhir.r4.coreP\001\230\306\260\265\007\004b\006pro"
          + "to3"
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
    internal_static_google_fhir_r4_core_EventDefinition_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_EventDefinition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_EventDefinition_descriptor,
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
              "Subtitle",
              "Status",
              "Experimental",
              "Subject",
              "Date",
              "Publisher",
              "Contact",
              "Description",
              "UseContext",
              "Jurisdiction",
              "Purpose",
              "Usage",
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
              "Trigger",
            });
    internal_static_google_fhir_r4_core_EventDefinition_StatusCode_descriptor =
        internal_static_google_fhir_r4_core_EventDefinition_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_EventDefinition_StatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_EventDefinition_StatusCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_EventDefinition_SubjectX_descriptor =
        internal_static_google_fhir_r4_core_EventDefinition_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_EventDefinition_SubjectX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_EventDefinition_SubjectX_descriptor,
            new java.lang.String[] {
              "CodeableConcept", "Reference", "Choice",
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