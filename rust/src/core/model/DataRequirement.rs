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
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::core::model::UnionAliases::UnionDurationOrDateTimeOrPeriod;



#[derive(Clone, Debug)]
pub struct DataRequirement_Sort {
  pub(crate) id: Option<String>,
  pub(crate) path: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) direction: String,
}


#[derive(Clone, Debug)]
pub struct DataRequirement_CodeFilter {
  pub(crate) id: Option<String>,
  pub(crate) path: Option<String>,
  pub(crate) code: Vector<Box<dyn Coding>>,
  pub(crate) valueSet: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) searchParam: Option<String>,
}


#[derive(Clone, Debug)]
pub struct DataRequirement_DateFilter {
  pub(crate) id: Option<String>,
  pub(crate) path: Option<String>,
  pub(crate) value: Option<UnionDurationOrDateTimeOrPeriod>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) searchParam: Option<String>,
}

#[derive(Clone, Debug)]
pub struct DataRequirementRaw {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) limit: Option<u32>,
  pub(crate) profile: Vector<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) subject: Option<UnionCodeableConceptOrReference>,
  pub(crate) mustSupport: Vector<String>,
  pub(crate) sort: Vector<Box<DataRequirement_Sort>>,
  pub(crate) codeFilter: Vector<Box<DataRequirement_CodeFilter>>,
  pub(crate) dateFilter: Vector<Box<DataRequirement_DateFilter>>,
}

pub trait DataRequirement : FHIRElement {
  fn _type(&self) -> &String;
  fn limit(&self) -> &Option<u32>;
  fn profile(&self) -> &Vector<String>;
  fn subject(&self) -> &Option<UnionCodeableConceptOrReference>;
  fn mustSupport(&self) -> &Vector<String>;
  fn sort(&self) -> &Vector<Box<DataRequirement_Sort>>;
  fn codeFilter(&self) -> &Vector<Box<DataRequirement_CodeFilter>>;
  fn dateFilter(&self) -> &Vector<Box<DataRequirement_DateFilter>>;
}

dyn_clone::clone_trait_object!(DataRequirement);

impl FHIRObject for DataRequirementRaw {
}

impl FHIRElement for DataRequirementRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl DataRequirement for DataRequirementRaw {
  fn _type(&self) -> &String { &self._type }
  fn limit(&self) -> &Option<u32> { &self.limit }
  fn profile(&self) -> &Vector<String> { &self.profile }
  fn subject(&self) -> &Option<UnionCodeableConceptOrReference> { &self.subject }
  fn mustSupport(&self) -> &Vector<String> { &self.mustSupport }
  fn sort(&self) -> &Vector<Box<DataRequirement_Sort>> { &self.sort }
  fn codeFilter(&self) -> &Vector<Box<DataRequirement_CodeFilter>> { &self.codeFilter }
  fn dateFilter(&self) -> &Vector<Box<DataRequirement_DateFilter>> { &self.dateFilter }
}

