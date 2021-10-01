use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MedicationAdministration_Dosage {
  pub(crate) id?: String,
  pub(crate) text?: String,
  pub(crate) site?: CodeableConcept,
  pub(crate) dose?: Quantity,
  pub(crate) route?: CodeableConcept,
  pub(crate) method?: CodeableConcept,
  pub(crate) rate?: Quantity | Ratio,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct MedicationAdministration_Performer {
  pub(crate) id?: String,
  pub(crate) actor: Reference,
  pub(crate) function?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct MedicationAdministration {
  pub(crate) note?: Annotation,
  pub(crate) partOf?: Reference,
  pub(crate) status: String,
  pub(crate) device?: Reference,
  pub(crate) subject: Reference,
  pub(crate) context?: Reference,
  pub(crate) request?: Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) instantiates?: String,
  pub(crate) statusReason?: CodeableConcept,
  pub(crate) effective: Date | Period,
  pub(crate) eventHistory?: Reference,
  pub(crate) medication: CodeableConcept | Reference,
  pub(crate) reasonReference?: Reference,
  pub(crate) supportingInformation?: Reference,
  pub(crate) dosage?: MedicationAdministration_Dosage,
  pub(crate) performer?: MedicationAdministration_Performer,
}