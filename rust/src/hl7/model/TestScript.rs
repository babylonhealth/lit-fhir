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
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct TestScript_Origin {
  pub(crate) id: Option<String>,
  pub(crate) index: i32,
  pub(crate) profile: Box<dyn Coding>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct TestScript_Fixture {
  pub(crate) id: Option<String>,
  pub(crate) resource: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) autocreate: bool,
  pub(crate) autodelete: bool,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct TestScript_Variable {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) hint: Option<String>,
  pub(crate) path: Option<String>,
  pub(crate) sourceId: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) expression: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) headerField: Option<String>,
  pub(crate) defaultValue: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct TestScript_Destination {
  pub(crate) id: Option<String>,
  pub(crate) index: i32,
  pub(crate) profile: Box<dyn Coding>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct TestScript_Test_Action {
  pub(crate) id: Option<String>,
  pub(crate) assert: Option<Box<TestScript_Setup_Action_Assert>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) operation: Option<Box<TestScript_Setup_Action_Operation>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct TestScript_Test {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) action: Vector<Box<TestScript_Test_Action>>,
}


#[derive(Clone, Debug)]
pub struct TestScript_Teardown_Action {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) operation: Box<TestScript_Setup_Action_Operation>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct TestScript_Teardown {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) action: Vector<Box<TestScript_Teardown_Action>>,
}


#[derive(Clone, Debug)]
pub struct TestScript_Metadata_Link {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct TestScript_Metadata_Capability {
  pub(crate) id: Option<String>,
  pub(crate) link: Vector<String>,
  pub(crate) origin: Vector<i32>,
  pub(crate) required: bool,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) validated: bool,
  pub(crate) description: Option<String>,
  pub(crate) destination: Option<i32>,
  pub(crate) capabilities: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct TestScript_Metadata {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) link: Vector<Box<TestScript_Metadata_Link>>,
  pub(crate) capability: Vector<Box<TestScript_Metadata_Capability>>,
}


#[derive(Clone, Debug)]
pub struct TestScript_Setup_Action_Assert {
  pub(crate) id: Option<String>,
  pub(crate) path: Option<String>,
  pub(crate) label: Option<String>,
  pub(crate) value: Option<String>,
  pub(crate) operator: Option<String>,
  pub(crate) resource: Option<String>,
  pub(crate) response: Option<String>,
  pub(crate) sourceId: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) direction: Option<String>,
  pub(crate) minimumId: Option<String>,
  pub(crate) expression: Option<String>,
  pub(crate) requestURL: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) contentType: Option<String>,
  pub(crate) headerField: Option<String>,
  pub(crate) warningOnly: bool,
  pub(crate) responseCode: Option<String>,
  pub(crate) requestMethod: Option<String>,
  pub(crate) navigationLinks: Option<bool>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) compareToSourceId: Option<String>,
  pub(crate) validateProfileId: Option<String>,
  pub(crate) compareToSourcePath: Option<String>,
  pub(crate) compareToSourceExpression: Option<String>,
}



#[derive(Clone, Debug)]
pub struct TestScript_Setup_Action_Operation_RequestHeader {
  pub(crate) id: Option<String>,
  pub(crate) field: String,
  pub(crate) value: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct TestScript_Setup_Action_Operation {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) _type: Option<Box<dyn Coding>>,
  pub(crate) label: Option<String>,
  pub(crate) accept: Option<String>,
  pub(crate) method: Option<String>,
  pub(crate) origin: Option<i32>,
  pub(crate) params: Option<String>,
  pub(crate) resource: Option<String>,
  pub(crate) sourceId: Option<String>,
  pub(crate) targetId: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) requestId: Option<String>,
  pub(crate) responseId: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) contentType: Option<String>,
  pub(crate) destination: Option<i32>,
  pub(crate) encodeRequestUrl: bool,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) requestHeader: Vector<Box<TestScript_Setup_Action_Operation_RequestHeader>>,
}

#[derive(Clone, Debug)]
pub struct TestScript_Setup_Action {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) assert: Option<Box<TestScript_Setup_Action_Assert>>,
  pub(crate) operation: Option<Box<TestScript_Setup_Action_Operation>>,
}

#[derive(Clone, Debug)]
pub struct TestScript_Setup {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) action: Vector<Box<TestScript_Setup_Action>>,
}

#[derive(Clone, Debug)]
pub struct TestScriptRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: String,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) purpose: Option<String>,
  pub(crate) profile: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) origin: Vector<Box<TestScript_Origin>>,
  pub(crate) fixture: Vector<Box<TestScript_Fixture>>,
  pub(crate) variable: Vector<Box<TestScript_Variable>>,
  pub(crate) destination: Vector<Box<TestScript_Destination>>,
  pub(crate) test: Vector<Box<TestScript_Test>>,
  pub(crate) teardown: Option<Box<TestScript_Teardown>>,
  pub(crate) metadata: Option<Box<TestScript_Metadata>>,
  pub(crate) setup: Option<Box<TestScript_Setup>>,
}

pub trait TestScript : DomainResource {
  fn url(&self) -> &String;
  fn name(&self) -> &String;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn title(&self) -> &Option<String>;
  fn status(&self) -> &String;
  fn version(&self) -> &Option<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> &Option<String>;
  fn profile(&self) -> &Vector<Box<dyn Reference>>;
  fn publisher(&self) -> &Option<String>;
  fn copyright(&self) -> &Option<String>;
  fn identifier(&self) -> &Option<Box<dyn Identifier>>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn description(&self) -> &Option<String>;
  fn experimental(&self) -> &Option<bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn origin(&self) -> &Vector<Box<TestScript_Origin>>;
  fn fixture(&self) -> &Vector<Box<TestScript_Fixture>>;
  fn variable(&self) -> &Vector<Box<TestScript_Variable>>;
  fn destination(&self) -> &Vector<Box<TestScript_Destination>>;
  fn test(&self) -> &Vector<Box<TestScript_Test>>;
  fn teardown(&self) -> &Option<Box<TestScript_Teardown>>;
  fn metadata(&self) -> &Option<Box<TestScript_Metadata>>;
  fn setup(&self) -> &Option<Box<TestScript_Setup>>;
}

dyn_clone::clone_trait_object!(TestScript);

impl FHIRObject for TestScriptRaw {
}

impl Resource for TestScriptRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for TestScriptRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl TestScript for TestScriptRaw {
  fn url(&self) -> &String { &self.url }
  fn name(&self) -> &String { &self.name }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn title(&self) -> &Option<String> { &self.title }
  fn status(&self) -> &String { &self.status }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> &Option<String> { &self.purpose }
  fn profile(&self) -> &Vector<Box<dyn Reference>> { &self.profile }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn copyright(&self) -> &Option<String> { &self.copyright }
  fn identifier(&self) -> &Option<Box<dyn Identifier>> { &self.identifier }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> &Option<String> { &self.description }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn origin(&self) -> &Vector<Box<TestScript_Origin>> { &self.origin }
  fn fixture(&self) -> &Vector<Box<TestScript_Fixture>> { &self.fixture }
  fn variable(&self) -> &Vector<Box<TestScript_Variable>> { &self.variable }
  fn destination(&self) -> &Vector<Box<TestScript_Destination>> { &self.destination }
  fn test(&self) -> &Vector<Box<TestScript_Test>> { &self.test }
  fn teardown(&self) -> &Option<Box<TestScript_Teardown>> { &self.teardown }
  fn metadata(&self) -> &Option<Box<TestScript_Metadata>> { &self.metadata }
  fn setup(&self) -> &Option<Box<TestScript_Setup>> { &self.setup }
}

