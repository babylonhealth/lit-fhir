use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct OrganizationAffiliation {
  pub(crate) code?: CodeableConcept,
  pub(crate) active?: Boolean,
  pub(crate) period?: Period,
  pub(crate) network?: Reference,
  pub(crate) telecom?: ContactPoint,
  pub(crate) location?: Reference,
  pub(crate) endpoint?: Reference,
  pub(crate) specialty?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) organization?: Reference,
  pub(crate) healthcareService?: Reference,
  pub(crate) participatingOrganization?: Reference,
}