use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct Ratio {
  pub(crate) numerator?: Quantity,
  pub(crate) denominator?: Quantity,
}