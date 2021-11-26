use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;


use crate::core::model::Quantity::Quantity;
use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct Range {
  pub(crate) low: Option<Quantity>,
  pub(crate) high: Option<Quantity>,
}