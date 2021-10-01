use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct ParameterDefinition {
  pub(crate) use: String,
  pub(crate) min?: i32,
  pub(crate) max?: String,
  pub(crate) name?: String,
  pub(crate) _type: String,
  pub(crate) profile?: String,
  pub(crate) documentation?: String,
}