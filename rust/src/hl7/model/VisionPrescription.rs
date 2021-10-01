use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct VisionPrescription_LensSpecification_Prism {
  pub(crate) id?: String,
  pub(crate) base: String,
  pub(crate) amount: BigDecimal,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct VisionPrescription_LensSpecification {
  pub(crate) id?: String,
  pub(crate) eye: String,
  pub(crate) add?: BigDecimal,
  pub(crate) axis?: i32,
  pub(crate) note?: Annotation,
  pub(crate) power?: BigDecimal,
  pub(crate) color?: String,
  pub(crate) brand?: String,
  pub(crate) sphere?: BigDecimal,
  pub(crate) product: CodeableConcept,
  pub(crate) cylinder?: BigDecimal,
  pub(crate) diameter?: BigDecimal,
  pub(crate) duration?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) backCurve?: BigDecimal,
  pub(crate) modifierExtension?: Extension,
  pub(crate) prism?: VisionPrescription_LensSpecification_Prism,
}

pub struct VisionPrescription {
  pub(crate) status: String,
  pub(crate) created: Date,
  pub(crate) patient: Reference,
  pub(crate) encounter?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) prescriber: Reference,
  pub(crate) dateWritten: Date,
  pub(crate) lensSpecification: VisionPrescription_LensSpecification,
}