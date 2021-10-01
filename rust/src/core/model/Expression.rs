use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct Expression {
  pub(crate) name: Option<String>,
  pub(crate) language: String,
  pub(crate) reference: Option<String>,
  pub(crate) expression: Option<String>,
  pub(crate) description: Option<String>,
}