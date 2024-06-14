use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicinalProductManufacturedRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) language: Option<String>,
  pub(crate) quantity: Box<dyn Quantity>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) ingredient: Vector<Box<dyn Reference>>,
  pub(crate) manufacturer: Vector<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) unitOfPresentation: Option<Box<dyn CodeableConcept>>,
  pub(crate) manufacturedDoseForm: Box<dyn CodeableConcept>,
  pub(crate) otherCharacteristics: Vector<Box<dyn CodeableConcept>>,
  pub(crate) physicalCharacteristics: Option<String>,
}

pub trait MedicinalProductManufactured : DomainResource {
  fn quantity(&self) -> &Box<dyn Quantity>;
  fn ingredient(&self) -> &Vector<Box<dyn Reference>>;
  fn manufacturer(&self) -> &Vector<Box<dyn Reference>>;
  fn unitOfPresentation(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn manufacturedDoseForm(&self) -> &Box<dyn CodeableConcept>;
  fn otherCharacteristics(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn physicalCharacteristics(&self) -> Option<&String>;
}

dyn_clone::clone_trait_object!(MedicinalProductManufactured);

impl FHIRObject for MedicinalProductManufacturedRaw {
}

impl Resource for MedicinalProductManufacturedRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for MedicinalProductManufacturedRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MedicinalProductManufactured for MedicinalProductManufacturedRaw {
  fn quantity(&self) -> &Box<dyn Quantity> { &self.quantity }
  fn ingredient(&self) -> &Vector<Box<dyn Reference>> { &self.ingredient }
  fn manufacturer(&self) -> &Vector<Box<dyn Reference>> { &self.manufacturer }
  fn unitOfPresentation(&self) -> Option<&Box<dyn CodeableConcept>> { self.unitOfPresentation.as_ref() }
  fn manufacturedDoseForm(&self) -> &Box<dyn CodeableConcept> { &self.manufacturedDoseForm }
  fn otherCharacteristics(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.otherCharacteristics }
  fn physicalCharacteristics(&self) -> Option<&String> { self.physicalCharacteristics.as_ref() }
}

