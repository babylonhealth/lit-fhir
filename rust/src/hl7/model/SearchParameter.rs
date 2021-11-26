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



#[derive(Clone, Debug)]
pub struct SearchParameter_Component {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) definition: String,
  pub(crate) expression: String,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct SearchParameter {
  pub(crate) url: String,
  pub(crate) name: String,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) code: String,
  pub(crate) base: Vector<String>,
  pub(crate) _type: String,
  pub(crate) xpath: Option<String>,
  pub(crate) chain: Vector<String>,
  pub(crate) status: String,
  pub(crate) target: Vector<String>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) modifier: Vector<String>,
  pub(crate) publisher: Option<String>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) expression: Option<String>,
  pub(crate) xpathUsage: Option<String>,
  pub(crate) multipleOr: Option<bool>,
  pub(crate) comparator: Vector<String>,
  pub(crate) derivedFrom: Option<String>,
  pub(crate) description: String,
  pub(crate) multipleAnd: Option<bool>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) component: Vector<SearchParameter_Component>,
}