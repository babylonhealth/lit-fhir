use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct EffectEvidenceSynthesis_SampleSize {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) numberOfStudies?: i32,
  pub(crate) modifierExtension?: Extension,
  pub(crate) numberOfParticipants?: i32,
}


pub struct EffectEvidenceSynthesis_ResultsByExposure {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) variantState?: CodeableConcept,
  pub(crate) exposureState?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) riskEvidenceSynthesis: Reference,
}


pub struct EffectEvidenceSynthesis_Certainty_CertaintySubcomponent {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) rating?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct EffectEvidenceSynthesis_Certainty {
  pub(crate) id?: String,
  pub(crate) note?: Annotation,
  pub(crate) rating?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) certaintySubcomponent?: EffectEvidenceSynthesis_Certainty_CertaintySubcomponent,
}


pub struct EffectEvidenceSynthesis_EffectEstimate_PrecisionEstimate {
  pub(crate) id?: String,
  pub(crate) to?: BigDecimal,
  pub(crate) _type?: CodeableConcept,
  pub(crate) from?: BigDecimal,
  pub(crate) level?: BigDecimal,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct EffectEvidenceSynthesis_EffectEstimate {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) value?: BigDecimal,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) variantState?: CodeableConcept,
  pub(crate) unitOfMeasure?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) precisionEstimate?: EffectEvidenceSynthesis_EffectEstimate_PrecisionEstimate,
}

pub struct EffectEvidenceSynthesis {
  pub(crate) url?: String,
  pub(crate) name?: String,
  pub(crate) date?: Date,
  pub(crate) note?: Annotation,
  pub(crate) title?: String,
  pub(crate) topic?: CodeableConcept,
  pub(crate) status: String,
  pub(crate) author?: ContactDetail,
  pub(crate) editor?: ContactDetail,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) outcome: Reference,
  pub(crate) reviewer?: ContactDetail,
  pub(crate) endorser?: ContactDetail,
  pub(crate) exposure: Reference,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) studyType?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) useContext?: UsageContext,
  pub(crate) population: Reference,
  pub(crate) description?: String,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) approvalDate?: FHIRDate,
  pub(crate) synthesisType?: CodeableConcept,
  pub(crate) lastReviewDate?: FHIRDate,
  pub(crate) effectivePeriod?: Period,
  pub(crate) relatedArtifact?: RelatedArtifact,
  pub(crate) exposureAlternative: Reference,
  pub(crate) sampleSize?: EffectEvidenceSynthesis_SampleSize,
  pub(crate) resultsByExposure?: EffectEvidenceSynthesis_ResultsByExposure,
  pub(crate) certainty?: EffectEvidenceSynthesis_Certainty,
  pub(crate) effectEstimate?: EffectEvidenceSynthesis_EffectEstimate,
}