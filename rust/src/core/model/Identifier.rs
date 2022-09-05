use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;



#[derive(Clone, Debug)]
pub struct IdentifierRaw {
  pub(crate) id: Option<String>,
  pub(crate) _use: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) value: Option<String>,
  pub(crate) system: Option<String>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) assigner: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

pub trait Identifier : FHIRElement {
  fn _use(&self) -> &Option<String>;
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn value(&self) -> &Option<String>;
  fn system(&self) -> &Option<String>;
  fn period(&self) -> &Option<Box<dyn Period>>;
  fn assigner(&self) -> &Option<Box<dyn Reference>>;
}

dyn_clone::clone_trait_object!(Identifier);

impl FHIRObject for IdentifierRaw {
}

impl FHIRElement for IdentifierRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Identifier for IdentifierRaw {
  fn _use(&self) -> &Option<String> { &self._use }
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>> { &self._type }
  fn value(&self) -> &Option<String> { &self.value }
  fn system(&self) -> &Option<String> { &self.system }
  fn period(&self) -> &Option<Box<dyn Period>> { &self.period }
  fn assigner(&self) -> &Option<Box<dyn Reference>> { &self.assigner }
}

