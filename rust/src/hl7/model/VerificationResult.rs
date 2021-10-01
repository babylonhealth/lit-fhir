use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct VerificationResult_Validator {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) organization: Reference,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) identityCertificate: Option<String>,
  pub(crate) attestationSignature: Option<Signature>,
}


#[derive(Clone, Debug)]
pub struct VerificationResult_PrimarySource {
  pub(crate) id: Option<String>,
  pub(crate) who: Option<Reference>,
  pub(crate) _type: Vector<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) validationDate: Option<Date>,
  pub(crate) canPushUpdates: Option<CodeableConcept>,
  pub(crate) validationStatus: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) pushTypeAvailable: Vector<CodeableConcept>,
  pub(crate) communicationMethod: Vector<CodeableConcept>,
}


#[derive(Clone, Debug)]
pub struct VerificationResult_Attestation {
  pub(crate) id: Option<String>,
  pub(crate) who: Option<Reference>,
  pub(crate) date: Option<FHIRDate>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) onBehalfOf: Option<Reference>,
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
  pub(crate) statusDate: Option<Date>,
  pub(crate) lastPerformed: Option<Date>,
  pub(crate) nextScheduled: Option<FHIRDate>,
  pub(crate) failureAction: Option<CodeableConcept>,
  pub(crate) targetLocation: Vector<String>,
  pub(crate) validationType: Option<CodeableConcept>,
  pub(crate) validationProcess: Vector<CodeableConcept>,
  pub(crate) validator: Vector<VerificationResult_Validator>,
  pub(crate) primarySource: Vector<VerificationResult_PrimarySource>,
  pub(crate) attestation: Option<VerificationResult_Attestation>,
}