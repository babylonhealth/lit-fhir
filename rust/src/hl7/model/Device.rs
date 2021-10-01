use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Device_Version {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) value: String,
  pub(crate) extension?: Extension,
  pub(crate) component?: Identifier,
  pub(crate) modifierExtension?: Extension,
}


pub struct Device_Property {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) valueCode?: CodeableConcept,
  pub(crate) valueQuantity?: Quantity,
  pub(crate) modifierExtension?: Extension,
}


pub struct Device_UdiCarrier {
  pub(crate) id?: String,
  pub(crate) issuer?: String,
  pub(crate) extension?: Extension,
  pub(crate) entryType?: String,
  pub(crate) carrierHRF?: String,
  pub(crate) carrierAIDC?: String,
  pub(crate) jurisdiction?: String,
  pub(crate) deviceIdentifier?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct Device_DeviceName {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) _type: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct Device_Specialization {
  pub(crate) id?: String,
  pub(crate) version?: String,
  pub(crate) extension?: Extension,
  pub(crate) systemType: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}

pub struct Device {
  pub(crate) url?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) owner?: Reference,
  pub(crate) status?: String,
  pub(crate) safety?: CodeableConcept,
  pub(crate) parent?: Reference,
  pub(crate) patient?: Reference,
  pub(crate) contact?: ContactPoint,
  pub(crate) location?: Reference,
  pub(crate) lotNumber?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) definition?: Reference,
  pub(crate) partNumber?: String,
  pub(crate) modelNumber?: String,
  pub(crate) statusReason?: CodeableConcept,
  pub(crate) manufacturer?: String,
  pub(crate) serialNumber?: String,
  pub(crate) expirationDate?: Date,
  pub(crate) manufactureDate?: Date,
  pub(crate) distinctIdentifier?: String,
  pub(crate) version?: Device_Version,
  pub(crate) property?: Device_Property,
  pub(crate) udiCarrier?: Device_UdiCarrier,
  pub(crate) deviceName?: Device_DeviceName,
  pub(crate) specialization?: Device_Specialization,
}