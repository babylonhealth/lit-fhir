use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




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
  pub(crate) subject: Reference,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) severity: Option<CodeableConcept>,
  pub(crate) bodySite: Vector<CodeableConcept>,
  pub(crate) onset: Option<Age | Date | Period | Range | String>,
  pub(crate) recorder: Option<Reference>,
  pub(crate) asserter: Option<Reference>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) abatement: Option<Age | Date | Period | Range | String>,
  pub(crate) recordedDate: Option<Date>,
  pub(crate) clinicalStatus: Option<CodeableConcept>,
  pub(crate) verificationStatus: Option<CodeableConcept>,
  pub(crate) stage: Vector<Condition_Stage>,
  pub(crate) evidence: Vector<Condition_Evidence>,
}