use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionDateTimeOrPeriod;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



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
  pub(crate) evidence: Vector<DetectedIssue_Evidence>,
  pub(crate) mitigation: Vector<DetectedIssue_Mitigation>,
}

pub trait DetectedIssue : DomainResource {
  fn code(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn status(&self) -> &String;
  fn author(&self) -> &Option<Box<dyn Reference>>;
  fn detail(&self) -> &Option<String>;
  fn patient(&self) -> &Option<Box<dyn Reference>>;
  fn severity(&self) -> &Option<String>;
  fn reference(&self) -> &Option<String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn implicated(&self) -> &Vector<Box<dyn Reference>>;
  fn identified(&self) -> &Option<UnionDateTimeOrPeriod>;
  fn evidence(&self) -> &Vector<DetectedIssue_Evidence>;
  fn mitigation(&self) -> &Vector<DetectedIssue_Mitigation>;
}

dyn_clone::clone_trait_object!(DetectedIssue);

impl FHIRObject for DetectedIssueRaw {
}

impl Resource for DetectedIssueRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for DetectedIssueRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl DetectedIssue for DetectedIssueRaw {
  fn code(&self) -> &Option<Box<dyn CodeableConcept>> { &self.code }
  fn status(&self) -> &String { &self.status }
  fn author(&self) -> &Option<Box<dyn Reference>> { &self.author }
  fn detail(&self) -> &Option<String> { &self.detail }
  fn patient(&self) -> &Option<Box<dyn Reference>> { &self.patient }
  fn severity(&self) -> &Option<String> { &self.severity }
  fn reference(&self) -> &Option<String> { &self.reference }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn implicated(&self) -> &Vector<Box<dyn Reference>> { &self.implicated }
  fn identified(&self) -> &Option<UnionDateTimeOrPeriod> { &self.identified }
  fn evidence(&self) -> &Vector<DetectedIssue_Evidence> { &self.evidence }
  fn mitigation(&self) -> &Vector<DetectedIssue_Mitigation> { &self.mitigation }
}

