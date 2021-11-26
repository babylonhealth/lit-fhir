use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Extension::Extension;
use crate::core::model::Quantity::Quantity;



#[derive(Clone, Debug)]
pub struct Range {
  pub(crate) low: Option<Quantity>,
  pub(crate) high: Option<Quantity>,
}