use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;
use crate::core::model::Period::Period;



#[derive(Clone, Debug)]
pub struct AddressRaw {
  pub(crate) id: Option<String>,
  pub(crate) _use: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) text: Option<String>,
  pub(crate) line: Vector<String>,
  pub(crate) city: Option<String>,
  pub(crate) state: Option<String>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) country: Option<String>,
  pub(crate) district: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) postalCode: Option<String>,
}

pub trait Address : FHIRElement {
  fn _use(&self) -> Option<&String>;
  fn _type(&self) -> Option<&String>;
  fn text(&self) -> Option<&String>;
  fn line(&self) -> &Vector<String>;
  fn city(&self) -> Option<&String>;
  fn state(&self) -> Option<&String>;
  fn period(&self) -> Option<&Box<dyn Period>>;
  fn country(&self) -> Option<&String>;
  fn district(&self) -> Option<&String>;
  fn postalCode(&self) -> Option<&String>;
}

dyn_clone::clone_trait_object!(Address);

impl FHIRObject for AddressRaw {
}

impl FHIRElement for AddressRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Address for AddressRaw {
  fn _use(&self) -> Option<&String> { self._use.as_ref() }
  fn _type(&self) -> Option<&String> { self._type.as_ref() }
  fn text(&self) -> Option<&String> { self.text.as_ref() }
  fn line(&self) -> &Vector<String> { &self.line }
  fn city(&self) -> Option<&String> { self.city.as_ref() }
  fn state(&self) -> Option<&String> { self.state.as_ref() }
  fn period(&self) -> Option<&Box<dyn Period>> { self.period.as_ref() }
  fn country(&self) -> Option<&String> { self.country.as_ref() }
  fn district(&self) -> Option<&String> { self.district.as_ref() }
  fn postalCode(&self) -> Option<&String> { self.postalCode.as_ref() }
}

