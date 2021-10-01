use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct MedicinalProductUndesirableEffect {
  pub(crate) subject: Vector<Reference>,
  pub(crate) population: Vector<any>,
  pub(crate) classification: Option<CodeableConcept>,
  pub(crate) frequencyOfOccurrence: Option<CodeableConcept>,
  pub(crate) symptomConditionEffect: Option<CodeableConcept>,
}