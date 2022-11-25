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
pub struct SampledDataRaw {
  pub(crate) id: Option<String>,
  pub(crate) data: Option<String>,
  pub(crate) origin: Box<dyn Quantity>,
  pub(crate) period: BigDecimal,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) lowerLimit: Option<BigDecimal>,
  pub(crate) upperLimit: Option<BigDecimal>,
  pub(crate) dimensions: u32,
}

pub trait SampledData : FHIRElement {
  fn data(&self) -> Option<&String>;
  fn origin(&self) -> &Box<dyn Quantity>;
  fn period(&self) -> &BigDecimal;
  fn factor(&self) -> Option<&BigDecimal>;
  fn lowerLimit(&self) -> Option<&BigDecimal>;
  fn upperLimit(&self) -> Option<&BigDecimal>;
  fn dimensions(&self) -> &u32;
}

dyn_clone::clone_trait_object!(SampledData);

impl FHIRObject for SampledDataRaw {
}

impl FHIRElement for SampledDataRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl SampledData for SampledDataRaw {
  fn data(&self) -> Option<&String> { self.data.as_ref() }
  fn origin(&self) -> &Box<dyn Quantity> { &self.origin }
  fn period(&self) -> &BigDecimal { &self.period }
  fn factor(&self) -> Option<&BigDecimal> { self.factor.as_ref() }
  fn lowerLimit(&self) -> Option<&BigDecimal> { self.lowerLimit.as_ref() }
  fn upperLimit(&self) -> Option<&BigDecimal> { self.upperLimit.as_ref() }
  fn dimensions(&self) -> &u32 { &self.dimensions }
}

