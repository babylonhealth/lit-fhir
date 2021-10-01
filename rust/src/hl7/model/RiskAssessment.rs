use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct RiskAssessment_Prediction {
  pub(crate) id: Option<String>,
  pub(crate) outcome: Option<CodeableConcept>,
  pub(crate) when: Option<Period | Range>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) rationale: Option<String>,
  pub(crate) relativeRisk: Option<BigDecimal>,
  pub(crate) probability: Option<BigDecimal | Range>,
  pub(crate) qualitativeRisk: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct RiskAssessment {
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) basis: Vector<Reference>,
  pub(crate) parent: Option<Reference>,
  pub(crate) status: String,
  pub(crate) method: Option<CodeableConcept>,
  pub(crate) basedOn: Option<Reference>,
  pub(crate) subject: Reference,
  pub(crate) encounter: Option<Reference>,
  pub(crate) condition: Option<Reference>,
  pub(crate) performer: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) mitigation: Option<String>,
  pub(crate) occurrence: Option<Date | Period>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) prediction: Vector<RiskAssessment_Prediction>,
}