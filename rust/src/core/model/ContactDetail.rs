use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct ContactDetail {
  pub(crate) name?: String,
  pub(crate) telecom?: ContactPoint,
}