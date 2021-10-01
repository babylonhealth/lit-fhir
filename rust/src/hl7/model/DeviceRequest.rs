use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct DeviceRequest_Parameter {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) value?: Boolean | CodeableConcept | Quantity | Range,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct DeviceRequest {
  pub(crate) note?: Annotation,
  pub(crate) status?: String,
  pub(crate) intent: String,
  pub(crate) basedOn?: Reference,
  pub(crate) code: CodeableConcept | Reference,
  pub(crate) subject: Reference,
  pub(crate) priority?: String,
  pub(crate) encounter?: Reference,
  pub(crate) requester?: Reference,
  pub(crate) performer?: Reference,
  pub(crate) insurance?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) authoredOn?: Date,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) priorRequest?: Reference,
  pub(crate) occurrence?: Date | Period | Timing,
  pub(crate) performerType?: CodeableConcept,
  pub(crate) supportingInfo?: Reference,
  pub(crate) instantiatesUri?: String,
  pub(crate) groupIdentifier?: Identifier,
  pub(crate) reasonReference?: Reference,
  pub(crate) relevantHistory?: Reference,
  pub(crate) instantiatesCanonical?: String,
  pub(crate) parameter?: DeviceRequest_Parameter,
}