use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct Signature {
  pub(crate) who: Reference,
  pub(crate) _type: Coding,
  pub(crate) when: Date,
  pub(crate) data?: String,
  pub(crate) sigFormat?: String,
  pub(crate) onBehalfOf?: Reference,
  pub(crate) targetFormat?: String,
}