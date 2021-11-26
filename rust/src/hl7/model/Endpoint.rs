use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Period::Period;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::Reference::Reference;



#[derive(Clone, Debug)]
pub struct Endpoint {
  pub(crate) name: Option<String>,
  pub(crate) status: String,
  pub(crate) period: Option<Period>,
  pub(crate) header: Vector<String>,
  pub(crate) contact: Vector<ContactPoint>,
  pub(crate) address: String,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) payloadType: Vector<CodeableConcept>,
  pub(crate) connectionType: Coding,
  pub(crate) payloadMimeType: Vector<String>,
  pub(crate) managingOrganization: Option<Box<Reference>>,
}