use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Attachment::Attachment;
use crate::core::model::Reference::Reference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;



#[derive(Clone, Debug)]
pub struct BodyStructure {
  pub(crate) image: Vector<Attachment>,
  pub(crate) active: Option<bool>,
  pub(crate) patient: Reference,
  pub(crate) location: Option<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) morphology: Option<CodeableConcept>,
  pub(crate) description: Option<String>,
  pub(crate) locationQualifier: Vector<CodeableConcept>,
}