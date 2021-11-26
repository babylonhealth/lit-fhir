use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::Union01658422381;
use crate::core::model::DataRequirement::DataRequirement;
use crate::core::model::Expression::Expression;
use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct TriggerDefinition {
  pub(crate) _type: String,
  pub(crate) name: Option<String>,
  pub(crate) data: Vector<DataRequirement>,
  pub(crate) timing: Option<Union01658422381>,
  pub(crate) condition: Option<Expression>,
}