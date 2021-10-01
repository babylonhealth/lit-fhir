use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




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
  pub(crate) end: Option<Date>,
  pub(crate) error: Option<String>,
  pub(crate) status: String,
  pub(crate) reason: String,
  pub(crate) contact: Vector<ContactPoint>,
  pub(crate) criteria: String,
  pub(crate) channel: Subscription_Channel,
}