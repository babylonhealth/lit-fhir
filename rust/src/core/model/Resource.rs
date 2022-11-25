use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Meta::Meta;



#[derive(Clone, Debug)]
pub struct ResourceRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) language: Option<String>,
  pub(crate) implicitRules: Option<String>,
}

pub trait Resource : FHIRObject {
  fn id(&self) -> Option<&String>;
  fn meta(&self) -> Option<&Box<dyn Meta>>;
  fn language(&self) -> Option<&String>;
  fn implicitRules(&self) -> Option<&String>;
}

dyn_clone::clone_trait_object!(Resource);

impl FHIRObject for ResourceRaw {
}

impl Resource for ResourceRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}

