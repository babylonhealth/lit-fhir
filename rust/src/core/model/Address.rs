use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::Period::Period;
// use crate::core::*;




#[derive(Clone, Debug)]
pub struct Address {
  pub(crate) _use: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) text: Option<String>,
  pub(crate) line: Vector<String>,
  pub(crate) city: Option<String>,
  pub(crate) state: Option<String>,
  pub(crate) period: Option<Period>,
  pub(crate) country: Option<String>,
  pub(crate) district: Option<String>,
  pub(crate) postalCode: Option<String>,
}