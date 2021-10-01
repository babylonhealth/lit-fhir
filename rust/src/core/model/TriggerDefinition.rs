use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct TriggerDefinition {
  pub(crate) _type: String,
  pub(crate) name: Option<String>,
  pub(crate) data: Vector<DataRequirement>,
  pub(crate) timing: Option<FHIRDate | Date | Reference | Timing>,
  pub(crate) condition: Option<Expression>,
}