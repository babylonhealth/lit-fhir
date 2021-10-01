use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct Contributor {
  pub(crate) _type: String,
  pub(crate) name: String,
  pub(crate) contact: Vector<ContactDetail>,
}