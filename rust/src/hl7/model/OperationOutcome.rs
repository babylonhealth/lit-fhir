use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct OperationOutcome_Issue {
  pub(crate) id?: String,
  pub(crate) code: String,
  pub(crate) details?: CodeableConcept,
  pub(crate) severity: String,
  pub(crate) location?: String,
  pub(crate) extension?: Extension,
  pub(crate) expression?: String,
  pub(crate) diagnostics?: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct OperationOutcome {
  pub(crate) issue: OperationOutcome_Issue,
}