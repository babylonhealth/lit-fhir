use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct Attachment {
  pub(crate) url: Option<String>,
  pub(crate) data: Option<String>,
  pub(crate) size: Option<u32>,
  pub(crate) hash: Option<String>,
  pub(crate) title: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) creation: Option<Date>,
  pub(crate) contentType: Option<String>,
}