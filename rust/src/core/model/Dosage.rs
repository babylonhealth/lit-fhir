use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




#[derive(Clone, Debug)]
pub struct Dosage_DoseAndRate {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) dose: Option<Quantity | Range>,
  pub(crate) rate: Option<Quantity | Range | Ratio>,
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
  pub(crate) asNeeded: Option<Boolean | CodeableConcept>,
  pub(crate) maxDosePerPeriod: Option<Ratio>,
  pub(crate) patientInstruction: Option<String>,
  pub(crate) maxDosePerLifetime: Option<Quantity>,
  pub(crate) additionalInstruction: Vector<CodeableConcept>,
  pub(crate) doseAndRate: Vector<Dosage_DoseAndRate>,
  pub(crate) maxDosePerAdministration: Option<Quantity>,
}