use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Identifier::Identifier;



#[derive(Clone, Debug)]
pub struct Slot {
  pub(crate) end: DateTime<FixedOffset>,
  pub(crate) start: DateTime<FixedOffset>,
  pub(crate) status: String,
  pub(crate) comment: Option<String>,
  pub(crate) schedule: Box<Reference>,
  pub(crate) specialty: Vector<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) overbooked: Option<bool>,
  pub(crate) serviceType: Vector<CodeableConcept>,
  pub(crate) serviceCategory: Vector<CodeableConcept>,
  pub(crate) appointmentType: Option<CodeableConcept>,
}