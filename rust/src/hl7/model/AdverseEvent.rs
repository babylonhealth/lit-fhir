use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct AdverseEvent_SuspectEntity_Causality {
  pub(crate) id?: String,
  pub(crate) author?: Reference,
  pub(crate) method?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) assessment?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) productRelatedness?: String,
}

pub struct AdverseEvent_SuspectEntity {
  pub(crate) id?: String,
  pub(crate) instance: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) causality?: AdverseEvent_SuspectEntity_Causality,
}

pub struct AdverseEvent {
  pub(crate) date?: Date,
  pub(crate) event?: CodeableConcept,
  pub(crate) study?: Reference,
  pub(crate) subject: Reference,
  pub(crate) outcome?: CodeableConcept,
  pub(crate) category?: CodeableConcept,
  pub(crate) detected?: Date,
  pub(crate) location?: Reference,
  pub(crate) severity?: CodeableConcept,
  pub(crate) recorder?: Reference,
  pub(crate) actuality: String,
  pub(crate) encounter?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) seriousness?: CodeableConcept,
  pub(crate) contributor?: Reference,
  pub(crate) recordedDate?: Date,
  pub(crate) referenceDocument?: Reference,
  pub(crate) resultingCondition?: Reference,
  pub(crate) subjectMedicalHistory?: Reference,
  pub(crate) suspectEntity?: AdverseEvent_SuspectEntity,
}