// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/profiles/device_metric_observation_profile.proto

package com.google.fhir.r4.core;

public final class DeviceMetricObservationProfileOuterClass {
  private DeviceMetricObservationProfileOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_StatusCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_EffectiveX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_EffectiveX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ValueX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ValueX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ReferenceRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ReferenceRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_ValueX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_ValueX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nPproto/google/fhir/proto/r4/core/profil" +
      "es/device_metric_observation_profile.pro" +
      "to\022\023google.fhir.r4.core\032\031google/protobuf" +
      "/any.proto\032)proto/google/fhir/proto/anno" +
      "tations.proto\032+proto/google/fhir/proto/r" +
      "4/core/codes.proto\032/proto/google/fhir/pr" +
      "oto/r4/core/datatypes.proto\"\350W\n\036DeviceMe" +
      "tricObservationProfile\022#\n\002id\030\001 \001(\0132\027.goo" +
      "gle.fhir.r4.core.Id\022\'\n\004meta\030\002 \001(\0132\031.goog" +
      "le.fhir.r4.core.Meta\0220\n\016implicit_rules\030\003" +
      " \001(\0132\030.google.fhir.r4.core.Uri\022+\n\010langua" +
      "ge\030\004 \001(\0132\031.google.fhir.r4.core.Code\022,\n\004t" +
      "ext\030\005 \001(\0132\036.google.fhir.r4.core.Narrativ" +
      "e\022\'\n\tcontained\030\006 \003(\0132\024.google.protobuf.A" +
      "ny\0221\n\textension\030\010 \003(\0132\036.google.fhir.r4.c" +
      "ore.Extension\022:\n\022modifier_extension\030\t \003(" +
      "\0132\036.google.fhir.r4.core.Extension\0223\n\nide" +
      "ntifier\030\n \003(\0132\037.google.fhir.r4.core.Iden" +
      "tifier\022\263\001\n\010based_on\030\013 \003(\0132\036.google.fhir." +
      "r4.core.ReferenceB\200\001\362\377\374\302\006\010CarePlan\362\377\374\302\006\r" +
      "DeviceRequest\362\377\374\302\006\032ImmunizationRecommend" +
      "ation\362\377\374\302\006\021MedicationRequest\362\377\374\302\006\016Nutrit" +
      "ionOrder\362\377\374\302\006\016ServiceRequest\022\264\001\n\007part_of" +
      "\030\014 \003(\0132\036.google.fhir.r4.core.ReferenceB\202" +
      "\001\362\377\374\302\006\030MedicationAdministration\362\377\374\302\006\022Med" +
      "icationDispense\362\377\374\302\006\023MedicationStatement" +
      "\362\377\374\302\006\tProcedure\362\377\374\302\006\014Immunization\362\377\374\302\006\014I" +
      "magingStudy\022V\n\006status\030\r \001(\0132>.google.fhi" +
      "r.r4.core.DeviceMetricObservationProfile" +
      ".StatusCodeB\006\360\320\207\353\004\001\0226\n\010category\030\016 \003(\0132$." +
      "google.fhir.r4.core.CodeableConcept\022:\n\004c" +
      "ode\030\017 \001(\0132$.google.fhir.r4.core.Codeable" +
      "ConceptB\006\360\320\207\353\004\001\022P\n\007subject\030\020 \001(\0132\036.googl" +
      "e.fhir.r4.core.ReferenceB\037\360\320\207\353\004\001\362\377\374\302\006\007Pa" +
      "tient\362\377\374\302\006\006Device\022=\n\005focus\030\021 \003(\0132\036.googl" +
      "e.fhir.r4.core.ReferenceB\016\362\377\374\302\006\010Resource" +
      "\022Y\n\teffective\030\023 \001(\0132>.google.fhir.r4.cor" +
      "e.DeviceMetricObservationProfile.Effecti" +
      "veXB\006\360\320\207\353\004\001\022\233\001\n\tperformer\030\025 \003(\0132\036.google" +
      ".fhir.r4.core.ReferenceBh\362\377\374\302\006\014Practitio" +
      "ner\362\377\374\302\006\020PractitionerRole\362\377\374\302\006\014Organizat" +
      "ion\362\377\374\302\006\010CareTeam\362\377\374\302\006\007Patient\362\377\374\302\006\rRela" +
      "tedPerson\022I\n\005value\030\026 \001(\0132:.google.fhir.r" +
      "4.core.DeviceMetricObservationProfile.Va" +
      "lueX\022<\n\016interpretation\030\030 \001(\0132$.google.fh" +
      "ir.r4.core.CodeableConcept\022-\n\004note\030\031 \003(\013" +
      "2\037.google.fhir.r4.core.Annotation\0227\n\tbod" +
      "y_site\030\032 \001(\0132$.google.fhir.r4.core.Codea" +
      "bleConcept\0224\n\006method\030\033 \001(\0132$.google.fhir" +
      ".r4.core.CodeableConcept\022H\n\006device\030\035 \001(\013" +
      "2\036.google.fhir.r4.core.ReferenceB\030\360\320\207\353\004\001" +
      "\362\377\374\302\006\014DeviceMetric\022[\n\017reference_range\030\036 " +
      "\001(\0132B.google.fhir.r4.core.DeviceMetricOb" +
      "servationProfile.ReferenceRange\022E\n\nhas_m" +
      "ember\030\037 \003(\0132\036.google.fhir.r4.core.Refere" +
      "nceB\021\362\377\374\302\006\013Observation\022G\n\014derived_from\030 " +
      " \003(\0132\036.google.fhir.r4.core.ReferenceB\021\362\377" +
      "\374\302\006\013Observation\022P\n\tcomponent\030! \003(\0132=.goo" +
      "gle.fhir.r4.core.DeviceMetricObservation" +
      "Profile.Component\032\230\002\n\nStatusCode\022?\n\005valu" +
      "e\030\001 \001(\01620.google.fhir.r4.core.Observatio" +
      "nStatusCode.Value\022\'\n\002id\030\002 \001(\0132\033.google.f" +
      "hir.r4.core.String\0221\n\textension\030\003 \003(\0132\036." +
      "google.fhir.r4.core.Extension:m\300\237\343\266\005\001\212\371\203" +
      "\262\005/http://hl7.org/fhir/ValueSet/observat" +
      "ion-status\232\265\216\223\006,http://hl7.org/fhir/Stru" +
      "ctureDefinition/code\032R\n\nEffectiveX\0222\n\tda" +
      "te_time\030\001 \001(\0132\035.google.fhir.r4.core.Date" +
      "TimeH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\356\003\n\006ValueX\0221\n\010q" +
      "uantity\030\001 \001(\0132\035.google.fhir.r4.core.Quan" +
      "tityH\000\022@\n\020codeable_concept\030\002 \001(\0132$.googl" +
      "e.fhir.r4.core.CodeableConceptH\000\022;\n\014stri" +
      "ng_value\030\003 \001(\0132\033.google.fhir.r4.core.Str" +
      "ingH\000R\006string\022+\n\005range\030\006 \001(\0132\032.google.fh" +
      "ir.r4.core.RangeH\000\022+\n\005ratio\030\007 \001(\0132\032.goog" +
      "le.fhir.r4.core.RatioH\000\0228\n\014sampled_data\030" +
      "\010 \001(\0132 .google.fhir.r4.core.SampledDataH" +
      "\000\022)\n\004time\030\t \001(\0132\031.google.fhir.r4.core.Ti" +
      "meH\000\0222\n\tdate_time\030\n \001(\0132\035.google.fhir.r4" +
      ".core.DateTimeH\000\022-\n\006period\030\013 \001(\0132\033.googl" +
      "e.fhir.r4.core.PeriodH\000:\006\240\203\203\350\006\001B\010\n\006choic" +
      "e\032\205\004\n\016ReferenceRange\022\'\n\002id\030\001 \001(\0132\033.googl" +
      "e.fhir.r4.core.String\0221\n\textension\030\002 \003(\013" +
      "2\036.google.fhir.r4.core.Extension\022:\n\022modi" +
      "fier_extension\030\003 \003(\0132\036.google.fhir.r4.co" +
      "re.Extension\0220\n\003low\030\004 \001(\0132#.google.fhir." +
      "r4.core.SimpleQuantity\0221\n\004high\030\005 \001(\0132#.g" +
      "oogle.fhir.r4.core.SimpleQuantity\0222\n\004typ" +
      "e\030\006 \001(\0132$.google.fhir.r4.core.CodeableCo" +
      "ncept\0228\n\napplies_to\030\007 \003(\0132$.google.fhir." +
      "r4.core.CodeableConcept\022\'\n\003age\030\010 \001(\0132\032.g" +
      "oogle.fhir.r4.core.Range\022)\n\004text\030\t \001(\0132\033" +
      ".google.fhir.r4.core.String:4\232\206\223\240\010.low.e" +
      "xists() or high.exists() or text.exists(" +
      ")\032\344\010\n\tComponent\022\'\n\002id\030\001 \001(\0132\033.google.fhi" +
      "r.r4.core.String\0221\n\textension\030\002 \003(\0132\036.go" +
      "ogle.fhir.r4.core.Extension\022:\n\022modifier_" +
      "extension\030\003 \003(\0132\036.google.fhir.r4.core.Ex" +
      "tension\022:\n\004code\030\004 \001(\0132$.google.fhir.r4.c" +
      "ore.CodeableConceptB\006\360\320\207\353\004\001\022S\n\005value\030\005 \001" +
      "(\0132D.google.fhir.r4.core.DeviceMetricObs" +
      "ervationProfile.Component.ValueX\022@\n\022data" +
      "_absent_reason\030\006 \001(\0132$.google.fhir.r4.co" +
      "re.CodeableConcept\022<\n\016interpretation\030\007 \003" +
      "(\0132$.google.fhir.r4.core.CodeableConcept" +
      "\022[\n\017reference_range\030\010 \003(\0132B.google.fhir." +
      "r4.core.DeviceMetricObservationProfile.R" +
      "eferenceRange\032\320\004\n\006ValueX\0221\n\010quantity\030\001 \001" +
      "(\0132\035.google.fhir.r4.core.QuantityH\000\022@\n\020c" +
      "odeable_concept\030\002 \001(\0132$.google.fhir.r4.c" +
      "ore.CodeableConceptH\000\022;\n\014string_value\030\003 " +
      "\001(\0132\033.google.fhir.r4.core.StringH\000R\006stri" +
      "ng\022/\n\007boolean\030\004 \001(\0132\034.google.fhir.r4.cor" +
      "e.BooleanH\000\022/\n\007integer\030\005 \001(\0132\034.google.fh" +
      "ir.r4.core.IntegerH\000\022+\n\005range\030\006 \001(\0132\032.go" +
      "ogle.fhir.r4.core.RangeH\000\022+\n\005ratio\030\007 \001(\013" +
      "2\032.google.fhir.r4.core.RatioH\000\0228\n\014sample" +
      "d_data\030\010 \001(\0132 .google.fhir.r4.core.Sampl" +
      "edDataH\000\022)\n\004time\030\t \001(\0132\031.google.fhir.r4." +
      "core.TimeH\000\0222\n\tdate_time\030\n \001(\0132\035.google." +
      "fhir.r4.core.DateTimeH\000\022-\n\006period\030\013 \001(\0132" +
      "\033.google.fhir.r4.core.PeriodH\000:\006\240\203\203\350\006\001B\010" +
      "\n\006choice:\2753\300\237\343\266\005\003\232\265\216\223\0063http://hl7.org/fh" +
      "ir/StructureDefinition/Observation\262\376\344\227\006?" +
      "http://hl7.org/fhir/StructureDefinition/" +
      "devicemetricobservation\232\206\223\240\010)dataAbsentR" +
      "eason.empty() or value.empty()\232\206\223\240\010_valu" +
      "e.empty() or component.code.where(coding" +
      ".intersect(%resource.code.coding).exists" +
      "()).empty()\262\365\365\327\t\177\n\021amino-acid-change\020\003\032h" +
      "Observation.extension(\'http://hl7.org/fh" +
      "ir/StructureDefinition/observation-genet" +
      "icsAminoAcidChangeName\')\262\365\365\327\t!\n\010based-on" +
      "\020\005\032\023Observation.basedOn\262\365\365\327\t\"\n\010category\020" +
      "\004\032\024Observation.category\262\365\365\327\t\364\003\n\004code\020\004\032\351" +
      "\003AllergyIntolerance.code | AllergyIntole" +
      "rance.reaction.substance | Condition.cod" +
      "e | (DeviceRequest.code as CodeableConce" +
      "pt) | DiagnosticReport.code | FamilyMemb" +
      "erHistory.condition.code | List.code | M" +
      "edication.code | (MedicationAdministrati" +
      "on.medication as CodeableConcept) | (Med" +
      "icationDispense.medication as CodeableCo" +
      "ncept) | (MedicationRequest.medication a" +
      "s CodeableConcept) | (MedicationStatemen" +
      "t.medication as CodeableConcept) | Obser" +
      "vation.code | Procedure.code | ServiceRe" +
      "quest.code\262\365\365\327\t#\n\022code-value-concept\020\006\032\013" +
      "Observation\262\365\365\327\t \n\017code-value-date\020\006\032\013Ob" +
      "servation\262\365\365\327\t$\n\023code-value-quantity\020\006\032\013" +
      "Observation\262\365\365\327\t\"\n\021code-value-string\020\006\032\013" +
      "Observation\262\365\365\327\t=\n\ncombo-code\020\004\032-Observa" +
      "tion.code | Observation.component.code\262\365" +
      "\365\327\tA\n\030combo-code-value-concept\020\006\032#Observ" +
      "ation | Observation.component\262\365\365\327\tB\n\031com" +
      "bo-code-value-quantity\020\006\032#Observation | " +
      "Observation.component\262\365\365\327\tc\n\030combo-data-" +
      "absent-reason\020\004\032EObservation.dataAbsentR" +
      "eason | Observation.component.dataAbsent" +
      "Reason\262\365\365\327\tr\n\023combo-value-concept\020\004\032Y(Ob" +
      "servation.value as CodeableConcept) | (O" +
      "bservation.component.value as CodeableCo" +
      "ncept)\262\365\365\327\t\272\001\n\024combo-value-quantity\020\007\032\237\001" +
      "(Observation.value as Quantity) | (Obser" +
      "vation.value as SampledData) | (Observat" +
      "ion.component.value as Quantity) | (Obse" +
      "rvation.component.value as SampledData)\262" +
      "\365\365\327\t.\n\016component-code\020\004\032\032Observation.com" +
      "ponent.code\262\365\365\327\t7\n\034component-code-value-" +
      "concept\020\006\032\025Observation.component\262\365\365\327\t8\n\035" +
      "component-code-value-quantity\020\006\032\025Observa" +
      "tion.component\262\365\365\327\tH\n\034component-data-abs" +
      "ent-reason\020\004\032&Observation.component.data" +
      "AbsentReason\262\365\365\327\tM\n\027component-value-conc" +
      "ept\020\004\0320(Observation.component.value as C" +
      "odeableConcept)\262\365\365\327\tv\n\030component-value-q" +
      "uantity\020\007\032X(Observation.component.value " +
      "as Quantity) | (Observation.component.va" +
      "lue as SampledData)\262\365\365\327\t4\n\022data-absent-r" +
      "eason\020\004\032\034Observation.dataAbsentReason\262\365\365" +
      "\327\t\227\003\n\004date\020\002\032\214\003AllergyIntolerance.record" +
      "edDate | CarePlan.period | CareTeam.peri" +
      "od | ClinicalImpression.date | Compositi" +
      "on.date | Consent.dateTime | DiagnosticR" +
      "eport.effective | Encounter.period | Epi" +
      "sodeOfCare.period | FamilyMemberHistory." +
      "date | Flag.period | Immunization.occurr" +
      "ence | List.date | Observation.effective" +
      " | Procedure.performed | (RiskAssessment" +
      ".occurrence as dateTime) | SupplyRequest" +
      ".authoredOn\262\365\365\327\t)\n\014derived-from\020\005\032\027Obser" +
      "vation.derivedFrom\262\365\365\327\t\036\n\006device\020\005\032\022Obse" +
      "rvation.device\262\365\365\327\tp\n\013dna-variant\020\003\032_Obs" +
      "ervation.extension(\'http://hl7.org/fhir/" +
      "StructureDefinition/observation-genetics" +
      "DnaVariant\')\262\365\365\327\t\302\002\n\tencounter\020\005\032\262\002Compo" +
      "sition.encounter | DeviceRequest.encount" +
      "er | DiagnosticReport.encounter | Docume" +
      "ntReference.context.encounter | Flag.enc" +
      "ounter | List.encounter | NutritionOrder" +
      ".encounter | Observation.encounter | Pro" +
      "cedure.encounter | RiskAssessment.encoun" +
      "ter | ServiceRequest.encounter | VisionP" +
      "rescription.encounter\262\365\365\327\t\034\n\005focus\020\005\032\021Ob" +
      "servation.focus\262\365\365\327\t\204\001\n\026gene-amino-acid-" +
      "change\020\003\032hObservation.extension(\'http://" +
      "hl7.org/fhir/StructureDefinition/observa" +
      "tion-geneticsAminoAcidChangeName\')\262\365\365\327\tt" +
      "\n\017gene-dnavariant\020\003\032_Observation.extensi" +
      "on(\'http://hl7.org/fhir/StructureDefinit" +
      "ion/observation-geneticsDnaVariant\')\262\365\365\327" +
      "\tn\n\017gene-identifier\020\004\032YObservation.exten" +
      "sion(\'http://hl7.org/fhir/StructureDefin" +
      "ition/observation-geneticsGene\')\262\365\365\327\t%\n\n" +
      "has-member\020\005\032\025Observation.hasMember\262\365\365\327\t" +
      "\205\007\n\nidentifier\020\004\032\364\006AllergyIntolerance.id" +
      "entifier | CarePlan.identifier | CareTea" +
      "m.identifier | Composition.identifier | " +
      "Condition.identifier | Consent.identifie" +
      "r | DetectedIssue.identifier | DeviceReq" +
      "uest.identifier | DiagnosticReport.ident" +
      "ifier | DocumentManifest.masterIdentifie" +
      "r | DocumentManifest.identifier | Docume" +
      "ntReference.masterIdentifier | DocumentR" +
      "eference.identifier | Encounter.identifi" +
      "er | EpisodeOfCare.identifier | FamilyMe" +
      "mberHistory.identifier | Goal.identifier" +
      " | ImagingStudy.identifier | Immunizatio" +
      "n.identifier | List.identifier | Medicat" +
      "ionAdministration.identifier | Medicatio" +
      "nDispense.identifier | MedicationRequest" +
      ".identifier | MedicationStatement.identi" +
      "fier | NutritionOrder.identifier | Obser" +
      "vation.identifier | Procedure.identifier" +
      " | RiskAssessment.identifier | ServiceRe" +
      "quest.identifier | SupplyDelivery.identi" +
      "fier | SupplyRequest.identifier | Vision" +
      "Prescription.identifier\262\365\365\327\t\036\n\006method\020\004\032" +
      "\022Observation.method\262\365\365\327\t\037\n\007part-of\020\005\032\022Ob" +
      "servation.partOf\262\365\365\327\t\370\n\n\007patient\020\005\032\352\nAll" +
      "ergyIntolerance.patient | CarePlan.subje" +
      "ct.where(resolve() is Patient) | CareTea" +
      "m.subject.where(resolve() is Patient) | " +
      "ClinicalImpression.subject.where(resolve" +
      "() is Patient) | Composition.subject.whe" +
      "re(resolve() is Patient) | Condition.sub" +
      "ject.where(resolve() is Patient) | Conse" +
      "nt.patient | DetectedIssue.patient | Dev" +
      "iceRequest.subject.where(resolve() is Pa" +
      "tient) | DeviceUseStatement.subject | Di" +
      "agnosticReport.subject.where(resolve() i" +
      "s Patient) | DocumentManifest.subject.wh" +
      "ere(resolve() is Patient) | DocumentRefe" +
      "rence.subject.where(resolve() is Patient" +
      ") | Encounter.subject.where(resolve() is" +
      " Patient) | EpisodeOfCare.patient | Fami" +
      "lyMemberHistory.patient | Flag.subject.w" +
      "here(resolve() is Patient) | Goal.subjec" +
      "t.where(resolve() is Patient) | ImagingS" +
      "tudy.subject.where(resolve() is Patient)" +
      " | Immunization.patient | List.subject.w" +
      "here(resolve() is Patient) | MedicationA" +
      "dministration.subject.where(resolve() is" +
      " Patient) | MedicationDispense.subject.w" +
      "here(resolve() is Patient) | MedicationR" +
      "equest.subject.where(resolve() is Patien" +
      "t) | MedicationStatement.subject.where(r" +
      "esolve() is Patient) | NutritionOrder.pa" +
      "tient | Observation.subject.where(resolv" +
      "e() is Patient) | Procedure.subject.wher" +
      "e(resolve() is Patient) | RiskAssessment" +
      ".subject.where(resolve() is Patient) | S" +
      "erviceRequest.subject.where(resolve() is" +
      " Patient) | SupplyDelivery.patient | Vis" +
      "ionPrescription.patient\262\365\365\327\t$\n\tperformer" +
      "\020\005\032\025Observation.performer\262\365\365\327\t\"\n\010specime" +
      "n\020\005\032\024Observation.specimen\262\365\365\327\t\036\n\006status\020" +
      "\004\032\022Observation.status\262\365\365\327\t \n\007subject\020\005\032\023" +
      "Observation.subject\262\365\365\327\t9\n\rvalue-concept" +
      "\020\004\032&(Observation.value as CodeableConcep" +
      "t)\262\365\365\327\tO\n\nvalue-date\020\002\032?(Observation.val" +
      "ue as dateTime) | (Observation.value as " +
      "Period)\262\365\365\327\tX\n\016value-quantity\020\007\032D(Observ" +
      "ation.value as Quantity) | (Observation." +
      "value as SampledData)\262\365\365\327\t]\n\014value-strin" +
      "g\020\003\032K(Observation.value as string) | (Ob" +
      "servation.value as CodeableConcept).text" +
      "J\004\010\007\020\010J\004\010\022\020\023J\004\010\024\020\025J\004\010\027\020\030J\004\010\034\020\035B!\n\027com.go" +
      "ogle.fhir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Codes.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Identifier", "BasedOn", "PartOf", "Status", "Category", "Code", "Subject", "Focus", "Effective", "Performer", "Value", "Interpretation", "Note", "BodySite", "Method", "Device", "ReferenceRange", "HasMember", "DerivedFrom", "Component", });
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_StatusCode_descriptor =
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_StatusCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_StatusCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_EffectiveX_descriptor =
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_EffectiveX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_EffectiveX_descriptor,
        new java.lang.String[] { "DateTime", "Choice", });
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ValueX_descriptor =
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ValueX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ValueX_descriptor,
        new java.lang.String[] { "Quantity", "CodeableConcept", "StringValue", "Range", "Ratio", "SampledData", "Time", "DateTime", "Period", "Choice", });
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ReferenceRange_descriptor =
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_descriptor.getNestedTypes().get(3);
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ReferenceRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_ReferenceRange_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Low", "High", "Type", "AppliesTo", "Age", "Text", });
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_descriptor =
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_descriptor.getNestedTypes().get(4);
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Code", "Value", "DataAbsentReason", "Interpretation", "ReferenceRange", });
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_ValueX_descriptor =
      internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_ValueX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_DeviceMetricObservationProfile_Component_ValueX_descriptor,
        new java.lang.String[] { "Quantity", "CodeableConcept", "StringValue", "Boolean", "Integer", "Range", "Ratio", "SampledData", "Time", "DateTime", "Period", "Choice", });
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
