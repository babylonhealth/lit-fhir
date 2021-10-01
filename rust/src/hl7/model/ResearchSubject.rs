use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ResearchSubject {
  pub(crate) study: Reference,
  pub(crate) status: String,
  pub(crate) period?: Period,
  pub(crate) consent?: Reference,
  pub(crate) actualArm?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) individual: Reference,
  pub(crate) assignedArm?: String,
}