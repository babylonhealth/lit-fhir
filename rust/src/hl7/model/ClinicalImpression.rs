use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct ClinicalImpression_Finding {
  pub(crate) id: Option<String>,
  pub(crate) basis: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) itemReference: Option<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) itemCodeableConcept: Option<CodeableConcept>,
}


#[derive(Clone, Debug)]
pub struct ClinicalImpression_Investigation {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) item: Vector<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ClinicalImpression {
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) date: Option<Date>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: String,
  pub(crate) subject: Reference,
  pub(crate) problem: Vector<Reference>,
  pub(crate) summary: Option<String>,
  pub(crate) assessor: Option<Reference>,
  pub(crate) previous: Option<Reference>,
  pub(crate) protocol: Vector<String>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) description: Option<String>,
  pub(crate) statusReason: Option<CodeableConcept>,
  pub(crate) effective: Option<Date | Period>,
  pub(crate) supportingInfo: Vector<Reference>,
  pub(crate) prognosisReference: Vector<Reference>,
  pub(crate) prognosisCodeableConcept: Vector<CodeableConcept>,
  pub(crate) finding: Vector<ClinicalImpression_Finding>,
  pub(crate) investigation: Vector<ClinicalImpression_Investigation>,
}