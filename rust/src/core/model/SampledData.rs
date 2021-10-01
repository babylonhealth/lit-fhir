use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct SampledData {
  pub(crate) data: Option<String>,
  pub(crate) origin: Quantity,
  pub(crate) period: BigDecimal,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) lowerLimit: Option<BigDecimal>,
  pub(crate) upperLimit: Option<BigDecimal>,
  pub(crate) dimensions: u32,
}