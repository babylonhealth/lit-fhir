use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;
use crate::core::model::Quantity::Quantity;



#[derive(Clone, Debug)]
pub struct RangeRaw {
  pub(crate) id: Option<String>,
  pub(crate) low: Option<Box<dyn Quantity>>,
  pub(crate) high: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

pub trait Range : FHIRElement {
  fn low(&self) -> &Option<Box<dyn Quantity>>;
  fn high(&self) -> &Option<Box<dyn Quantity>>;
}

dyn_clone::clone_trait_object!(Range);

impl FHIRObject for RangeRaw {
}

impl FHIRElement for RangeRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Range for RangeRaw {
  fn low(&self) -> &Option<Box<dyn Quantity>> { &self.low }
  fn high(&self) -> &Option<Box<dyn Quantity>> { &self.high }
}

