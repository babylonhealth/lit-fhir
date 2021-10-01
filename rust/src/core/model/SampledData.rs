use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct SampledData {
  pub(crate) data?: String,
  pub(crate) origin: Quantity,
  pub(crate) period: BigDecimal,
  pub(crate) factor?: BigDecimal,
  pub(crate) lowerLimit?: BigDecimal,
  pub(crate) upperLimit?: BigDecimal,
  pub(crate) dimensions: u32,
}