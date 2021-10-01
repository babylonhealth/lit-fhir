use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




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
  pub(crate) value: BigDecimal | Boolean | String | Coding | Date | i32 | String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct CodeSystem_Concept_Designation {
  pub(crate) id: Option<String>,
  pub(crate) use: Option<Coding>,
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
  pub(crate) date: Option<Date>,
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
  pub(crate) experimental: Option<Boolean>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) caseSensitive: Option<Boolean>,
  pub(crate) compositional: Option<Boolean>,
  pub(crate) versionNeeded: Option<Boolean>,
  pub(crate) hierarchyMeaning: Option<String>,
  pub(crate) filter: Vector<CodeSystem_Filter>,
  pub(crate) property: Vector<CodeSystem_Property>,
  pub(crate) concept: Vector<CodeSystem_Concept>,
}