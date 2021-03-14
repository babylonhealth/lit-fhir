// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/operation_definition.proto

package com.google.fhir.r4.core;

public final class OperationDefinitionOuterClass {
  private OperationDefinitionOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_OperationDefinition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_OperationDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_OperationDefinition_StatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_OperationDefinition_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_OperationDefinition_KindCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_OperationDefinition_KindCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_OperationDefinition_ResourceCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_OperationDefinition_ResourceCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_OperationDefinition_Parameter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_OperationDefinition_Parameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_OperationDefinition_Parameter_UseCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_OperationDefinition_Parameter_UseCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_OperationDefinition_Parameter_TypeCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_OperationDefinition_Parameter_TypeCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_OperationDefinition_Parameter_SearchTypeCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_OperationDefinition_Parameter_SearchTypeCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_OperationDefinition_Parameter_Binding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_OperationDefinition_Parameter_Binding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_OperationDefinition_Parameter_Binding_StrengthCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_OperationDefinition_Parameter_Binding_StrengthCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_OperationDefinition_Parameter_ReferencedFrom_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_OperationDefinition_Parameter_ReferencedFrom_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_OperationDefinition_Overload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_OperationDefinition_Overload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2proto/r4/core/resources/operation_defi"
          + "nition.proto\022\023google.fhir.r4.core\032\031googl"
          + "e/protobuf/any.proto\032\027proto/annotations."
          + "proto\032\031proto/r4/core/codes.proto\032\035proto/"
          + "r4/core/datatypes.proto\032\035proto/r4/core/v"
          + "aluesets.proto\"\226-\n\023OperationDefinition\022#"
          + "\n\002id\030\001 \001(\0132\027.google.fhir.r4.core.Id\022\'\n\004m"
          + "eta\030\002 \001(\0132\031.google.fhir.r4.core.Meta\0220\n\016"
          + "implicit_rules\030\003 \001(\0132\030.google.fhir.r4.co"
          + "re.Uri\022+\n\010language\030\004 \001(\0132\031.google.fhir.r"
          + "4.core.Code\022,\n\004text\030\005 \001(\0132\036.google.fhir."
          + "r4.core.Narrative\022\'\n\tcontained\030\006 \003(\0132\024.g"
          + "oogle.protobuf.Any\0221\n\textension\030\010 \003(\0132\036."
          + "google.fhir.r4.core.Extension\022:\n\022modifie"
          + "r_extension\030\t \003(\0132\036.google.fhir.r4.core."
          + "Extension\022%\n\003url\030\n \001(\0132\030.google.fhir.r4."
          + "core.Uri\022,\n\007version\030\013 \001(\0132\033.google.fhir."
          + "r4.core.String\0221\n\004name\030\014 \001(\0132\033.google.fh"
          + "ir.r4.core.StringB\006\360\320\207\353\004\001\022*\n\005title\030\r \001(\013"
          + "2\033.google.fhir.r4.core.String\022K\n\006status\030"
          + "\016 \001(\01323.google.fhir.r4.core.OperationDef"
          + "inition.StatusCodeB\006\360\320\207\353\004\001\022G\n\004kind\030\017 \001(\013"
          + "21.google.fhir.r4.core.OperationDefiniti"
          + "on.KindCodeB\006\360\320\207\353\004\001\0222\n\014experimental\030\020 \001("
          + "\0132\034.google.fhir.r4.core.Boolean\022+\n\004date\030"
          + "\021 \001(\0132\035.google.fhir.r4.core.DateTime\022.\n\t"
          + "publisher\030\022 \001(\0132\033.google.fhir.r4.core.St"
          + "ring\0223\n\007contact\030\023 \003(\0132\".google.fhir.r4.c"
          + "ore.ContactDetail\0222\n\013description\030\024 \001(\0132\035"
          + ".google.fhir.r4.core.Markdown\0226\n\013use_con"
          + "text\030\025 \003(\0132!.google.fhir.r4.core.UsageCo"
          + "ntext\022:\n\014jurisdiction\030\026 \003(\0132$.google.fhi"
          + "r.r4.core.CodeableConcept\022.\n\007purpose\030\027 \001"
          + "(\0132\035.google.fhir.r4.core.Markdown\0223\n\raff"
          + "ects_state\030\030 \001(\0132\034.google.fhir.r4.core.B"
          + "oolean\022/\n\004code\030\031 \001(\0132\031.google.fhir.r4.co"
          + "re.CodeB\006\360\320\207\353\004\001\022.\n\007comment\030\032 \001(\0132\035.googl"
          + "e.fhir.r4.core.Markdown\022,\n\004base\030\033 \001(\0132\036."
          + "google.fhir.r4.core.Canonical\022G\n\010resourc"
          + "e\030\034 \003(\01325.google.fhir.r4.core.OperationD"
          + "efinition.ResourceCode\0224\n\006system\030\035 \001(\0132\034"
          + ".google.fhir.r4.core.BooleanB\006\360\320\207\353\004\001\0222\n\004"
          + "type\030\036 \001(\0132\034.google.fhir.r4.core.Boolean"
          + "B\006\360\320\207\353\004\001\0226\n\010instance\030\037 \001(\0132\034.google.fhir"
          + ".r4.core.BooleanB\006\360\320\207\353\004\001\0225\n\rinput_profil"
          + "e\030  \001(\0132\036.google.fhir.r4.core.Canonical\022"
          + "6\n\016output_profile\030! \001(\0132\036.google.fhir.r4"
          + ".core.Canonical\022E\n\tparameter\030\" \003(\01322.goo"
          + "gle.fhir.r4.core.OperationDefinition.Par"
          + "ameter\022C\n\010overload\030# \003(\01321.google.fhir.r"
          + "4.core.OperationDefinition.Overload\032\230\002\n\n"
          + "StatusCode\022?\n\005value\030\001 \001(\01620.google.fhir."
          + "r4.core.PublicationStatusCode.Value\022\'\n\002i"
          + "d\030\002 \001(\0132\033.google.fhir.r4.core.String\0221\n\t"
          + "extension\030\003 \003(\0132\036.google.fhir.r4.core.Ex"
          + "tension:m\300\237\343\266\005\001\212\371\203\262\005/http://hl7.org/fhir"
          + "/ValueSet/publication-status\232\265\216\223\006,http:/"
          + "/hl7.org/fhir/StructureDefinition/code\032\216"
          + "\002\n\010KindCode\022;\n\005value\030\001 \001(\0162,.google.fhir"
          + ".r4.core.OperationKindCode.Value\022\'\n\002id\030\002"
          + " \001(\0132\033.google.fhir.r4.core.String\0221\n\text"
          + "ension\030\003 \003(\0132\036.google.fhir.r4.core.Exten"
          + "sion:i\300\237\343\266\005\001\212\371\203\262\005+http://hl7.org/fhir/Va"
          + "lueSet/operation-kind\232\265\216\223\006,http://hl7.or"
          + "g/fhir/StructureDefinition/code\032\221\002\n\014Reso"
          + "urceCode\022:\n\005value\030\001 \001(\0162+.google.fhir.r4"
          + ".core.ResourceTypeCode.Value\022\'\n\002id\030\002 \001(\013"
          + "2\033.google.fhir.r4.core.String\0221\n\textensi"
          + "on\030\003 \003(\0132\036.google.fhir.r4.core.Extension"
          + ":i\300\237\343\266\005\001\212\371\203\262\005+http://hl7.org/fhir/ValueS"
          + "et/resource-types\232\265\216\223\006,http://hl7.org/fh"
          + "ir/StructureDefinition/code\032\342\025\n\tParamete"
          + "r\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.core.Stri"
          + "ng\0221\n\textension\030\002 \003(\0132\036.google.fhir.r4.c"
          + "ore.Extension\022:\n\022modifier_extension\030\003 \003("
          + "\0132\036.google.fhir.r4.core.Extension\022/\n\004nam"
          + "e\030\004 \001(\0132\031.google.fhir.r4.core.CodeB\006\360\320\207\353"
          + "\004\001\022O\n\003use\030\005 \001(\0132:.google.fhir.r4.core.Op"
          + "erationDefinition.Parameter.UseCodeB\006\360\320\207"
          + "\353\004\001\0221\n\003min\030\006 \001(\0132\034.google.fhir.r4.core.I"
          + "ntegerB\006\360\320\207\353\004\001\0220\n\003max\030\007 \001(\0132\033.google.fhi"
          + "r.r4.core.StringB\006\360\320\207\353\004\001\0222\n\rdocumentatio"
          + "n\030\010 \001(\0132\033.google.fhir.r4.core.String\022I\n\004"
          + "type\030\t \001(\0132;.google.fhir.r4.core.Operati"
          + "onDefinition.Parameter.TypeCode\0226\n\016targe"
          + "t_profile\030\n \003(\0132\036.google.fhir.r4.core.Ca"
          + "nonical\022V\n\013search_type\030\013 \001(\0132A.google.fh"
          + "ir.r4.core.OperationDefinition.Parameter"
          + ".SearchTypeCode\022K\n\007binding\030\014 \001(\0132:.googl"
          + "e.fhir.r4.core.OperationDefinition.Param"
          + "eter.Binding\022Z\n\017referenced_from\030\r \003(\0132A."
          + "google.fhir.r4.core.OperationDefinition."
          + "Parameter.ReferencedFrom\022@\n\004part\030\016 \003(\01322"
          + ".google.fhir.r4.core.OperationDefinition"
          + ".Parameter\032\236\002\n\007UseCode\022C\n\005value\030\001 \001(\01624."
          + "google.fhir.r4.core.OperationParameterUs"
          + "eCode.Value\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4"
          + ".core.String\0221\n\textension\030\003 \003(\0132\036.google"
          + ".fhir.r4.core.Extension:r\300\237\343\266\005\001\212\371\203\262\0054htt"
          + "p://hl7.org/fhir/ValueSet/operation-para"
          + "meter-use\232\265\216\223\006,http://hl7.org/fhir/Struc"
          + "tureDefinition/code\032\214\002\n\010TypeCode\022>\n\005valu"
          + "e\030\001 \001(\0162/.google.fhir.r4.core.FHIRAllTyp"
          + "esValueSet.Value\022\'\n\002id\030\002 \001(\0132\033.google.fh"
          + "ir.r4.core.String\0221\n\textension\030\003 \003(\0132\036.g"
          + "oogle.fhir.r4.core.Extension:d\300\237\343\266\005\001\212\371\203\262"
          + "\005&http://hl7.org/fhir/ValueSet/all-types"
          + "\232\265\216\223\006,http://hl7.org/fhir/StructureDefin"
          + "ition/code\032\231\002\n\016SearchTypeCode\022=\n\005value\030\001"
          + " \001(\0162..google.fhir.r4.core.SearchParamTy"
          + "peCode.Value\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r"
          + "4.core.String\0221\n\textension\030\003 \003(\0132\036.googl"
          + "e.fhir.r4.core.Extension:l\300\237\343\266\005\001\212\371\203\262\005.ht"
          + "tp://hl7.org/fhir/ValueSet/search-param-"
          + "type\232\265\216\223\006,http://hl7.org/fhir/StructureD"
          + "efinition/code\032\330\004\n\007Binding\022\'\n\002id\030\001 \001(\0132\033"
          + ".google.fhir.r4.core.String\0221\n\textension"
          + "\030\002 \003(\0132\036.google.fhir.r4.core.Extension\022:"
          + "\n\022modifier_extension\030\003 \003(\0132\036.google.fhir"
          + ".r4.core.Extension\022a\n\010strength\030\004 \001(\0132G.g"
          + "oogle.fhir.r4.core.OperationDefinition.P"
          + "arameter.Binding.StrengthCodeB\006\360\320\207\353\004\001\0229\n"
          + "\tvalue_set\030\005 \001(\0132\036.google.fhir.r4.core.C"
          + "anonicalB\006\360\320\207\353\004\001\032\226\002\n\014StrengthCode\022=\n\005val"
          + "ue\030\001 \001(\0162..google.fhir.r4.core.BindingSt"
          + "rengthCode.Value\022\'\n\002id\030\002 \001(\0132\033.google.fh"
          + "ir.r4.core.String\0221\n\textension\030\003 \003(\0132\036.g"
          + "oogle.fhir.r4.core.Extension:k\300\237\343\266\005\001\212\371\203\262"
          + "\005-http://hl7.org/fhir/ValueSet/binding-s"
          + "trength\232\265\216\223\006,http://hl7.org/fhir/Structu"
          + "reDefinition/code\032\215\002\n\016ReferencedFrom\022\'\n\002"
          + "id\030\001 \001(\0132\033.google.fhir.r4.core.String\0221\n"
          + "\textension\030\002 \003(\0132\036.google.fhir.r4.core.E"
          + "xtension\022:\n\022modifier_extension\030\003 \003(\0132\036.g"
          + "oogle.fhir.r4.core.Extension\0223\n\006source\030\004"
          + " \001(\0132\033.google.fhir.r4.core.StringB\006\360\320\207\353\004"
          + "\001\022.\n\tsource_id\030\005 \001(\0132\033.google.fhir.r4.co"
          + "re.String:\244\001\232\206\223\240\010\036type.exists() or part."
          + "exists()\232\206\223\240\010+searchType.exists() implie"
          + "s type = \'string\'\232\206\223\240\010ItargetProfile.exi"
          + "sts() implies (type = \'Reference\' or typ"
          + "e = \'canonical\')\032\205\002\n\010Overload\022\'\n\002id\030\001 \001("
          + "\0132\033.google.fhir.r4.core.String\0221\n\textens"
          + "ion\030\002 \003(\0132\036.google.fhir.r4.core.Extensio"
          + "n\022:\n\022modifier_extension\030\003 \003(\0132\036.google.f"
          + "hir.r4.core.Extension\0223\n\016parameter_name\030"
          + "\004 \003(\0132\033.google.fhir.r4.core.String\022,\n\007co"
          + "mment\030\005 \001(\0132\033.google.fhir.r4.core.String"
          + ":G\300\237\343\266\005\003\262\376\344\227\006;http://hl7.org/fhir/Struct"
          + "ureDefinition/OperationDefinitionJ\004\010\007\020\010B"
          + "!\n\027com.google.fhir.r4.coreP\001\230\306\260\265\007\004b\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.fhir.proto.Annotations.getDescriptor(),
              com.google.fhir.r4.core.Codes.getDescriptor(),
              com.google.fhir.r4.core.Datatypes.getDescriptor(),
              com.google.fhir.r4.core.Valuesets.getDescriptor(),
            });
    internal_static_google_fhir_r4_core_OperationDefinition_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_OperationDefinition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_OperationDefinition_descriptor,
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
              "Version",
              "Name",
              "Title",
              "Status",
              "Kind",
              "Experimental",
              "Date",
              "Publisher",
              "Contact",
              "Description",
              "UseContext",
              "Jurisdiction",
              "Purpose",
              "AffectsState",
              "Code",
              "Comment",
              "Base",
              "Resource",
              "System",
              "Type",
              "Instance",
              "InputProfile",
              "OutputProfile",
              "Parameter",
              "Overload",
            });
    internal_static_google_fhir_r4_core_OperationDefinition_StatusCode_descriptor =
        internal_static_google_fhir_r4_core_OperationDefinition_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_OperationDefinition_StatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_OperationDefinition_StatusCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_OperationDefinition_KindCode_descriptor =
        internal_static_google_fhir_r4_core_OperationDefinition_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_OperationDefinition_KindCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_OperationDefinition_KindCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_OperationDefinition_ResourceCode_descriptor =
        internal_static_google_fhir_r4_core_OperationDefinition_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_OperationDefinition_ResourceCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_OperationDefinition_ResourceCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_OperationDefinition_Parameter_descriptor =
        internal_static_google_fhir_r4_core_OperationDefinition_descriptor.getNestedTypes().get(3);
    internal_static_google_fhir_r4_core_OperationDefinition_Parameter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_OperationDefinition_Parameter_descriptor,
            new java.lang.String[] {
              "Id",
              "Extension",
              "ModifierExtension",
              "Name",
              "Use",
              "Min",
              "Max",
              "Documentation",
              "Type",
              "TargetProfile",
              "SearchType",
              "Binding",
              "ReferencedFrom",
              "Part",
            });
    internal_static_google_fhir_r4_core_OperationDefinition_Parameter_UseCode_descriptor =
        internal_static_google_fhir_r4_core_OperationDefinition_Parameter_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_OperationDefinition_Parameter_UseCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_OperationDefinition_Parameter_UseCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_OperationDefinition_Parameter_TypeCode_descriptor =
        internal_static_google_fhir_r4_core_OperationDefinition_Parameter_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_fhir_r4_core_OperationDefinition_Parameter_TypeCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_OperationDefinition_Parameter_TypeCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_OperationDefinition_Parameter_SearchTypeCode_descriptor =
        internal_static_google_fhir_r4_core_OperationDefinition_Parameter_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_fhir_r4_core_OperationDefinition_Parameter_SearchTypeCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_OperationDefinition_Parameter_SearchTypeCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_OperationDefinition_Parameter_Binding_descriptor =
        internal_static_google_fhir_r4_core_OperationDefinition_Parameter_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_fhir_r4_core_OperationDefinition_Parameter_Binding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_OperationDefinition_Parameter_Binding_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Strength", "ValueSet",
            });
    internal_static_google_fhir_r4_core_OperationDefinition_Parameter_Binding_StrengthCode_descriptor =
        internal_static_google_fhir_r4_core_OperationDefinition_Parameter_Binding_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_OperationDefinition_Parameter_Binding_StrengthCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_OperationDefinition_Parameter_Binding_StrengthCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_OperationDefinition_Parameter_ReferencedFrom_descriptor =
        internal_static_google_fhir_r4_core_OperationDefinition_Parameter_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_fhir_r4_core_OperationDefinition_Parameter_ReferencedFrom_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_OperationDefinition_Parameter_ReferencedFrom_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Source", "SourceId",
            });
    internal_static_google_fhir_r4_core_OperationDefinition_Overload_descriptor =
        internal_static_google_fhir_r4_core_OperationDefinition_descriptor.getNestedTypes().get(4);
    internal_static_google_fhir_r4_core_OperationDefinition_Overload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_OperationDefinition_Overload_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "ParameterName", "Comment",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirPathMessageConstraint);
    registry.add(com.google.fhir.proto.Annotations.fhirProfileBase);
    registry.add(com.google.fhir.proto.Annotations.fhirStructureDefinitionUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirValuesetUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirVersion);
    registry.add(com.google.fhir.proto.Annotations.structureDefinitionKind);
    registry.add(com.google.fhir.proto.Annotations.validationRequirement);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.fhir.proto.Annotations.getDescriptor();
    com.google.fhir.r4.core.Codes.getDescriptor();
    com.google.fhir.r4.core.Datatypes.getDescriptor();
    com.google.fhir.r4.core.Valuesets.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}