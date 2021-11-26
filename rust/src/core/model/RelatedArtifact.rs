use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Attachment::Attachment;
use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct RelatedArtifact {
  pub(crate) url: Option<String>,
  pub(crate) _type: String,
  pub(crate) label: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) citation: Option<String>,
  pub(crate) document: Option<Attachment>,
  pub(crate) resource: Option<String>,
}