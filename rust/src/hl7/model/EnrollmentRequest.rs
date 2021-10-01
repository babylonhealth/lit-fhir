use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct EnrollmentRequest {
  pub(crate) status?: String,
  pub(crate) created?: Date,
  pub(crate) insurer?: Reference,
  pub(crate) provider?: Reference,
  pub(crate) coverage?: Reference,
  pub(crate) candidate?: Reference,
  pub(crate) identifier?: Identifier,
}