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
pub struct ParameterDefinitionRaw {
  pub(crate) id: Option<String>,
  pub(crate) _use: String,
  pub(crate) min: Option<i32>,
  pub(crate) max: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) _type: String,
  pub(crate) profile: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) documentation: Option<String>,
}

pub trait ParameterDefinition : FHIRElement {
  fn _use(&self) -> &String;
  fn min(&self) -> Option<&i32>;
  fn max(&self) -> Option<&String>;
  fn name(&self) -> Option<&String>;
  fn _type(&self) -> &String;
  fn profile(&self) -> Option<&String>;
  fn documentation(&self) -> Option<&String>;
}

dyn_clone::clone_trait_object!(ParameterDefinition);

impl FHIRObject for ParameterDefinitionRaw {
}

impl FHIRElement for ParameterDefinitionRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl ParameterDefinition for ParameterDefinitionRaw {
  fn _use(&self) -> &String { &self._use }
  fn min(&self) -> Option<&i32> { self.min.as_ref() }
  fn max(&self) -> Option<&String> { self.max.as_ref() }
  fn name(&self) -> Option<&String> { self.name.as_ref() }
  fn _type(&self) -> &String { &self._type }
  fn profile(&self) -> Option<&String> { self.profile.as_ref() }
  fn documentation(&self) -> Option<&String> { self.documentation.as_ref() }
}

