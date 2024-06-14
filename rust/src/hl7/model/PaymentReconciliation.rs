use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Money::Money;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct PaymentReconciliation_Detail {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) date: Option<LocalDate>,
  pub(crate) payee: Option<Box<dyn Reference>>,
  pub(crate) amount: Option<Box<dyn Money>>,
  pub(crate) request: Option<Box<dyn Reference>>,
  pub(crate) response: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) submitter: Option<Box<dyn Reference>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) predecessor: Option<Box<dyn Identifier>>,
  pub(crate) responsible: Option<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct PaymentReconciliation_ProcessNote {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) text: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct PaymentReconciliationRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) status: String,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) created: DateTime<FixedOffset>,
  pub(crate) request: Option<Box<dyn Reference>>,
  pub(crate) outcome: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) formCode: Option<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) requestor: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) disposition: Option<String>,
  pub(crate) paymentDate: LocalDate,
  pub(crate) implicitRules: Option<String>,
  pub(crate) paymentIssuer: Option<Box<dyn Reference>>,
  pub(crate) paymentAmount: Box<dyn Money>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) paymentIdentifier: Option<Box<dyn Identifier>>,
  pub(crate) detail: Vector<Box<PaymentReconciliation_Detail>>,
  pub(crate) processNote: Vector<Box<PaymentReconciliation_ProcessNote>>,
}

pub trait PaymentReconciliation : DomainResource {
  fn status(&self) -> &String;
  fn period(&self) -> Option<&Box<dyn Period>>;
  fn created(&self) -> &DateTime<FixedOffset>;
  fn request(&self) -> Option<&Box<dyn Reference>>;
  fn outcome(&self) -> Option<&String>;
  fn formCode(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn requestor(&self) -> Option<&Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn disposition(&self) -> Option<&String>;
  fn paymentDate(&self) -> &LocalDate;
  fn paymentIssuer(&self) -> Option<&Box<dyn Reference>>;
  fn paymentAmount(&self) -> &Box<dyn Money>;
  fn paymentIdentifier(&self) -> Option<&Box<dyn Identifier>>;
  fn detail(&self) -> &Vector<Box<PaymentReconciliation_Detail>>;
  fn processNote(&self) -> &Vector<Box<PaymentReconciliation_ProcessNote>>;
}

dyn_clone::clone_trait_object!(PaymentReconciliation);

impl FHIRObject for PaymentReconciliationRaw {
}

impl Resource for PaymentReconciliationRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for PaymentReconciliationRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl PaymentReconciliation for PaymentReconciliationRaw {
  fn status(&self) -> &String { &self.status }
  fn period(&self) -> Option<&Box<dyn Period>> { self.period.as_ref() }
  fn created(&self) -> &DateTime<FixedOffset> { &self.created }
  fn request(&self) -> Option<&Box<dyn Reference>> { self.request.as_ref() }
  fn outcome(&self) -> Option<&String> { self.outcome.as_ref() }
  fn formCode(&self) -> Option<&Box<dyn CodeableConcept>> { self.formCode.as_ref() }
  fn requestor(&self) -> Option<&Box<dyn Reference>> { self.requestor.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn disposition(&self) -> Option<&String> { self.disposition.as_ref() }
  fn paymentDate(&self) -> &LocalDate { &self.paymentDate }
  fn paymentIssuer(&self) -> Option<&Box<dyn Reference>> { self.paymentIssuer.as_ref() }
  fn paymentAmount(&self) -> &Box<dyn Money> { &self.paymentAmount }
  fn paymentIdentifier(&self) -> Option<&Box<dyn Identifier>> { self.paymentIdentifier.as_ref() }
  fn detail(&self) -> &Vector<Box<PaymentReconciliation_Detail>> { &self.detail }
  fn processNote(&self) -> &Vector<Box<PaymentReconciliation_ProcessNote>> { &self.processNote }
}

