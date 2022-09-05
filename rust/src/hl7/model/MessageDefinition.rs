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
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionCodingOrUri;



#[derive(Clone, Debug)]
pub struct MessageDefinition_Focus {
  pub(crate) id: Option<String>,
  pub(crate) min: u32,
  pub(crate) max: Option<String>,
  pub(crate) code: String,
  pub(crate) profile: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MessageDefinition_AllowedResponse {
  pub(crate) id: Option<String>,
  pub(crate) message: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) situation: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct MessageDefinitionRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Option<String>,
  pub(crate) date: DateTime<FixedOffset>,
  pub(crate) base: Option<String>,
  pub(crate) title: Option<String>,
  pub(crate) graph: Vector<String>,
  pub(crate) status: String,
  pub(crate) parent: Vector<String>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) purpose: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) replaces: Vector<String>,
  pub(crate) event: UnionCodingOrUri,
  pub(crate) category: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) responseRequired: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) focus: Vector<Box<MessageDefinition_Focus>>,
  pub(crate) allowedResponse: Vector<Box<MessageDefinition_AllowedResponse>>,
}

pub trait MessageDefinition : DomainResource {
  fn url(&self) -> &Option<String>;
  fn name(&self) -> &Option<String>;
  fn date(&self) -> &DateTime<FixedOffset>;
  fn base(&self) -> &Option<String>;
  fn title(&self) -> &Option<String>;
  fn graph(&self) -> &Vector<String>;
  fn status(&self) -> &String;
  fn parent(&self) -> &Vector<String>;
  fn version(&self) -> &Option<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> &Option<String>;
  fn replaces(&self) -> &Vector<String>;
  fn event(&self) -> &UnionCodingOrUri;
  fn category(&self) -> &Option<String>;
  fn publisher(&self) -> &Option<String>;
  fn copyright(&self) -> &Option<String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn description(&self) -> &Option<String>;
  fn experimental(&self) -> &Option<bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn responseRequired(&self) -> &Option<String>;
  fn focus(&self) -> &Vector<Box<MessageDefinition_Focus>>;
  fn allowedResponse(&self) -> &Vector<Box<MessageDefinition_AllowedResponse>>;
}

dyn_clone::clone_trait_object!(MessageDefinition);

impl FHIRObject for MessageDefinitionRaw {
}

impl Resource for MessageDefinitionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for MessageDefinitionRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MessageDefinition for MessageDefinitionRaw {
  fn url(&self) -> &Option<String> { &self.url }
  fn name(&self) -> &Option<String> { &self.name }
  fn date(&self) -> &DateTime<FixedOffset> { &self.date }
  fn base(&self) -> &Option<String> { &self.base }
  fn title(&self) -> &Option<String> { &self.title }
  fn graph(&self) -> &Vector<String> { &self.graph }
  fn status(&self) -> &String { &self.status }
  fn parent(&self) -> &Vector<String> { &self.parent }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> &Option<String> { &self.purpose }
  fn replaces(&self) -> &Vector<String> { &self.replaces }
  fn event(&self) -> &UnionCodingOrUri { &self.event }
  fn category(&self) -> &Option<String> { &self.category }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn copyright(&self) -> &Option<String> { &self.copyright }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> &Option<String> { &self.description }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn responseRequired(&self) -> &Option<String> { &self.responseRequired }
  fn focus(&self) -> &Vector<Box<MessageDefinition_Focus>> { &self.focus }
  fn allowedResponse(&self) -> &Vector<Box<MessageDefinition_AllowedResponse>> { &self.allowedResponse }
}

