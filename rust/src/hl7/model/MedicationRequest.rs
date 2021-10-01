use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MedicationRequest_Substitution {
  pub(crate) id?: String,
  pub(crate) reason?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) allowed: Boolean | CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}


pub struct MedicationRequest_DispenseRequest_InitialFill {
  pub(crate) id?: String,
  pub(crate) quantity?: Quantity,
  pub(crate) duration?: Duration,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct MedicationRequest_DispenseRequest {
  pub(crate) id?: String,
  pub(crate) quantity?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) performer?: Reference,
  pub(crate) validityPeriod?: Period,
  pub(crate) dispenseInterval?: Duration,
  pub(crate) modifierExtension?: Extension,
  pub(crate) numberOfRepeatsAllowed?: u32,
  pub(crate) expectedSupplyDuration?: Duration,
  pub(crate) initialFill?: MedicationRequest_DispenseRequest_InitialFill,
}

pub struct MedicationRequest {
  pub(crate) note?: Annotation,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) subject: Reference,
  pub(crate) basedOn?: Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) priority?: String,
  pub(crate) recorder?: Reference,
  pub(crate) encounter?: Reference,
  pub(crate) requester?: Reference,
  pub(crate) performer?: Reference,
  pub(crate) insurance?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) authoredOn?: Date,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) reported?: Boolean | Reference,
  pub(crate) statusReason?: CodeableConcept,
  pub(crate) doNotPerform?: Boolean,
  pub(crate) eventHistory?: Reference,
  pub(crate) medication: CodeableConcept | Reference,
  pub(crate) performerType?: CodeableConcept,
  pub(crate) detectedIssue?: Reference,
  pub(crate) reasonReference?: Reference,
  pub(crate) instantiatesUri?: String,
  pub(crate) groupIdentifier?: Identifier,
  pub(crate) dosageInstruction?: Dosage,
  pub(crate) priorPrescription?: Reference,
  pub(crate) courseOfTherapyType?: CodeableConcept,
  pub(crate) supportingInformation?: Reference,
  pub(crate) instantiatesCanonical?: String,
  pub(crate) substitution?: MedicationRequest_Substitution,
  pub(crate) dispenseRequest?: MedicationRequest_DispenseRequest,
}