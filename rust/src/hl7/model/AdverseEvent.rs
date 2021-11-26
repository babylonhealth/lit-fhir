use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct AdverseEvent_SuspectEntity_Causality {
  pub(crate) id: Option<String>,
  pub(crate) author: Option<Box<Reference>>,
  pub(crate) method: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) assessment: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) productRelatedness: Option<String>,
}

#[derive(Clone, Debug)]
pub struct AdverseEvent_SuspectEntity {
  pub(crate) id: Option<String>,
  pub(crate) instance: Box<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) causality: Vector<AdverseEvent_SuspectEntity_Causality>,
}

#[derive(Clone, Debug)]
pub struct AdverseEvent {
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) event: Option<CodeableConcept>,
  pub(crate) study: Vector<Reference>,
  pub(crate) subject: Box<Reference>,
  pub(crate) outcome: Option<CodeableConcept>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) detected: Option<DateTime<FixedOffset>>,
  pub(crate) location: Option<Box<Reference>>,
  pub(crate) severity: Option<CodeableConcept>,
  pub(crate) recorder: Option<Box<Reference>>,
  pub(crate) actuality: String,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) seriousness: Option<CodeableConcept>,
  pub(crate) contributor: Vector<Reference>,
  pub(crate) recordedDate: Option<DateTime<FixedOffset>>,
  pub(crate) referenceDocument: Vector<Reference>,
  pub(crate) resultingCondition: Vector<Reference>,
  pub(crate) subjectMedicalHistory: Vector<Reference>,
  pub(crate) suspectEntity: Vector<AdverseEvent_SuspectEntity>,
}