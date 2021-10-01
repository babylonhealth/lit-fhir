use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct ImmunizationEvaluation {
  pub(crate) date: Option<Date>,
  pub(crate) status: String,
  pub(crate) series: Option<String>,
  pub(crate) patient: Reference,
  pub(crate) authority: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) doseStatus: CodeableConcept,
  pub(crate) description: Option<String>,
  pub(crate) targetDisease: CodeableConcept,
  pub(crate) doseNumber: Option<u32 | String>,
  pub(crate) seriesDoses: Option<u32 | String>,
  pub(crate) doseStatusReason: Vector<CodeableConcept>,
  pub(crate) immunizationEvent: Reference,
}