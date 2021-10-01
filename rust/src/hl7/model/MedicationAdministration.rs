use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct MedicationAdministration_Dosage {
  pub(crate) id: Option<String>,
  pub(crate) text: Option<String>,
  pub(crate) site: Option<CodeableConcept>,
  pub(crate) dose: Option<Quantity>,
  pub(crate) route: Option<CodeableConcept>,
  pub(crate) method: Option<CodeableConcept>,
  pub(crate) rate: Option<Quantity | Ratio>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicationAdministration_Performer {
  pub(crate) id: Option<String>,
  pub(crate) actor: Reference,
  pub(crate) function: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct MedicationAdministration {
  pub(crate) note: Vector<Annotation>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) device: Vector<Reference>,
  pub(crate) subject: Reference,
  pub(crate) context: Option<Reference>,
  pub(crate) request: Option<Reference>,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) instantiates: Vector<String>,
  pub(crate) statusReason: Vector<CodeableConcept>,
  pub(crate) effective: Date | Period,
  pub(crate) eventHistory: Vector<Reference>,
  pub(crate) medication: CodeableConcept | Reference,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) supportingInformation: Vector<Reference>,
  pub(crate) dosage: Option<MedicationAdministration_Dosage>,
  pub(crate) performer: Vector<MedicationAdministration_Performer>,
}