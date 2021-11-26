use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Reference::Reference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Signature::Signature;
use crate::hl7::UnionDateTimeOrPeriod;
use crate::core::model::Provenance_Agent::Provenance_Agent;



#[derive(Clone, Debug)]
pub struct Provenance_Agent {
  pub(crate) id: Option<String>,
  pub(crate) who: Box<Reference>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) role: Vector<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) onBehalfOf: Option<Box<Reference>>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Provenance_Entity {
  pub(crate) id: Option<String>,
  pub(crate) role: String,
  pub(crate) what: Box<Reference>,
  pub(crate) agent: Vector<Provenance_Agent>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Provenance {
  pub(crate) target: Vector<Reference>,
  pub(crate) policy: Vector<String>,
  pub(crate) reason: Vector<CodeableConcept>,
  pub(crate) recorded: DateTime<FixedOffset>,
  pub(crate) location: Option<Box<Reference>>,
  pub(crate) activity: Option<CodeableConcept>,
  pub(crate) signature: Vector<Signature>,
  pub(crate) occurred: Option<UnionDateTimeOrPeriod>,
  pub(crate) agent: Vector<Provenance_Agent>,
  pub(crate) entity: Vector<Provenance_Entity>,
}