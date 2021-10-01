use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct FamilyMemberHistory_Condition {
  pub(crate) id?: String,
  pub(crate) code: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) outcome?: CodeableConcept,
  pub(crate) onset?: Age | Period | Range | String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) contributedToDeath?: Boolean,
}

pub struct FamilyMemberHistory {
  pub(crate) sex?: CodeableConcept,
  pub(crate) date?: Date,
  pub(crate) name?: String,
  pub(crate) note?: Annotation,
  pub(crate) status: String,
  pub(crate) age?: Age | Range | String,
  pub(crate) patient: Reference,
  pub(crate) born?: FHIRDate | Period | String,
  pub(crate) identifier?: Identifier,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) deceased?: Age | Boolean | FHIRDate | Range | String,
  pub(crate) relationship: CodeableConcept,
  pub(crate) estimatedAge?: Boolean,
  pub(crate) instantiatesUri?: String,
  pub(crate) reasonReference?: Reference,
  pub(crate) dataAbsentReason?: CodeableConcept,
  pub(crate) instantiatesCanonical?: String,
  pub(crate) condition?: FamilyMemberHistory_Condition,
}