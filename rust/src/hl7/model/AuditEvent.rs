use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct AuditEvent_Source {
  pub(crate) id?: String,
  pub(crate) site?: String,
  pub(crate) _type?: Coding,
  pub(crate) observer: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct AuditEvent_Agent_Network {
  pub(crate) id?: String,
  pub(crate) _type?: String,
  pub(crate) address?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct AuditEvent_Agent {
  pub(crate) id?: String,
  pub(crate) who?: Reference,
  pub(crate) _type?: CodeableConcept,
  pub(crate) role?: CodeableConcept,
  pub(crate) name?: String,
  pub(crate) altId?: String,
  pub(crate) media?: Coding,
  pub(crate) policy?: String,
  pub(crate) location?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) requestor: Boolean,
  pub(crate) purposeOfUse?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) network?: AuditEvent_Agent_Network,
}


pub struct AuditEvent_Entity_Detail {
  pub(crate) id?: String,
  pub(crate) _type: String,
  pub(crate) value: String | String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct AuditEvent_Entity {
  pub(crate) id?: String,
  pub(crate) what?: Reference,
  pub(crate) _type?: Coding,
  pub(crate) role?: Coding,
  pub(crate) name?: String,
  pub(crate) query?: String,
  pub(crate) extension?: Extension,
  pub(crate) lifecycle?: Coding,
  pub(crate) description?: String,
  pub(crate) securityLabel?: Coding,
  pub(crate) modifierExtension?: Extension,
  pub(crate) detail?: AuditEvent_Entity_Detail,
}

pub struct AuditEvent {
  pub(crate) _type: Coding,
  pub(crate) action?: String,
  pub(crate) period?: Period,
  pub(crate) subtype?: Coding,
  pub(crate) outcome?: String,
  pub(crate) recorded: Date,
  pub(crate) outcomeDesc?: String,
  pub(crate) purposeOfEvent?: CodeableConcept,
  pub(crate) source: AuditEvent_Source,
  pub(crate) agent: AuditEvent_Agent,
  pub(crate) entity?: AuditEvent_Entity,
}