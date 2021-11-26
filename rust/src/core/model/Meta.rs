use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Coding::Coding;
use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct Meta {
  pub(crate) tag: Vector<Coding>,
  pub(crate) source: Option<String>,
  pub(crate) profile: Vector<String>,
  pub(crate) security: Vector<Coding>,
  pub(crate) versionId: Option<String>,
  pub(crate) lastUpdated: Option<DateTime<FixedOffset>>,
}