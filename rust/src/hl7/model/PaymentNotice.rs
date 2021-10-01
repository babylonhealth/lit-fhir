use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct PaymentNotice {
  pub(crate) payee: Option<Reference>,
  pub(crate) status: String,
  pub(crate) amount: Money,
  pub(crate) request: Option<Reference>,
  pub(crate) created: Date,
  pub(crate) payment: Reference,
  pub(crate) response: Option<Reference>,
  pub(crate) provider: Option<Reference>,
  pub(crate) recipient: Reference,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) paymentDate: Option<FHIRDate>,
  pub(crate) paymentStatus: Option<CodeableConcept>,
}