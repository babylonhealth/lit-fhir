use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::HumanName::HumanName;
use crate::core::model::Attachment::Attachment;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Address::Address;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::hl7::UnionBooleanOrDateTime;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::hl7::UnionBooleanOrInteger;
use crate::core::model::Reference::Reference;
use crate::core::model::Period::Period;



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
  pub(crate) preferred: Option<bool>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Patient {
  pub(crate) name: Vector<HumanName>,
  pub(crate) photo: Vector<Attachment>,
  pub(crate) active: Option<bool>,
  pub(crate) gender: Option<String>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) address: Vector<Address>,
  pub(crate) birthDate: Option<FHIRDate>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) deceased: Option<UnionBooleanOrDateTime>,
  pub(crate) maritalStatus: Option<CodeableConcept>,
  pub(crate) multipleBirth: Option<UnionBooleanOrInteger>,
  pub(crate) generalPractitioner: Vector<Reference>,
  pub(crate) managingOrganization: Option<Reference>,
  pub(crate) link: Vector<Patient_Link>,
  pub(crate) contact: Vector<Patient_Contact>,
  pub(crate) communication: Vector<Patient_Communication>,
}