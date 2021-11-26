use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::CodeableConcept::CodeableConcept;



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