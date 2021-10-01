use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct ContactPoint {
  pub(crate) use: Option<String>,
  pub(crate) rank: Option<u32>,
  pub(crate) value: Option<String>,
  pub(crate) system: Option<String>,
  pub(crate) period: Option<Period>,
}