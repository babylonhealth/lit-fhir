use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct Expression {
  pub(crate) name: Option<String>,
  pub(crate) language: String,
  pub(crate) reference: Option<String>,
  pub(crate) expression: Option<String>,
  pub(crate) description: Option<String>,
}