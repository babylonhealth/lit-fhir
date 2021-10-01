use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct EnrollmentRequest {
  pub(crate) status: Option<String>,
  pub(crate) created: Option<Date>,
  pub(crate) insurer: Option<Reference>,
  pub(crate) provider: Option<Reference>,
  pub(crate) coverage: Option<Reference>,
  pub(crate) candidate: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
}