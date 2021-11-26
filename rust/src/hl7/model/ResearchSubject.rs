use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct ResearchSubject {
  pub(crate) study: Box<Reference>,
  pub(crate) status: String,
  pub(crate) period: Option<Period>,
  pub(crate) consent: Option<Box<Reference>>,
  pub(crate) actualArm: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) individual: Box<Reference>,
  pub(crate) assignedArm: Option<String>,
}