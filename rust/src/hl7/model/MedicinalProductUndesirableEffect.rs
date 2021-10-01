use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MedicinalProductUndesirableEffect {
  pub(crate) subject?: Reference,
  pub(crate) population?: any,
  pub(crate) classification?: CodeableConcept,
  pub(crate) frequencyOfOccurrence?: CodeableConcept,
  pub(crate) symptomConditionEffect?: CodeableConcept,
}