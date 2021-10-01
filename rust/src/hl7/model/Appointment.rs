use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Appointment_Participant {
  pub(crate) id: Option<String>,
  pub(crate) _type: Vector<CodeableConcept>,
  pub(crate) actor: Option<Reference>,
  pub(crate) status: String,
  pub(crate) period: Option<Period>,
  pub(crate) required: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Appointment {
  pub(crate) end: Option<Date>,
  pub(crate) slot: Vector<Reference>,
  pub(crate) start: Option<Date>,
  pub(crate) status: String,
  pub(crate) created: Option<Date>,
  pub(crate) comment: Option<String>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) priority: Option<u32>,
  pub(crate) specialty: Vector<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) serviceType: Vector<CodeableConcept>,
  pub(crate) description: Option<String>,
  pub(crate) serviceCategory: Vector<CodeableConcept>,
  pub(crate) appointmentType: Option<CodeableConcept>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) minutesDuration: Option<u32>,
  pub(crate) requestedPeriod: Vector<Period>,
  pub(crate) cancelationReason: Option<CodeableConcept>,
  pub(crate) patientInstruction: Option<String>,
  pub(crate) supportingInformation: Vector<Reference>,
  pub(crate) participant: Vector<Appointment_Participant>,
}