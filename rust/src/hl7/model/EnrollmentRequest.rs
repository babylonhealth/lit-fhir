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
pub struct EnrollmentRequest {
  pub(crate) status: Option<String>,
  pub(crate) created: Option<DateTime<FixedOffset>>,
  pub(crate) insurer: Option<Reference>,
  pub(crate) provider: Option<Reference>,
  pub(crate) coverage: Option<Reference>,
  pub(crate) candidate: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
}