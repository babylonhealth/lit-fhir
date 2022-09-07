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
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionDateTimeOrPeriod;



#[derive(Clone, Debug)]
pub struct DetectedIssue_Evidence {
  pub(crate) id: Option<String>,
  pub(crate) code: Vector<Box<dyn CodeableConcept>>,
  pub(crate) detail: Vector<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct DetectedIssue_Mitigation {
  pub(crate) id: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) action: Box<dyn CodeableConcept>,
  pub(crate) author: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct DetectedIssueRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) status: String,
  pub(crate) author: Option<Box<dyn Reference>>,
  pub(crate) detail: Option<String>,
  pub(crate) patient: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) severity: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) reference: Option<String>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) implicated: Vector<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) identified: Option<UnionDateTimeOrPeriod>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) evidence: Vector<Box<DetectedIssue_Evidence>>,
  pub(crate) mitigation: Vector<Box<DetectedIssue_Mitigation>>,
}

pub trait DetectedIssue : DomainResource {
  fn code(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn status(&self) -> &String;
  fn author(&self) -> Option<&Box<dyn Reference>>;
  fn detail(&self) -> Option<&String>;
  fn patient(&self) -> Option<&Box<dyn Reference>>;
  fn severity(&self) -> Option<&String>;
  fn reference(&self) -> Option<&String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn implicated(&self) -> &Vector<Box<dyn Reference>>;
  fn identified(&self) -> Option<&UnionDateTimeOrPeriod>;
  fn evidence(&self) -> &Vector<Box<DetectedIssue_Evidence>>;
  fn mitigation(&self) -> &Vector<Box<DetectedIssue_Mitigation>>;
}

dyn_clone::clone_trait_object!(DetectedIssue);

impl FHIRObject for DetectedIssueRaw {
}

impl Resource for DetectedIssueRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for DetectedIssueRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl DetectedIssue for DetectedIssueRaw {
  fn code(&self) -> Option<&Box<dyn CodeableConcept>> { self.code.as_ref() }
  fn status(&self) -> &String { &self.status }
  fn author(&self) -> Option<&Box<dyn Reference>> { self.author.as_ref() }
  fn detail(&self) -> Option<&String> { self.detail.as_ref() }
  fn patient(&self) -> Option<&Box<dyn Reference>> { self.patient.as_ref() }
  fn severity(&self) -> Option<&String> { self.severity.as_ref() }
  fn reference(&self) -> Option<&String> { self.reference.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn implicated(&self) -> &Vector<Box<dyn Reference>> { &self.implicated }
  fn identified(&self) -> Option<&UnionDateTimeOrPeriod> { self.identified.as_ref() }
  fn evidence(&self) -> &Vector<Box<DetectedIssue_Evidence>> { &self.evidence }
  fn mitigation(&self) -> &Vector<Box<DetectedIssue_Mitigation>> { &self.mitigation }
}

