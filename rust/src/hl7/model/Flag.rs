use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Flag {
  pub(crate) code: CodeableConcept,
  pub(crate) status: String,
  pub(crate) period: Option<Period>,
  pub(crate) author: Option<Reference>,
  pub(crate) subject: Reference,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
}