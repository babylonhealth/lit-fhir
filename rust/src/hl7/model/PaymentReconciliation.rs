use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct PaymentReconciliation_Detail {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) date: Option<FHIRDate>,
  pub(crate) payee: Option<Reference>,
  pub(crate) amount: Option<Money>,
  pub(crate) request: Option<Reference>,
  pub(crate) response: Option<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) submitter: Option<Reference>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) predecessor: Option<Identifier>,
  pub(crate) responsible: Option<Reference>,
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
  pub(crate) created: Date,
  pub(crate) request: Option<Reference>,
  pub(crate) outcome: Option<String>,
  pub(crate) formCode: Option<CodeableConcept>,
  pub(crate) requestor: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) disposition: Option<String>,
  pub(crate) paymentDate: FHIRDate,
  pub(crate) paymentIssuer: Option<Reference>,
  pub(crate) paymentAmount: Money,
  pub(crate) paymentIdentifier: Option<Identifier>,
  pub(crate) detail: Vector<PaymentReconciliation_Detail>,
  pub(crate) processNote: Vector<PaymentReconciliation_ProcessNote>,
}