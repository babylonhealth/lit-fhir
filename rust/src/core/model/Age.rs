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
pub struct AgeRaw {
  pub(crate) id: Option<String>,
  pub(crate) unit: Option<String>,
  pub(crate) code: Option<String>,
  pub(crate) value: Option<BigDecimal>,
  pub(crate) system: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) comparator: Option<String>,
}

pub trait Age : Quantity {
  
}

dyn_clone::clone_trait_object!(Age);

impl FHIRObject for AgeRaw {
}

impl FHIRElement for AgeRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Quantity for AgeRaw {
  fn unit(&self) -> Option<&String> { self.unit.as_ref() }
  fn code(&self) -> Option<&String> { self.code.as_ref() }
  fn value(&self) -> Option<&BigDecimal> { self.value.as_ref() }
  fn system(&self) -> Option<&String> { self.system.as_ref() }
  fn comparator(&self) -> Option<&String> { self.comparator.as_ref() }
}


impl Age for AgeRaw {
  
}

