use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::UnionAliases::UnionAll;



#[derive(Clone, Debug)]
pub struct FHIRParameters_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) part: Vector<Box<FHIRParameters_Parameter>>,
  pub(crate) value: Option<UnionAll>,
  pub(crate) resource: Option<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct FHIRParametersRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) language: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) parameter: Vector<Box<FHIRParameters_Parameter>>,
}

pub trait FHIRParameters : Resource {
  fn parameter(&self) -> &Vector<Box<FHIRParameters_Parameter>>;
}

dyn_clone::clone_trait_object!(FHIRParameters);

impl FHIRObject for FHIRParametersRaw {
}

impl Resource for FHIRParametersRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl FHIRParameters for FHIRParametersRaw {
  fn parameter(&self) -> &Vector<Box<FHIRParameters_Parameter>> { &self.parameter }
}

