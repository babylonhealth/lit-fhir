use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MedicationKnowledge_Cost {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) cost: Money,
  pub(crate) source?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct MedicationKnowledge_Kinetics {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) lethalDose50?: Quantity,
  pub(crate) areaUnderCurve?: Quantity,
  pub(crate) halfLifePeriod?: Duration,
  pub(crate) modifierExtension?: Extension,
}


pub struct MedicationKnowledge_Monograph {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) source?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct MedicationKnowledge_Packaging {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) quantity?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct MedicationKnowledge_Ingredient {
  pub(crate) id?: String,
  pub(crate) item: CodeableConcept | Reference,
  pub(crate) isActive?: Boolean,
  pub(crate) strength?: Ratio,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct MedicationKnowledge_MonitoringProgram {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) name?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct MedicationKnowledge_DrugCharacteristic {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) value?: String | CodeableConcept | Quantity | String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct MedicationKnowledge_MedicineClassification {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) classification?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}


pub struct MedicationKnowledge_Regulatory_Schedule {
  pub(crate) id?: String,
  pub(crate) schedule: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct MedicationKnowledge_Regulatory_MaxDispense {
  pub(crate) id?: String,
  pub(crate) period?: Duration,
  pub(crate) quantity: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct MedicationKnowledge_Regulatory_Substitution {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) allowed: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct MedicationKnowledge_Regulatory {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) regulatoryAuthority: Reference,
  pub(crate) schedule?: MedicationKnowledge_Regulatory_Schedule,
  pub(crate) maxDispense?: MedicationKnowledge_Regulatory_MaxDispense,
  pub(crate) substitution?: MedicationKnowledge_Regulatory_Substitution,
}


pub struct MedicationKnowledge_RelatedMedicationKnowledge {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) reference: Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct MedicationKnowledge_AdministrationGuidelines_Dosage {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) dosage: Dosage,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct MedicationKnowledge_AdministrationGuidelines_PatientCharacteristics {
  pub(crate) id?: String,
  pub(crate) value?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) characteristic: CodeableConcept | Quantity,
}

pub struct MedicationKnowledge_AdministrationGuidelines {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) indication?: CodeableConcept | Reference,
  pub(crate) modifierExtension?: Extension,
  pub(crate) dosage?: MedicationKnowledge_AdministrationGuidelines_Dosage,
  pub(crate) patientCharacteristics?: MedicationKnowledge_AdministrationGuidelines_PatientCharacteristics,
}

pub struct MedicationKnowledge {
  pub(crate) code?: CodeableConcept,
  pub(crate) status?: String,
  pub(crate) amount?: Quantity,
  pub(crate) synonym?: String,
  pub(crate) doseForm?: CodeableConcept,
  pub(crate) productType?: CodeableConcept,
  pub(crate) manufacturer?: Reference,
  pub(crate) intendedRoute?: CodeableConcept,
  pub(crate) contraindication?: Reference,
  pub(crate) associatedMedication?: Reference,
  pub(crate) preparationInstruction?: String,
  pub(crate) cost?: MedicationKnowledge_Cost,
  pub(crate) kinetics?: MedicationKnowledge_Kinetics,
  pub(crate) monograph?: MedicationKnowledge_Monograph,
  pub(crate) packaging?: MedicationKnowledge_Packaging,
  pub(crate) ingredient?: MedicationKnowledge_Ingredient,
  pub(crate) monitoringProgram?: MedicationKnowledge_MonitoringProgram,
  pub(crate) drugCharacteristic?: MedicationKnowledge_DrugCharacteristic,
  pub(crate) medicineClassification?: MedicationKnowledge_MedicineClassification,
  pub(crate) regulatory?: MedicationKnowledge_Regulatory,
  pub(crate) relatedMedicationKnowledge?: MedicationKnowledge_RelatedMedicationKnowledge,
  pub(crate) administrationGuidelines?: MedicationKnowledge_AdministrationGuidelines,
}