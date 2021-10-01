use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Practitioner_Qualification {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) period: Option<Period>,
  pub(crate) issuer: Option<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Practitioner {
  pub(crate) name: Vector<HumanName>,
  pub(crate) photo: Vector<Attachment>,
  pub(crate) active: Option<Boolean>,
  pub(crate) gender: Option<String>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) address: Vector<Address>,
  pub(crate) birthDate: Option<FHIRDate>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) communication: Vector<CodeableConcept>,
  pub(crate) qualification: Vector<Practitioner_Qualification>,
}