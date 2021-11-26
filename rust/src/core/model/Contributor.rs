use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct Contributor {
  pub(crate) _type: String,
  pub(crate) name: String,
  pub(crate) contact: Vector<ContactDetail>,
}