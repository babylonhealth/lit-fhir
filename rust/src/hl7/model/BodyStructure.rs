use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct BodyStructure {
  pub(crate) image?: Attachment,
  pub(crate) active?: Boolean,
  pub(crate) patient: Reference,
  pub(crate) location?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) morphology?: CodeableConcept,
  pub(crate) description?: String,
  pub(crate) locationQualifier?: CodeableConcept,
}