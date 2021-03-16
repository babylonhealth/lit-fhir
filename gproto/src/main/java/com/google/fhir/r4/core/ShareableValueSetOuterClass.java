// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/profiles/shareable_value_set.proto

package com.google.fhir.r4.core;

public final class ShareableValueSetOuterClass {
  private ShareableValueSetOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableValueSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableValueSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableValueSet_StatusCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableValueSet_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableValueSet_Compose_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_ConceptReference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_ConceptReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_ConceptReference_Designation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_ConceptReference_Designation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_Filter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_Filter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_Filter_OpCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_Filter_OpCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_Parameter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_Parameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_Parameter_ValueX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_Parameter_ValueX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_Contains_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_Contains_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBproto/google/fhir/proto/r4/core/profil" +
      "es/shareable_value_set.proto\022\023google.fhi" +
      "r.r4.core\032\031google/protobuf/any.proto\032)pr" +
      "oto/google/fhir/proto/annotations.proto\032" +
      "+proto/google/fhir/proto/r4/core/codes.p" +
      "roto\032/proto/google/fhir/proto/r4/core/da" +
      "tatypes.proto\"\264h\n\021ShareableValueSet\022#\n\002i" +
      "d\030\001 \001(\0132\027.google.fhir.r4.core.Id\022\'\n\004meta" +
      "\030\002 \001(\0132\031.google.fhir.r4.core.Meta\0220\n\016imp" +
      "licit_rules\030\003 \001(\0132\030.google.fhir.r4.core." +
      "Uri\022+\n\010language\030\004 \001(\0132\031.google.fhir.r4.c" +
      "ore.Code\022,\n\004text\030\005 \001(\0132\036.google.fhir.r4." +
      "core.Narrative\022\'\n\tcontained\030\006 \003(\0132\024.goog" +
      "le.protobuf.Any\0221\n\textension\030\010 \003(\0132\036.goo" +
      "gle.fhir.r4.core.Extension\022:\n\022modifier_e" +
      "xtension\030\t \003(\0132\036.google.fhir.r4.core.Ext" +
      "ension\022-\n\003url\030\n \001(\0132\030.google.fhir.r4.cor" +
      "e.UriB\006\360\320\207\353\004\001\0223\n\nidentifier\030\013 \003(\0132\037.goog" +
      "le.fhir.r4.core.Identifier\0224\n\007version\030\014 " +
      "\001(\0132\033.google.fhir.r4.core.StringB\006\360\320\207\353\004\001" +
      "\0221\n\004name\030\r \001(\0132\033.google.fhir.r4.core.Str" +
      "ingB\006\360\320\207\353\004\001\022*\n\005title\030\016 \001(\0132\033.google.fhir" +
      ".r4.core.String\022I\n\006status\030\017 \001(\01321.google" +
      ".fhir.r4.core.ShareableValueSet.StatusCo" +
      "deB\006\360\320\207\353\004\001\022:\n\014experimental\030\020 \001(\0132\034.googl" +
      "e.fhir.r4.core.BooleanB\006\360\320\207\353\004\001\022+\n\004date\030\021" +
      " \001(\0132\035.google.fhir.r4.core.DateTime\0226\n\tp" +
      "ublisher\030\022 \001(\0132\033.google.fhir.r4.core.Str" +
      "ingB\006\360\320\207\353\004\001\0223\n\007contact\030\023 \003(\0132\".google.fh" +
      "ir.r4.core.ContactDetail\022:\n\013description\030" +
      "\024 \001(\0132\035.google.fhir.r4.core.MarkdownB\006\360\320" +
      "\207\353\004\001\0226\n\013use_context\030\025 \003(\0132!.google.fhir." +
      "r4.core.UsageContext\022:\n\014jurisdiction\030\026 \003" +
      "(\0132$.google.fhir.r4.core.CodeableConcept" +
      "\022/\n\timmutable\030\027 \001(\0132\034.google.fhir.r4.cor" +
      "e.Boolean\022.\n\007purpose\030\030 \001(\0132\035.google.fhir" +
      ".r4.core.Markdown\0220\n\tcopyright\030\031 \001(\0132\035.g" +
      "oogle.fhir.r4.core.Markdown\022?\n\007compose\030\032" +
      " \001(\0132..google.fhir.r4.core.ShareableValu" +
      "eSet.Compose\022C\n\texpansion\030\033 \001(\01320.google" +
      ".fhir.r4.core.ShareableValueSet.Expansio" +
      "n\032\230\002\n\nStatusCode\022?\n\005value\030\001 \001(\01620.google" +
      ".fhir.r4.core.PublicationStatusCode.Valu" +
      "e\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4.core.Stri" +
      "ng\0221\n\textension\030\003 \003(\0132\036.google.fhir.r4.c" +
      "ore.Extension:m\300\237\343\266\005\001\212\371\203\262\005/http://hl7.or" +
      "g/fhir/ValueSet/publication-status\232\265\216\223\006," +
      "http://hl7.org/fhir/StructureDefinition/" +
      "code\032\277\022\n\007Compose\022\'\n\002id\030\001 \001(\0132\033.google.fh" +
      "ir.r4.core.String\0221\n\textension\030\002 \003(\0132\036.g" +
      "oogle.fhir.r4.core.Extension\022:\n\022modifier" +
      "_extension\030\003 \003(\0132\036.google.fhir.r4.core.E" +
      "xtension\022.\n\013locked_date\030\004 \001(\0132\031.google.f" +
      "hir.r4.core.Date\022.\n\010inactive\030\005 \001(\0132\034.goo" +
      "gle.fhir.r4.core.Boolean\022R\n\007include\030\006 \003(" +
      "\01329.google.fhir.r4.core.ShareableValueSe" +
      "t.Compose.ConceptSetB\006\360\320\207\353\004\001\022J\n\007exclude\030" +
      "\007 \003(\01329.google.fhir.r4.core.ShareableVal" +
      "ueSet.Compose.ConceptSet\032\233\017\n\nConceptSet\022" +
      "\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.core.String" +
      "\0221\n\textension\030\002 \003(\0132\036.google.fhir.r4.cor" +
      "e.Extension\022:\n\022modifier_extension\030\003 \003(\0132" +
      "\036.google.fhir.r4.core.Extension\022(\n\006syste" +
      "m\030\004 \001(\0132\030.google.fhir.r4.core.Uri\022,\n\007ver" +
      "sion\030\005 \001(\0132\033.google.fhir.r4.core.String\022" +
      "[\n\007concept\030\006 \003(\0132J.google.fhir.r4.core.S" +
      "hareableValueSet.Compose.ConceptSet.Conc" +
      "eptReference\022P\n\006filter\030\007 \003(\0132@.google.fh" +
      "ir.r4.core.ShareableValueSet.Compose.Con" +
      "ceptSet.Filter\0221\n\tvalue_set\030\010 \003(\0132\036.goog" +
      "le.fhir.r4.core.Canonical\032\251\005\n\020ConceptRef" +
      "erence\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.core" +
      ".String\0221\n\textension\030\002 \003(\0132\036.google.fhir" +
      ".r4.core.Extension\022:\n\022modifier_extension" +
      "\030\003 \003(\0132\036.google.fhir.r4.core.Extension\022/" +
      "\n\004code\030\004 \001(\0132\031.google.fhir.r4.core.CodeB" +
      "\006\360\320\207\353\004\001\022,\n\007display\030\005 \001(\0132\033.google.fhir.r" +
      "4.core.String\022k\n\013designation\030\006 \003(\0132V.goo" +
      "gle.fhir.r4.core.ShareableValueSet.Compo" +
      "se.ConceptSet.ConceptReference.Designati" +
      "on\032\260\002\n\013Designation\022\'\n\002id\030\001 \001(\0132\033.google." +
      "fhir.r4.core.String\0221\n\textension\030\002 \003(\0132\036" +
      ".google.fhir.r4.core.Extension\022:\n\022modifi" +
      "er_extension\030\003 \003(\0132\036.google.fhir.r4.core" +
      ".Extension\022+\n\010language\030\004 \001(\0132\031.google.fh" +
      "ir.r4.core.Code\022(\n\003use\030\005 \001(\0132\033.google.fh" +
      "ir.r4.core.Coding\0222\n\005value\030\006 \001(\0132\033.googl" +
      "e.fhir.r4.core.StringB\006\360\320\207\353\004\001\032\367\004\n\006Filter" +
      "\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.core.Strin" +
      "g\0221\n\textension\030\002 \003(\0132\036.google.fhir.r4.co" +
      "re.Extension\022:\n\022modifier_extension\030\003 \003(\013" +
      "2\036.google.fhir.r4.core.Extension\0223\n\010prop" +
      "erty\030\004 \001(\0132\031.google.fhir.r4.core.CodeB\006\360" +
      "\320\207\353\004\001\022[\n\002op\030\005 \001(\0132G.google.fhir.r4.core." +
      "ShareableValueSet.Compose.ConceptSet.Fil" +
      "ter.OpCodeB\006\360\320\207\353\004\001\0222\n\005value\030\006 \001(\0132\033.goog" +
      "le.fhir.r4.core.StringB\006\360\320\207\353\004\001\032\216\002\n\006OpCod" +
      "e\022<\n\005value\030\001 \001(\0162-.google.fhir.r4.core.F" +
      "ilterOperatorCode.Value\022\'\n\002id\030\002 \001(\0132\033.go" +
      "ogle.fhir.r4.core.String\0221\n\textension\030\003 " +
      "\003(\0132\036.google.fhir.r4.core.Extension:j\300\237\343" +
      "\266\005\001\212\371\203\262\005,http://hl7.org/fhir/ValueSet/fi" +
      "lter-operator\232\265\216\223\006,http://hl7.org/fhir/S" +
      "tructureDefinition/code:\224\001\232\206\223\240\010$valueSet" +
      ".exists() or system.exists()\232\206\223\240\010=(conce" +
      "pt.exists() or filter.exists()) implies " +
      "system.exists()\232\206\223\240\010!concept.empty() or " +
      "filter.empty()\032\204\017\n\tExpansion\022\'\n\002id\030\001 \001(\013" +
      "2\033.google.fhir.r4.core.String\0221\n\textensi" +
      "on\030\002 \003(\0132\036.google.fhir.r4.core.Extension" +
      "\022:\n\022modifier_extension\030\003 \003(\0132\036.google.fh" +
      "ir.r4.core.Extension\022,\n\nidentifier\030\004 \001(\013" +
      "2\030.google.fhir.r4.core.Uri\0228\n\ttimestamp\030" +
      "\005 \001(\0132\035.google.fhir.r4.core.DateTimeB\006\360\320" +
      "\207\353\004\001\022+\n\005total\030\006 \001(\0132\034.google.fhir.r4.cor" +
      "e.Integer\022,\n\006offset\030\007 \001(\0132\034.google.fhir." +
      "r4.core.Integer\022M\n\tparameter\030\010 \003(\0132:.goo" +
      "gle.fhir.r4.core.ShareableValueSet.Expan" +
      "sion.Parameter\022K\n\010contains\030\t \003(\01329.googl" +
      "e.fhir.r4.core.ShareableValueSet.Expansi" +
      "on.Contains\032\235\005\n\tParameter\022\'\n\002id\030\001 \001(\0132\033." +
      "google.fhir.r4.core.String\0221\n\textension\030" +
      "\002 \003(\0132\036.google.fhir.r4.core.Extension\022:\n" +
      "\022modifier_extension\030\003 \003(\0132\036.google.fhir." +
      "r4.core.Extension\0221\n\004name\030\004 \001(\0132\033.google" +
      ".fhir.r4.core.StringB\006\360\320\207\353\004\001\022P\n\005value\030\005 " +
      "\001(\0132A.google.fhir.r4.core.ShareableValue" +
      "Set.Expansion.Parameter.ValueX\032\362\002\n\006Value" +
      "X\022;\n\014string_value\030\001 \001(\0132\033.google.fhir.r4" +
      ".core.StringH\000R\006string\022/\n\007boolean\030\002 \001(\0132" +
      "\034.google.fhir.r4.core.BooleanH\000\022/\n\007integ" +
      "er\030\003 \001(\0132\034.google.fhir.r4.core.IntegerH\000" +
      "\022/\n\007decimal\030\004 \001(\0132\034.google.fhir.r4.core." +
      "DecimalH\000\022\'\n\003uri\030\005 \001(\0132\030.google.fhir.r4." +
      "core.UriH\000\022)\n\004code\030\006 \001(\0132\031.google.fhir.r" +
      "4.core.CodeH\000\0222\n\tdate_time\030\007 \001(\0132\035.googl" +
      "e.fhir.r4.core.DateTimeH\000:\006\240\203\203\350\006\001B\010\n\006cho" +
      "ice\032\337\005\n\010Contains\022\'\n\002id\030\001 \001(\0132\033.google.fh" +
      "ir.r4.core.String\0221\n\textension\030\002 \003(\0132\036.g" +
      "oogle.fhir.r4.core.Extension\022:\n\022modifier" +
      "_extension\030\003 \003(\0132\036.google.fhir.r4.core.E" +
      "xtension\022(\n\006system\030\004 \001(\0132\030.google.fhir.r" +
      "4.core.Uri\022.\n\010abstract\030\005 \001(\0132\034.google.fh" +
      "ir.r4.core.Boolean\022.\n\010inactive\030\006 \001(\0132\034.g" +
      "oogle.fhir.r4.core.Boolean\022,\n\007version\030\007 " +
      "\001(\0132\033.google.fhir.r4.core.String\022\'\n\004code" +
      "\030\010 \001(\0132\031.google.fhir.r4.core.Code\022,\n\007dis" +
      "play\030\t \001(\0132\033.google.fhir.r4.core.String\022" +
      "k\n\013designation\030\n \003(\0132V.google.fhir.r4.co" +
      "re.ShareableValueSet.Compose.ConceptSet." +
      "ConceptReference.Designation\022K\n\010contains" +
      "\030\013 \003(\01329.google.fhir.r4.core.ShareableVa" +
      "lueSet.Expansion.Contains:r\232\206\223\240\010!code.ex" +
      "ists() or display.exists()\232\206\223\240\010 code.exi" +
      "sts() or abstract = true\232\206\223\240\010\037code.empty" +
      "() or system.exists():\3369\300\237\343\266\005\003\232\265\216\223\0060http" +
      "://hl7.org/fhir/StructureDefinition/Valu" +
      "eSet\262\376\344\227\0069http://hl7.org/fhir/StructureD" +
      "efinition/shareablevalueset\262\365\365\327\tR\n\004code\020" +
      "\004\032HValueSet.expansion.contains.code | Va" +
      "lueSet.compose.include.concept.code\262\365\365\327\t" +
      "\244\006\n\007context\020\004\032\226\006(CapabilityStatement.use" +
      "Context.value as CodeableConcept) | (Cod" +
      "eSystem.useContext.value as CodeableConc" +
      "ept) | (CompartmentDefinition.useContext" +
      ".value as CodeableConcept) | (ConceptMap" +
      ".useContext.value as CodeableConcept) | " +
      "(GraphDefinition.useContext.value as Cod" +
      "eableConcept) | (ImplementationGuide.use" +
      "Context.value as CodeableConcept) | (Mes" +
      "sageDefinition.useContext.value as Codea" +
      "bleConcept) | (NamingSystem.useContext.v" +
      "alue as CodeableConcept) | (OperationDef" +
      "inition.useContext.value as CodeableConc" +
      "ept) | (SearchParameter.useContext.value" +
      " as CodeableConcept) | (StructureDefinit" +
      "ion.useContext.value as CodeableConcept)" +
      " | (StructureMap.useContext.value as Cod" +
      "eableConcept) | (TerminologyCapabilities" +
      ".useContext.value as CodeableConcept) | " +
      "(ValueSet.useContext.value as CodeableCo" +
      "ncept)\262\365\365\327\t\330\n\n\020context-quantity\020\007\032\301\n(Cap" +
      "abilityStatement.useContext.value as Qua" +
      "ntity) | (CapabilityStatement.useContext" +
      ".value as Range) | (CodeSystem.useContex" +
      "t.value as Quantity) | (CodeSystem.useCo" +
      "ntext.value as Range) | (CompartmentDefi" +
      "nition.useContext.value as Quantity) | (" +
      "CompartmentDefinition.useContext.value a" +
      "s Range) | (ConceptMap.useContext.value " +
      "as Quantity) | (ConceptMap.useContext.va" +
      "lue as Range) | (GraphDefinition.useCont" +
      "ext.value as Quantity) | (GraphDefinitio" +
      "n.useContext.value as Range) | (Implemen" +
      "tationGuide.useContext.value as Quantity" +
      ") | (ImplementationGuide.useContext.valu" +
      "e as Range) | (MessageDefinition.useCont" +
      "ext.value as Quantity) | (MessageDefinit" +
      "ion.useContext.value as Range) | (Naming" +
      "System.useContext.value as Quantity) | (" +
      "NamingSystem.useContext.value as Range) " +
      "| (OperationDefinition.useContext.value " +
      "as Quantity) | (OperationDefinition.useC" +
      "ontext.value as Range) | (SearchParamete" +
      "r.useContext.value as Quantity) | (Searc" +
      "hParameter.useContext.value as Range) | " +
      "(StructureDefinition.useContext.value as" +
      " Quantity) | (StructureDefinition.useCon" +
      "text.value as Range) | (StructureMap.use" +
      "Context.value as Quantity) | (StructureM" +
      "ap.useContext.value as Range) | (Termino" +
      "logyCapabilities.useContext.value as Qua" +
      "ntity) | (TerminologyCapabilities.useCon" +
      "text.value as Range) | (ValueSet.useCont" +
      "ext.value as Quantity) | (ValueSet.useCo" +
      "ntext.value as Range)\262\365\365\327\t\365\003\n\014context-ty" +
      "pe\020\004\032\342\003CapabilityStatement.useContext.co" +
      "de | CodeSystem.useContext.code | Compar" +
      "tmentDefinition.useContext.code | Concep" +
      "tMap.useContext.code | GraphDefinition.u" +
      "seContext.code | ImplementationGuide.use" +
      "Context.code | MessageDefinition.useCont" +
      "ext.code | NamingSystem.useContext.code " +
      "| OperationDefinition.useContext.code | " +
      "SearchParameter.useContext.code | Struct" +
      "ureDefinition.useContext.code | Structur" +
      "eMap.useContext.code | TerminologyCapabi" +
      "lities.useContext.code | ValueSet.useCon" +
      "text.code\262\365\365\327\t\270\003\n\025context-type-quantity\020" +
      "\006\032\234\003CapabilityStatement.useContext | Cod" +
      "eSystem.useContext | CompartmentDefiniti" +
      "on.useContext | ConceptMap.useContext | " +
      "GraphDefinition.useContext | Implementat" +
      "ionGuide.useContext | MessageDefinition." +
      "useContext | NamingSystem.useContext | O" +
      "perationDefinition.useContext | SearchPa" +
      "rameter.useContext | StructureDefinition" +
      ".useContext | StructureMap.useContext | " +
      "TerminologyCapabilities.useContext | Val" +
      "ueSet.useContext\262\365\365\327\t\265\003\n\022context-type-va" +
      "lue\020\006\032\234\003CapabilityStatement.useContext |" +
      " CodeSystem.useContext | CompartmentDefi" +
      "nition.useContext | ConceptMap.useContex" +
      "t | GraphDefinition.useContext | Impleme" +
      "ntationGuide.useContext | MessageDefinit" +
      "ion.useContext | NamingSystem.useContext" +
      " | OperationDefinition.useContext | Sear" +
      "chParameter.useContext | StructureDefini" +
      "tion.useContext | StructureMap.useContex" +
      "t | TerminologyCapabilities.useContext |" +
      " ValueSet.useContext\262\365\365\327\t\323\002\n\004date\020\002\032\310\002Ca" +
      "pabilityStatement.date | CodeSystem.date" +
      " | CompartmentDefinition.date | ConceptM" +
      "ap.date | GraphDefinition.date | Impleme" +
      "ntationGuide.date | MessageDefinition.da" +
      "te | NamingSystem.date | OperationDefini" +
      "tion.date | SearchParameter.date | Struc" +
      "tureDefinition.date | StructureMap.date " +
      "| TerminologyCapabilities.date | ValueSe" +
      "t.date\262\365\365\327\t\274\003\n\013description\020\003\032\252\003Capabilit" +
      "yStatement.description | CodeSystem.desc" +
      "ription | CompartmentDefinition.descript" +
      "ion | ConceptMap.description | GraphDefi" +
      "nition.description | ImplementationGuide" +
      ".description | MessageDefinition.descrip" +
      "tion | NamingSystem.description | Operat" +
      "ionDefinition.description | SearchParame" +
      "ter.description | StructureDefinition.de" +
      "scription | StructureMap.description | T" +
      "erminologyCapabilities.description | Val" +
      "ueSet.description\262\365\365\327\t,\n\texpansion\020\010\032\035Va" +
      "lueSet.expansion.identifier\262\365\365\327\t\256\001\n\niden" +
      "tifier\020\004\032\235\001CodeSystem.identifier | Conce" +
      "ptMap.identifier | MessageDefinition.ide" +
      "ntifier | StructureDefinition.identifier" +
      " | StructureMap.identifier | ValueSet.id" +
      "entifier\262\365\365\327\t\246\003\n\014jurisdiction\020\004\032\223\003Capabi" +
      "lityStatement.jurisdiction | CodeSystem." +
      "jurisdiction | ConceptMap.jurisdiction |" +
      " GraphDefinition.jurisdiction | Implemen" +
      "tationGuide.jurisdiction | MessageDefini" +
      "tion.jurisdiction | NamingSystem.jurisdi" +
      "ction | OperationDefinition.jurisdiction" +
      " | SearchParameter.jurisdiction | Struct" +
      "ureDefinition.jurisdiction | StructureMa" +
      "p.jurisdiction | TerminologyCapabilities" +
      ".jurisdiction | ValueSet.jurisdiction\262\365\365" +
      "\327\t\323\002\n\004name\020\003\032\310\002CapabilityStatement.name " +
      "| CodeSystem.name | CompartmentDefinitio" +
      "n.name | ConceptMap.name | GraphDefiniti" +
      "on.name | ImplementationGuide.name | Mes" +
      "sageDefinition.name | NamingSystem.name " +
      "| OperationDefinition.name | SearchParam" +
      "eter.name | StructureDefinition.name | S" +
      "tructureMap.name | TerminologyCapabiliti" +
      "es.name | ValueSet.name\262\365\365\327\t\236\003\n\tpublishe" +
      "r\020\003\032\216\003CapabilityStatement.publisher | Co" +
      "deSystem.publisher | CompartmentDefiniti" +
      "on.publisher | ConceptMap.publisher | Gr" +
      "aphDefinition.publisher | Implementation" +
      "Guide.publisher | MessageDefinition.publ" +
      "isher | NamingSystem.publisher | Operati" +
      "onDefinition.publisher | SearchParameter" +
      ".publisher | StructureDefinition.publish" +
      "er | StructureMap.publisher | Terminolog" +
      "yCapabilities.publisher | ValueSet.publi" +
      "sher\262\365\365\327\t.\n\treference\020\010\032\037ValueSet.compos" +
      "e.include.system\262\365\365\327\t\361\002\n\006status\020\004\032\344\002Capa" +
      "bilityStatement.status | CodeSystem.stat" +
      "us | CompartmentDefinition.status | Conc" +
      "eptMap.status | GraphDefinition.status |" +
      " ImplementationGuide.status | MessageDef" +
      "inition.status | NamingSystem.status | O" +
      "perationDefinition.status | SearchParame" +
      "ter.status | StructureDefinition.status " +
      "| StructureMap.status | TerminologyCapab" +
      "ilities.status | ValueSet.status\262\365\365\327\t\377\001\n" +
      "\005title\020\003\032\363\001CapabilityStatement.title | C" +
      "odeSystem.title | ConceptMap.title | Imp" +
      "lementationGuide.title | MessageDefiniti" +
      "on.title | OperationDefinition.title | S" +
      "tructureDefinition.title | StructureMap." +
      "title | TerminologyCapabilities.title | " +
      "ValueSet.title\262\365\365\327\t\261\002\n\003url\020\010\032\247\002Capabilit" +
      "yStatement.url | CodeSystem.url | Compar" +
      "tmentDefinition.url | ConceptMap.url | G" +
      "raphDefinition.url | ImplementationGuide" +
      ".url | MessageDefinition.url | Operation" +
      "Definition.url | SearchParameter.url | S" +
      "tructureDefinition.url | StructureMap.ur" +
      "l | TerminologyCapabilities.url | ValueS" +
      "et.url\262\365\365\327\t\351\002\n\007version\020\004\032\333\002CapabilitySta" +
      "tement.version | CodeSystem.version | Co" +
      "mpartmentDefinition.version | ConceptMap" +
      ".version | GraphDefinition.version | Imp" +
      "lementationGuide.version | MessageDefini" +
      "tion.version | OperationDefinition.versi" +
      "on | SearchParameter.version | Structure" +
      "Definition.version | StructureMap.versio" +
      "n | TerminologyCapabilities.version | Va" +
      "lueSet.versionJ\004\010\007\020\010B!\n\027com.google.fhir." +
      "r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Codes.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_ShareableValueSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_ShareableValueSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableValueSet_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Url", "Identifier", "Version", "Name", "Title", "Status", "Experimental", "Date", "Publisher", "Contact", "Description", "UseContext", "Jurisdiction", "Immutable", "Purpose", "Copyright", "Compose", "Expansion", });
    internal_static_google_fhir_r4_core_ShareableValueSet_StatusCode_descriptor =
      internal_static_google_fhir_r4_core_ShareableValueSet_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ShareableValueSet_StatusCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableValueSet_StatusCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_descriptor =
      internal_static_google_fhir_r4_core_ShareableValueSet_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableValueSet_Compose_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "LockedDate", "Inactive", "Include", "Exclude", });
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_descriptor =
      internal_static_google_fhir_r4_core_ShareableValueSet_Compose_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "System", "Version", "Concept", "Filter", "ValueSet", });
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_ConceptReference_descriptor =
      internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_ConceptReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_ConceptReference_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Code", "Display", "Designation", });
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_ConceptReference_Designation_descriptor =
      internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_ConceptReference_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_ConceptReference_Designation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_ConceptReference_Designation_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Language", "Use", "Value", });
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_Filter_descriptor =
      internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_Filter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_Filter_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Property", "Op", "Value", });
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_Filter_OpCode_descriptor =
      internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_Filter_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_Filter_OpCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableValueSet_Compose_ConceptSet_Filter_OpCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_descriptor =
      internal_static_google_fhir_r4_core_ShareableValueSet_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Identifier", "Timestamp", "Total", "Offset", "Parameter", "Contains", });
    internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_Parameter_descriptor =
      internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_Parameter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_Parameter_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Name", "Value", });
    internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_Parameter_ValueX_descriptor =
      internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_Parameter_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_Parameter_ValueX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_Parameter_ValueX_descriptor,
        new java.lang.String[] { "StringValue", "Boolean", "Integer", "Decimal", "Uri", "Code", "DateTime", "Choice", });
    internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_Contains_descriptor =
      internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_Contains_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ShareableValueSet_Expansion_Contains_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "System", "Abstract", "Inactive", "Version", "Code", "Display", "Designation", "Contains", });
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
