use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Address::Address;
use crate::core::model::Attachment::Attachment;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;
use crate::core::model::HumanName::HumanName;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Person_Link {
  pub(crate) id: Option<String>,
  pub(crate) target: Box<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) assurance: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Person {
  pub(crate) name: Vector<HumanName>,
  pub(crate) photo: Option<Attachment>,
  pub(crate) gender: Option<String>,
  pub(crate) active: Option<bool>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) address: Vector<Address>,
  pub(crate) birthDate: Option<FHIRDate>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) managingOrganization: Option<Box<Reference>>,
  pub(crate) link: Vector<Person_Link>,
}