use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct ResearchSubject {
  pub(crate) study: Reference,
  pub(crate) status: String,
  pub(crate) period: Option<Period>,
  pub(crate) consent: Option<Reference>,
  pub(crate) actualArm: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) individual: Reference,
  pub(crate) assignedArm: Option<String>,
}