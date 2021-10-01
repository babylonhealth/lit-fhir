use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




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
  pub(crate) date: Option<Date>,
  pub(crate) kind: String,
  pub(crate) _type: String,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) keyword: Vector<Coding>,
  pub(crate) abstract: Boolean,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) derivation: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) fhirVersion: Option<String>,
  pub(crate) experimental: Option<Boolean>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) baseDefinition: Option<String>,
  pub(crate) contextInvariant: Vector<String>,
  pub(crate) mapping: Vector<StructureDefinition_Mapping>,
  pub(crate) context: Vector<StructureDefinition_Context>,
  pub(crate) snapshot: Option<StructureDefinition_Snapshot>,
  pub(crate) differential: Option<StructureDefinition_Differential>,
}