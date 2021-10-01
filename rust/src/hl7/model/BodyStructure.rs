use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct BodyStructure {
  pub(crate) image: Vector<Attachment>,
  pub(crate) active: Option<Boolean>,
  pub(crate) patient: Reference,
  pub(crate) location: Option<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) morphology: Option<CodeableConcept>,
  pub(crate) description: Option<String>,
  pub(crate) locationQualifier: Vector<CodeableConcept>,
}