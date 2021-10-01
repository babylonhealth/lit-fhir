use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Cost {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) cost: Money,
  pub(crate) source: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Kinetics {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) lethalDose50: Vector<Quantity>,
  pub(crate) areaUnderCurve: Vector<Quantity>,
  pub(crate) halfLifePeriod: Option<Duration>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Monograph {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) source: Option<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Packaging {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Ingredient {
  pub(crate) id: Option<String>,
  pub(crate) item: CodeableConcept | Reference,
  pub(crate) isActive: Option<Boolean>,
  pub(crate) strength: Option<Ratio>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_MonitoringProgram {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) name: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_DrugCharacteristic {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) value: Option<String | CodeableConcept | Quantity | String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_MedicineClassification {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) classification: Vector<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Regulatory_Schedule {
  pub(crate) id: Option<String>,
  pub(crate) schedule: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Regulatory_MaxDispense {
  pub(crate) id: Option<String>,
  pub(crate) period: Option<Duration>,
  pub(crate) quantity: Quantity,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Regulatory_Substitution {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) allowed: Boolean,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Regulatory {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) regulatoryAuthority: Reference,
  pub(crate) schedule: Vector<MedicationKnowledge_Regulatory_Schedule>,
  pub(crate) maxDispense: Option<MedicationKnowledge_Regulatory_MaxDispense>,
  pub(crate) substitution: Vector<MedicationKnowledge_Regulatory_Substitution>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_RelatedMedicationKnowledge {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) reference: Vector<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_AdministrationGuidelines_Dosage {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) dosage: Vector<Dosage>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct MedicationKnowledge_AdministrationGuidelines_PatientCharacteristics {
  pub(crate) id: Option<String>,
  pub(crate) value: Vector<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) characteristic: CodeableConcept | Quantity,
}

#[derive(Clone, Debug)]
pub struct MedicationKnowledge_AdministrationGuidelines {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) indication: Option<CodeableConcept | Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) dosage: Vector<MedicationKnowledge_AdministrationGuidelines_Dosage>,
  pub(crate) patientCharacteristics: Vector<MedicationKnowledge_AdministrationGuidelines_PatientCharacteristics>,
}

#[derive(Clone, Debug)]
pub struct MedicationKnowledge {
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) status: Option<String>,
  pub(crate) amount: Option<Quantity>,
  pub(crate) synonym: Vector<String>,
  pub(crate) doseForm: Option<CodeableConcept>,
  pub(crate) productType: Vector<CodeableConcept>,
  pub(crate) manufacturer: Option<Reference>,
  pub(crate) intendedRoute: Vector<CodeableConcept>,
  pub(crate) contraindication: Vector<Reference>,
  pub(crate) associatedMedication: Vector<Reference>,
  pub(crate) preparationInstruction: Option<String>,
  pub(crate) cost: Vector<MedicationKnowledge_Cost>,
  pub(crate) kinetics: Vector<MedicationKnowledge_Kinetics>,
  pub(crate) monograph: Vector<MedicationKnowledge_Monograph>,
  pub(crate) packaging: Option<MedicationKnowledge_Packaging>,
  pub(crate) ingredient: Vector<MedicationKnowledge_Ingredient>,
  pub(crate) monitoringProgram: Vector<MedicationKnowledge_MonitoringProgram>,
  pub(crate) drugCharacteristic: Vector<MedicationKnowledge_DrugCharacteristic>,
  pub(crate) medicineClassification: Vector<MedicationKnowledge_MedicineClassification>,
  pub(crate) regulatory: Vector<MedicationKnowledge_Regulatory>,
  pub(crate) relatedMedicationKnowledge: Vector<MedicationKnowledge_RelatedMedicationKnowledge>,
  pub(crate) administrationGuidelines: Vector<MedicationKnowledge_AdministrationGuidelines>,
}