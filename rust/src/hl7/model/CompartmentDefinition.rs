use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct CompartmentDefinition_Resource {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) param: Vector<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct CompartmentDefinitionRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: String,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) code: String,
  pub(crate) status: String,
  pub(crate) search: bool,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) purpose: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) resource: Vector<Box<CompartmentDefinition_Resource>>,
}

pub trait CompartmentDefinition : DomainResource {
  fn url(&self) -> &String;
  fn name(&self) -> &String;
  fn date(&self) -> Option<&DateTime<FixedOffset>>;
  fn code(&self) -> &String;
  fn status(&self) -> &String;
  fn search(&self) -> &bool;
  fn version(&self) -> Option<&String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> Option<&String>;
  fn publisher(&self) -> Option<&String>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn description(&self) -> Option<&String>;
  fn experimental(&self) -> Option<&bool>;
  fn resource(&self) -> &Vector<Box<CompartmentDefinition_Resource>>;
}

dyn_clone::clone_trait_object!(CompartmentDefinition);

impl FHIRObject for CompartmentDefinitionRaw {
}

impl Resource for CompartmentDefinitionRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for CompartmentDefinitionRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl CompartmentDefinition for CompartmentDefinitionRaw {
  fn url(&self) -> &String { &self.url }
  fn name(&self) -> &String { &self.name }
  fn date(&self) -> Option<&DateTime<FixedOffset>> { self.date.as_ref() }
  fn code(&self) -> &String { &self.code }
  fn status(&self) -> &String { &self.status }
  fn search(&self) -> &bool { &self.search }
  fn version(&self) -> Option<&String> { self.version.as_ref() }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> Option<&String> { self.purpose.as_ref() }
  fn publisher(&self) -> Option<&String> { self.publisher.as_ref() }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> Option<&String> { self.description.as_ref() }
  fn experimental(&self) -> Option<&bool> { self.experimental.as_ref() }
  fn resource(&self) -> &Vector<Box<CompartmentDefinition_Resource>> { &self.resource }
}

