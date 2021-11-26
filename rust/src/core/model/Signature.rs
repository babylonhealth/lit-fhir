use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Coding::Coding;
use crate::core::model::Extension::Extension;
use crate::core::model::Reference::Reference;



#[derive(Clone, Debug)]
pub struct Signature {
  pub(crate) who: Box<Reference>,
  pub(crate) _type: Vector<Coding>,
  pub(crate) when: DateTime<FixedOffset>,
  pub(crate) data: Option<String>,
  pub(crate) sigFormat: Option<String>,
  pub(crate) onBehalfOf: Option<Box<Reference>>,
  pub(crate) targetFormat: Option<String>,
}