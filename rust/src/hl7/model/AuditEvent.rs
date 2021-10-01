use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct AuditEvent_Source {
  pub(crate) id: Option<String>,
  pub(crate) site: Option<String>,
  pub(crate) _type: Vector<Coding>,
  pub(crate) observer: Reference,
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
  pub(crate) who: Option<Reference>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) role: Vector<CodeableConcept>,
  pub(crate) name: Option<String>,
  pub(crate) altId: Option<String>,
  pub(crate) media: Option<Coding>,
  pub(crate) policy: Vector<String>,
  pub(crate) location: Option<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) requestor: Boolean,
  pub(crate) purposeOfUse: Vector<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) network: Option<AuditEvent_Agent_Network>,
}


#[derive(Clone, Debug)]
pub struct AuditEvent_Entity_Detail {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) value: String | String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct AuditEvent_Entity {
  pub(crate) id: Option<String>,
  pub(crate) what: Option<Reference>,
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
  pub(crate) recorded: Date,
  pub(crate) outcomeDesc: Option<String>,
  pub(crate) purposeOfEvent: Vector<CodeableConcept>,
  pub(crate) source: AuditEvent_Source,
  pub(crate) agent: Vector<AuditEvent_Agent>,
  pub(crate) entity: Vector<AuditEvent_Entity>,
}