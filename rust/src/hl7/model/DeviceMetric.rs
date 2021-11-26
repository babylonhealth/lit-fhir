use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Timing::Timing;



#[derive(Clone, Debug)]
pub struct DeviceMetric_Calibration {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) time: Option<DateTime<FixedOffset>>,
  pub(crate) state: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct DeviceMetric {
  pub(crate) _type: CodeableConcept,
  pub(crate) unit: Option<CodeableConcept>,
  pub(crate) color: Option<String>,
  pub(crate) source: Option<Box<Reference>>,
  pub(crate) parent: Option<Box<Reference>>,
  pub(crate) category: String,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) operationalStatus: Option<String>,
  pub(crate) measurementPeriod: Option<Timing>,
  pub(crate) calibration: Vector<DeviceMetric_Calibration>,
}