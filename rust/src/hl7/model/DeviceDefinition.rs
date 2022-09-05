use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::UnionReferenceOrString;
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
pub struct DeviceDefinition_Property {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) valueCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) valueQuantity: Vector<Box<dyn Quantity>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct DeviceDefinition_DeviceName {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) _type: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct DeviceDefinition_Capability {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Vector<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct DeviceDefinition_Material {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) substance: Box<dyn CodeableConcept>,
  pub(crate) alternate: Option<bool>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) allergenicIndicator: Option<bool>,
}


#[derive(Clone, Debug)]
pub struct DeviceDefinition_Specialization {
  pub(crate) id: Option<String>,
  pub(crate) version: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) systemType: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct DeviceDefinition_UdiDeviceIdentifier {
  pub(crate) id: Option<String>,
  pub(crate) issuer: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) jurisdiction: String,
  pub(crate) deviceIdentifier: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct DeviceDefinitionRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) owner: Option<Box<dyn Reference>>,
  pub(crate) safety: Vector<Box<dyn CodeableConcept>>,
  pub(crate) version: Vector<String>,
  pub(crate) contact: Vector<Box<dyn ContactPoint>>,
  pub(crate) language: Option<String>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) modelNumber: Option<String>,
  pub(crate) languageCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) parentDevice: Option<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) manufacturer: Option<UnionReferenceOrString>,
  pub(crate) shelfLifeStorage: Vector<any>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) onlineInformation: Option<String>,
  pub(crate) physicalCharacteristics: Option<any>,
  pub(crate) property: Vector<DeviceDefinition_Property>,
  pub(crate) deviceName: Vector<DeviceDefinition_DeviceName>,
  pub(crate) capability: Vector<DeviceDefinition_Capability>,
  pub(crate) material: Vector<DeviceDefinition_Material>,
  pub(crate) specialization: Vector<DeviceDefinition_Specialization>,
  pub(crate) udiDeviceIdentifier: Vector<DeviceDefinition_UdiDeviceIdentifier>,
}

pub trait DeviceDefinition : DomainResource {
  fn url(&self) -> &Option<String>;
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn owner(&self) -> &Option<Box<dyn Reference>>;
  fn safety(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn version(&self) -> &Vector<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactPoint>>;
  fn quantity(&self) -> &Option<Box<dyn Quantity>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn modelNumber(&self) -> &Option<String>;
  fn languageCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn parentDevice(&self) -> &Option<Box<dyn Reference>>;
  fn manufacturer(&self) -> &Option<UnionReferenceOrString>;
  fn shelfLifeStorage(&self) -> &Vector<any>;
  fn onlineInformation(&self) -> &Option<String>;
  fn physicalCharacteristics(&self) -> &Option<any>;
  fn property(&self) -> &Vector<DeviceDefinition_Property>;
  fn deviceName(&self) -> &Vector<DeviceDefinition_DeviceName>;
  fn capability(&self) -> &Vector<DeviceDefinition_Capability>;
  fn material(&self) -> &Vector<DeviceDefinition_Material>;
  fn specialization(&self) -> &Vector<DeviceDefinition_Specialization>;
  fn udiDeviceIdentifier(&self) -> &Vector<DeviceDefinition_UdiDeviceIdentifier>;
}

dyn_clone::clone_trait_object!(DeviceDefinition);

impl FHIRObject for DeviceDefinitionRaw {
}

impl Resource for DeviceDefinitionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for DeviceDefinitionRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl DeviceDefinition for DeviceDefinitionRaw {
  fn url(&self) -> &Option<String> { &self.url }
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>> { &self._type }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn owner(&self) -> &Option<Box<dyn Reference>> { &self.owner }
  fn safety(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.safety }
  fn version(&self) -> &Vector<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactPoint>> { &self.contact }
  fn quantity(&self) -> &Option<Box<dyn Quantity>> { &self.quantity }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn modelNumber(&self) -> &Option<String> { &self.modelNumber }
  fn languageCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.languageCode }
  fn parentDevice(&self) -> &Option<Box<dyn Reference>> { &self.parentDevice }
  fn manufacturer(&self) -> &Option<UnionReferenceOrString> { &self.manufacturer }
  fn shelfLifeStorage(&self) -> &Vector<any> { &self.shelfLifeStorage }
  fn onlineInformation(&self) -> &Option<String> { &self.onlineInformation }
  fn physicalCharacteristics(&self) -> &Option<any> { &self.physicalCharacteristics }
  fn property(&self) -> &Vector<DeviceDefinition_Property> { &self.property }
  fn deviceName(&self) -> &Vector<DeviceDefinition_DeviceName> { &self.deviceName }
  fn capability(&self) -> &Vector<DeviceDefinition_Capability> { &self.capability }
  fn material(&self) -> &Vector<DeviceDefinition_Material> { &self.material }
  fn specialization(&self) -> &Vector<DeviceDefinition_Specialization> { &self.specialization }
  fn udiDeviceIdentifier(&self) -> &Vector<DeviceDefinition_UdiDeviceIdentifier> { &self.udiDeviceIdentifier }
}

