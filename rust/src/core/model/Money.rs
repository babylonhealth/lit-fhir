use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct Money {
  pub(crate) value: Option<BigDecimal>,
  pub(crate) currency: Option<String>,
}