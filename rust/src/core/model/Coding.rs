use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;



#[derive(Clone, Debug)]
pub struct CodingRaw {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<String>,
  pub(crate) system: Option<String>,
  pub(crate) version: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) userSelected: Option<bool>,
}

pub trait Coding : FHIRElement {
  fn code(&self) -> &Option<String>;
  fn system(&self) -> &Option<String>;
  fn version(&self) -> &Option<String>;
  fn display(&self) -> &Option<String>;
  fn userSelected(&self) -> &Option<bool>;
}

dyn_clone::clone_trait_object!(Coding);

impl FHIRObject for CodingRaw {
}

impl FHIRElement for CodingRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Coding for CodingRaw {
  fn code(&self) -> &Option<String> { &self.code }
  fn system(&self) -> &Option<String> { &self.system }
  fn version(&self) -> &Option<String> { &self.version }
  fn display(&self) -> &Option<String> { &self.display }
  fn userSelected(&self) -> &Option<bool> { &self.userSelected }
}

