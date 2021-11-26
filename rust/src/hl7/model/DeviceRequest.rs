use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Annotation::Annotation;
use crate::core::model::Reference::Reference;
use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::hl7::UnionDateTimeOrPeriodOrTiming;
use crate::hl7::Union01850316684;



#[derive(Clone, Debug)]
pub struct DeviceRequest_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) value: Option<Union01850316684>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct DeviceRequest {
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: Option<String>,
  pub(crate) intent: String,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) code: UnionCodeableConceptOrReference,
  pub(crate) subject: Box<Reference>,
  pub(crate) priority: Option<String>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) requester: Option<Box<Reference>>,
  pub(crate) performer: Option<Box<Reference>>,
  pub(crate) insurance: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) authoredOn: Option<DateTime<FixedOffset>>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) priorRequest: Vector<Reference>,
  pub(crate) occurrence: Option<UnionDateTimeOrPeriodOrTiming>,
  pub(crate) performerType: Option<CodeableConcept>,
  pub(crate) supportingInfo: Vector<Reference>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) groupIdentifier: Option<Identifier>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) relevantHistory: Vector<Reference>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) parameter: Vector<DeviceRequest_Parameter>,
}