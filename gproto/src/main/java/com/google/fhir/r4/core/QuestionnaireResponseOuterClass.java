// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/questionnaire_response.proto

package com.google.fhir.r4.core;

public final class QuestionnaireResponseOuterClass {
  private QuestionnaireResponseOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_QuestionnaireResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_QuestionnaireResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_QuestionnaireResponse_StatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_QuestionnaireResponse_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_QuestionnaireResponse_Item_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_QuestionnaireResponse_Item_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_QuestionnaireResponse_Item_Answer_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_QuestionnaireResponse_Item_Answer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_QuestionnaireResponse_Item_Answer_ValueX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_QuestionnaireResponse_Item_Answer_ValueX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4proto/r4/core/resources/questionnaire_"
          + "response.proto\022\023google.fhir.r4.core\032\031goo"
          + "gle/protobuf/any.proto\032\027proto/annotation"
          + "s.proto\032\031proto/r4/core/codes.proto\032\035prot"
          + "o/r4/core/datatypes.proto\"\214\030\n\025Questionna"
          + "ireResponse\022#\n\002id\030\001 \001(\0132\027.google.fhir.r4"
          + ".core.Id\022\'\n\004meta\030\002 \001(\0132\031.google.fhir.r4."
          + "core.Meta\0220\n\016implicit_rules\030\003 \001(\0132\030.goog"
          + "le.fhir.r4.core.Uri\022+\n\010language\030\004 \001(\0132\031."
          + "google.fhir.r4.core.Code\022,\n\004text\030\005 \001(\0132\036"
          + ".google.fhir.r4.core.Narrative\022\'\n\tcontai"
          + "ned\030\006 \003(\0132\024.google.protobuf.Any\0221\n\texten"
          + "sion\030\010 \003(\0132\036.google.fhir.r4.core.Extensi"
          + "on\022:\n\022modifier_extension\030\t \003(\0132\036.google."
          + "fhir.r4.core.Extension\0223\n\nidentifier\030\n \001"
          + "(\0132\037.google.fhir.r4.core.Identifier\022T\n\010b"
          + "ased_on\030\013 \003(\0132\036.google.fhir.r4.core.Refe"
          + "renceB\"\362\377\374\302\006\010CarePlan\362\377\374\302\006\016ServiceReques"
          + "t\022Q\n\007part_of\030\014 \003(\0132\036.google.fhir.r4.core"
          + ".ReferenceB \362\377\374\302\006\013Observation\362\377\374\302\006\tProce"
          + "dure\0225\n\rquestionnaire\030\r \001(\0132\036.google.fhi"
          + "r.r4.core.Canonical\022M\n\006status\030\016 \001(\01325.go"
          + "ogle.fhir.r4.core.QuestionnaireResponse."
          + "StatusCodeB\006\360\320\207\353\004\001\022?\n\007subject\030\017 \001(\0132\036.go"
          + "ogle.fhir.r4.core.ReferenceB\016\362\377\374\302\006\010Resou"
          + "rce\022B\n\tencounter\030\020 \001(\0132\036.google.fhir.r4."
          + "core.ReferenceB\017\362\377\374\302\006\tEncounter\022/\n\010autho"
          + "red\030\021 \001(\0132\035.google.fhir.r4.core.DateTime"
          + "\022\226\001\n\006author\030\022 \001(\0132\036.google.fhir.r4.core."
          + "ReferenceBf\362\377\374\302\006\006Device\362\377\374\302\006\014Practitione"
          + "r\362\377\374\302\006\020PractitionerRole\362\377\374\302\006\007Patient\362\377\374\302"
          + "\006\rRelatedPerson\362\377\374\302\006\014Organization\022x\n\006sou"
          + "rce\030\023 \001(\0132\036.google.fhir.r4.core.Referenc"
          + "eBH\362\377\374\302\006\007Patient\362\377\374\302\006\014Practitioner\362\377\374\302\006\020"
          + "PractitionerRole\362\377\374\302\006\rRelatedPerson\022=\n\004i"
          + "tem\030\024 \003(\0132/.google.fhir.r4.core.Question"
          + "naireResponse.Item\032\254\002\n\nStatusCode\022I\n\005val"
          + "ue\030\001 \001(\0162:.google.fhir.r4.core.Questionn"
          + "aireResponseStatusCode.Value\022\'\n\002id\030\002 \001(\013"
          + "2\033.google.fhir.r4.core.String\0221\n\textensi"
          + "on\030\003 \003(\0132\036.google.fhir.r4.core.Extension"
          + ":w\300\237\343\266\005\001\212\371\203\262\0059http://hl7.org/fhir/ValueS"
          + "et/questionnaire-answers-status\232\265\216\223\006,htt"
          + "p://hl7.org/fhir/StructureDefinition/cod"
          + "e\032\223\013\n\004Item\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4."
          + "core.String\0221\n\textension\030\002 \003(\0132\036.google."
          + "fhir.r4.core.Extension\022:\n\022modifier_exten"
          + "sion\030\003 \003(\0132\036.google.fhir.r4.core.Extensi"
          + "on\0224\n\007link_id\030\004 \001(\0132\033.google.fhir.r4.cor"
          + "e.StringB\006\360\320\207\353\004\001\022,\n\ndefinition\030\005 \001(\0132\030.g"
          + "oogle.fhir.r4.core.Uri\022)\n\004text\030\006 \001(\0132\033.g"
          + "oogle.fhir.r4.core.String\022F\n\006answer\030\007 \003("
          + "\01326.google.fhir.r4.core.QuestionnaireRes"
          + "ponse.Item.Answer\022=\n\004item\030\010 \003(\0132/.google"
          + ".fhir.r4.core.QuestionnaireResponse.Item"
          + "\032\253\007\n\006Answer\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4"
          + ".core.String\0221\n\textension\030\002 \003(\0132\036.google"
          + ".fhir.r4.core.Extension\022:\n\022modifier_exte"
          + "nsion\030\003 \003(\0132\036.google.fhir.r4.core.Extens"
          + "ion\022L\n\005value\030\004 \001(\0132=.google.fhir.r4.core"
          + ".QuestionnaireResponse.Item.Answer.Value"
          + "X\022=\n\004item\030\005 \003(\0132/.google.fhir.r4.core.Qu"
          + "estionnaireResponse.Item\032\373\004\n\006ValueX\022/\n\007b"
          + "oolean\030\001 \001(\0132\034.google.fhir.r4.core.Boole"
          + "anH\000\022/\n\007decimal\030\002 \001(\0132\034.google.fhir.r4.c"
          + "ore.DecimalH\000\022/\n\007integer\030\003 \001(\0132\034.google."
          + "fhir.r4.core.IntegerH\000\022)\n\004date\030\004 \001(\0132\031.g"
          + "oogle.fhir.r4.core.DateH\000\0222\n\tdate_time\030\005"
          + " \001(\0132\035.google.fhir.r4.core.DateTimeH\000\022)\n"
          + "\004time\030\006 \001(\0132\031.google.fhir.r4.core.TimeH\000"
          + "\022;\n\014string_value\030\007 \001(\0132\033.google.fhir.r4."
          + "core.StringH\000R\006string\022\'\n\003uri\030\010 \001(\0132\030.goo"
          + "gle.fhir.r4.core.UriH\000\0225\n\nattachment\030\t \001"
          + "(\0132\037.google.fhir.r4.core.AttachmentH\000\022-\n"
          + "\006coding\030\n \001(\0132\033.google.fhir.r4.core.Codi"
          + "ngH\000\0221\n\010quantity\030\013 \001(\0132\035.google.fhir.r4."
          + "core.QuantityH\000\022C\n\treference\030\014 \001(\0132\036.goo"
          + "gle.fhir.r4.core.ReferenceB\016\362\377\374\302\006\010Resour"
          + "ceH\000:\006\240\203\203\350\006\001B\010\n\006choice:/\232\206\223\240\010)(answer.ex"
          + "ists() and item.exists()).not():I\300\237\343\266\005\003\262"
          + "\376\344\227\006=http://hl7.org/fhir/StructureDefini"
          + "tion/QuestionnaireResponseJ\004\010\007\020\010B!\n\027com."
          + "google.fhir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
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
    internal_static_google_fhir_r4_core_QuestionnaireResponse_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_QuestionnaireResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_QuestionnaireResponse_descriptor,
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
              "BasedOn",
              "PartOf",
              "Questionnaire",
              "Status",
              "Subject",
              "Encounter",
              "Authored",
              "Author",
              "Source",
              "Item",
            });
    internal_static_google_fhir_r4_core_QuestionnaireResponse_StatusCode_descriptor =
        internal_static_google_fhir_r4_core_QuestionnaireResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_QuestionnaireResponse_StatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_QuestionnaireResponse_StatusCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_QuestionnaireResponse_Item_descriptor =
        internal_static_google_fhir_r4_core_QuestionnaireResponse_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_fhir_r4_core_QuestionnaireResponse_Item_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_QuestionnaireResponse_Item_descriptor,
            new java.lang.String[] {
              "Id",
              "Extension",
              "ModifierExtension",
              "LinkId",
              "Definition",
              "Text",
              "Answer",
              "Item",
            });
    internal_static_google_fhir_r4_core_QuestionnaireResponse_Item_Answer_descriptor =
        internal_static_google_fhir_r4_core_QuestionnaireResponse_Item_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_QuestionnaireResponse_Item_Answer_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_QuestionnaireResponse_Item_Answer_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Value", "Item",
            });
    internal_static_google_fhir_r4_core_QuestionnaireResponse_Item_Answer_ValueX_descriptor =
        internal_static_google_fhir_r4_core_QuestionnaireResponse_Item_Answer_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_QuestionnaireResponse_Item_Answer_ValueX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_QuestionnaireResponse_Item_Answer_ValueX_descriptor,
            new java.lang.String[] {
              "Boolean",
              "Decimal",
              "Integer",
              "Date",
              "DateTime",
              "Time",
              "StringValue",
              "Uri",
              "Attachment",
              "Coding",
              "Quantity",
              "Reference",
              "Choice",
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