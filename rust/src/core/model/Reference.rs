use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;
use crate::core::model::Identifier::Identifier;



#[derive(Clone, Debug)]
pub struct ReferenceRaw {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) reference: Option<String>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
}

pub trait Reference : FHIRElement {
  fn _type(&self) -> &Option<String>;
  fn display(&self) -> &Option<String>;
  fn reference(&self) -> &Option<String>;
  fn identifier(&self) -> &Option<Box<dyn Identifier>>;
}

dyn_clone::clone_trait_object!(Reference);

impl FHIRObject for ReferenceRaw {
}

impl FHIRElement for ReferenceRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Reference for ReferenceRaw {
  fn _type(&self) -> &Option<String> { &self._type }
  fn display(&self) -> &Option<String> { &self.display }
  fn reference(&self) -> &Option<String> { &self.reference }
  fn identifier(&self) -> &Option<Box<dyn Identifier>> { &self.identifier }
}

