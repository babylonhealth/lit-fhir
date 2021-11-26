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
use crate::core::model::Timing::Timing;
use crate::core::model::Signature::Signature;



#[derive(Clone, Debug)]
pub struct VerificationResult_Validator {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) organization: Box<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) identityCertificate: Option<String>,
  pub(crate) attestationSignature: Option<Signature>,
}


#[derive(Clone, Debug)]
pub struct VerificationResult_PrimarySource {
  pub(crate) id: Option<String>,
  pub(crate) who: Option<Box<Reference>>,
  pub(crate) _type: Vector<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) validationDate: Option<DateTime<FixedOffset>>,
  pub(crate) canPushUpdates: Option<CodeableConcept>,
  pub(crate) validationStatus: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) pushTypeAvailable: Vector<CodeableConcept>,
  pub(crate) communicationMethod: Vector<CodeableConcept>,
}


#[derive(Clone, Debug)]
pub struct VerificationResult_Attestation {
  pub(crate) id: Option<String>,
  pub(crate) who: Option<Box<Reference>>,
  pub(crate) date: Option<FHIRDate>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) onBehalfOf: Option<Box<Reference>>,
  pub(crate) proxySignature: Option<Signature>,
  pub(crate) sourceSignature: Option<Signature>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) communicationMethod: Option<CodeableConcept>,
  pub(crate) proxyIdentityCertificate: Option<String>,
  pub(crate) sourceIdentityCertificate: Option<String>,
}

#[derive(Clone, Debug)]
pub struct VerificationResult {
  pub(crate) need: Option<CodeableConcept>,
  pub(crate) target: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) frequency: Option<Timing>,
  pub(crate) statusDate: Option<DateTime<FixedOffset>>,
  pub(crate) lastPerformed: Option<DateTime<FixedOffset>>,
  pub(crate) nextScheduled: Option<FHIRDate>,
  pub(crate) failureAction: Option<CodeableConcept>,
  pub(crate) targetLocation: Vector<String>,
  pub(crate) validationType: Option<CodeableConcept>,
  pub(crate) validationProcess: Vector<CodeableConcept>,
  pub(crate) validator: Vector<VerificationResult_Validator>,
  pub(crate) primarySource: Vector<VerificationResult_PrimarySource>,
  pub(crate) attestation: Option<VerificationResult_Attestation>,
}