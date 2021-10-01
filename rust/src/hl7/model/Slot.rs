use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Slot {
  pub(crate) end: Date,
  pub(crate) start: Date,
  pub(crate) status: String,
  pub(crate) comment: Option<String>,
  pub(crate) schedule: Reference,
  pub(crate) specialty: Vector<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) overbooked: Option<Boolean>,
  pub(crate) serviceType: Vector<CodeableConcept>,
  pub(crate) serviceCategory: Vector<CodeableConcept>,
  pub(crate) appointmentType: Option<CodeableConcept>,
}