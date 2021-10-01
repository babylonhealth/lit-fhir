use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::Extension::Extension;

#[derive(Clone, Debug)]
pub struct Coding {
    pub(crate) id: Option<String>,
    pub(crate) code: Option<String>,
    pub(crate) system: Option<String>,
    pub(crate) display: Option<String>,
    pub(crate) extension: Vector<Extension>,
    pub(crate) userSelected: Option<bool>,
}