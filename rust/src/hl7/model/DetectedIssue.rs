use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionDateTimeOrPeriod;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct DetectedIssue_Evidence {
  pub(crate) id: Option<String>,
  pub(crate) code: Vector<CodeableConcept>,
  pub(crate) detail: Vector<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct DetectedIssue_Mitigation {
  pub(crate) id: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) action: CodeableConcept,
  pub(crate) author: Option<Box<Reference>>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct DetectedIssue {
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) status: String,
  pub(crate) author: Option<Box<Reference>>,
  pub(crate) detail: Option<String>,
  pub(crate) patient: Option<Box<Reference>>,
  pub(crate) severity: Option<String>,
  pub(crate) reference: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) implicated: Vector<Reference>,
  pub(crate) identified: Option<UnionDateTimeOrPeriod>,
  pub(crate) evidence: Vector<DetectedIssue_Evidence>,
  pub(crate) mitigation: Vector<DetectedIssue_Mitigation>,
}