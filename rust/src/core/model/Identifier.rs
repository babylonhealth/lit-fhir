use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct Identifier {
  pub(crate) use: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) value: Option<String>,
  pub(crate) system: Option<String>,
  pub(crate) period: Option<Period>,
  pub(crate) assigner: Option<Reference>,
}