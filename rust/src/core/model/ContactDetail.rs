use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct ContactDetail {
  pub(crate) name: Option<String>,
  pub(crate) telecom: Vector<ContactPoint>,
}