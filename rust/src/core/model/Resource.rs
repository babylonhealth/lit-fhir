use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;


use crate::core::model::Meta::Meta;



#[derive(Clone, Debug)]
pub struct Resource {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Meta>,
  pub(crate) language: Option<String>,
  pub(crate) implicitRules: Option<String>,
}