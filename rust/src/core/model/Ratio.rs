use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;


use crate::core::model::Extension::Extension;
use crate::core::model::Quantity::Quantity;



#[derive(Clone, Debug)]
pub struct Ratio {
  pub(crate) numerator: Option<Quantity>,
  pub(crate) denominator: Option<Quantity>,
}