use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Person_Link {
  pub(crate) id: Option<String>,
  pub(crate) target: Reference,
  pub(crate) extension: Vector<Extension>,
  pub(crate) assurance: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Person {
  pub(crate) name: Vector<HumanName>,
  pub(crate) photo: Option<Attachment>,
  pub(crate) gender: Option<String>,
  pub(crate) active: Option<Boolean>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) address: Vector<Address>,
  pub(crate) birthDate: Option<FHIRDate>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) managingOrganization: Option<Reference>,
  pub(crate) link: Vector<Person_Link>,
}