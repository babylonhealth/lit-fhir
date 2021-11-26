use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct EpisodeOfCare_Diagnosis {
  pub(crate) id: Option<String>,
  pub(crate) role: Option<CodeableConcept>,
  pub(crate) rank: Option<u32>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) condition: Box<Reference>,
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
  pub(crate) patient: Box<Reference>,
  pub(crate) account: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) careManager: Option<Box<Reference>>,
  pub(crate) referralRequest: Vector<Reference>,
  pub(crate) managingOrganization: Option<Box<Reference>>,
  pub(crate) diagnosis: Vector<EpisodeOfCare_Diagnosis>,
  pub(crate) statusHistory: Vector<EpisodeOfCare_StatusHistory>,
}