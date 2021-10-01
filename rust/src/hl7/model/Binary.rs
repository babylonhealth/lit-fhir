use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Binary {
  pub(crate) data: Option<String>,
  pub(crate) contentType: String,
  pub(crate) securityContext: Option<Reference>,
}