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
pub struct MoneyRaw {
  pub(crate) id: Option<String>,
  pub(crate) value: Option<BigDecimal>,
  pub(crate) currency: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

pub trait Money : FHIRElement {
  fn value(&self) -> Option<&BigDecimal>;
  fn currency(&self) -> Option<&String>;
}

dyn_clone::clone_trait_object!(Money);

impl FHIRObject for MoneyRaw {
}

impl FHIRElement for MoneyRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Money for MoneyRaw {
  fn value(&self) -> Option<&BigDecimal> { self.value.as_ref() }
  fn currency(&self) -> Option<&String> { self.currency.as_ref() }
}

