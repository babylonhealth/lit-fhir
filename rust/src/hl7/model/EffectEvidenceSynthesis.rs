use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct EffectEvidenceSynthesis_SampleSize {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) numberOfStudies: Option<i32>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) numberOfParticipants: Option<i32>,
}


#[derive(Clone, Debug)]
pub struct EffectEvidenceSynthesis_ResultsByExposure {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) variantState: Option<CodeableConcept>,
  pub(crate) exposureState: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) riskEvidenceSynthesis: Reference,
}


#[derive(Clone, Debug)]
pub struct EffectEvidenceSynthesis_Certainty_CertaintySubcomponent {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) rating: Vector<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct EffectEvidenceSynthesis_Certainty {
  pub(crate) id: Option<String>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) rating: Vector<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) certaintySubcomponent: Vector<EffectEvidenceSynthesis_Certainty_CertaintySubcomponent>,
}


#[derive(Clone, Debug)]
pub struct EffectEvidenceSynthesis_EffectEstimate_PrecisionEstimate {
  pub(crate) id: Option<String>,
  pub(crate) to: Option<BigDecimal>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) from: Option<BigDecimal>,
  pub(crate) level: Option<BigDecimal>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct EffectEvidenceSynthesis_EffectEstimate {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) value: Option<BigDecimal>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) variantState: Option<CodeableConcept>,
  pub(crate) unitOfMeasure: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) precisionEstimate: Vector<EffectEvidenceSynthesis_EffectEstimate_PrecisionEstimate>,
}

#[derive(Clone, Debug)]
pub struct EffectEvidenceSynthesis {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<Date>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) title: Option<String>,
  pub(crate) topic: Vector<CodeableConcept>,
  pub(crate) status: String,
  pub(crate) author: Vector<ContactDetail>,
  pub(crate) editor: Vector<ContactDetail>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) outcome: Reference,
  pub(crate) reviewer: Vector<ContactDetail>,
  pub(crate) endorser: Vector<ContactDetail>,
  pub(crate) exposure: Reference,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) studyType: Option<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) population: Reference,
  pub(crate) description: Option<String>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) approvalDate: Option<FHIRDate>,
  pub(crate) synthesisType: Option<CodeableConcept>,
  pub(crate) lastReviewDate: Option<FHIRDate>,
  pub(crate) effectivePeriod: Option<Period>,
  pub(crate) relatedArtifact: Vector<RelatedArtifact>,
  pub(crate) exposureAlternative: Reference,
  pub(crate) sampleSize: Option<EffectEvidenceSynthesis_SampleSize>,
  pub(crate) resultsByExposure: Vector<EffectEvidenceSynthesis_ResultsByExposure>,
  pub(crate) certainty: Vector<EffectEvidenceSynthesis_Certainty>,
  pub(crate) effectEstimate: Vector<EffectEvidenceSynthesis_EffectEstimate>,
}