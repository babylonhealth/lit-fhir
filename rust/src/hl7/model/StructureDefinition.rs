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
  pub(crate) mapping: Vector<Box<StructureDefinition_Mapping>>,
  pub(crate) context: Vector<Box<StructureDefinition_Context>>,
  pub(crate) snapshot: Option<Box<StructureDefinition_Snapshot>>,
  pub(crate) differential: Option<Box<StructureDefinition_Differential>>,
}

pub trait StructureDefinition : DomainResource {
  fn url(&self) -> &String;
  fn name(&self) -> &String;
  fn date(&self) -> Option<&DateTime<FixedOffset>>;
  fn kind(&self) -> &String;
  fn _type(&self) -> &String;
  fn title(&self) -> Option<&String>;
  fn status(&self) -> &String;
  fn version(&self) -> Option<&String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> Option<&String>;
  fn keyword(&self) -> &Vector<Box<dyn Coding>>;
  fn _abstract(&self) -> &bool;
  fn publisher(&self) -> Option<&String>;
  fn copyright(&self) -> Option<&String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn derivation(&self) -> Option<&String>;
  fn description(&self) -> Option<&String>;
  fn fhirVersion(&self) -> Option<&String>;
  fn experimental(&self) -> Option<&bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn baseDefinition(&self) -> Option<&String>;
  fn contextInvariant(&self) -> &Vector<String>;
  fn mapping(&self) -> &Vector<Box<StructureDefinition_Mapping>>;
  fn context(&self) -> &Vector<Box<StructureDefinition_Context>>;
  fn snapshot(&self) -> Option<&Box<StructureDefinition_Snapshot>>;
  fn differential(&self) -> Option<&Box<StructureDefinition_Differential>>;
}

dyn_clone::clone_trait_object!(StructureDefinition);

impl FHIRObject for StructureDefinitionRaw {
}

impl Resource for StructureDefinitionRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for StructureDefinitionRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl StructureDefinition for StructureDefinitionRaw {
  fn url(&self) -> &String { &self.url }
  fn name(&self) -> &String { &self.name }
  fn date(&self) -> Option<&DateTime<FixedOffset>> { self.date.as_ref() }
  fn kind(&self) -> &String { &self.kind }
  fn _type(&self) -> &String { &self._type }
  fn title(&self) -> Option<&String> { self.title.as_ref() }
  fn status(&self) -> &String { &self.status }
  fn version(&self) -> Option<&String> { self.version.as_ref() }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> Option<&String> { self.purpose.as_ref() }
  fn keyword(&self) -> &Vector<Box<dyn Coding>> { &self.keyword }
  fn _abstract(&self) -> &bool { &self._abstract }
  fn publisher(&self) -> Option<&String> { self.publisher.as_ref() }
  fn copyright(&self) -> Option<&String> { self.copyright.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn derivation(&self) -> Option<&String> { self.derivation.as_ref() }
  fn description(&self) -> Option<&String> { self.description.as_ref() }
  fn fhirVersion(&self) -> Option<&String> { self.fhirVersion.as_ref() }
  fn experimental(&self) -> Option<&bool> { self.experimental.as_ref() }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn baseDefinition(&self) -> Option<&String> { self.baseDefinition.as_ref() }
  fn contextInvariant(&self) -> &Vector<String> { &self.contextInvariant }
  fn mapping(&self) -> &Vector<Box<StructureDefinition_Mapping>> { &self.mapping }
  fn context(&self) -> &Vector<Box<StructureDefinition_Context>> { &self.context }
  fn snapshot(&self) -> Option<&Box<StructureDefinition_Snapshot>> { self.snapshot.as_ref() }
  fn differential(&self) -> Option<&Box<StructureDefinition_Differential>> { self.differential.as_ref() }
}

