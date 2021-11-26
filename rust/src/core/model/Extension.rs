use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::UnionAll;



#[derive(Clone, Debug)]
pub struct Extension {
    pub(crate) id: Option<String>,
    pub(crate) extension: Vector<Extension>,
    pub(crate) url: String,
    pub(crate) value: Option<UnionAll>,
}