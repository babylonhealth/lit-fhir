use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

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
pub struct PaymentNoticeRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) payee: Option<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) amount: Box<dyn Money>,
  pub(crate) request: Option<Box<dyn Reference>>,
  pub(crate) created: DateTime<FixedOffset>,
  pub(crate) payment: Box<dyn Reference>,
  pub(crate) language: Option<String>,
  pub(crate) response: Option<Box<dyn Reference>>,
  pub(crate) provider: Option<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) recipient: Box<dyn Reference>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) paymentDate: Option<FHIRDate>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) paymentStatus: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

pub trait PaymentNotice : DomainResource {
  fn payee(&self) -> &Option<Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn amount(&self) -> &Box<dyn Money>;
  fn request(&self) -> &Option<Box<dyn Reference>>;
  fn created(&self) -> &DateTime<FixedOffset>;
  fn payment(&self) -> &Box<dyn Reference>;
  fn response(&self) -> &Option<Box<dyn Reference>>;
  fn provider(&self) -> &Option<Box<dyn Reference>>;
  fn recipient(&self) -> &Box<dyn Reference>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn paymentDate(&self) -> &Option<FHIRDate>;
  fn paymentStatus(&self) -> &Option<Box<dyn CodeableConcept>>;
}

dyn_clone::clone_trait_object!(PaymentNotice);

impl FHIRObject for PaymentNoticeRaw {
}

impl Resource for PaymentNoticeRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for PaymentNoticeRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl PaymentNotice for PaymentNoticeRaw {
  fn payee(&self) -> &Option<Box<dyn Reference>> { &self.payee }
  fn status(&self) -> &String { &self.status }
  fn amount(&self) -> &Box<dyn Money> { &self.amount }
  fn request(&self) -> &Option<Box<dyn Reference>> { &self.request }
  fn created(&self) -> &DateTime<FixedOffset> { &self.created }
  fn payment(&self) -> &Box<dyn Reference> { &self.payment }
  fn response(&self) -> &Option<Box<dyn Reference>> { &self.response }
  fn provider(&self) -> &Option<Box<dyn Reference>> { &self.provider }
  fn recipient(&self) -> &Box<dyn Reference> { &self.recipient }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn paymentDate(&self) -> &Option<FHIRDate> { &self.paymentDate }
  fn paymentStatus(&self) -> &Option<Box<dyn CodeableConcept>> { &self.paymentStatus }
}

