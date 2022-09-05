use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct ImagingStudy_Series_Instance {
  pub(crate) id: Option<String>,
  pub(crate) uid: String,
  pub(crate) title: Option<String>,
  pub(crate) number: Option<u32>,
  pub(crate) sopClass: Box<dyn Coding>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct ImagingStudy_Series_Performer {
  pub(crate) id: Option<String>,
  pub(crate) actor: Box<dyn Reference>,
  pub(crate) function: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ImagingStudy_Series {
  pub(crate) id: Option<String>,
  pub(crate) uid: String,
  pub(crate) number: Option<u32>,
  pub(crate) started: Option<DateTime<FixedOffset>>,
  pub(crate) modality: Box<dyn Coding>,
  pub(crate) endpoint: Vector<Box<dyn Reference>>,
  pub(crate) bodySite: Option<Box<dyn Coding>>,
  pub(crate) specimen: Vector<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) laterality: Option<Box<dyn Coding>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) numberOfInstances: Option<u32>,
  pub(crate) instance: Vector<Box<ImagingStudy_Series_Instance>>,
  pub(crate) performer: Vector<Box<ImagingStudy_Series_Performer>>,
}

#[derive(Clone, Debug)]
pub struct ImagingStudyRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) status: String,
  pub(crate) subject: Box<dyn Reference>,
  pub(crate) started: Option<DateTime<FixedOffset>>,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) modality: Vector<Box<dyn Coding>>,
  pub(crate) referrer: Option<Box<dyn Reference>>,
  pub(crate) endpoint: Vector<Box<dyn Reference>>,
  pub(crate) location: Option<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) interpreter: Vector<Box<dyn Reference>>,
  pub(crate) description: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) procedureCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) numberOfSeries: Option<u32>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) numberOfInstances: Option<u32>,
  pub(crate) procedureReference: Option<Box<dyn Reference>>,
  pub(crate) series: Vector<Box<ImagingStudy_Series>>,
}

pub trait ImagingStudy : DomainResource {
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn status(&self) -> &String;
  fn subject(&self) -> &Box<dyn Reference>;
  fn started(&self) -> &Option<DateTime<FixedOffset>>;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn modality(&self) -> &Vector<Box<dyn Coding>>;
  fn referrer(&self) -> &Option<Box<dyn Reference>>;
  fn endpoint(&self) -> &Vector<Box<dyn Reference>>;
  fn location(&self) -> &Option<Box<dyn Reference>>;
  fn encounter(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn interpreter(&self) -> &Vector<Box<dyn Reference>>;
  fn description(&self) -> &Option<String>;
  fn procedureCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn numberOfSeries(&self) -> &Option<u32>;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn numberOfInstances(&self) -> &Option<u32>;
  fn procedureReference(&self) -> &Option<Box<dyn Reference>>;
  fn series(&self) -> &Vector<Box<ImagingStudy_Series>>;
}

dyn_clone::clone_trait_object!(ImagingStudy);

impl FHIRObject for ImagingStudyRaw {
}

impl Resource for ImagingStudyRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ImagingStudyRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ImagingStudy for ImagingStudyRaw {
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn status(&self) -> &String { &self.status }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn started(&self) -> &Option<DateTime<FixedOffset>> { &self.started }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn modality(&self) -> &Vector<Box<dyn Coding>> { &self.modality }
  fn referrer(&self) -> &Option<Box<dyn Reference>> { &self.referrer }
  fn endpoint(&self) -> &Vector<Box<dyn Reference>> { &self.endpoint }
  fn location(&self) -> &Option<Box<dyn Reference>> { &self.location }
  fn encounter(&self) -> &Option<Box<dyn Reference>> { &self.encounter }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn interpreter(&self) -> &Vector<Box<dyn Reference>> { &self.interpreter }
  fn description(&self) -> &Option<String> { &self.description }
  fn procedureCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.procedureCode }
  fn numberOfSeries(&self) -> &Option<u32> { &self.numberOfSeries }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn numberOfInstances(&self) -> &Option<u32> { &self.numberOfInstances }
  fn procedureReference(&self) -> &Option<Box<dyn Reference>> { &self.procedureReference }
  fn series(&self) -> &Vector<Box<ImagingStudy_Series>> { &self.series }
}

