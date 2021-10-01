use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct RiskAssessment_Prediction {
  pub(crate) id?: String,
  pub(crate) outcome?: CodeableConcept,
  pub(crate) when?: Period | Range,
  pub(crate) extension?: Extension,
  pub(crate) rationale?: String,
  pub(crate) relativeRisk?: BigDecimal,
  pub(crate) probability?: BigDecimal | Range,
  pub(crate) qualitativeRisk?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}

pub struct RiskAssessment {
  pub(crate) code?: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) basis?: Reference,
  pub(crate) parent?: Reference,
  pub(crate) status: String,
  pub(crate) method?: CodeableConcept,
  pub(crate) basedOn?: Reference,
  pub(crate) subject: Reference,
  pub(crate) encounter?: Reference,
  pub(crate) condition?: Reference,
  pub(crate) performer?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) mitigation?: String,
  pub(crate) occurrence?: Date | Period,
  pub(crate) reasonReference?: Reference,
  pub(crate) prediction?: RiskAssessment_Prediction,
}