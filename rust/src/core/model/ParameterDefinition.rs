use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct ParameterDefinition {
  pub(crate) _use: String,
  pub(crate) min: Option<i32>,
  pub(crate) max: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) _type: String,
  pub(crate) profile: Option<String>,
  pub(crate) documentation: Option<String>,
}