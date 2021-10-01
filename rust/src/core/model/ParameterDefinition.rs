use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct ParameterDefinition {
  pub(crate) use: String,
  pub(crate) min: Option<i32>,
  pub(crate) max: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) _type: String,
  pub(crate) profile: Option<String>,
  pub(crate) documentation: Option<String>,
}