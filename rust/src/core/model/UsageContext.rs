use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct UsageContext {
  pub(crate) code: Coding,
  pub(crate) value: CodeableConcept | Quantity | Range | Reference,
}