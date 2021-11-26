use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Period::Period;



#[derive(Clone, Debug)]
pub struct Account_Coverage {
  pub(crate) id: Option<String>,
  pub(crate) coverage: Box<Reference>,
  pub(crate) priority: Option<u32>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Account_Guarantor {
  pub(crate) id: Option<String>,
  pub(crate) party: Box<Reference>,
  pub(crate) onHold: Option<bool>,
  pub(crate) period: Option<Period>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Account {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) name: Option<String>,
  pub(crate) owner: Option<Box<Reference>>,
  pub(crate) status: String,
  pub(crate) partOf: Option<Box<Reference>>,
  pub(crate) subject: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) description: Option<String>,
  pub(crate) servicePeriod: Option<Period>,
  pub(crate) coverage: Vector<Account_Coverage>,
  pub(crate) guarantor: Vector<Account_Guarantor>,
}