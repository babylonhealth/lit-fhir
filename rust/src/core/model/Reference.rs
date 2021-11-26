use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;



#[derive(Clone, Debug)]
pub struct Reference {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) _type: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) reference: Option<String>,
  pub(crate) identifier: Option<Identifier>,
}