use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct DetectedIssue_Evidence {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) detail?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct DetectedIssue_Mitigation {
  pub(crate) id?: String,
  pub(crate) date?: Date,
  pub(crate) action: CodeableConcept,
  pub(crate) author?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct DetectedIssue {
  pub(crate) code?: CodeableConcept,
  pub(crate) status: String,
  pub(crate) author?: Reference,
  pub(crate) detail?: String,
  pub(crate) patient?: Reference,
  pub(crate) severity?: String,
  pub(crate) reference?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) implicated?: Reference,
  pub(crate) identified?: Date | Period,
  pub(crate) evidence?: DetectedIssue_Evidence,
  pub(crate) mitigation?: DetectedIssue_Mitigation,
}