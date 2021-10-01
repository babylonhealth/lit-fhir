use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct AllergyIntolerance_Reaction {
  pub(crate) id?: String,
  pub(crate) note?: Annotation,
  pub(crate) onset?: Date,
  pub(crate) severity?: String,
  pub(crate) extension?: Extension,
  pub(crate) substance?: CodeableConcept,
  pub(crate) description?: String,
  pub(crate) manifestation: CodeableConcept,
  pub(crate) exposureRoute?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}

pub struct AllergyIntolerance {
  pub(crate) _type?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) patient: Reference,
  pub(crate) category?: String,
  pub(crate) onset?: Age | Date | Period | Range | String,
  pub(crate) recorder?: Reference,
  pub(crate) asserter?: Reference,
  pub(crate) encounter?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) criticality?: String,
  pub(crate) recordedDate?: Date,
  pub(crate) clinicalStatus?: CodeableConcept,
  pub(crate) lastOccurrence?: Date,
  pub(crate) verificationStatus?: CodeableConcept,
  pub(crate) reaction?: AllergyIntolerance_Reaction,
}