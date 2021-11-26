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
use crate::core::model::CodeableConcept::CodeableConcept;



#[derive(Clone, Debug)]
pub struct MedicinalProductUndesirableEffect {
  pub(crate) subject: Vector<Reference>,
  pub(crate) population: Vector<any>,
  pub(crate) classification: Option<CodeableConcept>,
  pub(crate) frequencyOfOccurrence: Option<CodeableConcept>,
  pub(crate) symptomConditionEffect: Option<CodeableConcept>,
}