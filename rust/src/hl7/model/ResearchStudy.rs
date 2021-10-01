use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ResearchStudy_Arm {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct ResearchStudy_Objective {
  pub(crate) id?: String,
  pub(crate) name?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct ResearchStudy {
  pub(crate) site?: Reference,
  pub(crate) note?: Annotation,
  pub(crate) title?: String,
  pub(crate) phase?: CodeableConcept,
  pub(crate) focus?: CodeableConcept,
  pub(crate) partOf?: Reference,
  pub(crate) status: String,
  pub(crate) period?: Period,
  pub(crate) contact?: ContactDetail,
  pub(crate) keyword?: CodeableConcept,
  pub(crate) sponsor?: Reference,
  pub(crate) protocol?: Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) location?: CodeableConcept,
  pub(crate) condition?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) enrollment?: Reference,
  pub(crate) description?: String,
  pub(crate) reasonStopped?: CodeableConcept,
  pub(crate) relatedArtifact?: RelatedArtifact,
  pub(crate) primaryPurposeType?: CodeableConcept,
  pub(crate) principalInvestigator?: Reference,
  pub(crate) arm?: ResearchStudy_Arm,
  pub(crate) objective?: ResearchStudy_Objective,
}