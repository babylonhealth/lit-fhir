use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct Timing_Repeat {
  pub(crate) id: Option<String>,
  pub(crate) when: Vector<String>,
  pub(crate) count: Option<u32>,
  pub(crate) period: Option<BigDecimal>,
  pub(crate) offset: Option<u32>,
  pub(crate) countMax: Option<u32>,
  pub(crate) duration: Option<BigDecimal>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) bounds: Option<Duration | Period | Range>,
  pub(crate) frequency: Option<u32>,
  pub(crate) periodMax: Option<BigDecimal>,
  pub(crate) dayOfWeek: Vector<String>,
  pub(crate) timeOfDay: Vector<Date>,
  pub(crate) periodUnit: Option<String>,
  pub(crate) durationMax: Option<BigDecimal>,
  pub(crate) durationUnit: Option<String>,
  pub(crate) frequencyMax: Option<u32>,
}

#[derive(Clone, Debug)]
pub struct Timing {
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) event: Vector<Date>,
  pub(crate) repeat: Option<Timing_Repeat>,
}