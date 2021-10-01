use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MedicinalProductPackaged_BatchIdentifier {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) outerPackaging: Identifier,
  pub(crate) modifierExtension?: Extension,
  pub(crate) immediatePackaging?: Identifier,
}


pub struct MedicinalProductPackaged_PackageItem {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) device?: Reference,
  pub(crate) quantity: Quantity,
  pub(crate) material?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) identifier?: Identifier,
  pub(crate) packageItem?: MedicinalProductPackaged_PackageItem,
  pub(crate) manufacturer?: Reference,
  pub(crate) manufacturedItem?: Reference,
  pub(crate) shelfLifeStorage?: any,
  pub(crate) modifierExtension?: Extension,
  pub(crate) alternateMaterial?: CodeableConcept,
  pub(crate) otherCharacteristics?: CodeableConcept,
  pub(crate) physicalCharacteristics?: any,
}

pub struct MedicinalProductPackaged {
  pub(crate) subject?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) description?: String,
  pub(crate) manufacturer?: Reference,
  pub(crate) marketingStatus?: any,
  pub(crate) legalStatusOfSupply?: CodeableConcept,
  pub(crate) marketingAuthorization?: Reference,
  pub(crate) batchIdentifier?: MedicinalProductPackaged_BatchIdentifier,
  pub(crate) packageItem: MedicinalProductPackaged_PackageItem,
}