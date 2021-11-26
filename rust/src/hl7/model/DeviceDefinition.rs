use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


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
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct DeviceDefinition_Property {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) valueCode: Vector<CodeableConcept>,
  pub(crate) valueQuantity: Vector<Quantity>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct DeviceDefinition_DeviceName {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) _type: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct DeviceDefinition_Capability {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Vector<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct DeviceDefinition_Material {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) substance: CodeableConcept,
  pub(crate) alternate: Option<bool>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) allergenicIndicator: Option<bool>,
}


#[derive(Clone, Debug)]
pub struct DeviceDefinition_Specialization {
  pub(crate) id: Option<String>,
  pub(crate) version: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) systemType: String,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct DeviceDefinition_UdiDeviceIdentifier {
  pub(crate) id: Option<String>,
  pub(crate) issuer: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) jurisdiction: String,
  pub(crate) deviceIdentifier: String,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct DeviceDefinition {
  pub(crate) url: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) owner: Option<Box<Reference>>,
  pub(crate) safety: Vector<CodeableConcept>,
  pub(crate) version: Vector<String>,
  pub(crate) contact: Vector<ContactPoint>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) modelNumber: Option<String>,
  pub(crate) languageCode: Vector<CodeableConcept>,
  pub(crate) parentDevice: Option<Box<Reference>>,
  pub(crate) manufacturer: Option<UnionReferenceOrString>,
  pub(crate) shelfLifeStorage: Vector<any>,
  pub(crate) onlineInformation: Option<String>,
  pub(crate) physicalCharacteristics: Option<any>,
  pub(crate) property: Vector<DeviceDefinition_Property>,
  pub(crate) deviceName: Vector<DeviceDefinition_DeviceName>,
  pub(crate) capability: Vector<DeviceDefinition_Capability>,
  pub(crate) material: Vector<DeviceDefinition_Material>,
  pub(crate) specialization: Vector<DeviceDefinition_Specialization>,
  pub(crate) udiDeviceIdentifier: Vector<DeviceDefinition_UdiDeviceIdentifier>,
}