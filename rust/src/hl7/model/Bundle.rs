use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Bundle_Link {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) relation: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Bundle_Entry_Search {
  pub(crate) id: Option<String>,
  pub(crate) mode: Option<String>,
  pub(crate) score: Option<BigDecimal>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct Bundle_Entry_Request {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) method: String,
  pub(crate) ifMatch: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) ifNoneMatch: Option<String>,
  pub(crate) ifNoneExist: Option<String>,
  pub(crate) ifModifiedSince: Option<Date>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct Bundle_Entry_Response {
  pub(crate) id: Option<String>,
  pub(crate) etag: Option<String>,
  pub(crate) status: String,
  pub(crate) outcome: Option<Resource>,
  pub(crate) location: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) lastModified: Option<Date>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Bundle_Entry {
  pub(crate) id: Option<String>,
  pub(crate) link: Vector<Bundle_Link>,
  pub(crate) fullUrl: Option<String>,
  pub(crate) resource: Option<Resource>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) search: Option<Bundle_Entry_Search>,
  pub(crate) request: Option<Bundle_Entry_Request>,
  pub(crate) response: Option<Bundle_Entry_Response>,
}

#[derive(Clone, Debug)]
pub struct Bundle {
  pub(crate) _type: String,
  pub(crate) total: Option<u32>,
  pub(crate) timestamp: Option<Date>,
  pub(crate) signature: Option<Signature>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) link: Vector<Bundle_Link>,
  pub(crate) entry: Vector<Bundle_Entry>,
}