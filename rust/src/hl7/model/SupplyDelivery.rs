use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct SupplyDelivery_SuppliedItem {
  pub(crate) id?: String,
  pub(crate) item?: CodeableConcept | Reference,
  pub(crate) quantity?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct SupplyDelivery {
  pub(crate) _type?: CodeableConcept,
  pub(crate) partOf?: Reference,
  pub(crate) status?: String,
  pub(crate) basedOn?: Reference,
  pub(crate) patient?: Reference,
  pub(crate) supplier?: Reference,
  pub(crate) receiver?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) destination?: Reference,
  pub(crate) occurrence?: Date | Period | Timing,
  pub(crate) suppliedItem?: SupplyDelivery_SuppliedItem,
}