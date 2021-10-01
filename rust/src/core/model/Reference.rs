use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::Extension::Extension;

#[derive(Clone, Debug)]
pub struct Reference {
    pub(crate) id: Option<String>,
    pub(crate) _type: Option<String>,
    pub(crate) display: Option<String>,
    pub(crate) extension: Vector<Extension>,
    pub(crate) reference: Option<String>,
    // pub(crate) identifier: Option<Identifier>,
}