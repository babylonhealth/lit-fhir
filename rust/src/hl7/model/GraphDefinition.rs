use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct GraphDefinition_Link_Target_Compartment {
  pub(crate) id?: String,
  pub(crate) use: String,
  pub(crate) code: String,
  pub(crate) rule: String,
  pub(crate) extension?: Extension,
  pub(crate) expression?: String,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct GraphDefinition_Link_Target {
  pub(crate) id?: String,
  pub(crate) _type: String,
  pub(crate) link?: GraphDefinition_Link,
  pub(crate) params?: String,
  pub(crate) profile?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) compartment?: GraphDefinition_Link_Target_Compartment,
}

pub struct GraphDefinition_Link {
  pub(crate) id?: String,
  pub(crate) min?: i32,
  pub(crate) max?: String,
  pub(crate) path?: String,
  pub(crate) extension?: Extension,
  pub(crate) sliceName?: String,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) target?: GraphDefinition_Link_Target,
}

pub struct GraphDefinition {
  pub(crate) url?: String,
  pub(crate) name: String,
  pub(crate) date?: Date,
  pub(crate) start: String,
  pub(crate) status: String,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) profile?: String,
  pub(crate) publisher?: String,
  pub(crate) useContext?: UsageContext,
  pub(crate) description?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) link?: GraphDefinition_Link,
}