use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Annotation::Annotation;
use crate::core::model::Reference::Reference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::hl7::UnionCodeableConceptOrDate;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::hl7::UnionDurationOrDate;
use crate::hl7::Union_1061953715;



#[derive(Clone, Debug)]
pub struct Goal_Target {
  pub(crate) id: Option<String>,
  pub(crate) due: Option<UnionDurationOrDate>,
  pub(crate) measure: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) detail: Option<Union_1061953715>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Goal {
  pub(crate) note: Vector<Annotation>,
  pub(crate) subject: Box<Reference>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) priority: Option<CodeableConcept>,
  pub(crate) start: Option<UnionCodeableConceptOrDate>,
  pub(crate) addresses: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) statusDate: Option<FHIRDate>,
  pub(crate) description: CodeableConcept,
  pub(crate) expressedBy: Option<Box<Reference>>,
  pub(crate) outcomeCode: Vector<CodeableConcept>,
  pub(crate) statusReason: Option<String>,
  pub(crate) lifecycleStatus: String,
  pub(crate) outcomeReference: Vector<Reference>,
  pub(crate) achievementStatus: Option<CodeableConcept>,
  pub(crate) target: Vector<Goal_Target>,
}