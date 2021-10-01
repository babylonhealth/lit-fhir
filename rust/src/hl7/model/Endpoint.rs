use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Endpoint {
  pub(crate) name?: String,
  pub(crate) status: String,
  pub(crate) period?: Period,
  pub(crate) header?: String,
  pub(crate) contact?: ContactPoint,
  pub(crate) address: String,
  pub(crate) identifier?: Identifier,
  pub(crate) payloadType: CodeableConcept,
  pub(crate) connectionType: Coding,
  pub(crate) payloadMimeType?: String,
  pub(crate) managingOrganization?: Reference,
}