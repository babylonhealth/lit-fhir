use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Annotation::Annotation;
use crate::core::model::Reference::Reference;
use crate::core::model::Attachment::Attachment;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::hl7::UnionDateTimeOrPeriod;



#[derive(Clone, Debug)]
pub struct Media {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) view: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) width: Option<u32>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) issued: Option<DateTime<FixedOffset>>,
  pub(crate) device: Option<Box<Reference>>,
  pub(crate) height: Option<u32>,
  pub(crate) frames: Option<u32>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Option<Box<Reference>>,
  pub(crate) content: Attachment,
  pub(crate) modality: Option<CodeableConcept>,
  pub(crate) operator: Option<Box<Reference>>,
  pub(crate) bodySite: Option<CodeableConcept>,
  pub(crate) duration: Option<BigDecimal>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) created: Option<UnionDateTimeOrPeriod>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) deviceName: Option<String>,
}