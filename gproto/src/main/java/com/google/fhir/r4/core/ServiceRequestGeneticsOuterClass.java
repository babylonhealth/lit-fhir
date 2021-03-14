// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/profiles/service_request_genetics.proto

package com.google.fhir.r4.core;

public final class ServiceRequestGeneticsOuterClass {
  private ServiceRequestGeneticsOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_StatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_IntentCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_IntentCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_PriorityCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_PriorityCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_QuantityX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_QuantityX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_OccurrenceX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_OccurrenceX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_AsNeededX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_AsNeededX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5proto/r4/core/profiles/service_request"
          + "_genetics.proto\022\023google.fhir.r4.core\032\031go"
          + "ogle/protobuf/any.proto\032\027proto/annotatio"
          + "ns.proto\032\031proto/r4/core/codes.proto\032\035pro"
          + "to/r4/core/datatypes.proto\032\036proto/r4/cor"
          + "e/extensions.proto\"\335#\n\026ServiceRequestGen"
          + "etics\022#\n\002id\030\001 \001(\0132\027.google.fhir.r4.core."
          + "Id\022\'\n\004meta\030\002 \001(\0132\031.google.fhir.r4.core.M"
          + "eta\0220\n\016implicit_rules\030\003 \001(\0132\030.google.fhi"
          + "r.r4.core.Uri\022+\n\010language\030\004 \001(\0132\031.google"
          + ".fhir.r4.core.Code\022,\n\004text\030\005 \001(\0132\036.googl"
          + "e.fhir.r4.core.Narrative\022\'\n\tcontained\030\006 "
          + "\003(\0132\024.google.protobuf.Any\0221\n\textension\030\010"
          + " \003(\0132\036.google.fhir.r4.core.Extension\022:\n\022"
          + "modifier_extension\030\t \003(\0132\036.google.fhir.r"
          + "4.core.Extension\0223\n\nidentifier\030\n \003(\0132\037.g"
          + "oogle.fhir.r4.core.Identifier\022>\n\026instant"
          + "iates_canonical\030\013 \003(\0132\036.google.fhir.r4.c"
          + "ore.Canonical\0222\n\020instantiates_uri\030\014 \003(\0132"
          + "\030.google.fhir.r4.core.Uri\022k\n\010based_on\030\r "
          + "\003(\0132\036.google.fhir.r4.core.ReferenceB9\362\377\374"
          + "\302\006\010CarePlan\362\377\374\302\006\016ServiceRequest\362\377\374\302\006\021Med"
          + "icationRequest\022F\n\010replaces\030\016 \003(\0132\036.googl"
          + "e.fhir.r4.core.ReferenceB\024\362\377\374\302\006\016ServiceR"
          + "equest\0224\n\013requisition\030\017 \001(\0132\037.google.fhi"
          + "r.r4.core.Identifier\022N\n\006status\030\020 \001(\01326.g"
          + "oogle.fhir.r4.core.ServiceRequestGenetic"
          + "s.StatusCodeB\006\360\320\207\353\004\001\022N\n\006intent\030\021 \001(\01326.g"
          + "oogle.fhir.r4.core.ServiceRequestGenetic"
          + "s.IntentCodeB\006\360\320\207\353\004\001\0226\n\010category\030\022 \003(\0132$"
          + ".google.fhir.r4.core.CodeableConcept\022J\n\010"
          + "priority\030\023 \001(\01328.google.fhir.r4.core.Ser"
          + "viceRequestGenetics.PriorityCode\0224\n\016do_n"
          + "ot_perform\030\024 \001(\0132\034.google.fhir.r4.core.B"
          + "oolean\0222\n\004code\030\025 \001(\0132$.google.fhir.r4.co"
          + "re.CodeableConcept\022:\n\014order_detail\030\026 \003(\013"
          + "2$.google.fhir.r4.core.CodeableConcept\022G"
          + "\n\010quantity\030\027 \001(\01325.google.fhir.r4.core.S"
          + "erviceRequestGenetics.QuantityX\022i\n\007subje"
          + "ct\030\030 \001(\0132\036.google.fhir.r4.core.Reference"
          + "B8\360\320\207\353\004\001\362\377\374\302\006\007Patient\362\377\374\302\006\005Group\362\377\374\302\006\010Lo"
          + "cation\362\377\374\302\006\006Device\022B\n\tencounter\030\031 \001(\0132\036."
          + "google.fhir.r4.core.ReferenceB\017\362\377\374\302\006\tEnc"
          + "ounter\022K\n\noccurrence\030\032 \001(\01327.google.fhir"
          + ".r4.core.ServiceRequestGenetics.Occurren"
          + "ceX\022H\n\tas_needed\030\033 \001(\01325.google.fhir.r4."
          + "core.ServiceRequestGenetics.AsNeededX\0222\n"
          + "\013authored_on\030\034 \001(\0132\035.google.fhir.r4.core"
          + ".DateTime\022\231\001\n\trequester\030\035 \001(\0132\036.google.f"
          + "hir.r4.core.ReferenceBf\362\377\374\302\006\014Practitione"
          + "r\362\377\374\302\006\020PractitionerRole\362\377\374\302\006\014Organizatio"
          + "n\362\377\374\302\006\007Patient\362\377\374\302\006\rRelatedPerson\362\377\374\302\006\006D"
          + "evice\022<\n\016performer_type\030\036 \001(\0132$.google.f"
          + "hir.r4.core.CodeableConcept\022\277\001\n\tperforme"
          + "r\030\037 \003(\0132\036.google.fhir.r4.core.ReferenceB"
          + "\213\001\362\377\374\302\006\014Practitioner\362\377\374\302\006\020PractitionerRo"
          + "le\362\377\374\302\006\014Organization\362\377\374\302\006\010CareTeam\362\377\374\302\006\021"
          + "HealthcareService\362\377\374\302\006\007Patient\362\377\374\302\006\006Devi"
          + "ce\362\377\374\302\006\rRelatedPerson\022;\n\rlocation_code\030 "
          + " \003(\0132$.google.fhir.r4.core.CodeableConce"
          + "pt\022J\n\022location_reference\030! \003(\0132\036.google."
          + "fhir.r4.core.ReferenceB\016\362\377\374\302\006\010Location\0229"
          + "\n\013reason_code\030\" \003(\0132$.google.fhir.r4.cor"
          + "e.CodeableConcept\022\207\001\n\020reason_reference\030#"
          + " \003(\0132\036.google.fhir.r4.core.ReferenceBM\362\377"
          + "\374\302\006\tCondition\362\377\374\302\006\013Observation\362\377\374\302\006\020Diag"
          + "nosticReport\362\377\374\302\006\021DocumentReference\022T\n\ti"
          + "nsurance\030$ \003(\0132\036.google.fhir.r4.core.Ref"
          + "erenceB!\362\377\374\302\006\010Coverage\362\377\374\302\006\rClaimRespons"
          + "e\022G\n\017supporting_info\030% \003(\0132\036.google.fhir"
          + ".r4.core.ReferenceB\016\362\377\374\302\006\010Resource\022@\n\010sp"
          + "ecimen\030& \003(\0132\036.google.fhir.r4.core.Refer"
          + "enceB\016\362\377\374\302\006\010Specimen\0227\n\tbody_site\030\' \003(\0132"
          + "$.google.fhir.r4.core.CodeableConcept\022-\n"
          + "\004note\030( \003(\0132\037.google.fhir.r4.core.Annota"
          + "tion\0228\n\023patient_instruction\030) \001(\0132\033.goog"
          + "le.fhir.r4.core.String\022J\n\020relevant_histo"
          + "ry\030* \003(\0132\036.google.fhir.r4.core.Reference"
          + "B\020\362\377\374\302\006\nProvenance\022\210\001\n\004item\030+ \003(\0132).goog"
          + "le.fhir.r4.core.DiagnosticReportItemBI\252\374"
          + "\217\223\006Chttp://hl7.org/fhir/StructureDefinit"
          + "ion/servicerequest-geneticsItemR\004Item\032\220\002"
          + "\n\nStatusCode\022;\n\005value\030\001 \001(\0162,.google.fhi"
          + "r.r4.core.RequestStatusCode.Value\022\'\n\002id\030"
          + "\002 \001(\0132\033.google.fhir.r4.core.String\0221\n\tex"
          + "tension\030\003 \003(\0132\036.google.fhir.r4.core.Exte"
          + "nsion:i\300\237\343\266\005\001\212\371\203\262\005+http://hl7.org/fhir/V"
          + "alueSet/request-status\232\265\216\223\006,http://hl7.o"
          + "rg/fhir/StructureDefinition/code\032\220\002\n\nInt"
          + "entCode\022;\n\005value\030\001 \001(\0162,.google.fhir.r4."
          + "core.RequestIntentCode.Value\022\'\n\002id\030\002 \001(\013"
          + "2\033.google.fhir.r4.core.String\0221\n\textensi"
          + "on\030\003 \003(\0132\036.google.fhir.r4.core.Extension"
          + ":i\300\237\343\266\005\001\212\371\203\262\005+http://hl7.org/fhir/ValueS"
          + "et/request-intent\232\265\216\223\006,http://hl7.org/fh"
          + "ir/StructureDefinition/code\032\226\002\n\014Priority"
          + "Code\022=\n\005value\030\001 \001(\0162..google.fhir.r4.cor"
          + "e.RequestPriorityCode.Value\022\'\n\002id\030\002 \001(\0132"
          + "\033.google.fhir.r4.core.String\0221\n\textensio"
          + "n\030\003 \003(\0132\036.google.fhir.r4.core.Extension:"
          + "k\300\237\343\266\005\001\212\371\203\262\005-http://hl7.org/fhir/ValueSe"
          + "t/request-priority\232\265\216\223\006,http://hl7.org/f"
          + "hir/StructureDefinition/code\032\252\001\n\tQuantit"
          + "yX\0221\n\010quantity\030\001 \001(\0132\035.google.fhir.r4.co"
          + "re.QuantityH\000\022+\n\005ratio\030\002 \001(\0132\032.google.fh"
          + "ir.r4.core.RatioH\000\022+\n\005range\030\003 \001(\0132\032.goog"
          + "le.fhir.r4.core.RangeH\000:\006\240\203\203\350\006\001B\010\n\006choic"
          + "e\032\261\001\n\013OccurrenceX\0222\n\tdate_time\030\001 \001(\0132\035.g"
          + "oogle.fhir.r4.core.DateTimeH\000\022-\n\006period\030"
          + "\002 \001(\0132\033.google.fhir.r4.core.PeriodH\000\022-\n\006"
          + "timing\030\003 \001(\0132\033.google.fhir.r4.core.Timin"
          + "gH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\220\001\n\tAsNeededX\022/\n\007b"
          + "oolean\030\001 \001(\0132\034.google.fhir.r4.core.Boole"
          + "anH\000\022@\n\020codeable_concept\030\002 \001(\0132$.google."
          + "fhir.r4.core.CodeableConceptH\000:\006\240\203\203\350\006\001B\010"
          + "\n\006choice:\261\001\300\237\343\266\005\003\232\265\216\223\0066http://hl7.org/fh"
          + "ir/StructureDefinition/ServiceRequest\262\376\344"
          + "\227\006?http://hl7.org/fhir/StructureDefiniti"
          + "on/servicerequest-genetics\232\206\223\240\010$orderDet"
          + "ail.empty() or code.exists()J\004\010\007\020\010B!\n\027co"
          + "m.google.fhir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.fhir.proto.Annotations.getDescriptor(),
              com.google.fhir.r4.core.Codes.getDescriptor(),
              com.google.fhir.r4.core.Datatypes.getDescriptor(),
              com.google.fhir.r4.core.Extensions.getDescriptor(),
            });
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor,
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
              "InstantiatesCanonical",
              "InstantiatesUri",
              "BasedOn",
              "Replaces",
              "Requisition",
              "Status",
              "Intent",
              "Category",
              "Priority",
              "DoNotPerform",
              "Code",
              "OrderDetail",
              "Quantity",
              "Subject",
              "Encounter",
              "Occurrence",
              "AsNeeded",
              "AuthoredOn",
              "Requester",
              "PerformerType",
              "Performer",
              "LocationCode",
              "LocationReference",
              "ReasonCode",
              "ReasonReference",
              "Insurance",
              "SupportingInfo",
              "Specimen",
              "BodySite",
              "Note",
              "PatientInstruction",
              "RelevantHistory",
              "Item",
            });
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_StatusCode_descriptor =
        internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_StatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ServiceRequestGenetics_StatusCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_IntentCode_descriptor =
        internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_IntentCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ServiceRequestGenetics_IntentCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_PriorityCode_descriptor =
        internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_PriorityCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ServiceRequestGenetics_PriorityCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_QuantityX_descriptor =
        internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_QuantityX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ServiceRequestGenetics_QuantityX_descriptor,
            new java.lang.String[] {
              "Quantity", "Ratio", "Range", "Choice",
            });
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_OccurrenceX_descriptor =
        internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_OccurrenceX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ServiceRequestGenetics_OccurrenceX_descriptor,
            new java.lang.String[] {
              "DateTime", "Period", "Timing", "Choice",
            });
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_AsNeededX_descriptor =
        internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_AsNeededX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_ServiceRequestGenetics_AsNeededX_descriptor,
            new java.lang.String[] {
              "Boolean", "CodeableConcept", "Choice",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirInlinedExtensionUrl);
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
    com.google.fhir.r4.core.Extensions.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
