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
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct ExampleScenario_Actor {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) name: Option<String>,
  pub(crate) actorId: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ExampleScenario_Process_Step_Operation {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) number: String,
  pub(crate) request: Option<Box<dyn ExampleScenario_Instance_ContainedInstance>>,
  pub(crate) receiver: Option<String>,
  pub(crate) response: Option<Box<dyn ExampleScenario_Instance_ContainedInstance>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) initiator: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) receiverActive: Option<bool>,
  pub(crate) initiatorActive: Option<bool>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct ExampleScenario_Process_Step_Alternative {
  pub(crate) id: Option<String>,
  pub(crate) step: Vector<Box<dyn ExampleScenario_Process_Step>>,
  pub(crate) title: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ExampleScenario_Process_Step {
  pub(crate) id: Option<String>,
  pub(crate) pause: Option<bool>,
  pub(crate) process: Vector<Box<dyn ExampleScenario_Process>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) operation: Option<ExampleScenario_Process_Step_Operation>,
  pub(crate) alternative: Vector<ExampleScenario_Process_Step_Alternative>,
}

#[derive(Clone, Debug)]
pub struct ExampleScenario_Process {
  pub(crate) id: Option<String>,
  pub(crate) title: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) preConditions: Option<String>,
  pub(crate) postConditions: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) step: Vector<ExampleScenario_Process_Step>,
}


#[derive(Clone, Debug)]
pub struct ExampleScenario_Instance_Version {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) versionId: String,
  pub(crate) description: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct ExampleScenario_Instance_ContainedInstance {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) versionId: Option<String>,
  pub(crate) resourceId: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ExampleScenario_Instance {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) resourceId: String,
  pub(crate) description: Option<String>,
  pub(crate) resourceType: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) version: Vector<ExampleScenario_Instance_Version>,
  pub(crate) containedInstance: Vector<ExampleScenario_Instance_ContainedInstance>,
}

#[derive(Clone, Debug)]
pub struct ExampleScenarioRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) purpose: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) workflow: Vector<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) actor: Vector<ExampleScenario_Actor>,
  pub(crate) process: Vector<ExampleScenario_Process>,
  pub(crate) instance: Vector<ExampleScenario_Instance>,
}

pub trait ExampleScenario : DomainResource {
  fn url(&self) -> &Option<String>;
  fn name(&self) -> &Option<String>;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn status(&self) -> &String;
  fn version(&self) -> &Option<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> &Option<String>;
  fn workflow(&self) -> &Vector<String>;
  fn publisher(&self) -> &Option<String>;
  fn copyright(&self) -> &Option<String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn experimental(&self) -> &Option<bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn actor(&self) -> &Vector<ExampleScenario_Actor>;
  fn process(&self) -> &Vector<ExampleScenario_Process>;
  fn instance(&self) -> &Vector<ExampleScenario_Instance>;
}

dyn_clone::clone_trait_object!(ExampleScenario);

impl FHIRObject for ExampleScenarioRaw {
}

impl Resource for ExampleScenarioRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ExampleScenarioRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ExampleScenario for ExampleScenarioRaw {
  fn url(&self) -> &Option<String> { &self.url }
  fn name(&self) -> &Option<String> { &self.name }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn status(&self) -> &String { &self.status }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> &Option<String> { &self.purpose }
  fn workflow(&self) -> &Vector<String> { &self.workflow }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn copyright(&self) -> &Option<String> { &self.copyright }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn actor(&self) -> &Vector<ExampleScenario_Actor> { &self.actor }
  fn process(&self) -> &Vector<ExampleScenario_Process> { &self.process }
  fn instance(&self) -> &Vector<ExampleScenario_Instance> { &self.instance }
}

