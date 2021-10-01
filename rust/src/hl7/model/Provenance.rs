use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Provenance_Agent {
  pub(crate) id?: String,
  pub(crate) who: Reference,
  pub(crate) _type?: CodeableConcept,
  pub(crate) role?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) onBehalfOf?: Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct Provenance_Entity {
  pub(crate) id?: String,
  pub(crate) role: String,
  pub(crate) what: Reference,
  pub(crate) agent?: Provenance_Agent,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct Provenance {
  pub(crate) target: Reference,
  pub(crate) policy?: String,
  pub(crate) reason?: CodeableConcept,
  pub(crate) recorded: Date,
  pub(crate) location?: Reference,
  pub(crate) activity?: CodeableConcept,
  pub(crate) signature?: Signature,
  pub(crate) occurred?: Date | Period,
  pub(crate) agent: Provenance_Agent,
  pub(crate) entity?: Provenance_Entity,
}