use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct FHIRElementRaw {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

pub trait FHIRElement : FHIRObject {
  fn id(&self) -> &Option<String>;
  fn extension(&self) -> &Vector<Box<dyn Extension>>;
}

dyn_clone::clone_trait_object!(FHIRElement);

impl FHIRObject for FHIRElementRaw {
}

impl FHIRElement for FHIRElementRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}

