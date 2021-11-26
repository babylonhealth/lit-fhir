use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;


use crate::core::UnionAll;



#[derive(Clone, Debug)]
pub struct Extension {
    pub(crate) id: Option<String>,
    pub(crate) url: String,
    pub(crate) value: Option<UnionAll>,
    pub(crate) extension: Vector<Extension>,
}