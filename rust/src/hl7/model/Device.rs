use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

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
  pub(crate) version: Vector<Box<Device_Version>>,
  pub(crate) property: Vector<Box<Device_Property>>,
  pub(crate) udiCarrier: Vector<Box<Device_UdiCarrier>>,
  pub(crate) deviceName: Vector<Box<Device_DeviceName>>,
  pub(crate) specialization: Vector<Box<Device_Specialization>>,
}

pub trait Device : DomainResource {
  fn url(&self) -> Option<&String>;
  fn _type(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn owner(&self) -> Option<&Box<dyn Reference>>;
  fn status(&self) -> Option<&String>;
  fn safety(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn parent(&self) -> Option<&Box<dyn Reference>>;
  fn patient(&self) -> Option<&Box<dyn Reference>>;
  fn contact(&self) -> &Vector<Box<dyn ContactPoint>>;
  fn location(&self) -> Option<&Box<dyn Reference>>;
  fn lotNumber(&self) -> Option<&String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn definition(&self) -> Option<&Box<dyn Reference>>;
  fn partNumber(&self) -> Option<&String>;
  fn modelNumber(&self) -> Option<&String>;
  fn statusReason(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn manufacturer(&self) -> Option<&String>;
  fn serialNumber(&self) -> Option<&String>;
  fn expirationDate(&self) -> Option<&DateTime<FixedOffset>>;
  fn manufactureDate(&self) -> Option<&DateTime<FixedOffset>>;
  fn distinctIdentifier(&self) -> Option<&String>;
  fn version(&self) -> &Vector<Box<Device_Version>>;
  fn property(&self) -> &Vector<Box<Device_Property>>;
  fn udiCarrier(&self) -> &Vector<Box<Device_UdiCarrier>>;
  fn deviceName(&self) -> &Vector<Box<Device_DeviceName>>;
  fn specialization(&self) -> &Vector<Box<Device_Specialization>>;
}

dyn_clone::clone_trait_object!(Device);

impl FHIRObject for DeviceRaw {
}

impl Resource for DeviceRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for DeviceRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Device for DeviceRaw {
  fn url(&self) -> Option<&String> { self.url.as_ref() }
  fn _type(&self) -> Option<&Box<dyn CodeableConcept>> { self._type.as_ref() }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn owner(&self) -> Option<&Box<dyn Reference>> { self.owner.as_ref() }
  fn status(&self) -> Option<&String> { self.status.as_ref() }
  fn safety(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.safety }
  fn parent(&self) -> Option<&Box<dyn Reference>> { self.parent.as_ref() }
  fn patient(&self) -> Option<&Box<dyn Reference>> { self.patient.as_ref() }
  fn contact(&self) -> &Vector<Box<dyn ContactPoint>> { &self.contact }
  fn location(&self) -> Option<&Box<dyn Reference>> { self.location.as_ref() }
  fn lotNumber(&self) -> Option<&String> { self.lotNumber.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn definition(&self) -> Option<&Box<dyn Reference>> { self.definition.as_ref() }
  fn partNumber(&self) -> Option<&String> { self.partNumber.as_ref() }
  fn modelNumber(&self) -> Option<&String> { self.modelNumber.as_ref() }
  fn statusReason(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.statusReason }
  fn manufacturer(&self) -> Option<&String> { self.manufacturer.as_ref() }
  fn serialNumber(&self) -> Option<&String> { self.serialNumber.as_ref() }
  fn expirationDate(&self) -> Option<&DateTime<FixedOffset>> { self.expirationDate.as_ref() }
  fn manufactureDate(&self) -> Option<&DateTime<FixedOffset>> { self.manufactureDate.as_ref() }
  fn distinctIdentifier(&self) -> Option<&String> { self.distinctIdentifier.as_ref() }
  fn version(&self) -> &Vector<Box<Device_Version>> { &self.version }
  fn property(&self) -> &Vector<Box<Device_Property>> { &self.property }
  fn udiCarrier(&self) -> &Vector<Box<Device_UdiCarrier>> { &self.udiCarrier }
  fn deviceName(&self) -> &Vector<Box<Device_DeviceName>> { &self.deviceName }
  fn specialization(&self) -> &Vector<Box<Device_Specialization>> { &self.specialization }
}

