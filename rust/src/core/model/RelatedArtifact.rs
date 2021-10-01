use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




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