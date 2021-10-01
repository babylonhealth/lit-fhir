use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct TriggerDefinition {
  pub(crate) _type: String,
  pub(crate) name?: String,
  pub(crate) data?: DataRequirement,
  pub(crate) timing?: FHIRDate | Date | Reference | Timing,
  pub(crate) condition?: Expression,
}