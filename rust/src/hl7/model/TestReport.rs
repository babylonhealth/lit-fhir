use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct TestReport_Participant {
  pub(crate) id: Option<String>,
  pub(crate) uri: String,
  pub(crate) _type: String,
  pub(crate) display: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct TestReport_Test_Action {
  pub(crate) id: Option<String>,
  pub(crate) assert: Option<Box<TestReport_Setup_Action_Assert>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) operation: Option<Box<TestReport_Setup_Action_Operation>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct TestReport_Test {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) action: Vector<Box<TestReport_Test_Action>>,
}


#[derive(Clone, Debug)]
pub struct TestReport_Teardown_Action {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) operation: Box<TestReport_Setup_Action_Operation>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct TestReport_Teardown {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) action: Vector<Box<TestReport_Teardown_Action>>,
}


#[derive(Clone, Debug)]
pub struct TestReport_Setup_Action_Assert {
  pub(crate) id: Option<String>,
  pub(crate) result: String,
  pub(crate) detail: Option<String>,
  pub(crate) message: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct TestReport_Setup_Action_Operation {
  pub(crate) id: Option<String>,
  pub(crate) result: String,
  pub(crate) detail: Option<String>,
  pub(crate) message: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct TestReport_Setup_Action {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) assert: Option<Box<TestReport_Setup_Action_Assert>>,
  pub(crate) operation: Option<Box<TestReport_Setup_Action_Operation>>,
}

#[derive(Clone, Debug)]
pub struct TestReport_Setup {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) action: Vector<Box<TestReport_Setup_Action>>,
}

#[derive(Clone, Debug)]
pub struct TestReportRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Option<String>,
  pub(crate) score: Option<BigDecimal>,
  pub(crate) status: String,
  pub(crate) result: String,
  pub(crate) tester: Option<String>,
  pub(crate) issued: Option<DateTime<FixedOffset>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) testScript: Box<dyn Reference>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) participant: Vector<Box<TestReport_Participant>>,
  pub(crate) test: Vector<Box<TestReport_Test>>,
  pub(crate) teardown: Option<Box<TestReport_Teardown>>,
  pub(crate) setup: Option<Box<TestReport_Setup>>,
}

pub trait TestReport : DomainResource {
  fn name(&self) -> &Option<String>;
  fn score(&self) -> &Option<BigDecimal>;
  fn status(&self) -> &String;
  fn result(&self) -> &String;
  fn tester(&self) -> &Option<String>;
  fn issued(&self) -> &Option<DateTime<FixedOffset>>;
  fn identifier(&self) -> &Option<Box<dyn Identifier>>;
  fn testScript(&self) -> &Box<dyn Reference>;
  fn participant(&self) -> &Vector<Box<TestReport_Participant>>;
  fn test(&self) -> &Vector<Box<TestReport_Test>>;
  fn teardown(&self) -> &Option<Box<TestReport_Teardown>>;
  fn setup(&self) -> &Option<Box<TestReport_Setup>>;
}

dyn_clone::clone_trait_object!(TestReport);

impl FHIRObject for TestReportRaw {
}

impl Resource for TestReportRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for TestReportRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl TestReport for TestReportRaw {
  fn name(&self) -> &Option<String> { &self.name }
  fn score(&self) -> &Option<BigDecimal> { &self.score }
  fn status(&self) -> &String { &self.status }
  fn result(&self) -> &String { &self.result }
  fn tester(&self) -> &Option<String> { &self.tester }
  fn issued(&self) -> &Option<DateTime<FixedOffset>> { &self.issued }
  fn identifier(&self) -> &Option<Box<dyn Identifier>> { &self.identifier }
  fn testScript(&self) -> &Box<dyn Reference> { &self.testScript }
  fn participant(&self) -> &Vector<Box<TestReport_Participant>> { &self.participant }
  fn test(&self) -> &Vector<Box<TestReport_Test>> { &self.test }
  fn teardown(&self) -> &Option<Box<TestReport_Teardown>> { &self.teardown }
  fn setup(&self) -> &Option<Box<TestReport_Setup>> { &self.setup }
}

