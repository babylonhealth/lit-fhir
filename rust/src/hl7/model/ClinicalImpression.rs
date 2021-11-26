use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionDateTimeOrPeriod;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct ClinicalImpression_Finding {
  pub(crate) id: Option<String>,
  pub(crate) basis: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) itemReference: Option<Box<Reference>>,
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
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: String,
  pub(crate) subject: Box<Reference>,
  pub(crate) problem: Vector<Reference>,
  pub(crate) summary: Option<String>,
  pub(crate) assessor: Option<Box<Reference>>,
  pub(crate) previous: Option<Box<Reference>>,
  pub(crate) protocol: Vector<String>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) description: Option<String>,
  pub(crate) statusReason: Option<CodeableConcept>,
  pub(crate) effective: Option<UnionDateTimeOrPeriod>,
  pub(crate) supportingInfo: Vector<Reference>,
  pub(crate) prognosisReference: Vector<Reference>,
  pub(crate) prognosisCodeableConcept: Vector<CodeableConcept>,
  pub(crate) finding: Vector<ClinicalImpression_Finding>,
  pub(crate) investigation: Vector<ClinicalImpression_Investigation>,
}