use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct Range {
  pub(crate) low?: Quantity,
  pub(crate) high?: Quantity,
}