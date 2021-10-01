use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct SearchParameter_Component {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) definition: String,
  pub(crate) expression: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct SearchParameter {
  pub(crate) url: String,
  pub(crate) name: String,
  pub(crate) date?: Date,
  pub(crate) code: String,
  pub(crate) base: String,
  pub(crate) _type: String,
  pub(crate) xpath?: String,
  pub(crate) chain?: String,
  pub(crate) status: String,
  pub(crate) target?: String,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) modifier?: String,
  pub(crate) publisher?: String,
  pub(crate) useContext?: UsageContext,
  pub(crate) expression?: String,
  pub(crate) xpathUsage?: String,
  pub(crate) multipleOr?: Boolean,
  pub(crate) comparator?: String,
  pub(crate) derivedFrom?: String,
  pub(crate) description: String,
  pub(crate) multipleAnd?: Boolean,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) component?: SearchParameter_Component,
}