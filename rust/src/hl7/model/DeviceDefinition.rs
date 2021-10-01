use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct DeviceDefinition_Property {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) valueCode?: CodeableConcept,
  pub(crate) valueQuantity?: Quantity,
  pub(crate) modifierExtension?: Extension,
}


pub struct DeviceDefinition_DeviceName {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) _type: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct DeviceDefinition_Capability {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) description?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}


pub struct DeviceDefinition_Material {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) substance: CodeableConcept,
  pub(crate) alternate?: Boolean,
  pub(crate) modifierExtension?: Extension,
  pub(crate) allergenicIndicator?: Boolean,
}


pub struct DeviceDefinition_Specialization {
  pub(crate) id?: String,
  pub(crate) version?: String,
  pub(crate) extension?: Extension,
  pub(crate) systemType: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct DeviceDefinition_UdiDeviceIdentifier {
  pub(crate) id?: String,
  pub(crate) issuer: String,
  pub(crate) extension?: Extension,
  pub(crate) jurisdiction: String,
  pub(crate) deviceIdentifier: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct DeviceDefinition {
  pub(crate) url?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) owner?: Reference,
  pub(crate) safety?: CodeableConcept,
  pub(crate) version?: String,
  pub(crate) contact?: ContactPoint,
  pub(crate) quantity?: Quantity,
  pub(crate) identifier?: Identifier,
  pub(crate) modelNumber?: String,
  pub(crate) languageCode?: CodeableConcept,
  pub(crate) parentDevice?: Reference,
  pub(crate) manufacturer?: Reference | String,
  pub(crate) shelfLifeStorage?: any,
  pub(crate) onlineInformation?: String,
  pub(crate) physicalCharacteristics?: any,
  pub(crate) property?: DeviceDefinition_Property,
  pub(crate) deviceName?: DeviceDefinition_DeviceName,
  pub(crate) capability?: DeviceDefinition_Capability,
  pub(crate) material?: DeviceDefinition_Material,
  pub(crate) specialization?: DeviceDefinition_Specialization,
  pub(crate) udiDeviceIdentifier?: DeviceDefinition_UdiDeviceIdentifier,
}