use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ExampleScenario_Actor {
  pub(crate) id?: String,
  pub(crate) _type: String,
  pub(crate) name?: String,
  pub(crate) actorId: String,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct ExampleScenario_Process_Step_Operation {
  pub(crate) id?: String,
  pub(crate) _type?: String,
  pub(crate) name?: String,
  pub(crate) number: String,
  pub(crate) request?: ExampleScenario_Instance_ContainedInstance,
  pub(crate) receiver?: String,
  pub(crate) response?: ExampleScenario_Instance_ContainedInstance,
  pub(crate) extension?: Extension,
  pub(crate) initiator?: String,
  pub(crate) description?: String,
  pub(crate) receiverActive?: Boolean,
  pub(crate) initiatorActive?: Boolean,
  pub(crate) modifierExtension?: Extension,
}



pub struct ExampleScenario_Process_Step_Alternative {
  pub(crate) id?: String,
  pub(crate) step?: ExampleScenario_Process_Step,
  pub(crate) title: String,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct ExampleScenario_Process_Step {
  pub(crate) id?: String,
  pub(crate) pause?: Boolean,
  pub(crate) process?: ExampleScenario_Process,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) operation?: ExampleScenario_Process_Step_Operation,
  pub(crate) alternative?: ExampleScenario_Process_Step_Alternative,
}

pub struct ExampleScenario_Process {
  pub(crate) id?: String,
  pub(crate) title: String,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) preConditions?: String,
  pub(crate) postConditions?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) step?: ExampleScenario_Process_Step,
}


pub struct ExampleScenario_Instance_Version {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) versionId: String,
  pub(crate) description: String,
  pub(crate) modifierExtension?: Extension,
}



pub struct ExampleScenario_Instance_ContainedInstance {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) versionId?: String,
  pub(crate) resourceId: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct ExampleScenario_Instance {
  pub(crate) id?: String,
  pub(crate) name?: String,
  pub(crate) extension?: Extension,
  pub(crate) resourceId: String,
  pub(crate) description?: String,
  pub(crate) resourceType: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) version?: ExampleScenario_Instance_Version,
  pub(crate) containedInstance?: ExampleScenario_Instance_ContainedInstance,
}

pub struct ExampleScenario {
  pub(crate) url?: String,
  pub(crate) name?: String,
  pub(crate) date?: Date,
  pub(crate) status: String,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) workflow?: String,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) useContext?: UsageContext,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) actor?: ExampleScenario_Actor,
  pub(crate) process?: ExampleScenario_Process,
  pub(crate) instance?: ExampleScenario_Instance,
}