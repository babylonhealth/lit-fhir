use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::hl7::UnionPositiveIntOrString;



#[derive(Clone, Debug)]
pub struct ImmunizationEvaluation {
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) status: String,
  pub(crate) series: Option<String>,
  pub(crate) patient: Box<Reference>,
  pub(crate) authority: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) doseStatus: CodeableConcept,
  pub(crate) description: Option<String>,
  pub(crate) targetDisease: CodeableConcept,
  pub(crate) doseNumber: Option<UnionPositiveIntOrString>,
  pub(crate) seriesDoses: Option<UnionPositiveIntOrString>,
  pub(crate) doseStatusReason: Vector<CodeableConcept>,
  pub(crate) immunizationEvent: Box<Reference>,
}