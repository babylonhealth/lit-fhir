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
pub struct SimpleQuantityRaw {
  pub(crate) id: Option<String>,
  pub(crate) unit: Option<String>,
  pub(crate) code: Option<String>,
  pub(crate) value: Option<BigDecimal>,
  pub(crate) system: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

pub trait SimpleQuantity : Quantity {
  
}

dyn_clone::clone_trait_object!(SimpleQuantity);

impl FHIRObject for SimpleQuantityRaw {
}

impl FHIRElement for SimpleQuantityRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Quantity for SimpleQuantityRaw {
  fn unit(&self) -> &Option<String> { &self.unit }
  fn code(&self) -> &Option<String> { &self.code }
  fn value(&self) -> &Option<BigDecimal> { &self.value }
  fn system(&self) -> &Option<String> { &self.system }
  fn comparator(&self) -> &Option<String> { &Option::None }
}


impl SimpleQuantity for SimpleQuantityRaw {
  
}

