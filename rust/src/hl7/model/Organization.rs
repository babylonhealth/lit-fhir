use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




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
  pub(crate) active: Option<Boolean>,
  pub(crate) partOf: Option<Reference>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) address: Vector<Address>,
  pub(crate) endpoint: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) contact: Vector<Organization_Contact>,
}