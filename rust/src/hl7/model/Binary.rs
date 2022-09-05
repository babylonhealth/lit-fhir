use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;



#[derive(Clone, Debug)]
pub struct BinaryRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) data: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) contentType: String,
  pub(crate) implicitRules: Option<String>,
  pub(crate) securityContext: Option<Box<dyn Reference>>,
}

pub trait Binary : Resource {
  fn data(&self) -> &Option<String>;
  fn contentType(&self) -> &String;
  fn securityContext(&self) -> &Option<Box<dyn Reference>>;
}

dyn_clone::clone_trait_object!(Binary);

impl FHIRObject for BinaryRaw {
}

impl Resource for BinaryRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl Binary for BinaryRaw {
  fn data(&self) -> &Option<String> { &self.data }
  fn contentType(&self) -> &String { &self.contentType }
  fn securityContext(&self) -> &Option<Box<dyn Reference>> { &self.securityContext }
}

