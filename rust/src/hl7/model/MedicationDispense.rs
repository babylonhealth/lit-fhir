use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct MedicationDispense_Performer {
  pub(crate) id: Option<String>,
  pub(crate) actor: Reference,
  pub(crate) function: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicationDispense_Substitution {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) reason: Vector<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) wasSubstituted: Boolean,
  pub(crate) responsibleParty: Vector<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct MedicationDispense {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) subject: Option<Reference>,
  pub(crate) context: Option<Reference>,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) location: Option<Reference>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) receiver: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) daysSupply: Option<Quantity>,
  pub(crate) destination: Option<Reference>,
  pub(crate) whenPrepared: Option<Date>,
  pub(crate) eventHistory: Vector<Reference>,
  pub(crate) medication: CodeableConcept | Reference,
  pub(crate) detectedIssue: Vector<Reference>,
  pub(crate) whenHandedOver: Option<Date>,
  pub(crate) statusReason: Option<CodeableConcept | Reference>,
  pub(crate) dosageInstruction: Vector<Dosage>,
  pub(crate) supportingInformation: Vector<Reference>,
  pub(crate) authorizingPrescription: Vector<Reference>,
  pub(crate) performer: Vector<MedicationDispense_Performer>,
  pub(crate) substitution: Option<MedicationDispense_Substitution>,
}