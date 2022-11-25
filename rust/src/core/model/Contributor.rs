use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;



#[derive(Clone, Debug)]
pub struct ContributorRaw {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) name: String,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

pub trait Contributor : FHIRElement {
  fn _type(&self) -> &String;
  fn name(&self) -> &String;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
}

dyn_clone::clone_trait_object!(Contributor);

impl FHIRObject for ContributorRaw {
}

impl FHIRElement for ContributorRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Contributor for ContributorRaw {
  fn _type(&self) -> &String { &self._type }
  fn name(&self) -> &String { &self.name }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
}

