use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct Resource {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Meta>,
  pub(crate) language: Option<String>,
  pub(crate) implicitRules: Option<String>,
}