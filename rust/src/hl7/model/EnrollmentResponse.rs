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



#[derive(Clone, Debug)]
pub struct EnrollmentResponse {
  pub(crate) status: Option<String>,
  pub(crate) request: Option<Box<Reference>>,
  pub(crate) outcome: Option<String>,
  pub(crate) created: Option<DateTime<FixedOffset>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) disposition: Option<String>,
  pub(crate) organization: Option<Box<Reference>>,
  pub(crate) requestProvider: Option<Box<Reference>>,
}