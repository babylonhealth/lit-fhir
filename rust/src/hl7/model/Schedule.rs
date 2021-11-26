use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Schedule {
  pub(crate) actor: Vector<Reference>,
  pub(crate) active: Option<bool>,
  pub(crate) comment: Option<String>,
  pub(crate) specialty: Vector<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) serviceType: Vector<CodeableConcept>,
  pub(crate) serviceCategory: Vector<CodeableConcept>,
  pub(crate) planningHorizon: Option<Period>,
}