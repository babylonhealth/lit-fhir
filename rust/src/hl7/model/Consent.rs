use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Consent_Policy {
  pub(crate) id?: String,
  pub(crate) uri?: String,
  pub(crate) extension?: Extension,
  pub(crate) authority?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct Consent_Verification {
  pub(crate) id?: String,
  pub(crate) verified: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) verifiedWith?: Reference,
  pub(crate) verificationDate?: Date,
  pub(crate) modifierExtension?: Extension,
}


pub struct Consent_Provision_Data {
  pub(crate) id?: String,
  pub(crate) meaning: String,
  pub(crate) extension?: Extension,
  pub(crate) reference: Reference,
  pub(crate) modifierExtension?: Extension,
}



pub struct Consent_Provision_Actor {
  pub(crate) id?: String,
  pub(crate) role: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) reference: Reference,
  pub(crate) modifierExtension?: Extension,
}

pub struct Consent_Provision {
  pub(crate) id?: String,
  pub(crate) _type?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) class?: Coding,
  pub(crate) period?: Period,
  pub(crate) action?: CodeableConcept,
  pub(crate) purpose?: Coding,
  pub(crate) extension?: Extension,
  pub(crate) provision?: Consent_Provision,
  pub(crate) dataPeriod?: Period,
  pub(crate) securityLabel?: Coding,
  pub(crate) modifierExtension?: Extension,
  pub(crate) data?: Consent_Provision_Data,
  pub(crate) actor?: Consent_Provision_Actor,
}

pub struct Consent {
  pub(crate) scope: CodeableConcept,
  pub(crate) status: String,
  pub(crate) patient?: Reference,
  pub(crate) category: CodeableConcept,
  pub(crate) dateTime?: Date,
  pub(crate) performer?: Reference,
  pub(crate) source?: Attachment | Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) policyRule?: CodeableConcept,
  pub(crate) organization?: Reference,
  pub(crate) policy?: Consent_Policy,
  pub(crate) verification?: Consent_Verification,
  pub(crate) provision?: Consent_Provision,
}