use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct DocumentManifest_Related {
  pub(crate) id?: String,
  pub(crate) ref?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) identifier?: Identifier,
  pub(crate) modifierExtension?: Extension,
}

pub struct DocumentManifest {
  pub(crate) _type?: CodeableConcept,
  pub(crate) status: String,
  pub(crate) author?: Reference,
  pub(crate) source?: String,
  pub(crate) subject?: Reference,
  pub(crate) created?: Date,
  pub(crate) content: Reference,
  pub(crate) recipient?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) description?: String,
  pub(crate) masterIdentifier?: Identifier,
  pub(crate) related?: DocumentManifest_Related,
}