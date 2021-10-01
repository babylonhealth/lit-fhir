use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MessageDefinition_Focus {
  pub(crate) id?: String,
  pub(crate) min: u32,
  pub(crate) max?: String,
  pub(crate) code: String,
  pub(crate) profile?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct MessageDefinition_AllowedResponse {
  pub(crate) id?: String,
  pub(crate) message: String,
  pub(crate) extension?: Extension,
  pub(crate) situation?: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct MessageDefinition {
  pub(crate) url?: String,
  pub(crate) name?: String,
  pub(crate) date: Date,
  pub(crate) base?: String,
  pub(crate) title?: String,
  pub(crate) graph?: String,
  pub(crate) status: String,
  pub(crate) parent?: String,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) replaces?: String,
  pub(crate) event: Coding | String,
  pub(crate) category?: String,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) useContext?: UsageContext,
  pub(crate) description?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) responseRequired?: String,
  pub(crate) focus?: MessageDefinition_Focus,
  pub(crate) allowedResponse?: MessageDefinition_AllowedResponse,
}