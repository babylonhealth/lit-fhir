use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::Extension::Extension;
use crate::core::UnionCodeableConceptOrReference;

#[derive(Clone, Debug)]
pub struct DataRequirement {
    pub(crate) id: Option<String>,
    pub(crate) _type: String,
    pub(crate) limit: Option<u32>,
    pub(crate) profile: Vector<String>,
    pub(crate) extension: Vector<Extension>,
    pub(crate) subject: Option<UnionCodeableConceptOrReference>,
    pub(crate) mustSupport: Vector<String>,
    // pub(crate) sort: Vector<Sort>,
    // pub(crate) codeFilter: Vector<CodeFilter>,
    // pub(crate) dateFilter: Vector<DateFilter>,
}