// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/profiles/shareable_activity_definition.proto

package com.google.fhir.r4.core;

public final class ShareableActivityDefinitionOuterClass {
  private ShareableActivityDefinitionOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_StatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_SubjectX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_SubjectX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_KindCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_KindCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_IntentCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_IntentCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_PriorityCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_PriorityCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_TimingX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_TimingX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_TypeCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_TypeCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_ProductX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_ProductX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_DynamicValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_DynamicValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:proto/r4/core/profiles/shareable_activ"
          + "ity_definition.proto\022\023google.fhir.r4.cor"
          + "e\032\031google/protobuf/any.proto\032\027proto/anno"
          + "tations.proto\032\031proto/r4/core/codes.proto"
          + "\032\035proto/r4/core/datatypes.proto\"\370.\n\033Shar"
          + "eableActivityDefinition\022#\n\002id\030\001 \001(\0132\027.go"
          + "ogle.fhir.r4.core.Id\022\'\n\004meta\030\002 \001(\0132\031.goo"
          + "gle.fhir.r4.core.Meta\0220\n\016implicit_rules\030"
          + "\003 \001(\0132\030.google.fhir.r4.core.Uri\022+\n\010langu"
          + "age\030\004 \001(\0132\031.google.fhir.r4.core.Code\022,\n\004"
          + "text\030\005 \001(\0132\036.google.fhir.r4.core.Narrati"
          + "ve\022\'\n\tcontained\030\006 \003(\0132\024.google.protobuf."
          + "Any\0221\n\textension\030\010 \003(\0132\036.google.fhir.r4."
          + "core.Extension\022:\n\022modifier_extension\030\t \003"
          + "(\0132\036.google.fhir.r4.core.Extension\022-\n\003ur"
          + "l\030\n \001(\0132\030.google.fhir.r4.core.UriB\006\360\320\207\353\004"
          + "\001\0223\n\nidentifier\030\013 \003(\0132\037.google.fhir.r4.c"
          + "ore.Identifier\0224\n\007version\030\014 \001(\0132\033.google"
          + ".fhir.r4.core.StringB\006\360\320\207\353\004\001\0221\n\004name\030\r \001"
          + "(\0132\033.google.fhir.r4.core.StringB\006\360\320\207\353\004\001\022"
          + "*\n\005title\030\016 \001(\0132\033.google.fhir.r4.core.Str"
          + "ing\022-\n\010subtitle\030\017 \001(\0132\033.google.fhir.r4.c"
          + "ore.String\022S\n\006status\030\020 \001(\0132;.google.fhir"
          + ".r4.core.ShareableActivityDefinition.Sta"
          + "tusCodeB\006\360\320\207\353\004\001\022:\n\014experimental\030\021 \001(\0132\034."
          + "google.fhir.r4.core.BooleanB\006\360\320\207\353\004\001\022J\n\007s"
          + "ubject\030\022 \001(\01329.google.fhir.r4.core.Share"
          + "ableActivityDefinition.SubjectX\022+\n\004date\030"
          + "\023 \001(\0132\035.google.fhir.r4.core.DateTime\0226\n\t"
          + "publisher\030\024 \001(\0132\033.google.fhir.r4.core.St"
          + "ringB\006\360\320\207\353\004\001\0223\n\007contact\030\025 \003(\0132\".google.f"
          + "hir.r4.core.ContactDetail\022:\n\013description"
          + "\030\026 \001(\0132\035.google.fhir.r4.core.MarkdownB\006\360"
          + "\320\207\353\004\001\0226\n\013use_context\030\027 \003(\0132!.google.fhir"
          + ".r4.core.UsageContext\022:\n\014jurisdiction\030\030 "
          + "\003(\0132$.google.fhir.r4.core.CodeableConcep"
          + "t\022.\n\007purpose\030\031 \001(\0132\035.google.fhir.r4.core"
          + ".Markdown\022*\n\005usage\030\032 \001(\0132\033.google.fhir.r"
          + "4.core.String\0220\n\tcopyright\030\033 \001(\0132\035.googl"
          + "e.fhir.r4.core.Markdown\0220\n\rapproval_date"
          + "\030\034 \001(\0132\031.google.fhir.r4.core.Date\0223\n\020las"
          + "t_review_date\030\035 \001(\0132\031.google.fhir.r4.cor"
          + "e.Date\0225\n\020effective_period\030\036 \001(\0132\033.googl"
          + "e.fhir.r4.core.Period\0223\n\005topic\030\037 \003(\0132$.g"
          + "oogle.fhir.r4.core.CodeableConcept\0222\n\006au"
          + "thor\030  \003(\0132\".google.fhir.r4.core.Contact"
          + "Detail\0222\n\006editor\030! \003(\0132\".google.fhir.r4."
          + "core.ContactDetail\0224\n\010reviewer\030\" \003(\0132\".g"
          + "oogle.fhir.r4.core.ContactDetail\0224\n\010endo"
          + "rser\030# \003(\0132\".google.fhir.r4.core.Contact"
          + "Detail\022>\n\020related_artifact\030$ \003(\0132$.googl"
          + "e.fhir.r4.core.RelatedArtifact\022/\n\007librar"
          + "y\030% \003(\0132\036.google.fhir.r4.core.Canonical\022"
          + "G\n\004kind\030& \001(\01329.google.fhir.r4.core.Shar"
          + "eableActivityDefinition.KindCode\022/\n\007prof"
          + "ile\030\' \001(\0132\036.google.fhir.r4.core.Canonica"
          + "l\0222\n\004code\030( \001(\0132$.google.fhir.r4.core.Co"
          + "deableConcept\022K\n\006intent\030) \001(\0132;.google.f"
          + "hir.r4.core.ShareableActivityDefinition."
          + "IntentCode\022O\n\010priority\030* \001(\0132=.google.fh"
          + "ir.r4.core.ShareableActivityDefinition.P"
          + "riorityCode\0224\n\016do_not_perform\030+ \001(\0132\034.go"
          + "ogle.fhir.r4.core.Boolean\022H\n\006timing\030, \001("
          + "\01328.google.fhir.r4.core.ShareableActivit"
          + "yDefinition.TimingX\022@\n\010location\030- \001(\0132\036."
          + "google.fhir.r4.core.ReferenceB\016\362\377\374\302\006\010Loc"
          + "ation\022Q\n\013participant\030. \003(\0132<.google.fhir"
          + ".r4.core.ShareableActivityDefinition.Par"
          + "ticipant\022J\n\007product\030/ \001(\01329.google.fhir."
          + "r4.core.ShareableActivityDefinition.Prod"
          + "uctX\0225\n\010quantity\0300 \001(\0132#.google.fhir.r4."
          + "core.SimpleQuantity\022+\n\006dosage\0301 \003(\0132\033.go"
          + "ogle.fhir.r4.core.Dosage\0227\n\tbody_site\0302 "
          + "\003(\0132$.google.fhir.r4.core.CodeableConcep"
          + "t\022V\n\024specimen_requirement\0303 \003(\0132\036.google"
          + ".fhir.r4.core.ReferenceB\030\362\377\374\302\006\022SpecimenD"
          + "efinition\022\\\n\027observation_requirement\0304 \003"
          + "(\0132\036.google.fhir.r4.core.ReferenceB\033\362\377\374\302"
          + "\006\025ObservationDefinition\022c\n\036observation_r"
          + "esult_requirement\0305 \003(\0132\036.google.fhir.r4"
          + ".core.ReferenceB\033\362\377\374\302\006\025ObservationDefini"
          + "tion\0221\n\ttransform\0306 \001(\0132\036.google.fhir.r4"
          + ".core.Canonical\022T\n\rdynamic_value\0307 \003(\0132="
          + ".google.fhir.r4.core.ShareableActivityDe"
          + "finition.DynamicValue\032\230\002\n\nStatusCode\022?\n\005"
          + "value\030\001 \001(\01620.google.fhir.r4.core.Public"
          + "ationStatusCode.Value\022\'\n\002id\030\002 \001(\0132\033.goog"
          + "le.fhir.r4.core.String\0221\n\textension\030\003 \003("
          + "\0132\036.google.fhir.r4.core.Extension:m\300\237\343\266\005"
          + "\001\212\371\203\262\005/http://hl7.org/fhir/ValueSet/publ"
          + "ication-status\232\265\216\223\006,http://hl7.org/fhir/"
          + "StructureDefinition/code\032\240\001\n\010SubjectX\022@\n"
          + "\020codeable_concept\030\001 \001(\0132$.google.fhir.r4"
          + ".core.CodeableConceptH\000\022@\n\treference\030\002 \001"
          + "(\0132\036.google.fhir.r4.core.ReferenceB\013\362\377\374\302"
          + "\006\005GroupH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\234\002\n\010KindCode"
          + "\022A\n\005value\030\001 \001(\01622.google.fhir.r4.core.Re"
          + "questResourceTypeCode.Value\022\'\n\002id\030\002 \001(\0132"
          + "\033.google.fhir.r4.core.String\0221\n\textensio"
          + "n\030\003 \003(\0132\036.google.fhir.r4.core.Extension:"
          + "q\300\237\343\266\005\001\212\371\203\262\0053http://hl7.org/fhir/ValueSe"
          + "t/request-resource-types\232\265\216\223\006,http://hl7"
          + ".org/fhir/StructureDefinition/code\032\220\002\n\nI"
          + "ntentCode\022;\n\005value\030\001 \001(\0162,.google.fhir.r"
          + "4.core.RequestIntentCode.Value\022\'\n\002id\030\002 \001"
          + "(\0132\033.google.fhir.r4.core.String\0221\n\texten"
          + "sion\030\003 \003(\0132\036.google.fhir.r4.core.Extensi"
          + "on:i\300\237\343\266\005\001\212\371\203\262\005+http://hl7.org/fhir/Valu"
          + "eSet/request-intent\232\265\216\223\006,http://hl7.org/"
          + "fhir/StructureDefinition/code\032\226\002\n\014Priori"
          + "tyCode\022=\n\005value\030\001 \001(\0162..google.fhir.r4.c"
          + "ore.RequestPriorityCode.Value\022\'\n\002id\030\002 \001("
          + "\0132\033.google.fhir.r4.core.String\0221\n\textens"
          + "ion\030\003 \003(\0132\036.google.fhir.r4.core.Extensio"
          + "n:k\300\237\343\266\005\001\212\371\203\262\005-http://hl7.org/fhir/Value"
          + "Set/request-priority\232\265\216\223\006,http://hl7.org"
          + "/fhir/StructureDefinition/code\032\266\002\n\007Timin"
          + "gX\022-\n\006timing\030\001 \001(\0132\033.google.fhir.r4.core"
          + ".TimingH\000\0222\n\tdate_time\030\002 \001(\0132\035.google.fh"
          + "ir.r4.core.DateTimeH\000\022\'\n\003age\030\003 \001(\0132\030.goo"
          + "gle.fhir.r4.core.AgeH\000\022-\n\006period\030\004 \001(\0132\033"
          + ".google.fhir.r4.core.PeriodH\000\022+\n\005range\030\005"
          + " \001(\0132\032.google.fhir.r4.core.RangeH\000\0221\n\010du"
          + "ration\030\006 \001(\0132\035.google.fhir.r4.core.Durat"
          + "ionH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\330\004\n\013Participant\022"
          + "\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.core.String"
          + "\0221\n\textension\030\002 \003(\0132\036.google.fhir.r4.cor"
          + "e.Extension\022:\n\022modifier_extension\030\003 \003(\0132"
          + "\036.google.fhir.r4.core.Extension\022[\n\004type\030"
          + "\004 \001(\0132E.google.fhir.r4.core.ShareableAct"
          + "ivityDefinition.Participant.TypeCodeB\006\360\320"
          + "\207\353\004\001\0222\n\004role\030\005 \001(\0132$.google.fhir.r4.core"
          + ".CodeableConcept\032\237\002\n\010TypeCode\022C\n\005value\030\001"
          + " \001(\01624.google.fhir.r4.core.ActionPartici"
          + "pantTypeCode.Value\022\'\n\002id\030\002 \001(\0132\033.google."
          + "fhir.r4.core.String\0221\n\textension\030\003 \003(\0132\036"
          + ".google.fhir.r4.core.Extension:r\300\237\343\266\005\001\212\371"
          + "\203\262\0054http://hl7.org/fhir/ValueSet/action-"
          + "participant-type\232\265\216\223\006,http://hl7.org/fhi"
          + "r/StructureDefinition/code\032\264\001\n\010ProductX\022"
          + "T\n\treference\030\001 \001(\0132\036.google.fhir.r4.core"
          + ".ReferenceB\037\362\377\374\302\006\nMedication\362\377\374\302\006\tSubsta"
          + "nceH\000\022@\n\020codeable_concept\030\002 \001(\0132$.google"
          + ".fhir.r4.core.CodeableConceptH\000:\006\240\203\203\350\006\001B"
          + "\010\n\006choice\032\226\002\n\014DynamicValue\022\'\n\002id\030\001 \001(\0132\033"
          + ".google.fhir.r4.core.String\0221\n\textension"
          + "\030\002 \003(\0132\036.google.fhir.r4.core.Extension\022:"
          + "\n\022modifier_extension\030\003 \003(\0132\036.google.fhir"
          + ".r4.core.Extension\0221\n\004path\030\004 \001(\0132\033.googl"
          + "e.fhir.r4.core.StringB\006\360\320\207\353\004\001\022;\n\nexpress"
          + "ion\030\005 \001(\0132\037.google.fhir.r4.core.Expressi"
          + "onB\006\360\320\207\353\004\001:\217\001\300\237\343\266\005\003\232\265\216\223\006:http://hl7.org/"
          + "fhir/StructureDefinition/ActivityDefinit"
          + "ion\262\376\344\227\006Chttp://hl7.org/fhir/StructureDe"
          + "finition/shareableactivitydefinitionJ\004\010\007"
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
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor,
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
              "Library",
              "Kind",
              "Profile",
              "Code",
              "Intent",
              "Priority",
              "DoNotPerform",
              "Timing",
              "Location",
              "Participant",
              "Product",
              "Quantity",
              "Dosage",
              "BodySite",
              "SpecimenRequirement",
              "ObservationRequirement",
              "ObservationResultRequirement",
              "Transform",
              "DynamicValue",
            });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_StatusCode_descriptor =
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_StatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ShareableActivityDefinition_StatusCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_SubjectX_descriptor =
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_SubjectX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ShareableActivityDefinition_SubjectX_descriptor,
            new java.lang.String[] {
              "CodeableConcept", "Reference", "Choice",
            });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_KindCode_descriptor =
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_KindCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ShareableActivityDefinition_KindCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_IntentCode_descriptor =
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_IntentCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ShareableActivityDefinition_IntentCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_PriorityCode_descriptor =
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_PriorityCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ShareableActivityDefinition_PriorityCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_TimingX_descriptor =
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_TimingX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ShareableActivityDefinition_TimingX_descriptor,
            new java.lang.String[] {
              "Timing", "DateTime", "Age", "Period", "Range", "Duration", "Choice",
            });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_descriptor =
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor
            .getNestedTypes()
            .get(6);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Type", "Role",
            });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_TypeCode_descriptor =
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_TypeCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_TypeCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_ProductX_descriptor =
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor
            .getNestedTypes()
            .get(7);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_ProductX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ShareableActivityDefinition_ProductX_descriptor,
            new java.lang.String[] {
              "Reference", "CodeableConcept", "Choice",
            });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_DynamicValue_descriptor =
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor
            .getNestedTypes()
            .get(8);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_DynamicValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ShareableActivityDefinition_DynamicValue_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Path", "Expression",
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