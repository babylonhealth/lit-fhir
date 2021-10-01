use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct DeviceRequest_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) value: Option<Boolean | CodeableConcept | Quantity | Range>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct DeviceRequest {
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: Option<String>,
  pub(crate) intent: String,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) code: CodeableConcept | Reference,
  pub(crate) subject: Reference,
  pub(crate) priority: Option<String>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) requester: Option<Reference>,
  pub(crate) performer: Option<Reference>,
  pub(crate) insurance: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) authoredOn: Option<Date>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) priorRequest: Vector<Reference>,
  pub(crate) occurrence: Option<Date | Period | Timing>,
  pub(crate) performerType: Option<CodeableConcept>,
  pub(crate) supportingInfo: Vector<Reference>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) groupIdentifier: Option<Identifier>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) relevantHistory: Vector<Reference>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) parameter: Vector<DeviceRequest_Parameter>,
}