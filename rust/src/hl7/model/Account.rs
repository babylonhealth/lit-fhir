use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Account_Coverage {
  pub(crate) id: Option<String>,
  pub(crate) coverage: Reference,
  pub(crate) priority: Option<u32>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Account_Guarantor {
  pub(crate) id: Option<String>,
  pub(crate) party: Reference,
  pub(crate) onHold: Option<Boolean>,
  pub(crate) period: Option<Period>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Account {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) name: Option<String>,
  pub(crate) owner: Option<Reference>,
  pub(crate) status: String,
  pub(crate) partOf: Option<Reference>,
  pub(crate) subject: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) description: Option<String>,
  pub(crate) servicePeriod: Option<Period>,
  pub(crate) coverage: Vector<Account_Coverage>,
  pub(crate) guarantor: Vector<Account_Guarantor>,
}