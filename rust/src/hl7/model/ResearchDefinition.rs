use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ResearchDefinition {
  pub(crate) url?: String,
  pub(crate) name?: String,
  pub(crate) date?: Date,
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
  pub(crate) outcome?: Reference,
  pub(crate) subtitle?: String,
  pub(crate) reviewer?: ContactDetail,
  pub(crate) endorser?: ContactDetail,
  pub(crate) exposure?: Reference,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) shortTitle?: String,
  pub(crate) subject?: CodeableConcept | Reference,
  pub(crate) useContext?: UsageContext,
  pub(crate) population: Reference,
  pub(crate) description?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) approvalDate?: FHIRDate,
  pub(crate) lastReviewDate?: FHIRDate,
  pub(crate) effectivePeriod?: Period,
  pub(crate) relatedArtifact?: RelatedArtifact,
  pub(crate) exposureAlternative?: Reference,
}