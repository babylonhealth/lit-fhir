use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Narrative {
  pub(crate) div: String,
  pub(crate) status: String,
}