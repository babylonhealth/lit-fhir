use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct OperationOutcome_Issue {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) details: Option<CodeableConcept>,
  pub(crate) severity: String,
  pub(crate) location: Vector<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) expression: Vector<String>,
  pub(crate) diagnostics: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct OperationOutcome {
  pub(crate) issue: Vector<OperationOutcome_Issue>,
}