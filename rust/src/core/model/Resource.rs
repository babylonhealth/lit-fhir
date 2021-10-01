use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct Resource {
  pub(crate) id?: String,
  pub(crate) meta?: Meta,
  pub(crate) language?: String,
  pub(crate) implicitRules?: String,
}