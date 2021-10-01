use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct Identifier {
  pub(crate) use?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) value?: String,
  pub(crate) system?: String,
  pub(crate) period?: Period,
  pub(crate) assigner?: Reference,
}