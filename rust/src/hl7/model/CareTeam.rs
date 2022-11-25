use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct CareTeam_Participant {
  pub(crate) id: Option<String>,
  pub(crate) role: Vector<Box<dyn CodeableConcept>>,
  pub(crate) member: Option<Box<dyn Reference>>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) onBehalfOf: Option<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct CareTeamRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Option<String>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) status: Option<String>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) telecom: Vector<Box<dyn ContactPoint>>,
  pub(crate) language: Option<String>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) managingOrganization: Vector<Box<dyn Reference>>,
  pub(crate) participant: Vector<Box<CareTeam_Participant>>,
}

pub trait CareTeam : DomainResource {
  fn name(&self) -> Option<&String>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn status(&self) -> Option<&String>;
  fn period(&self) -> Option<&Box<dyn Period>>;
  fn subject(&self) -> Option<&Box<dyn Reference>>;
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn encounter(&self) -> Option<&Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn managingOrganization(&self) -> &Vector<Box<dyn Reference>>;
  fn participant(&self) -> &Vector<Box<CareTeam_Participant>>;
}

dyn_clone::clone_trait_object!(CareTeam);

impl FHIRObject for CareTeamRaw {
}

impl Resource for CareTeamRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for CareTeamRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl CareTeam for CareTeamRaw {
  fn name(&self) -> Option<&String> { self.name.as_ref() }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn status(&self) -> Option<&String> { self.status.as_ref() }
  fn period(&self) -> Option<&Box<dyn Period>> { self.period.as_ref() }
  fn subject(&self) -> Option<&Box<dyn Reference>> { self.subject.as_ref() }
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>> { &self.telecom }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn encounter(&self) -> Option<&Box<dyn Reference>> { self.encounter.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn managingOrganization(&self) -> &Vector<Box<dyn Reference>> { &self.managingOrganization }
  fn participant(&self) -> &Vector<Box<CareTeam_Participant>> { &self.participant }
}

