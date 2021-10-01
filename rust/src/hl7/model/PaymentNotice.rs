use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct PaymentNotice {
  pub(crate) payee?: Reference,
  pub(crate) status: String,
  pub(crate) amount: Money,
  pub(crate) request?: Reference,
  pub(crate) created: Date,
  pub(crate) payment: Reference,
  pub(crate) response?: Reference,
  pub(crate) provider?: Reference,
  pub(crate) recipient: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) paymentDate?: FHIRDate,
  pub(crate) paymentStatus?: CodeableConcept,
}