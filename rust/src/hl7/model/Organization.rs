use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Reference::Reference;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Address::Address;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::HumanName::HumanName;



#[derive(Clone, Debug)]
pub struct Organization_Contact {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<HumanName>,
  pub(crate) purpose: Option<CodeableConcept>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) address: Option<Address>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Organization {
  pub(crate) _type: Vector<CodeableConcept>,
  pub(crate) name: Option<String>,
  pub(crate) alias: Vector<String>,
  pub(crate) active: Option<bool>,
  pub(crate) partOf: Option<Reference>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) address: Vector<Address>,
  pub(crate) endpoint: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) contact: Vector<Organization_Contact>,
}