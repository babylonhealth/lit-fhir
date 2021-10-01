use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Patient_Link {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) other: Reference,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Patient_Contact {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<HumanName>,
  pub(crate) gender: Option<String>,
  pub(crate) period: Option<Period>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) address: Option<Address>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) relationship: Vector<CodeableConcept>,
  pub(crate) organization: Option<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Patient_Communication {
  pub(crate) id: Option<String>,
  pub(crate) language: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) preferred: Option<Boolean>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Patient {
  pub(crate) name: Vector<HumanName>,
  pub(crate) photo: Vector<Attachment>,
  pub(crate) active: Option<Boolean>,
  pub(crate) gender: Option<String>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) address: Vector<Address>,
  pub(crate) birthDate: Option<FHIRDate>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) deceased: Option<Boolean | Date>,
  pub(crate) maritalStatus: Option<CodeableConcept>,
  pub(crate) multipleBirth: Option<Boolean | i32>,
  pub(crate) generalPractitioner: Vector<Reference>,
  pub(crate) managingOrganization: Option<Reference>,
  pub(crate) link: Vector<Patient_Link>,
  pub(crate) contact: Vector<Patient_Contact>,
  pub(crate) communication: Vector<Patient_Communication>,
}