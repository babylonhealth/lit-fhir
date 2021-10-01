use bigdecimal::BigDecimal;
use im::vector::Vector;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;

// use crate::core::model::*;
// use crate::core::*;




#[derive(Clone, Debug)]
pub struct Identifier {
  pub(crate) _use: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) value: Option<String>,
  pub(crate) system: Option<String>,
  pub(crate) period: Option<Period>,
  pub(crate) assigner: Option<Reference>,
}