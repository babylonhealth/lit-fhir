use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct Timing_Repeat {
  pub(crate) id?: String,
  pub(crate) when?: String,
  pub(crate) count?: u32,
  pub(crate) period?: BigDecimal,
  pub(crate) offset?: u32,
  pub(crate) countMax?: u32,
  pub(crate) duration?: BigDecimal,
  pub(crate) extension?: Extension,
  pub(crate) bounds?: Duration | Period | Range,
  pub(crate) frequency?: u32,
  pub(crate) periodMax?: BigDecimal,
  pub(crate) dayOfWeek?: String,
  pub(crate) timeOfDay?: Date,
  pub(crate) periodUnit?: String,
  pub(crate) durationMax?: BigDecimal,
  pub(crate) durationUnit?: String,
  pub(crate) frequencyMax?: u32,
}

pub struct Timing {
  pub(crate) code?: CodeableConcept,
  pub(crate) event?: Date,
  pub(crate) repeat?: Timing_Repeat,
}