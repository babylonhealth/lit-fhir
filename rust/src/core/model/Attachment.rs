use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;



#[derive(Clone, Debug)]
pub struct AttachmentRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) data: Option<String>,
  pub(crate) size: Option<u32>,
  pub(crate) hash: Option<String>,
  pub(crate) title: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) creation: Option<DateTime<FixedOffset>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) contentType: Option<String>,
}

pub trait Attachment : FHIRElement {
  fn url(&self) -> &Option<String>;
  fn data(&self) -> &Option<String>;
  fn size(&self) -> &Option<u32>;
  fn hash(&self) -> &Option<String>;
  fn title(&self) -> &Option<String>;
  fn language(&self) -> &Option<String>;
  fn creation(&self) -> &Option<DateTime<FixedOffset>>;
  fn contentType(&self) -> &Option<String>;
}

dyn_clone::clone_trait_object!(Attachment);

impl FHIRObject for AttachmentRaw {
}

impl FHIRElement for AttachmentRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Attachment for AttachmentRaw {
  fn url(&self) -> &Option<String> { &self.url }
  fn data(&self) -> &Option<String> { &self.data }
  fn size(&self) -> &Option<u32> { &self.size }
  fn hash(&self) -> &Option<String> { &self.hash }
  fn title(&self) -> &Option<String> { &self.title }
  fn language(&self) -> &Option<String> { &self.language }
  fn creation(&self) -> &Option<DateTime<FixedOffset>> { &self.creation }
  fn contentType(&self) -> &Option<String> { &self.contentType }
}

