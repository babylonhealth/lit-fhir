// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/consent.proto

package com.google.fhir.r4.core;

public final class ConsentOuterClass {
  private ConsentOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Consent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Consent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Consent_StatusCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Consent_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Consent_SourceX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Consent_SourceX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Consent_Policy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Consent_Policy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Consent_Verification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Consent_Verification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Consent_Provision_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Consent_Provision_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Consent_Provision_TypeCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Consent_Provision_TypeCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Consent_Provision_ProvisionActor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Consent_Provision_ProvisionActor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Consent_Provision_ProvisionData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Consent_Provision_ProvisionData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Consent_Provision_ProvisionData_MeaningCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Consent_Provision_ProvisionData_MeaningCode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7proto/google/fhir/proto/r4/core/resour" +
      "ces/consent.proto\022\023google.fhir.r4.core\032\031" +
      "google/protobuf/any.proto\032)proto/google/" +
      "fhir/proto/annotations.proto\032+proto/goog" +
      "le/fhir/proto/r4/core/codes.proto\032/proto" +
      "/google/fhir/proto/r4/core/datatypes.pro" +
      "to\"\231@\n\007Consent\022#\n\002id\030\001 \001(\0132\027.google.fhir" +
      ".r4.core.Id\022\'\n\004meta\030\002 \001(\0132\031.google.fhir." +
      "r4.core.Meta\0220\n\016implicit_rules\030\003 \001(\0132\030.g" +
      "oogle.fhir.r4.core.Uri\022+\n\010language\030\004 \001(\013" +
      "2\031.google.fhir.r4.core.Code\022,\n\004text\030\005 \001(" +
      "\0132\036.google.fhir.r4.core.Narrative\022\'\n\tcon" +
      "tained\030\006 \003(\0132\024.google.protobuf.Any\0221\n\tex" +
      "tension\030\010 \003(\0132\036.google.fhir.r4.core.Exte" +
      "nsion\022:\n\022modifier_extension\030\t \003(\0132\036.goog" +
      "le.fhir.r4.core.Extension\0223\n\nidentifier\030" +
      "\n \003(\0132\037.google.fhir.r4.core.Identifier\022?" +
      "\n\006status\030\013 \001(\0132\'.google.fhir.r4.core.Con" +
      "sent.StatusCodeB\006\360\320\207\353\004\001\022;\n\005scope\030\014 \001(\0132$" +
      ".google.fhir.r4.core.CodeableConceptB\006\360\320" +
      "\207\353\004\001\022>\n\010category\030\r \003(\0132$.google.fhir.r4." +
      "core.CodeableConceptB\006\360\320\207\353\004\001\022>\n\007patient\030" +
      "\016 \001(\0132\036.google.fhir.r4.core.ReferenceB\r\362" +
      "\377\374\302\006\007Patient\0220\n\tdate_time\030\017 \001(\0132\035.google" +
      ".fhir.r4.core.DateTime\022\215\001\n\tperformer\030\020 \003" +
      "(\0132\036.google.fhir.r4.core.ReferenceBZ\362\377\374\302" +
      "\006\014Organization\362\377\374\302\006\007Patient\362\377\374\302\006\014Practit" +
      "ioner\362\377\374\302\006\rRelatedPerson\362\377\374\302\006\020Practition" +
      "erRole\022H\n\014organization\030\021 \003(\0132\036.google.fh" +
      "ir.r4.core.ReferenceB\022\362\377\374\302\006\014Organization" +
      "\0224\n\006source\030\022 \001(\0132$.google.fhir.r4.core.C" +
      "onsent.SourceX\0223\n\006policy\030\023 \003(\0132#.google." +
      "fhir.r4.core.Consent.Policy\0229\n\013policy_ru" +
      "le\030\024 \001(\0132$.google.fhir.r4.core.CodeableC" +
      "oncept\022?\n\014verification\030\025 \003(\0132).google.fh" +
      "ir.r4.core.Consent.Verification\0229\n\tprovi" +
      "sion\030\026 \001(\0132&.google.fhir.r4.core.Consent" +
      ".Provision\032\224\002\n\nStatusCode\022:\n\005value\030\001 \001(\016" +
      "2+.google.fhir.r4.core.ConsentStateCode." +
      "Value\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4.core." +
      "String\0221\n\textension\030\003 \003(\0132\036.google.fhir." +
      "r4.core.Extension:n\300\237\343\266\005\001\212\371\203\262\0050http://hl" +
      "7.org/fhir/ValueSet/consent-state-codes\232" +
      "\265\216\223\006,http://hl7.org/fhir/StructureDefini" +
      "tion/code\032\327\001\n\007SourceX\0225\n\nattachment\030\001 \001(" +
      "\0132\037.google.fhir.r4.core.AttachmentH\000\022\202\001\n" +
      "\treference\030\002 \001(\0132\036.google.fhir.r4.core.R" +
      "eferenceBM\362\377\374\302\006\007Consent\362\377\374\302\006\021DocumentRef" +
      "erence\362\377\374\302\006\010Contract\362\377\374\302\006\025QuestionnaireR" +
      "esponseH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\364\001\n\006Policy\022\'" +
      "\n\002id\030\001 \001(\0132\033.google.fhir.r4.core.String\022" +
      "1\n\textension\030\002 \003(\0132\036.google.fhir.r4.core" +
      ".Extension\022:\n\022modifier_extension\030\003 \003(\0132\036" +
      ".google.fhir.r4.core.Extension\022+\n\tauthor" +
      "ity\030\004 \001(\0132\030.google.fhir.r4.core.Uri\022%\n\003u" +
      "ri\030\005 \001(\0132\030.google.fhir.r4.core.Uri\032\361\002\n\014V" +
      "erification\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4" +
      ".core.String\0221\n\textension\030\002 \003(\0132\036.google" +
      ".fhir.r4.core.Extension\022:\n\022modifier_exte" +
      "nsion\030\003 \003(\0132\036.google.fhir.r4.core.Extens" +
      "ion\0226\n\010verified\030\004 \001(\0132\034.google.fhir.r4.c" +
      "ore.BooleanB\006\360\320\207\353\004\001\022W\n\rverified_with\030\005 \001" +
      "(\0132\036.google.fhir.r4.core.ReferenceB \362\377\374\302" +
      "\006\007Patient\362\377\374\302\006\rRelatedPerson\0228\n\021verifica" +
      "tion_date\030\006 \001(\0132\035.google.fhir.r4.core.Da" +
      "teTime\032\274\020\n\tProvision\022\'\n\002id\030\001 \001(\0132\033.googl" +
      "e.fhir.r4.core.String\0221\n\textension\030\002 \003(\013" +
      "2\036.google.fhir.r4.core.Extension\022:\n\022modi" +
      "fier_extension\030\003 \003(\0132\036.google.fhir.r4.co" +
      "re.Extension\022=\n\004type\030\004 \001(\0132/.google.fhir" +
      ".r4.core.Consent.Provision.TypeCode\022+\n\006p" +
      "eriod\030\005 \001(\0132\033.google.fhir.r4.core.Period" +
      "\022D\n\005actor\030\006 \003(\01325.google.fhir.r4.core.Co" +
      "nsent.Provision.ProvisionActor\0224\n\006action" +
      "\030\007 \003(\0132$.google.fhir.r4.core.CodeableCon" +
      "cept\0223\n\016security_label\030\010 \003(\0132\033.google.fh" +
      "ir.r4.core.Coding\022,\n\007purpose\030\t \003(\0132\033.goo" +
      "gle.fhir.r4.core.Coding\0227\n\013class_value\030\n" +
      " \003(\0132\033.google.fhir.r4.core.CodingR\005class" +
      "\0222\n\004code\030\013 \003(\0132$.google.fhir.r4.core.Cod" +
      "eableConcept\0220\n\013data_period\030\014 \001(\0132\033.goog" +
      "le.fhir.r4.core.Period\022B\n\004data\030\r \003(\01324.g" +
      "oogle.fhir.r4.core.Consent.Provision.Pro" +
      "visionData\0229\n\tprovision\030\016 \003(\0132&.google.f" +
      "hir.r4.core.Consent.Provision\032\235\002\n\010TypeCo" +
      "de\022B\n\005value\030\001 \001(\01623.google.fhir.r4.core." +
      "ConsentProvisionTypeCode.Value\022\'\n\002id\030\002 \001" +
      "(\0132\033.google.fhir.r4.core.String\0221\n\texten" +
      "sion\030\003 \003(\0132\036.google.fhir.r4.core.Extensi" +
      "on:q\300\237\343\266\005\001\212\371\203\262\0053http://hl7.org/fhir/Valu" +
      "eSet/consent-provision-type\232\265\216\223\006,http://" +
      "hl7.org/fhir/StructureDefinition/code\032\240\003" +
      "\n\016ProvisionActor\022\'\n\002id\030\001 \001(\0132\033.google.fh" +
      "ir.r4.core.String\0221\n\textension\030\002 \003(\0132\036.g" +
      "oogle.fhir.r4.core.Extension\022:\n\022modifier" +
      "_extension\030\003 \003(\0132\036.google.fhir.r4.core.E" +
      "xtension\022:\n\004role\030\004 \001(\0132$.google.fhir.r4." +
      "core.CodeableConceptB\006\360\320\207\353\004\001\022\271\001\n\treferen" +
      "ce\030\005 \001(\0132\036.google.fhir.r4.core.Reference" +
      "B\205\001\360\320\207\353\004\001\362\377\374\302\006\006Device\362\377\374\302\006\005Group\362\377\374\302\006\010Ca" +
      "reTeam\362\377\374\302\006\014Organization\362\377\374\302\006\007Patient\362\377\374" +
      "\302\006\014Practitioner\362\377\374\302\006\rRelatedPerson\362\377\374\302\006\020" +
      "PractitionerRole\032\352\004\n\rProvisionData\022\'\n\002id" +
      "\030\001 \001(\0132\033.google.fhir.r4.core.String\0221\n\te" +
      "xtension\030\002 \003(\0132\036.google.fhir.r4.core.Ext" +
      "ension\022:\n\022modifier_extension\030\003 \003(\0132\036.goo" +
      "gle.fhir.r4.core.Extension\022Y\n\007meaning\030\004 " +
      "\001(\0132@.google.fhir.r4.core.Consent.Provis" +
      "ion.ProvisionData.MeaningCodeB\006\360\320\207\353\004\001\022G\n" +
      "\treference\030\005 \001(\0132\036.google.fhir.r4.core.R" +
      "eferenceB\024\360\320\207\353\004\001\362\377\374\302\006\010Resource\032\234\002\n\013Meani" +
      "ngCode\022@\n\005value\030\001 \001(\01621.google.fhir.r4.c" +
      "ore.ConsentDataMeaningCode.Value\022\'\n\002id\030\002" +
      " \001(\0132\033.google.fhir.r4.core.String\0221\n\text" +
      "ension\030\003 \003(\0132\036.google.fhir.r4.core.Exten" +
      "sion:o\300\237\343\266\005\001\212\371\203\262\0051http://hl7.org/fhir/Va" +
      "lueSet/consent-data-meaning\232\265\216\223\006,http://" +
      "hl7.org/fhir/StructureDefinition/code:\230\035" +
      "\300\237\343\266\005\003\262\376\344\227\006/http://hl7.org/fhir/Structur" +
      "eDefinition/Consent\232\206\223\240\010&policy.exists()" +
      " or policyRule.exists()\232\206\223\240\010dpatient.exi" +
      "sts() or scope.coding.where(system=\'some" +
      "thing\' and code=\'patient-privacy\').exist" +
      "s().not()\232\206\223\240\010]patient.exists() or scope" +
      ".coding.where(system=\'something\' and cod" +
      "e=\'research\').exists().not()\232\206\223\240\010Xpatien" +
      "t.exists() or scope.coding.where(system=" +
      "\'something\' and code=\'adr\').exists().not" +
      "()\232\206\223\240\010^patient.exists() or scope.coding" +
      ".where(system=\'something\' and code=\'trea" +
      "tment\').exists().not()\262\365\365\327\t$\n\006action\020\004\032\030" +
      "Consent.provision.action\262\365\365\327\t,\n\005actor\020\005\032" +
      "!Consent.provision.actor.reference\262\365\365\327\t\036" +
      "\n\010category\020\004\032\020Consent.category\262\365\365\327\t \n\tco" +
      "nsentor\020\005\032\021Consent.performer\262\365\365\327\t*\n\004data" +
      "\020\005\032 Consent.provision.data.reference\262\365\365\327" +
      "\t\227\003\n\004date\020\002\032\214\003AllergyIntolerance.recorde" +
      "dDate | CarePlan.period | CareTeam.perio" +
      "d | ClinicalImpression.date | Compositio" +
      "n.date | Consent.dateTime | DiagnosticRe" +
      "port.effective | Encounter.period | Epis" +
      "odeOfCare.period | FamilyMemberHistory.d" +
      "ate | Flag.period | Immunization.occurre" +
      "nce | List.date | Observation.effective " +
      "| Procedure.performed | (RiskAssessment." +
      "occurrence as dateTime) | SupplyRequest." +
      "authoredOn\262\365\365\327\t\205\007\n\nidentifier\020\004\032\364\006Allerg" +
      "yIntolerance.identifier | CarePlan.ident" +
      "ifier | CareTeam.identifier | Compositio" +
      "n.identifier | Condition.identifier | Co" +
      "nsent.identifier | DetectedIssue.identif" +
      "ier | DeviceRequest.identifier | Diagnos" +
      "ticReport.identifier | DocumentManifest." +
      "masterIdentifier | DocumentManifest.iden" +
      "tifier | DocumentReference.masterIdentif" +
      "ier | DocumentReference.identifier | Enc" +
      "ounter.identifier | EpisodeOfCare.identi" +
      "fier | FamilyMemberHistory.identifier | " +
      "Goal.identifier | ImagingStudy.identifie" +
      "r | Immunization.identifier | List.ident" +
      "ifier | MedicationAdministration.identif" +
      "ier | MedicationDispense.identifier | Me" +
      "dicationRequest.identifier | MedicationS" +
      "tatement.identifier | NutritionOrder.ide" +
      "ntifier | Observation.identifier | Proce" +
      "dure.identifier | RiskAssessment.identif" +
      "ier | ServiceRequest.identifier | Supply" +
      "Delivery.identifier | SupplyRequest.iden" +
      "tifier | VisionPrescription.identifier\262\365" +
      "\365\327\t&\n\014organization\020\005\032\024Consent.organizati" +
      "on\262\365\365\327\t\370\n\n\007patient\020\005\032\352\nAllergyIntoleranc" +
      "e.patient | CarePlan.subject.where(resol" +
      "ve() is Patient) | CareTeam.subject.wher" +
      "e(resolve() is Patient) | ClinicalImpres" +
      "sion.subject.where(resolve() is Patient)" +
      " | Composition.subject.where(resolve() i" +
      "s Patient) | Condition.subject.where(res" +
      "olve() is Patient) | Consent.patient | D" +
      "etectedIssue.patient | DeviceRequest.sub" +
      "ject.where(resolve() is Patient) | Devic" +
      "eUseStatement.subject | DiagnosticReport" +
      ".subject.where(resolve() is Patient) | D" +
      "ocumentManifest.subject.where(resolve() " +
      "is Patient) | DocumentReference.subject." +
      "where(resolve() is Patient) | Encounter." +
      "subject.where(resolve() is Patient) | Ep" +
      "isodeOfCare.patient | FamilyMemberHistor" +
      "y.patient | Flag.subject.where(resolve()" +
      " is Patient) | Goal.subject.where(resolv" +
      "e() is Patient) | ImagingStudy.subject.w" +
      "here(resolve() is Patient) | Immunizatio" +
      "n.patient | List.subject.where(resolve()" +
      " is Patient) | MedicationAdministration." +
      "subject.where(resolve() is Patient) | Me" +
      "dicationDispense.subject.where(resolve()" +
      " is Patient) | MedicationRequest.subject" +
      ".where(resolve() is Patient) | Medicatio" +
      "nStatement.subject.where(resolve() is Pa" +
      "tient) | NutritionOrder.patient | Observ" +
      "ation.subject.where(resolve() is Patient" +
      ") | Procedure.subject.where(resolve() is" +
      " Patient) | RiskAssessment.subject.where" +
      "(resolve() is Patient) | ServiceRequest." +
      "subject.where(resolve() is Patient) | Su" +
      "pplyDelivery.patient | VisionPrescriptio" +
      "n.patient\262\365\365\327\t$\n\006period\020\002\032\030Consent.provi" +
      "sion.period\262\365\365\327\t&\n\007purpose\020\004\032\031Consent.pr" +
      "ovision.purpose\262\365\365\327\t\030\n\005scope\020\004\032\rConsent." +
      "scope\262\365\365\327\t3\n\016security-label\020\004\032\037Consent.p" +
      "rovision.securityLabel\262\365\365\327\t$\n\020source-ref" +
      "erence\020\005\032\016Consent.source\262\365\365\327\t\032\n\006status\020\004" +
      "\032\016Consent.statusJ\004\010\007\020\010B!\n\027com.google.fhi" +
      "r.r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Codes.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_Consent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_Consent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Consent_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Identifier", "Status", "Scope", "Category", "Patient", "DateTime", "Performer", "Organization", "Source", "Policy", "PolicyRule", "Verification", "Provision", });
    internal_static_google_fhir_r4_core_Consent_StatusCode_descriptor =
      internal_static_google_fhir_r4_core_Consent_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Consent_StatusCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Consent_StatusCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_Consent_SourceX_descriptor =
      internal_static_google_fhir_r4_core_Consent_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_Consent_SourceX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Consent_SourceX_descriptor,
        new java.lang.String[] { "Attachment", "Reference", "Choice", });
    internal_static_google_fhir_r4_core_Consent_Policy_descriptor =
      internal_static_google_fhir_r4_core_Consent_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_Consent_Policy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Consent_Policy_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Authority", "Uri", });
    internal_static_google_fhir_r4_core_Consent_Verification_descriptor =
      internal_static_google_fhir_r4_core_Consent_descriptor.getNestedTypes().get(3);
    internal_static_google_fhir_r4_core_Consent_Verification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Consent_Verification_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Verified", "VerifiedWith", "VerificationDate", });
    internal_static_google_fhir_r4_core_Consent_Provision_descriptor =
      internal_static_google_fhir_r4_core_Consent_descriptor.getNestedTypes().get(4);
    internal_static_google_fhir_r4_core_Consent_Provision_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Consent_Provision_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Type", "Period", "Actor", "Action", "SecurityLabel", "Purpose", "ClassValue", "Code", "DataPeriod", "Data", "Provision", });
    internal_static_google_fhir_r4_core_Consent_Provision_TypeCode_descriptor =
      internal_static_google_fhir_r4_core_Consent_Provision_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Consent_Provision_TypeCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Consent_Provision_TypeCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_Consent_Provision_ProvisionActor_descriptor =
      internal_static_google_fhir_r4_core_Consent_Provision_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_Consent_Provision_ProvisionActor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Consent_Provision_ProvisionActor_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Role", "Reference", });
    internal_static_google_fhir_r4_core_Consent_Provision_ProvisionData_descriptor =
      internal_static_google_fhir_r4_core_Consent_Provision_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_Consent_Provision_ProvisionData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Consent_Provision_ProvisionData_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Meaning", "Reference", });
    internal_static_google_fhir_r4_core_Consent_Provision_ProvisionData_MeaningCode_descriptor =
      internal_static_google_fhir_r4_core_Consent_Provision_ProvisionData_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Consent_Provision_ProvisionData_MeaningCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Consent_Provision_ProvisionData_MeaningCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
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
