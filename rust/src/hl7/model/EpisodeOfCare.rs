use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct EpisodeOfCare_Diagnosis {
  pub(crate) id: Option<String>,
  pub(crate) role: Option<Box<dyn CodeableConcept>>,
  pub(crate) rank: Option<u32>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) condition: Box<dyn Reference>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct EpisodeOfCare_StatusHistory {
  pub(crate) id: Option<String>,
  pub(crate) status: String,
  pub(crate) period: Box<dyn Period>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct EpisodeOfCareRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Vector<Box<dyn CodeableConcept>>,
  pub(crate) team: Vector<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) patient: Box<dyn Reference>,
  pub(crate) account: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) careManager: Option<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) referralRequest: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) managingOrganization: Option<Box<dyn Reference>>,
  pub(crate) diagnosis: Vector<Box<EpisodeOfCare_Diagnosis>>,
  pub(crate) statusHistory: Vector<Box<EpisodeOfCare_StatusHistory>>,
}

pub trait EpisodeOfCare : DomainResource {
  fn _type(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn team(&self) -> &Vector<Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn period(&self) -> &Option<Box<dyn Period>>;
  fn patient(&self) -> &Box<dyn Reference>;
  fn account(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn careManager(&self) -> &Option<Box<dyn Reference>>;
  fn referralRequest(&self) -> &Vector<Box<dyn Reference>>;
  fn managingOrganization(&self) -> &Option<Box<dyn Reference>>;
  fn diagnosis(&self) -> &Vector<Box<EpisodeOfCare_Diagnosis>>;
  fn statusHistory(&self) -> &Vector<Box<EpisodeOfCare_StatusHistory>>;
}

dyn_clone::clone_trait_object!(EpisodeOfCare);

impl FHIRObject for EpisodeOfCareRaw {
}

impl Resource for EpisodeOfCareRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for EpisodeOfCareRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl EpisodeOfCare for EpisodeOfCareRaw {
  fn _type(&self) -> &Vector<Box<dyn CodeableConcept>> { &self._type }
  fn team(&self) -> &Vector<Box<dyn Reference>> { &self.team }
  fn status(&self) -> &String { &self.status }
  fn period(&self) -> &Option<Box<dyn Period>> { &self.period }
  fn patient(&self) -> &Box<dyn Reference> { &self.patient }
  fn account(&self) -> &Vector<Box<dyn Reference>> { &self.account }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn careManager(&self) -> &Option<Box<dyn Reference>> { &self.careManager }
  fn referralRequest(&self) -> &Vector<Box<dyn Reference>> { &self.referralRequest }
  fn managingOrganization(&self) -> &Option<Box<dyn Reference>> { &self.managingOrganization }
  fn diagnosis(&self) -> &Vector<Box<EpisodeOfCare_Diagnosis>> { &self.diagnosis }
  fn statusHistory(&self) -> &Vector<Box<EpisodeOfCare_StatusHistory>> { &self.statusHistory }
}

