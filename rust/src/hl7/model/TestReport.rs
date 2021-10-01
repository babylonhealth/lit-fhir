use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct TestReport_Participant {
  pub(crate) id?: String,
  pub(crate) uri: String,
  pub(crate) _type: String,
  pub(crate) display?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct TestReport_Test_Action {
  pub(crate) id?: String,
  pub(crate) assert?: TestReport_Setup_Action_Assert,
  pub(crate) extension?: Extension,
  pub(crate) operation?: TestReport_Setup_Action_Operation,
  pub(crate) modifierExtension?: Extension,
}

pub struct TestReport_Test {
  pub(crate) id?: String,
  pub(crate) name?: String,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) action: TestReport_Test_Action,
}


pub struct TestReport_Teardown_Action {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) operation: TestReport_Setup_Action_Operation,
  pub(crate) modifierExtension?: Extension,
}

pub struct TestReport_Teardown {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) action: TestReport_Teardown_Action,
}


pub struct TestReport_Setup_Action_Assert {
  pub(crate) id?: String,
  pub(crate) result: String,
  pub(crate) detail?: String,
  pub(crate) message?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct TestReport_Setup_Action_Operation {
  pub(crate) id?: String,
  pub(crate) result: String,
  pub(crate) detail?: String,
  pub(crate) message?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct TestReport_Setup_Action {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) assert?: TestReport_Setup_Action_Assert,
  pub(crate) operation?: TestReport_Setup_Action_Operation,
}

pub struct TestReport_Setup {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) action: TestReport_Setup_Action,
}

pub struct TestReport {
  pub(crate) name?: String,
  pub(crate) score?: BigDecimal,
  pub(crate) status: String,
  pub(crate) result: String,
  pub(crate) tester?: String,
  pub(crate) issued?: Date,
  pub(crate) identifier?: Identifier,
  pub(crate) testScript: Reference,
  pub(crate) participant?: TestReport_Participant,
  pub(crate) test?: TestReport_Test,
  pub(crate) teardown?: TestReport_Teardown,
  pub(crate) setup?: TestReport_Setup,
}