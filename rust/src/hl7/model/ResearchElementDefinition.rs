use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ResearchElementDefinition_Characteristic {
  pub(crate) id?: String,
  pub(crate) exclude?: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) usageContext?: UsageContext,
  pub(crate) definition: String | CodeableConcept | DataRequirement | Expression,
  pub(crate) unitOfMeasure?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) studyEffective?: Duration | Date | Period | Timing,
  pub(crate) participantEffective?: Duration | Date | Period | Timing,
  pub(crate) studyEffectiveDescription?: String,
  pub(crate) studyEffectiveGroupMeasure?: String,
  pub(crate) studyEffectiveTimeFromStart?: Duration,
  pub(crate) participantEffectiveDescription?: String,
  pub(crate) participantEffectiveGroupMeasure?: String,
  pub(crate) participantEffectiveTimeFromStart?: Duration,
}

pub struct ResearchElementDefinition {
  pub(crate) url?: String,
  pub(crate) name?: String,
  pub(crate) date?: Date,
  pub(crate) _type: String,
  pub(crate) title?: String,
  pub(crate) usage?: String,
  pub(crate) topic?: CodeableConcept,
  pub(crate) status: String,
  pub(crate) author?: ContactDetail,
  pub(crate) editor?: ContactDetail,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) comment?: String,
  pub(crate) purpose?: String,
  pub(crate) library?: String,
  pub(crate) subtitle?: String,
  pub(crate) reviewer?: ContactDetail,
  pub(crate) endorser?: ContactDetail,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) shortTitle?: String,
  pub(crate) subject?: CodeableConcept | Reference,
  pub(crate) useContext?: UsageContext,
  pub(crate) description?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) approvalDate?: FHIRDate,
  pub(crate) variableType?: String,
  pub(crate) lastReviewDate?: FHIRDate,
  pub(crate) effectivePeriod?: Period,
  pub(crate) relatedArtifact?: RelatedArtifact,
  pub(crate) characteristic: ResearchElementDefinition_Characteristic,
}