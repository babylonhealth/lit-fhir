use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct AppointmentResponse {
  pub(crate) end?: Date,
  pub(crate) start?: Date,
  pub(crate) actor?: Reference,
  pub(crate) comment?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) appointment: Reference,
  pub(crate) participantType?: CodeableConcept,
  pub(crate) participantStatus: String,
}