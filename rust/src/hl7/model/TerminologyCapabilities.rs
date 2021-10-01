use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct TerminologyCapabilities_Closure {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) translation?: Boolean,
  pub(crate) modifierExtension?: Extension,
}


pub struct TerminologyCapabilities_Software {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) version?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct TerminologyCapabilities_Translation {
  pub(crate) id?: String,
  pub(crate) needsMap: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct TerminologyCapabilities_ValidateCode {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) translations: Boolean,
  pub(crate) modifierExtension?: Extension,
}


pub struct TerminologyCapabilities_Implementation {
  pub(crate) id?: String,
  pub(crate) url?: String,
  pub(crate) extension?: Extension,
  pub(crate) description: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct TerminologyCapabilities_Expansion_Parameter {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) extension?: Extension,
  pub(crate) documentation?: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct TerminologyCapabilities_Expansion {
  pub(crate) id?: String,
  pub(crate) paging?: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) incomplete?: Boolean,
  pub(crate) textFilter?: String,
  pub(crate) hierarchical?: Boolean,
  pub(crate) modifierExtension?: Extension,
  pub(crate) parameter?: TerminologyCapabilities_Expansion_Parameter,
}


pub struct TerminologyCapabilities_CodeSystem_Version_Filter {
  pub(crate) id?: String,
  pub(crate) op: String,
  pub(crate) code: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct TerminologyCapabilities_CodeSystem_Version {
  pub(crate) id?: String,
  pub(crate) code?: String,
  pub(crate) language?: String,
  pub(crate) property?: String,
  pub(crate) extension?: Extension,
  pub(crate) isDefault?: Boolean,
  pub(crate) compositional?: Boolean,
  pub(crate) modifierExtension?: Extension,
  pub(crate) filter?: TerminologyCapabilities_CodeSystem_Version_Filter,
}

pub struct TerminologyCapabilities_CodeSystem {
  pub(crate) id?: String,
  pub(crate) uri?: String,
  pub(crate) extension?: Extension,
  pub(crate) subsumption?: Boolean,
  pub(crate) modifierExtension?: Extension,
  pub(crate) version?: TerminologyCapabilities_CodeSystem_Version,
}

pub struct TerminologyCapabilities {
  pub(crate) url?: String,
  pub(crate) name?: String,
  pub(crate) date: Date,
  pub(crate) kind: String,
  pub(crate) title?: String,
  pub(crate) status: String,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) useContext?: UsageContext,
  pub(crate) lockedDate?: Boolean,
  pub(crate) codeSearch?: String,
  pub(crate) description?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) closure?: TerminologyCapabilities_Closure,
  pub(crate) software?: TerminologyCapabilities_Software,
  pub(crate) translation?: TerminologyCapabilities_Translation,
  pub(crate) validateCode?: TerminologyCapabilities_ValidateCode,
  pub(crate) implementation?: TerminologyCapabilities_Implementation,
  pub(crate) expansion?: TerminologyCapabilities_Expansion,
  pub(crate) codeSystem?: TerminologyCapabilities_CodeSystem,
}