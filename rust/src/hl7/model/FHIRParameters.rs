use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::UnionAll;
use crate::core::model::Extension::Extension;
use crate::core::model::FHIRParameters_Parameter::FHIRParameters_Parameter;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;



#[derive(Clone, Debug)]
pub struct FHIRParameters_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) part: Vector<FHIRParameters_Parameter>,
  pub(crate) value: Option<UnionAll>,
  pub(crate) resource: Option<Resource>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct FHIRParameters {
  pub(crate) parameter: Vector<FHIRParameters_Parameter>,
}