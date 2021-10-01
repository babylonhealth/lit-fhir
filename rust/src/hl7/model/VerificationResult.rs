use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct VerificationResult_Validator {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) organization: Reference,
  pub(crate) modifierExtension?: Extension,
  pub(crate) identityCertificate?: String,
  pub(crate) attestationSignature?: Signature,
}


pub struct VerificationResult_PrimarySource {
  pub(crate) id?: String,
  pub(crate) who?: Reference,
  pub(crate) _type?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) validationDate?: Date,
  pub(crate) canPushUpdates?: CodeableConcept,
  pub(crate) validationStatus?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) pushTypeAvailable?: CodeableConcept,
  pub(crate) communicationMethod?: CodeableConcept,
}


pub struct VerificationResult_Attestation {
  pub(crate) id?: String,
  pub(crate) who?: Reference,
  pub(crate) date?: FHIRDate,
  pub(crate) extension?: Extension,
  pub(crate) onBehalfOf?: Reference,
  pub(crate) proxySignature?: Signature,
  pub(crate) sourceSignature?: Signature,
  pub(crate) modifierExtension?: Extension,
  pub(crate) communicationMethod?: CodeableConcept,
  pub(crate) proxyIdentityCertificate?: String,
  pub(crate) sourceIdentityCertificate?: String,
}

pub struct VerificationResult {
  pub(crate) need?: CodeableConcept,
  pub(crate) target?: Reference,
  pub(crate) status: String,
  pub(crate) frequency?: Timing,
  pub(crate) statusDate?: Date,
  pub(crate) lastPerformed?: Date,
  pub(crate) nextScheduled?: FHIRDate,
  pub(crate) failureAction?: CodeableConcept,
  pub(crate) targetLocation?: String,
  pub(crate) validationType?: CodeableConcept,
  pub(crate) validationProcess?: CodeableConcept,
  pub(crate) validator?: VerificationResult_Validator,
  pub(crate) primarySource?: VerificationResult_PrimarySource,
  pub(crate) attestation?: VerificationResult_Attestation,
}