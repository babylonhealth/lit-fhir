use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct AllergyIntolerance_Reaction {
  pub(crate) id: Option<String>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) onset: Option<Date>,
  pub(crate) severity: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) substance: Option<CodeableConcept>,
  pub(crate) description: Option<String>,
  pub(crate) manifestation: Vector<CodeableConcept>,
  pub(crate) exposureRoute: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct AllergyIntolerance {
  pub(crate) _type: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) patient: Reference,
  pub(crate) category: Vector<String>,
  pub(crate) onset: Option<Age | Date | Period | Range | String>,
  pub(crate) recorder: Option<Reference>,
  pub(crate) asserter: Option<Reference>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) criticality: Option<String>,
  pub(crate) recordedDate: Option<Date>,
  pub(crate) clinicalStatus: Option<CodeableConcept>,
  pub(crate) lastOccurrence: Option<Date>,
  pub(crate) verificationStatus: Option<CodeableConcept>,
  pub(crate) reaction: Vector<AllergyIntolerance_Reaction>,
}