use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct CareTeam_Participant {
  pub(crate) id?: String,
  pub(crate) role?: CodeableConcept,
  pub(crate) member?: Reference,
  pub(crate) period?: Period,
  pub(crate) extension?: Extension,
  pub(crate) onBehalfOf?: Reference,
  pub(crate) modifierExtension?: Extension,
}

pub struct CareTeam {
  pub(crate) name?: String,
  pub(crate) note?: Annotation,
  pub(crate) status?: String,
  pub(crate) period?: Period,
  pub(crate) subject?: Reference,
  pub(crate) telecom?: ContactPoint,
  pub(crate) category?: CodeableConcept,
  pub(crate) encounter?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) reasonReference?: Reference,
  pub(crate) managingOrganization?: Reference,
  pub(crate) participant?: CareTeam_Participant,
}