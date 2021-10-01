use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Account_Coverage {
  pub(crate) id?: String,
  pub(crate) coverage: Reference,
  pub(crate) priority?: u32,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct Account_Guarantor {
  pub(crate) id?: String,
  pub(crate) party: Reference,
  pub(crate) onHold?: Boolean,
  pub(crate) period?: Period,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct Account {
  pub(crate) _type?: CodeableConcept,
  pub(crate) name?: String,
  pub(crate) owner?: Reference,
  pub(crate) status: String,
  pub(crate) partOf?: Reference,
  pub(crate) subject?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) description?: String,
  pub(crate) servicePeriod?: Period,
  pub(crate) coverage?: Account_Coverage,
  pub(crate) guarantor?: Account_Guarantor,
}