use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct ContactPoint {
  pub(crate) use?: String,
  pub(crate) rank?: u32,
  pub(crate) value?: String,
  pub(crate) system?: String,
  pub(crate) period?: Period,
}