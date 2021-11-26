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
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;



#[derive(Clone, Debug)]
pub struct Practitioner_Qualification {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) period: Option<Period>,
  pub(crate) issuer: Option<Box<Reference>>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Practitioner {
  pub(crate) name: Vector<HumanName>,
  pub(crate) photo: Vector<Attachment>,
  pub(crate) active: Option<bool>,
  pub(crate) gender: Option<String>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) address: Vector<Address>,
  pub(crate) birthDate: Option<FHIRDate>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) communication: Vector<CodeableConcept>,
  pub(crate) qualification: Vector<Practitioner_Qualification>,
}