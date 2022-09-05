use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;
use crate::core::model::Quantity::Quantity;



#[derive(Clone, Debug)]
pub struct RatioRaw {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) numerator: Option<Box<dyn Quantity>>,
  pub(crate) denominator: Option<Box<dyn Quantity>>,
}

pub trait Ratio : FHIRElement {
  fn numerator(&self) -> &Option<Box<dyn Quantity>>;
  fn denominator(&self) -> &Option<Box<dyn Quantity>>;
}

dyn_clone::clone_trait_object!(Ratio);

impl FHIRObject for RatioRaw {
}

impl FHIRElement for RatioRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl Ratio for RatioRaw {
  fn numerator(&self) -> &Option<Box<dyn Quantity>> { &self.numerator }
  fn denominator(&self) -> &Option<Box<dyn Quantity>> { &self.denominator }
}

