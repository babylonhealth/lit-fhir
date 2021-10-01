use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct RelatedArtifact {
  pub(crate) url?: String,
  pub(crate) _type: String,
  pub(crate) label?: String,
  pub(crate) display?: String,
  pub(crate) citation?: String,
  pub(crate) document?: Attachment,
  pub(crate) resource?: String,
}