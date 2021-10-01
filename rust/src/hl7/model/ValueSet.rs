use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ValueSet_Expansion_Contains {
  pub(crate) id?: String,
  pub(crate) code?: String,
  pub(crate) system?: String,
  pub(crate) version?: String,
  pub(crate) display?: String,
  pub(crate) abstract?: Boolean,
  pub(crate) inactive?: Boolean,
  pub(crate) contains?: ValueSet_Expansion_Contains,
  pub(crate) extension?: Extension,
  pub(crate) designation?: ValueSet_Compose_Include_Concept_Designation,
  pub(crate) modifierExtension?: Extension,
}



pub struct ValueSet_Expansion_Parameter {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) value?: BigDecimal | Boolean | String | Date | i32 | String | String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct ValueSet_Expansion {
  pub(crate) id?: String,
  pub(crate) total?: i32,
  pub(crate) offset?: i32,
  pub(crate) extension?: Extension,
  pub(crate) timestamp: Date,
  pub(crate) identifier?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) contains?: ValueSet_Expansion_Contains,
  pub(crate) parameter?: ValueSet_Expansion_Parameter,
}


pub struct ValueSet_Compose_Include_Filter {
  pub(crate) id?: String,
  pub(crate) op: String,
  pub(crate) value: String,
  pub(crate) property: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct ValueSet_Compose_Include_Concept_Designation {
  pub(crate) id?: String,
  pub(crate) use?: Coding,
  pub(crate) value: String,
  pub(crate) language?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct ValueSet_Compose_Include_Concept {
  pub(crate) id?: String,
  pub(crate) code: String,
  pub(crate) display?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) designation?: ValueSet_Compose_Include_Concept_Designation,
}

pub struct ValueSet_Compose_Include {
  pub(crate) id?: String,
  pub(crate) system?: String,
  pub(crate) version?: String,
  pub(crate) valueSet?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) filter?: ValueSet_Compose_Include_Filter,
  pub(crate) concept?: ValueSet_Compose_Include_Concept,
}

pub struct ValueSet_Compose {
  pub(crate) id?: String,
  pub(crate) exclude?: ValueSet_Compose_Include,
  pub(crate) inactive?: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) lockedDate?: FHIRDate,
  pub(crate) modifierExtension?: Extension,
  pub(crate) include: ValueSet_Compose_Include,
}

pub struct ValueSet {
  pub(crate) url?: String,
  pub(crate) name?: String,
  pub(crate) date?: Date,
  pub(crate) title?: String,
  pub(crate) status: String,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) publisher?: String,
  pub(crate) immutable?: Boolean,
  pub(crate) copyright?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) useContext?: UsageContext,
  pub(crate) description?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) expansion?: ValueSet_Expansion,
  pub(crate) compose?: ValueSet_Compose,
}