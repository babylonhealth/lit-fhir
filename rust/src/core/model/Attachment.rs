use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;


use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct Attachment {
  pub(crate) url: Option<String>,
  pub(crate) data: Option<String>,
  pub(crate) size: Option<u32>,
  pub(crate) hash: Option<String>,
  pub(crate) title: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) creation: Option<DateTime<FixedOffset>>,
  pub(crate) contentType: Option<String>,
}