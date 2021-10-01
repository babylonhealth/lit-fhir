use bigdecimal::BigDecimal;
use im::vector::Vector;
use crate::core::model::Coding::Coding;

use crate::core::model::Extension::Extension;

#[derive(Clone, Debug)]
pub struct CodeableConcept {
    pub(crate) id: Option<String>,
    pub(crate) text: Option<String>,
    pub(crate) coding: Vector<Coding>,
    pub(crate) extension: Vector<Extension>,
}