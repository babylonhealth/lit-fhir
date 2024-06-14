use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::CodeSystem::{CodeSystem, CodeSystem_Concept, CodeSystem_Filter, CodeSystem_Property};
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;


#[derive(Clone, Debug)]
pub struct shareablecodesystemRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: String,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) title: Option<String>,
  pub(crate) count: Option<u32>,
  pub(crate) status: String,
  pub(crate) version: String,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) purpose: Option<String>,
  pub(crate) content: String,
  pub(crate) language: Option<String>,
  pub(crate) valueSet: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: String,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) description: String,
  pub(crate) supplements: Option<String>,
  pub(crate) experimental: bool,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) caseSensitive: Option<bool>,
  pub(crate) compositional: Option<bool>,
  pub(crate) versionNeeded: Option<bool>,
  pub(crate) hierarchyMeaning: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) filter: Vector<Box<CodeSystem_Filter>>,
  pub(crate) property: Vector<Box<CodeSystem_Property>>,
  pub(crate) concept: Vector<Box<CodeSystem_Concept>>,
}

pub trait shareablecodesystem: CodeSystem {}

dyn_clone::clone_trait_object!(shareablecodesystem);

impl FHIRObject for shareablecodesystemRaw {}

impl Resource for shareablecodesystemRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for shareablecodesystemRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl CodeSystem for shareablecodesystemRaw {
  fn url(&self) -> Option<&String> { Some(&self.url) }
  fn name(&self) -> Option<&String> { Some(&self.name) }
  fn date(&self) -> Option<&DateTime<FixedOffset>> { self.date.as_ref() }
  fn title(&self) -> Option<&String> { self.title.as_ref() }
  fn count(&self) -> Option<&u32> { self.count.as_ref() }
  fn status(&self) -> &String { &self.status }
  fn version(&self) -> Option<&String> { Some(&self.version) }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> Option<&String> { self.purpose.as_ref() }
  fn content(&self) -> &String { &self.content }
  fn valueSet(&self) -> Option<&String> { self.valueSet.as_ref() }
  fn publisher(&self) -> Option<&String> { Some(&self.publisher) }
  fn copyright(&self) -> Option<&String> { self.copyright.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> Option<&String> { Some(&self.description) }
  fn supplements(&self) -> Option<&String> { self.supplements.as_ref() }
  fn experimental(&self) -> Option<&bool> { Some(&self.experimental) }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn caseSensitive(&self) -> Option<&bool> { self.caseSensitive.as_ref() }
  fn compositional(&self) -> Option<&bool> { self.compositional.as_ref() }
  fn versionNeeded(&self) -> Option<&bool> { self.versionNeeded.as_ref() }
  fn hierarchyMeaning(&self) -> Option<&String> { self.hierarchyMeaning.as_ref() }
  fn filter(&self) -> &Vector<Box<CodeSystem_Filter>> { &self.filter }
  fn property(&self) -> &Vector<Box<CodeSystem_Property>> { &self.property }
  fn concept(&self) -> &Vector<Box<CodeSystem_Concept>> { &self.concept }
}


impl shareablecodesystem for shareablecodesystemRaw {}

