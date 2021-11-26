use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Annotation::Annotation;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::hl7::UnionDateTimeOrPeriod;
use crate::hl7::UnionPeriodOrRange;
use crate::hl7::UnionDecimalOrRange;



#[derive(Clone, Debug)]
pub struct RiskAssessment_Prediction {
  pub(crate) id: Option<String>,
  pub(crate) outcome: Option<CodeableConcept>,
  pub(crate) when: Option<UnionPeriodOrRange>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) rationale: Option<String>,
  pub(crate) relativeRisk: Option<BigDecimal>,
  pub(crate) probability: Option<UnionDecimalOrRange>,
  pub(crate) qualitativeRisk: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct RiskAssessment {
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) basis: Vector<Reference>,
  pub(crate) parent: Option<Box<Reference>>,
  pub(crate) status: String,
  pub(crate) method: Option<CodeableConcept>,
  pub(crate) basedOn: Option<Box<Reference>>,
  pub(crate) subject: Box<Reference>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) condition: Option<Box<Reference>>,
  pub(crate) performer: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) mitigation: Option<String>,
  pub(crate) occurrence: Option<UnionDateTimeOrPeriod>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) prediction: Vector<RiskAssessment_Prediction>,
}