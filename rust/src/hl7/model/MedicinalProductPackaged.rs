use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicinalProductPackaged_BatchIdentifier {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) outerPackaging: Box<dyn Identifier>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) immediatePackaging: Option<Box<dyn Identifier>>,
}


#[derive(Clone, Debug)]
pub struct MedicinalProductPackaged_PackageItem {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) device: Vector<Box<dyn Reference>>,
  pub(crate) quantity: Box<dyn Quantity>,
  pub(crate) material: Vector<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) packageItem: Vector<Box<MedicinalProductPackaged_PackageItem>>,
  pub(crate) manufacturer: Vector<Box<dyn Reference>>,
  pub(crate) manufacturedItem: Vector<Box<dyn Reference>>,
  pub(crate) shelfLifeStorage: Vector<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) alternateMaterial: Vector<Box<dyn CodeableConcept>>,
  pub(crate) otherCharacteristics: Vector<Box<dyn CodeableConcept>>,
  pub(crate) physicalCharacteristics: Option<String>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductPackagedRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) subject: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) description: Option<String>,
  pub(crate) manufacturer: Vector<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) marketingStatus: Vector<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) legalStatusOfSupply: Option<Box<dyn CodeableConcept>>,
  pub(crate) marketingAuthorization: Option<Box<dyn Reference>>,
  pub(crate) batchIdentifier: Vector<Box<MedicinalProductPackaged_BatchIdentifier>>,
  pub(crate) packageItem: Vector<Box<MedicinalProductPackaged_PackageItem>>,
}

pub trait MedicinalProductPackaged : DomainResource {
  fn subject(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn description(&self) -> &Option<String>;
  fn manufacturer(&self) -> &Vector<Box<dyn Reference>>;
  fn marketingStatus(&self) -> &Vector<String>;
  fn legalStatusOfSupply(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn marketingAuthorization(&self) -> &Option<Box<dyn Reference>>;
  fn batchIdentifier(&self) -> &Vector<Box<MedicinalProductPackaged_BatchIdentifier>>;
  fn packageItem(&self) -> &Vector<Box<MedicinalProductPackaged_PackageItem>>;
}

dyn_clone::clone_trait_object!(MedicinalProductPackaged);

impl FHIRObject for MedicinalProductPackagedRaw {
}

impl Resource for MedicinalProductPackagedRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for MedicinalProductPackagedRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MedicinalProductPackaged for MedicinalProductPackagedRaw {
  fn subject(&self) -> &Vector<Box<dyn Reference>> { &self.subject }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn description(&self) -> &Option<String> { &self.description }
  fn manufacturer(&self) -> &Vector<Box<dyn Reference>> { &self.manufacturer }
  fn marketingStatus(&self) -> &Vector<String> { &self.marketingStatus }
  fn legalStatusOfSupply(&self) -> &Option<Box<dyn CodeableConcept>> { &self.legalStatusOfSupply }
  fn marketingAuthorization(&self) -> &Option<Box<dyn Reference>> { &self.marketingAuthorization }
  fn batchIdentifier(&self) -> &Vector<Box<MedicinalProductPackaged_BatchIdentifier>> { &self.batchIdentifier }
  fn packageItem(&self) -> &Vector<Box<MedicinalProductPackaged_PackageItem>> { &self.packageItem }
}

