use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct SupplyDelivery_SuppliedItem {
  pub(crate) id: Option<String>,
  pub(crate) item: Option<CodeableConcept | Reference>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct SupplyDelivery {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: Option<String>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) patient: Option<Reference>,
  pub(crate) supplier: Option<Reference>,
  pub(crate) receiver: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) destination: Option<Reference>,
  pub(crate) occurrence: Option<Date | Period | Timing>,
  pub(crate) suppliedItem: Option<SupplyDelivery_SuppliedItem>,
}