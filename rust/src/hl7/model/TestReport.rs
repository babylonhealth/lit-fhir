use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Reference::Reference;
use crate::core::model::TestReport_Setup_Action_Assert::TestReport_Setup_Action_Assert;
use crate::core::model::TestReport_Setup_Action_Operation::TestReport_Setup_Action_Operation;



#[derive(Clone, Debug)]
pub struct TestReport_Participant {
  pub(crate) id: Option<String>,
  pub(crate) uri: String,
  pub(crate) _type: String,
  pub(crate) display: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct TestReport_Test_Action {
  pub(crate) id: Option<String>,
  pub(crate) assert: Option<TestReport_Setup_Action_Assert>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) operation: Option<TestReport_Setup_Action_Operation>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct TestReport_Test {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) action: Vector<TestReport_Test_Action>,
}


#[derive(Clone, Debug)]
pub struct TestReport_Teardown_Action {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) operation: TestReport_Setup_Action_Operation,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct TestReport_Teardown {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) action: Vector<TestReport_Teardown_Action>,
}


#[derive(Clone, Debug)]
pub struct TestReport_Setup_Action_Assert {
  pub(crate) id: Option<String>,
  pub(crate) result: String,
  pub(crate) detail: Option<String>,
  pub(crate) message: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct TestReport_Setup_Action_Operation {
  pub(crate) id: Option<String>,
  pub(crate) result: String,
  pub(crate) detail: Option<String>,
  pub(crate) message: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct TestReport_Setup_Action {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) assert: Option<TestReport_Setup_Action_Assert>,
  pub(crate) operation: Option<TestReport_Setup_Action_Operation>,
}

#[derive(Clone, Debug)]
pub struct TestReport_Setup {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) action: Vector<TestReport_Setup_Action>,
}

#[derive(Clone, Debug)]
pub struct TestReport {
  pub(crate) name: Option<String>,
  pub(crate) score: Option<BigDecimal>,
  pub(crate) status: String,
  pub(crate) result: String,
  pub(crate) tester: Option<String>,
  pub(crate) issued: Option<DateTime<FixedOffset>>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) testScript: Reference,
  pub(crate) participant: Vector<TestReport_Participant>,
  pub(crate) test: Vector<TestReport_Test>,
  pub(crate) teardown: Option<TestReport_Teardown>,
  pub(crate) setup: Option<TestReport_Setup>,
}