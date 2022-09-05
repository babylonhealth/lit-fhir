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
use crate::core::model::UnionAliases::Union_1548929031;



#[derive(Clone, Debug)]
pub struct UsageContextRaw {
  pub(crate) id: Option<String>,
  pub(crate) code: Box<dyn Coding>,
  pub(crate) value: Box<Union_1548929031>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

pub trait UsageContext : FHIRElement {
  fn code(&self) -> &Box<dyn Coding>;
  fn value(&self) -> &Box<Union_1548929031>;
}

dyn_clone::clone_trait_object!(UsageContext);

impl FHIRObject for UsageContextRaw {
}

impl FHIRElement for UsageContextRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl UsageContext for UsageContextRaw {
  fn code(&self) -> &Box<dyn Coding> { &self.code }
  fn value(&self) -> &Box<Union_1548929031> { &self.value }
}

