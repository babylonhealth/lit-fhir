use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct DomainResource {
  pub(crate) text?: Narrative,
  pub(crate) contained?: Resource,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}