use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::Union_1548929031;
use crate::core::model::Coding::Coding;
use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct UsageContext {
  pub(crate) code: Coding,
  pub(crate) value: Union_1548929031,
}