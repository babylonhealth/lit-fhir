use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Quantity::Quantity;



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
  pub(crate) created: DateTime<FixedOffset>,
  pub(crate) patient: Box<Reference>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) prescriber: Box<Reference>,
  pub(crate) dateWritten: DateTime<FixedOffset>,
  pub(crate) lensSpecification: Vector<VisionPrescription_LensSpecification>,
}