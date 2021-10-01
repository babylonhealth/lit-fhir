use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct SupplyRequest_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) value: Option<Boolean | CodeableConcept | Quantity | Range>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct SupplyRequest {
  pub(crate) status: Option<String>,
  pub(crate) item: CodeableConcept | Reference,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) priority: Option<String>,
  pub(crate) quantity: Quantity,
  pub(crate) supplier: Vector<Reference>,
  pub(crate) requester: Option<Reference>,
  pub(crate) deliverTo: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) authoredOn: Option<Date>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) deliverFrom: Option<Reference>,
  pub(crate) occurrence: Option<Date | Period | Timing>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) parameter: Vector<SupplyRequest_Parameter>,
}