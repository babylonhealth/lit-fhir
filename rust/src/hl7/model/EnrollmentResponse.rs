use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct EnrollmentResponse {
  pub(crate) status?: String,
  pub(crate) request?: Reference,
  pub(crate) outcome?: String,
  pub(crate) created?: Date,
  pub(crate) identifier?: Identifier,
  pub(crate) disposition?: String,
  pub(crate) organization?: Reference,
  pub(crate) requestProvider?: Reference,
}