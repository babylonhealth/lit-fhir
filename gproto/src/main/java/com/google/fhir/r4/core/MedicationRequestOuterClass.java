// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/medication_request.proto

package com.google.fhir.r4.core;

public final class MedicationRequestOuterClass {
  private MedicationRequestOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicationRequest_StatusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicationRequest_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicationRequest_IntentCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicationRequest_IntentCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicationRequest_PriorityCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicationRequest_PriorityCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicationRequest_ReportedX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicationRequest_ReportedX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicationRequest_MedicationX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicationRequest_MedicationX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicationRequest_DispenseRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicationRequest_DispenseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicationRequest_DispenseRequest_InitialFill_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicationRequest_DispenseRequest_InitialFill_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicationRequest_Substitution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicationRequest_Substitution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_fhir_r4_core_MedicationRequest_Substitution_AllowedX_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicationRequest_Substitution_AllowedX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0proto/r4/core/resources/medication_req"
          + "uest.proto\022\023google.fhir.r4.core\032\031google/"
          + "protobuf/any.proto\032\027proto/annotations.pr"
          + "oto\032\031proto/r4/core/codes.proto\032\035proto/r4"
          + "/core/datatypes.proto\"\304+\n\021MedicationRequ"
          + "est\022#\n\002id\030\001 \001(\0132\027.google.fhir.r4.core.Id"
          + "\022\'\n\004meta\030\002 \001(\0132\031.google.fhir.r4.core.Met"
          + "a\0220\n\016implicit_rules\030\003 \001(\0132\030.google.fhir."
          + "r4.core.Uri\022+\n\010language\030\004 \001(\0132\031.google.f"
          + "hir.r4.core.Code\022,\n\004text\030\005 \001(\0132\036.google."
          + "fhir.r4.core.Narrative\022\'\n\tcontained\030\006 \003("
          + "\0132\024.google.protobuf.Any\0221\n\textension\030\010 \003"
          + "(\0132\036.google.fhir.r4.core.Extension\022:\n\022mo"
          + "difier_extension\030\t \003(\0132\036.google.fhir.r4."
          + "core.Extension\0223\n\nidentifier\030\n \003(\0132\037.goo"
          + "gle.fhir.r4.core.Identifier\022I\n\006status\030\013 "
          + "\001(\01321.google.fhir.r4.core.MedicationRequ"
          + "est.StatusCodeB\006\360\320\207\353\004\001\022;\n\rstatus_reason\030"
          + "\014 \001(\0132$.google.fhir.r4.core.CodeableConc"
          + "ept\022I\n\006intent\030\r \001(\01321.google.fhir.r4.cor"
          + "e.MedicationRequest.IntentCodeB\006\360\320\207\353\004\001\0226"
          + "\n\010category\030\016 \003(\0132$.google.fhir.r4.core.C"
          + "odeableConcept\022E\n\010priority\030\017 \001(\01323.googl"
          + "e.fhir.r4.core.MedicationRequest.Priorit"
          + "yCode\0224\n\016do_not_perform\030\020 \001(\0132\034.google.f"
          + "hir.r4.core.Boolean\022B\n\010reported\030\021 \001(\01320."
          + "google.fhir.r4.core.MedicationRequest.Re"
          + "portedX\022N\n\nmedication\030\022 \001(\01322.google.fhi"
          + "r.r4.core.MedicationRequest.MedicationXB"
          + "\006\360\320\207\353\004\001\022O\n\007subject\030\023 \001(\0132\036.google.fhir.r"
          + "4.core.ReferenceB\036\360\320\207\353\004\001\362\377\374\302\006\007Patient\362\377\374"
          + "\302\006\005Group\022B\n\tencounter\030\024 \001(\0132\036.google.fhi"
          + "r.r4.core.ReferenceB\017\362\377\374\302\006\tEncounter\022N\n\026"
          + "supporting_information\030\025 \003(\0132\036.google.fh"
          + "ir.r4.core.ReferenceB\016\362\377\374\302\006\010Resource\0222\n\013"
          + "authored_on\030\026 \001(\0132\035.google.fhir.r4.core."
          + "DateTime\022\231\001\n\trequester\030\027 \001(\0132\036.google.fh"
          + "ir.r4.core.ReferenceBf\362\377\374\302\006\014Practitioner"
          + "\362\377\374\302\006\020PractitionerRole\362\377\374\302\006\014Organization"
          + "\362\377\374\302\006\007Patient\362\377\374\302\006\rRelatedPerson\362\377\374\302\006\006De"
          + "vice\022\247\001\n\tperformer\030\030 \001(\0132\036.google.fhir.r"
          + "4.core.ReferenceBt\362\377\374\302\006\014Practitioner\362\377\374\302"
          + "\006\020PractitionerRole\362\377\374\302\006\014Organization\362\377\374\302"
          + "\006\007Patient\362\377\374\302\006\006Device\362\377\374\302\006\rRelatedPerson"
          + "\362\377\374\302\006\010CareTeam\022<\n\016performer_type\030\031 \001(\0132$"
          + ".google.fhir.r4.core.CodeableConcept\022Z\n\010"
          + "recorder\030\032 \001(\0132\036.google.fhir.r4.core.Ref"
          + "erenceB(\362\377\374\302\006\014Practitioner\362\377\374\302\006\020Practiti"
          + "onerRole\0229\n\013reason_code\030\033 \003(\0132$.google.f"
          + "hir.r4.core.CodeableConcept\022Z\n\020reason_re"
          + "ference\030\034 \003(\0132\036.google.fhir.r4.core.Refe"
          + "renceB \362\377\374\302\006\tCondition\362\377\374\302\006\013Observation\022"
          + ">\n\026instantiates_canonical\030\035 \003(\0132\036.google"
          + ".fhir.r4.core.Canonical\0222\n\020instantiates_"
          + "uri\030\036 \003(\0132\030.google.fhir.r4.core.Uri\022\213\001\n\010"
          + "based_on\030\037 \003(\0132\036.google.fhir.r4.core.Ref"
          + "erenceBY\362\377\374\302\006\010CarePlan\362\377\374\302\006\021MedicationRe"
          + "quest\362\377\374\302\006\016ServiceRequest\362\377\374\302\006\032Immunizat"
          + "ionRecommendation\0229\n\020group_identifier\030  "
          + "\001(\0132\037.google.fhir.r4.core.Identifier\022D\n\026"
          + "course_of_therapy_type\030! \001(\0132$.google.fh"
          + "ir.r4.core.CodeableConcept\022T\n\tinsurance\030"
          + "\" \003(\0132\036.google.fhir.r4.core.ReferenceB!\362"
          + "\377\374\302\006\010Coverage\362\377\374\302\006\rClaimResponse\022-\n\004note"
          + "\030# \003(\0132\037.google.fhir.r4.core.Annotation\022"
          + "7\n\022dosage_instruction\030$ \003(\0132\033.google.fhi"
          + "r.r4.core.Dosage\022P\n\020dispense_request\030% \001"
          + "(\01326.google.fhir.r4.core.MedicationReque"
          + "st.DispenseRequest\022I\n\014substitution\030& \001(\013"
          + "23.google.fhir.r4.core.MedicationRequest"
          + ".Substitution\022S\n\022prior_prescription\030\' \001("
          + "\0132\036.google.fhir.r4.core.ReferenceB\027\362\377\374\302\006"
          + "\021MedicationRequest\022K\n\016detected_issue\030( \003"
          + "(\0132\036.google.fhir.r4.core.ReferenceB\023\362\377\374\302"
          + "\006\rDetectedIssue\022G\n\revent_history\030) \003(\0132\036"
          + ".google.fhir.r4.core.ReferenceB\020\362\377\374\302\006\nPr"
          + "ovenance\032\244\002\n\nStatusCode\022E\n\005value\030\001 \001(\01626"
          + ".google.fhir.r4.core.MedicationrequestSt"
          + "atusCode.Value\022\'\n\002id\030\002 \001(\0132\033.google.fhir"
          + ".r4.core.String\0221\n\textension\030\003 \003(\0132\036.goo"
          + "gle.fhir.r4.core.Extension:s\300\237\343\266\005\001\212\371\203\262\0055"
          + "http://hl7.org/fhir/ValueSet/medicationr"
          + "equest-status\232\265\216\223\006,http://hl7.org/fhir/S"
          + "tructureDefinition/code\032\244\002\n\nIntentCode\022E"
          + "\n\005value\030\001 \001(\01626.google.fhir.r4.core.Medi"
          + "cationRequestIntentCode.Value\022\'\n\002id\030\002 \001("
          + "\0132\033.google.fhir.r4.core.String\0221\n\textens"
          + "ion\030\003 \003(\0132\036.google.fhir.r4.core.Extensio"
          + "n:s\300\237\343\266\005\001\212\371\203\262\0055http://hl7.org/fhir/Value"
          + "Set/medicationrequest-intent\232\265\216\223\006,http:/"
          + "/hl7.org/fhir/StructureDefinition/code\032\226"
          + "\002\n\014PriorityCode\022=\n\005value\030\001 \001(\0162..google."
          + "fhir.r4.core.RequestPriorityCode.Value\022\'"
          + "\n\002id\030\002 \001(\0132\033.google.fhir.r4.core.String\022"
          + "1\n\textension\030\003 \003(\0132\036.google.fhir.r4.core"
          + ".Extension:k\300\237\343\266\005\001\212\371\203\262\005-http://hl7.org/f"
          + "hir/ValueSet/request-priority\232\265\216\223\006,http:"
          + "//hl7.org/fhir/StructureDefinition/code\032"
          + "\340\001\n\tReportedX\022/\n\007boolean\030\001 \001(\0132\034.google."
          + "fhir.r4.core.BooleanH\000\022\217\001\n\treference\030\002 \001"
          + "(\0132\036.google.fhir.r4.core.ReferenceBZ\362\377\374\302"
          + "\006\007Patient\362\377\374\302\006\014Practitioner\362\377\374\302\006\020Practit"
          + "ionerRole\362\377\374\302\006\rRelatedPerson\362\377\374\302\006\014Organi"
          + "zationH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\250\001\n\013Medicatio"
          + "nX\022@\n\020codeable_concept\030\001 \001(\0132$.google.fh"
          + "ir.r4.core.CodeableConceptH\000\022E\n\treferenc"
          + "e\030\002 \001(\0132\036.google.fhir.r4.core.ReferenceB"
          + "\020\362\377\374\302\006\nMedicationH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\207\007"
          + "\n\017DispenseRequest\022\'\n\002id\030\001 \001(\0132\033.google.f"
          + "hir.r4.core.String\0221\n\textension\030\002 \003(\0132\036."
          + "google.fhir.r4.core.Extension\022:\n\022modifie"
          + "r_extension\030\003 \003(\0132\036.google.fhir.r4.core."
          + "Extension\022X\n\014initial_fill\030\004 \001(\0132B.google"
          + ".fhir.r4.core.MedicationRequest.Dispense"
          + "Request.InitialFill\0228\n\021dispense_interval"
          + "\030\005 \001(\0132\035.google.fhir.r4.core.Duration\0224\n"
          + "\017validity_period\030\006 \001(\0132\033.google.fhir.r4."
          + "core.Period\022C\n\031number_of_repeats_allowed"
          + "\030\007 \001(\0132 .google.fhir.r4.core.UnsignedInt"
          + "\0225\n\010quantity\030\010 \001(\0132#.google.fhir.r4.core"
          + ".SimpleQuantity\022?\n\030expected_supply_durat"
          + "ion\030\t \001(\0132\035.google.fhir.r4.core.Duration"
          + "\022E\n\tperformer\030\n \001(\0132\036.google.fhir.r4.cor"
          + "e.ReferenceB\022\362\377\374\302\006\014Organization\032\215\002\n\013Init"
          + "ialFill\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.cor"
          + "e.String\0221\n\textension\030\002 \003(\0132\036.google.fhi"
          + "r.r4.core.Extension\022:\n\022modifier_extensio"
          + "n\030\003 \003(\0132\036.google.fhir.r4.core.Extension\022"
          + "5\n\010quantity\030\004 \001(\0132#.google.fhir.r4.core."
          + "SimpleQuantity\022/\n\010duration\030\005 \001(\0132\035.googl"
          + "e.fhir.r4.core.Duration\032\305\003\n\014Substitution"
          + "\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.core.Strin"
          + "g\0221\n\textension\030\002 \003(\0132\036.google.fhir.r4.co"
          + "re.Extension\022:\n\022modifier_extension\030\003 \003(\013"
          + "2\036.google.fhir.r4.core.Extension\022U\n\007allo"
          + "wed\030\004 \001(\0132<.google.fhir.r4.core.Medicati"
          + "onRequest.Substitution.AllowedXB\006\360\320\207\353\004\001\022"
          + "4\n\006reason\030\005 \001(\0132$.google.fhir.r4.core.Co"
          + "deableConcept\032\217\001\n\010AllowedX\022/\n\007boolean\030\001 "
          + "\001(\0132\034.google.fhir.r4.core.BooleanH\000\022@\n\020c"
          + "odeable_concept\030\002 \001(\0132$.google.fhir.r4.c"
          + "ore.CodeableConceptH\000:\006\240\203\203\350\006\001B\010\n\006choice:"
          + "E\300\237\343\266\005\003\262\376\344\227\0069http://hl7.org/fhir/Structu"
          + "reDefinition/MedicationRequestJ\004\010\007\020\010B!\n\027"
          + "com.google.fhir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
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
    internal_static_google_fhir_r4_core_MedicationRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_MedicationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicationRequest_descriptor,
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
              "Status",
              "StatusReason",
              "Intent",
              "Category",
              "Priority",
              "DoNotPerform",
              "Reported",
              "Medication",
              "Subject",
              "Encounter",
              "SupportingInformation",
              "AuthoredOn",
              "Requester",
              "Performer",
              "PerformerType",
              "Recorder",
              "ReasonCode",
              "ReasonReference",
              "InstantiatesCanonical",
              "InstantiatesUri",
              "BasedOn",
              "GroupIdentifier",
              "CourseOfTherapyType",
              "Insurance",
              "Note",
              "DosageInstruction",
              "DispenseRequest",
              "Substitution",
              "PriorPrescription",
              "DetectedIssue",
              "EventHistory",
            });
    internal_static_google_fhir_r4_core_MedicationRequest_StatusCode_descriptor =
        internal_static_google_fhir_r4_core_MedicationRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_MedicationRequest_StatusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicationRequest_StatusCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_MedicationRequest_IntentCode_descriptor =
        internal_static_google_fhir_r4_core_MedicationRequest_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_MedicationRequest_IntentCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicationRequest_IntentCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_MedicationRequest_PriorityCode_descriptor =
        internal_static_google_fhir_r4_core_MedicationRequest_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_MedicationRequest_PriorityCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicationRequest_PriorityCode_descriptor,
            new java.lang.String[] {
              "Value", "Id", "Extension",
            });
    internal_static_google_fhir_r4_core_MedicationRequest_ReportedX_descriptor =
        internal_static_google_fhir_r4_core_MedicationRequest_descriptor.getNestedTypes().get(3);
    internal_static_google_fhir_r4_core_MedicationRequest_ReportedX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicationRequest_ReportedX_descriptor,
            new java.lang.String[] {
              "Boolean", "Reference", "Choice",
            });
    internal_static_google_fhir_r4_core_MedicationRequest_MedicationX_descriptor =
        internal_static_google_fhir_r4_core_MedicationRequest_descriptor.getNestedTypes().get(4);
    internal_static_google_fhir_r4_core_MedicationRequest_MedicationX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicationRequest_MedicationX_descriptor,
            new java.lang.String[] {
              "CodeableConcept", "Reference", "Choice",
            });
    internal_static_google_fhir_r4_core_MedicationRequest_DispenseRequest_descriptor =
        internal_static_google_fhir_r4_core_MedicationRequest_descriptor.getNestedTypes().get(5);
    internal_static_google_fhir_r4_core_MedicationRequest_DispenseRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicationRequest_DispenseRequest_descriptor,
            new java.lang.String[] {
              "Id",
              "Extension",
              "ModifierExtension",
              "InitialFill",
              "DispenseInterval",
              "ValidityPeriod",
              "NumberOfRepeatsAllowed",
              "Quantity",
              "ExpectedSupplyDuration",
              "Performer",
            });
    internal_static_google_fhir_r4_core_MedicationRequest_DispenseRequest_InitialFill_descriptor =
        internal_static_google_fhir_r4_core_MedicationRequest_DispenseRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_MedicationRequest_DispenseRequest_InitialFill_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicationRequest_DispenseRequest_InitialFill_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Quantity", "Duration",
            });
    internal_static_google_fhir_r4_core_MedicationRequest_Substitution_descriptor =
        internal_static_google_fhir_r4_core_MedicationRequest_descriptor.getNestedTypes().get(6);
    internal_static_google_fhir_r4_core_MedicationRequest_Substitution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicationRequest_Substitution_descriptor,
            new java.lang.String[] {
              "Id", "Extension", "ModifierExtension", "Allowed", "Reason",
            });
    internal_static_google_fhir_r4_core_MedicationRequest_Substitution_AllowedX_descriptor =
        internal_static_google_fhir_r4_core_MedicationRequest_Substitution_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_fhir_r4_core_MedicationRequest_Substitution_AllowedX_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_fhir_r4_core_MedicationRequest_Substitution_AllowedX_descriptor,
            new java.lang.String[] {
              "Boolean", "CodeableConcept", "Choice",
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