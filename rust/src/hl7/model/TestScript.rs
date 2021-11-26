use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::UsageContext::UsageContext;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::TestScript_Setup_Action_Assert::TestScript_Setup_Action_Assert;
use crate::core::model::TestScript_Setup_Action_Operation::TestScript_Setup_Action_Operation;



#[derive(Clone, Debug)]
pub struct TestScript_Origin {
  pub(crate) id: Option<String>,
  pub(crate) index: i32,
  pub(crate) profile: Coding,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct TestScript_Fixture {
  pub(crate) id: Option<String>,
  pub(crate) resource: Option<Box<Reference>>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) autocreate: bool,
  pub(crate) autodelete: bool,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct TestScript_Variable {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) hint: Option<String>,
  pub(crate) path: Option<String>,
  pub(crate) sourceId: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) expression: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) headerField: Option<String>,
  pub(crate) defaultValue: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct TestScript_Destination {
  pub(crate) id: Option<String>,
  pub(crate) index: i32,
  pub(crate) profile: Coding,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct TestScript_Test_Action {
  pub(crate) id: Option<String>,
  pub(crate) assert: Option<TestScript_Setup_Action_Assert>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) operation: Option<TestScript_Setup_Action_Operation>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct TestScript_Test {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) action: Vector<TestScript_Test_Action>,
}


#[derive(Clone, Debug)]
pub struct TestScript_Teardown_Action {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) operation: TestScript_Setup_Action_Operation,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct TestScript_Teardown {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) action: Vector<TestScript_Teardown_Action>,
}


#[derive(Clone, Debug)]
pub struct TestScript_Metadata_Link {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct TestScript_Metadata_Capability {
  pub(crate) id: Option<String>,
  pub(crate) link: Vector<String>,
  pub(crate) origin: Vector<i32>,
  pub(crate) required: bool,
  pub(crate) extension: Vector<Extension>,
  pub(crate) validated: bool,
  pub(crate) description: Option<String>,
  pub(crate) destination: Option<i32>,
  pub(crate) capabilities: String,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct TestScript_Metadata {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) link: Vector<TestScript_Metadata_Link>,
  pub(crate) capability: Vector<TestScript_Metadata_Capability>,
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
  pub(crate) extension: Vector<Extension>,
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
  pub(crate) modifierExtension: Vector<Extension>,
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
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct TestScript_Setup_Action_Operation {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) _type: Option<Coding>,
  pub(crate) label: Option<String>,
  pub(crate) accept: Option<String>,
  pub(crate) method: Option<String>,
  pub(crate) origin: Option<i32>,
  pub(crate) params: Option<String>,
  pub(crate) resource: Option<String>,
  pub(crate) sourceId: Option<String>,
  pub(crate) targetId: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) requestId: Option<String>,
  pub(crate) responseId: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) contentType: Option<String>,
  pub(crate) destination: Option<i32>,
  pub(crate) encodeRequestUrl: bool,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) requestHeader: Vector<TestScript_Setup_Action_Operation_RequestHeader>,
}

#[derive(Clone, Debug)]
pub struct TestScript_Setup_Action {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) assert: Option<TestScript_Setup_Action_Assert>,
  pub(crate) operation: Option<TestScript_Setup_Action_Operation>,
}

#[derive(Clone, Debug)]
pub struct TestScript_Setup {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) action: Vector<TestScript_Setup_Action>,
}

#[derive(Clone, Debug)]
pub struct TestScript {
  pub(crate) url: String,
  pub(crate) name: String,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) profile: Vector<Reference>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) origin: Vector<TestScript_Origin>,
  pub(crate) fixture: Vector<TestScript_Fixture>,
  pub(crate) variable: Vector<TestScript_Variable>,
  pub(crate) destination: Vector<TestScript_Destination>,
  pub(crate) test: Vector<TestScript_Test>,
  pub(crate) teardown: Option<TestScript_Teardown>,
  pub(crate) metadata: Option<TestScript_Metadata>,
  pub(crate) setup: Option<TestScript_Setup>,
}