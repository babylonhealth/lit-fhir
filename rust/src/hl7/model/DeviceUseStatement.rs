use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct DeviceUseStatement {
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: String,
  pub(crate) source: Option<Reference>,
  pub(crate) device: Reference,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Reference,
  pub(crate) bodySite: Option<CodeableConcept>,
  pub(crate) timing: Option<Date | Period | Timing>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) recordedOn: Option<Date>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) derivedFrom: Vector<Reference>,
  pub(crate) reasonReference: Vector<Reference>,
}