use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Substance_Instance {
  pub(crate) id: Option<String>,
  pub(crate) expiry: Option<Date>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Substance_Ingredient {
  pub(crate) id: Option<String>,
  pub(crate) quantity: Option<Ratio>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) substance: CodeableConcept | Reference,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Substance {
  pub(crate) code: CodeableConcept,
  pub(crate) status: Option<String>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) description: Option<String>,
  pub(crate) instance: Vector<Substance_Instance>,
  pub(crate) ingredient: Vector<Substance_Ingredient>,
}