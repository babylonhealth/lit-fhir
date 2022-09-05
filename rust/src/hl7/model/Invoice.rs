use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Money::Money;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Invoice_Participant {
  pub(crate) id: Option<String>,
  pub(crate) role: Option<Box<dyn CodeableConcept>>,
  pub(crate) actor: Box<dyn Reference>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Invoice_LineItem_PriceComponent {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) amount: Option<Box<dyn Money>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct Invoice_LineItem {
  pub(crate) id: Option<String>,
  pub(crate) sequence: Option<u32>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) chargeItem: UnionCodeableConceptOrReference,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) priceComponent: Vector<Invoice_LineItem_PriceComponent>,
}

#[derive(Clone, Debug)]
pub struct InvoiceRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) status: String,
  pub(crate) issuer: Option<Box<dyn Reference>>,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) account: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) totalNet: Option<Box<dyn Money>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) recipient: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) totalGross: Option<Box<dyn Money>>,
  pub(crate) paymentTerms: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) cancelledReason: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) totalPriceComponent: Vector<Box<dyn Invoice_LineItem_PriceComponent>>,
  pub(crate) participant: Vector<Invoice_Participant>,
  pub(crate) lineItem: Vector<Invoice_LineItem>,
}

pub trait Invoice : DomainResource {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn status(&self) -> &String;
  fn issuer(&self) -> &Option<Box<dyn Reference>>;
  fn subject(&self) -> &Option<Box<dyn Reference>>;
  fn account(&self) -> &Option<Box<dyn Reference>>;
  fn totalNet(&self) -> &Option<Box<dyn Money>>;
  fn recipient(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn totalGross(&self) -> &Option<Box<dyn Money>>;
  fn paymentTerms(&self) -> &Option<String>;
  fn cancelledReason(&self) -> &Option<String>;
  fn totalPriceComponent(&self) -> &Vector<Box<dyn Invoice_LineItem_PriceComponent>>;
  fn participant(&self) -> &Vector<Invoice_Participant>;
  fn lineItem(&self) -> &Vector<Invoice_LineItem>;
}

dyn_clone::clone_trait_object!(Invoice);

impl FHIRObject for InvoiceRaw {
}

impl Resource for InvoiceRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for InvoiceRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Invoice for InvoiceRaw {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>> { &self._type }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn status(&self) -> &String { &self.status }
  fn issuer(&self) -> &Option<Box<dyn Reference>> { &self.issuer }
  fn subject(&self) -> &Option<Box<dyn Reference>> { &self.subject }
  fn account(&self) -> &Option<Box<dyn Reference>> { &self.account }
  fn totalNet(&self) -> &Option<Box<dyn Money>> { &self.totalNet }
  fn recipient(&self) -> &Option<Box<dyn Reference>> { &self.recipient }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn totalGross(&self) -> &Option<Box<dyn Money>> { &self.totalGross }
  fn paymentTerms(&self) -> &Option<String> { &self.paymentTerms }
  fn cancelledReason(&self) -> &Option<String> { &self.cancelledReason }
  fn totalPriceComponent(&self) -> &Vector<Box<dyn Invoice_LineItem_PriceComponent>> { &self.totalPriceComponent }
  fn participant(&self) -> &Vector<Invoice_Participant> { &self.participant }
  fn lineItem(&self) -> &Vector<Invoice_LineItem> { &self.lineItem }
}

