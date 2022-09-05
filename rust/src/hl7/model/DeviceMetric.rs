use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Timing::Timing;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct DeviceMetric_Calibration {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) time: Option<DateTime<FixedOffset>>,
  pub(crate) state: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct DeviceMetricRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) unit: Option<Box<dyn CodeableConcept>>,
  pub(crate) color: Option<String>,
  pub(crate) source: Option<Box<dyn Reference>>,
  pub(crate) parent: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) category: String,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) operationalStatus: Option<String>,
  pub(crate) measurementPeriod: Option<Box<dyn Timing>>,
  pub(crate) calibration: Vector<DeviceMetric_Calibration>,
}

pub trait DeviceMetric : DomainResource {
  fn _type(&self) -> &Box<dyn CodeableConcept>;
  fn unit(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn color(&self) -> &Option<String>;
  fn source(&self) -> &Option<Box<dyn Reference>>;
  fn parent(&self) -> &Option<Box<dyn Reference>>;
  fn category(&self) -> &String;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn operationalStatus(&self) -> &Option<String>;
  fn measurementPeriod(&self) -> &Option<Box<dyn Timing>>;
  fn calibration(&self) -> &Vector<DeviceMetric_Calibration>;
}

dyn_clone::clone_trait_object!(DeviceMetric);

impl FHIRObject for DeviceMetricRaw {
}

impl Resource for DeviceMetricRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for DeviceMetricRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl DeviceMetric for DeviceMetricRaw {
  fn _type(&self) -> &Box<dyn CodeableConcept> { &self._type }
  fn unit(&self) -> &Option<Box<dyn CodeableConcept>> { &self.unit }
  fn color(&self) -> &Option<String> { &self.color }
  fn source(&self) -> &Option<Box<dyn Reference>> { &self.source }
  fn parent(&self) -> &Option<Box<dyn Reference>> { &self.parent }
  fn category(&self) -> &String { &self.category }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn operationalStatus(&self) -> &Option<String> { &self.operationalStatus }
  fn measurementPeriod(&self) -> &Option<Box<dyn Timing>> { &self.measurementPeriod }
  fn calibration(&self) -> &Vector<DeviceMetric_Calibration> { &self.calibration }
}

