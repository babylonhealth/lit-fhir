use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct CodeSystem_Filter {
  pub(crate) id?: String,
  pub(crate) code: String,
  pub(crate) value: String,
  pub(crate) operator: String,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct CodeSystem_Property {
  pub(crate) id?: String,
  pub(crate) uri?: String,
  pub(crate) code: String,
  pub(crate) _type: String,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct CodeSystem_Concept_Property {
  pub(crate) id?: String,
  pub(crate) code: String,
  pub(crate) value: BigDecimal | Boolean | String | Coding | Date | i32 | String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct CodeSystem_Concept_Designation {
  pub(crate) id?: String,
  pub(crate) use?: Coding,
  pub(crate) value: String,
  pub(crate) language?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct CodeSystem_Concept {
  pub(crate) id?: String,
  pub(crate) code: String,
  pub(crate) display?: String,
  pub(crate) concept?: CodeSystem_Concept,
  pub(crate) extension?: Extension,
  pub(crate) definition?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) property?: CodeSystem_Concept_Property,
  pub(crate) designation?: CodeSystem_Concept_Designation,
}

pub struct CodeSystem {
  pub(crate) url?: String,
  pub(crate) name?: String,
  pub(crate) date?: Date,
  pub(crate) title?: String,
  pub(crate) count?: u32,
  pub(crate) status: String,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) content: String,
  pub(crate) valueSet?: String,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) useContext?: UsageContext,
  pub(crate) description?: String,
  pub(crate) supplements?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) caseSensitive?: Boolean,
  pub(crate) compositional?: Boolean,
  pub(crate) versionNeeded?: Boolean,
  pub(crate) hierarchyMeaning?: String,
  pub(crate) filter?: CodeSystem_Filter,
  pub(crate) property?: CodeSystem_Property,
  pub(crate) concept?: CodeSystem_Concept,
}