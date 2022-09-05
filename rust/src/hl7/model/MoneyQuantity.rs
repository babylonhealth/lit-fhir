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
pub struct MoneyQuantityRaw {
  pub(crate) id: Option<String>,
  pub(crate) unit: Option<String>,
  pub(crate) code: Option<String>,
  pub(crate) value: Option<BigDecimal>,
  pub(crate) system: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) comparator: Option<String>,
}

pub trait MoneyQuantity : Quantity {
  
}

dyn_clone::clone_trait_object!(MoneyQuantity);

impl FHIRObject for MoneyQuantityRaw {
}

impl FHIRElement for MoneyQuantityRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Quantity for MoneyQuantityRaw {
  fn unit(&self) -> &Option<String> { &self.unit }
  fn code(&self) -> &Option<String> { &self.code }
  fn value(&self) -> &Option<BigDecimal> { &self.value }
  fn system(&self) -> &Option<String> { &self.system }
  fn comparator(&self) -> &Option<String> { &self.comparator }
}


impl MoneyQuantity for MoneyQuantityRaw {
  
}
