use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Organization_Contact {
  pub(crate) id?: String,
  pub(crate) name?: HumanName,
  pub(crate) purpose?: CodeableConcept,
  pub(crate) telecom?: ContactPoint,
  pub(crate) address?: Address,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct Organization {
  pub(crate) _type?: CodeableConcept,
  pub(crate) name?: String,
  pub(crate) alias?: String,
  pub(crate) active?: Boolean,
  pub(crate) partOf?: Reference,
  pub(crate) telecom?: ContactPoint,
  pub(crate) address?: Address,
  pub(crate) endpoint?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) contact?: Organization_Contact,
}