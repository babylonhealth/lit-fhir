// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/evidence.proto

package com.google.fhir.r4.core;

public final class EvidenceOuterClass {
  private EvidenceOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Evidence_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Evidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_Evidence_StatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Evidence_StatusCode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&proto/r4/core/resources/evidence.proto"
          + "\022\023google.fhir.r4.core\032\031google/protobuf/a"
          + "ny.proto\032\027proto/annotations.proto\032\031proto"
          + "/r4/core/codes.proto\032\035proto/r4/core/data"
          + "types.proto\"\330\021\n\010Evidence\022#\n\002id\030\001 \001(\0132\027.g"
          + "oogle.fhir.r4.core.Id\022\'\n\004meta\030\002 \001(\0132\031.go"
          + "ogle.fhir.r4.core.Meta\0220\n\016implicit_rules"
          + "\030\003 \001(\0132\030.google.fhir.r4.core.Uri\022+\n\010lang"
          + "uage\030\004 \001(\0132\031.google.fhir.r4.core.Code\022,\n"
          + "\004text\030\005 \001(\0132\036.google.fhir.r4.core.Narrat"
          + "ive\022\'\n\tcontained\030\006 \003(\0132\024.google.protobuf"
          + ".Any\0221\n\textension\030\010 \003(\0132\036.google.fhir.r4"
          + ".core.Extension\022:\n\022modifier_extension\030\t "
          + "\003(\0132\036.google.fhir.r4.core.Extension\022%\n\003u"
          + "rl\030\n \001(\0132\030.google.fhir.r4.core.Uri\0223\n\nid"
          + "entifier\030\013 \003(\0132\037.google.fhir.r4.core.Ide"
          + "ntifier\022,\n\007version\030\014 \001(\0132\033.google.fhir.r"
          + "4.core.String\022)\n\004name\030\r \001(\0132\033.google.fhi"
          + "r.r4.core.String\022*\n\005title\030\016 \001(\0132\033.google"
          + ".fhir.r4.core.String\0220\n\013short_title\030\017 \001("
          + "\0132\033.google.fhir.r4.core.String\022-\n\010subtit"
          + "le\030\020 \001(\0132\033.google.fhir.r4.core.String\022@\n"
          + "\006status\030\021 \001(\0132(.google.fhir.r4.core.Evid"
          + "ence.StatusCodeB\006\360\320\207\353\004\001\022+\n\004date\030\022 \001(\0132\035."
          + "google.fhir.r4.core.DateTime\022.\n\tpublishe"
          + "r\030\023 \001(\0132\033.google.fhir.r4.core.String\0223\n\007"
          + "contact\030\024 \003(\0132\".google.fhir.r4.core.Cont"
          + "actDetail\0222\n\013description\030\025 \001(\0132\035.google."
          + "fhir.r4.core.Markdown\022-\n\004note\030\026 \003(\0132\037.go"
          + "ogle.fhir.r4.core.Annotation\0226\n\013use_cont"
          + "ext\030\027 \003(\0132!.google.fhir.r4.core.UsageCon"
          + "text\022:\n\014jurisdiction\030\030 \003(\0132$.google.fhir"
          + ".r4.core.CodeableConcept\0220\n\tcopyright\030\031 "
          + "\001(\0132\035.google.fhir.r4.core.Markdown\0220\n\rap"
          + "proval_date\030\032 \001(\0132\031.google.fhir.r4.core."
          + "Date\0223\n\020last_review_date\030\033 \001(\0132\031.google."
          + "fhir.r4.core.Date\0225\n\020effective_period\030\034 "
          + "\001(\0132\033.google.fhir.r4.core.Period\0223\n\005topi"
          + "c\030\035 \003(\0132$.google.fhir.r4.core.CodeableCo"
          + "ncept\0222\n\006author\030\036 \003(\0132\".google.fhir.r4.c"
          + "ore.ContactDetail\0222\n\006editor\030\037 \003(\0132\".goog"
          + "le.fhir.r4.core.ContactDetail\0224\n\010reviewe"
          + "r\030  \003(\0132\".google.fhir.r4.core.ContactDet"
          + "ail\0224\n\010endorser\030! \003(\0132\".google.fhir.r4.c"
          + "ore.ContactDetail\022>\n\020related_artifact\030\" "
          + "\003(\0132$.google.fhir.r4.core.RelatedArtifac"
          + "t\022Y\n\023exposure_background\030# \001(\0132\036.google."
          + "fhir.r4.core.ReferenceB\034\360\320\207\353\004\001\362\377\374\302\006\020Evid"
          + "enceVariable\022P\n\020exposure_variant\030$ \003(\0132\036"
          + ".google.fhir.r4.core.ReferenceB\026\362\377\374\302\006\020Ev"
          + "idenceVariable\022G\n\007outcome\030% \003(\0132\036.google"
          + ".fhir.r4.core.ReferenceB\026\362\377\374\302\006\020EvidenceV"
          + "ariable\032\230\002\n\nStatusCode\022?\n\005value\030\001 \001(\01620."
          + "google.fhir.r4.core.PublicationStatusCod"
          + "e.Value\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4.cor"
          + "e.String\0221\n\textension\030\003 \003(\0132\036.google.fhi"
          + "r.r4.core.Extension:m\300\237\343\266\005\001\212\371\203\262\005/http://"
          + "hl7.org/fhir/ValueSet/publication-status"
          + "\232\265\216\223\006,http://hl7.org/fhir/StructureDefin"
          + "ition/code:<\300\237\343\266\005\003\262\376\344\227\0060http://hl7.org/f"
          + "hir/StructureDefinition/EvidenceJ\004\010\007\020\010B!"
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
    internal_static_google_fhir_r4_core_Evidence_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_Evidence_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Evidence_descriptor,
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
              "ExposureBackground",
              "ExposureVariant",
              "Outcome",
            });
    internal_static_google_fhir_r4_core_Evidence_StatusCode_descriptor =
        internal_static_google_fhir_r4_core_Evidence_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Evidence_StatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_Evidence_StatusCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
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
