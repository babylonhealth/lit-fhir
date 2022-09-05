use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::UnionAll;
use crate::core::model::FHIRElement::FHIRElement;



#[derive(Clone, Debug)]
pub struct ExtensionRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) value: Option<UnionAll>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

pub trait Extension : FHIRElement {
  fn url(&self) -> &String;
  fn value(&self) -> &Option<UnionAll>;
}

dyn_clone::clone_trait_object!(Extension);

impl FHIRObject for ExtensionRaw {
}

impl FHIRElement for ExtensionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Extension for ExtensionRaw {
  fn url(&self) -> &String { &self.url }
  fn value(&self) -> &Option<UnionAll> { &self.value }
}

