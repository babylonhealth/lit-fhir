use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Subscription_Channel {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) header: Vector<String>,
  pub(crate) payload: Option<String>,
  pub(crate) endpoint: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct SubscriptionRaw {
  pub(crate) id: Option<String>,
  pub(crate) end: Option<DateTime<FixedOffset>>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) error: Option<String>,
  pub(crate) status: String,
  pub(crate) reason: String,
  pub(crate) contact: Vector<Box<dyn ContactPoint>>,
  pub(crate) language: Option<String>,
  pub(crate) criteria: String,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) channel: Box<Subscription_Channel>,
}

pub trait Subscription : DomainResource {
  fn end(&self) -> &Option<DateTime<FixedOffset>>;
  fn error(&self) -> &Option<String>;
  fn status(&self) -> &String;
  fn reason(&self) -> &String;
  fn contact(&self) -> &Vector<Box<dyn ContactPoint>>;
  fn criteria(&self) -> &String;
  fn channel(&self) -> &Box<Subscription_Channel>;
}

dyn_clone::clone_trait_object!(Subscription);

impl FHIRObject for SubscriptionRaw {
}

impl Resource for SubscriptionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for SubscriptionRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Subscription for SubscriptionRaw {
  fn end(&self) -> &Option<DateTime<FixedOffset>> { &self.end }
  fn error(&self) -> &Option<String> { &self.error }
  fn status(&self) -> &String { &self.status }
  fn reason(&self) -> &String { &self.reason }
  fn contact(&self) -> &Vector<Box<dyn ContactPoint>> { &self.contact }
  fn criteria(&self) -> &String { &self.criteria }
  fn channel(&self) -> &Box<Subscription_Channel> { &self.channel }
}

