use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;



#[derive(Clone, Debug)]
pub struct ContactDetailRaw {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) telecom: Vector<Box<dyn ContactPoint>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

pub trait ContactDetail : FHIRElement {
  fn name(&self) -> &Option<String>;
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>>;
}

dyn_clone::clone_trait_object!(ContactDetail);

impl FHIRObject for ContactDetailRaw {
}

impl FHIRElement for ContactDetailRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl ContactDetail for ContactDetailRaw {
  fn name(&self) -> &Option<String> { &self.name }
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>> { &self.telecom }
}

