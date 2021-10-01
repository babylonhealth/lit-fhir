use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct Expression {
  pub(crate) name?: String,
  pub(crate) language: String,
  pub(crate) reference?: String,
  pub(crate) expression?: String,
  pub(crate) description?: String,
}