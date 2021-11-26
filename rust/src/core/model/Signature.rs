use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;


use crate::core::model::Reference::Reference;
use crate::core::model::Coding::Coding;
use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct Signature {
  pub(crate) who: Reference,
  pub(crate) _type: Vector<Coding>,
  pub(crate) when: DateTime<FixedOffset>,
  pub(crate) data: Option<String>,
  pub(crate) sigFormat: Option<String>,
  pub(crate) onBehalfOf: Option<Reference>,
  pub(crate) targetFormat: Option<String>,
}