use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;


use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct FHIRElement {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
}