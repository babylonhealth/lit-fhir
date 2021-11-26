use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Annotation::Annotation;
use crate::core::model::Reference::Reference;
use crate::core::model::Money::Money;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Invoice_LineItem_PriceComponent::Invoice_LineItem_PriceComponent;
use crate::core::UnionCodeableConceptOrReference;



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
  pub(crate) chargeItem: UnionCodeableConceptOrReference,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) priceComponent: Vector<Invoice_LineItem_PriceComponent>,
}

#[derive(Clone, Debug)]
pub struct Invoice {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
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