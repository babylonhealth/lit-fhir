use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Basic {
  pub(crate) code: CodeableConcept,
  pub(crate) author: Option<Reference>,
  pub(crate) subject: Option<Reference>,
  pub(crate) created: Option<FHIRDate>,
  pub(crate) identifier: Vector<Identifier>,
}