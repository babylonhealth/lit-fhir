use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;



#[derive(Clone, Debug)]
pub struct ContactDetail {
  pub(crate) name: Option<String>,
  pub(crate) telecom: Vector<ContactPoint>,
}