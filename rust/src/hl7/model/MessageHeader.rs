use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionCodingOrUri;
use crate::hl7::model::Narrative::Narrative;



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
  pub(crate) details: Option<Box<Reference>>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: String,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MessageHeader_Destination {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) target: Option<Box<Reference>>,
  pub(crate) endpoint: String,
  pub(crate) receiver: Option<Box<Reference>>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct MessageHeader {
  pub(crate) focus: Vector<Reference>,
  pub(crate) sender: Option<Box<Reference>>,
  pub(crate) author: Option<Box<Reference>>,
  pub(crate) reason: Option<CodeableConcept>,
  pub(crate) enterer: Option<Box<Reference>>,
  pub(crate) event: UnionCodingOrUri,
  pub(crate) definition: Option<String>,
  pub(crate) responsible: Option<Box<Reference>>,
  pub(crate) source: MessageHeader_Source,
  pub(crate) response: Option<MessageHeader_Response>,
  pub(crate) destination: Vector<MessageHeader_Destination>,
}