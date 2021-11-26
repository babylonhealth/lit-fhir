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
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::UnionQuantityOrRangeOrRatio;
use crate::core::UnionBooleanOrCodeableConcept;
use crate::hl7::UnionDateTimeOrPeriodOrTiming;



#[derive(Clone, Debug)]
pub struct ServiceRequest {
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Reference,
  pub(crate) replaces: Vector<Reference>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) priority: Option<String>,
  pub(crate) specimen: Vector<Reference>,
  pub(crate) bodySite: Vector<CodeableConcept>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) requester: Option<Reference>,
  pub(crate) performer: Vector<Reference>,
  pub(crate) insurance: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) authoredOn: Option<DateTime<FixedOffset>>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) requisition: Option<Identifier>,
  pub(crate) orderDetail: Vector<CodeableConcept>,
  pub(crate) quantity: Option<UnionQuantityOrRangeOrRatio>,
  pub(crate) asNeeded: Option<UnionBooleanOrCodeableConcept>,
  pub(crate) doNotPerform: Option<bool>,
  pub(crate) locationCode: Vector<CodeableConcept>,
  pub(crate) occurrence: Option<UnionDateTimeOrPeriodOrTiming>,
  pub(crate) performerType: Option<CodeableConcept>,
  pub(crate) supportingInfo: Vector<Reference>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) relevantHistory: Vector<Reference>,
  pub(crate) locationReference: Vector<Reference>,
  pub(crate) patientInstruction: Option<String>,
  pub(crate) instantiatesCanonical: Vector<String>,
}