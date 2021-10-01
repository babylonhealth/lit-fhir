use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_Closure {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) translation: Option<Boolean>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_Software {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) version: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_Translation {
  pub(crate) id: Option<String>,
  pub(crate) needsMap: Boolean,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_ValidateCode {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) translations: Boolean,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_Implementation {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: String,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_Expansion_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_Expansion {
  pub(crate) id: Option<String>,
  pub(crate) paging: Option<Boolean>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) incomplete: Option<Boolean>,
  pub(crate) textFilter: Option<String>,
  pub(crate) hierarchical: Option<Boolean>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) parameter: Vector<TerminologyCapabilities_Expansion_Parameter>,
}


#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_CodeSystem_Version_Filter {
  pub(crate) id: Option<String>,
  pub(crate) op: Vector<String>,
  pub(crate) code: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_CodeSystem_Version {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<String>,
  pub(crate) language: Vector<String>,
  pub(crate) property: Vector<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) isDefault: Option<Boolean>,
  pub(crate) compositional: Option<Boolean>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) filter: Vector<TerminologyCapabilities_CodeSystem_Version_Filter>,
}

#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_CodeSystem {
  pub(crate) id: Option<String>,
  pub(crate) uri: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) subsumption: Option<Boolean>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) version: Vector<TerminologyCapabilities_CodeSystem_Version>,
}

#[derive(Clone, Debug)]
pub struct TerminologyCapabilities {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) date: Date,
  pub(crate) kind: String,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) lockedDate: Option<Boolean>,
  pub(crate) codeSearch: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<Boolean>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) closure: Option<TerminologyCapabilities_Closure>,
  pub(crate) software: Option<TerminologyCapabilities_Software>,
  pub(crate) translation: Option<TerminologyCapabilities_Translation>,
  pub(crate) validateCode: Option<TerminologyCapabilities_ValidateCode>,
  pub(crate) implementation: Option<TerminologyCapabilities_Implementation>,
  pub(crate) expansion: Option<TerminologyCapabilities_Expansion>,
  pub(crate) codeSystem: Vector<TerminologyCapabilities_CodeSystem>,
}