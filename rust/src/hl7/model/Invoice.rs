use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Invoice_Participant {
  pub(crate) id: Option<String>,
  pub(crate) role: Option<CodeableConcept>,
  pub(crate) actor: Reference,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Invoice_LineItem_PriceComponent {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) amount: Option<Money>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Invoice_LineItem {
  pub(crate) id: Option<String>,
  pub(crate) sequence: Option<u32>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) chargeItem: CodeableConcept | Reference,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) priceComponent: Vector<Invoice_LineItem_PriceComponent>,
}

#[derive(Clone, Debug)]
pub struct Invoice {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) date: Option<Date>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: String,
  pub(crate) issuer: Option<Reference>,
  pub(crate) subject: Option<Reference>,
  pub(crate) account: Option<Reference>,
  pub(crate) totalNet: Option<Money>,
  pub(crate) recipient: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) totalGross: Option<Money>,
  pub(crate) paymentTerms: Option<String>,
  pub(crate) cancelledReason: Option<String>,
  pub(crate) totalPriceComponent: Vector<Invoice_LineItem_PriceComponent>,
  pub(crate) participant: Vector<Invoice_Participant>,
  pub(crate) lineItem: Vector<Invoice_LineItem>,
}