use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Extension::Extension;
use crate::core::model::Period::Period;



#[derive(Clone, Debug)]
pub struct ContactPoint {
  pub(crate) _use: Option<String>,
  pub(crate) rank: Option<u32>,
  pub(crate) value: Option<String>,
  pub(crate) system: Option<String>,
  pub(crate) period: Option<Period>,
}