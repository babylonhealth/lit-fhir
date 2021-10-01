use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct AppointmentResponse {
  pub(crate) end: Option<Date>,
  pub(crate) start: Option<Date>,
  pub(crate) actor: Option<Reference>,
  pub(crate) comment: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) appointment: Reference,
  pub(crate) participantType: Vector<CodeableConcept>,
  pub(crate) participantStatus: String,
}