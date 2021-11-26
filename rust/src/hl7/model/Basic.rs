use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Basic {
  pub(crate) code: CodeableConcept,
  pub(crate) author: Option<Box<Reference>>,
  pub(crate) subject: Option<Box<Reference>>,
  pub(crate) created: Option<FHIRDate>,
  pub(crate) identifier: Vector<Identifier>,
}