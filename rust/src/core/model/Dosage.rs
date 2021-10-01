use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::core::model::*;
use crate::core::*;




pub struct Dosage_DoseAndRate {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) dose?: Quantity | Range,
  pub(crate) rate?: Quantity | Range | Ratio,
  pub(crate) extension?: Extension,
}

pub struct Dosage {
  pub(crate) text?: String,
  pub(crate) site?: CodeableConcept,
  pub(crate) route?: CodeableConcept,
  pub(crate) timing?: Timing,
  pub(crate) method?: CodeableConcept,
  pub(crate) sequence?: i32,
  pub(crate) asNeeded?: Boolean | CodeableConcept,
  pub(crate) maxDosePerPeriod?: Ratio,
  pub(crate) patientInstruction?: String,
  pub(crate) maxDosePerLifetime?: Quantity,
  pub(crate) additionalInstruction?: CodeableConcept,
  pub(crate) doseAndRate?: Dosage_DoseAndRate,
  pub(crate) maxDosePerAdministration?: Quantity,
}