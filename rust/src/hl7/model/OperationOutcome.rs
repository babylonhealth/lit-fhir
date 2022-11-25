use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct OperationOutcome_Issue {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) details: Option<Box<dyn CodeableConcept>>,
  pub(crate) severity: String,
  pub(crate) location: Vector<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) expression: Vector<String>,
  pub(crate) diagnostics: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct OperationOutcomeRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) issue: Vector<Box<OperationOutcome_Issue>>,
}

pub trait OperationOutcome : DomainResource {
  fn issue(&self) -> &Vector<Box<OperationOutcome_Issue>>;
}

dyn_clone::clone_trait_object!(OperationOutcome);

impl FHIRObject for OperationOutcomeRaw {
}

impl Resource for OperationOutcomeRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for OperationOutcomeRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl OperationOutcome for OperationOutcomeRaw {
  fn issue(&self) -> &Vector<Box<OperationOutcome_Issue>> { &self.issue }
}

