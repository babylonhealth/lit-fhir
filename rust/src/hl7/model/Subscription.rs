use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Subscription_Channel {
  pub(crate) id?: String,
  pub(crate) _type: String,
  pub(crate) header?: String,
  pub(crate) payload?: String,
  pub(crate) endpoint?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct Subscription {
  pub(crate) end?: Date,
  pub(crate) error?: String,
  pub(crate) status: String,
  pub(crate) reason: String,
  pub(crate) contact?: ContactPoint,
  pub(crate) criteria: String,
  pub(crate) channel: Subscription_Channel,
}