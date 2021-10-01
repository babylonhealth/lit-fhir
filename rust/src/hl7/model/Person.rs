use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Person_Link {
  pub(crate) id?: String,
  pub(crate) target: Reference,
  pub(crate) extension?: Extension,
  pub(crate) assurance?: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct Person {
  pub(crate) name?: HumanName,
  pub(crate) photo?: Attachment,
  pub(crate) gender?: String,
  pub(crate) active?: Boolean,
  pub(crate) telecom?: ContactPoint,
  pub(crate) address?: Address,
  pub(crate) birthDate?: FHIRDate,
  pub(crate) identifier?: Identifier,
  pub(crate) managingOrganization?: Reference,
  pub(crate) link?: Person_Link,
}