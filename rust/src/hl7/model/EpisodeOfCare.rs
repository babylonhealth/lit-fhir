use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct EpisodeOfCare_Diagnosis {
  pub(crate) id: Option<String>,
  pub(crate) role: Option<CodeableConcept>,
  pub(crate) rank: Option<u32>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) condition: Reference,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct EpisodeOfCare_StatusHistory {
  pub(crate) id: Option<String>,
  pub(crate) status: String,
  pub(crate) period: Period,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct EpisodeOfCare {
  pub(crate) _type: Vector<CodeableConcept>,
  pub(crate) team: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) period: Option<Period>,
  pub(crate) patient: Reference,
  pub(crate) account: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) careManager: Option<Reference>,
  pub(crate) referralRequest: Vector<Reference>,
  pub(crate) managingOrganization: Option<Reference>,
  pub(crate) diagnosis: Vector<EpisodeOfCare_Diagnosis>,
  pub(crate) statusHistory: Vector<EpisodeOfCare_StatusHistory>,
}