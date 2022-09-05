use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Device_Version {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) value: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) component: Option<Box<dyn Identifier>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Device_Property {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) valueCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) valueQuantity: Vector<Box<dyn Quantity>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Device_UdiCarrier {
  pub(crate) id: Option<String>,
  pub(crate) issuer: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) entryType: Option<String>,
  pub(crate) carrierHRF: Option<String>,
  pub(crate) carrierAIDC: Option<String>,
  pub(crate) jurisdiction: Option<String>,
  pub(crate) deviceIdentifier: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Device_DeviceName {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) _type: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Device_Specialization {
  pub(crate) id: Option<String>,
  pub(crate) version: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) systemType: Box<dyn CodeableConcept>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct DeviceRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) owner: Option<Box<dyn Reference>>,
  pub(crate) status: Option<String>,
  pub(crate) safety: Vector<Box<dyn CodeableConcept>>,
  pub(crate) parent: Option<Box<dyn Reference>>,
  pub(crate) patient: Option<Box<dyn Reference>>,
  pub(crate) contact: Vector<Box<dyn ContactPoint>>,
  pub(crate) language: Option<String>,
  pub(crate) location: Option<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) lotNumber: Option<String>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) definition: Option<Box<dyn Reference>>,
  pub(crate) partNumber: Option<String>,
  pub(crate) modelNumber: Option<String>,
  pub(crate) statusReason: Vector<Box<dyn CodeableConcept>>,
  pub(crate) manufacturer: Option<String>,
  pub(crate) serialNumber: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) expirationDate: Option<DateTime<FixedOffset>>,
  pub(crate) manufactureDate: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) distinctIdentifier: Option<String>,
  pub(crate) version: Vector<Device_Version>,
  pub(crate) property: Vector<Device_Property>,
  pub(crate) udiCarrier: Vector<Device_UdiCarrier>,
  pub(crate) deviceName: Vector<Device_DeviceName>,
  pub(crate) specialization: Vector<Device_Specialization>,
}

pub trait Device : DomainResource {
  fn url(&self) -> &Option<String>;
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn owner(&self) -> &Option<Box<dyn Reference>>;
  fn status(&self) -> &Option<String>;
  fn safety(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn parent(&self) -> &Option<Box<dyn Reference>>;
  fn patient(&self) -> &Option<Box<dyn Reference>>;
  fn contact(&self) -> &Vector<Box<dyn ContactPoint>>;
  fn location(&self) -> &Option<Box<dyn Reference>>;
  fn lotNumber(&self) -> &Option<String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn definition(&self) -> &Option<Box<dyn Reference>>;
  fn partNumber(&self) -> &Option<String>;
  fn modelNumber(&self) -> &Option<String>;
  fn statusReason(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn manufacturer(&self) -> &Option<String>;
  fn serialNumber(&self) -> &Option<String>;
  fn expirationDate(&self) -> &Option<DateTime<FixedOffset>>;
  fn manufactureDate(&self) -> &Option<DateTime<FixedOffset>>;
  fn distinctIdentifier(&self) -> &Option<String>;
  fn version(&self) -> &Vector<Device_Version>;
  fn property(&self) -> &Vector<Device_Property>;
  fn udiCarrier(&self) -> &Vector<Device_UdiCarrier>;
  fn deviceName(&self) -> &Vector<Device_DeviceName>;
  fn specialization(&self) -> &Vector<Device_Specialization>;
}

dyn_clone::clone_trait_object!(Device);

impl FHIRObject for DeviceRaw {
}

impl Resource for DeviceRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for DeviceRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Device for DeviceRaw {
  fn url(&self) -> &Option<String> { &self.url }
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>> { &self._type }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn owner(&self) -> &Option<Box<dyn Reference>> { &self.owner }
  fn status(&self) -> &Option<String> { &self.status }
  fn safety(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.safety }
  fn parent(&self) -> &Option<Box<dyn Reference>> { &self.parent }
  fn patient(&self) -> &Option<Box<dyn Reference>> { &self.patient }
  fn contact(&self) -> &Vector<Box<dyn ContactPoint>> { &self.contact }
  fn location(&self) -> &Option<Box<dyn Reference>> { &self.location }
  fn lotNumber(&self) -> &Option<String> { &self.lotNumber }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn definition(&self) -> &Option<Box<dyn Reference>> { &self.definition }
  fn partNumber(&self) -> &Option<String> { &self.partNumber }
  fn modelNumber(&self) -> &Option<String> { &self.modelNumber }
  fn statusReason(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.statusReason }
  fn manufacturer(&self) -> &Option<String> { &self.manufacturer }
  fn serialNumber(&self) -> &Option<String> { &self.serialNumber }
  fn expirationDate(&self) -> &Option<DateTime<FixedOffset>> { &self.expirationDate }
  fn manufactureDate(&self) -> &Option<DateTime<FixedOffset>> { &self.manufactureDate }
  fn distinctIdentifier(&self) -> &Option<String> { &self.distinctIdentifier }
  fn version(&self) -> &Vector<Device_Version> { &self.version }
  fn property(&self) -> &Vector<Device_Property> { &self.property }
  fn udiCarrier(&self) -> &Vector<Device_UdiCarrier> { &self.udiCarrier }
  fn deviceName(&self) -> &Vector<Device_DeviceName> { &self.deviceName }
  fn specialization(&self) -> &Vector<Device_Specialization> { &self.specialization }
}

