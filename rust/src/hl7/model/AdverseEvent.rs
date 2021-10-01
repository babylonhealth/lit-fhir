use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct AdverseEvent_SuspectEntity_Causality {
  pub(crate) id: Option<String>,
  pub(crate) author: Option<Reference>,
  pub(crate) method: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) assessment: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) productRelatedness: Option<String>,
}

#[derive(Clone, Debug)]
pub struct AdverseEvent_SuspectEntity {
  pub(crate) id: Option<String>,
  pub(crate) instance: Reference,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) causality: Vector<AdverseEvent_SuspectEntity_Causality>,
}

#[derive(Clone, Debug)]
pub struct AdverseEvent {
  pub(crate) date: Option<Date>,
  pub(crate) event: Option<CodeableConcept>,
  pub(crate) study: Vector<Reference>,
  pub(crate) subject: Reference,
  pub(crate) outcome: Option<CodeableConcept>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) detected: Option<Date>,
  pub(crate) location: Option<Reference>,
  pub(crate) severity: Option<CodeableConcept>,
  pub(crate) recorder: Option<Reference>,
  pub(crate) actuality: String,
  pub(crate) encounter: Option<Reference>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) seriousness: Option<CodeableConcept>,
  pub(crate) contributor: Vector<Reference>,
  pub(crate) recordedDate: Option<Date>,
  pub(crate) referenceDocument: Vector<Reference>,
  pub(crate) resultingCondition: Vector<Reference>,
  pub(crate) subjectMedicalHistory: Vector<Reference>,
  pub(crate) suspectEntity: Vector<AdverseEvent_SuspectEntity>,
}