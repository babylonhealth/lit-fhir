use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Device_Version {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) value: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) component: Option<Identifier>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Device_Property {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) valueCode: Vector<CodeableConcept>,
  pub(crate) valueQuantity: Vector<Quantity>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Device_UdiCarrier {
  pub(crate) id: Option<String>,
  pub(crate) issuer: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) entryType: Option<String>,
  pub(crate) carrierHRF: Option<String>,
  pub(crate) carrierAIDC: Option<String>,
  pub(crate) jurisdiction: Option<String>,
  pub(crate) deviceIdentifier: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Device_DeviceName {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) _type: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Device_Specialization {
  pub(crate) id: Option<String>,
  pub(crate) version: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) systemType: CodeableConcept,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Device {
  pub(crate) url: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) owner: Option<Reference>,
  pub(crate) status: Option<String>,
  pub(crate) safety: Vector<CodeableConcept>,
  pub(crate) parent: Option<Reference>,
  pub(crate) patient: Option<Reference>,
  pub(crate) contact: Vector<ContactPoint>,
  pub(crate) location: Option<Reference>,
  pub(crate) lotNumber: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) definition: Option<Reference>,
  pub(crate) partNumber: Option<String>,
  pub(crate) modelNumber: Option<String>,
  pub(crate) statusReason: Vector<CodeableConcept>,
  pub(crate) manufacturer: Option<String>,
  pub(crate) serialNumber: Option<String>,
  pub(crate) expirationDate: Option<Date>,
  pub(crate) manufactureDate: Option<Date>,
  pub(crate) distinctIdentifier: Option<String>,
  pub(crate) version: Vector<Device_Version>,
  pub(crate) property: Vector<Device_Property>,
  pub(crate) udiCarrier: Vector<Device_UdiCarrier>,
  pub(crate) deviceName: Vector<Device_DeviceName>,
  pub(crate) specialization: Vector<Device_Specialization>,
}