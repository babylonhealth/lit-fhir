use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Reference::Reference;
use crate::core::model::Money::Money;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::CodeableConcept::CodeableConcept;



#[derive(Clone, Debug)]
pub struct PaymentNotice {
  pub(crate) payee: Option<Box<Reference>>,
  pub(crate) status: String,
  pub(crate) amount: Money,
  pub(crate) request: Option<Box<Reference>>,
  pub(crate) created: DateTime<FixedOffset>,
  pub(crate) payment: Box<Reference>,
  pub(crate) response: Option<Box<Reference>>,
  pub(crate) provider: Option<Box<Reference>>,
  pub(crate) recipient: Box<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) paymentDate: Option<FHIRDate>,
  pub(crate) paymentStatus: Option<CodeableConcept>,
}