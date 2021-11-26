use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Coding::Coding;
use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct CodeableConcept {
  pub(crate) text: Option<String>,
  pub(crate) coding: Vector<Coding>,
}