use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionBase64BinaryOrString;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct AuditEvent_Source {
  pub(crate) id: Option<String>,
  pub(crate) site: Option<String>,
  pub(crate) _type: Vector<Coding>,
  pub(crate) observer: Box<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct AuditEvent_Agent_Network {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) address: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct AuditEvent_Agent {
  pub(crate) id: Option<String>,
  pub(crate) who: Option<Box<Reference>>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) role: Vector<CodeableConcept>,
  pub(crate) name: Option<String>,
  pub(crate) altId: Option<String>,
  pub(crate) media: Option<Coding>,
  pub(crate) policy: Vector<String>,
  pub(crate) location: Option<Box<Reference>>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) requestor: bool,
  pub(crate) purposeOfUse: Vector<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) network: Option<AuditEvent_Agent_Network>,
}


#[derive(Clone, Debug)]
pub struct AuditEvent_Entity_Detail {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) value: UnionBase64BinaryOrString,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct AuditEvent_Entity {
  pub(crate) id: Option<String>,
  pub(crate) what: Option<Box<Reference>>,
  pub(crate) _type: Option<Coding>,
  pub(crate) role: Option<Coding>,
  pub(crate) name: Option<String>,
  pub(crate) query: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) lifecycle: Option<Coding>,
  pub(crate) description: Option<String>,
  pub(crate) securityLabel: Vector<Coding>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) detail: Vector<AuditEvent_Entity_Detail>,
}

#[derive(Clone, Debug)]
pub struct AuditEvent {
  pub(crate) _type: Coding,
  pub(crate) action: Option<String>,
  pub(crate) period: Option<Period>,
  pub(crate) subtype: Vector<Coding>,
  pub(crate) outcome: Option<String>,
  pub(crate) recorded: DateTime<FixedOffset>,
  pub(crate) outcomeDesc: Option<String>,
  pub(crate) purposeOfEvent: Vector<CodeableConcept>,
  pub(crate) source: AuditEvent_Source,
  pub(crate) agent: Vector<AuditEvent_Agent>,
  pub(crate) entity: Vector<AuditEvent_Entity>,
}