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



#[derive(Clone, Debug)]
pub struct List_Entry {
  pub(crate) id: Option<String>,
  pub(crate) flag: Option<CodeableConcept>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) item: Box<Reference>,
  pub(crate) deleted: Option<bool>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct List {
  pub(crate) mode: String,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) source: Option<Box<Reference>>,
  pub(crate) subject: Option<Box<Reference>>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) orderedBy: Option<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) emptyReason: Option<CodeableConcept>,
  pub(crate) entry: Vector<List_Entry>,
}