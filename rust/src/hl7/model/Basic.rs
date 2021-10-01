use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Basic {
  pub(crate) code: CodeableConcept,
  pub(crate) author?: Reference,
  pub(crate) subject?: Reference,
  pub(crate) created?: FHIRDate,
  pub(crate) identifier?: Identifier,
}