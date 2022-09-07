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
pub struct ExpressionRaw {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) language: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) reference: Option<String>,
  pub(crate) expression: Option<String>,
  pub(crate) description: Option<String>,
}

pub trait Expression : FHIRElement {
  fn name(&self) -> Option<&String>;
  fn language(&self) -> &String;
  fn reference(&self) -> Option<&String>;
  fn expression(&self) -> Option<&String>;
  fn description(&self) -> Option<&String>;
}

dyn_clone::clone_trait_object!(Expression);

impl FHIRObject for ExpressionRaw {
}

impl FHIRElement for ExpressionRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Expression for ExpressionRaw {
  fn name(&self) -> Option<&String> { self.name.as_ref() }
  fn language(&self) -> &String { &self.language }
  fn reference(&self) -> Option<&String> { self.reference.as_ref() }
  fn expression(&self) -> Option<&String> { self.expression.as_ref() }
  fn description(&self) -> Option<&String> { self.description.as_ref() }
}

