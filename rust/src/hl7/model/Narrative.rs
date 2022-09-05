use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;



#[derive(Clone, Debug)]
pub struct NarrativeRaw {
  pub(crate) id: Option<String>,
  pub(crate) div: String,
  pub(crate) status: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

pub trait Narrative : FHIRElement {
  fn div(&self) -> &String;
  fn status(&self) -> &String;
}

dyn_clone::clone_trait_object!(Narrative);

impl FHIRObject for NarrativeRaw {
}

impl FHIRElement for NarrativeRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Narrative for NarrativeRaw {
  fn div(&self) -> &String { &self.div }
  fn status(&self) -> &String { &self.status }
}

