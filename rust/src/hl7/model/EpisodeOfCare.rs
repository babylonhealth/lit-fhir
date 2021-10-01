use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct EpisodeOfCare_Diagnosis {
  pub(crate) id?: String,
  pub(crate) role?: CodeableConcept,
  pub(crate) rank?: u32,
  pub(crate) extension?: Extension,
  pub(crate) condition: Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct EpisodeOfCare_StatusHistory {
  pub(crate) id?: String,
  pub(crate) status: String,
  pub(crate) period: Period,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct EpisodeOfCare {
  pub(crate) _type?: CodeableConcept,
  pub(crate) team?: Reference,
  pub(crate) status: String,
  pub(crate) period?: Period,
  pub(crate) patient: Reference,
  pub(crate) account?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) careManager?: Reference,
  pub(crate) referralRequest?: Reference,
  pub(crate) managingOrganization?: Reference,
  pub(crate) diagnosis?: EpisodeOfCare_Diagnosis,
  pub(crate) statusHistory?: EpisodeOfCare_StatusHistory,
}