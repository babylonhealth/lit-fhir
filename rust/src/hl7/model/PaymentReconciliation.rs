use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

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
  pub(crate) date: Option<FHIRDate>,
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
  pub(crate) paymentDate: FHIRDate,
  pub(crate) implicitRules: Option<String>,
  pub(crate) paymentIssuer: Option<Box<dyn Reference>>,
  pub(crate) paymentAmount: Box<dyn Money>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) paymentIdentifier: Option<Box<dyn Identifier>>,
  pub(crate) detail: Vector<PaymentReconciliation_Detail>,
  pub(crate) processNote: Vector<PaymentReconciliation_ProcessNote>,
}

pub trait PaymentReconciliation : DomainResource {
  fn status(&self) -> &String;
  fn period(&self) -> &Option<Box<dyn Period>>;
  fn created(&self) -> &DateTime<FixedOffset>;
  fn request(&self) -> &Option<Box<dyn Reference>>;
  fn outcome(&self) -> &Option<String>;
  fn formCode(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn requestor(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn disposition(&self) -> &Option<String>;
  fn paymentDate(&self) -> &FHIRDate;
  fn paymentIssuer(&self) -> &Option<Box<dyn Reference>>;
  fn paymentAmount(&self) -> &Box<dyn Money>;
  fn paymentIdentifier(&self) -> &Option<Box<dyn Identifier>>;
  fn detail(&self) -> &Vector<PaymentReconciliation_Detail>;
  fn processNote(&self) -> &Vector<PaymentReconciliation_ProcessNote>;
}

dyn_clone::clone_trait_object!(PaymentReconciliation);

impl FHIRObject for PaymentReconciliationRaw {
}

impl Resource for PaymentReconciliationRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for PaymentReconciliationRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl PaymentReconciliation for PaymentReconciliationRaw {
  fn status(&self) -> &String { &self.status }
  fn period(&self) -> &Option<Box<dyn Period>> { &self.period }
  fn created(&self) -> &DateTime<FixedOffset> { &self.created }
  fn request(&self) -> &Option<Box<dyn Reference>> { &self.request }
  fn outcome(&self) -> &Option<String> { &self.outcome }
  fn formCode(&self) -> &Option<Box<dyn CodeableConcept>> { &self.formCode }
  fn requestor(&self) -> &Option<Box<dyn Reference>> { &self.requestor }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn disposition(&self) -> &Option<String> { &self.disposition }
  fn paymentDate(&self) -> &FHIRDate { &self.paymentDate }
  fn paymentIssuer(&self) -> &Option<Box<dyn Reference>> { &self.paymentIssuer }
  fn paymentAmount(&self) -> &Box<dyn Money> { &self.paymentAmount }
  fn paymentIdentifier(&self) -> &Option<Box<dyn Identifier>> { &self.paymentIdentifier }
  fn detail(&self) -> &Vector<PaymentReconciliation_Detail> { &self.detail }
  fn processNote(&self) -> &Vector<PaymentReconciliation_ProcessNote> { &self.processNote }
}

