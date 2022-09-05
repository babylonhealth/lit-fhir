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
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Signature::Signature;
use crate::core::model::Timing::Timing;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct VerificationResult_Validator {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) organization: Box<dyn Reference>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) identityCertificate: Option<String>,
  pub(crate) attestationSignature: Option<Box<dyn Signature>>,
}


#[derive(Clone, Debug)]
pub struct VerificationResult_PrimarySource {
  pub(crate) id: Option<String>,
  pub(crate) who: Option<Box<dyn Reference>>,
  pub(crate) _type: Vector<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) validationDate: Option<DateTime<FixedOffset>>,
  pub(crate) canPushUpdates: Option<Box<dyn CodeableConcept>>,
  pub(crate) validationStatus: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) pushTypeAvailable: Vector<Box<dyn CodeableConcept>>,
  pub(crate) communicationMethod: Vector<Box<dyn CodeableConcept>>,
}


#[derive(Clone, Debug)]
pub struct VerificationResult_Attestation {
  pub(crate) id: Option<String>,
  pub(crate) who: Option<Box<dyn Reference>>,
  pub(crate) date: Option<LocalDate>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) onBehalfOf: Option<Box<dyn Reference>>,
  pub(crate) proxySignature: Option<Box<dyn Signature>>,
  pub(crate) sourceSignature: Option<Box<dyn Signature>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) communicationMethod: Option<Box<dyn CodeableConcept>>,
  pub(crate) proxyIdentityCertificate: Option<String>,
  pub(crate) sourceIdentityCertificate: Option<String>,
}

#[derive(Clone, Debug)]
pub struct VerificationResultRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) need: Option<Box<dyn CodeableConcept>>,
  pub(crate) target: Vector<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) frequency: Option<Box<dyn Timing>>,
  pub(crate) statusDate: Option<DateTime<FixedOffset>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) lastPerformed: Option<DateTime<FixedOffset>>,
  pub(crate) nextScheduled: Option<LocalDate>,
  pub(crate) failureAction: Option<Box<dyn CodeableConcept>>,
  pub(crate) targetLocation: Vector<String>,
  pub(crate) validationType: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) validationProcess: Vector<Box<dyn CodeableConcept>>,
  pub(crate) validator: Vector<Box<VerificationResult_Validator>>,
  pub(crate) primarySource: Vector<Box<VerificationResult_PrimarySource>>,
  pub(crate) attestation: Option<Box<VerificationResult_Attestation>>,
}

pub trait VerificationResult : DomainResource {
  fn need(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn target(&self) -> &Vector<Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn frequency(&self) -> &Option<Box<dyn Timing>>;
  fn statusDate(&self) -> &Option<DateTime<FixedOffset>>;
  fn lastPerformed(&self) -> &Option<DateTime<FixedOffset>>;
  fn nextScheduled(&self) -> &Option<LocalDate>;
  fn failureAction(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn targetLocation(&self) -> &Vector<String>;
  fn validationType(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn validationProcess(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn validator(&self) -> &Vector<Box<VerificationResult_Validator>>;
  fn primarySource(&self) -> &Vector<Box<VerificationResult_PrimarySource>>;
  fn attestation(&self) -> &Option<Box<VerificationResult_Attestation>>;
}

dyn_clone::clone_trait_object!(VerificationResult);

impl FHIRObject for VerificationResultRaw {
}

impl Resource for VerificationResultRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for VerificationResultRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl VerificationResult for VerificationResultRaw {
  fn need(&self) -> &Option<Box<dyn CodeableConcept>> { &self.need }
  fn target(&self) -> &Vector<Box<dyn Reference>> { &self.target }
  fn status(&self) -> &String { &self.status }
  fn frequency(&self) -> &Option<Box<dyn Timing>> { &self.frequency }
  fn statusDate(&self) -> &Option<DateTime<FixedOffset>> { &self.statusDate }
  fn lastPerformed(&self) -> &Option<DateTime<FixedOffset>> { &self.lastPerformed }
  fn nextScheduled(&self) -> &Option<LocalDate> { &self.nextScheduled }
  fn failureAction(&self) -> &Option<Box<dyn CodeableConcept>> { &self.failureAction }
  fn targetLocation(&self) -> &Vector<String> { &self.targetLocation }
  fn validationType(&self) -> &Option<Box<dyn CodeableConcept>> { &self.validationType }
  fn validationProcess(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.validationProcess }
  fn validator(&self) -> &Vector<Box<VerificationResult_Validator>> { &self.validator }
  fn primarySource(&self) -> &Vector<Box<VerificationResult_PrimarySource>> { &self.primarySource }
  fn attestation(&self) -> &Option<Box<VerificationResult_Attestation>> { &self.attestation }
}

