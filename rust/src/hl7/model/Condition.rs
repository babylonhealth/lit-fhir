use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Condition_Stage {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) summary?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) assessment?: Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct Condition_Evidence {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) detail?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct Condition {
  pub(crate) code?: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) subject: Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) severity?: CodeableConcept,
  pub(crate) bodySite?: CodeableConcept,
  pub(crate) onset?: Age | Date | Period | Range | String,
  pub(crate) recorder?: Reference,
  pub(crate) asserter?: Reference,
  pub(crate) encounter?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) abatement?: Age | Date | Period | Range | String,
  pub(crate) recordedDate?: Date,
  pub(crate) clinicalStatus?: CodeableConcept,
  pub(crate) verificationStatus?: CodeableConcept,
  pub(crate) stage?: Condition_Stage,
  pub(crate) evidence?: Condition_Evidence,
}