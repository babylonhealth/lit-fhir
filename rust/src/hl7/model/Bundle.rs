use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::Signature::Signature;



#[derive(Clone, Debug)]
pub struct Bundle_Link {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) relation: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Bundle_Entry_Search {
  pub(crate) id: Option<String>,
  pub(crate) mode: Option<String>,
  pub(crate) score: Option<BigDecimal>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct Bundle_Entry_Request {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) method: String,
  pub(crate) ifMatch: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) ifNoneMatch: Option<String>,
  pub(crate) ifNoneExist: Option<String>,
  pub(crate) ifModifiedSince: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct Bundle_Entry_Response {
  pub(crate) id: Option<String>,
  pub(crate) etag: Option<String>,
  pub(crate) status: String,
  pub(crate) outcome: Option<Box<dyn Resource>>,
  pub(crate) location: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) lastModified: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct Bundle_Entry {
  pub(crate) id: Option<String>,
  pub(crate) link: Vector<Box<dyn Bundle_Link>>,
  pub(crate) fullUrl: Option<String>,
  pub(crate) resource: Option<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) search: Option<Bundle_Entry_Search>,
  pub(crate) request: Option<Bundle_Entry_Request>,
  pub(crate) response: Option<Bundle_Entry_Response>,
}

#[derive(Clone, Debug)]
pub struct BundleRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) _type: String,
  pub(crate) total: Option<u32>,
  pub(crate) language: Option<String>,
  pub(crate) timestamp: Option<DateTime<FixedOffset>>,
  pub(crate) signature: Option<Box<dyn Signature>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) link: Vector<Bundle_Link>,
  pub(crate) entry: Vector<Bundle_Entry>,
}

pub trait Bundle : Resource {
  fn _type(&self) -> &String;
  fn total(&self) -> &Option<u32>;
  fn timestamp(&self) -> &Option<DateTime<FixedOffset>>;
  fn signature(&self) -> &Option<Box<dyn Signature>>;
  fn identifier(&self) -> &Option<Box<dyn Identifier>>;
  fn link(&self) -> &Vector<Bundle_Link>;
  fn entry(&self) -> &Vector<Bundle_Entry>;
}

dyn_clone::clone_trait_object!(Bundle);

impl FHIRObject for BundleRaw {
}

impl Resource for BundleRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl Bundle for BundleRaw {
  fn _type(&self) -> &String { &self._type }
  fn total(&self) -> &Option<u32> { &self.total }
  fn timestamp(&self) -> &Option<DateTime<FixedOffset>> { &self.timestamp }
  fn signature(&self) -> &Option<Box<dyn Signature>> { &self.signature }
  fn identifier(&self) -> &Option<Box<dyn Identifier>> { &self.identifier }
  fn link(&self) -> &Vector<Bundle_Link> { &self.link }
  fn entry(&self) -> &Vector<Bundle_Entry> { &self.entry }
}

