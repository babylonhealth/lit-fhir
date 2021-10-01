use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct Attachment {
  pub(crate) url?: String,
  pub(crate) data?: String,
  pub(crate) size?: u32,
  pub(crate) hash?: String,
  pub(crate) title?: String,
  pub(crate) language?: String,
  pub(crate) creation?: Date,
  pub(crate) contentType?: String,
}