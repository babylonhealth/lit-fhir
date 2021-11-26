use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Annotation::Annotation;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::hl7::UnionCanonicalOrCodeableConceptOrUri;
use crate::core::model::Identifier::Identifier;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::DataRequirement::DataRequirement;



#[derive(Clone, Debug)]
pub struct GuidanceResponse {
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: String,
  pub(crate) result: Option<Reference>,
  pub(crate) subject: Option<Reference>,
  pub(crate) module: UnionCanonicalOrCodeableConceptOrUri,
  pub(crate) encounter: Option<Reference>,
  pub(crate) performer: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) dataRequirement: Vector<DataRequirement>,
  pub(crate) outputParameters: Option<Reference>,
  pub(crate) requestIdentifier: Option<Identifier>,
  pub(crate) evaluationMessage: Vector<Reference>,
  pub(crate) occurrenceDateTime: Option<DateTime<FixedOffset>>,
}