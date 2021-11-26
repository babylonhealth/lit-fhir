use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_Closure {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) translation: Option<bool>,
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
  pub(crate) needsMap: bool,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_ValidateCode {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) translations: bool,
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
  pub(crate) paging: Option<bool>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) incomplete: Option<bool>,
  pub(crate) textFilter: Option<String>,
  pub(crate) hierarchical: Option<bool>,
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
  pub(crate) isDefault: Option<bool>,
  pub(crate) compositional: Option<bool>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) filter: Vector<TerminologyCapabilities_CodeSystem_Version_Filter>,
}

#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_CodeSystem {
  pub(crate) id: Option<String>,
  pub(crate) uri: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) subsumption: Option<bool>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) version: Vector<TerminologyCapabilities_CodeSystem_Version>,
}

#[derive(Clone, Debug)]
pub struct TerminologyCapabilities {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) date: DateTime<FixedOffset>,
  pub(crate) kind: String,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) lockedDate: Option<bool>,
  pub(crate) codeSearch: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) closure: Option<TerminologyCapabilities_Closure>,
  pub(crate) software: Option<TerminologyCapabilities_Software>,
  pub(crate) translation: Option<TerminologyCapabilities_Translation>,
  pub(crate) validateCode: Option<TerminologyCapabilities_ValidateCode>,
  pub(crate) implementation: Option<TerminologyCapabilities_Implementation>,
  pub(crate) expansion: Option<TerminologyCapabilities_Expansion>,
  pub(crate) codeSystem: Vector<TerminologyCapabilities_CodeSystem>,
}