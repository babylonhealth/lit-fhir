use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Extension::Extension;
use crate::core::model::Quantity::Quantity;



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