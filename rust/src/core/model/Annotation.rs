use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::UnionReferenceOrString;
use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;



#[derive(Clone, Debug)]
pub struct AnnotationRaw {
  pub(crate) id: Option<String>,
  pub(crate) time: Option<DateTime<FixedOffset>>,
  pub(crate) text: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) author: Option<UnionReferenceOrString>,
}

pub trait Annotation : FHIRElement {
  fn time(&self) -> &Option<DateTime<FixedOffset>>;
  fn text(&self) -> &String;
  fn author(&self) -> &Option<UnionReferenceOrString>;
}

dyn_clone::clone_trait_object!(Annotation);

impl FHIRObject for AnnotationRaw {
}

impl FHIRElement for AnnotationRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Annotation for AnnotationRaw {
  fn time(&self) -> &Option<DateTime<FixedOffset>> { &self.time }
  fn text(&self) -> &String { &self.text }
  fn author(&self) -> &Option<UnionReferenceOrString> { &self.author }
}

