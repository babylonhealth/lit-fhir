use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct PaymentReconciliation_Detail {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) date?: FHIRDate,
  pub(crate) payee?: Reference,
  pub(crate) amount?: Money,
  pub(crate) request?: Reference,
  pub(crate) response?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) submitter?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) predecessor?: Identifier,
  pub(crate) responsible?: Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct PaymentReconciliation_ProcessNote {
  pub(crate) id?: String,
  pub(crate) _type?: String,
  pub(crate) text?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct PaymentReconciliation {
  pub(crate) status: String,
  pub(crate) period?: Period,
  pub(crate) created: Date,
  pub(crate) request?: Reference,
  pub(crate) outcome?: String,
  pub(crate) formCode?: CodeableConcept,
  pub(crate) requestor?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) disposition?: String,
  pub(crate) paymentDate: FHIRDate,
  pub(crate) paymentIssuer?: Reference,
  pub(crate) paymentAmount: Money,
  pub(crate) paymentIdentifier?: Identifier,
  pub(crate) detail?: PaymentReconciliation_Detail,
  pub(crate) processNote?: PaymentReconciliation_ProcessNote,
}