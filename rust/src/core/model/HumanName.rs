use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct HumanName {
  pub(crate) use?: String,
  pub(crate) text?: String,
  pub(crate) given?: String,
  pub(crate) family?: String,
  pub(crate) prefix?: String,
  pub(crate) suffix?: String,
  pub(crate) period?: Period,
}