use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Substance_Instance {
  pub(crate) id?: String,
  pub(crate) expiry?: Date,
  pub(crate) quantity?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) identifier?: Identifier,
  pub(crate) modifierExtension?: Extension,
}


pub struct Substance_Ingredient {
  pub(crate) id?: String,
  pub(crate) quantity?: Ratio,
  pub(crate) extension?: Extension,
  pub(crate) substance: CodeableConcept | Reference,
  pub(crate) modifierExtension?: Extension,
}

pub struct Substance {
  pub(crate) code: CodeableConcept,
  pub(crate) status?: String,
  pub(crate) category?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) description?: String,
  pub(crate) instance?: Substance_Instance,
  pub(crate) ingredient?: Substance_Ingredient,
}