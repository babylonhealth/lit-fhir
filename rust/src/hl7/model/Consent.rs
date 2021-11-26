use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::hl7::UnionAttachmentOrReference;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Coding::Coding;
use crate::core::model::Period::Period;
use crate::core::model::Consent_Provision::Consent_Provision;



#[derive(Clone, Debug)]
pub struct Consent_Policy {
  pub(crate) id: Option<String>,
  pub(crate) uri: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) authority: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Consent_Verification {
  pub(crate) id: Option<String>,
  pub(crate) verified: bool,
  pub(crate) extension: Vector<Extension>,
  pub(crate) verifiedWith: Option<Reference>,
  pub(crate) verificationDate: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Consent_Provision_Data {
  pub(crate) id: Option<String>,
  pub(crate) meaning: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) reference: Reference,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct Consent_Provision_Actor {
  pub(crate) id: Option<String>,
  pub(crate) role: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) reference: Reference,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Consent_Provision {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) code: Vector<CodeableConcept>,
  pub(crate) class: Vector<Coding>,
  pub(crate) period: Option<Period>,
  pub(crate) action: Vector<CodeableConcept>,
  pub(crate) purpose: Vector<Coding>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) provision: Vector<Consent_Provision>,
  pub(crate) dataPeriod: Option<Period>,
  pub(crate) securityLabel: Vector<Coding>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) data: Vector<Consent_Provision_Data>,
  pub(crate) actor: Vector<Consent_Provision_Actor>,
}

#[derive(Clone, Debug)]
pub struct Consent {
  pub(crate) scope: CodeableConcept,
  pub(crate) status: String,
  pub(crate) patient: Option<Reference>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) dateTime: Option<DateTime<FixedOffset>>,
  pub(crate) performer: Vector<Reference>,
  pub(crate) source: Option<UnionAttachmentOrReference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) policyRule: Option<CodeableConcept>,
  pub(crate) organization: Vector<Reference>,
  pub(crate) policy: Vector<Consent_Policy>,
  pub(crate) verification: Vector<Consent_Verification>,
  pub(crate) provision: Option<Consent_Provision>,
}