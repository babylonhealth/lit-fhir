// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/medication_dispense.proto

package com.google.fhir.r4.core;

public final class MedicationDispenseOuterClass {
  private MedicationDispenseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_MedicationDispense_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicationDispense_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_MedicationDispense_StatusCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicationDispense_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_MedicationDispense_StatusReasonX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicationDispense_StatusReasonX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_MedicationDispense_MedicationX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicationDispense_MedicationX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_MedicationDispense_Performer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicationDispense_Performer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_MedicationDispense_Substitution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicationDispense_Substitution_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCproto/google/fhir/proto/r4/core/resour" +
      "ces/medication_dispense.proto\022\023google.fh" +
      "ir.r4.core\032\031google/protobuf/any.proto\032)p" +
      "roto/google/fhir/proto/annotations.proto" +
      "\032+proto/google/fhir/proto/r4/core/codes." +
      "proto\032/proto/google/fhir/proto/r4/core/d" +
      "atatypes.proto\"\3049\n\022MedicationDispense\022#\n" +
      "\002id\030\001 \001(\0132\027.google.fhir.r4.core.Id\022\'\n\004me" +
      "ta\030\002 \001(\0132\031.google.fhir.r4.core.Meta\0220\n\016i" +
      "mplicit_rules\030\003 \001(\0132\030.google.fhir.r4.cor" +
      "e.Uri\022+\n\010language\030\004 \001(\0132\031.google.fhir.r4" +
      ".core.Code\022,\n\004text\030\005 \001(\0132\036.google.fhir.r" +
      "4.core.Narrative\022\'\n\tcontained\030\006 \003(\0132\024.go" +
      "ogle.protobuf.Any\0221\n\textension\030\010 \003(\0132\036.g" +
      "oogle.fhir.r4.core.Extension\022:\n\022modifier" +
      "_extension\030\t \003(\0132\036.google.fhir.r4.core.E" +
      "xtension\0223\n\nidentifier\030\n \003(\0132\037.google.fh" +
      "ir.r4.core.Identifier\022@\n\007part_of\030\013 \003(\0132\036" +
      ".google.fhir.r4.core.ReferenceB\017\362\377\374\302\006\tPr" +
      "ocedure\022J\n\006status\030\014 \001(\01322.google.fhir.r4" +
      ".core.MedicationDispense.StatusCodeB\006\360\320\207" +
      "\353\004\001\022L\n\rstatus_reason\030\r \001(\01325.google.fhir" +
      ".r4.core.MedicationDispense.StatusReason" +
      "X\0226\n\010category\030\016 \001(\0132$.google.fhir.r4.cor" +
      "e.CodeableConcept\022O\n\nmedication\030\017 \001(\01323." +
      "google.fhir.r4.core.MedicationDispense.M" +
      "edicationXB\006\360\320\207\353\004\001\022I\n\007subject\030\020 \001(\0132\036.go" +
      "ogle.fhir.r4.core.ReferenceB\030\362\377\374\302\006\007Patie" +
      "nt\362\377\374\302\006\005Group\022S\n\007context\030\021 \001(\0132\036.google." +
      "fhir.r4.core.ReferenceB\"\362\377\374\302\006\tEncounter\362" +
      "\377\374\302\006\rEpisodeOfCare\022N\n\026supporting_informa" +
      "tion\030\022 \003(\0132\036.google.fhir.r4.core.Referen" +
      "ceB\016\362\377\374\302\006\010Resource\022D\n\tperformer\030\023 \003(\01321." +
      "google.fhir.r4.core.MedicationDispense.P" +
      "erformer\022@\n\010location\030\024 \001(\0132\036.google.fhir" +
      ".r4.core.ReferenceB\016\362\377\374\302\006\010Location\022Y\n\030au" +
      "thorizing_prescription\030\025 \003(\0132\036.google.fh" +
      "ir.r4.core.ReferenceB\027\362\377\374\302\006\021MedicationRe" +
      "quest\0222\n\004type\030\026 \001(\0132$.google.fhir.r4.cor" +
      "e.CodeableConcept\0225\n\010quantity\030\027 \001(\0132#.go" +
      "ogle.fhir.r4.core.SimpleQuantity\0228\n\013days" +
      "_supply\030\030 \001(\0132#.google.fhir.r4.core.Simp" +
      "leQuantity\0224\n\rwhen_prepared\030\031 \001(\0132\035.goog" +
      "le.fhir.r4.core.DateTime\0227\n\020when_handed_" +
      "over\030\032 \001(\0132\035.google.fhir.r4.core.DateTim" +
      "e\022C\n\013destination\030\033 \001(\0132\036.google.fhir.r4." +
      "core.ReferenceB\016\362\377\374\302\006\010Location\022Q\n\010receiv" +
      "er\030\034 \003(\0132\036.google.fhir.r4.core.Reference" +
      "B\037\362\377\374\302\006\007Patient\362\377\374\302\006\014Practitioner\022-\n\004not" +
      "e\030\035 \003(\0132\037.google.fhir.r4.core.Annotation" +
      "\0227\n\022dosage_instruction\030\036 \003(\0132\033.google.fh" +
      "ir.r4.core.Dosage\022J\n\014substitution\030\037 \001(\0132" +
      "4.google.fhir.r4.core.MedicationDispense" +
      ".Substitution\022K\n\016detected_issue\030  \003(\0132\036." +
      "google.fhir.r4.core.ReferenceB\023\362\377\374\302\006\rDet" +
      "ectedIssue\022G\n\revent_history\030! \003(\0132\036.goog" +
      "le.fhir.r4.core.ReferenceB\020\362\377\374\302\006\nProvena" +
      "nce\032\246\002\n\nStatusCode\022F\n\005value\030\001 \001(\01627.goog" +
      "le.fhir.r4.core.MedicationDispenseStatus" +
      "Code.Value\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4." +
      "core.String\0221\n\textension\030\003 \003(\0132\036.google." +
      "fhir.r4.core.Extension:t\300\237\343\266\005\001\212\371\203\262\0056http" +
      "://hl7.org/fhir/ValueSet/medicationdispe" +
      "nse-status\232\265\216\223\006,http://hl7.org/fhir/Stru" +
      "ctureDefinition/code\032\255\001\n\rStatusReasonX\022@" +
      "\n\020codeable_concept\030\001 \001(\0132$.google.fhir.r" +
      "4.core.CodeableConceptH\000\022H\n\treference\030\002 " +
      "\001(\0132\036.google.fhir.r4.core.ReferenceB\023\362\377\374" +
      "\302\006\rDetectedIssueH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\250\001\n" +
      "\013MedicationX\022@\n\020codeable_concept\030\001 \001(\0132$" +
      ".google.fhir.r4.core.CodeableConceptH\000\022E" +
      "\n\treference\030\002 \001(\0132\036.google.fhir.r4.core." +
      "ReferenceB\020\362\377\374\302\006\nMedicationH\000:\006\240\203\203\350\006\001B\010\n" +
      "\006choice\032\371\002\n\tPerformer\022\'\n\002id\030\001 \001(\0132\033.goog" +
      "le.fhir.r4.core.String\0221\n\textension\030\002 \003(" +
      "\0132\036.google.fhir.r4.core.Extension\022:\n\022mod" +
      "ifier_extension\030\003 \003(\0132\036.google.fhir.r4.c" +
      "ore.Extension\0226\n\010function\030\004 \001(\0132$.google" +
      ".fhir.r4.core.CodeableConcept\022\233\001\n\005actor\030" +
      "\005 \001(\0132\036.google.fhir.r4.core.ReferenceBl\360" +
      "\320\207\353\004\001\362\377\374\302\006\014Practitioner\362\377\374\302\006\020Practitione" +
      "rRole\362\377\374\302\006\014Organization\362\377\374\302\006\007Patient\362\377\374\302" +
      "\006\006Device\362\377\374\302\006\rRelatedPerson\032\264\003\n\014Substitu" +
      "tion\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.core.S" +
      "tring\0221\n\textension\030\002 \003(\0132\036.google.fhir.r" +
      "4.core.Extension\022:\n\022modifier_extension\030\003" +
      " \003(\0132\036.google.fhir.r4.core.Extension\022=\n\017" +
      "was_substituted\030\004 \001(\0132\034.google.fhir.r4.c" +
      "ore.BooleanB\006\360\320\207\353\004\001\0222\n\004type\030\005 \001(\0132$.goog" +
      "le.fhir.r4.core.CodeableConcept\0224\n\006reaso" +
      "n\030\006 \003(\0132$.google.fhir.r4.core.CodeableCo" +
      "ncept\022c\n\021responsible_party\030\007 \003(\0132\036.googl" +
      "e.fhir.r4.core.ReferenceB(\362\377\374\302\006\014Practiti" +
      "oner\362\377\374\302\006\020PractitionerRole:\232\036\300\237\343\266\005\003\262\376\344\227\006" +
      ":http://hl7.org/fhir/StructureDefinition" +
      "/MedicationDispense\232\206\223\240\010PwhenHandedOver." +
      "empty() or whenPrepared.empty() or whenH" +
      "andedOver >= whenPrepared\262\365\365\327\t\364\003\n\004code\020\004" +
      "\032\351\003AllergyIntolerance.code | AllergyInto" +
      "lerance.reaction.substance | Condition.c" +
      "ode | (DeviceRequest.code as CodeableCon" +
      "cept) | DiagnosticReport.code | FamilyMe" +
      "mberHistory.condition.code | List.code |" +
      " Medication.code | (MedicationAdministra" +
      "tion.medication as CodeableConcept) | (M" +
      "edicationDispense.medication as Codeable" +
      "Concept) | (MedicationRequest.medication" +
      " as CodeableConcept) | (MedicationStatem" +
      "ent.medication as CodeableConcept) | Obs" +
      "ervation.code | Procedure.code | Service" +
      "Request.code\262\365\365\327\t\'\n\007context\020\005\032\032Medicatio" +
      "nDispense.context\262\365\365\327\t/\n\013destination\020\005\032\036" +
      "MedicationDispense.destination\262\365\365\327\t\205\007\n\ni" +
      "dentifier\020\004\032\364\006AllergyIntolerance.identif" +
      "ier | CarePlan.identifier | CareTeam.ide" +
      "ntifier | Composition.identifier | Condi" +
      "tion.identifier | Consent.identifier | D" +
      "etectedIssue.identifier | DeviceRequest." +
      "identifier | DiagnosticReport.identifier" +
      " | DocumentManifest.masterIdentifier | D" +
      "ocumentManifest.identifier | DocumentRef" +
      "erence.masterIdentifier | DocumentRefere" +
      "nce.identifier | Encounter.identifier | " +
      "EpisodeOfCare.identifier | FamilyMemberH" +
      "istory.identifier | Goal.identifier | Im" +
      "agingStudy.identifier | Immunization.ide" +
      "ntifier | List.identifier | MedicationAd" +
      "ministration.identifier | MedicationDisp" +
      "ense.identifier | MedicationRequest.iden" +
      "tifier | MedicationStatement.identifier " +
      "| NutritionOrder.identifier | Observatio" +
      "n.identifier | Procedure.identifier | Ri" +
      "skAssessment.identifier | ServiceRequest" +
      ".identifier | SupplyDelivery.identifier " +
      "| SupplyRequest.identifier | VisionPresc" +
      "ription.identifier\262\365\365\327\t\320\001\n\nmedication\020\005\032" +
      "\277\001(MedicationAdministration.medication a" +
      "s Reference) | (MedicationDispense.medic" +
      "ation as Reference) | (MedicationRequest" +
      ".medication as Reference) | (MedicationS" +
      "tatement.medication as Reference)\262\365\365\327\t\370\n" +
      "\n\007patient\020\005\032\352\nAllergyIntolerance.patient" +
      " | CarePlan.subject.where(resolve() is P" +
      "atient) | CareTeam.subject.where(resolve" +
      "() is Patient) | ClinicalImpression.subj" +
      "ect.where(resolve() is Patient) | Compos" +
      "ition.subject.where(resolve() is Patient" +
      ") | Condition.subject.where(resolve() is" +
      " Patient) | Consent.patient | DetectedIs" +
      "sue.patient | DeviceRequest.subject.wher" +
      "e(resolve() is Patient) | DeviceUseState" +
      "ment.subject | DiagnosticReport.subject." +
      "where(resolve() is Patient) | DocumentMa" +
      "nifest.subject.where(resolve() is Patien" +
      "t) | DocumentReference.subject.where(res" +
      "olve() is Patient) | Encounter.subject.w" +
      "here(resolve() is Patient) | EpisodeOfCa" +
      "re.patient | FamilyMemberHistory.patient" +
      " | Flag.subject.where(resolve() is Patie" +
      "nt) | Goal.subject.where(resolve() is Pa" +
      "tient) | ImagingStudy.subject.where(reso" +
      "lve() is Patient) | Immunization.patient" +
      " | List.subject.where(resolve() is Patie" +
      "nt) | MedicationAdministration.subject.w" +
      "here(resolve() is Patient) | MedicationD" +
      "ispense.subject.where(resolve() is Patie" +
      "nt) | MedicationRequest.subject.where(re" +
      "solve() is Patient) | MedicationStatemen" +
      "t.subject.where(resolve() is Patient) | " +
      "NutritionOrder.patient | Observation.sub" +
      "ject.where(resolve() is Patient) | Proce" +
      "dure.subject.where(resolve() is Patient)" +
      " | RiskAssessment.subject.where(resolve(" +
      ") is Patient) | ServiceRequest.subject.w" +
      "here(resolve() is Patient) | SupplyDeliv" +
      "ery.patient | VisionPrescription.patient" +
      "\262\365\365\327\t1\n\tperformer\020\005\032\"MedicationDispense." +
      "performer.actor\262\365\365\327\t<\n\014prescription\020\005\032*M" +
      "edicationDispense.authorizingPrescriptio" +
      "n\262\365\365\327\t)\n\010receiver\020\005\032\033MedicationDispense." +
      "receiver\262\365\365\327\tF\n\020responsibleparty\020\005\0320Medi" +
      "cationDispense.substitution.responsibleP" +
      "arty\262\365\365\327\t\177\n\006status\020\004\032sMedicationAdminist" +
      "ration.status | MedicationDispense.statu" +
      "s | MedicationRequest.status | Medicatio" +
      "nStatement.status\262\365\365\327\t\'\n\007subject\020\005\032\032Medi" +
      "cationDispense.subject\262\365\365\327\t!\n\004type\020\004\032\027Me" +
      "dicationDispense.type\262\365\365\327\t5\n\016whenhandedo" +
      "ver\020\002\032!MedicationDispense.whenHandedOver" +
      "\262\365\365\327\t1\n\014whenprepared\020\002\032\037MedicationDispen" +
      "se.whenPreparedJ\004\010\007\020\010B!\n\027com.google.fhir" +
      ".r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Codes.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_MedicationDispense_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_MedicationDispense_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_MedicationDispense_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Identifier", "PartOf", "Status", "StatusReason", "Category", "Medication", "Subject", "Context", "SupportingInformation", "Performer", "Location", "AuthorizingPrescription", "Type", "Quantity", "DaysSupply", "WhenPrepared", "WhenHandedOver", "Destination", "Receiver", "Note", "DosageInstruction", "Substitution", "DetectedIssue", "EventHistory", });
    internal_static_google_fhir_r4_core_MedicationDispense_StatusCode_descriptor =
      internal_static_google_fhir_r4_core_MedicationDispense_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_MedicationDispense_StatusCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_MedicationDispense_StatusCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_MedicationDispense_StatusReasonX_descriptor =
      internal_static_google_fhir_r4_core_MedicationDispense_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_MedicationDispense_StatusReasonX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_MedicationDispense_StatusReasonX_descriptor,
        new java.lang.String[] { "CodeableConcept", "Reference", "Choice", });
    internal_static_google_fhir_r4_core_MedicationDispense_MedicationX_descriptor =
      internal_static_google_fhir_r4_core_MedicationDispense_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_MedicationDispense_MedicationX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_MedicationDispense_MedicationX_descriptor,
        new java.lang.String[] { "CodeableConcept", "Reference", "Choice", });
    internal_static_google_fhir_r4_core_MedicationDispense_Performer_descriptor =
      internal_static_google_fhir_r4_core_MedicationDispense_descriptor.getNestedTypes().get(3);
    internal_static_google_fhir_r4_core_MedicationDispense_Performer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_MedicationDispense_Performer_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Function", "Actor", });
    internal_static_google_fhir_r4_core_MedicationDispense_Substitution_descriptor =
      internal_static_google_fhir_r4_core_MedicationDispense_descriptor.getNestedTypes().get(4);
    internal_static_google_fhir_r4_core_MedicationDispense_Substitution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_MedicationDispense_Substitution_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "WasSubstituted", "Type", "Reason", "ResponsibleParty", });
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
