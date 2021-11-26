use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;



#[derive(Clone, Debug)]
pub struct Binary {
  pub(crate) data: Option<String>,
  pub(crate) contentType: String,
  pub(crate) securityContext: Option<Box<Reference>>,
}