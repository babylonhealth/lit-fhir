use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Evidence {
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
  pub(crate) outcome?: Reference,
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
  pub(crate) exposureVariant?: Reference,
  pub(crate) exposureBackground: Reference,
}