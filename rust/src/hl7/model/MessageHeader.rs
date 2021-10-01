use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct MessageHeader_Source {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Option<ContactPoint>,
  pub(crate) software: Option<String>,
  pub(crate) endpoint: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MessageHeader_Response {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) details: Option<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: String,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MessageHeader_Destination {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) target: Option<Reference>,
  pub(crate) endpoint: String,
  pub(crate) receiver: Option<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct MessageHeader {
  pub(crate) focus: Vector<Reference>,
  pub(crate) sender: Option<Reference>,
  pub(crate) author: Option<Reference>,
  pub(crate) reason: Option<CodeableConcept>,
  pub(crate) enterer: Option<Reference>,
  pub(crate) event: Coding | String,
  pub(crate) definition: Option<String>,
  pub(crate) responsible: Option<Reference>,
  pub(crate) source: MessageHeader_Source,
  pub(crate) response: Option<MessageHeader_Response>,
  pub(crate) destination: Vector<MessageHeader_Destination>,
}