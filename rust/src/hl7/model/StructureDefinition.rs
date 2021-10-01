use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct StructureDefinition_Mapping {
  pub(crate) id?: String,
  pub(crate) uri?: String,
  pub(crate) name?: String,
  pub(crate) comment?: String,
  pub(crate) identity: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct StructureDefinition_Context {
  pub(crate) id?: String,
  pub(crate) _type: String,
  pub(crate) extension?: Extension,
  pub(crate) expression: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct StructureDefinition_Snapshot {
  pub(crate) id?: String,
  pub(crate) element: ElementDefinition,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct StructureDefinition_Differential {
  pub(crate) id?: String,
  pub(crate) element: ElementDefinition,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct StructureDefinition {
  pub(crate) url: String,
  pub(crate) name: String,
  pub(crate) date?: Date,
  pub(crate) kind: String,
  pub(crate) _type: String,
  pub(crate) title?: String,
  pub(crate) status: String,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) keyword?: Coding,
  pub(crate) abstract: Boolean,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) useContext?: UsageContext,
  pub(crate) derivation?: String,
  pub(crate) description?: String,
  pub(crate) fhirVersion?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) baseDefinition?: String,
  pub(crate) contextInvariant?: String,
  pub(crate) mapping?: StructureDefinition_Mapping,
  pub(crate) context?: StructureDefinition_Context,
  pub(crate) snapshot?: StructureDefinition_Snapshot,
  pub(crate) differential?: StructureDefinition_Differential,
}