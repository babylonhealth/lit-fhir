use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Linkage_Item {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) resource: Reference,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Linkage {
  pub(crate) active: Option<Boolean>,
  pub(crate) author: Option<Reference>,
  pub(crate) item: Vector<Linkage_Item>,
}