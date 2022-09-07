use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::FHIRElement::FHIRElement;
use crate::core::model::UnionAliases::UnionAll;



#[derive(Clone, Debug)]
pub struct ExtensionRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) value: Option<UnionAll>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

pub trait Extension : FHIRElement {
  fn url(&self) -> &String;
  fn value(&self) -> Option<&UnionAll>;
}

dyn_clone::clone_trait_object!(Extension);

impl FHIRObject for ExtensionRaw {
}

impl FHIRElement for ExtensionRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Extension for ExtensionRaw {
  fn url(&self) -> &String { &self.url }
  fn value(&self) -> Option<&UnionAll> { self.value.as_ref() }
}

