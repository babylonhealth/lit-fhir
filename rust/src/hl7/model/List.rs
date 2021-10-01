use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct List_Entry {
  pub(crate) id?: String,
  pub(crate) flag?: CodeableConcept,
  pub(crate) date?: Date,
  pub(crate) item: Reference,
  pub(crate) deleted?: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct List {
  pub(crate) mode: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) date?: Date,
  pub(crate) note?: Annotation,
  pub(crate) title?: String,
  pub(crate) status: String,
  pub(crate) source?: Reference,
  pub(crate) subject?: Reference,
  pub(crate) encounter?: Reference,
  pub(crate) orderedBy?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) emptyReason?: CodeableConcept,
  pub(crate) entry?: List_Entry,
}