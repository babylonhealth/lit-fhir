use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct DocumentManifest_Related {
  pub(crate) id: Option<String>,
  pub(crate) ref: Option<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct DocumentManifest {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) status: String,
  pub(crate) author: Vector<Reference>,
  pub(crate) source: Option<String>,
  pub(crate) subject: Option<Reference>,
  pub(crate) created: Option<Date>,
  pub(crate) content: Vector<Reference>,
  pub(crate) recipient: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) description: Option<String>,
  pub(crate) masterIdentifier: Option<Identifier>,
  pub(crate) related: Vector<DocumentManifest_Related>,
}