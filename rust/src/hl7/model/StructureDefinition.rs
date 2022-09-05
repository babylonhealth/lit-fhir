use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

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
use crate::hl7::model::ElementDefinition::ElementDefinition;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct StructureDefinition_Mapping {
  pub(crate) id: Option<String>,
  pub(crate) uri: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) comment: Option<String>,
  pub(crate) identity: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct StructureDefinition_Context {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) expression: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct StructureDefinition_Snapshot {
  pub(crate) id: Option<String>,
  pub(crate) element: Vector<Box<dyn ElementDefinition>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct StructureDefinition_Differential {
  pub(crate) id: Option<String>,
  pub(crate) element: Vector<Box<dyn ElementDefinition>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct StructureDefinitionRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: String,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) kind: String,
  pub(crate) _type: String,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) purpose: Option<String>,
  pub(crate) keyword: Vector<Box<dyn Coding>>,
  pub(crate) language: Option<String>,
  pub(crate) _abstract: bool,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) derivation: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) fhirVersion: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) baseDefinition: Option<String>,
  pub(crate) contextInvariant: Vector<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) mapping: Vector<StructureDefinition_Mapping>,
  pub(crate) context: Vector<StructureDefinition_Context>,
  pub(crate) snapshot: Option<StructureDefinition_Snapshot>,
  pub(crate) differential: Option<StructureDefinition_Differential>,
}

pub trait StructureDefinition : DomainResource {
  fn url(&self) -> &String;
  fn name(&self) -> &String;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn kind(&self) -> &String;
  fn _type(&self) -> &String;
  fn title(&self) -> &Option<String>;
  fn status(&self) -> &String;
  fn version(&self) -> &Option<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> &Option<String>;
  fn keyword(&self) -> &Vector<Box<dyn Coding>>;
  fn _abstract(&self) -> &bool;
  fn publisher(&self) -> &Option<String>;
  fn copyright(&self) -> &Option<String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn derivation(&self) -> &Option<String>;
  fn description(&self) -> &Option<String>;
  fn fhirVersion(&self) -> &Option<String>;
  fn experimental(&self) -> &Option<bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn baseDefinition(&self) -> &Option<String>;
  fn contextInvariant(&self) -> &Vector<String>;
  fn mapping(&self) -> &Vector<StructureDefinition_Mapping>;
  fn context(&self) -> &Vector<StructureDefinition_Context>;
  fn snapshot(&self) -> &Option<StructureDefinition_Snapshot>;
  fn differential(&self) -> &Option<StructureDefinition_Differential>;
}

dyn_clone::clone_trait_object!(StructureDefinition);

impl FHIRObject for StructureDefinitionRaw {
}

impl Resource for StructureDefinitionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for StructureDefinitionRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl StructureDefinition for StructureDefinitionRaw {
  fn url(&self) -> &String { &self.url }
  fn name(&self) -> &String { &self.name }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn kind(&self) -> &String { &self.kind }
  fn _type(&self) -> &String { &self._type }
  fn title(&self) -> &Option<String> { &self.title }
  fn status(&self) -> &String { &self.status }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> &Option<String> { &self.purpose }
  fn keyword(&self) -> &Vector<Box<dyn Coding>> { &self.keyword }
  fn _abstract(&self) -> &bool { &self._abstract }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn copyright(&self) -> &Option<String> { &self.copyright }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn derivation(&self) -> &Option<String> { &self.derivation }
  fn description(&self) -> &Option<String> { &self.description }
  fn fhirVersion(&self) -> &Option<String> { &self.fhirVersion }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn baseDefinition(&self) -> &Option<String> { &self.baseDefinition }
  fn contextInvariant(&self) -> &Vector<String> { &self.contextInvariant }
  fn mapping(&self) -> &Vector<StructureDefinition_Mapping> { &self.mapping }
  fn context(&self) -> &Vector<StructureDefinition_Context> { &self.context }
  fn snapshot(&self) -> &Option<StructureDefinition_Snapshot> { &self.snapshot }
  fn differential(&self) -> &Option<StructureDefinition_Differential> { &self.differential }
}

