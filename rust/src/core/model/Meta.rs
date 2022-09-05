use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Coding::Coding;
use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;



#[derive(Clone, Debug)]
pub struct MetaRaw {
  pub(crate) id: Option<String>,
  pub(crate) tag: Vector<Box<dyn Coding>>,
  pub(crate) source: Option<String>,
  pub(crate) profile: Vector<String>,
  pub(crate) security: Vector<Box<dyn Coding>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) versionId: Option<String>,
  pub(crate) lastUpdated: Option<DateTime<FixedOffset>>,
}

pub trait Meta : FHIRElement {
  fn tag(&self) -> &Vector<Box<dyn Coding>>;
  fn source(&self) -> &Option<String>;
  fn profile(&self) -> &Vector<String>;
  fn security(&self) -> &Vector<Box<dyn Coding>>;
  fn versionId(&self) -> &Option<String>;
  fn lastUpdated(&self) -> &Option<DateTime<FixedOffset>>;
}

dyn_clone::clone_trait_object!(Meta);

impl FHIRObject for MetaRaw {
}

impl FHIRElement for MetaRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Meta for MetaRaw {
  fn tag(&self) -> &Vector<Box<dyn Coding>> { &self.tag }
  fn source(&self) -> &Option<String> { &self.source }
  fn profile(&self) -> &Vector<String> { &self.profile }
  fn security(&self) -> &Vector<Box<dyn Coding>> { &self.security }
  fn versionId(&self) -> &Option<String> { &self.versionId }
  fn lastUpdated(&self) -> &Option<DateTime<FixedOffset>> { &self.lastUpdated }
}

