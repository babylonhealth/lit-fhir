use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct Period {
  pub(crate) end?: Date,
  pub(crate) start?: Date,
}