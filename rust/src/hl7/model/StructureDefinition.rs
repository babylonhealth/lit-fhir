use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::ElementDefinition::ElementDefinition;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct StructureDefinition_Mapping {
  pub(crate) id: Option<String>,
  pub(crate) uri: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) comment: Option<String>,
  pub(crate) identity: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct StructureDefinition_Context {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) expression: String,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct StructureDefinition_Snapshot {
  pub(crate) id: Option<String>,
  pub(crate) element: Vector<ElementDefinition>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct StructureDefinition_Differential {
  pub(crate) id: Option<String>,
  pub(crate) element: Vector<ElementDefinition>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct StructureDefinition {
  pub(crate) url: String,
  pub(crate) name: String,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) kind: String,
  pub(crate) _type: String,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) keyword: Vector<Coding>,
  pub(crate) abstract: bool,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) derivation: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) fhirVersion: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) baseDefinition: Option<String>,
  pub(crate) contextInvariant: Vector<String>,
  pub(crate) mapping: Vector<StructureDefinition_Mapping>,
  pub(crate) context: Vector<StructureDefinition_Context>,
  pub(crate) snapshot: Option<StructureDefinition_Snapshot>,
  pub(crate) differential: Option<StructureDefinition_Differential>,
}