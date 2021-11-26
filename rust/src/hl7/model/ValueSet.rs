use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::UsageContext::UsageContext;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ValueSet_Expansion_Contains::ValueSet_Expansion_Contains;
use crate::core::model::ValueSet_Compose_Include_Concept_Designation::ValueSet_Compose_Include_Concept_Designation;
use crate::hl7::Union01475253842;
use crate::core::model::ValueSet_Compose_Include::ValueSet_Compose_Include;
use crate::core::model::Coding::Coding;



#[derive(Clone, Debug)]
pub struct ValueSet_Expansion_Contains {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<String>,
  pub(crate) system: Option<String>,
  pub(crate) version: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) abstract: Option<bool>,
  pub(crate) inactive: Option<bool>,
  pub(crate) contains: Vector<ValueSet_Expansion_Contains>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) designation: Vector<ValueSet_Compose_Include_Concept_Designation>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct ValueSet_Expansion_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) value: Option<Union01475253842>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ValueSet_Expansion {
  pub(crate) id: Option<String>,
  pub(crate) total: Option<i32>,
  pub(crate) offset: Option<i32>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) timestamp: DateTime<FixedOffset>,
  pub(crate) identifier: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) contains: Vector<ValueSet_Expansion_Contains>,
  pub(crate) parameter: Vector<ValueSet_Expansion_Parameter>,
}


#[derive(Clone, Debug)]
pub struct ValueSet_Compose_Include_Filter {
  pub(crate) id: Option<String>,
  pub(crate) op: String,
  pub(crate) value: String,
  pub(crate) property: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct ValueSet_Compose_Include_Concept_Designation {
  pub(crate) id: Option<String>,
  pub(crate) _use: Option<Coding>,
  pub(crate) value: String,
  pub(crate) language: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ValueSet_Compose_Include_Concept {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) display: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) designation: Vector<ValueSet_Compose_Include_Concept_Designation>,
}

#[derive(Clone, Debug)]
pub struct ValueSet_Compose_Include {
  pub(crate) id: Option<String>,
  pub(crate) system: Option<String>,
  pub(crate) version: Option<String>,
  pub(crate) valueSet: Vector<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) filter: Vector<ValueSet_Compose_Include_Filter>,
  pub(crate) concept: Vector<ValueSet_Compose_Include_Concept>,
}

#[derive(Clone, Debug)]
pub struct ValueSet_Compose {
  pub(crate) id: Option<String>,
  pub(crate) exclude: Vector<ValueSet_Compose_Include>,
  pub(crate) inactive: Option<bool>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) lockedDate: Option<FHIRDate>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) include: Vector<ValueSet_Compose_Include>,
}

#[derive(Clone, Debug)]
pub struct ValueSet {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) publisher: Option<String>,
  pub(crate) immutable: Option<bool>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) expansion: Option<ValueSet_Expansion>,
  pub(crate) compose: Option<ValueSet_Compose>,
}