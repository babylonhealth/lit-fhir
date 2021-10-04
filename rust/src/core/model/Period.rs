use bigdecimal::BigDecimal;
use im::vector::Vector;

use chrono::{DateTime, FixedOffset};


#[derive(Clone, Debug)]
pub struct Period {
  pub(crate) end: Option<DateTime<FixedOffset>>,
  pub(crate) start: Option<DateTime<FixedOffset>>,
}