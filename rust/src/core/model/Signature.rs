use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Coding::Coding;
use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;
use crate::core::model::Reference::Reference;



#[derive(Clone, Debug)]
pub struct SignatureRaw {
  pub(crate) id: Option<String>,
  pub(crate) who: Box<dyn Reference>,
  pub(crate) _type: Vector<Box<dyn Coding>>,
  pub(crate) when: DateTime<FixedOffset>,
  pub(crate) data: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) sigFormat: Option<String>,
  pub(crate) onBehalfOf: Option<Box<dyn Reference>>,
  pub(crate) targetFormat: Option<String>,
}

pub trait Signature : FHIRElement {
  fn who(&self) -> &Box<dyn Reference>;
  fn _type(&self) -> &Vector<Box<dyn Coding>>;
  fn when(&self) -> &DateTime<FixedOffset>;
  fn data(&self) -> &Option<String>;
  fn sigFormat(&self) -> &Option<String>;
  fn onBehalfOf(&self) -> &Option<Box<dyn Reference>>;
  fn targetFormat(&self) -> &Option<String>;
}

dyn_clone::clone_trait_object!(Signature);

impl FHIRObject for SignatureRaw {
}

impl FHIRElement for SignatureRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Signature for SignatureRaw {
  fn who(&self) -> &Box<dyn Reference> { &self.who }
  fn _type(&self) -> &Vector<Box<dyn Coding>> { &self._type }
  fn when(&self) -> &DateTime<FixedOffset> { &self.when }
  fn data(&self) -> &Option<String> { &self.data }
  fn sigFormat(&self) -> &Option<String> { &self.sigFormat }
  fn onBehalfOf(&self) -> &Option<Box<dyn Reference>> { &self.onBehalfOf }
  fn targetFormat(&self) -> &Option<String> { &self.targetFormat }
}

