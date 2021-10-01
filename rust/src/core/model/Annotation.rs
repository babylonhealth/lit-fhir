use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct Annotation {
  pub(crate) time: Option<Date>,
  pub(crate) text: String,
  pub(crate) author: Option<Reference | String>,
}