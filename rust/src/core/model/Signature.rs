use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct Signature {
  pub(crate) who: Reference,
  pub(crate) _type: Vector<Coding>,
  pub(crate) when: Date,
  pub(crate) data: Option<String>,
  pub(crate) sigFormat: Option<String>,
  pub(crate) onBehalfOf: Option<Reference>,
  pub(crate) targetFormat: Option<String>,
}