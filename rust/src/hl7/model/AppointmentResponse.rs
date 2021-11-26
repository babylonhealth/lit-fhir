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
use crate::core::model::Identifier::Identifier;
use crate::core::model::CodeableConcept::CodeableConcept;



#[derive(Clone, Debug)]
pub struct AppointmentResponse {
  pub(crate) end: Option<DateTime<FixedOffset>>,
  pub(crate) start: Option<DateTime<FixedOffset>>,
  pub(crate) actor: Option<Box<Reference>>,
  pub(crate) comment: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) appointment: Box<Reference>,
  pub(crate) participantType: Vector<CodeableConcept>,
  pub(crate) participantStatus: String,
}