use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Bundle_Link {
  pub(crate) id?: String,
  pub(crate) url: String,
  pub(crate) relation: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct Bundle_Entry_Search {
  pub(crate) id?: String,
  pub(crate) mode?: String,
  pub(crate) score?: BigDecimal,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct Bundle_Entry_Request {
  pub(crate) id?: String,
  pub(crate) url: String,
  pub(crate) method: String,
  pub(crate) ifMatch?: String,
  pub(crate) extension?: Extension,
  pub(crate) ifNoneMatch?: String,
  pub(crate) ifNoneExist?: String,
  pub(crate) ifModifiedSince?: Date,
  pub(crate) modifierExtension?: Extension,
}



pub struct Bundle_Entry_Response {
  pub(crate) id?: String,
  pub(crate) etag?: String,
  pub(crate) status: String,
  pub(crate) outcome?: Resource,
  pub(crate) location?: String,
  pub(crate) extension?: Extension,
  pub(crate) lastModified?: Date,
  pub(crate) modifierExtension?: Extension,
}

pub struct Bundle_Entry {
  pub(crate) id?: String,
  pub(crate) link?: Bundle_Link,
  pub(crate) fullUrl?: String,
  pub(crate) resource?: Resource,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) search?: Bundle_Entry_Search,
  pub(crate) request?: Bundle_Entry_Request,
  pub(crate) response?: Bundle_Entry_Response,
}

pub struct Bundle {
  pub(crate) _type: String,
  pub(crate) total?: u32,
  pub(crate) timestamp?: Date,
  pub(crate) signature?: Signature,
  pub(crate) identifier?: Identifier,
  pub(crate) link?: Bundle_Link,
  pub(crate) entry?: Bundle_Entry,
}