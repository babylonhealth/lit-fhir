use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Endpoint {
  pub(crate) name: Option<String>,
  pub(crate) status: String,
  pub(crate) period: Option<Period>,
  pub(crate) header: Vector<String>,
  pub(crate) contact: Vector<ContactPoint>,
  pub(crate) address: String,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) payloadType: Vector<CodeableConcept>,
  pub(crate) connectionType: Coding,
  pub(crate) payloadMimeType: Vector<String>,
  pub(crate) managingOrganization: Option<Reference>,
}