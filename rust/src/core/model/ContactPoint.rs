use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;
use crate::core::model::Period::Period;



#[derive(Clone, Debug)]
pub struct ContactPointRaw {
  pub(crate) id: Option<String>,
  pub(crate) _use: Option<String>,
  pub(crate) rank: Option<u32>,
  pub(crate) value: Option<String>,
  pub(crate) system: Option<String>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

pub trait ContactPoint : FHIRElement {
  fn _use(&self) -> Option<&String>;
  fn rank(&self) -> Option<&u32>;
  fn value(&self) -> Option<&String>;
  fn system(&self) -> Option<&String>;
  fn period(&self) -> Option<&Box<dyn Period>>;
}

dyn_clone::clone_trait_object!(ContactPoint);

impl FHIRObject for ContactPointRaw {
}

impl FHIRElement for ContactPointRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl ContactPoint for ContactPointRaw {
  fn _use(&self) -> Option<&String> { self._use.as_ref() }
  fn rank(&self) -> Option<&u32> { self.rank.as_ref() }
  fn value(&self) -> Option<&String> { self.value.as_ref() }
  fn system(&self) -> Option<&String> { self.system.as_ref() }
  fn period(&self) -> Option<&Box<dyn Period>> { self.period.as_ref() }
}

