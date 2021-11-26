use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;


use crate::core::model::Extension::Extension;
use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::Coding::Coding;
use crate::core::UnionDurationOrDateTimeOrPeriod;


#[derive(Clone, Debug)]
pub struct DataRequirement_Sort {
    pub(crate) id: Option<String>,
    pub(crate) _type: String,
    pub(crate) limit: Option<u32>,
    pub(crate) profile: Vector<String>,
    pub(crate) extension: Vector<Extension>,
    pub(crate) subject: Option<UnionCodeableConceptOrReference>,
    pub(crate) mustSupport: Vector<String>,
    pub(crate) sort: Vector<DataRequirement_Sort>,
    pub(crate) codeFilter: Vector<DataRequirement_CodeFilter>,
    pub(crate) dateFilter: Vector<DataRequirement_DateFilter>,
    pub(crate) direction: String,
}


#[derive(Clone, Debug)]
pub struct DataRequirement_CodeFilter {
    pub(crate) id: Option<String>,
    pub(crate) path: Option<String>,
    pub(crate) code: Vector<Coding>,
    pub(crate) valueSet: Option<String>,
    pub(crate) extension: Vector<Extension>,
    pub(crate) searchParam: Option<String>,
}


#[derive(Clone, Debug)]
pub struct DataRequirement_DateFilter {
    pub(crate) id: Option<String>,
    pub(crate) path: Option<String>,
    pub(crate) value: Option<UnionDurationOrDateTimeOrPeriod>,
    pub(crate) extension: Vector<Extension>,
    pub(crate) searchParam: Option<String>,
}

#[derive(Clone, Debug)]
pub struct DataRequirement {
    pub(crate) id: Option<String>,
    pub(crate) extension: Vector<Extension>,
    pub(crate) _type: String,
    pub(crate) limit: Option<u32>,
    pub(crate) profile: Vector<String>,
    pub(crate) subject: Option<UnionCodeableConceptOrReference>,
    pub(crate) mustSupport: Vector<String>,
    pub(crate) sort: Vector<DataRequirement_Sort>,
    pub(crate) codeFilter: Vector<DataRequirement_CodeFilter>,
    pub(crate) dateFilter: Vector<DataRequirement_DateFilter>,
}