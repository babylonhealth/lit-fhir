use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;



#[derive(Clone, Debug)]
pub struct Basic {
  pub(crate) code: CodeableConcept,
  pub(crate) author: Option<Reference>,
  pub(crate) subject: Option<Reference>,
  pub(crate) created: Option<FHIRDate>,
  pub(crate) identifier: Vector<Identifier>,
}