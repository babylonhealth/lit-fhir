use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct RelatedPerson_Communication {
  pub(crate) id: Option<String>,
  pub(crate) language: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) preferred: Option<Boolean>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct RelatedPerson {
  pub(crate) name: Vector<HumanName>,
  pub(crate) photo: Vector<Attachment>,
  pub(crate) active: Option<Boolean>,
  pub(crate) gender: Option<String>,
  pub(crate) period: Option<Period>,
  pub(crate) patient: Reference,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) address: Vector<Address>,
  pub(crate) birthDate: Option<FHIRDate>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) relationship: Vector<CodeableConcept>,
  pub(crate) communication: Vector<RelatedPerson_Communication>,
}