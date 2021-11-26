use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionDateTimeOrPeriodOrTiming;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct DeviceUseStatement {
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: String,
  pub(crate) source: Option<Box<Reference>>,
  pub(crate) device: Box<Reference>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Box<Reference>,
  pub(crate) bodySite: Option<CodeableConcept>,
  pub(crate) timing: Option<UnionDateTimeOrPeriodOrTiming>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) recordedOn: Option<DateTime<FixedOffset>>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) derivedFrom: Vector<Reference>,
  pub(crate) reasonReference: Vector<Reference>,
}