use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct FamilyMemberHistory_Condition {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) note: Vector<Annotation>,
  pub(crate) outcome: Option<CodeableConcept>,
  pub(crate) onset: Option<Age | Period | Range | String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) contributedToDeath: Option<Boolean>,
}

#[derive(Clone, Debug)]
pub struct FamilyMemberHistory {
  pub(crate) sex: Option<CodeableConcept>,
  pub(crate) date: Option<Date>,
  pub(crate) name: Option<String>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: String,
  pub(crate) age: Option<Age | Range | String>,
  pub(crate) patient: Reference,
  pub(crate) born: Option<FHIRDate | Period | String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) deceased: Option<Age | Boolean | FHIRDate | Range | String>,
  pub(crate) relationship: CodeableConcept,
  pub(crate) estimatedAge: Option<Boolean>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) dataAbsentReason: Option<CodeableConcept>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) condition: Vector<FamilyMemberHistory_Condition>,
}