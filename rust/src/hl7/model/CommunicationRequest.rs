use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct CommunicationRequest_Payload {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) content: Attachment | Reference | String,
  pub(crate) modifierExtension?: Extension,
}

pub struct CommunicationRequest {
  pub(crate) note?: Annotation,
  pub(crate) about?: Reference,
  pub(crate) status: String,
  pub(crate) medium?: CodeableConcept,
  pub(crate) sender?: Reference,
  pub(crate) basedOn?: Reference,
  pub(crate) subject?: Reference,
  pub(crate) replaces?: Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) priority?: String,
  pub(crate) encounter?: Reference,
  pub(crate) requester?: Reference,
  pub(crate) recipient?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) authoredOn?: Date,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) statusReason?: CodeableConcept,
  pub(crate) doNotPerform?: Boolean,
  pub(crate) occurrence?: Date | Period,
  pub(crate) groupIdentifier?: Identifier,
  pub(crate) reasonReference?: Reference,
  pub(crate) payload?: CommunicationRequest_Payload,
}