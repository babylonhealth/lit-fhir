use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Appointment_Participant {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) actor?: Reference,
  pub(crate) status: String,
  pub(crate) period?: Period,
  pub(crate) required?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct Appointment {
  pub(crate) end?: Date,
  pub(crate) slot?: Reference,
  pub(crate) start?: Date,
  pub(crate) status: String,
  pub(crate) created?: Date,
  pub(crate) comment?: String,
  pub(crate) basedOn?: Reference,
  pub(crate) priority?: u32,
  pub(crate) specialty?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) serviceType?: CodeableConcept,
  pub(crate) description?: String,
  pub(crate) serviceCategory?: CodeableConcept,
  pub(crate) appointmentType?: CodeableConcept,
  pub(crate) reasonReference?: Reference,
  pub(crate) minutesDuration?: u32,
  pub(crate) requestedPeriod?: Period,
  pub(crate) cancelationReason?: CodeableConcept,
  pub(crate) patientInstruction?: String,
  pub(crate) supportingInformation?: Reference,
  pub(crate) participant: Appointment_Participant,
}