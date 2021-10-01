use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct RelatedPerson_Communication {
  pub(crate) id?: String,
  pub(crate) language: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) preferred?: Boolean,
  pub(crate) modifierExtension?: Extension,
}

pub struct RelatedPerson {
  pub(crate) name?: HumanName,
  pub(crate) photo?: Attachment,
  pub(crate) active?: Boolean,
  pub(crate) gender?: String,
  pub(crate) period?: Period,
  pub(crate) patient: Reference,
  pub(crate) telecom?: ContactPoint,
  pub(crate) address?: Address,
  pub(crate) birthDate?: FHIRDate,
  pub(crate) identifier?: Identifier,
  pub(crate) relationship?: CodeableConcept,
  pub(crate) communication?: RelatedPerson_Communication,
}