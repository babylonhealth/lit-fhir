use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct NamingSystem_UniqueId {
  pub(crate) id?: String,
  pub(crate) _type: String,
  pub(crate) value: String,
  pub(crate) period?: Period,
  pub(crate) comment?: String,
  pub(crate) extension?: Extension,
  pub(crate) preferred?: Boolean,
  pub(crate) modifierExtension?: Extension,
}

pub struct NamingSystem {
  pub(crate) name: String,
  pub(crate) kind: String,
  pub(crate) date: Date,
  pub(crate) _type?: CodeableConcept,
  pub(crate) usage?: String,
  pub(crate) status: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) publisher?: String,
  pub(crate) useContext?: UsageContext,
  pub(crate) responsible?: String,
  pub(crate) description?: String,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) uniqueId: NamingSystem_UniqueId,
}