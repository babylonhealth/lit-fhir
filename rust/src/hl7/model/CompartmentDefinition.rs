use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct CompartmentDefinition_Resource {
  pub(crate) id?: String,
  pub(crate) code: String,
  pub(crate) param?: String,
  pub(crate) extension?: Extension,
  pub(crate) documentation?: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct CompartmentDefinition {
  pub(crate) url: String,
  pub(crate) name: String,
  pub(crate) date?: Date,
  pub(crate) code: String,
  pub(crate) status: String,
  pub(crate) search: Boolean,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) publisher?: String,
  pub(crate) useContext?: UsageContext,
  pub(crate) description?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) resource?: CompartmentDefinition_Resource,
}