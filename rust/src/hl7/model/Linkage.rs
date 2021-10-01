use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Linkage_Item {
  pub(crate) id?: String,
  pub(crate) _type: String,
  pub(crate) resource: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct Linkage {
  pub(crate) active?: Boolean,
  pub(crate) author?: Reference,
  pub(crate) item: Linkage_Item,
}