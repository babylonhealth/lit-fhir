use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::CodeSystem::CodeSystem;
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
  pub(crate) filter: Vector<shareablecodesystem_Filter>,
  pub(crate) property: Vector<shareablecodesystem_Property>,
  pub(crate) concept: Vector<shareablecodesystem_Concept>,
}

pub trait shareablecodesystem : CodeSystem {
  
}

dyn_clone::clone_trait_object!(shareablecodesystem);

impl FHIRObject for shareablecodesystemRaw {
}

impl Resource for shareablecodesystemRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for shareablecodesystemRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl CodeSystem for shareablecodesystemRaw {
  fn url(&self) -> &Option<String> { &self.url }
  fn name(&self) -> &Option<String> { &self.name }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn title(&self) -> &Option<String> { &self.title }
  fn count(&self) -> &Option<u32> { &self.count }
  fn status(&self) -> &String { &self.status }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> &Option<String> { &self.purpose }
  fn content(&self) -> &String { &self.content }
  fn valueSet(&self) -> &Option<String> { &self.valueSet }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn copyright(&self) -> &Option<String> { &self.copyright }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> &Option<String> { &self.description }
  fn supplements(&self) -> &Option<String> { &self.supplements }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn caseSensitive(&self) -> &Option<bool> { &self.caseSensitive }
  fn compositional(&self) -> &Option<bool> { &self.compositional }
  fn versionNeeded(&self) -> &Option<bool> { &self.versionNeeded }
  fn hierarchyMeaning(&self) -> &Option<String> { &self.hierarchyMeaning }
  fn filter(&self) -> &Vector<CodeSystem_Filter> { &self.filter }
  fn property(&self) -> &Vector<CodeSystem_Property> { &self.property }
  fn concept(&self) -> &Vector<CodeSystem_Concept> { &self.concept }
}


impl shareablecodesystem for shareablecodesystemRaw {
  
}

