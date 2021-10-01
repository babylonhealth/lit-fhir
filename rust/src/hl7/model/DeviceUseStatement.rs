use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct DeviceUseStatement {
  pub(crate) note?: Annotation,
  pub(crate) status: String,
  pub(crate) source?: Reference,
  pub(crate) device: Reference,
  pub(crate) basedOn?: Reference,
  pub(crate) subject: Reference,
  pub(crate) bodySite?: CodeableConcept,
  pub(crate) timing?: Date | Period | Timing,
  pub(crate) identifier?: Identifier,
  pub(crate) recordedOn?: Date,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) derivedFrom?: Reference,
  pub(crate) reasonReference?: Reference,
}