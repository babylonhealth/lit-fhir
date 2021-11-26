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
use crate::hl7::Union01474038381;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Condition_Stage {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) summary: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) assessment: Vector<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Condition_Evidence {
  pub(crate) id: Option<String>,
  pub(crate) code: Vector<CodeableConcept>,
  pub(crate) detail: Vector<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Condition {
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) subject: Box<Reference>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) severity: Option<CodeableConcept>,
  pub(crate) bodySite: Vector<CodeableConcept>,
  pub(crate) onset: Option<Union01474038381>,
  pub(crate) recorder: Option<Box<Reference>>,
  pub(crate) asserter: Option<Box<Reference>>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) abatement: Option<Union01474038381>,
  pub(crate) recordedDate: Option<DateTime<FixedOffset>>,
  pub(crate) clinicalStatus: Option<CodeableConcept>,
  pub(crate) verificationStatus: Option<CodeableConcept>,
  pub(crate) stage: Vector<Condition_Stage>,
  pub(crate) evidence: Vector<Condition_Evidence>,
}