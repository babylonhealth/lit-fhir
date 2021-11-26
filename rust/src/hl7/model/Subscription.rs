use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct Subscription_Channel {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) header: Vector<String>,
  pub(crate) payload: Option<String>,
  pub(crate) endpoint: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Subscription {
  pub(crate) end: Option<DateTime<FixedOffset>>,
  pub(crate) error: Option<String>,
  pub(crate) status: String,
  pub(crate) reason: String,
  pub(crate) contact: Vector<ContactPoint>,
  pub(crate) criteria: String,
  pub(crate) channel: Subscription_Channel,
}