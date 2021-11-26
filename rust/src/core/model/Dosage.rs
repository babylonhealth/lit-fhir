use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Timing::Timing;
use crate::core::model::Extension::Extension;
use crate::core::UnionBooleanOrCodeableConcept;
use crate::core::model::Ratio::Ratio;
use crate::core::model::Quantity::Quantity;
use crate::core::UnionQuantityOrRange;
use crate::core::UnionQuantityOrRangeOrRatio;



#[derive(Clone, Debug)]
pub struct Dosage_DoseAndRate {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) dose: Option<UnionQuantityOrRange>,
  pub(crate) rate: Option<UnionQuantityOrRangeOrRatio>,
  pub(crate) extension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Dosage {
  pub(crate) text: Option<String>,
  pub(crate) site: Option<CodeableConcept>,
  pub(crate) route: Option<CodeableConcept>,
  pub(crate) timing: Option<Timing>,
  pub(crate) method: Option<CodeableConcept>,
  pub(crate) sequence: Option<i32>,
  pub(crate) asNeeded: Option<UnionBooleanOrCodeableConcept>,
  pub(crate) maxDosePerPeriod: Option<Ratio>,
  pub(crate) patientInstruction: Option<String>,
  pub(crate) maxDosePerLifetime: Option<Quantity>,
  pub(crate) additionalInstruction: Vector<CodeableConcept>,
  pub(crate) doseAndRate: Vector<Dosage_DoseAndRate>,
  pub(crate) maxDosePerAdministration: Option<Quantity>,
}