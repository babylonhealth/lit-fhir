use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct Ratio {
  pub(crate) numerator: Option<Quantity>,
  pub(crate) denominator: Option<Quantity>,
}