use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct SupplyRequest_Parameter {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) value?: Boolean | CodeableConcept | Quantity | Range,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct SupplyRequest {
  pub(crate) status?: String,
  pub(crate) item: CodeableConcept | Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) priority?: String,
  pub(crate) quantity: Quantity,
  pub(crate) supplier?: Reference,
  pub(crate) requester?: Reference,
  pub(crate) deliverTo?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) authoredOn?: Date,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) deliverFrom?: Reference,
  pub(crate) occurrence?: Date | Period | Timing,
  pub(crate) reasonReference?: Reference,
  pub(crate) parameter?: SupplyRequest_Parameter,
}