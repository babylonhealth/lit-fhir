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
pub struct HumanNameRaw {
  pub(crate) id: Option<String>,
  pub(crate) _use: Option<String>,
  pub(crate) text: Option<String>,
  pub(crate) given: Vector<String>,
  pub(crate) family: Option<String>,
  pub(crate) prefix: Vector<String>,
  pub(crate) suffix: Vector<String>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

pub trait HumanName : FHIRElement {
  fn _use(&self) -> &Option<String>;
  fn text(&self) -> &Option<String>;
  fn given(&self) -> &Vector<String>;
  fn family(&self) -> &Option<String>;
  fn prefix(&self) -> &Vector<String>;
  fn suffix(&self) -> &Vector<String>;
  fn period(&self) -> &Option<Box<dyn Period>>;
}

dyn_clone::clone_trait_object!(HumanName);

impl FHIRObject for HumanNameRaw {
}

impl FHIRElement for HumanNameRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl HumanName for HumanNameRaw {
  fn _use(&self) -> &Option<String> { &self._use }
  fn text(&self) -> &Option<String> { &self.text }
  fn given(&self) -> &Vector<String> { &self.given }
  fn family(&self) -> &Option<String> { &self.family }
  fn prefix(&self) -> &Vector<String> { &self.prefix }
  fn suffix(&self) -> &Vector<String> { &self.suffix }
  fn period(&self) -> &Option<Box<dyn Period>> { &self.period }
}

