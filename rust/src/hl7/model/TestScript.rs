use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct TestScript_Origin {
  pub(crate) id?: String,
  pub(crate) index: i32,
  pub(crate) profile: Coding,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct TestScript_Fixture {
  pub(crate) id?: String,
  pub(crate) resource?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) autocreate: Boolean,
  pub(crate) autodelete: Boolean,
  pub(crate) modifierExtension?: Extension,
}


pub struct TestScript_Variable {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) hint?: String,
  pub(crate) path?: String,
  pub(crate) sourceId?: String,
  pub(crate) extension?: Extension,
  pub(crate) expression?: String,
  pub(crate) description?: String,
  pub(crate) headerField?: String,
  pub(crate) defaultValue?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct TestScript_Destination {
  pub(crate) id?: String,
  pub(crate) index: i32,
  pub(crate) profile: Coding,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct TestScript_Test_Action {
  pub(crate) id?: String,
  pub(crate) assert?: TestScript_Setup_Action_Assert,
  pub(crate) extension?: Extension,
  pub(crate) operation?: TestScript_Setup_Action_Operation,
  pub(crate) modifierExtension?: Extension,
}

pub struct TestScript_Test {
  pub(crate) id?: String,
  pub(crate) name?: String,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) action: TestScript_Test_Action,
}


pub struct TestScript_Teardown_Action {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) operation: TestScript_Setup_Action_Operation,
  pub(crate) modifierExtension?: Extension,
}

pub struct TestScript_Teardown {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) action: TestScript_Teardown_Action,
}


pub struct TestScript_Metadata_Link {
  pub(crate) id?: String,
  pub(crate) url: String,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
}



pub struct TestScript_Metadata_Capability {
  pub(crate) id?: String,
  pub(crate) link?: String,
  pub(crate) origin?: i32,
  pub(crate) required: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) validated: Boolean,
  pub(crate) description?: String,
  pub(crate) destination?: i32,
  pub(crate) capabilities: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct TestScript_Metadata {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) link?: TestScript_Metadata_Link,
  pub(crate) capability: TestScript_Metadata_Capability,
}


pub struct TestScript_Setup_Action_Assert {
  pub(crate) id?: String,
  pub(crate) path?: String,
  pub(crate) label?: String,
  pub(crate) value?: String,
  pub(crate) operator?: String,
  pub(crate) resource?: String,
  pub(crate) response?: String,
  pub(crate) sourceId?: String,
  pub(crate) extension?: Extension,
  pub(crate) direction?: String,
  pub(crate) minimumId?: String,
  pub(crate) expression?: String,
  pub(crate) requestURL?: String,
  pub(crate) description?: String,
  pub(crate) contentType?: String,
  pub(crate) headerField?: String,
  pub(crate) warningOnly: Boolean,
  pub(crate) responseCode?: String,
  pub(crate) requestMethod?: String,
  pub(crate) navigationLinks?: Boolean,
  pub(crate) modifierExtension?: Extension,
  pub(crate) compareToSourceId?: String,
  pub(crate) validateProfileId?: String,
  pub(crate) compareToSourcePath?: String,
  pub(crate) compareToSourceExpression?: String,
}



pub struct TestScript_Setup_Action_Operation_RequestHeader {
  pub(crate) id?: String,
  pub(crate) field: String,
  pub(crate) value: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct TestScript_Setup_Action_Operation {
  pub(crate) id?: String,
  pub(crate) url?: String,
  pub(crate) _type?: Coding,
  pub(crate) label?: String,
  pub(crate) accept?: String,
  pub(crate) method?: String,
  pub(crate) origin?: i32,
  pub(crate) params?: String,
  pub(crate) resource?: String,
  pub(crate) sourceId?: String,
  pub(crate) targetId?: String,
  pub(crate) extension?: Extension,
  pub(crate) requestId?: String,
  pub(crate) responseId?: String,
  pub(crate) description?: String,
  pub(crate) contentType?: String,
  pub(crate) destination?: i32,
  pub(crate) encodeRequestUrl: Boolean,
  pub(crate) modifierExtension?: Extension,
  pub(crate) requestHeader?: TestScript_Setup_Action_Operation_RequestHeader,
}

pub struct TestScript_Setup_Action {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) assert?: TestScript_Setup_Action_Assert,
  pub(crate) operation?: TestScript_Setup_Action_Operation,
}

pub struct TestScript_Setup {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) action: TestScript_Setup_Action,
}

pub struct TestScript {
  pub(crate) url: String,
  pub(crate) name: String,
  pub(crate) date?: Date,
  pub(crate) title?: String,
  pub(crate) status: String,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) profile?: Reference,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) useContext?: UsageContext,
  pub(crate) description?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) origin?: TestScript_Origin,
  pub(crate) fixture?: TestScript_Fixture,
  pub(crate) variable?: TestScript_Variable,
  pub(crate) destination?: TestScript_Destination,
  pub(crate) test?: TestScript_Test,
  pub(crate) teardown?: TestScript_Teardown,
  pub(crate) metadata?: TestScript_Metadata,
  pub(crate) setup?: TestScript_Setup,
}