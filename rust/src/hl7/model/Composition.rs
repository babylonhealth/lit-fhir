use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Composition_Event {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) period?: Period,
  pub(crate) detail?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct Composition_Section {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) text?: Narrative,
  pub(crate) mode?: String,
  pub(crate) title?: String,
  pub(crate) focus?: Reference,
  pub(crate) entry?: Reference,
  pub(crate) author?: Reference,
  pub(crate) section?: Composition_Section,
  pub(crate) extension?: Extension,
  pub(crate) orderedBy?: CodeableConcept,
  pub(crate) emptyReason?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}


pub struct Composition_Attester {
  pub(crate) id?: String,
  pub(crate) mode: String,
  pub(crate) time?: Date,
  pub(crate) party?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct Composition_RelatesTo {
  pub(crate) id?: String,
  pub(crate) code: String,
  pub(crate) extension?: Extension,
  pub(crate) target: Identifier | Reference,
  pub(crate) modifierExtension?: Extension,
}

pub struct Composition {
  pub(crate) _type: CodeableConcept,
  pub(crate) date: Date,
  pub(crate) title: String,
  pub(crate) status: String,
  pub(crate) author: Reference,
  pub(crate) subject?: Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) encounter?: Reference,
  pub(crate) custodian?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) confidentiality?: String,
  pub(crate) event?: Composition_Event,
  pub(crate) section?: Composition_Section,
  pub(crate) attester?: Composition_Attester,
  pub(crate) relatesTo?: Composition_RelatesTo,
}