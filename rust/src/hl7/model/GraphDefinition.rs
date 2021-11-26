use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::UsageContext::UsageContext;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::GraphDefinition_Link::GraphDefinition_Link;



#[derive(Clone, Debug)]
pub struct GraphDefinition_Link_Target_Compartment {
  pub(crate) id: Option<String>,
  pub(crate) _use: String,
  pub(crate) code: String,
  pub(crate) rule: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) expression: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct GraphDefinition_Link_Target {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) link: Vector<GraphDefinition_Link>,
  pub(crate) params: Option<String>,
  pub(crate) profile: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) compartment: Vector<GraphDefinition_Link_Target_Compartment>,
}

#[derive(Clone, Debug)]
pub struct GraphDefinition_Link {
  pub(crate) id: Option<String>,
  pub(crate) min: Option<i32>,
  pub(crate) max: Option<String>,
  pub(crate) path: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) sliceName: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) target: Vector<GraphDefinition_Link_Target>,
}

#[derive(Clone, Debug)]
pub struct GraphDefinition {
  pub(crate) url: Option<String>,
  pub(crate) name: String,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) start: String,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) profile: Option<String>,
  pub(crate) publisher: Option<String>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) link: Vector<GraphDefinition_Link>,
}