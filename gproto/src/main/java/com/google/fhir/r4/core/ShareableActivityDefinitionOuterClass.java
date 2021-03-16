// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/profiles/shareable_activity_definition.proto

package com.google.fhir.r4.core;

public final class ShareableActivityDefinitionOuterClass {
  private ShareableActivityDefinitionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_StatusCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_SubjectX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_SubjectX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_KindCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_KindCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_IntentCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_IntentCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_PriorityCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_PriorityCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_TimingX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_TimingX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_TypeCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_TypeCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_ProductX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_ProductX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_DynamicValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_DynamicValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nLproto/google/fhir/proto/r4/core/profil" +
      "es/shareable_activity_definition.proto\022\023" +
      "google.fhir.r4.core\032\031google/protobuf/any" +
      ".proto\032)proto/google/fhir/proto/annotati" +
      "ons.proto\032+proto/google/fhir/proto/r4/co" +
      "re/codes.proto\032/proto/google/fhir/proto/" +
      "r4/core/datatypes.proto\"\3759\n\033ShareableAct" +
      "ivityDefinition\022#\n\002id\030\001 \001(\0132\027.google.fhi" +
      "r.r4.core.Id\022\'\n\004meta\030\002 \001(\0132\031.google.fhir" +
      ".r4.core.Meta\0220\n\016implicit_rules\030\003 \001(\0132\030." +
      "google.fhir.r4.core.Uri\022+\n\010language\030\004 \001(" +
      "\0132\031.google.fhir.r4.core.Code\022,\n\004text\030\005 \001" +
      "(\0132\036.google.fhir.r4.core.Narrative\022\'\n\tco" +
      "ntained\030\006 \003(\0132\024.google.protobuf.Any\0221\n\te" +
      "xtension\030\010 \003(\0132\036.google.fhir.r4.core.Ext" +
      "ension\022:\n\022modifier_extension\030\t \003(\0132\036.goo" +
      "gle.fhir.r4.core.Extension\022-\n\003url\030\n \001(\0132" +
      "\030.google.fhir.r4.core.UriB\006\360\320\207\353\004\001\0223\n\nide" +
      "ntifier\030\013 \003(\0132\037.google.fhir.r4.core.Iden" +
      "tifier\0224\n\007version\030\014 \001(\0132\033.google.fhir.r4" +
      ".core.StringB\006\360\320\207\353\004\001\0221\n\004name\030\r \001(\0132\033.goo" +
      "gle.fhir.r4.core.StringB\006\360\320\207\353\004\001\022*\n\005title" +
      "\030\016 \001(\0132\033.google.fhir.r4.core.String\022-\n\010s" +
      "ubtitle\030\017 \001(\0132\033.google.fhir.r4.core.Stri" +
      "ng\022S\n\006status\030\020 \001(\0132;.google.fhir.r4.core" +
      ".ShareableActivityDefinition.StatusCodeB" +
      "\006\360\320\207\353\004\001\022:\n\014experimental\030\021 \001(\0132\034.google.f" +
      "hir.r4.core.BooleanB\006\360\320\207\353\004\001\022J\n\007subject\030\022" +
      " \001(\01329.google.fhir.r4.core.ShareableActi" +
      "vityDefinition.SubjectX\022+\n\004date\030\023 \001(\0132\035." +
      "google.fhir.r4.core.DateTime\0226\n\tpublishe" +
      "r\030\024 \001(\0132\033.google.fhir.r4.core.StringB\006\360\320" +
      "\207\353\004\001\0223\n\007contact\030\025 \003(\0132\".google.fhir.r4.c" +
      "ore.ContactDetail\022:\n\013description\030\026 \001(\0132\035" +
      ".google.fhir.r4.core.MarkdownB\006\360\320\207\353\004\001\0226\n" +
      "\013use_context\030\027 \003(\0132!.google.fhir.r4.core" +
      ".UsageContext\022:\n\014jurisdiction\030\030 \003(\0132$.go" +
      "ogle.fhir.r4.core.CodeableConcept\022.\n\007pur" +
      "pose\030\031 \001(\0132\035.google.fhir.r4.core.Markdow" +
      "n\022*\n\005usage\030\032 \001(\0132\033.google.fhir.r4.core.S" +
      "tring\0220\n\tcopyright\030\033 \001(\0132\035.google.fhir.r" +
      "4.core.Markdown\0220\n\rapproval_date\030\034 \001(\0132\031" +
      ".google.fhir.r4.core.Date\0223\n\020last_review" +
      "_date\030\035 \001(\0132\031.google.fhir.r4.core.Date\0225" +
      "\n\020effective_period\030\036 \001(\0132\033.google.fhir.r" +
      "4.core.Period\0223\n\005topic\030\037 \003(\0132$.google.fh" +
      "ir.r4.core.CodeableConcept\0222\n\006author\030  \003" +
      "(\0132\".google.fhir.r4.core.ContactDetail\0222" +
      "\n\006editor\030! \003(\0132\".google.fhir.r4.core.Con" +
      "tactDetail\0224\n\010reviewer\030\" \003(\0132\".google.fh" +
      "ir.r4.core.ContactDetail\0224\n\010endorser\030# \003" +
      "(\0132\".google.fhir.r4.core.ContactDetail\022>" +
      "\n\020related_artifact\030$ \003(\0132$.google.fhir.r" +
      "4.core.RelatedArtifact\022/\n\007library\030% \003(\0132" +
      "\036.google.fhir.r4.core.Canonical\022G\n\004kind\030" +
      "& \001(\01329.google.fhir.r4.core.ShareableAct" +
      "ivityDefinition.KindCode\022/\n\007profile\030\' \001(" +
      "\0132\036.google.fhir.r4.core.Canonical\0222\n\004cod" +
      "e\030( \001(\0132$.google.fhir.r4.core.CodeableCo" +
      "ncept\022K\n\006intent\030) \001(\0132;.google.fhir.r4.c" +
      "ore.ShareableActivityDefinition.IntentCo" +
      "de\022O\n\010priority\030* \001(\0132=.google.fhir.r4.co" +
      "re.ShareableActivityDefinition.PriorityC" +
      "ode\0224\n\016do_not_perform\030+ \001(\0132\034.google.fhi" +
      "r.r4.core.Boolean\022H\n\006timing\030, \001(\01328.goog" +
      "le.fhir.r4.core.ShareableActivityDefinit" +
      "ion.TimingX\022@\n\010location\030- \001(\0132\036.google.f" +
      "hir.r4.core.ReferenceB\016\362\377\374\302\006\010Location\022Q\n" +
      "\013participant\030. \003(\0132<.google.fhir.r4.core" +
      ".ShareableActivityDefinition.Participant" +
      "\022J\n\007product\030/ \001(\01329.google.fhir.r4.core." +
      "ShareableActivityDefinition.ProductX\0225\n\010" +
      "quantity\0300 \001(\0132#.google.fhir.r4.core.Sim" +
      "pleQuantity\022+\n\006dosage\0301 \003(\0132\033.google.fhi" +
      "r.r4.core.Dosage\0227\n\tbody_site\0302 \003(\0132$.go" +
      "ogle.fhir.r4.core.CodeableConcept\022V\n\024spe" +
      "cimen_requirement\0303 \003(\0132\036.google.fhir.r4" +
      ".core.ReferenceB\030\362\377\374\302\006\022SpecimenDefinitio" +
      "n\022\\\n\027observation_requirement\0304 \003(\0132\036.goo" +
      "gle.fhir.r4.core.ReferenceB\033\362\377\374\302\006\025Observ" +
      "ationDefinition\022c\n\036observation_result_re" +
      "quirement\0305 \003(\0132\036.google.fhir.r4.core.Re" +
      "ferenceB\033\362\377\374\302\006\025ObservationDefinition\0221\n\t" +
      "transform\0306 \001(\0132\036.google.fhir.r4.core.Ca" +
      "nonical\022T\n\rdynamic_value\0307 \003(\0132=.google." +
      "fhir.r4.core.ShareableActivityDefinition" +
      ".DynamicValue\032\230\002\n\nStatusCode\022?\n\005value\030\001 " +
      "\001(\01620.google.fhir.r4.core.PublicationSta" +
      "tusCode.Value\022\'\n\002id\030\002 \001(\0132\033.google.fhir." +
      "r4.core.String\0221\n\textension\030\003 \003(\0132\036.goog" +
      "le.fhir.r4.core.Extension:m\300\237\343\266\005\001\212\371\203\262\005/h" +
      "ttp://hl7.org/fhir/ValueSet/publication-" +
      "status\232\265\216\223\006,http://hl7.org/fhir/Structur" +
      "eDefinition/code\032\240\001\n\010SubjectX\022@\n\020codeabl" +
      "e_concept\030\001 \001(\0132$.google.fhir.r4.core.Co" +
      "deableConceptH\000\022@\n\treference\030\002 \001(\0132\036.goo" +
      "gle.fhir.r4.core.ReferenceB\013\362\377\374\302\006\005GroupH" +
      "\000:\006\240\203\203\350\006\001B\010\n\006choice\032\234\002\n\010KindCode\022A\n\005valu" +
      "e\030\001 \001(\01622.google.fhir.r4.core.RequestRes" +
      "ourceTypeCode.Value\022\'\n\002id\030\002 \001(\0132\033.google" +
      ".fhir.r4.core.String\0221\n\textension\030\003 \003(\0132" +
      "\036.google.fhir.r4.core.Extension:q\300\237\343\266\005\001\212" +
      "\371\203\262\0053http://hl7.org/fhir/ValueSet/reques" +
      "t-resource-types\232\265\216\223\006,http://hl7.org/fhi" +
      "r/StructureDefinition/code\032\220\002\n\nIntentCod" +
      "e\022;\n\005value\030\001 \001(\0162,.google.fhir.r4.core.R" +
      "equestIntentCode.Value\022\'\n\002id\030\002 \001(\0132\033.goo" +
      "gle.fhir.r4.core.String\0221\n\textension\030\003 \003" +
      "(\0132\036.google.fhir.r4.core.Extension:i\300\237\343\266" +
      "\005\001\212\371\203\262\005+http://hl7.org/fhir/ValueSet/req" +
      "uest-intent\232\265\216\223\006,http://hl7.org/fhir/Str" +
      "uctureDefinition/code\032\226\002\n\014PriorityCode\022=" +
      "\n\005value\030\001 \001(\0162..google.fhir.r4.core.Requ" +
      "estPriorityCode.Value\022\'\n\002id\030\002 \001(\0132\033.goog" +
      "le.fhir.r4.core.String\0221\n\textension\030\003 \003(" +
      "\0132\036.google.fhir.r4.core.Extension:k\300\237\343\266\005" +
      "\001\212\371\203\262\005-http://hl7.org/fhir/ValueSet/requ" +
      "est-priority\232\265\216\223\006,http://hl7.org/fhir/St" +
      "ructureDefinition/code\032\266\002\n\007TimingX\022-\n\006ti" +
      "ming\030\001 \001(\0132\033.google.fhir.r4.core.TimingH" +
      "\000\0222\n\tdate_time\030\002 \001(\0132\035.google.fhir.r4.co" +
      "re.DateTimeH\000\022\'\n\003age\030\003 \001(\0132\030.google.fhir" +
      ".r4.core.AgeH\000\022-\n\006period\030\004 \001(\0132\033.google." +
      "fhir.r4.core.PeriodH\000\022+\n\005range\030\005 \001(\0132\032.g" +
      "oogle.fhir.r4.core.RangeH\000\0221\n\010duration\030\006" +
      " \001(\0132\035.google.fhir.r4.core.DurationH\000:\006\240" +
      "\203\203\350\006\001B\010\n\006choice\032\330\004\n\013Participant\022\'\n\002id\030\001 " +
      "\001(\0132\033.google.fhir.r4.core.String\0221\n\texte" +
      "nsion\030\002 \003(\0132\036.google.fhir.r4.core.Extens" +
      "ion\022:\n\022modifier_extension\030\003 \003(\0132\036.google" +
      ".fhir.r4.core.Extension\022[\n\004type\030\004 \001(\0132E." +
      "google.fhir.r4.core.ShareableActivityDef" +
      "inition.Participant.TypeCodeB\006\360\320\207\353\004\001\0222\n\004" +
      "role\030\005 \001(\0132$.google.fhir.r4.core.Codeabl" +
      "eConcept\032\237\002\n\010TypeCode\022C\n\005value\030\001 \001(\01624.g" +
      "oogle.fhir.r4.core.ActionParticipantType" +
      "Code.Value\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4." +
      "core.String\0221\n\textension\030\003 \003(\0132\036.google." +
      "fhir.r4.core.Extension:r\300\237\343\266\005\001\212\371\203\262\0054http" +
      "://hl7.org/fhir/ValueSet/action-particip" +
      "ant-type\232\265\216\223\006,http://hl7.org/fhir/Struct" +
      "ureDefinition/code\032\264\001\n\010ProductX\022T\n\trefer" +
      "ence\030\001 \001(\0132\036.google.fhir.r4.core.Referen" +
      "ceB\037\362\377\374\302\006\nMedication\362\377\374\302\006\tSubstanceH\000\022@\n" +
      "\020codeable_concept\030\002 \001(\0132$.google.fhir.r4" +
      ".core.CodeableConceptH\000:\006\240\203\203\350\006\001B\010\n\006choic" +
      "e\032\226\002\n\014DynamicValue\022\'\n\002id\030\001 \001(\0132\033.google." +
      "fhir.r4.core.String\0221\n\textension\030\002 \003(\0132\036" +
      ".google.fhir.r4.core.Extension\022:\n\022modifi" +
      "er_extension\030\003 \003(\0132\036.google.fhir.r4.core" +
      ".Extension\0221\n\004path\030\004 \001(\0132\033.google.fhir.r" +
      "4.core.StringB\006\360\320\207\353\004\001\022;\n\nexpression\030\005 \001(" +
      "\0132\037.google.fhir.r4.core.ExpressionB\006\360\320\207\353" +
      "\004\001:\224\014\300\237\343\266\005\003\232\265\216\223\006:http://hl7.org/fhir/Str" +
      "uctureDefinition/ActivityDefinition\262\376\344\227\006" +
      "Chttp://hl7.org/fhir/StructureDefinition" +
      "/shareableactivitydefinition\262\365\365\327\tV\n\013comp" +
      "osed-of\020\005\032EActivityDefinition.relatedArt" +
      "ifact.where(type=\'composed-of\').resource" +
      "\262\365\365\327\tE\n\007context\020\004\0328(ActivityDefinition.u" +
      "seContext.value as CodeableConcept)\262\365\365\327\t" +
      "x\n\020context-quantity\020\007\032b(ActivityDefiniti" +
      "on.useContext.value as Quantity) | (Acti" +
      "vityDefinition.useContext.value as Range" +
      ")\262\365\365\327\t4\n\014context-type\020\004\032\"ActivityDefinit" +
      "ion.useContext.code\262\365\365\327\t8\n\025context-type-" +
      "quantity\020\006\032\035ActivityDefinition.useContex" +
      "t\262\365\365\327\t5\n\022context-type-value\020\006\032\035ActivityD" +
      "efinition.useContext\262\365\365\327\t!\n\004date\020\002\032\027Acti" +
      "vityDefinition.date\262\365\365\327\tq\n\ndepends-on\020\005\032" +
      "aActivityDefinition.relatedArtifact.wher" +
      "e(type=\'depends-on\').resource | Activity" +
      "Definition.library\262\365\365\327\tX\n\014derived-from\020\005" +
      "\032FActivityDefinition.relatedArtifact.whe" +
      "re(type=\'derived-from\').resource\262\365\365\327\t/\n\013" +
      "description\020\003\032\036ActivityDefinition.descri" +
      "ption\262\365\365\327\t1\n\teffective\020\002\032\"ActivityDefini" +
      "tion.effectivePeriod\262\365\365\327\t-\n\nidentifier\020\004" +
      "\032\035ActivityDefinition.identifier\262\365\365\327\t1\n\014j" +
      "urisdiction\020\004\032\037ActivityDefinition.jurisd" +
      "iction\262\365\365\327\t!\n\004name\020\003\032\027ActivityDefinition" +
      ".name\262\365\365\327\tV\n\013predecessor\020\005\032EActivityDefi" +
      "nition.relatedArtifact.where(type=\'prede" +
      "cessor\').resource\262\365\365\327\t+\n\tpublisher\020\003\032\034Ac" +
      "tivityDefinition.publisher\262\365\365\327\t%\n\006status" +
      "\020\004\032\031ActivityDefinition.status\262\365\365\327\tR\n\tsuc" +
      "cessor\020\005\032CActivityDefinition.relatedArti" +
      "fact.where(type=\'successor\').resource\262\365\365" +
      "\327\t#\n\005title\020\003\032\030ActivityDefinition.title\262\365" +
      "\365\327\t#\n\005topic\020\004\032\030ActivityDefinition.topic\262" +
      "\365\365\327\t\037\n\003url\020\010\032\026ActivityDefinition.url\262\365\365\327" +
      "\t\'\n\007version\020\004\032\032ActivityDefinition.versio" +
      "nJ\004\010\007\020\010B!\n\027com.google.fhir.r4.coreP\001\230\306\260\265" +
      "\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Codes.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Url", "Identifier", "Version", "Name", "Title", "Subtitle", "Status", "Experimental", "Subject", "Date", "Publisher", "Contact", "Description", "UseContext", "Jurisdiction", "Purpose", "Usage", "Copyright", "ApprovalDate", "LastReviewDate", "EffectivePeriod", "Topic", "Author", "Editor", "Reviewer", "Endorser", "RelatedArtifact", "Library", "Kind", "Profile", "Code", "Intent", "Priority", "DoNotPerform", "Timing", "Location", "Participant", "Product", "Quantity", "Dosage", "BodySite", "SpecimenRequirement", "ObservationRequirement", "ObservationResultRequirement", "Transform", "DynamicValue", });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_StatusCode_descriptor =
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_StatusCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_StatusCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_SubjectX_descriptor =
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_SubjectX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_SubjectX_descriptor,
        new java.lang.String[] { "CodeableConcept", "Reference", "Choice", });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_KindCode_descriptor =
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_KindCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_KindCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_IntentCode_descriptor =
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor.getNestedTypes().get(3);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_IntentCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_IntentCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_PriorityCode_descriptor =
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor.getNestedTypes().get(4);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_PriorityCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_PriorityCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_TimingX_descriptor =
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor.getNestedTypes().get(5);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_TimingX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_TimingX_descriptor,
        new java.lang.String[] { "Timing", "DateTime", "Age", "Period", "Range", "Duration", "Choice", });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_descriptor =
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor.getNestedTypes().get(6);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Type", "Role", });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_TypeCode_descriptor =
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_TypeCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_Participant_TypeCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_ProductX_descriptor =
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor.getNestedTypes().get(7);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_ProductX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_ProductX_descriptor,
        new java.lang.String[] { "Reference", "CodeableConcept", "Choice", });
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_DynamicValue_descriptor =
      internal_static_google_fhir_r4_core_ShareableActivityDefinition_descriptor.getNestedTypes().get(8);
    internal_static_google_fhir_r4_core_ShareableActivityDefinition_DynamicValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableActivityDefinition_DynamicValue_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Path", "Expression", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
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
