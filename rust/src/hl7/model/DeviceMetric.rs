use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct DeviceMetric_Calibration {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) time: Option<Date>,
  pub(crate) state: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct DeviceMetric {
  pub(crate) _type: CodeableConcept,
  pub(crate) unit: Option<CodeableConcept>,
  pub(crate) color: Option<String>,
  pub(crate) source: Option<Reference>,
  pub(crate) parent: Option<Reference>,
  pub(crate) category: String,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) operationalStatus: Option<String>,
  pub(crate) measurementPeriod: Option<Timing>,
  pub(crate) calibration: Vector<DeviceMetric_Calibration>,
}