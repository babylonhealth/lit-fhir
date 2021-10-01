use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct Annotation {
  pub(crate) time?: Date,
  pub(crate) text: String,
  pub(crate) author?: Reference | String,
}