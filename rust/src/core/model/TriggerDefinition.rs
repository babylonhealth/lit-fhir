use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::DataRequirement::DataRequirement;
use crate::core::model::Expression::Expression;
use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;
use crate::core::model::UnionAliases::Union01658422381;



#[derive(Clone, Debug)]
pub struct TriggerDefinitionRaw {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) name: Option<String>,
  pub(crate) data: Vector<Box<dyn DataRequirement>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) timing: Option<Union01658422381>,
  pub(crate) condition: Option<Box<dyn Expression>>,
}

pub trait TriggerDefinition : FHIRElement {
  fn _type(&self) -> &String;
  fn name(&self) -> &Option<String>;
  fn data(&self) -> &Vector<Box<dyn DataRequirement>>;
  fn timing(&self) -> &Option<Union01658422381>;
  fn condition(&self) -> &Option<Box<dyn Expression>>;
}

dyn_clone::clone_trait_object!(TriggerDefinition);

impl FHIRObject for TriggerDefinitionRaw {
}

impl FHIRElement for TriggerDefinitionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl TriggerDefinition for TriggerDefinitionRaw {
  fn _type(&self) -> &String { &self._type }
  fn name(&self) -> &Option<String> { &self.name }
  fn data(&self) -> &Vector<Box<dyn DataRequirement>> { &self.data }
  fn timing(&self) -> &Option<Union01658422381> { &self.timing }
  fn condition(&self) -> &Option<Box<dyn Expression>> { &self.condition }
}

