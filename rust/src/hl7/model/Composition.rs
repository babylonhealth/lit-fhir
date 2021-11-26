use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Period::Period;
use crate::core::model::Composition_Section::Composition_Section;
use crate::hl7::UnionIdentifierOrReference;



#[derive(Clone, Debug)]
pub struct Composition_Event {
  pub(crate) id: Option<String>,
  pub(crate) code: Vector<CodeableConcept>,
  pub(crate) period: Option<Period>,
  pub(crate) detail: Vector<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Composition_Section {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) text: Option<Narrative>,
  pub(crate) mode: Option<String>,
  pub(crate) title: Option<String>,
  pub(crate) focus: Option<Reference>,
  pub(crate) entry: Vector<Reference>,
  pub(crate) author: Vector<Reference>,
  pub(crate) section: Vector<Composition_Section>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) orderedBy: Option<CodeableConcept>,
  pub(crate) emptyReason: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Composition_Attester {
  pub(crate) id: Option<String>,
  pub(crate) mode: String,
  pub(crate) time: Option<DateTime<FixedOffset>>,
  pub(crate) party: Option<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Composition_RelatesTo {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) target: UnionIdentifierOrReference,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Composition {
  pub(crate) _type: CodeableConcept,
  pub(crate) date: DateTime<FixedOffset>,
  pub(crate) title: String,
  pub(crate) status: String,
  pub(crate) author: Vector<Reference>,
  pub(crate) subject: Option<Reference>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) custodian: Option<Reference>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) confidentiality: Option<String>,
  pub(crate) event: Vector<Composition_Event>,
  pub(crate) section: Vector<Composition_Section>,
  pub(crate) attester: Vector<Composition_Attester>,
  pub(crate) relatesTo: Vector<Composition_RelatesTo>,
}