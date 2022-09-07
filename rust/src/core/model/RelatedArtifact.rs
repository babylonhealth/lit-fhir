use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Attachment::Attachment;
use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;



#[derive(Clone, Debug)]
pub struct RelatedArtifactRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) _type: String,
  pub(crate) label: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) citation: Option<String>,
  pub(crate) document: Option<Box<dyn Attachment>>,
  pub(crate) resource: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

pub trait RelatedArtifact : FHIRElement {
  fn url(&self) -> Option<&String>;
  fn _type(&self) -> &String;
  fn label(&self) -> Option<&String>;
  fn display(&self) -> Option<&String>;
  fn citation(&self) -> Option<&String>;
  fn document(&self) -> Option<&Box<dyn Attachment>>;
  fn resource(&self) -> Option<&String>;
}

dyn_clone::clone_trait_object!(RelatedArtifact);

impl FHIRObject for RelatedArtifactRaw {
}

impl FHIRElement for RelatedArtifactRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl RelatedArtifact for RelatedArtifactRaw {
  fn url(&self) -> Option<&String> { self.url.as_ref() }
  fn _type(&self) -> &String { &self._type }
  fn label(&self) -> Option<&String> { self.label.as_ref() }
  fn display(&self) -> Option<&String> { self.display.as_ref() }
  fn citation(&self) -> Option<&String> { self.citation.as_ref() }
  fn document(&self) -> Option<&Box<dyn Attachment>> { self.document.as_ref() }
  fn resource(&self) -> Option<&String> { self.resource.as_ref() }
}

