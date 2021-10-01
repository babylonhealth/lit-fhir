use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct EnrollmentResponse {
  pub(crate) status: Option<String>,
  pub(crate) request: Option<Reference>,
  pub(crate) outcome: Option<String>,
  pub(crate) created: Option<Date>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) disposition: Option<String>,
  pub(crate) organization: Option<Reference>,
  pub(crate) requestProvider: Option<Reference>,
}