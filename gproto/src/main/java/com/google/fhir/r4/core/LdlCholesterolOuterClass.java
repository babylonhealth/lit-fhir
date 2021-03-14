// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/profiles/ldl_cholesterol.proto

package com.google.fhir.r4.core;

public final class LdlCholesterolOuterClass {
  private LdlCholesterolOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_LdlCholesterol_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_LdlCholesterol_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_LdlCholesterol_StatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_LdlCholesterol_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_LdlCholesterol_EffectiveX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_LdlCholesterol_EffectiveX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_LdlCholesterol_ValueX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_LdlCholesterol_ValueX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_LdlCholesterol_ReferenceRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_LdlCholesterol_ReferenceRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_LdlCholesterol_Component_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_LdlCholesterol_Component_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_LdlCholesterol_Component_ValueX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_LdlCholesterol_Component_ValueX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,proto/r4/core/profiles/ldl_cholesterol"
          + ".proto\022\023google.fhir.r4.core\032\031google/prot"
          + "obuf/any.proto\032\027proto/annotations.proto\032"
          + "\031proto/r4/core/codes.proto\032\035proto/r4/cor"
          + "e/datatypes.proto\"\257#\n\016LdlCholesterol\022#\n\002"
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
          + "r.r4.core.Identifier\022\263\001\n\010based_on\030\013 \003(\0132"
          + "\036.google.fhir.r4.core.ReferenceB\200\001\362\377\374\302\006\010"
          + "CarePlan\362\377\374\302\006\rDeviceRequest\362\377\374\302\006\032Immuniz"
          + "ationRecommendation\362\377\374\302\006\021MedicationReque"
          + "st\362\377\374\302\006\016NutritionOrder\362\377\374\302\006\016ServiceReque"
          + "st\022\264\001\n\007part_of\030\014 \003(\0132\036.google.fhir.r4.co"
          + "re.ReferenceB\202\001\362\377\374\302\006\030MedicationAdministr"
          + "ation\362\377\374\302\006\022MedicationDispense\362\377\374\302\006\023Medic"
          + "ationStatement\362\377\374\302\006\tProcedure\362\377\374\302\006\014Immun"
          + "ization\362\377\374\302\006\014ImagingStudy\022F\n\006status\030\r \001("
          + "\0132..google.fhir.r4.core.LdlCholesterol.S"
          + "tatusCodeB\006\360\320\207\353\004\001\0226\n\010category\030\016 \003(\0132$.go"
          + "ogle.fhir.r4.core.CodeableConcept\022:\n\004cod"
          + "e\030\017 \001(\0132$.google.fhir.r4.core.CodeableCo"
          + "nceptB\006\360\320\207\353\004\001\022c\n\007subject\030\020 \001(\0132\036.google."
          + "fhir.r4.core.ReferenceB2\362\377\374\302\006\007Patient\362\377\374"
          + "\302\006\005Group\362\377\374\302\006\006Device\362\377\374\302\006\010Location\022=\n\005fo"
          + "cus\030\021 \003(\0132\036.google.fhir.r4.core.Referenc"
          + "eB\016\362\377\374\302\006\010Resource\022B\n\tencounter\030\022 \001(\0132\036.g"
          + "oogle.fhir.r4.core.ReferenceB\017\362\377\374\302\006\tEnco"
          + "unter\022A\n\teffective\030\023 \001(\0132..google.fhir.r"
          + "4.core.LdlCholesterol.EffectiveX\022,\n\006issu"
          + "ed\030\024 \001(\0132\034.google.fhir.r4.core.Instant\022\233"
          + "\001\n\tperformer\030\025 \003(\0132\036.google.fhir.r4.core"
          + ".ReferenceBh\362\377\374\302\006\014Practitioner\362\377\374\302\006\020Prac"
          + "titionerRole\362\377\374\302\006\014Organization\362\377\374\302\006\010Care"
          + "Team\362\377\374\302\006\007Patient\362\377\374\302\006\rRelatedPerson\0229\n\005"
          + "value\030\026 \001(\0132*.google.fhir.r4.core.LdlCho"
          + "lesterol.ValueX\022@\n\022data_absent_reason\030\027 "
          + "\001(\0132$.google.fhir.r4.core.CodeableConcep"
          + "t\022<\n\016interpretation\030\030 \001(\0132$.google.fhir."
          + "r4.core.CodeableConcept\022-\n\004note\030\031 \003(\0132\037."
          + "google.fhir.r4.core.Annotation\0227\n\tbody_s"
          + "ite\030\032 \001(\0132$.google.fhir.r4.core.Codeable"
          + "Concept\0224\n\006method\030\033 \001(\0132$.google.fhir.r4"
          + ".core.CodeableConcept\022@\n\010specimen\030\034 \001(\0132"
          + "\036.google.fhir.r4.core.ReferenceB\016\362\377\374\302\006\010S"
          + "pecimen\022N\n\006device\030\035 \001(\0132\036.google.fhir.r4"
          + ".core.ReferenceB\036\362\377\374\302\006\006Device\362\377\374\302\006\014Devic"
          + "eMetric\022S\n\017reference_range\030\036 \001(\01322.googl"
          + "e.fhir.r4.core.LdlCholesterol.ReferenceR"
          + "angeB\006\360\320\207\353\004\001\022@\n\tcomponent\030! \003(\0132-.google"
          + ".fhir.r4.core.LdlCholesterol.Component\032\230"
          + "\002\n\nStatusCode\022?\n\005value\030\001 \001(\01620.google.fh"
          + "ir.r4.core.ObservationStatusCode.Value\022\'"
          + "\n\002id\030\002 \001(\0132\033.google.fhir.r4.core.String\022"
          + "1\n\textension\030\003 \003(\0132\036.google.fhir.r4.core"
          + ".Extension:m\300\237\343\266\005\001\212\371\203\262\005/http://hl7.org/f"
          + "hir/ValueSet/observation-status\232\265\216\223\006,htt"
          + "p://hl7.org/fhir/StructureDefinition/cod"
          + "e\032\341\001\n\nEffectiveX\0222\n\tdate_time\030\001 \001(\0132\035.go"
          + "ogle.fhir.r4.core.DateTimeH\000\022-\n\006period\030\002"
          + " \001(\0132\033.google.fhir.r4.core.PeriodH\000\022-\n\006t"
          + "iming\030\003 \001(\0132\033.google.fhir.r4.core.Timing"
          + "H\000\022/\n\007instant\030\004 \001(\0132\034.google.fhir.r4.cor"
          + "e.InstantH\000:\006\240\203\203\350\006\001B\010\n\006choice\032M\n\006ValueX\022"
          + "1\n\010quantity\030\001 \001(\0132\035.google.fhir.r4.core."
          + "QuantityH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\231\003\n\016Referen"
          + "ceRange\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.cor"
          + "e.String\0221\n\textension\030\002 \003(\0132\036.google.fhi"
          + "r.r4.core.Extension\022:\n\022modifier_extensio"
          + "n\030\003 \003(\0132\036.google.fhir.r4.core.Extension\022"
          + "v\n\004high\030\005 \001(\0132#.google.fhir.r4.core.Simp"
          + "leQuantityBC\360\320\207\353\004\001\362\276\300\244\007\037code.empty() or "
          + "system.exists()\362\276\300\244\007\022comparator.empty()\022"
          + ")\n\004text\030\t \001(\0132\033.google.fhir.r4.core.Stri"
          + "ng:4\232\206\223\240\010.low.exists() or high.exists() "
          + "or text.exists()J\004\010\004\020\005J\004\010\006\020\007J\004\010\007\020\010J\004\010\010\020\t"
          + "\032\304\010\n\tComponent\022\'\n\002id\030\001 \001(\0132\033.google.fhir"
          + ".r4.core.String\0221\n\textension\030\002 \003(\0132\036.goo"
          + "gle.fhir.r4.core.Extension\022:\n\022modifier_e"
          + "xtension\030\003 \003(\0132\036.google.fhir.r4.core.Ext"
          + "ension\022:\n\004code\030\004 \001(\0132$.google.fhir.r4.co"
          + "re.CodeableConceptB\006\360\320\207\353\004\001\022C\n\005value\030\005 \001("
          + "\01324.google.fhir.r4.core.LdlCholesterol.C"
          + "omponent.ValueX\022@\n\022data_absent_reason\030\006 "
          + "\001(\0132$.google.fhir.r4.core.CodeableConcep"
          + "t\022<\n\016interpretation\030\007 \003(\0132$.google.fhir."
          + "r4.core.CodeableConcept\022K\n\017reference_ran"
          + "ge\030\010 \003(\01322.google.fhir.r4.core.LdlCholes"
          + "terol.ReferenceRange\032\320\004\n\006ValueX\0221\n\010quant"
          + "ity\030\001 \001(\0132\035.google.fhir.r4.core.Quantity"
          + "H\000\022@\n\020codeable_concept\030\002 \001(\0132$.google.fh"
          + "ir.r4.core.CodeableConceptH\000\022;\n\014string_v"
          + "alue\030\003 \001(\0132\033.google.fhir.r4.core.StringH"
          + "\000R\006string\022/\n\007boolean\030\004 \001(\0132\034.google.fhir"
          + ".r4.core.BooleanH\000\022/\n\007integer\030\005 \001(\0132\034.go"
          + "ogle.fhir.r4.core.IntegerH\000\022+\n\005range\030\006 \001"
          + "(\0132\032.google.fhir.r4.core.RangeH\000\022+\n\005rati"
          + "o\030\007 \001(\0132\032.google.fhir.r4.core.RatioH\000\0228\n"
          + "\014sampled_data\030\010 \001(\0132 .google.fhir.r4.cor"
          + "e.SampledDataH\000\022)\n\004time\030\t \001(\0132\031.google.f"
          + "hir.r4.core.TimeH\000\0222\n\tdate_time\030\n \001(\0132\035."
          + "google.fhir.r4.core.DateTimeH\000\022-\n\006period"
          + "\030\013 \001(\0132\033.google.fhir.r4.core.PeriodH\000:\006\240"
          + "\203\203\350\006\001B\010\n\006choice:\217\002\300\237\343\266\005\003\232\265\216\223\0063http://hl7"
          + ".org/fhir/StructureDefinition/Observatio"
          + "n\262\376\344\227\0066http://hl7.org/fhir/StructureDefi"
          + "nition/ldlcholesterol\232\206\223\240\010)dataAbsentRea"
          + "son.empty() or value.empty()\232\206\223\240\010_value."
          + "empty() or component.code.where(coding.i"
          + "ntersect(%resource.code.coding).exists()"
          + ").empty()J\004\010\007\020\010J\004\010\037\020 J\004\010 \020!B!\n\027com.googl"
          + "e.fhir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
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
    internal_static_google_fhir_r4_core_LdlCholesterol_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_LdlCholesterol_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_LdlCholesterol_descriptor,
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
              "Status",
              "Category",
              "Code",
              "Subject",
              "Focus",
              "Encounter",
              "Effective",
              "Issued",
              "Performer",
              "Value",
              "DataAbsentReason",
              "Interpretation",
              "Note",
              "BodySite",
              "Method",
              "Specimen",
              "Device",
              "ReferenceRange",
              "Component",
            });
    internal_static_google_fhir_r4_core_LdlCholesterol_StatusCode_descriptor =
        internal_static_google_fhir_r4_core_LdlCholesterol_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_LdlCholesterol_StatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_LdlCholesterol_StatusCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_LdlCholesterol_EffectiveX_descriptor =
        internal_static_google_fhir_r4_core_LdlCholesterol_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_LdlCholesterol_EffectiveX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_LdlCholesterol_EffectiveX_descriptor,
            new java.lang.String[] {
              "DateTime", "Period", "Timing", "Instant", "Choice",
            });
    internal_static_google_fhir_r4_core_LdlCholesterol_ValueX_descriptor =
        internal_static_google_fhir_r4_core_LdlCholesterol_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_LdlCholesterol_ValueX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_LdlCholesterol_ValueX_descriptor,
            new java.lang.String[] {
              "Quantity", "Choice",
            });
    internal_static_google_fhir_r4_core_LdlCholesterol_ReferenceRange_descriptor =
        internal_static_google_fhir_r4_core_LdlCholesterol_descriptor.getNestedTypes().get(3);
    internal_static_google_fhir_r4_core_LdlCholesterol_ReferenceRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_LdlCholesterol_ReferenceRange_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "High", "Text",
            });
    internal_static_google_fhir_r4_core_LdlCholesterol_Component_descriptor =
        internal_static_google_fhir_r4_core_LdlCholesterol_descriptor.getNestedTypes().get(4);
    internal_static_google_fhir_r4_core_LdlCholesterol_Component_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_LdlCholesterol_Component_descriptor,
            new java.lang.String[] {
              "Id",
              "Extension",
              "ModifierExtension",
              "Code",
              "Value",
              "DataAbsentReason",
              "Interpretation",
              "ReferenceRange",
            });
    internal_static_google_fhir_r4_core_LdlCholesterol_Component_ValueX_descriptor =
        internal_static_google_fhir_r4_core_LdlCholesterol_Component_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_LdlCholesterol_Component_ValueX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_LdlCholesterol_Component_ValueX_descriptor,
            new java.lang.String[] {
              "Quantity",
              "CodeableConcept",
              "StringValue",
              "Boolean",
              "Integer",
              "Range",
              "Ratio",
              "SampledData",
              "Time",
              "DateTime",
              "Period",
              "Choice",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirPathConstraint);
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
