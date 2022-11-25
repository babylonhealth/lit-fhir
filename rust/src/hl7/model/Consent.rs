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
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionAttachmentOrReference;



#[derive(Clone, Debug)]
pub struct Consent_Policy {
  pub(crate) id: Option<String>,
  pub(crate) uri: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) authority: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Consent_Verification {
  pub(crate) id: Option<String>,
  pub(crate) verified: bool,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) verifiedWith: Option<Box<dyn Reference>>,
  pub(crate) verificationDate: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Consent_Provision_Data {
  pub(crate) id: Option<String>,
  pub(crate) meaning: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) reference: Box<dyn Reference>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct Consent_Provision_Actor {
  pub(crate) id: Option<String>,
  pub(crate) role: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) reference: Box<dyn Reference>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct Consent_Provision {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) code: Vector<Box<dyn CodeableConcept>>,
  pub(crate) class: Vector<Box<dyn Coding>>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) action: Vector<Box<dyn CodeableConcept>>,
  pub(crate) purpose: Vector<Box<dyn Coding>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) provision: Vector<Box<Consent_Provision>>,
  pub(crate) dataPeriod: Option<Box<dyn Period>>,
  pub(crate) securityLabel: Vector<Box<dyn Coding>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) data: Vector<Box<Consent_Provision_Data>>,
  pub(crate) actor: Vector<Box<Consent_Provision_Actor>>,
}

#[derive(Clone, Debug)]
pub struct ConsentRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) scope: Box<dyn CodeableConcept>,
  pub(crate) status: String,
  pub(crate) patient: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) dateTime: Option<DateTime<FixedOffset>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) performer: Vector<Box<dyn Reference>>,
  pub(crate) source: Option<UnionAttachmentOrReference>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) policyRule: Option<Box<dyn CodeableConcept>>,
  pub(crate) organization: Vector<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) policy: Vector<Box<Consent_Policy>>,
  pub(crate) verification: Vector<Box<Consent_Verification>>,
  pub(crate) provision: Option<Box<Consent_Provision>>,
}

pub trait Consent : DomainResource {
  fn scope(&self) -> &Box<dyn CodeableConcept>;
  fn status(&self) -> &String;
  fn patient(&self) -> Option<&Box<dyn Reference>>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn dateTime(&self) -> Option<&DateTime<FixedOffset>>;
  fn performer(&self) -> &Vector<Box<dyn Reference>>;
  fn source(&self) -> Option<&UnionAttachmentOrReference>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn policyRule(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn organization(&self) -> &Vector<Box<dyn Reference>>;
  fn policy(&self) -> &Vector<Box<Consent_Policy>>;
  fn verification(&self) -> &Vector<Box<Consent_Verification>>;
  fn provision(&self) -> Option<&Box<Consent_Provision>>;
}

dyn_clone::clone_trait_object!(Consent);

impl FHIRObject for ConsentRaw {
}

impl Resource for ConsentRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for ConsentRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Consent for ConsentRaw {
  fn scope(&self) -> &Box<dyn CodeableConcept> { &self.scope }
  fn status(&self) -> &String { &self.status }
  fn patient(&self) -> Option<&Box<dyn Reference>> { self.patient.as_ref() }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn dateTime(&self) -> Option<&DateTime<FixedOffset>> { self.dateTime.as_ref() }
  fn performer(&self) -> &Vector<Box<dyn Reference>> { &self.performer }
  fn source(&self) -> Option<&UnionAttachmentOrReference> { self.source.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn policyRule(&self) -> Option<&Box<dyn CodeableConcept>> { self.policyRule.as_ref() }
  fn organization(&self) -> &Vector<Box<dyn Reference>> { &self.organization }
  fn policy(&self) -> &Vector<Box<Consent_Policy>> { &self.policy }
  fn verification(&self) -> &Vector<Box<Consent_Verification>> { &self.verification }
  fn provision(&self) -> Option<&Box<Consent_Provision>> { self.provision.as_ref() }
}

