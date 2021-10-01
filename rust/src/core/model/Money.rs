use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct Money {
  pub(crate) value?: BigDecimal,
  pub(crate) currency?: String,
}