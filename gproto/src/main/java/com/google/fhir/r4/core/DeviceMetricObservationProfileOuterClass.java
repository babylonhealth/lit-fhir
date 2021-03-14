// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/profiles/device_metric_observation_profile.proto

package com.google.fhir.r4.core;

public final class DeviceMetricObservationProfileOuterClass {
  private DeviceMetricObservationProfileOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_StatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_EffectiveX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_EffectiveX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ValueX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ValueX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ReferenceRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ReferenceRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_ValueX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_ValueX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n>proto/r4/core/profiles/device_metric_o"
          + "bservation_profile.proto\022\023google.fhir.r4"
          + ".core\032\031google/protobuf/any.proto\032\027proto/"
          + "annotations.proto\032\031proto/r4/core/codes.p"
          + "roto\032\035proto/r4/core/datatypes.proto\"\303&\n\036"
          + "DeviceMetricObservationProfile\022#\n\002id\030\001 \001"
          + "(\0132\027.google.fhir.r4.core.Id\022\'\n\004meta\030\002 \001("
          + "\0132\031.google.fhir.r4.core.Meta\0220\n\016implicit"
          + "_rules\030\003 \001(\0132\030.google.fhir.r4.core.Uri\022+"
          + "\n\010language\030\004 \001(\0132\031.google.fhir.r4.core.C"
          + "ode\022,\n\004text\030\005 \001(\0132\036.google.fhir.r4.core."
          + "Narrative\022\'\n\tcontained\030\006 \003(\0132\024.google.pr"
          + "otobuf.Any\0221\n\textension\030\010 \003(\0132\036.google.f"
          + "hir.r4.core.Extension\022:\n\022modifier_extens"
          + "ion\030\t \003(\0132\036.google.fhir.r4.core.Extensio"
          + "n\0223\n\nidentifier\030\n \003(\0132\037.google.fhir.r4.c"
          + "ore.Identifier\022\263\001\n\010based_on\030\013 \003(\0132\036.goog"
          + "le.fhir.r4.core.ReferenceB\200\001\362\377\374\302\006\010CarePl"
          + "an\362\377\374\302\006\rDeviceRequest\362\377\374\302\006\032ImmunizationR"
          + "ecommendation\362\377\374\302\006\021MedicationRequest\362\377\374\302"
          + "\006\016NutritionOrder\362\377\374\302\006\016ServiceRequest\022\264\001\n"
          + "\007part_of\030\014 \003(\0132\036.google.fhir.r4.core.Ref"
          + "erenceB\202\001\362\377\374\302\006\030MedicationAdministration\362"
          + "\377\374\302\006\022MedicationDispense\362\377\374\302\006\023MedicationS"
          + "tatement\362\377\374\302\006\tProcedure\362\377\374\302\006\014Immunizatio"
          + "n\362\377\374\302\006\014ImagingStudy\022V\n\006status\030\r \001(\0132>.go"
          + "ogle.fhir.r4.core.DeviceMetricObservatio"
          + "nProfile.StatusCodeB\006\360\320\207\353\004\001\0226\n\010category\030"
          + "\016 \003(\0132$.google.fhir.r4.core.CodeableConc"
          + "ept\022:\n\004code\030\017 \001(\0132$.google.fhir.r4.core."
          + "CodeableConceptB\006\360\320\207\353\004\001\022P\n\007subject\030\020 \001(\013"
          + "2\036.google.fhir.r4.core.ReferenceB\037\360\320\207\353\004\001"
          + "\362\377\374\302\006\007Patient\362\377\374\302\006\006Device\022=\n\005focus\030\021 \003(\013"
          + "2\036.google.fhir.r4.core.ReferenceB\016\362\377\374\302\006\010"
          + "Resource\022Y\n\teffective\030\023 \001(\0132>.google.fhi"
          + "r.r4.core.DeviceMetricObservationProfile"
          + ".EffectiveXB\006\360\320\207\353\004\001\022\233\001\n\tperformer\030\025 \003(\0132"
          + "\036.google.fhir.r4.core.ReferenceBh\362\377\374\302\006\014P"
          + "ractitioner\362\377\374\302\006\020PractitionerRole\362\377\374\302\006\014O"
          + "rganization\362\377\374\302\006\010CareTeam\362\377\374\302\006\007Patient\362\377"
          + "\374\302\006\rRelatedPerson\022I\n\005value\030\026 \001(\0132:.googl"
          + "e.fhir.r4.core.DeviceMetricObservationPr"
          + "ofile.ValueX\022<\n\016interpretation\030\030 \001(\0132$.g"
          + "oogle.fhir.r4.core.CodeableConcept\022-\n\004no"
          + "te\030\031 \003(\0132\037.google.fhir.r4.core.Annotatio"
          + "n\0227\n\tbody_site\030\032 \001(\0132$.google.fhir.r4.co"
          + "re.CodeableConcept\0224\n\006method\030\033 \001(\0132$.goo"
          + "gle.fhir.r4.core.CodeableConcept\022H\n\006devi"
          + "ce\030\035 \001(\0132\036.google.fhir.r4.core.Reference"
          + "B\030\360\320\207\353\004\001\362\377\374\302\006\014DeviceMetric\022[\n\017reference_"
          + "range\030\036 \001(\0132B.google.fhir.r4.core.Device"
          + "MetricObservationProfile.ReferenceRange\022"
          + "E\n\nhas_member\030\037 \003(\0132\036.google.fhir.r4.cor"
          + "e.ReferenceB\021\362\377\374\302\006\013Observation\022G\n\014derive"
          + "d_from\030  \003(\0132\036.google.fhir.r4.core.Refer"
          + "enceB\021\362\377\374\302\006\013Observation\022P\n\tcomponent\030! \003"
          + "(\0132=.google.fhir.r4.core.DeviceMetricObs"
          + "ervationProfile.Component\032\230\002\n\nStatusCode"
          + "\022?\n\005value\030\001 \001(\01620.google.fhir.r4.core.Ob"
          + "servationStatusCode.Value\022\'\n\002id\030\002 \001(\0132\033."
          + "google.fhir.r4.core.String\0221\n\textension\030"
          + "\003 \003(\0132\036.google.fhir.r4.core.Extension:m\300"
          + "\237\343\266\005\001\212\371\203\262\005/http://hl7.org/fhir/ValueSet/"
          + "observation-status\232\265\216\223\006,http://hl7.org/f"
          + "hir/StructureDefinition/code\032R\n\nEffectiv"
          + "eX\0222\n\tdate_time\030\001 \001(\0132\035.google.fhir.r4.c"
          + "ore.DateTimeH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\356\003\n\006Val"
          + "ueX\0221\n\010quantity\030\001 \001(\0132\035.google.fhir.r4.c"
          + "ore.QuantityH\000\022@\n\020codeable_concept\030\002 \001(\013"
          + "2$.google.fhir.r4.core.CodeableConceptH\000"
          + "\022;\n\014string_value\030\003 \001(\0132\033.google.fhir.r4."
          + "core.StringH\000R\006string\022+\n\005range\030\006 \001(\0132\032.g"
          + "oogle.fhir.r4.core.RangeH\000\022+\n\005ratio\030\007 \001("
          + "\0132\032.google.fhir.r4.core.RatioH\000\0228\n\014sampl"
          + "ed_data\030\010 \001(\0132 .google.fhir.r4.core.Samp"
          + "ledDataH\000\022)\n\004time\030\t \001(\0132\031.google.fhir.r4"
          + ".core.TimeH\000\0222\n\tdate_time\030\n \001(\0132\035.google"
          + ".fhir.r4.core.DateTimeH\000\022-\n\006period\030\013 \001(\013"
          + "2\033.google.fhir.r4.core.PeriodH\000:\006\240\203\203\350\006\001B"
          + "\010\n\006choice\032\205\004\n\016ReferenceRange\022\'\n\002id\030\001 \001(\013"
          + "2\033.google.fhir.r4.core.String\0221\n\textensi"
          + "on\030\002 \003(\0132\036.google.fhir.r4.core.Extension"
          + "\022:\n\022modifier_extension\030\003 \003(\0132\036.google.fh"
          + "ir.r4.core.Extension\0220\n\003low\030\004 \001(\0132#.goog"
          + "le.fhir.r4.core.SimpleQuantity\0221\n\004high\030\005"
          + " \001(\0132#.google.fhir.r4.core.SimpleQuantit"
          + "y\0222\n\004type\030\006 \001(\0132$.google.fhir.r4.core.Co"
          + "deableConcept\0228\n\napplies_to\030\007 \003(\0132$.goog"
          + "le.fhir.r4.core.CodeableConcept\022\'\n\003age\030\010"
          + " \001(\0132\032.google.fhir.r4.core.Range\022)\n\004text"
          + "\030\t \001(\0132\033.google.fhir.r4.core.String:4\232\206\223"
          + "\240\010.low.exists() or high.exists() or text"
          + ".exists()\032\344\010\n\tComponent\022\'\n\002id\030\001 \001(\0132\033.go"
          + "ogle.fhir.r4.core.String\0221\n\textension\030\002 "
          + "\003(\0132\036.google.fhir.r4.core.Extension\022:\n\022m"
          + "odifier_extension\030\003 \003(\0132\036.google.fhir.r4"
          + ".core.Extension\022:\n\004code\030\004 \001(\0132$.google.f"
          + "hir.r4.core.CodeableConceptB\006\360\320\207\353\004\001\022S\n\005v"
          + "alue\030\005 \001(\0132D.google.fhir.r4.core.DeviceM"
          + "etricObservationProfile.Component.ValueX"
          + "\022@\n\022data_absent_reason\030\006 \001(\0132$.google.fh"
          + "ir.r4.core.CodeableConcept\022<\n\016interpreta"
          + "tion\030\007 \003(\0132$.google.fhir.r4.core.Codeabl"
          + "eConcept\022[\n\017reference_range\030\010 \003(\0132B.goog"
          + "le.fhir.r4.core.DeviceMetricObservationP"
          + "rofile.ReferenceRange\032\320\004\n\006ValueX\0221\n\010quan"
          + "tity\030\001 \001(\0132\035.google.fhir.r4.core.Quantit"
          + "yH\000\022@\n\020codeable_concept\030\002 \001(\0132$.google.f"
          + "hir.r4.core.CodeableConceptH\000\022;\n\014string_"
          + "value\030\003 \001(\0132\033.google.fhir.r4.core.String"
          + "H\000R\006string\022/\n\007boolean\030\004 \001(\0132\034.google.fhi"
          + "r.r4.core.BooleanH\000\022/\n\007integer\030\005 \001(\0132\034.g"
          + "oogle.fhir.r4.core.IntegerH\000\022+\n\005range\030\006 "
          + "\001(\0132\032.google.fhir.r4.core.RangeH\000\022+\n\005rat"
          + "io\030\007 \001(\0132\032.google.fhir.r4.core.RatioH\000\0228"
          + "\n\014sampled_data\030\010 \001(\0132 .google.fhir.r4.co"
          + "re.SampledDataH\000\022)\n\004time\030\t \001(\0132\031.google."
          + "fhir.r4.core.TimeH\000\0222\n\tdate_time\030\n \001(\0132\035"
          + ".google.fhir.r4.core.DateTimeH\000\022-\n\006perio"
          + "d\030\013 \001(\0132\033.google.fhir.r4.core.PeriodH\000:\006"
          + "\240\203\203\350\006\001B\010\n\006choice:\230\002\300\237\343\266\005\003\232\265\216\223\0063http://hl"
          + "7.org/fhir/StructureDefinition/Observati"
          + "on\262\376\344\227\006?http://hl7.org/fhir/StructureDef"
          + "inition/devicemetricobservation\232\206\223\240\010)dat"
          + "aAbsentReason.empty() or value.empty()\232\206"
          + "\223\240\010_value.empty() or component.code.wher"
          + "e(coding.intersect(%resource.code.coding"
          + ").exists()).empty()J\004\010\007\020\010J\004\010\022\020\023J\004\010\024\020\025J\004\010"
          + "\027\020\030J\004\010\034\020\035B!\n\027com.google.fhir.r4.coreP\001\230\306"
          + "\260\265\007\004b\006proto3"
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
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_descriptor,
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
              "Effective",
              "Performer",
              "Value",
              "Interpretation",
              "Note",
              "BodySite",
              "Method",
              "Device",
              "ReferenceRange",
              "HasMember",
              "DerivedFrom",
              "Component",
            });
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_StatusCode_descriptor =
        internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_StatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_StatusCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_EffectiveX_descriptor =
        internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_EffectiveX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_EffectiveX_descriptor,
            new java.lang.String[] {
              "DateTime", "Choice",
            });
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ValueX_descriptor =
        internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ValueX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ValueX_descriptor,
            new java.lang.String[] {
              "Quantity",
              "CodeableConcept",
              "StringValue",
              "Range",
              "Ratio",
              "SampledData",
              "Time",
              "DateTime",
              "Period",
              "Choice",
            });
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ReferenceRange_descriptor =
        internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ReferenceRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ReferenceRange_descriptor,
            new java.lang.String[] {
              "Id",
              "Extension",
              "ModifierExtension",
              "Low",
              "High",
              "Type",
              "AppliesTo",
              "Age",
              "Text",
            });
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_descriptor =
        internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_descriptor,
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
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_ValueX_descriptor =
        internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_ValueX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_ValueX_descriptor,
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