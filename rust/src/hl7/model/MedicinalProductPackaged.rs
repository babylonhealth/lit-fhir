use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicinalProductPackaged_BatchIdentifier {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) outerPackaging: Identifier,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) immediatePackaging: Option<Identifier>,
}


#[derive(Clone, Debug)]
pub struct MedicinalProductPackaged_PackageItem {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) device: Vector<Reference>,
  pub(crate) quantity: Quantity,
  pub(crate) material: Vector<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) packageItem: Vector<MedicinalProductPackaged_PackageItem>,
  pub(crate) manufacturer: Vector<Reference>,
  pub(crate) manufacturedItem: Vector<Reference>,
  pub(crate) shelfLifeStorage: Vector<any>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) alternateMaterial: Vector<CodeableConcept>,
  pub(crate) otherCharacteristics: Vector<CodeableConcept>,
  pub(crate) physicalCharacteristics: Option<any>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductPackaged {
  pub(crate) subject: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) description: Option<String>,
  pub(crate) manufacturer: Vector<Reference>,
  pub(crate) marketingStatus: Vector<any>,
  pub(crate) legalStatusOfSupply: Option<CodeableConcept>,
  pub(crate) marketingAuthorization: Option<Box<Reference>>,
  pub(crate) batchIdentifier: Vector<MedicinalProductPackaged_BatchIdentifier>,
  pub(crate) packageItem: Vector<MedicinalProductPackaged_PackageItem>,
}