use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Binary {
  pub(crate) data?: String,
  pub(crate) contentType: String,
  pub(crate) securityContext?: Reference,
}