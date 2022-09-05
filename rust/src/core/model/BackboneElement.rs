use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;



#[derive(Clone, Debug)]
pub struct BackboneElementRaw {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

pub trait BackboneElement : FHIRElement {
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>>;
}

dyn_clone::clone_trait_object!(BackboneElement);

impl FHIRObject for BackboneElementRaw {
}

impl FHIRElement for BackboneElementRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl BackboneElement for BackboneElementRaw {
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}

