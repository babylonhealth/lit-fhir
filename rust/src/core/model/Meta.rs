use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct Meta {
  pub(crate) tag: Vector<Coding>,
  pub(crate) source: Option<String>,
  pub(crate) profile: Vector<String>,
  pub(crate) security: Vector<Coding>,
  pub(crate) versionId: Option<String>,
  pub(crate) lastUpdated: Option<Date>,
}