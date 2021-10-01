use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct ValueSet_Expansion_Contains {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<String>,
  pub(crate) system: Option<String>,
  pub(crate) version: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) abstract: Option<Boolean>,
  pub(crate) inactive: Option<Boolean>,
  pub(crate) contains: Vector<ValueSet_Expansion_Contains>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) designation: Vector<ValueSet_Compose_Include_Concept_Designation>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct ValueSet_Expansion_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) value: Option<BigDecimal | Boolean | String | Date | i32 | String | String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ValueSet_Expansion {
  pub(crate) id: Option<String>,
  pub(crate) total: Option<i32>,
  pub(crate) offset: Option<i32>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) timestamp: Date,
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
  pub(crate) use: Option<Coding>,
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
  pub(crate) inactive: Option<Boolean>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) lockedDate: Option<FHIRDate>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) include: Vector<ValueSet_Compose_Include>,
}

#[derive(Clone, Debug)]
pub struct ValueSet {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<Date>,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) publisher: Option<String>,
  pub(crate) immutable: Option<Boolean>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<Boolean>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) expansion: Option<ValueSet_Expansion>,
  pub(crate) compose: Option<ValueSet_Compose>,
}