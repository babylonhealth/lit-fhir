// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/nutrition_order.proto

package com.google.fhir.r4.core;

public final class NutritionOrderOuterClass {
  private NutritionOrderOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_NutritionOrder_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_NutritionOrder_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_NutritionOrder_StatusCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_NutritionOrder_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_NutritionOrder_IntentCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_NutritionOrder_IntentCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_NutritionOrder_OralDiet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_NutritionOrder_OralDiet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_NutritionOrder_OralDiet_Nutrient_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_NutritionOrder_OralDiet_Nutrient_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_NutritionOrder_OralDiet_Texture_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_NutritionOrder_OralDiet_Texture_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_NutritionOrder_Supplement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_NutritionOrder_Supplement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_NutritionOrder_EnteralFormula_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_NutritionOrder_EnteralFormula_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_NutritionOrder_EnteralFormula_Administration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_NutritionOrder_EnteralFormula_Administration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_NutritionOrder_EnteralFormula_Administration_RateX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_NutritionOrder_EnteralFormula_Administration_RateX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?proto/google/fhir/proto/r4/core/resour" +
      "ces/nutrition_order.proto\022\023google.fhir.r" +
      "4.core\032\031google/protobuf/any.proto\032)proto" +
      "/google/fhir/proto/annotations.proto\032+pr" +
      "oto/google/fhir/proto/r4/core/codes.prot" +
      "o\032/proto/google/fhir/proto/r4/core/datat" +
      "ypes.proto\"\342>\n\016NutritionOrder\022#\n\002id\030\001 \001(" +
      "\0132\027.google.fhir.r4.core.Id\022\'\n\004meta\030\002 \001(\013" +
      "2\031.google.fhir.r4.core.Meta\0220\n\016implicit_" +
      "rules\030\003 \001(\0132\030.google.fhir.r4.core.Uri\022+\n" +
      "\010language\030\004 \001(\0132\031.google.fhir.r4.core.Co" +
      "de\022,\n\004text\030\005 \001(\0132\036.google.fhir.r4.core.N" +
      "arrative\022\'\n\tcontained\030\006 \003(\0132\024.google.pro" +
      "tobuf.Any\0221\n\textension\030\010 \003(\0132\036.google.fh" +
      "ir.r4.core.Extension\022:\n\022modifier_extensi" +
      "on\030\t \003(\0132\036.google.fhir.r4.core.Extension" +
      "\0223\n\nidentifier\030\n \003(\0132\037.google.fhir.r4.co" +
      "re.Identifier\022>\n\026instantiates_canonical\030" +
      "\013 \003(\0132\036.google.fhir.r4.core.Canonical\0222\n" +
      "\020instantiates_uri\030\014 \003(\0132\030.google.fhir.r4" +
      ".core.Uri\022.\n\014instantiates\030\r \003(\0132\030.google" +
      ".fhir.r4.core.Uri\022F\n\006status\030\016 \001(\0132..goog" +
      "le.fhir.r4.core.NutritionOrder.StatusCod" +
      "eB\006\360\320\207\353\004\001\022F\n\006intent\030\017 \001(\0132..google.fhir." +
      "r4.core.NutritionOrder.IntentCodeB\006\360\320\207\353\004" +
      "\001\022D\n\007patient\030\020 \001(\0132\036.google.fhir.r4.core" +
      ".ReferenceB\023\360\320\207\353\004\001\362\377\374\302\006\007Patient\022B\n\tencou" +
      "nter\030\021 \001(\0132\036.google.fhir.r4.core.Referen" +
      "ceB\017\362\377\374\302\006\tEncounter\0228\n\tdate_time\030\022 \001(\0132\035" +
      ".google.fhir.r4.core.DateTimeB\006\360\320\207\353\004\001\022Y\n" +
      "\007orderer\030\023 \001(\0132\036.google.fhir.r4.core.Ref" +
      "erenceB(\362\377\374\302\006\014Practitioner\362\377\374\302\006\020Practiti" +
      "onerRole\022U\n\023allergy_intolerance\030\024 \003(\0132\036." +
      "google.fhir.r4.core.ReferenceB\030\362\377\374\302\006\022All" +
      "ergyIntolerance\022F\n\030food_preference_modif" +
      "ier\030\025 \003(\0132$.google.fhir.r4.core.Codeable" +
      "Concept\022C\n\025exclude_food_modifier\030\026 \003(\0132$" +
      ".google.fhir.r4.core.CodeableConcept\022?\n\t" +
      "oral_diet\030\027 \001(\0132,.google.fhir.r4.core.Nu" +
      "tritionOrder.OralDiet\022B\n\nsupplement\030\030 \003(" +
      "\0132..google.fhir.r4.core.NutritionOrder.S" +
      "upplement\022K\n\017enteral_formula\030\031 \001(\01322.goo" +
      "gle.fhir.r4.core.NutritionOrder.EnteralF" +
      "ormula\022-\n\004note\030\032 \003(\0132\037.google.fhir.r4.co" +
      "re.Annotation\032\220\002\n\nStatusCode\022;\n\005value\030\001 " +
      "\001(\0162,.google.fhir.r4.core.RequestStatusC" +
      "ode.Value\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4.c" +
      "ore.String\0221\n\textension\030\003 \003(\0132\036.google.f" +
      "hir.r4.core.Extension:i\300\237\343\266\005\001\212\371\203\262\005+http:" +
      "//hl7.org/fhir/ValueSet/request-status\232\265" +
      "\216\223\006,http://hl7.org/fhir/StructureDefinit" +
      "ion/code\032\220\002\n\nIntentCode\022;\n\005value\030\001 \001(\0162," +
      ".google.fhir.r4.core.RequestIntentCode.V" +
      "alue\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4.core.S" +
      "tring\0221\n\textension\030\003 \003(\0132\036.google.fhir.r" +
      "4.core.Extension:i\300\237\343\266\005\001\212\371\203\262\005+http://hl7" +
      ".org/fhir/ValueSet/request-intent\232\265\216\223\006,h" +
      "ttp://hl7.org/fhir/StructureDefinition/c" +
      "ode\032\264\010\n\010OralDiet\022\'\n\002id\030\001 \001(\0132\033.google.fh" +
      "ir.r4.core.String\0221\n\textension\030\002 \003(\0132\036.g" +
      "oogle.fhir.r4.core.Extension\022:\n\022modifier" +
      "_extension\030\003 \003(\0132\036.google.fhir.r4.core.E" +
      "xtension\0222\n\004type\030\004 \003(\0132$.google.fhir.r4." +
      "core.CodeableConcept\022-\n\010schedule\030\005 \003(\0132\033" +
      ".google.fhir.r4.core.Timing\022G\n\010nutrient\030" +
      "\006 \003(\01325.google.fhir.r4.core.NutritionOrd" +
      "er.OralDiet.Nutrient\022E\n\007texture\030\007 \003(\01324." +
      "google.fhir.r4.core.NutritionOrder.OralD" +
      "iet.Texture\022D\n\026fluid_consistency_type\030\010 " +
      "\003(\0132$.google.fhir.r4.core.CodeableConcep" +
      "t\0220\n\013instruction\030\t \001(\0132\033.google.fhir.r4." +
      "core.String\032\217\002\n\010Nutrient\022\'\n\002id\030\001 \001(\0132\033.g" +
      "oogle.fhir.r4.core.String\0221\n\textension\030\002" +
      " \003(\0132\036.google.fhir.r4.core.Extension\022:\n\022" +
      "modifier_extension\030\003 \003(\0132\036.google.fhir.r" +
      "4.core.Extension\0226\n\010modifier\030\004 \001(\0132$.goo" +
      "gle.fhir.r4.core.CodeableConcept\0223\n\006amou" +
      "nt\030\005 \001(\0132#.google.fhir.r4.core.SimpleQua" +
      "ntity\032\222\002\n\007Texture\022\'\n\002id\030\001 \001(\0132\033.google.f" +
      "hir.r4.core.String\0221\n\textension\030\002 \003(\0132\036." +
      "google.fhir.r4.core.Extension\022:\n\022modifie" +
      "r_extension\030\003 \003(\0132\036.google.fhir.r4.core." +
      "Extension\0226\n\010modifier\030\004 \001(\0132$.google.fhi" +
      "r.r4.core.CodeableConcept\0227\n\tfood_type\030\005" +
      " \001(\0132$.google.fhir.r4.core.CodeableConce" +
      "pt\032\243\003\n\nSupplement\022\'\n\002id\030\001 \001(\0132\033.google.f" +
      "hir.r4.core.String\0221\n\textension\030\002 \003(\0132\036." +
      "google.fhir.r4.core.Extension\022:\n\022modifie" +
      "r_extension\030\003 \003(\0132\036.google.fhir.r4.core." +
      "Extension\0222\n\004type\030\004 \001(\0132$.google.fhir.r4" +
      ".core.CodeableConcept\0221\n\014product_name\030\005 " +
      "\001(\0132\033.google.fhir.r4.core.String\022-\n\010sche" +
      "dule\030\006 \003(\0132\033.google.fhir.r4.core.Timing\022" +
      "5\n\010quantity\030\007 \001(\0132#.google.fhir.r4.core." +
      "SimpleQuantity\0220\n\013instruction\030\010 \001(\0132\033.go" +
      "ogle.fhir.r4.core.String\032\357\t\n\016EnteralForm" +
      "ula\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.core.St" +
      "ring\0221\n\textension\030\002 \003(\0132\036.google.fhir.r4" +
      ".core.Extension\022:\n\022modifier_extension\030\003 " +
      "\003(\0132\036.google.fhir.r4.core.Extension\022?\n\021b" +
      "ase_formula_type\030\004 \001(\0132$.google.fhir.r4." +
      "core.CodeableConcept\022>\n\031base_formula_pro" +
      "duct_name\030\005 \001(\0132\033.google.fhir.r4.core.St" +
      "ring\022;\n\radditive_type\030\006 \001(\0132$.google.fhi" +
      "r.r4.core.CodeableConcept\022:\n\025additive_pr" +
      "oduct_name\030\007 \001(\0132\033.google.fhir.r4.core.S" +
      "tring\022<\n\017caloric_density\030\010 \001(\0132#.google." +
      "fhir.r4.core.SimpleQuantity\022D\n\026routeof_a" +
      "dministration\030\t \001(\0132$.google.fhir.r4.cor" +
      "e.CodeableConcept\022Y\n\016administration\030\n \003(" +
      "\0132A.google.fhir.r4.core.NutritionOrder.E" +
      "nteralFormula.Administration\022B\n\025max_volu" +
      "me_to_deliver\030\013 \001(\0132#.google.fhir.r4.cor" +
      "e.SimpleQuantity\022?\n\032administration_instr" +
      "uction\030\014 \001(\0132\033.google.fhir.r4.core.Strin" +
      "g\032\346\003\n\016Administration\022\'\n\002id\030\001 \001(\0132\033.googl" +
      "e.fhir.r4.core.String\0221\n\textension\030\002 \003(\013" +
      "2\036.google.fhir.r4.core.Extension\022:\n\022modi" +
      "fier_extension\030\003 \003(\0132\036.google.fhir.r4.co" +
      "re.Extension\022-\n\010schedule\030\004 \001(\0132\033.google." +
      "fhir.r4.core.Timing\0225\n\010quantity\030\005 \001(\0132#." +
      "google.fhir.r4.core.SimpleQuantity\022U\n\004ra" +
      "te\030\006 \001(\0132G.google.fhir.r4.core.Nutrition" +
      "Order.EnteralFormula.Administration.Rate" +
      "X\032\177\n\005RateX\0227\n\010quantity\030\001 \001(\0132#.google.fh" +
      "ir.r4.core.SimpleQuantityH\000\022+\n\005ratio\030\002 \001" +
      "(\0132\032.google.fhir.r4.core.RatioH\000:\006\240\203\203\350\006\001" +
      "B\010\n\006choice:\364\030\300\237\343\266\005\003\262\376\344\227\0066http://hl7.org/" +
      "fhir/StructureDefinition/NutritionOrder\262" +
      "\365\365\327\t8\n\010additive\020\004\032*NutritionOrder.entera" +
      "lFormula.additiveType\262\365\365\327\t%\n\010datetime\020\002\032" +
      "\027NutritionOrder.dateTime\262\365\365\327\t\302\002\n\tencount" +
      "er\020\005\032\262\002Composition.encounter | DeviceReq" +
      "uest.encounter | DiagnosticReport.encoun" +
      "ter | DocumentReference.context.encounte" +
      "r | Flag.encounter | List.encounter | Nu" +
      "tritionOrder.encounter | Observation.enc" +
      "ounter | Procedure.encounter | RiskAsses" +
      "sment.encounter | ServiceRequest.encount" +
      "er | VisionPrescription.encounter\262\365\365\327\t:\n" +
      "\007formula\020\004\032-NutritionOrder.enteralFormul" +
      "a.baseFormulaType\262\365\365\327\t\205\007\n\nidentifier\020\004\032\364" +
      "\006AllergyIntolerance.identifier | CarePla" +
      "n.identifier | CareTeam.identifier | Com" +
      "position.identifier | Condition.identifi" +
      "er | Consent.identifier | DetectedIssue." +
      "identifier | DeviceRequest.identifier | " +
      "DiagnosticReport.identifier | DocumentMa" +
      "nifest.masterIdentifier | DocumentManife" +
      "st.identifier | DocumentReference.master" +
      "Identifier | DocumentReference.identifie" +
      "r | Encounter.identifier | EpisodeOfCare" +
      ".identifier | FamilyMemberHistory.identi" +
      "fier | Goal.identifier | ImagingStudy.id" +
      "entifier | Immunization.identifier | Lis" +
      "t.identifier | MedicationAdministration." +
      "identifier | MedicationDispense.identifi" +
      "er | MedicationRequest.identifier | Medi" +
      "cationStatement.identifier | NutritionOr" +
      "der.identifier | Observation.identifier " +
      "| Procedure.identifier | RiskAssessment." +
      "identifier | ServiceRequest.identifier |" +
      " SupplyDelivery.identifier | SupplyReque" +
      "st.identifier | VisionPrescription.ident" +
      "ifier\262\365\365\327\t@\n\026instantiates-canonical\020\005\032$N" +
      "utritionOrder.instantiatesCanonical\262\365\365\327\t" +
      "4\n\020instantiates-uri\020\010\032\036NutritionOrder.in" +
      "stantiatesUri\262\365\365\327\t*\n\010oraldiet\020\004\032\034Nutriti" +
      "onOrder.oralDiet.type\262\365\365\327\t\370\n\n\007patient\020\005\032" +
      "\352\nAllergyIntolerance.patient | CarePlan." +
      "subject.where(resolve() is Patient) | Ca" +
      "reTeam.subject.where(resolve() is Patien" +
      "t) | ClinicalImpression.subject.where(re" +
      "solve() is Patient) | Composition.subjec" +
      "t.where(resolve() is Patient) | Conditio" +
      "n.subject.where(resolve() is Patient) | " +
      "Consent.patient | DetectedIssue.patient " +
      "| DeviceRequest.subject.where(resolve() " +
      "is Patient) | DeviceUseStatement.subject" +
      " | DiagnosticReport.subject.where(resolv" +
      "e() is Patient) | DocumentManifest.subje" +
      "ct.where(resolve() is Patient) | Documen" +
      "tReference.subject.where(resolve() is Pa" +
      "tient) | Encounter.subject.where(resolve" +
      "() is Patient) | EpisodeOfCare.patient |" +
      " FamilyMemberHistory.patient | Flag.subj" +
      "ect.where(resolve() is Patient) | Goal.s" +
      "ubject.where(resolve() is Patient) | Ima" +
      "gingStudy.subject.where(resolve() is Pat" +
      "ient) | Immunization.patient | List.subj" +
      "ect.where(resolve() is Patient) | Medica" +
      "tionAdministration.subject.where(resolve" +
      "() is Patient) | MedicationDispense.subj" +
      "ect.where(resolve() is Patient) | Medica" +
      "tionRequest.subject.where(resolve() is P" +
      "atient) | MedicationStatement.subject.wh" +
      "ere(resolve() is Patient) | NutritionOrd" +
      "er.patient | Observation.subject.where(r" +
      "esolve() is Patient) | Procedure.subject" +
      ".where(resolve() is Patient) | RiskAsses" +
      "sment.subject.where(resolve() is Patient" +
      ") | ServiceRequest.subject.where(resolve" +
      "() is Patient) | SupplyDelivery.patient " +
      "| VisionPrescription.patient\262\365\365\327\t$\n\010prov" +
      "ider\020\005\032\026NutritionOrder.orderer\262\365\365\327\t!\n\006st" +
      "atus\020\004\032\025NutritionOrder.status\262\365\365\327\t.\n\nsup" +
      "plement\020\004\032\036NutritionOrder.supplement.typ" +
      "eJ\004\010\007\020\010B!\n\027com.google.fhir.r4.coreP\001\230\306\260\265" +
      "\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Codes.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_NutritionOrder_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_NutritionOrder_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_NutritionOrder_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Identifier", "InstantiatesCanonical", "InstantiatesUri", "Instantiates", "Status", "Intent", "Patient", "Encounter", "DateTime", "Orderer", "AllergyIntolerance", "FoodPreferenceModifier", "ExcludeFoodModifier", "OralDiet", "Supplement", "EnteralFormula", "Note", });
    internal_static_google_fhir_r4_core_NutritionOrder_StatusCode_descriptor =
      internal_static_google_fhir_r4_core_NutritionOrder_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_NutritionOrder_StatusCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_NutritionOrder_StatusCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_NutritionOrder_IntentCode_descriptor =
      internal_static_google_fhir_r4_core_NutritionOrder_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_NutritionOrder_IntentCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_NutritionOrder_IntentCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_NutritionOrder_OralDiet_descriptor =
      internal_static_google_fhir_r4_core_NutritionOrder_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_NutritionOrder_OralDiet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_NutritionOrder_OralDiet_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Type", "Schedule", "Nutrient", "Texture", "FluidConsistencyType", "Instruction", });
    internal_static_google_fhir_r4_core_NutritionOrder_OralDiet_Nutrient_descriptor =
      internal_static_google_fhir_r4_core_NutritionOrder_OralDiet_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_NutritionOrder_OralDiet_Nutrient_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_NutritionOrder_OralDiet_Nutrient_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Modifier", "Amount", });
    internal_static_google_fhir_r4_core_NutritionOrder_OralDiet_Texture_descriptor =
      internal_static_google_fhir_r4_core_NutritionOrder_OralDiet_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_NutritionOrder_OralDiet_Texture_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_NutritionOrder_OralDiet_Texture_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Modifier", "FoodType", });
    internal_static_google_fhir_r4_core_NutritionOrder_Supplement_descriptor =
      internal_static_google_fhir_r4_core_NutritionOrder_descriptor.getNestedTypes().get(3);
    internal_static_google_fhir_r4_core_NutritionOrder_Supplement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_NutritionOrder_Supplement_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Type", "ProductName", "Schedule", "Quantity", "Instruction", });
    internal_static_google_fhir_r4_core_NutritionOrder_EnteralFormula_descriptor =
      internal_static_google_fhir_r4_core_NutritionOrder_descriptor.getNestedTypes().get(4);
    internal_static_google_fhir_r4_core_NutritionOrder_EnteralFormula_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_NutritionOrder_EnteralFormula_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "BaseFormulaType", "BaseFormulaProductName", "AdditiveType", "AdditiveProductName", "CaloricDensity", "RouteofAdministration", "Administration", "MaxVolumeToDeliver", "AdministrationInstruction", });
    internal_static_google_fhir_r4_core_NutritionOrder_EnteralFormula_Administration_descriptor =
      internal_static_google_fhir_r4_core_NutritionOrder_EnteralFormula_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_NutritionOrder_EnteralFormula_Administration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_NutritionOrder_EnteralFormula_Administration_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Schedule", "Quantity", "Rate", });
    internal_static_google_fhir_r4_core_NutritionOrder_EnteralFormula_Administration_RateX_descriptor =
      internal_static_google_fhir_r4_core_NutritionOrder_EnteralFormula_Administration_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_NutritionOrder_EnteralFormula_Administration_RateX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_NutritionOrder_EnteralFormula_Administration_RateX_descriptor,
        new java.lang.String[] { "Quantity", "Ratio", "Choice", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
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
