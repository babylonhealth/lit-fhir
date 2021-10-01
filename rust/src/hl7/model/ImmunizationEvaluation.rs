use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ImmunizationEvaluation {
  pub(crate) date?: Date,
  pub(crate) status: String,
  pub(crate) series?: String,
  pub(crate) patient: Reference,
  pub(crate) authority?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) doseStatus: CodeableConcept,
  pub(crate) description?: String,
  pub(crate) targetDisease: CodeableConcept,
  pub(crate) doseNumber?: u32 | String,
  pub(crate) seriesDoses?: u32 | String,
  pub(crate) doseStatusReason?: CodeableConcept,
  pub(crate) immunizationEvent: Reference,
}