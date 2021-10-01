use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Practitioner_Qualification {
  pub(crate) id?: String,
  pub(crate) code: CodeableConcept,
  pub(crate) period?: Period,
  pub(crate) issuer?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) identifier?: Identifier,
  pub(crate) modifierExtension?: Extension,
}

pub struct Practitioner {
  pub(crate) name?: HumanName,
  pub(crate) photo?: Attachment,
  pub(crate) active?: Boolean,
  pub(crate) gender?: String,
  pub(crate) telecom?: ContactPoint,
  pub(crate) address?: Address,
  pub(crate) birthDate?: FHIRDate,
  pub(crate) identifier?: Identifier,
  pub(crate) communication?: CodeableConcept,
  pub(crate) qualification?: Practitioner_Qualification,
}