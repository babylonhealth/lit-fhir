use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;
use crate::core::model::Quantity::Quantity;



#[derive(Clone, Debug)]
pub struct CountRaw {
  pub(crate) id: Option<String>,
  pub(crate) unit: Option<String>,
  pub(crate) code: Option<String>,
  pub(crate) value: Option<BigDecimal>,
  pub(crate) system: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) comparator: Option<String>,
}

pub trait Count : Quantity {
  
}

dyn_clone::clone_trait_object!(Count);

impl FHIRObject for CountRaw {
}

impl FHIRElement for CountRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Quantity for CountRaw {
  fn unit(&self) -> &Option<String> { &self.unit }
  fn code(&self) -> &Option<String> { &self.code }
  fn value(&self) -> &Option<BigDecimal> { &self.value }
  fn system(&self) -> &Option<String> { &self.system }
  fn comparator(&self) -> &Option<String> { &self.comparator }
}


impl Count for CountRaw {
  
}

