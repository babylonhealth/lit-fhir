use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Slot {
  pub(crate) end: Date,
  pub(crate) start: Date,
  pub(crate) status: String,
  pub(crate) comment?: String,
  pub(crate) schedule: Reference,
  pub(crate) specialty?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) overbooked?: Boolean,
  pub(crate) serviceType?: CodeableConcept,
  pub(crate) serviceCategory?: CodeableConcept,
  pub(crate) appointmentType?: CodeableConcept,
}