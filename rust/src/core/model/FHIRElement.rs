use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct FHIRElement {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
}