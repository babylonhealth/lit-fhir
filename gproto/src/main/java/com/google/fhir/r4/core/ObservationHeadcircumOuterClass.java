// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/profiles/observation_headcircum.proto

package com.google.fhir.r4.core;

public final class ObservationHeadcircumOuterClass {
  private ObservationHeadcircumOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ObservationHeadcircum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ObservationHeadcircum_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ObservationHeadcircum_StatusCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ObservationHeadcircum_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ObservationHeadcircum_CodeableConceptForCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ObservationHeadcircum_CodeableConceptForCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ObservationHeadcircum_EffectiveX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ObservationHeadcircum_EffectiveX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ObservationHeadcircum_ValueX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ObservationHeadcircum_ValueX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ObservationHeadcircum_ReferenceRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ObservationHeadcircum_ReferenceRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ObservationHeadcircum_Component_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ObservationHeadcircum_Component_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ObservationHeadcircum_Component_ValueX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ObservationHeadcircum_Component_ValueX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEproto/google/fhir/proto/r4/core/profil" +
      "es/observation_headcircum.proto\022\023google." +
      "fhir.r4.core\032\031google/protobuf/any.proto\032" +
      ")proto/google/fhir/proto/annotations.pro" +
      "to\032+proto/google/fhir/proto/r4/core/code" +
      "s.proto\032/proto/google/fhir/proto/r4/core" +
      "/datatypes.proto\"\305\\\n\025ObservationHeadcirc" +
      "um\022#\n\002id\030\001 \001(\0132\027.google.fhir.r4.core.Id\022" +
      "\'\n\004meta\030\002 \001(\0132\031.google.fhir.r4.core.Meta" +
      "\0220\n\016implicit_rules\030\003 \001(\0132\030.google.fhir.r" +
      "4.core.Uri\022+\n\010language\030\004 \001(\0132\031.google.fh" +
      "ir.r4.core.Code\022,\n\004text\030\005 \001(\0132\036.google.f" +
      "hir.r4.core.Narrative\022\'\n\tcontained\030\006 \003(\013" +
      "2\024.google.protobuf.Any\0221\n\textension\030\010 \003(" +
      "\0132\036.google.fhir.r4.core.Extension\022:\n\022mod" +
      "ifier_extension\030\t \003(\0132\036.google.fhir.r4.c" +
      "ore.Extension\0223\n\nidentifier\030\n \003(\0132\037.goog" +
      "le.fhir.r4.core.Identifier\022\263\001\n\010based_on\030" +
      "\013 \003(\0132\036.google.fhir.r4.core.ReferenceB\200\001" +
      "\362\377\374\302\006\010CarePlan\362\377\374\302\006\rDeviceRequest\362\377\374\302\006\032I" +
      "mmunizationRecommendation\362\377\374\302\006\021Medicatio" +
      "nRequest\362\377\374\302\006\016NutritionOrder\362\377\374\302\006\016Servic" +
      "eRequest\022\264\001\n\007part_of\030\014 \003(\0132\036.google.fhir" +
      ".r4.core.ReferenceB\202\001\362\377\374\302\006\030MedicationAdm" +
      "inistration\362\377\374\302\006\022MedicationDispense\362\377\374\302\006" +
      "\023MedicationStatement\362\377\374\302\006\tProcedure\362\377\374\302\006" +
      "\014Immunization\362\377\374\302\006\014ImagingStudy\022M\n\006statu" +
      "s\030\r \001(\01325.google.fhir.r4.core.Observatio" +
      "nHeadcircum.StatusCodeB\006\360\320\207\353\004\001\022>\n\010catego" +
      "ry\030\016 \003(\0132$.google.fhir.r4.core.CodeableC" +
      "onceptB\006\360\320\207\353\004\001\022W\n\004code\030\017 \001(\0132A.google.fh" +
      "ir.r4.core.ObservationHeadcircum.Codeabl" +
      "eConceptForCodeB\006\360\320\207\353\004\001\022D\n\007subject\030\020 \001(\013" +
      "2\036.google.fhir.r4.core.ReferenceB\023\360\320\207\353\004\001" +
      "\362\377\374\302\006\007Patient\022=\n\005focus\030\021 \003(\0132\036.google.fh" +
      "ir.r4.core.ReferenceB\016\362\377\374\302\006\010Resource\022B\n\t" +
      "encounter\030\022 \001(\0132\036.google.fhir.r4.core.Re" +
      "ferenceB\017\362\377\374\302\006\tEncounter\022P\n\teffective\030\023 " +
      "\001(\01325.google.fhir.r4.core.ObservationHea" +
      "dcircum.EffectiveXB\006\360\320\207\353\004\001\022,\n\006issued\030\024 \001" +
      "(\0132\034.google.fhir.r4.core.Instant\022\233\001\n\tper" +
      "former\030\025 \003(\0132\036.google.fhir.r4.core.Refer" +
      "enceBh\362\377\374\302\006\014Practitioner\362\377\374\302\006\020Practition" +
      "erRole\362\377\374\302\006\014Organization\362\377\374\302\006\010CareTeam\362\377" +
      "\374\302\006\007Patient\362\377\374\302\006\rRelatedPerson\022@\n\005value\030" +
      "\026 \001(\01321.google.fhir.r4.core.ObservationH" +
      "eadcircum.ValueX\022@\n\022data_absent_reason\030\027" +
      " \001(\0132$.google.fhir.r4.core.CodeableConce" +
      "pt\022<\n\016interpretation\030\030 \003(\0132$.google.fhir" +
      ".r4.core.CodeableConcept\022-\n\004note\030\031 \003(\0132\037" +
      ".google.fhir.r4.core.Annotation\0227\n\tbody_" +
      "site\030\032 \001(\0132$.google.fhir.r4.core.Codeabl" +
      "eConcept\0224\n\006method\030\033 \001(\0132$.google.fhir.r" +
      "4.core.CodeableConcept\022@\n\010specimen\030\034 \001(\013" +
      "2\036.google.fhir.r4.core.ReferenceB\016\362\377\374\302\006\010" +
      "Specimen\022N\n\006device\030\035 \001(\0132\036.google.fhir.r" +
      "4.core.ReferenceB\036\362\377\374\302\006\006Device\362\377\374\302\006\014Devi" +
      "ceMetric\022R\n\017reference_range\030\036 \003(\01329.goog" +
      "le.fhir.r4.core.ObservationHeadcircum.Re" +
      "ferenceRange\022w\n\nhas_member\030\037 \003(\0132\036.googl" +
      "e.fhir.r4.core.ReferenceBC\362\377\374\302\006\025Question" +
      "naireResponse\362\377\374\302\006\021MolecularSequence\362\377\374\302" +
      "\006\013Observation\022\255\001\n\014derived_from\030  \003(\0132\036.g" +
      "oogle.fhir.r4.core.ReferenceBw\362\377\374\302\006\021Docu" +
      "mentReference\362\377\374\302\006\014ImagingStudy\362\377\374\302\006\005Med" +
      "ia\362\377\374\302\006\025QuestionnaireResponse\362\377\374\302\006\021Molec" +
      "ularSequence\362\377\374\302\006\013Observation\022G\n\tcompone" +
      "nt\030! \003(\01324.google.fhir.r4.core.Observati" +
      "onHeadcircum.Component\032\230\002\n\nStatusCode\022?\n" +
      "\005value\030\001 \001(\01620.google.fhir.r4.core.Obser" +
      "vationStatusCode.Value\022\'\n\002id\030\002 \001(\0132\033.goo" +
      "gle.fhir.r4.core.String\0221\n\textension\030\003 \003" +
      "(\0132\036.google.fhir.r4.core.Extension:m\300\237\343\266" +
      "\005\001\212\371\203\262\005/http://hl7.org/fhir/ValueSet/obs" +
      "ervation-status\232\265\216\223\006,http://hl7.org/fhir" +
      "/StructureDefinition/code\032\203\003\n\026CodeableCo" +
      "nceptForCode\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r" +
      "4.core.String\0221\n\textension\030\002 \003(\0132\036.googl" +
      "e.fhir.r4.core.Extension\022+\n\006coding\030\003 \003(\013" +
      "2\033.google.fhir.r4.core.Coding\022)\n\004text\030\004 " +
      "\001(\0132\033.google.fhir.r4.core.String\022v\n\020head" +
      "_circum_code\030\005 \001(\0132(.google.fhir.r4.core" +
      ".CodingWithFixedCodeB\"\372\347\224\250\006\020http://loinc" +
      ".org\242\274\227\251\006\0069843-4R\016HeadCircumCode:=\232\265\216\223\0067" +
      "http://hl7.org/fhir/StructureDefinition/" +
      "CodeableConcept\032\263\001\n\nEffectiveX\0222\n\tdate_t" +
      "ime\030\001 \001(\0132\035.google.fhir.r4.core.DateTime" +
      "H\000\022-\n\006period\030\002 \001(\0132\033.google.fhir.r4.core" +
      ".PeriodH\000:8\232\206\223\240\010,($this as dateTime).toS" +
      "tring().length() >= 8\240\203\203\350\006\001B\010\n\006choice\032M\n" +
      "\006ValueX\0221\n\010quantity\030\001 \001(\0132\035.google.fhir." +
      "r4.core.QuantityH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\205\004\n" +
      "\016ReferenceRange\022\'\n\002id\030\001 \001(\0132\033.google.fhi" +
      "r.r4.core.String\0221\n\textension\030\002 \003(\0132\036.go" +
      "ogle.fhir.r4.core.Extension\022:\n\022modifier_" +
      "extension\030\003 \003(\0132\036.google.fhir.r4.core.Ex" +
      "tension\0220\n\003low\030\004 \001(\0132#.google.fhir.r4.co" +
      "re.SimpleQuantity\0221\n\004high\030\005 \001(\0132#.google" +
      ".fhir.r4.core.SimpleQuantity\0222\n\004type\030\006 \001" +
      "(\0132$.google.fhir.r4.core.CodeableConcept" +
      "\0228\n\napplies_to\030\007 \003(\0132$.google.fhir.r4.co" +
      "re.CodeableConcept\022\'\n\003age\030\010 \001(\0132\032.google" +
      ".fhir.r4.core.Range\022)\n\004text\030\t \001(\0132\033.goog" +
      "le.fhir.r4.core.String:4\232\206\223\240\010.low.exists" +
      "() or high.exists() or text.exists()\032\205\t\n" +
      "\tComponent\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4." +
      "core.String\0221\n\textension\030\002 \003(\0132\036.google." +
      "fhir.r4.core.Extension\022:\n\022modifier_exten" +
      "sion\030\003 \003(\0132\036.google.fhir.r4.core.Extensi" +
      "on\022:\n\004code\030\004 \001(\0132$.google.fhir.r4.core.C" +
      "odeableConceptB\006\360\320\207\353\004\001\022J\n\005value\030\005 \001(\0132;." +
      "google.fhir.r4.core.ObservationHeadcircu" +
      "m.Component.ValueX\022@\n\022data_absent_reason" +
      "\030\006 \001(\0132$.google.fhir.r4.core.CodeableCon" +
      "cept\022<\n\016interpretation\030\007 \003(\0132$.google.fh" +
      "ir.r4.core.CodeableConcept\022R\n\017reference_" +
      "range\030\010 \003(\01329.google.fhir.r4.core.Observ" +
      "ationHeadcircum.ReferenceRange\032\320\004\n\006Value" +
      "X\0221\n\010quantity\030\001 \001(\0132\035.google.fhir.r4.cor" +
      "e.QuantityH\000\022@\n\020codeable_concept\030\002 \001(\0132$" +
      ".google.fhir.r4.core.CodeableConceptH\000\022;" +
      "\n\014string_value\030\003 \001(\0132\033.google.fhir.r4.co" +
      "re.StringH\000R\006string\022/\n\007boolean\030\004 \001(\0132\034.g" +
      "oogle.fhir.r4.core.BooleanH\000\022/\n\007integer\030" +
      "\005 \001(\0132\034.google.fhir.r4.core.IntegerH\000\022+\n" +
      "\005range\030\006 \001(\0132\032.google.fhir.r4.core.Range" +
      "H\000\022+\n\005ratio\030\007 \001(\0132\032.google.fhir.r4.core." +
      "RatioH\000\0228\n\014sampled_data\030\010 \001(\0132 .google.f" +
      "hir.r4.core.SampledDataH\000\022)\n\004time\030\t \001(\0132" +
      "\031.google.fhir.r4.core.TimeH\000\0222\n\tdate_tim" +
      "e\030\n \001(\0132\035.google.fhir.r4.core.DateTimeH\000" +
      "\022-\n\006period\030\013 \001(\0132\033.google.fhir.r4.core.P" +
      "eriodH\000:\006\240\203\203\350\006\001B\010\n\006choice:1\232\206\223\240\010+value.e" +
      "xists() or dataAbsentReason.exists():\3154\300" +
      "\237\343\266\005\003\232\265\216\223\0062http://hl7.org/fhir/Structure" +
      "Definition/vitalsigns\232\265\216\223\0063http://hl7.or" +
      "g/fhir/StructureDefinition/Observation\262\376" +
      "\344\227\0062http://hl7.org/fhir/StructureDefinit" +
      "ion/headcircum\232\206\223\240\010)dataAbsentReason.emp" +
      "ty() or value.empty()\232\206\223\240\010_value.empty()" +
      " or component.code.where(coding.intersec" +
      "t(%resource.code.coding).exists()).empty" +
      "()\232\206\223\240\010_(component.empty() and hasMember" +
      ".empty()) implies (dataAbsentReason.exis" +
      "ts() or value.exists())\262\365\365\327\t\177\n\021amino-aci" +
      "d-change\020\003\032hObservation.extension(\'http:" +
      "//hl7.org/fhir/StructureDefinition/obser" +
      "vation-geneticsAminoAcidChangeName\')\262\365\365\327" +
      "\t!\n\010based-on\020\005\032\023Observation.basedOn\262\365\365\327\t" +
      "\"\n\010category\020\004\032\024Observation.category\262\365\365\327\t" +
      "\364\003\n\004code\020\004\032\351\003AllergyIntolerance.code | A" +
      "llergyIntolerance.reaction.substance | C" +
      "ondition.code | (DeviceRequest.code as C" +
      "odeableConcept) | DiagnosticReport.code " +
      "| FamilyMemberHistory.condition.code | L" +
      "ist.code | Medication.code | (Medication" +
      "Administration.medication as CodeableCon" +
      "cept) | (MedicationDispense.medication a" +
      "s CodeableConcept) | (MedicationRequest." +
      "medication as CodeableConcept) | (Medica" +
      "tionStatement.medication as CodeableConc" +
      "ept) | Observation.code | Procedure.code" +
      " | ServiceRequest.code\262\365\365\327\t#\n\022code-value" +
      "-concept\020\006\032\013Observation\262\365\365\327\t \n\017code-valu" +
      "e-date\020\006\032\013Observation\262\365\365\327\t$\n\023code-value-" +
      "quantity\020\006\032\013Observation\262\365\365\327\t\"\n\021code-valu" +
      "e-string\020\006\032\013Observation\262\365\365\327\t=\n\ncombo-cod" +
      "e\020\004\032-Observation.code | Observation.comp" +
      "onent.code\262\365\365\327\tA\n\030combo-code-value-conce" +
      "pt\020\006\032#Observation | Observation.componen" +
      "t\262\365\365\327\tB\n\031combo-code-value-quantity\020\006\032#Ob" +
      "servation | Observation.component\262\365\365\327\tc\n" +
      "\030combo-data-absent-reason\020\004\032EObservation" +
      ".dataAbsentReason | Observation.componen" +
      "t.dataAbsentReason\262\365\365\327\tr\n\023combo-value-co" +
      "ncept\020\004\032Y(Observation.value as CodeableC" +
      "oncept) | (Observation.component.value a" +
      "s CodeableConcept)\262\365\365\327\t\272\001\n\024combo-value-q" +
      "uantity\020\007\032\237\001(Observation.value as Quanti" +
      "ty) | (Observation.value as SampledData)" +
      " | (Observation.component.value as Quant" +
      "ity) | (Observation.component.value as S" +
      "ampledData)\262\365\365\327\t.\n\016component-code\020\004\032\032Obs" +
      "ervation.component.code\262\365\365\327\t7\n\034component" +
      "-code-value-concept\020\006\032\025Observation.compo" +
      "nent\262\365\365\327\t8\n\035component-code-value-quantit" +
      "y\020\006\032\025Observation.component\262\365\365\327\tH\n\034compon" +
      "ent-data-absent-reason\020\004\032&Observation.co" +
      "mponent.dataAbsentReason\262\365\365\327\tM\n\027componen" +
      "t-value-concept\020\004\0320(Observation.componen" +
      "t.value as CodeableConcept)\262\365\365\327\tv\n\030compo" +
      "nent-value-quantity\020\007\032X(Observation.comp" +
      "onent.value as Quantity) | (Observation." +
      "component.value as SampledData)\262\365\365\327\t4\n\022d" +
      "ata-absent-reason\020\004\032\034Observation.dataAbs" +
      "entReason\262\365\365\327\t\227\003\n\004date\020\002\032\214\003AllergyIntole" +
      "rance.recordedDate | CarePlan.period | C" +
      "areTeam.period | ClinicalImpression.date" +
      " | Composition.date | Consent.dateTime |" +
      " DiagnosticReport.effective | Encounter." +
      "period | EpisodeOfCare.period | FamilyMe" +
      "mberHistory.date | Flag.period | Immuniz" +
      "ation.occurrence | List.date | Observati" +
      "on.effective | Procedure.performed | (Ri" +
      "skAssessment.occurrence as dateTime) | S" +
      "upplyRequest.authoredOn\262\365\365\327\t)\n\014derived-f" +
      "rom\020\005\032\027Observation.derivedFrom\262\365\365\327\t\036\n\006de" +
      "vice\020\005\032\022Observation.device\262\365\365\327\tp\n\013dna-va" +
      "riant\020\003\032_Observation.extension(\'http://h" +
      "l7.org/fhir/StructureDefinition/observat" +
      "ion-geneticsDnaVariant\')\262\365\365\327\t\302\002\n\tencount" +
      "er\020\005\032\262\002Composition.encounter | DeviceReq" +
      "uest.encounter | DiagnosticReport.encoun" +
      "ter | DocumentReference.context.encounte" +
      "r | Flag.encounter | List.encounter | Nu" +
      "tritionOrder.encounter | Observation.enc" +
      "ounter | Procedure.encounter | RiskAsses" +
      "sment.encounter | ServiceRequest.encount" +
      "er | VisionPrescription.encounter\262\365\365\327\t\034\n" +
      "\005focus\020\005\032\021Observation.focus\262\365\365\327\t\204\001\n\026gene" +
      "-amino-acid-change\020\003\032hObservation.extens" +
      "ion(\'http://hl7.org/fhir/StructureDefini" +
      "tion/observation-geneticsAminoAcidChange" +
      "Name\')\262\365\365\327\tt\n\017gene-dnavariant\020\003\032_Observa" +
      "tion.extension(\'http://hl7.org/fhir/Stru" +
      "ctureDefinition/observation-geneticsDnaV" +
      "ariant\')\262\365\365\327\tn\n\017gene-identifier\020\004\032YObser" +
      "vation.extension(\'http://hl7.org/fhir/St" +
      "ructureDefinition/observation-geneticsGe" +
      "ne\')\262\365\365\327\t%\n\nhas-member\020\005\032\025Observation.ha" +
      "sMember\262\365\365\327\t\205\007\n\nidentifier\020\004\032\364\006AllergyIn" +
      "tolerance.identifier | CarePlan.identifi" +
      "er | CareTeam.identifier | Composition.i" +
      "dentifier | Condition.identifier | Conse" +
      "nt.identifier | DetectedIssue.identifier" +
      " | DeviceRequest.identifier | Diagnostic" +
      "Report.identifier | DocumentManifest.mas" +
      "terIdentifier | DocumentManifest.identif" +
      "ier | DocumentReference.masterIdentifier" +
      " | DocumentReference.identifier | Encoun" +
      "ter.identifier | EpisodeOfCare.identifie" +
      "r | FamilyMemberHistory.identifier | Goa" +
      "l.identifier | ImagingStudy.identifier |" +
      " Immunization.identifier | List.identifi" +
      "er | MedicationAdministration.identifier" +
      " | MedicationDispense.identifier | Medic" +
      "ationRequest.identifier | MedicationStat" +
      "ement.identifier | NutritionOrder.identi" +
      "fier | Observation.identifier | Procedur" +
      "e.identifier | RiskAssessment.identifier" +
      " | ServiceRequest.identifier | SupplyDel" +
      "ivery.identifier | SupplyRequest.identif" +
      "ier | VisionPrescription.identifier\262\365\365\327\t" +
      "\036\n\006method\020\004\032\022Observation.method\262\365\365\327\t\037\n\007p" +
      "art-of\020\005\032\022Observation.partOf\262\365\365\327\t\370\n\n\007pat" +
      "ient\020\005\032\352\nAllergyIntolerance.patient | Ca" +
      "rePlan.subject.where(resolve() is Patien" +
      "t) | CareTeam.subject.where(resolve() is" +
      " Patient) | ClinicalImpression.subject.w" +
      "here(resolve() is Patient) | Composition" +
      ".subject.where(resolve() is Patient) | C" +
      "ondition.subject.where(resolve() is Pati" +
      "ent) | Consent.patient | DetectedIssue.p" +
      "atient | DeviceRequest.subject.where(res" +
      "olve() is Patient) | DeviceUseStatement." +
      "subject | DiagnosticReport.subject.where" +
      "(resolve() is Patient) | DocumentManifes" +
      "t.subject.where(resolve() is Patient) | " +
      "DocumentReference.subject.where(resolve(" +
      ") is Patient) | Encounter.subject.where(" +
      "resolve() is Patient) | EpisodeOfCare.pa" +
      "tient | FamilyMemberHistory.patient | Fl" +
      "ag.subject.where(resolve() is Patient) |" +
      " Goal.subject.where(resolve() is Patient" +
      ") | ImagingStudy.subject.where(resolve()" +
      " is Patient) | Immunization.patient | Li" +
      "st.subject.where(resolve() is Patient) |" +
      " MedicationAdministration.subject.where(" +
      "resolve() is Patient) | MedicationDispen" +
      "se.subject.where(resolve() is Patient) |" +
      " MedicationRequest.subject.where(resolve" +
      "() is Patient) | MedicationStatement.sub" +
      "ject.where(resolve() is Patient) | Nutri" +
      "tionOrder.patient | Observation.subject." +
      "where(resolve() is Patient) | Procedure." +
      "subject.where(resolve() is Patient) | Ri" +
      "skAssessment.subject.where(resolve() is " +
      "Patient) | ServiceRequest.subject.where(" +
      "resolve() is Patient) | SupplyDelivery.p" +
      "atient | VisionPrescription.patient\262\365\365\327\t" +
      "$\n\tperformer\020\005\032\025Observation.performer\262\365\365" +
      "\327\t\"\n\010specimen\020\005\032\024Observation.specimen\262\365\365" +
      "\327\t\036\n\006status\020\004\032\022Observation.status\262\365\365\327\t \n" +
      "\007subject\020\005\032\023Observation.subject\262\365\365\327\t9\n\rv" +
      "alue-concept\020\004\032&(Observation.value as Co" +
      "deableConcept)\262\365\365\327\tO\n\nvalue-date\020\002\032?(Obs" +
      "ervation.value as dateTime) | (Observati" +
      "on.value as Period)\262\365\365\327\tX\n\016value-quantit" +
      "y\020\007\032D(Observation.value as Quantity) | (" +
      "Observation.value as SampledData)\262\365\365\327\t]\n" +
      "\014value-string\020\003\032K(Observation.value as s" +
      "tring) | (Observation.value as CodeableC" +
      "oncept).textJ\004\010\007\020\010J\004\010\"\020#B!\n\027com.google.f" +
      "hir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Codes.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_ObservationHeadcircum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_ObservationHeadcircum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ObservationHeadcircum_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Identifier", "BasedOn", "PartOf", "Status", "Category", "Code", "Subject", "Focus", "Encounter", "Effective", "Issued", "Performer", "Value", "DataAbsentReason", "Interpretation", "Note", "BodySite", "Method", "Specimen", "Device", "ReferenceRange", "HasMember", "DerivedFrom", "Component", });
    internal_static_google_fhir_r4_core_ObservationHeadcircum_StatusCode_descriptor =
      internal_static_google_fhir_r4_core_ObservationHeadcircum_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ObservationHeadcircum_StatusCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ObservationHeadcircum_StatusCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_ObservationHeadcircum_CodeableConceptForCode_descriptor =
      internal_static_google_fhir_r4_core_ObservationHeadcircum_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_ObservationHeadcircum_CodeableConceptForCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ObservationHeadcircum_CodeableConceptForCode_descriptor,
        new java.lang.String[] { "Id", "Extension", "Coding", "Text", "HeadCircumCode", });
    internal_static_google_fhir_r4_core_ObservationHeadcircum_EffectiveX_descriptor =
      internal_static_google_fhir_r4_core_ObservationHeadcircum_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_ObservationHeadcircum_EffectiveX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ObservationHeadcircum_EffectiveX_descriptor,
        new java.lang.String[] { "DateTime", "Period", "Choice", });
    internal_static_google_fhir_r4_core_ObservationHeadcircum_ValueX_descriptor =
      internal_static_google_fhir_r4_core_ObservationHeadcircum_descriptor.getNestedTypes().get(3);
    internal_static_google_fhir_r4_core_ObservationHeadcircum_ValueX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ObservationHeadcircum_ValueX_descriptor,
        new java.lang.String[] { "Quantity", "Choice", });
    internal_static_google_fhir_r4_core_ObservationHeadcircum_ReferenceRange_descriptor =
      internal_static_google_fhir_r4_core_ObservationHeadcircum_descriptor.getNestedTypes().get(4);
    internal_static_google_fhir_r4_core_ObservationHeadcircum_ReferenceRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ObservationHeadcircum_ReferenceRange_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Low", "High", "Type", "AppliesTo", "Age", "Text", });
    internal_static_google_fhir_r4_core_ObservationHeadcircum_Component_descriptor =
      internal_static_google_fhir_r4_core_ObservationHeadcircum_descriptor.getNestedTypes().get(5);
    internal_static_google_fhir_r4_core_ObservationHeadcircum_Component_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ObservationHeadcircum_Component_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Code", "Value", "DataAbsentReason", "Interpretation", "ReferenceRange", });
    internal_static_google_fhir_r4_core_ObservationHeadcircum_Component_ValueX_descriptor =
      internal_static_google_fhir_r4_core_ObservationHeadcircum_Component_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ObservationHeadcircum_Component_ValueX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ObservationHeadcircum_Component_ValueX_descriptor,
        new java.lang.String[] { "Quantity", "CodeableConcept", "StringValue", "Boolean", "Integer", "Range", "Ratio", "SampledData", "Time", "DateTime", "Period", "Choice", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirInlinedCodingCode);
    registry.add(com.google.fhir.proto.Annotations.fhirInlinedCodingSystem);
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
