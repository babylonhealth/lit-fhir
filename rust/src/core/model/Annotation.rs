use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;


use crate::core::model::Extension::Extension;
use crate::core::UnionReferenceOrString;



#[derive(Clone, Debug)]
pub struct Annotation {
  pub(crate) time: Option<DateTime<FixedOffset>>,
  pub(crate) text: String,
  pub(crate) author: Option<UnionReferenceOrString>,
}