use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct VisionPrescription_LensSpecification_Prism {
  pub(crate) id: Option<String>,
  pub(crate) base: String,
  pub(crate) amount: BigDecimal,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct VisionPrescription_LensSpecification {
  pub(crate) id: Option<String>,
  pub(crate) eye: String,
  pub(crate) add: Option<BigDecimal>,
  pub(crate) axis: Option<i32>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) power: Option<BigDecimal>,
  pub(crate) color: Option<String>,
  pub(crate) brand: Option<String>,
  pub(crate) sphere: Option<BigDecimal>,
  pub(crate) product: CodeableConcept,
  pub(crate) cylinder: Option<BigDecimal>,
  pub(crate) diameter: Option<BigDecimal>,
  pub(crate) duration: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) backCurve: Option<BigDecimal>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) prism: Vector<VisionPrescription_LensSpecification_Prism>,
}

#[derive(Clone, Debug)]
pub struct VisionPrescription {
  pub(crate) status: String,
  pub(crate) created: Date,
  pub(crate) patient: Reference,
  pub(crate) encounter: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) prescriber: Reference,
  pub(crate) dateWritten: Date,
  pub(crate) lensSpecification: Vector<VisionPrescription_LensSpecification>,
}