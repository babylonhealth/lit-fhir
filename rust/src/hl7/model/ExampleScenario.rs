use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct ExampleScenario_Actor {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) name: Option<String>,
  pub(crate) actorId: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ExampleScenario_Process_Step_Operation {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) number: String,
  pub(crate) request: Option<ExampleScenario_Instance_ContainedInstance>,
  pub(crate) receiver: Option<String>,
  pub(crate) response: Option<ExampleScenario_Instance_ContainedInstance>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) initiator: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) receiverActive: Option<bool>,
  pub(crate) initiatorActive: Option<bool>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct ExampleScenario_Process_Step_Alternative {
  pub(crate) id: Option<String>,
  pub(crate) step: Vector<ExampleScenario_Process_Step>,
  pub(crate) title: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ExampleScenario_Process_Step {
  pub(crate) id: Option<String>,
  pub(crate) pause: Option<bool>,
  pub(crate) process: Vector<ExampleScenario_Process>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) operation: Option<ExampleScenario_Process_Step_Operation>,
  pub(crate) alternative: Vector<ExampleScenario_Process_Step_Alternative>,
}

#[derive(Clone, Debug)]
pub struct ExampleScenario_Process {
  pub(crate) id: Option<String>,
  pub(crate) title: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) preConditions: Option<String>,
  pub(crate) postConditions: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) step: Vector<ExampleScenario_Process_Step>,
}


#[derive(Clone, Debug)]
pub struct ExampleScenario_Instance_Version {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) versionId: String,
  pub(crate) description: String,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct ExampleScenario_Instance_ContainedInstance {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) versionId: Option<String>,
  pub(crate) resourceId: String,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ExampleScenario_Instance {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) resourceId: String,
  pub(crate) description: Option<String>,
  pub(crate) resourceType: String,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) version: Vector<ExampleScenario_Instance_Version>,
  pub(crate) containedInstance: Vector<ExampleScenario_Instance_ContainedInstance>,
}

#[derive(Clone, Debug)]
pub struct ExampleScenario {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) workflow: Vector<String>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) actor: Vector<ExampleScenario_Actor>,
  pub(crate) process: Vector<ExampleScenario_Process>,
  pub(crate) instance: Vector<ExampleScenario_Instance>,
}