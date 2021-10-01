use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct GraphDefinition_Link_Target_Compartment {
  pub(crate) id: Option<String>,
  pub(crate) use: String,
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
  pub(crate) date: Option<Date>,
  pub(crate) start: String,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) profile: Option<String>,
  pub(crate) publisher: Option<String>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<Boolean>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) link: Vector<GraphDefinition_Link>,
}