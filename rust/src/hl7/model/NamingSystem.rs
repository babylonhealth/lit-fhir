use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct NamingSystem_UniqueId {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) value: String,
  pub(crate) period: Option<Period>,
  pub(crate) comment: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) preferred: Option<bool>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct NamingSystem {
  pub(crate) name: String,
  pub(crate) kind: String,
  pub(crate) date: DateTime<FixedOffset>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) usage: Option<String>,
  pub(crate) status: String,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) publisher: Option<String>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) responsible: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) uniqueId: Vector<NamingSystem_UniqueId>,
}