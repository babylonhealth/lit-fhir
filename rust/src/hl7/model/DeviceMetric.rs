use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct DeviceMetric_Calibration {
  pub(crate) id?: String,
  pub(crate) _type?: String,
  pub(crate) time?: Date,
  pub(crate) state?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct DeviceMetric {
  pub(crate) _type: CodeableConcept,
  pub(crate) unit?: CodeableConcept,
  pub(crate) color?: String,
  pub(crate) source?: Reference,
  pub(crate) parent?: Reference,
  pub(crate) category: String,
  pub(crate) identifier?: Identifier,
  pub(crate) operationalStatus?: String,
  pub(crate) measurementPeriod?: Timing,
  pub(crate) calibration?: DeviceMetric_Calibration,
}