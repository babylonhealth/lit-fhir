use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct Range {
  pub(crate) low: Option<Quantity>,
  pub(crate) high: Option<Quantity>,
}