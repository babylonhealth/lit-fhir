use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Medication_Batch {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) lotNumber?: String,
  pub(crate) expirationDate?: Date,
  pub(crate) modifierExtension?: Extension,
}


pub struct Medication_Ingredient {
  pub(crate) id?: String,
  pub(crate) item: CodeableConcept | Reference,
  pub(crate) isActive?: Boolean,
  pub(crate) strength?: Ratio,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct Medication {
  pub(crate) code?: CodeableConcept,
  pub(crate) form?: CodeableConcept,
  pub(crate) status?: String,
  pub(crate) amount?: Ratio,
  pub(crate) identifier?: Identifier,
  pub(crate) manufacturer?: Reference,
  pub(crate) batch?: Medication_Batch,
  pub(crate) ingredient?: Medication_Ingredient,
}