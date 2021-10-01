use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Communication_Payload {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) content: Attachment | Reference | String,
  pub(crate) modifierExtension?: Extension,
}

pub struct Communication {
  pub(crate) sent?: Date,
  pub(crate) note?: Annotation,
  pub(crate) topic?: CodeableConcept,
  pub(crate) about?: Reference,
  pub(crate) partOf?: Reference,
  pub(crate) status: String,
  pub(crate) medium?: CodeableConcept,
  pub(crate) sender?: Reference,
  pub(crate) basedOn?: Reference,
  pub(crate) subject?: Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) priority?: String,
  pub(crate) received?: Date,
  pub(crate) encounter?: Reference,
  pub(crate) recipient?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) inResponseTo?: Reference,
  pub(crate) statusReason?: CodeableConcept,
  pub(crate) instantiatesUri?: String,
  pub(crate) reasonReference?: Reference,
  pub(crate) instantiatesCanonical?: String,
  pub(crate) payload?: Communication_Payload,
}