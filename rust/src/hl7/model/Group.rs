use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Group_Member {
  pub(crate) id?: String,
  pub(crate) entity: Reference,
  pub(crate) period?: Period,
  pub(crate) inactive?: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct Group_Characteristic {
  pub(crate) id?: String,
  pub(crate) code: CodeableConcept,
  pub(crate) period?: Period,
  pub(crate) exclude: Boolean,
  pub(crate) value: Boolean | CodeableConcept | Quantity | Range | Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct Group {
  pub(crate) _type: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) name?: String,
  pub(crate) active?: Boolean,
  pub(crate) actual: Boolean,
  pub(crate) quantity?: u32,
  pub(crate) identifier?: Identifier,
  pub(crate) managingEntity?: Reference,
  pub(crate) member?: Group_Member,
  pub(crate) characteristic?: Group_Characteristic,
}