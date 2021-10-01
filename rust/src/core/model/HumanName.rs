use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct HumanName {
  pub(crate) use: Option<String>,
  pub(crate) text: Option<String>,
  pub(crate) given: Vector<String>,
  pub(crate) family: Option<String>,
  pub(crate) prefix: Vector<String>,
  pub(crate) suffix: Vector<String>,
  pub(crate) period: Option<Period>,
}