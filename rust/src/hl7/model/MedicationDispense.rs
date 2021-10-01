use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MedicationDispense_Performer {
  pub(crate) id?: String,
  pub(crate) actor: Reference,
  pub(crate) function?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct MedicationDispense_Substitution {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) reason?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) wasSubstituted: Boolean,
  pub(crate) responsibleParty?: Reference,
  pub(crate) modifierExtension?: Extension,
}

pub struct MedicationDispense {
  pub(crate) _type?: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) partOf?: Reference,
  pub(crate) status: String,
  pub(crate) subject?: Reference,
  pub(crate) context?: Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) location?: Reference,
  pub(crate) quantity?: Quantity,
  pub(crate) receiver?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) daysSupply?: Quantity,
  pub(crate) destination?: Reference,
  pub(crate) whenPrepared?: Date,
  pub(crate) eventHistory?: Reference,
  pub(crate) medication: CodeableConcept | Reference,
  pub(crate) detectedIssue?: Reference,
  pub(crate) whenHandedOver?: Date,
  pub(crate) statusReason?: CodeableConcept | Reference,
  pub(crate) dosageInstruction?: Dosage,
  pub(crate) supportingInformation?: Reference,
  pub(crate) authorizingPrescription?: Reference,
  pub(crate) performer?: MedicationDispense_Performer,
  pub(crate) substitution?: MedicationDispense_Substitution,
}