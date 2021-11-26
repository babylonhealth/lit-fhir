use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct EnrollmentRequest {
  pub(crate) status: Option<String>,
  pub(crate) created: Option<DateTime<FixedOffset>>,
  pub(crate) insurer: Option<Box<Reference>>,
  pub(crate) provider: Option<Box<Reference>>,
  pub(crate) coverage: Option<Box<Reference>>,
  pub(crate) candidate: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
}