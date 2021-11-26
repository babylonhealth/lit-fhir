use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;



#[derive(Clone, Debug)]
pub struct Flag {
  pub(crate) code: CodeableConcept,
  pub(crate) status: String,
  pub(crate) period: Option<Period>,
  pub(crate) author: Option<Box<Reference>>,
  pub(crate) subject: Box<Reference>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
}