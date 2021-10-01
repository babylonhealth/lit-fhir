use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct Address {
  pub(crate) use?: String,
  pub(crate) _type?: String,
  pub(crate) text?: String,
  pub(crate) line?: String,
  pub(crate) city?: String,
  pub(crate) state?: String,
  pub(crate) period?: Period,
  pub(crate) country?: String,
  pub(crate) district?: String,
  pub(crate) postalCode?: String,
}