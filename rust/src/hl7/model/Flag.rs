use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Flag {
  pub(crate) code: CodeableConcept,
  pub(crate) status: String,
  pub(crate) period?: Period,
  pub(crate) author?: Reference,
  pub(crate) subject: Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) encounter?: Reference,
  pub(crate) identifier?: Identifier,
}