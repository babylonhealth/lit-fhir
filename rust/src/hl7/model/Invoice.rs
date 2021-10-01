use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Invoice_Participant {
  pub(crate) id?: String,
  pub(crate) role?: CodeableConcept,
  pub(crate) actor: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct Invoice_LineItem_PriceComponent {
  pub(crate) id?: String,
  pub(crate) _type: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) factor?: BigDecimal,
  pub(crate) amount?: Money,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct Invoice_LineItem {
  pub(crate) id?: String,
  pub(crate) sequence?: u32,
  pub(crate) extension?: Extension,
  pub(crate) chargeItem: CodeableConcept | Reference,
  pub(crate) modifierExtension?: Extension,
  pub(crate) priceComponent?: Invoice_LineItem_PriceComponent,
}

pub struct Invoice {
  pub(crate) _type?: CodeableConcept,
  pub(crate) date?: Date,
  pub(crate) note?: Annotation,
  pub(crate) status: String,
  pub(crate) issuer?: Reference,
  pub(crate) subject?: Reference,
  pub(crate) account?: Reference,
  pub(crate) totalNet?: Money,
  pub(crate) recipient?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) totalGross?: Money,
  pub(crate) paymentTerms?: String,
  pub(crate) cancelledReason?: String,
  pub(crate) totalPriceComponent?: Invoice_LineItem_PriceComponent,
  pub(crate) participant?: Invoice_Participant,
  pub(crate) lineItem?: Invoice_LineItem,
}