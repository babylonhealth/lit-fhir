use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Coding::Coding;
use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;



#[derive(Clone, Debug)]
pub struct CodeableConceptRaw {
  pub(crate) id: Option<String>,
  pub(crate) text: Option<String>,
  pub(crate) coding: Vector<Box<dyn Coding>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

pub trait CodeableConcept : FHIRElement {
  fn text(&self) -> Option<&String>;
  fn coding(&self) -> &Vector<Box<dyn Coding>>;
}

dyn_clone::clone_trait_object!(CodeableConcept);

impl FHIRObject for CodeableConceptRaw {
}

impl FHIRElement for CodeableConceptRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl CodeableConcept for CodeableConceptRaw {
  fn text(&self) -> Option<&String> { self.text.as_ref() }
  fn coding(&self) -> &Vector<Box<dyn Coding>> { &self.coding }
}

