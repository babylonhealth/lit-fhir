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
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct GraphDefinition_Link_Target_Compartment {
  pub(crate) id: Option<String>,
  pub(crate) _use: String,
  pub(crate) code: String,
  pub(crate) rule: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) expression: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct GraphDefinition_Link_Target {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) link: Vector<Box<GraphDefinition_Link>>,
  pub(crate) params: Option<String>,
  pub(crate) profile: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) compartment: Vector<Box<GraphDefinition_Link_Target_Compartment>>,
}

#[derive(Clone, Debug)]
pub struct GraphDefinition_Link {
  pub(crate) id: Option<String>,
  pub(crate) min: Option<i32>,
  pub(crate) max: Option<String>,
  pub(crate) path: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) sliceName: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) target: Vector<Box<GraphDefinition_Link_Target>>,
}

#[derive(Clone, Debug)]
pub struct GraphDefinitionRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: String,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) start: String,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) purpose: Option<String>,
  pub(crate) profile: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) link: Vector<Box<GraphDefinition_Link>>,
}

pub trait GraphDefinition : DomainResource {
  fn url(&self) -> Option<&String>;
  fn name(&self) -> &String;
  fn date(&self) -> Option<&DateTime<FixedOffset>>;
  fn start(&self) -> &String;
  fn status(&self) -> &String;
  fn version(&self) -> Option<&String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> Option<&String>;
  fn profile(&self) -> Option<&String>;
  fn publisher(&self) -> Option<&String>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn description(&self) -> Option<&String>;
  fn experimental(&self) -> Option<&bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn link(&self) -> &Vector<Box<GraphDefinition_Link>>;
}

dyn_clone::clone_trait_object!(GraphDefinition);

impl FHIRObject for GraphDefinitionRaw {
}

impl Resource for GraphDefinitionRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for GraphDefinitionRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl GraphDefinition for GraphDefinitionRaw {
  fn url(&self) -> Option<&String> { self.url.as_ref() }
  fn name(&self) -> &String { &self.name }
  fn date(&self) -> Option<&DateTime<FixedOffset>> { self.date.as_ref() }
  fn start(&self) -> &String { &self.start }
  fn status(&self) -> &String { &self.status }
  fn version(&self) -> Option<&String> { self.version.as_ref() }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> Option<&String> { self.purpose.as_ref() }
  fn profile(&self) -> Option<&String> { self.profile.as_ref() }
  fn publisher(&self) -> Option<&String> { self.publisher.as_ref() }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> Option<&String> { self.description.as_ref() }
  fn experimental(&self) -> Option<&bool> { self.experimental.as_ref() }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn link(&self) -> &Vector<Box<GraphDefinition_Link>> { &self.link }
}

