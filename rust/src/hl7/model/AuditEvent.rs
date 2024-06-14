use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionBase64BinaryOrString;



#[derive(Clone, Debug)]
pub struct AuditEvent_Source {
  pub(crate) id: Option<String>,
  pub(crate) site: Option<String>,
  pub(crate) _type: Vector<Box<dyn Coding>>,
  pub(crate) observer: Box<dyn Reference>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct AuditEvent_Agent_Network {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) address: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct AuditEvent_Agent {
  pub(crate) id: Option<String>,
  pub(crate) who: Option<Box<dyn Reference>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) role: Vector<Box<dyn CodeableConcept>>,
  pub(crate) name: Option<String>,
  pub(crate) altId: Option<String>,
  pub(crate) media: Option<Box<dyn Coding>>,
  pub(crate) policy: Vector<String>,
  pub(crate) location: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) requestor: bool,
  pub(crate) purposeOfUse: Vector<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) network: Option<Box<AuditEvent_Agent_Network>>,
}


#[derive(Clone, Debug)]
pub struct AuditEvent_Entity_Detail {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) value: UnionBase64BinaryOrString,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct AuditEvent_Entity {
  pub(crate) id: Option<String>,
  pub(crate) what: Option<Box<dyn Reference>>,
  pub(crate) _type: Option<Box<dyn Coding>>,
  pub(crate) role: Option<Box<dyn Coding>>,
  pub(crate) name: Option<String>,
  pub(crate) query: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) lifecycle: Option<Box<dyn Coding>>,
  pub(crate) description: Option<String>,
  pub(crate) securityLabel: Vector<Box<dyn Coding>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) detail: Vector<Box<AuditEvent_Entity_Detail>>,
}

#[derive(Clone, Debug)]
pub struct AuditEventRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Box<dyn Coding>,
  pub(crate) action: Option<String>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) subtype: Vector<Box<dyn Coding>>,
  pub(crate) outcome: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) recorded: DateTime<FixedOffset>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) outcomeDesc: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) purposeOfEvent: Vector<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) source: Box<AuditEvent_Source>,
  pub(crate) agent: Vector<Box<AuditEvent_Agent>>,
  pub(crate) entity: Vector<Box<AuditEvent_Entity>>,
}

pub trait AuditEvent : DomainResource {
  fn _type(&self) -> &Box<dyn Coding>;
  fn action(&self) -> Option<&String>;
  fn period(&self) -> Option<&Box<dyn Period>>;
  fn subtype(&self) -> &Vector<Box<dyn Coding>>;
  fn outcome(&self) -> Option<&String>;
  fn recorded(&self) -> &DateTime<FixedOffset>;
  fn outcomeDesc(&self) -> Option<&String>;
  fn purposeOfEvent(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn source(&self) -> &Box<AuditEvent_Source>;
  fn agent(&self) -> &Vector<Box<AuditEvent_Agent>>;
  fn entity(&self) -> &Vector<Box<AuditEvent_Entity>>;
}

dyn_clone::clone_trait_object!(AuditEvent);

impl FHIRObject for AuditEventRaw {
}

impl Resource for AuditEventRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for AuditEventRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl AuditEvent for AuditEventRaw {
  fn _type(&self) -> &Box<dyn Coding> { &self._type }
  fn action(&self) -> Option<&String> { self.action.as_ref() }
  fn period(&self) -> Option<&Box<dyn Period>> { self.period.as_ref() }
  fn subtype(&self) -> &Vector<Box<dyn Coding>> { &self.subtype }
  fn outcome(&self) -> Option<&String> { self.outcome.as_ref() }
  fn recorded(&self) -> &DateTime<FixedOffset> { &self.recorded }
  fn outcomeDesc(&self) -> Option<&String> { self.outcomeDesc.as_ref() }
  fn purposeOfEvent(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.purposeOfEvent }
  fn source(&self) -> &Box<AuditEvent_Source> { &self.source }
  fn agent(&self) -> &Vector<Box<AuditEvent_Agent>> { &self.agent }
  fn entity(&self) -> &Vector<Box<AuditEvent_Entity>> { &self.entity }
}

