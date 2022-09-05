use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct List_Entry {
  pub(crate) id: Option<String>,
  pub(crate) flag: Option<Box<dyn CodeableConcept>>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) item: Box<dyn Reference>,
  pub(crate) deleted: Option<bool>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ListRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) mode: String,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) source: Option<Box<dyn Reference>>,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) orderedBy: Option<Box<dyn CodeableConcept>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) emptyReason: Option<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) entry: Vector<List_Entry>,
}

pub trait List : DomainResource {
  fn mode(&self) -> &String;
  fn code(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn title(&self) -> &Option<String>;
  fn status(&self) -> &String;
  fn source(&self) -> &Option<Box<dyn Reference>>;
  fn subject(&self) -> &Option<Box<dyn Reference>>;
  fn encounter(&self) -> &Option<Box<dyn Reference>>;
  fn orderedBy(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn emptyReason(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn entry(&self) -> &Vector<List_Entry>;
}

dyn_clone::clone_trait_object!(List);

impl FHIRObject for ListRaw {
}

impl Resource for ListRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ListRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl List for ListRaw {
  fn mode(&self) -> &String { &self.mode }
  fn code(&self) -> &Option<Box<dyn CodeableConcept>> { &self.code }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn title(&self) -> &Option<String> { &self.title }
  fn status(&self) -> &String { &self.status }
  fn source(&self) -> &Option<Box<dyn Reference>> { &self.source }
  fn subject(&self) -> &Option<Box<dyn Reference>> { &self.subject }
  fn encounter(&self) -> &Option<Box<dyn Reference>> { &self.encounter }
  fn orderedBy(&self) -> &Option<Box<dyn CodeableConcept>> { &self.orderedBy }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn emptyReason(&self) -> &Option<Box<dyn CodeableConcept>> { &self.emptyReason }
  fn entry(&self) -> &Vector<List_Entry> { &self.entry }
}

