use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Money::Money;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct PaymentReconciliation_Detail {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) date: Option<FHIRDate>,
  pub(crate) payee: Option<Box<Reference>>,
  pub(crate) amount: Option<Money>,
  pub(crate) request: Option<Box<Reference>>,
  pub(crate) response: Option<Box<Reference>>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) submitter: Option<Box<Reference>>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) predecessor: Option<Identifier>,
  pub(crate) responsible: Option<Box<Reference>>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct PaymentReconciliation_ProcessNote {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) text: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct PaymentReconciliation {
  pub(crate) status: String,
  pub(crate) period: Option<Period>,
  pub(crate) created: DateTime<FixedOffset>,
  pub(crate) request: Option<Box<Reference>>,
  pub(crate) outcome: Option<String>,
  pub(crate) formCode: Option<CodeableConcept>,
  pub(crate) requestor: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) disposition: Option<String>,
  pub(crate) paymentDate: FHIRDate,
  pub(crate) paymentIssuer: Option<Box<Reference>>,
  pub(crate) paymentAmount: Money,
  pub(crate) paymentIdentifier: Option<Identifier>,
  pub(crate) detail: Vector<PaymentReconciliation_Detail>,
  pub(crate) processNote: Vector<PaymentReconciliation_ProcessNote>,
}