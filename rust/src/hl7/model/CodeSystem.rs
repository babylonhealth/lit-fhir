use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::Union_0059314669;



#[derive(Clone, Debug)]
pub struct CodeSystem_Filter {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) value: String,
  pub(crate) operator: Vector<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct CodeSystem_Property {
  pub(crate) id: Option<String>,
  pub(crate) uri: Option<String>,
  pub(crate) code: String,
  pub(crate) _type: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct CodeSystem_Concept_Property {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) value: Box<Union_0059314669>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct CodeSystem_Concept_Designation {
  pub(crate) id: Option<String>,
  pub(crate) _use: Option<Box<dyn Coding>>,
  pub(crate) value: String,
  pub(crate) language: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct CodeSystem_Concept {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) display: Option<String>,
  pub(crate) concept: Vector<Box<CodeSystem_Concept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) definition: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) property: Vector<Box<CodeSystem_Concept_Property>>,
  pub(crate) designation: Vector<Box<CodeSystem_Concept_Designation>>,
}

#[derive(Clone, Debug)]
pub struct CodeSystemRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) title: Option<String>,
  pub(crate) count: Option<u32>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) purpose: Option<String>,
  pub(crate) content: String,
  pub(crate) language: Option<String>,
  pub(crate) valueSet: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) description: Option<String>,
  pub(crate) supplements: Option<String>,
  pub(crate) experimental: Option<bool>,
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

pub trait CodeSystem : DomainResource {
  fn url(&self) -> Option<&String>;
  fn name(&self) -> Option<&String>;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn title(&self) -> &Option<String>;
  fn count(&self) -> &Option<u32>;
  fn status(&self) -> &String;
  fn version(&self) -> Option<&String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> &Option<String>;
  fn content(&self) -> &String;
  fn valueSet(&self) -> &Option<String>;
  fn publisher(&self) -> Option<&String>;
  fn copyright(&self) -> &Option<String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn description(&self) -> Option<&String>;
  fn supplements(&self) -> &Option<String>;
  fn experimental(&self) -> Option<&bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn caseSensitive(&self) -> &Option<bool>;
  fn compositional(&self) -> &Option<bool>;
  fn versionNeeded(&self) -> &Option<bool>;
  fn hierarchyMeaning(&self) -> &Option<String>;
  fn filter(&self) -> &Vector<Box<CodeSystem_Filter>>;
  fn property(&self) -> &Vector<Box<CodeSystem_Property>>;
  fn concept(&self) -> &Vector<Box<CodeSystem_Concept>>;
}

dyn_clone::clone_trait_object!(CodeSystem);

impl FHIRObject for CodeSystemRaw {
}

impl Resource for CodeSystemRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for CodeSystemRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl CodeSystem for CodeSystemRaw {
  fn url(&self) -> Option<&String> { self.url.as_ref() }
  fn name(&self) -> Option<&String> { self.name.as_ref() }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn title(&self) -> &Option<String> { &self.title }
  fn count(&self) -> &Option<u32> { &self.count }
  fn status(&self) -> &String { &self.status }
  fn version(&self) -> Option<&String> { self.version.as_ref() }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> &Option<String> { &self.purpose }
  fn content(&self) -> &String { &self.content }
  fn valueSet(&self) -> &Option<String> { &self.valueSet }
  fn publisher(&self) -> Option<&String> { self.publisher.as_ref() }
  fn copyright(&self) -> &Option<String> { &self.copyright }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> Option<&String> { self.description.as_ref() }
  fn supplements(&self) -> &Option<String> { &self.supplements }
  fn experimental(&self) -> Option<&bool> { self.experimental.as_ref() }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn caseSensitive(&self) -> &Option<bool> { &self.caseSensitive }
  fn compositional(&self) -> &Option<bool> { &self.compositional }
  fn versionNeeded(&self) -> &Option<bool> { &self.versionNeeded }
  fn hierarchyMeaning(&self) -> &Option<String> { &self.hierarchyMeaning }
  fn filter(&self) -> &Vector<Box<CodeSystem_Filter>> { &self.filter }
  fn property(&self) -> &Vector<Box<CodeSystem_Property>> { &self.property }
  fn concept(&self) -> &Vector<Box<CodeSystem_Concept>> { &self.concept }
}

