use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::Extension::Extension;

#[derive(Clone, Debug)]
pub struct Quantity {
    pub(crate) id: Option<String>,
    pub(crate) unit: Option<String>,
    pub(crate) code: Option<String>,
    pub(crate) value: Option<BigDecimal>,
    pub(crate) system: Option<String>,
    pub(crate) extension: Vector<Extension>,
}