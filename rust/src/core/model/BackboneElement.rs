use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct BackboneElement {
  pub(crate) modifierExtension: Vector<Extension>,
}