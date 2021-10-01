use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MessageHeader_Source {
  pub(crate) id?: String,
  pub(crate) name?: String,
  pub(crate) version?: String,
  pub(crate) contact?: ContactPoint,
  pub(crate) software?: String,
  pub(crate) endpoint: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct MessageHeader_Response {
  pub(crate) id?: String,
  pub(crate) code: String,
  pub(crate) details?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) identifier: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct MessageHeader_Destination {
  pub(crate) id?: String,
  pub(crate) name?: String,
  pub(crate) target?: Reference,
  pub(crate) endpoint: String,
  pub(crate) receiver?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct MessageHeader {
  pub(crate) focus?: Reference,
  pub(crate) sender?: Reference,
  pub(crate) author?: Reference,
  pub(crate) reason?: CodeableConcept,
  pub(crate) enterer?: Reference,
  pub(crate) event: Coding | String,
  pub(crate) definition?: String,
  pub(crate) responsible?: Reference,
  pub(crate) source: MessageHeader_Source,
  pub(crate) response?: MessageHeader_Response,
  pub(crate) destination?: MessageHeader_Destination,
}