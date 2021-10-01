use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ClinicalImpression_Finding {
  pub(crate) id?: String,
  pub(crate) basis?: String,
  pub(crate) extension?: Extension,
  pub(crate) itemReference?: Reference,
  pub(crate) modifierExtension?: Extension,
  pub(crate) itemCodeableConcept?: CodeableConcept,
}


pub struct ClinicalImpression_Investigation {
  pub(crate) id?: String,
  pub(crate) code: CodeableConcept,
  pub(crate) item?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct ClinicalImpression {
  pub(crate) code?: CodeableConcept,
  pub(crate) date?: Date,
  pub(crate) note?: Annotation,
  pub(crate) status: String,
  pub(crate) subject: Reference,
  pub(crate) problem?: Reference,
  pub(crate) summary?: String,
  pub(crate) assessor?: Reference,
  pub(crate) previous?: Reference,
  pub(crate) protocol?: String,
  pub(crate) encounter?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) description?: String,
  pub(crate) statusReason?: CodeableConcept,
  pub(crate) effective?: Date | Period,
  pub(crate) supportingInfo?: Reference,
  pub(crate) prognosisReference?: Reference,
  pub(crate) prognosisCodeableConcept?: CodeableConcept,
  pub(crate) finding?: ClinicalImpression_Finding,
  pub(crate) investigation?: ClinicalImpression_Investigation,
}