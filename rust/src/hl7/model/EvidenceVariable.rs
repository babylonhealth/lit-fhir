use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct EvidenceVariable_Characteristic {
  pub(crate) id?: String,
  pub(crate) exclude?: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) usageContext?: UsageContext,
  pub(crate) groupMeasure?: String,
  pub(crate) definition: String | CodeableConcept | DataRequirement | Expression | Reference | TriggerDefinition,
  pub(crate) timeFromStart?: Duration,
  pub(crate) modifierExtension?: Extension,
  pub(crate) participantEffective?: Duration | Date | Period | Timing,
}

pub struct EvidenceVariable {
  pub(crate) url?: String,
  pub(crate) name?: String,
  pub(crate) date?: Date,
  pub(crate) note?: Annotation,
  pub(crate) _type?: String,
  pub(crate) title?: String,
  pub(crate) topic?: CodeableConcept,
  pub(crate) status: String,
  pub(crate) author?: ContactDetail,
  pub(crate) editor?: ContactDetail,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) subtitle?: String,
  pub(crate) reviewer?: ContactDetail,
  pub(crate) endorser?: ContactDetail,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) shortTitle?: String,
  pub(crate) useContext?: UsageContext,
  pub(crate) description?: String,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) approvalDate?: FHIRDate,
  pub(crate) lastReviewDate?: FHIRDate,
  pub(crate) effectivePeriod?: Period,
  pub(crate) relatedArtifact?: RelatedArtifact,
  pub(crate) characteristic: EvidenceVariable_Characteristic,
}