use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct Period {
  // pub(crate) end: Option<Date>,
  // pub(crate) start: Option<Date>,
  pub(crate) end: Option<String>,
  pub(crate) start: Option<String>,
}