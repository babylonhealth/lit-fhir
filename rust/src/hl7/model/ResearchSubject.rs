use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Reference::Reference;
use crate::core::model::Period::Period;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;



#[derive(Clone, Debug)]
pub struct ResearchSubject {
  pub(crate) study: Reference,
  pub(crate) status: String,
  pub(crate) period: Option<Period>,
  pub(crate) consent: Option<Reference>,
  pub(crate) actualArm: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) individual: Reference,
  pub(crate) assignedArm: Option<String>,
}