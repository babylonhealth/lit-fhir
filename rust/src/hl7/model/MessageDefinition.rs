use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::ContactDetail::ContactDetail;
use crate::hl7::UnionCodingOrUri;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::UsageContext::UsageContext;
use crate::core::model::CodeableConcept::CodeableConcept;



#[derive(Clone, Debug)]
pub struct MessageDefinition_Focus {
  pub(crate) id: Option<String>,
  pub(crate) min: u32,
  pub(crate) max: Option<String>,
  pub(crate) code: String,
  pub(crate) profile: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MessageDefinition_AllowedResponse {
  pub(crate) id: Option<String>,
  pub(crate) message: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) situation: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct MessageDefinition {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) date: DateTime<FixedOffset>,
  pub(crate) base: Option<String>,
  pub(crate) title: Option<String>,
  pub(crate) graph: Vector<String>,
  pub(crate) status: String,
  pub(crate) parent: Vector<String>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) replaces: Vector<String>,
  pub(crate) event: UnionCodingOrUri,
  pub(crate) category: Option<String>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) responseRequired: Option<String>,
  pub(crate) focus: Vector<MessageDefinition_Focus>,
  pub(crate) allowedResponse: Vector<MessageDefinition_AllowedResponse>,
}