use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;


use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct Coding {
  pub(crate) code: Option<String>,
  pub(crate) system: Option<String>,
  pub(crate) version: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) userSelected: Option<bool>,
}