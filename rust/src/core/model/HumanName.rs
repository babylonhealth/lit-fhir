use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;


use crate::core::model::Period::Period;
use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct HumanName {
  pub(crate) _use: Option<String>,
  pub(crate) text: Option<String>,
  pub(crate) given: Vector<String>,
  pub(crate) family: Option<String>,
  pub(crate) prefix: Vector<String>,
  pub(crate) suffix: Vector<String>,
  pub(crate) period: Option<Period>,
}