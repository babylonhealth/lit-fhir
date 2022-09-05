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
pub struct PeriodRaw {
  pub(crate) id: Option<String>,
  pub(crate) end: Option<DateTime<FixedOffset>>,
  pub(crate) start: Option<DateTime<FixedOffset>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

pub trait Period : FHIRElement {
  fn end(&self) -> &Option<DateTime<FixedOffset>>;
  fn start(&self) -> &Option<DateTime<FixedOffset>>;
}

dyn_clone::clone_trait_object!(Period);

impl FHIRObject for PeriodRaw {
}

impl FHIRElement for PeriodRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Period for PeriodRaw {
  fn end(&self) -> &Option<DateTime<FixedOffset>> { &self.end }
  fn start(&self) -> &Option<DateTime<FixedOffset>> { &self.start }
}

