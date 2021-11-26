use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::UnionReferenceOrString;
use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct Annotation {
  pub(crate) time: Option<DateTime<FixedOffset>>,
  pub(crate) text: String,
  pub(crate) author: Option<UnionReferenceOrString>,
}