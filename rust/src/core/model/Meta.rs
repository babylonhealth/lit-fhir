use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct Meta {
  pub(crate) tag?: Coding,
  pub(crate) source?: String,
  pub(crate) profile?: String,
  pub(crate) security?: Coding,
  pub(crate) versionId?: String,
  pub(crate) lastUpdated?: Date,
}