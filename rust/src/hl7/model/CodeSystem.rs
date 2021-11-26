use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeSystem_Concept::CodeSystem_Concept;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::Union_0059314669;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct CodeSystem_Filter {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) value: String,
  pub(crate) operator: Vector<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct CodeSystem_Property {
  pub(crate) id: Option<String>,
  pub(crate) uri: Option<String>,
  pub(crate) code: String,
  pub(crate) _type: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct CodeSystem_Concept_Property {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) value: Union_0059314669,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct CodeSystem_Concept_Designation {
  pub(crate) id: Option<String>,
  pub(crate) _use: Option<Coding>,
  pub(crate) value: String,
  pub(crate) language: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct CodeSystem_Concept {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) display: Option<String>,
  pub(crate) concept: Vector<CodeSystem_Concept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) definition: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) property: Vector<CodeSystem_Concept_Property>,
  pub(crate) designation: Vector<CodeSystem_Concept_Designation>,
}

#[derive(Clone, Debug)]
pub struct CodeSystem {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) title: Option<String>,
  pub(crate) count: Option<u32>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) content: String,
  pub(crate) valueSet: Option<String>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) description: Option<String>,
  pub(crate) supplements: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) caseSensitive: Option<bool>,
  pub(crate) compositional: Option<bool>,
  pub(crate) versionNeeded: Option<bool>,
  pub(crate) hierarchyMeaning: Option<String>,
  pub(crate) filter: Vector<CodeSystem_Filter>,
  pub(crate) property: Vector<CodeSystem_Property>,
  pub(crate) concept: Vector<CodeSystem_Concept>,
}